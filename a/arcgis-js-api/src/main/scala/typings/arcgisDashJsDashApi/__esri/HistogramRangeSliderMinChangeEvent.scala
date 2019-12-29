package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`min-change`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramRangeSliderMinChangeEvent extends js.Object {
  var oldValue: Double
  var `type`: `min-change`
  var value: Double
}

object HistogramRangeSliderMinChangeEvent {
  @scala.inline
  def apply(oldValue: Double, `type`: `min-change`, value: Double): HistogramRangeSliderMinChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramRangeSliderMinChangeEvent]
  }
}

