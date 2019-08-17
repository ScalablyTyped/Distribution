package typings.amapDashJsDashApi.AMapNs

import typings.amapDashJsDashApi.AMapNs.BezierCurveNs.Options
import typings.amapDashJsDashApi.LngLatcontrolPointsArrayLngLat
import typings.amapDashJsDashApi.PartialOptionsExtraData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Polyline")
@js.native
/**
  * 折线
  * @param options 选项
  */
class Polyline[ExtraData] () extends PathOverlay[ExtraData] {
  def this(options: Options[ExtraData]) = this()
  def this(options: typings.amapDashJsDashApi.AMapNs.PolylineNs.Options[ExtraData]) = this()
  /**
    * 获取折线的总长度（单位：米）
    */
  def getLength(): Double = js.native
  /**
    * 获取折线路径的节点数组
    */
  def getPath(): js.Array[LngLat | LngLatcontrolPointsArrayLngLat] = js.native
  /**
    * 设置线的属性
    * @param options 属性
    */
  def setOptions(
    options: typings.amapDashJsDashApi.AMapNs.PolylineNs.Options[ExtraData] | PartialOptionsExtraData[ExtraData]
  ): Unit = js.native
  /**
    * 设置组成该折线的节点数组
    * @param path 节点数组
    */
  def setPath(path: js.Array[(js.Array[Double | String | (js.Array[String | Double])]) | LocationValue]): Unit = js.native
}

