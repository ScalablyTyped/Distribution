package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointDrawActionDrawCompleteEvent extends js.Object {
  var coordinates: js.Array[Double]
  var defaultPrevented: Boolean
  var preventDefault: js.Function
  var `type`: String
}

object PointDrawActionDrawCompleteEvent {
  @scala.inline
  def apply(
    coordinates: js.Array[Double],
    defaultPrevented: Boolean,
    preventDefault: js.Function,
    `type`: String
  ): PointDrawActionDrawCompleteEvent = {
    val __obj = js.Dynamic.literal(coordinates = coordinates, defaultPrevented = defaultPrevented, preventDefault = preventDefault)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PointDrawActionDrawCompleteEvent]
  }
}

