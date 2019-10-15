package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IHandle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`cursor-update`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`draw-complete`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`vertex-add`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.click
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.freehand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentDrawAction extends DrawAction {
  /**
    * The drawing mode. It is only relevant when the action is first created. Its value cannot be changed during the action lifecycle.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * freehand | Vertices are added while the pointer is dragged.
    * click | Vertices are added when the pointer is clicked. SegmentDrawActions are created from 2 vertices.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html#mode)
    *
    * @default freehand
    */
  var mode: freehand | click = js.native
  /**
    * Two-dimensional array of numbers representing the coordinates of each vertex comprising the geometry being drawn.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html#vertices)
    */
  val vertices: js.Array[js.Array[Double]] = js.native
  /**
    * Completes drawing the polygon geometry and fires the [draw-complete](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html#event-draw-complete) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html#complete)
    *
    *
    */
  def complete(): Unit = js.native
  @JSName("on")
  def on_cursorupdate(name: `cursor-update`, eventHandler: SegmentDrawActionCursorUpdateEventHandler): IHandle = js.native
  @JSName("on")
  def on_drawcomplete(name: `draw-complete`, eventHandler: SegmentDrawActionDrawCompleteEventHandler): IHandle = js.native
  @JSName("on")
  def on_vertexadd(name: `vertex-add`, eventHandler: SegmentDrawActionVertexAddEventHandler): IHandle = js.native
}

@JSGlobal("__esri.SegmentDrawAction")
@js.native
object SegmentDrawAction extends TopLevel[SegmentDrawActionConstructor]

