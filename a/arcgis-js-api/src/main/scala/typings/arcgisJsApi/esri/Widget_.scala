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
  def classes(classNames: (String | js.Array[String] | Any)*): String = js.native
  
  /**
  		 * The ID or node representing the DOM element containing the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#container)
  		 */
  var container: String | HTMLElement = js.native
  
  /**
  		 * Icon which represents the widget.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#icon)
  		 */
  var icon: String = js.native
  
  /**
  		 * The unique ID assigned to the widget when the widget is created.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#id)
  		 */
  var id: String = js.native
  
  /**
  		 * `isFulfilled()` may be used to verify if creating an instance of the class is fulfilled (either resolved or rejected).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#isFulfilled)
  		 */
  def isFulfilled(): Boolean = js.native
  
  /**
  		 * `isRejected()` may be used to verify if creating an instance of the class is rejected.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#isRejected)
  		 */
  def isRejected(): Boolean = js.native
  
  /**
  		 * `isResolved()` may be used to verify if creating an instance of the class is resolved.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#isResolved)
  		 */
  def isResolved(): Boolean = js.native
  
  /**
  		 * The widget's label.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#label)
  		 */
  var label: String = js.native
  
  /**
  		 * Adds one or more handles which are to be tied to the lifecycle of the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#own)
  		 */
  def own(handleOrHandles: WatchHandle): scala.Unit = js.native
  
  /**
  		 * *This method is primarily used by developers when implementing custom widgets.* Executes after widget is ready for rendering.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#postInitialize)
  		 */
  def postInitialize(): scala.Unit = js.native
  
  /**
  		 * *This method is primarily used by developers when implementing custom widgets.* It must be implemented by subclasses for rendering.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#render)
  		 */
  def render(): Any = js.native
  
  /**
  		 * Renders widget to the DOM immediately.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#renderNow)
  		 */
  def renderNow(): scala.Unit = js.native
  
  /**
  		 * *This method is primarily used by developers when implementing custom widgets.* Schedules widget rendering.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#scheduleRender)
  		 */
  def scheduleRender(): scala.Unit = js.native
  
  /**
  		 * Indicates whether the widget is visible.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#visible)
  		 */
  var visible: Boolean = js.native
  
  /**
  		 * `when()` may be leveraged once an instance of the class is created.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#when)
  		 */
  def when(): js.Promise[Any] = js.native
  def when(callback: js.Function): js.Promise[Any] = js.native
  def when(callback: js.Function, errback: js.Function): js.Promise[Any] = js.native
  def when(callback: scala.Unit, errback: js.Function): js.Promise[Any] = js.native
}
