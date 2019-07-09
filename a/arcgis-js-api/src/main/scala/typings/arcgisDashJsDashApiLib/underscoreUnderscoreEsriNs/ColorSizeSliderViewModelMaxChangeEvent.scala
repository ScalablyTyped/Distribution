package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSizeSliderViewModelMaxChangeEvent extends js.Object {
  var oldValue: scala.Double
  var `type`: java.lang.String
  var value: scala.Double
}

object ColorSizeSliderViewModelMaxChangeEvent {
  @scala.inline
  def apply(oldValue: scala.Double, `type`: java.lang.String, value: scala.Double): ColorSizeSliderViewModelMaxChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColorSizeSliderViewModelMaxChangeEvent]
  }
}

