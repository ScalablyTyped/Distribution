package typings.amapJsApi.global.AMap

import typings.amapJsApi.anon.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Util {
  
  /**
    * 将16进制RGBA转为rgba(R,G,B,A)
    * @param hex 16进制RGBA
    */
  @JSGlobal("AMap.Util.argbHex2Rgba")
  @js.native
  def argbHex2Rgba(hex: String): String = js.native
  
  @JSGlobal("AMap.Util.cancelAnimFrame")
  @js.native
  def cancelAnimFrame(handle: Double): Unit = js.native
  
  @JSGlobal("AMap.Util.cancelIdleCallback")
  @js.native
  def cancelIdleCallback(handle: Double): Unit = js.native
  
  @JSGlobal("AMap.Util.color2Rgba")
  @js.native
  def color2Rgba(color: String): String = js.native
  @JSGlobal("AMap.Util.color2Rgba")
  @js.native
  def color2Rgba(color: js.Array[Double]): String = js.native
  
  @JSGlobal("AMap.Util.color2RgbaArray")
  @js.native
  def color2RgbaArray(color: String): js.Tuple4[Double, Double, Double, Double] = js.native
  @JSGlobal("AMap.Util.color2RgbaArray")
  @js.native
  def color2RgbaArray(color: js.Array[Double]): js.Tuple4[Double, Double, Double, Double] = js.native
  
  /**
    * 将颜色名转换为16进制RGB颜色值
    * @param colorName 颜色名
    */
  @JSGlobal("AMap.Util.colorNameToHex")
  @js.native
  def colorNameToHex(colorName: String): String = js.native
  
  /**
    * 从数组删除元素
    * @param array 数组
    * @param item 元素
    */
  @JSGlobal("AMap.Util.deleteItemFromArray")
  @js.native
  def deleteItemFromArray[T](array: js.Array[T], item: T): js.Array[T] = js.native
  
  /**
    * 按索引删除数组元素
    * @param array 数组
    * @param index 索引
    */
  @JSGlobal("AMap.Util.deleteItemFromArrayByIndex")
  @js.native
  def deleteItemFromArrayByIndex[T](array: js.Array[T], index: Double): js.Array[T] = js.native
  
  /**
    * 保留小数点后指定位
    * @param floatNumber 数值
    * @param digits 小数点位数
    */
  @JSGlobal("AMap.Util.format")
  @js.native
  def format(floatNumber: Double): Double = js.native
  @JSGlobal("AMap.Util.format")
  @js.native
  def format(floatNumber: Double, digits: Double): Double = js.native
  
  /**
    * 判断数组是否包含某个元素
    * @param array 数组
    * @param item 元素
    */
  @JSGlobal("AMap.Util.includes")
  @js.native
  def includes[T](array: js.Array[T], item: T): Boolean = js.native
  
  /**
    * 返回元素索引
    * @param array 数组
    * @param item 元素
    */
  @JSGlobal("AMap.Util.indexOf")
  @js.native
  def indexOf[T](array: js.Array[T], item: T): Double = js.native
  
  /**
    * 判断是否数组
    * @param data 判断对象
    */
  @JSGlobal("AMap.Util.isArray")
  @js.native
  def isArray(data: js.Any): /* is std.Array<any> */ Boolean = js.native
  
  /**
    * 判断参数是否为DOM元素
    * @param data 判断对象
    */
  @JSGlobal("AMap.Util.isDOM")
  @js.native
  def isDOM(data: js.Any): /* is std.HTMLElement */ Boolean = js.native
  
  /**
    * 判断一个对象是都为空
    * @param obj 目标对象
    */
  @JSGlobal("AMap.Util.isEmpty")
  @js.native
  def isEmpty(obj: js.Object): Boolean = js.native
  
  @JSGlobal("AMap.Util.requestAnimFrame")
  @js.native
  def requestAnimFrame[C](callback: js.ThisFunction1[/* this */ C, /* repeated */ js.Any, _]): Double = js.native
  @JSGlobal("AMap.Util.requestAnimFrame")
  @js.native
  def requestAnimFrame[C](callback: js.ThisFunction1[/* this */ C, /* repeated */ js.Any, _], context: C): Double = js.native
  
  @JSGlobal("AMap.Util.requestIdleCallback")
  @js.native
  def requestIdleCallback(callback: js.Function1[/* repeated */ js.Any, _]): Double = js.native
  @JSGlobal("AMap.Util.requestIdleCallback")
  @js.native
  def requestIdleCallback(callback: js.Function1[/* repeated */ js.Any, _], options: Timeout): Double = js.native
  
  /**
    * 将16进制RGB转为rgba(R,G,B,A)
    * @param hex 16进制RGB
    */
  @JSGlobal("AMap.Util.rgbHex2Rgba")
  @js.native
  def rgbHex2Rgba(hex: String): String = js.native
}
