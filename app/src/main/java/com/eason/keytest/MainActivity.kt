package com.eason.keytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        var n : Int = keyCode
        var a : String = ""
        when (n){
            7 -> a = "0"
            8 -> a = "1"
            9 -> a = "2"
            10 -> a = "3"
            11 -> a = "4"
            12 -> a = "5"
            13 -> a = "6"
            14 -> a = "7"
            15 -> a = "8"
            16 -> a = "9"
            19 -> a = "上"
            20 -> a = "下"
            21 -> a = "左"
            22 -> a = "右"
            23 -> a = "確定"
            67 -> a = "倒退"
            82 -> a = "目錄"
            else -> a = "$n"
        }
        Toast.makeText(this, "你輸入的是：$a", Toast.LENGTH_SHORT).show()
        return super.onKeyDown(keyCode, event)
    }
}