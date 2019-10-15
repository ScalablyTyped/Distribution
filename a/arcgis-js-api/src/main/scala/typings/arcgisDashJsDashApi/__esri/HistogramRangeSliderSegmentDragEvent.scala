package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramRangeSliderSegmentDragEvent extends js.Object {
  var index: Double
  var state: String
  var thumbIndices: js.Array[Double]
  var `type`: String
}

object HistogramRangeSliderSegmentDragEvent {
  @scala.inline
  def apply(index: Double, state: String, thumbIndices: js.Array[Double], `type`: String): HistogramRangeSliderSegmentDragEvent = {
    val __obj = js.Dynamic.literal(index = index, state = state, thumbIndices = thumbIndices)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HistogramRangeSliderSegmentDragEvent]
  }
}

