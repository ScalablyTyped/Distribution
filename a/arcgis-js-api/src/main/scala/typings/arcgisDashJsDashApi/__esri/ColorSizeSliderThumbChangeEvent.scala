package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`thumb-change`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSizeSliderThumbChangeEvent extends js.Object {
  var index: Double
  var oldValue: Double
  var `type`: `thumb-change`
  var value: Double
}

object ColorSizeSliderThumbChangeEvent {
  @scala.inline
  def apply(index: Double, oldValue: Double, `type`: `thumb-change`, value: Double): ColorSizeSliderThumbChangeEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSizeSliderThumbChangeEvent]
  }
}

