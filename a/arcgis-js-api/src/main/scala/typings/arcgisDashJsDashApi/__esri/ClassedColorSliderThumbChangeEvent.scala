package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassedColorSliderThumbChangeEvent extends js.Object {
  var index: Double
  var oldValue: Double
  var `type`: String
  var value: Double
}

object ClassedColorSliderThumbChangeEvent {
  @scala.inline
  def apply(index: Double, oldValue: Double, `type`: String, value: Double): ClassedColorSliderThumbChangeEvent = {
    val __obj = js.Dynamic.literal(index = index, oldValue = oldValue, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ClassedColorSliderThumbChangeEvent]
  }
}

