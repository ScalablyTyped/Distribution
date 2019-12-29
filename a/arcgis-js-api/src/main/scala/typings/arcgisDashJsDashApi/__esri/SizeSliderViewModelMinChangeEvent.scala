package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeSliderViewModelMinChangeEvent extends js.Object {
  var oldValue: Double
  var `type`: min
  var value: Double
}

object SizeSliderViewModelMinChangeEvent {
  @scala.inline
  def apply(oldValue: Double, `type`: min, value: Double): SizeSliderViewModelMinChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeSliderViewModelMinChangeEvent]
  }
}

