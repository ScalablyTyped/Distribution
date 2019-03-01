package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewPointerLeaveEvent extends js.Object {
  var button: scala.Double
  var buttons: scala.Double
  var native: js.Any
  var pointerId: scala.Double
  var pointerType: java.lang.String
  var stopPropagation: js.Function
  var timestamp: scala.Double
  var `type`: java.lang.String
  var x: scala.Double
  var y: scala.Double
}

object MapViewPointerLeaveEvent {
  @scala.inline
  def apply(
    button: scala.Double,
    buttons: scala.Double,
    native: js.Any,
    pointerId: scala.Double,
    pointerType: java.lang.String,
    stopPropagation: js.Function,
    timestamp: scala.Double,
    `type`: java.lang.String,
    x: scala.Double,
    y: scala.Double
  ): MapViewPointerLeaveEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("button")(button)
    __obj.updateDynamic("buttons")(buttons)
    __obj.updateDynamic("native")(native)
    __obj.updateDynamic("pointerId")(pointerId)
    __obj.updateDynamic("pointerType")(pointerType)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[MapViewPointerLeaveEvent]
  }
}

