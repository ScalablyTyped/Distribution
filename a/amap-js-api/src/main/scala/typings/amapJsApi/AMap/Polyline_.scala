package typings.amapJsApi.AMap

import typings.amapJsApi.AMap.Polyline.Options
import typings.amapJsApi.anon.LngLatcontrolPointsArrayL
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polyline_[ExtraData] extends PathOverlay[ExtraData] {
  
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
  def setOptions(options: Options[ExtraData] | Partial[typings.amapJsApi.AMap.BezierCurve.Options[ExtraData]]): Unit = js.native
  
  /**
    * 设置组成该折线的节点数组
    * @param path 节点数组
    */
  def setPath(path: js.Array[(js.Array[Double | String | (js.Array[String | Double])]) | LocationValue]): Unit = js.native
}
