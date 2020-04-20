package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.IHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.arcgisJsApi.esri.Evented because Inheritance from two classes. Inlined emit, emit, hasEventListener, on, on */ @js.native
trait DrawAction extends Accessor {
  /**
    * Controls whether the created geometry will have z coordinates or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#hasZ)
    *
    * @default true
    */
  var hasZ: Double = js.native
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
    * Emits an event on the instance. This method should only be used when creating subclasses of this class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Evented.html#emit)
    *
    * @param type The name of the event.
    * @param event The event payload.
    *
    */
  def emit(`type`: String): Boolean = js.native
  def emit(`type`: String, event: js.Any): Boolean = js.native
  /**
    * Maps the given screen point to a map point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#getCoordsAndPointFromScreenPoint)
    *
    *
    */
  def getCoordsAndPointFromScreenPoint(): js.Any = js.native
  /**
    * Maps the given screen point to a map point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#getCoordsFromScreenPoint)
    *
    *
    */
  def getCoordsFromScreenPoint(): js.Any = js.native
  /**
    * Indicates whether there is an event listener on the instance that matches the provided event name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Evented.html#hasEventListener)
    *
    * @param type The name of the event.
    *
    */
  def hasEventListener(`type`: String): Boolean = js.native
  /**
    * Registers an event handler on the instance. Call this method to hook an event with a listener.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Evented.html#on)
    *
    * @param type A event type, or an array of event types, to listen for.
    * @param listener The function to call when the event is fired.
    *
    */
  def on(`type`: String, listener: EventHandler): IHandle = js.native
  def on(`type`: js.Array[String], listener: EventHandler): IHandle = js.native
  /**
    * Incrementally redo actions recorded in the stack. Call [canRedo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#canRedo) prior to calling this method to check if this method can be called on the action instance. Calling this method will fire the [vertex-add](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#event-vertex-add) or [vertex-remove](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#event-vertex-remove) events depending on the last action.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#redo)
    *
    *
    */
  def redo(): Unit = js.native
  /**
    * Maps the given screen point to a map point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#screenToMap)
    *
    *
    */
  def screenToMap(): js.Any = js.native
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

