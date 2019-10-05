package typings.amapDashJsDashApi.AMap

import typings.amapDashJsDashApi.AMap.Polygon.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Polygon")
@js.native
/**
  * 多边形
  * @param options 选项
  */
class Polygon_[ExtraData] () extends PathOverlay[ExtraData] {
  def this(options: Options[ExtraData]) = this()
  /**
    * 判断指定点坐标是否在多边形范围内
    * @param point 坐标
    */
  def contains(point: LocationValue): Boolean = js.native
  /**
    * 获取多边形的面积
    */
  def getArea(): Double = js.native
  /**
    * 获取多边形轮廓线节点数组
    */
  def getPath(): js.Array[js.Array[LngLat] | LngLat] = js.native
  /**
    * 修改多边形属性
    * @param options 属性
    */
  def setOptions(options: Options[ExtraData]): Unit = js.native
  /**
    * 设置多边形轮廓线节点数组
    * @param path 轮廓线节点
    */
  def setPath(path: js.Array[js.Array[LocationValue] | LocationValue]): Unit = js.native
}

