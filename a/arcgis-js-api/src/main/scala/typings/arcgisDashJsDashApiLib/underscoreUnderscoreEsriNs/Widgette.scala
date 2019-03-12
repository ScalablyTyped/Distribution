package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Widgette extends js.Object {
  /**
    * The ID or node representing the DOM element containing the widget.  Note that once set, this property cannot be modified afterwards.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widgette.html#container)
    */
  var container: java.lang.String | stdLib.HTMLElement
  /**
    * Indicates whether the widget is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widgette.html#visible)
    *
    * @default true
    */
  var visible: scala.Boolean
  /**
    * Destroys the widget instance. Call this method when the widget is no longer needed by the application.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widgette.html#destroy)
    *
    *
    */
  def destroy(): scala.Unit
  /**
    * Registers an event handler on the widget instance. Call this method to hook an event with a listener. See the [Events summary table](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widgette.html#events-summary) for a list of supported events.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widgette.html#on)
    *
    * @param type The name of the event.
    * @param listener The function to call when the event is fired.
    *
    */
  def on(`type`: java.lang.String, listener: js.Function): js.Any
}

object Widgette {
  @scala.inline
  def apply(
    container: java.lang.String | stdLib.HTMLElement,
    destroy: () => scala.Unit,
    on: (java.lang.String, js.Function) => js.Any,
    visible: scala.Boolean
  ): Widgette = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), on = js.Any.fromFunction2(on), visible = visible)
  
    __obj.asInstanceOf[Widgette]
  }
}

