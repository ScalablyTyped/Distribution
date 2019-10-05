package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSliderMaxChangeEvent extends js.Object {
  var oldValue: Double
  var `type`: String
  var value: Double
}

object ColorSliderMaxChangeEvent {
  @scala.inline
  def apply(oldValue: Double, `type`: String, value: Double): ColorSliderMaxChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColorSliderMaxChangeEvent]
  }
}

