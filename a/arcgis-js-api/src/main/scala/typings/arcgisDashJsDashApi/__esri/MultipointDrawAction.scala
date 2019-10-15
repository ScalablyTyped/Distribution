package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IHandle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`cursor-update`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`draw-complete`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`vertex-add`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`vertex-remove`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.redo
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.undo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipointDrawAction extends DrawAction {
  /**
    * Two-dimensional array of numbers representing the coordinates of each vertex that comprises the drawn geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-MultipointDrawAction.html#vertices)
    */
  val vertices: js.Array[js.Array[Double]] = js.native
  /**
    * Completes drawing the [multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html) geometry and fires the [draw-complete](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-MultipointDrawAction.html#event-draw-complete) event. Call this method if the drawing logic needs to be completed other than by double-clicking or pressing the "C" key.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-MultipointDrawAction.html#complete)
    *
    *
    */
  def complete(): Unit = js.native
  @JSName("on")
  def on_cursorupdate(name: `cursor-update`, eventHandler: MultipointDrawActionCursorUpdateEventHandler): IHandle = js.native
  @JSName("on")
  def on_drawcomplete(name: `draw-complete`, eventHandler: MultipointDrawActionDrawCompleteEventHandler): IHandle = js.native
  @JSName("on")
  def on_redo(name: redo, eventHandler: MultipointDrawActionRedoEventHandler): IHandle = js.native
  @JSName("on")
  def on_undo(name: undo, eventHandler: MultipointDrawActionUndoEventHandler): IHandle = js.native
  @JSName("on")
  def on_vertexadd(name: `vertex-add`, eventHandler: MultipointDrawActionVertexAddEventHandler): IHandle = js.native
  @JSName("on")
  def on_vertexremove(name: `vertex-remove`, eventHandler: MultipointDrawActionVertexRemoveEventHandler): IHandle = js.native
}

@JSGlobal("__esri.MultipointDrawAction")
@js.native
object MultipointDrawAction extends TopLevel[MultipointDrawActionConstructor]

