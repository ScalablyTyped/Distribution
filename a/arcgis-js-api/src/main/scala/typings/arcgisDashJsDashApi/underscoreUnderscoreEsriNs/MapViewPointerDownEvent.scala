package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewPointerDownEvent extends js.Object {
  var button: Double
  var buttons: Double
  var native: js.Any
  var pointerId: Double
  var pointerType: String
  var stopPropagation: js.Function
  var timestamp: Double
  var `type`: String
  var x: Double
  var y: Double
}

object MapViewPointerDownEvent {
  @scala.inline
  def apply(
    button: Double,
    buttons: Double,
    native: js.Any,
    pointerId: Double,
    pointerType: String,
    stopPropagation: js.Function,
    timestamp: Double,
    `type`: String,
    x: Double,
    y: Double
  ): MapViewPointerDownEvent = {
    val __obj = js.Dynamic.literal(button = button, buttons = buttons, native = native, pointerId = pointerId, pointerType = pointerType, stopPropagation = stopPropagation, timestamp = timestamp, x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MapViewPointerDownEvent]
  }
}

