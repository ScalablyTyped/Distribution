package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineDrawActionCursorUpdateEvent extends js.Object {
  var defaultPrevented: Boolean
  var preventDefault: js.Function
  var `type`: String
  var vertexIndex: Double
  var vertices: js.Array[js.Array[Double]]
}

object PolylineDrawActionCursorUpdateEvent {
  @scala.inline
  def apply(
    defaultPrevented: Boolean,
    preventDefault: js.Function,
    `type`: String,
    vertexIndex: Double,
    vertices: js.Array[js.Array[Double]]
  ): PolylineDrawActionCursorUpdateEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented, preventDefault = preventDefault, vertexIndex = vertexIndex, vertices = vertices)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PolylineDrawActionCursorUpdateEvent]
  }
}

