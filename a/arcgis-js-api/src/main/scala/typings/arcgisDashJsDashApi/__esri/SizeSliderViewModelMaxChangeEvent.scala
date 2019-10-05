package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeSliderViewModelMaxChangeEvent extends js.Object {
  var oldValue: Double
  var `type`: String
  var value: Double
}

object SizeSliderViewModelMaxChangeEvent {
  @scala.inline
  def apply(oldValue: Double, `type`: String, value: Double): SizeSliderViewModelMaxChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SizeSliderViewModelMaxChangeEvent]
  }
}

