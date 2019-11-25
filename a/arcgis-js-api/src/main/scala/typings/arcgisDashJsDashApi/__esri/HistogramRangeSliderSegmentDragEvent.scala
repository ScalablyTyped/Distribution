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
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], thumbIndices = thumbIndices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramRangeSliderSegmentDragEvent]
  }
}

