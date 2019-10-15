package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipointDrawActionCursorUpdateEvent extends js.Object {
  var defaultPrevented: Boolean
  var preventDefault: js.Function
  var `type`: String
  var vertexIndex: Double
  var vertices: js.Array[js.Array[Double]]
}

object MultipointDrawActionCursorUpdateEvent {
  @scala.inline
  def apply(
    defaultPrevented: Boolean,
    preventDefault: js.Function,
    `type`: String,
    vertexIndex: Double,
    vertices: js.Array[js.Array[Double]]
  ): MultipointDrawActionCursorUpdateEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented, preventDefault = preventDefault, vertexIndex = vertexIndex, vertices = vertices)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MultipointDrawActionCursorUpdateEvent]
  }
}

