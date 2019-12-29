package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpacitySliderViewModelMinChangeEvent extends js.Object {
  var oldValue: Double
  var `type`: min
  var value: Double
}

object OpacitySliderViewModelMinChangeEvent {
  @scala.inline
  def apply(oldValue: Double, `type`: min, value: Double): OpacitySliderViewModelMinChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacitySliderViewModelMinChangeEvent]
  }
}

