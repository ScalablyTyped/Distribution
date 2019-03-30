package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "ElementEvents")
@js.native
class ElementEvents protected () extends js.Object {
  def this(element: stdLib.EventTarget) = this()
  /**
    * Removes all events that are listening to the specified eventName.
    * @param eventName
    */
  def dispose(eventName: java.lang.String): scala.Unit = js.native
  /**
    * Removes all event handlers.
    */
  def disposeAll(): js.Any = js.native
  /**
    * Dispatches an Event on the context element.
    * @param eventName
    * @param detail
    * @param bubbles
    * @param cancelable
    */
  def publish(eventName: java.lang.String): js.Any = js.native
  def publish(eventName: java.lang.String, detail: js.Object): js.Any = js.native
  def publish(eventName: java.lang.String, detail: js.Object, bubbles: scala.Boolean): js.Any = js.native
  def publish(eventName: java.lang.String, detail: js.Object, bubbles: scala.Boolean, cancelable: scala.Boolean): js.Any = js.native
  /**
    * Adds and Event Listener on the context element.
    * @return Returns the eventHandler containing a dispose method
    */
  def subscribe(eventName: java.lang.String, handler: js.Function): EventHandler = js.native
  def subscribe(eventName: java.lang.String, handler: js.Function, captureOrOptions: scala.Boolean): EventHandler = js.native
  def subscribe(
    eventName: java.lang.String,
    handler: js.Function,
    captureOrOptions: stdLib.AddEventListenerOptions
  ): EventHandler = js.native
  /**
    * Adds an Event Listener on the context element, that will be disposed on the first trigger.
    * @return Returns the eventHandler containing a dispose method
    */
  def subscribeOnce(eventName: java.lang.String, handler: js.Function): EventHandler = js.native
  def subscribeOnce(eventName: java.lang.String, handler: js.Function, captureOrOptions: scala.Boolean): EventHandler = js.native
  def subscribeOnce(
    eventName: java.lang.String,
    handler: js.Function,
    captureOrOptions: stdLib.AddEventListenerOptions
  ): EventHandler = js.native
}

/* static members */
@JSImport("aurelia-templating", "ElementEvents")
@js.native
object ElementEvents extends js.Object {
  var defaultListenerOptions: scala.Boolean | stdLib.AddEventListenerOptions = js.native
}

