package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawAction
  extends Accessor
     with Evented {
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#view)
    */
  var view: MapView = js.native
  /**
    * Indicates if the [redo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#redo) method can be called on the action instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#canRedo)
    *
    *
    */
  def canRedo(): Boolean = js.native
  /**
    * Indicates if the [undo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#undo) method can be called on the action instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#canUndo)
    *
    *
    */
  def canUndo(): Boolean = js.native
  /**
    * Incrementally redo actions recorded in the stack. Call [canRedo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#canRedo) prior to calling this method to check if this method can be called on the action instance. Calling this method will fire the [vertex-add](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#event-vertex-add) or [vertex-remove](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#event-vertex-remove) events depending on the last action.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#redo)
    *
    *
    */
  def redo(): Unit = js.native
  /**
    * Incrementally undo actions recorded in the stack. Call [canUndo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#canUndo) prior to calling this method to check if this method can be called on the action instance. Calling this method will fire the [vertex-add](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#event-vertex-add) or [vertex-remove](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#event-vertex-remove) events depending on the last action.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#undo)
    *
    *
    */
  def undo(): Unit = js.native
}

@JSGlobal("__esri.DrawAction")
@js.native
object DrawAction extends TopLevel[DrawActionConstructor]

