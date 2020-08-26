package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`cursor-update`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolygonDrawActionCursorUpdateEvent extends js.Object {
  var defaultPrevented: Boolean = js.native
  var preventDefault: js.Function = js.native
  var `type`: `cursor-update` = js.native
  var vertexIndex: Double = js.native
  var vertices: js.Array[js.Array[Double]] = js.native
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
  @scala.inline
  implicit class PolygonDrawActionCursorUpdateEventOps[Self <: PolygonDrawActionCursorUpdateEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultPrevented(value: Boolean): Self = this.set("defaultPrevented", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreventDefault(value: js.Function): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `cursor-update`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertexIndex(value: Double): Self = this.set("vertexIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticesVarargs(value: js.Array[Double]*): Self = this.set("vertices", js.Array(value :_*))
    @scala.inline
    def setVertices(value: js.Array[js.Array[Double]]): Self = this.set("vertices", value.asInstanceOf[js.Any])
  }
  
}

