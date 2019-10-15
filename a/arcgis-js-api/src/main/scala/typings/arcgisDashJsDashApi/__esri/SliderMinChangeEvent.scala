package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderMinChangeEvent extends js.Object {
  var oldValue: Double
  var `type`: String
  var value: Double
}

object SliderMinChangeEvent {
  @scala.inline
  def apply(oldValue: Double, `type`: String, value: Double): SliderMinChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SliderMinChangeEvent]
  }
}

