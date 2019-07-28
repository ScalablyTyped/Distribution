package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSizeSliderViewModelMinChangeEvent extends js.Object {
  var oldValue: Double
  var `type`: String
  var value: Double
}

object ColorSizeSliderViewModelMinChangeEvent {
  @scala.inline
  def apply(oldValue: Double, `type`: String, value: Double): ColorSizeSliderViewModelMinChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColorSizeSliderViewModelMinChangeEvent]
  }
}

