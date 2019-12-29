package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`vertex-remove`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineDrawActionVertexRemoveEvent extends js.Object {
  var defaultPrevented: Boolean
  var preventDefault: js.Function
  var `type`: `vertex-remove`
  var vertexIndex: Double
  var vertices: js.Array[js.Array[Double]]
}

object PolylineDrawActionVertexRemoveEvent {
  @scala.inline
  def apply(
    defaultPrevented: Boolean,
    preventDefault: js.Function,
    `type`: `vertex-remove`,
    vertexIndex: Double,
    vertices: js.Array[js.Array[Double]]
  ): PolylineDrawActionVertexRemoveEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], vertexIndex = vertexIndex.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylineDrawActionVertexRemoveEvent]
  }
}

