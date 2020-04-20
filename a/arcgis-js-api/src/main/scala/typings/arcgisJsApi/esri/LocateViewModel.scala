package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`locate-error`
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.locating
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.arcgisJsApi.esri.Evented because Inheritance from two classes. Inlined emit, emit, hasEventListener, on, on */ @js.native
trait LocateViewModel
  extends Accessor
     with GeolocationPositioning
     with GoTo {
  /**
    * The current state of the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html#state)
    *
    * @default disabled
    */
  val state: disabled | ready | locating = js.native
  /**
    * This function provides the ability to interrupt and cancel the process of programmatically obtaining the location of the user's device.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html#cancelLocate)
    *
    *
    */
  def cancelLocate(): Unit = js.native
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
    * Animates the view to the user's location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html#locate)
    *
    *
    */
  def locate(): js.Promise[_] = js.native
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
  @JSName("on")
  def on_locateerror(name: `locate-error`, eventHandler: LocateViewModelLocateErrorEventHandler): IHandle = js.native
}

@JSGlobal("__esri.LocateViewModel")
@js.native
object LocateViewModel extends TopLevel[LocateViewModelConstructor]

