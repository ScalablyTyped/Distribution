package typings.amapJsApi.AMap

import typings.amapJsApi.AMap.BezierCurve.Options
import typings.amapJsApi.LngLatcontrolPointsArrayL
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Polyline")
@js.native
/**
  * 折线
  * @param options 选项
  */
class Polyline_[ExtraData] () extends PathOverlay[ExtraData] {
  def this(options: Options[ExtraData]) = this()
  def this(options: typings.amapJsApi.AMap.Polyline.Options[ExtraData]) = this()
  /**
    * 获取折线的总长度（单位：米）
    */
  def getLength(): Double = js.native
  /**
    * 获取折线路径的节点数组
    */
  def getPath(): js.Array[LngLat | LngLatcontrolPointsArrayL] = js.native
  /**
    * 设置线的属性
    * @param options 属性
    */
  def setOptions(options: typings.amapJsApi.AMap.Polyline.Options[ExtraData] | Partial[Options[ExtraData]]): Unit = js.native
  /**
    * 设置组成该折线的节点数组
    * @param path 节点数组
    */
  def setPath(path: js.Array[(js.Array[Double | String | (js.Array[String | Double])]) | LocationValue]): Unit = js.native
}

