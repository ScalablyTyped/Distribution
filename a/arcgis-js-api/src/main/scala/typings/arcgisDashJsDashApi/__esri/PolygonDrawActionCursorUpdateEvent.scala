package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`cursor-update`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonDrawActionCursorUpdateEvent extends js.Object {
  var defaultPrevented: Boolean
  var preventDefault: js.Function
  var `type`: `cursor-update`
  var vertexIndex: Double
  var vertices: js.Array[js.Array[Double]]
}

object PolygonDrawActionCursorUpdateEvent {
  @scala.inline
  def apply(
    defaultPrevented: Boolean,
    preventDefault: js.Function,
    `type`: `cursor-update`,
    vertexIndex: Double,
    vertices: js.Array[js.Array[Double]]
  ): PolygonDrawActionCursorUpdateEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], vertexIndex = vertexIndex.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonDrawActionCursorUpdateEvent]
  }
}

