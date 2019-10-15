package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartMappingSliderBaseThumbDragEvent extends js.Object {
  var index: Double
  var state: String
  var `type`: String
  var value: Double
}

object SmartMappingSliderBaseThumbDragEvent {
  @scala.inline
  def apply(index: Double, state: String, `type`: String, value: Double): SmartMappingSliderBaseThumbDragEvent = {
    val __obj = js.Dynamic.literal(index = index, state = state, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SmartMappingSliderBaseThumbDragEvent]
  }
}

