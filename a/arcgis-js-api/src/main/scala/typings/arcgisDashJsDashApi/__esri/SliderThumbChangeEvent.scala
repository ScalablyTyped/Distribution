package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`thumb-change`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderThumbChangeEvent extends js.Object {
  var index: Double
  var oldValue: Double
  var `type`: `thumb-change`
  var value: Double
}

object SliderThumbChangeEvent {
  @scala.inline
  def apply(index: Double, oldValue: Double, `type`: `thumb-change`, value: Double): SliderThumbChangeEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderThumbChangeEvent]
  }
}

