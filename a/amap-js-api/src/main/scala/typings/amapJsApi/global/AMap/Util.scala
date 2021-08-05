package typings.amapJsApi.global.AMap

import typings.amapJsApi.anon.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Util {
  
  @JSGlobal("AMap.Util")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 将16进制RGBA转为rgba(R,G,B,A)
    * @param hex 16进制RGBA
    */
  inline def argbHex2Rgba(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("argbHex2Rgba")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def cancelAnimFrame(handle: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelAnimFrame")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def cancelIdleCallback(handle: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelIdleCallback")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def color2Rgba(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("color2Rgba")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def color2Rgba(color: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("color2Rgba")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def color2RgbaArray(color: String): js.Tuple4[Double, Double, Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("color2RgbaArray")(color.asInstanceOf[js.Any]).asInstanceOf[js.Tuple4[Double, Double, Double, Double]]
  inline def color2RgbaArray(color: js.Array[Double]): js.Tuple4[Double, Double, Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("color2RgbaArray")(color.asInstanceOf[js.Any]).asInstanceOf[js.Tuple4[Double, Double, Double, Double]]
  
  /**
    * 将颜色名转换为16进制RGB颜色值
    * @param colorName 颜色名
    */
  inline def colorNameToHex(colorName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("colorNameToHex")(colorName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * 从数组删除元素
    * @param array 数组
    * @param item 元素
    */
  inline def deleteItemFromArray[T](array: js.Array[T], item: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteItemFromArray")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  /**
    * 按索引删除数组元素
    * @param array 数组
    * @param index 索引
    */
  inline def deleteItemFromArrayByIndex[T](array: js.Array[T], index: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteItemFromArrayByIndex")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  /**
    * 保留小数点后指定位
    * @param floatNumber 数值
    * @param digits 小数点位数
    */
  inline def format(floatNumber: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(floatNumber.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def format(floatNumber: Double, digits: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(floatNumber.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * 判断数组是否包含某个元素
    * @param array 数组
    * @param item 元素
    */
  inline def includes[T](array: js.Array[T], item: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * 返回元素索引
    * @param array 数组
    * @param item 元素
    */
  inline def indexOf[T](array: js.Array[T], item: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * 判断是否数组
    * @param data 判断对象
    */
  inline def isArray(data: js.Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(data.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  /**
    * 判断参数是否为DOM元素
    * @param data 判断对象
    */
  inline def isDOM(data: js.Any): /* is std.HTMLElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDOM")(data.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLElement */ Boolean]
  
  /**
    * 判断一个对象是都为空
    * @param obj 目标对象
    */
  inline def isEmpty(obj: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def requestAnimFrame[C](callback: js.ThisFunction1[/* this */ C, /* repeated */ js.Any, js.Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimFrame")(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def requestAnimFrame[C](callback: js.ThisFunction1[/* this */ C, /* repeated */ js.Any, js.Any], context: C): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimFrame")(callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def requestIdleCallback(callback: js.Function1[/* repeated */ js.Any, js.Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("requestIdleCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def requestIdleCallback(callback: js.Function1[/* repeated */ js.Any, js.Any], options: Timeout): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("requestIdleCallback")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * 将16进制RGB转为rgba(R,G,B,A)
    * @param hex 16进制RGB
    */
  inline def rgbHex2Rgba(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rgbHex2Rgba")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
}
