package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapSliderViewModelMinChangeEvent extends js.Object {
  var oldValue: Double
  var `type`: String
  var value: Double
}

object HeatmapSliderViewModelMinChangeEvent {
  @scala.inline
  def apply(oldValue: Double, `type`: String, value: Double): HeatmapSliderViewModelMinChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HeatmapSliderViewModelMinChangeEvent]
  }
}

