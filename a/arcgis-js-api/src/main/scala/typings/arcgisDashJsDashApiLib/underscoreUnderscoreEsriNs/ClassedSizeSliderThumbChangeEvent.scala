package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassedSizeSliderThumbChangeEvent extends js.Object {
  var index: scala.Double
  var oldValue: scala.Double
  var `type`: java.lang.String
  var value: scala.Double
}

object ClassedSizeSliderThumbChangeEvent {
  @scala.inline
  def apply(index: scala.Double, oldValue: scala.Double, `type`: java.lang.String, value: scala.Double): ClassedSizeSliderThumbChangeEvent = {
    val __obj = js.Dynamic.literal(index = index, oldValue = oldValue, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ClassedSizeSliderThumbChangeEvent]
  }
}

