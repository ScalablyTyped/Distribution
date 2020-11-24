package typings.amapJsApi.AMap

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layer_ extends EventEmitter {
  
  /**
    * 图层获取DOM节点
    */
  def getContainer(): js.UndefOr[HTMLDivElement] = js.native
  
  /**
    * 获取图层所属地图
    */
  def getMap(): js.UndefOr[Map | Null] = js.native
  
  /**
    * 设置透明度
    */
  def getOpacity(): Double = js.native
  
  /**
    * 获取图层缩放范围
    */
  def getZooms(): js.Tuple2[Double, Double] = js.native
  
  /**
    * 获取图层的层级
    */
  def getzIndex(): Double = js.native
  
  /**
    * 隐藏图层
    */
  def hide(): Unit = js.native
  
  /**
    * 设置图层所属地图
    * @param map map对象
    */
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  /**
    * 设置透明度
    * @param alpha 透明度
    */
  def setOpacity(alpha: Double): Unit = js.native
  
  /**
    * 设置图层的层级
    * @param index 层级
    */
  def setzIndex(index: Double): Unit = js.native
  
  /**
    * 显示图层
    */
  def show(): Unit = js.native
}
