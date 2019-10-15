package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointDrawActionCursorUpdateEvent extends js.Object {
  var coordinates: js.Array[Double]
  var defaultPrevented: Boolean
  var preventDefault: js.Function
  var `type`: String
}

object PointDrawActionCursorUpdateEvent {
  @scala.inline
  def apply(
    coordinates: js.Array[Double],
    defaultPrevented: Boolean,
    preventDefault: js.Function,
    `type`: String
  ): PointDrawActionCursorUpdateEvent = {
    val __obj = js.Dynamic.literal(coordinates = coordinates, defaultPrevented = defaultPrevented, preventDefault = preventDefault)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PointDrawActionCursorUpdateEvent]
  }
}

