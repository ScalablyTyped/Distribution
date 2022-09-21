package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`cursor-update`
import typings.arcgisJsApi.arcgisJsApiStrings.`draw-complete`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointDrawAction
  extends StObject
     with DrawAction {
  
  /**
    * Completes drawing the [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometry and fires the [draw-complete](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PointDrawAction.html#event-draw-complete) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PointDrawAction.html#complete)
    */
  def complete(): scala.Unit = js.native
  
  @JSName("on")
  def on_cursorupdate(name: `cursor-update`, eventHandler: PointDrawActionCursorUpdateEventHandler): IHandle = js.native
  @JSName("on")
  def on_drawcomplete(name: `draw-complete`, eventHandler: PointDrawActionDrawCompleteEventHandler): IHandle = js.native
}
