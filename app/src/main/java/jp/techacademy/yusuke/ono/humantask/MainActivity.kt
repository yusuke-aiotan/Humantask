package jp.techacademy.yusuke.ono.humantask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        

       val human1 = Human("小野",26, "kotlin")
       val human2 = Human("保坂", 25, "Ruby")

       human1.say()
       human1.think()

       human2.say()
       human2.think()
    }
}