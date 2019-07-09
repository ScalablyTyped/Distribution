package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassedSizeSliderThumbDragEvent extends js.Object {
  var index: scala.Double
  var state: java.lang.String
  var `type`: java.lang.String
  var value: scala.Double
}

object ClassedSizeSliderThumbDragEvent {
  @scala.inline
  def apply(index: scala.Double, state: java.lang.String, `type`: java.lang.String, value: scala.Double): ClassedSizeSliderThumbDragEvent = {
    val __obj = js.Dynamic.literal(index = index, state = state, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ClassedSizeSliderThumbDragEvent]
  }
}

