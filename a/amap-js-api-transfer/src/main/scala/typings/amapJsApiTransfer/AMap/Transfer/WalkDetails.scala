package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkDetails extends js.Object {
  /**
    * 此换乘段的步行终点
    */
  var destination: LngLat
  /**
    * 此换乘段的步行起点
    */
  var origin: LngLat
  /**
    * 此换乘段坐标集合
    */
  var path: js.Array[LngLat]
  /**
    * 步行子路段WalkStep列表
    */
  var steps: js.Array[WalkStep]
}

object WalkDetails {
  @scala.inline
  def apply(destination: LngLat, origin: LngLat, path: js.Array[LngLat], steps: js.Array[WalkStep]): WalkDetails = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkDetails]
  }
}

