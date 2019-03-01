package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewMouseWheelEvent extends js.Object {
  var deltaY: scala.Double
  var native: js.Any
  var stopPropagation: js.Function
  var timestamp: scala.Double
  var `type`: java.lang.String
  var x: scala.Double
  var y: scala.Double
}

object SceneViewMouseWheelEvent {
  @scala.inline
  def apply(
    deltaY: scala.Double,
    native: js.Any,
    stopPropagation: js.Function,
    timestamp: scala.Double,
    `type`: java.lang.String,
    x: scala.Double,
    y: scala.Double
  ): SceneViewMouseWheelEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("deltaY")(deltaY)
    __obj.updateDynamic("native")(native)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[SceneViewMouseWheelEvent]
  }
}

