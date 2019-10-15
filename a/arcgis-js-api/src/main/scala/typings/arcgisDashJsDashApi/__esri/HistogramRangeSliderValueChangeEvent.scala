package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramRangeSliderValueChangeEvent extends js.Object {
  var index: Double
  var oldValue: Double
  var `type`: String
  var value: Double
}

object HistogramRangeSliderValueChangeEvent {
  @scala.inline
  def apply(index: Double, oldValue: Double, `type`: String, value: Double): HistogramRangeSliderValueChangeEvent = {
    val __obj = js.Dynamic.literal(index = index, oldValue = oldValue, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HistogramRangeSliderValueChangeEvent]
  }
}

