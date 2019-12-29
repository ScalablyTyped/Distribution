package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSizeSliderViewModelMinChangeEvent extends js.Object {
  var oldValue: Double
  var `type`: min
  var value: Double
}

object ColorSizeSliderViewModelMinChangeEvent {
  @scala.inline
  def apply(oldValue: Double, `type`: min, value: Double): ColorSizeSliderViewModelMinChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSizeSliderViewModelMinChangeEvent]
  }
}

