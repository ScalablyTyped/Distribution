package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`segment-drag`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.drag
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderSegmentDragEvent extends js.Object {
  var index: Double
  var state: start | drag
  var thumbIndices: js.Array[Double]
  var `type`: `segment-drag`
}

object SliderSegmentDragEvent {
  @scala.inline
  def apply(index: Double, state: start | drag, thumbIndices: js.Array[Double], `type`: `segment-drag`): SliderSegmentDragEvent = {
    val __obj = js.Dynamic.literal(index = index, state = state.asInstanceOf[js.Any], thumbIndices = thumbIndices)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SliderSegmentDragEvent]
  }
}

