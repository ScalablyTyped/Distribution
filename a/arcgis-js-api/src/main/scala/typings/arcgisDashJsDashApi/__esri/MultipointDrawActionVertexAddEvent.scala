package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`vertex-add`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipointDrawActionVertexAddEvent extends js.Object {
  var defaultPrevented: Boolean
  var preventDefault: js.Function
  var `type`: `vertex-add`
  var vertexIndex: Double
  var vertices: js.Array[js.Array[Double]]
}

object MultipointDrawActionVertexAddEvent {
  @scala.inline
  def apply(
    defaultPrevented: Boolean,
    preventDefault: js.Function,
    `type`: `vertex-add`,
    vertexIndex: Double,
    vertices: js.Array[js.Array[Double]]
  ): MultipointDrawActionVertexAddEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], vertexIndex = vertexIndex.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipointDrawActionVertexAddEvent]
  }
}

