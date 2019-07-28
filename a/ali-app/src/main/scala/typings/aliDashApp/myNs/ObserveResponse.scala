package typings.aliDashApp.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserveResponse extends js.Object {
   // 相交区域占目标节点的布局区域的比例
  var boundingClientRect: RectArea
  var dataset: js.Any
  var id: String
  var intersectionRatio: Double
  var intersectionRect: RectArea
  var relativeRect: RectArea
  var time: Double
}

object ObserveResponse {
  @scala.inline
  def apply(
    boundingClientRect: RectArea,
    dataset: js.Any,
    id: String,
    intersectionRatio: Double,
    intersectionRect: RectArea,
    relativeRect: RectArea,
    time: Double
  ): ObserveResponse = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect, dataset = dataset, id = id, intersectionRatio = intersectionRatio, intersectionRect = intersectionRect, relativeRect = relativeRect, time = time)
  
    __obj.asInstanceOf[ObserveResponse]
  }
}

