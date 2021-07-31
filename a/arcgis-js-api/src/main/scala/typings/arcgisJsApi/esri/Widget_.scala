package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Widget_
  extends StObject
     with Accessor
     with Evented {
  
  /**
    * A utility method used for building the value for a widget's `class` property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#classes)
    */
  def classes(classNames: (String | js.Array[String] | js.Any)*): String = js.native
  
  /**
    * The ID or node representing the DOM element containing the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#container)
    */
  var container: String | HTMLElement = js.native
  
  /**
    * The unique ID assigned to the widget when the widget is created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#id)
    */
  var id: String = js.native
  
  /**
    * The widget's label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#label)
    */
  var label: String = js.native
  
  def own(handles: js.Array[WatchHandle]): Unit = js.native
  /**
    * Widget teardown helper.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#own)
    */
  def own(handles: WatchHandle): Unit = js.native
  
  /**
    * *This method is primarily used by developers when implementing custom widgets.* Executes after widget is ready for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#postInitialize)
    */
  def postInitialize(): Unit = js.native
  
  /**
    * *This method is primarily used by developers when implementing custom widgets.* It must be implemented by subclasses for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#render)
    */
  def render(): js.Any = js.native
  
  /**
    * Renders widget to the DOM immediately.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#renderNow)
    */
  def renderNow(): Unit = js.native
  
  /**
    * *This method is primarily used by developers when implementing custom widgets.* Schedules widget rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#scheduleRender)
    */
  def scheduleRender(): Unit = js.native
}
