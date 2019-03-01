package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewFocusEvent extends js.Object {
  var native: js.Any
  var target: View
}

object MapViewFocusEvent {
  @scala.inline
  def apply(native: js.Any, target: View): MapViewFocusEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("native")(native)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[MapViewFocusEvent]
  }
}

