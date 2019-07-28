package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassedColorSliderMinChangeEvent extends js.Object {
  var oldValue: Double
  var `type`: String
  var value: Double
}

object ClassedColorSliderMinChangeEvent {
  @scala.inline
  def apply(oldValue: Double, `type`: String, value: Double): ClassedColorSliderMinChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ClassedColorSliderMinChangeEvent]
  }
}

