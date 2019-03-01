package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewKeyUpEvent extends js.Object {
  var native: js.Any
  var stopPropagation: js.Function
  var timestamp: scala.Double
  var `type`: java.lang.String
}

object SceneViewKeyUpEvent {
  @scala.inline
  def apply(native: js.Any, stopPropagation: js.Function, timestamp: scala.Double, `type`: java.lang.String): SceneViewKeyUpEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("native")(native)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[SceneViewKeyUpEvent]
  }
}

