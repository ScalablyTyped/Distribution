package typings.aureliaTemplating.mod

import typings.std.AddEventListenerOptions
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "ElementEvents")
@js.native
class ElementEvents protected () extends js.Object {
  def this(element: EventTarget) = this()
  /**
    * Removes all events that are listening to the specified eventName.
    * @param eventName
    */
  def dispose(eventName: String): Unit = js.native
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
  def publish(eventName: String): js.Any = js.native
  def publish(eventName: String, detail: js.Object): js.Any = js.native
  def publish(eventName: String, detail: js.Object, bubbles: Boolean): js.Any = js.native
  def publish(eventName: String, detail: js.Object, bubbles: Boolean, cancelable: Boolean): js.Any = js.native
  /**
    * Adds and Event Listener on the context element.
    * @return Returns the eventHandler containing a dispose method
    */
  def subscribe(eventName: String, handler: js.Function): EventHandler = js.native
  def subscribe(eventName: String, handler: js.Function, captureOrOptions: Boolean): EventHandler = js.native
  def subscribe(eventName: String, handler: js.Function, captureOrOptions: AddEventListenerOptions): EventHandler = js.native
  /**
    * Adds an Event Listener on the context element, that will be disposed on the first trigger.
    * @return Returns the eventHandler containing a dispose method
    */
  def subscribeOnce(eventName: String, handler: js.Function): EventHandler = js.native
  def subscribeOnce(eventName: String, handler: js.Function, captureOrOptions: Boolean): EventHandler = js.native
  def subscribeOnce(eventName: String, handler: js.Function, captureOrOptions: AddEventListenerOptions): EventHandler = js.native
}

/* static members */
@JSImport("aurelia-templating", "ElementEvents")
@js.native
object ElementEvents extends js.Object {
  var defaultListenerOptions: Boolean | AddEventListenerOptions = js.native
}

