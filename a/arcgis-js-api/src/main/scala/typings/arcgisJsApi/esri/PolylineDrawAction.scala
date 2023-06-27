package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`cursor-update`
import typings.arcgisJsApi.arcgisJsApiStrings.`draw-complete`
import typings.arcgisJsApi.arcgisJsApiStrings.`vertex-add`
import typings.arcgisJsApi.arcgisJsApiStrings.`vertex-remove`
import typings.arcgisJsApi.arcgisJsApiStrings.click
import typings.arcgisJsApi.arcgisJsApiStrings.freehand
import typings.arcgisJsApi.arcgisJsApiStrings.hybrid
import typings.arcgisJsApi.arcgisJsApiStrings.redo
import typings.arcgisJsApi.arcgisJsApiStrings.undo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolylineDrawAction
  extends StObject
     with DrawAction {
  
  /**
  		 * Completes drawing the polyline geometry and fires the [draw-complete](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolylineDrawAction.html#event-draw-complete) event.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolylineDrawAction.html#complete)
  		 */
  def complete(): scala.Unit = js.native
  
  /**
  		 * The drawing mode.
  		 *
  		 * @default hybrid
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolylineDrawAction.html#mode)
  		 */
  var mode: hybrid | freehand | click = js.native
  
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
