package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IHandle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`cursor-update`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`draw-complete`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointDrawAction extends DrawAction {
  /**
    * An array of x,y coordinates for the [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PointDrawAction.html#coordinates)
    */
  val coordinates: js.Array[Double] = js.native
  /**
    * Completes drawing the [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometry and fires the [draw-complete](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PointDrawAction.html#event-draw-complete) event. Call this method if the drawing logic needs to be completed other than by double-clicking or pressing the "C" key.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PointDrawAction.html#complete)
    *
    *
    */
  def complete(): Unit = js.native
  @JSName("on")
  def on_cursorupdate(name: `cursor-update`, eventHandler: PointDrawActionCursorUpdateEventHandler): IHandle = js.native
  @JSName("on")
  def on_drawcomplete(name: `draw-complete`, eventHandler: PointDrawActionDrawCompleteEventHandler): IHandle = js.native
}

@JSGlobal("__esri.PointDrawAction")
@js.native
object PointDrawAction extends TopLevel[PointDrawActionConstructor]

