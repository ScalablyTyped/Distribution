package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`max-change`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassedSizeSliderMaxChangeEvent extends js.Object {
  var oldValue: Double
  var `type`: `max-change`
  var value: Double
}

object ClassedSizeSliderMaxChangeEvent {
  @scala.inline
  def apply(oldValue: Double, `type`: `max-change`, value: Double): ClassedSizeSliderMaxChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassedSizeSliderMaxChangeEvent]
  }
}

