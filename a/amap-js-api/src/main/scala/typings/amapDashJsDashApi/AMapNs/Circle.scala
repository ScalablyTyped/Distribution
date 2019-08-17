package typings.amapDashJsDashApi.AMapNs

import typings.amapDashJsDashApi.AMapNs.CircleNs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Circle")
@js.native
/**
  * 圆形覆盖物
  * @param options 覆盖物选项
  */
class Circle[ExtraData] () extends ShapeOverlay[ExtraData] {
  def this(options: Options[ExtraData]) = this()
  /**
    * 判断指定点坐标是否在圆内
    * @param point 坐标
    */
  def contains(point: LocationValue): Boolean = js.native
  /**
    * 获取圆外切矩形范围
    */
  def getBounds(): Bounds | Null = js.native
  /**
    * 获取圆中心点
    */
  def getCenter(): js.UndefOr[LngLat] = js.native
  // internal
  def getPath(): js.Array[LngLat] = js.native
  def getPath(count: Double): js.Array[LngLat] = js.native
  /**
    * 获取圆形的半径
    */
  def getRadius(): Double = js.native
  /**
    * 设置圆中心点
    * @param center 中心点经纬度
    * @param preventEvent 阻止触发事件
    */
  def setCenter(center: LocationValue): Unit = js.native
  def setCenter(center: LocationValue, preventEvent: Boolean): Unit = js.native
  /**
    * 修改选项
    * @param options 选项
    */
  def setOptions(): Unit = js.native
  def setOptions(options: Options[ExtraData]): Unit = js.native
  /**
    * 设置圆形的半径
    * @param radius 半径
    * @param preventEvent 阻止触发事件
    */
  def setRadius(radius: Double): Unit = js.native
  def setRadius(radius: Double, preventEvent: Boolean): Unit = js.native
}

