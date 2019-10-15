package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineDrawActionVertexAddEvent extends js.Object {
  var defaultPrevented: Boolean
  var preventDefault: js.Function
  var `type`: String
  var vertexIndex: Double
  var vertices: js.Array[js.Array[Double]]
}

object PolylineDrawActionVertexAddEvent {
  @scala.inline
  def apply(
    defaultPrevented: Boolean,
    preventDefault: js.Function,
    `type`: String,
    vertexIndex: Double,
    vertices: js.Array[js.Array[Double]]
  ): PolylineDrawActionVertexAddEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented, preventDefault = preventDefault, vertexIndex = vertexIndex, vertices = vertices)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PolylineDrawActionVertexAddEvent]
  }
}

