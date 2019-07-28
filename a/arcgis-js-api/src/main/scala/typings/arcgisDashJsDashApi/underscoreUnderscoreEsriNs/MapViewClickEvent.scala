package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewClickEvent extends js.Object {
  var button: Double
  var buttons: Double
  var mapPoint: Point
  var native: js.Any
  var stopPropagation: js.Function
  var timestamp: Double
  var `type`: String
  var x: Double
  var y: Double
}

object MapViewClickEvent {
  @scala.inline
  def apply(
    button: Double,
    buttons: Double,
    mapPoint: Point,
    native: js.Any,
    stopPropagation: js.Function,
    timestamp: Double,
    `type`: String,
    x: Double,
    y: Double
  ): MapViewClickEvent = {
    val __obj = js.Dynamic.literal(button = button, buttons = buttons, mapPoint = mapPoint, native = native, stopPropagation = stopPropagation, timestamp = timestamp, x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MapViewClickEvent]
  }
}

