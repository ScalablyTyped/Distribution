package typings.antvG2.mod

import typings.antvG2.anon.Column
import typings.antvG2.antvG2Strings.canvas
import typings.antvG2.antvG2Strings.dark
import typings.antvG2.antvG2Strings.default
import typings.antvG2.antvG2Strings.svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2", "Global")
@js.native
class Global () extends StObject {
  
  var animate: Boolean = js.native
  
  /**
    * 更改默认的颜色 --不推荐
    */
  var colors: js.Array[String] = js.native
  
  var colors_16: js.Array[String] = js.native
  
  var colors_24: js.Array[String] = js.native
  
  var colors_pie: js.Array[String] = js.native
  
  var colors_pie_16: js.Array[String] = js.native
  
  var connectNulls: Boolean = js.native
  
  var fontFamily: String = js.native
  
  def registerTheme(name: String, option: js.Object): Unit = js.native
  
  var renderer: canvas | svg = js.native
  
  def setTheme(option: String): Unit = js.native
  def setTheme(option: js.Object): Unit = js.native
  @JSName("setTheme")
  def setTheme_dark(option: dark): Unit = js.native
  @JSName("setTheme")
  def setTheme_default(option: default): Unit = js.native
  
  /**
    * 折线图、区域图、path 当只有一个数据时，是否显示成点
    */
  var showSinglePoint: Boolean = js.native
  
  var snapArray: js.Array[Double] = js.native
  
  /**
    * 指定固定 tick 数的逼近值
    */
  var snapCountArray: js.Array[Double] = js.native
  
  var trackable: Boolean = js.native
  
  var version: String = js.native
  
  /**
    * 宽度所占的分类的比例
    */
  var widthRatio: Column = js.native
}
