package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartMappingSliderViewModelMaxChangeEvent extends js.Object {
  var oldValue: Double
  var `type`: max
  var value: Double
}

object SmartMappingSliderViewModelMaxChangeEvent {
  @scala.inline
  def apply(oldValue: Double, `type`: max, value: Double): SmartMappingSliderViewModelMaxChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartMappingSliderViewModelMaxChangeEvent]
  }
}

