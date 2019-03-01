package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewFocusEvent extends js.Object {
  var native: js.Any
  var target: View
}

object SceneViewFocusEvent {
  @scala.inline
  def apply(native: js.Any, target: View): SceneViewFocusEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("native")(native)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[SceneViewFocusEvent]
  }
}

