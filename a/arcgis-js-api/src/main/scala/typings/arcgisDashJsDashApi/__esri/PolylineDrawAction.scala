package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IHandle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`cursor-update`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`draw-complete`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`vertex-add`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`vertex-remove`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.click
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.freehand
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.hybrid
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.redo
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.undo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolylineDrawAction extends DrawAction {
  /**
    * The drawing mode. It is only relevant when the action is first created. Its value cannot be changed during the action lifecycle.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * hybrid | Vertices are added while the pointer is clicked or dragged.
    * freehand | Vertices are added while the pointer is dragged.
    * click | Vertices are added when the pointer is clicked.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolylineDrawAction.html#mode)
    *
    * @default hybrid
    */
  var mode: hybrid | freehand | click = js.native
  /**
    * Two-dimensional array of numbers representing the coordinates of each vertex comprising the geometry being drawn.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolylineDrawAction.html#vertices)
    */
  val vertices: js.Array[js.Array[Double]] = js.native
  /**
    * Completes drawing the polyline geometry and fires the [draw-complete](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolylineDrawAction.html#event-draw-complete) event. Call this method if the drawing logic needs to be completed other than by double-clicking or pressing the "C" key.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolylineDrawAction.html#complete)
    *
    *
    */
  def complete(): Unit = js.native
  @JSName("on")
  def on_cursorupdate(name: `cursor-update`, eventHandler: PolylineDrawActionCursorUpdateEventHandler): IHandle = js.native
  @JSName("on")
  def on_drawcomplete(name: `draw-complete`, eventHandler: PolylineDrawActionDrawCompleteEventHandler): IHandle = js.native
  @JSName("on")
  def on_redo(name: redo, eventHandler: PolylineDrawActionRedoEventHandler): IHandle = js.native
  @JSName("on")
  def on_undo(name: undo, eventHandler: PolylineDrawActionUndoEventHandler): IHandle = js.native
  @JSName("on")
  def on_vertexadd(name: `vertex-add`, eventHandler: PolylineDrawActionVertexAddEventHandler): IHandle = js.native
  @JSName("on")
  def on_vertexremove(name: `vertex-remove`, eventHandler: PolylineDrawActionVertexRemoveEventHandler): IHandle = js.native
}

@JSGlobal("__esri.PolylineDrawAction")
@js.native
object PolylineDrawAction extends TopLevel[PolylineDrawActionConstructor]

