package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.IHandle
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.arcgisJsApi.esri.Evented because Inheritance from two classes. Inlined emit, emit, hasEventListener, on, on */ @js.native
trait Widget_ extends Accessor {
  /**
    * The ID or node representing the DOM element containing the widget. This property can only be set once. The following examples are all valid use cases when working with widgets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#container)
    */
  var container: String | HTMLElement = js.native
  /**
    * The unique ID assigned to the widget when the widget is created. If not set by the developer, it will default to the container ID, or if that is not present then it will be automatically generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#id)
    */
  var id: String = js.native
  /**
    * The widget's label.  This property is useful whenever the widget is controlled by another one (e.g. [Expand](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html))
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#label)
    */
  var label: String = js.native
  /**
    * A utility method used for building the value for a widget's `class` property. This aids in simplifying CSS class setup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#classes)
    *
    * @param classNames The class names.
    *
    */
  def classes(classNames: (String | js.Array[String] | js.Any)*): String = js.native
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
  def own(handles: js.Array[WatchHandle]): Unit = js.native
  /**
    * Widget teardown helper. Any handles added to it will be automatically removed when the widget is destroyed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#own)
    *
    * @param handles Handles marked for removal once the widget is destroyed.
    *
    */
  def own(handles: WatchHandle): Unit = js.native
  /**
    * *This method is primarily used by developers when implementing custom widgets.* Executes after widget is ready for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#postInitialize)
    *
    *
    */
  def postInitialize(): Unit = js.native
  /**
    * *This method is primarily used by developers when implementing custom widgets.* It must be implemented by subclasses for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#render)
    *
    *
    */
  def render(): js.Any = js.native
  /**
    * Renders widget to the DOM immediately.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#renderNow)
    *
    *
    */
  def renderNow(): Unit = js.native
  /**
    * *This method is primarily used by developers when implementing custom widgets.* Schedules widget rendering. This method is useful for changes affecting the UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#scheduleRender)
    *
    *
    */
  def scheduleRender(): Unit = js.native
}

@JSGlobal("__esri.Widget")
@js.native
object Widget_ extends TopLevel[WidgetConstructor]

