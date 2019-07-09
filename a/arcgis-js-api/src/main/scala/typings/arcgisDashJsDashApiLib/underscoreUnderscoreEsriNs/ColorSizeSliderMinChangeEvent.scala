package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSizeSliderMinChangeEvent extends js.Object {
  var oldValue: scala.Double
  var `type`: java.lang.String
  var value: scala.Double
}

object ColorSizeSliderMinChangeEvent {
  @scala.inline
  def apply(oldValue: scala.Double, `type`: java.lang.String, value: scala.Double): ColorSizeSliderMinChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColorSizeSliderMinChangeEvent]
  }
}

