package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderValuesChangeEvent extends js.Object {
  var indices: js.Array[Double]
  var oldValues: js.Array[Double]
  var `type`: String
  var values: js.Array[Double]
}

object SliderValuesChangeEvent {
  @scala.inline
  def apply(indices: js.Array[Double], oldValues: js.Array[Double], `type`: String, values: js.Array[Double]): SliderValuesChangeEvent = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], oldValues = oldValues.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderValuesChangeEvent]
  }
}

