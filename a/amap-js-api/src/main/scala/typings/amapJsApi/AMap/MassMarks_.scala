package typings.amapJsApi.AMap

import typings.amapJsApi.AMap.MassMarks.Data
import typings.amapJsApi.AMap.MassMarks.Style
import typings.amapJsApi.amapJsApiStrings.lnglat
import typings.amapJsApi.anon.LnglatLngLat
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MassMarks_[D /* <: Data */] extends Layer {
  
  /**
    * 清除海量点
    */
  def clear(): Unit = js.native
  
  /**
    * 获取数据集
    */
  def getData(): js.Array[(Pick[D, Exclude[/* keyof D */ String, lnglat]]) with LnglatLngLat] = js.native
  
  /**
    * 获取显示样式
    */
  def getStyle(): Style | js.Array[Style] = js.native
  
  def setData(data: String): Unit = js.native
  /**
    * 设置数据集
    * @param data 数据集
    */
  def setData(data: js.Array[D]): Unit = js.native
  
  def setStyle(style: js.Array[Style]): Unit = js.native
  /**
    * 设置显示样式
    * @param style 样式设置
    */
  def setStyle(style: Style): Unit = js.native
}
