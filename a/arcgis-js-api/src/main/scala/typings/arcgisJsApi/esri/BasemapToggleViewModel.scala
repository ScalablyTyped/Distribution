package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.IHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.arcgisJsApi.esri.Evented because Inheritance from two classes. Inlined emit, emit, hasEventListener, on, on */ @js.native
trait BasemapToggleViewModel extends Accessor {
  /**
    * The map's [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#activeBasemap)
    */
  val activeBasemap: Basemap = js.native
  /**
    * The next basemap for toggling. One of the following values may be set to this property:
    *   * The [string ID](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) of any Esri basemap.
    *   * A custom [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) object. Since this property may be [autocast](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#autocasting), the [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) module does not need to be included in the `require()` function in most applications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#nextBasemap)
    */
  var nextBasemap: Basemap = js.native
  /**
    * The view model's state.  **Possible Values:** ready | disabled
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#state)
    *
    * @default disabled
    */
  val state: String = js.native
  /**
    * The view from which the widget will operate. This view provides access to the initial [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) to toggle from via the view's [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#map) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
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
    * Toggles to the [next basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#nextBasemap).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#toggle)
    *
    *
    */
  def toggle(): Unit = js.native
}

@JSGlobal("__esri.BasemapToggleViewModel")
@js.native
object BasemapToggleViewModel extends TopLevel[BasemapToggleViewModelConstructor]

