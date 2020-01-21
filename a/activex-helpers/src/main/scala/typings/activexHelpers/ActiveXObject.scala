package typings.activexHelpers

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def hasRegisteredObjects(): Boolean = js.native
  /** Unregister all handlers, all handlers on a specific object, all handlers for a specific object's events, or a specific handler */
  def off(): Unit = js.native
  def off(obj: js.Any): Unit = js.native
  def off(obj: js.Any, eventName: String): Unit = js.native
  def off(obj: js.Any, eventName: String, handler: js.Function): Unit = js.native
  /** Register an event handler with the passed-in object, for the specified event */
  def on[T](
    obj: T,
    eventName: String,
    handler: js.ThisFunction1[/* this */ T, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  /** Register an event handler with the passed-in object, for the specified event; 
    * specifying the parameters on the object passed into the handler */
  def on[T, K /* <: String */](
    obj: T,
    eventName: String,
    parameterNames: js.Array[K],
    handler: js.ThisFunction1[/* this */ T, /* parameter */ Record[K, _], Unit]
  ): Unit = js.native
  /** Call a parameterized setter on a given object with the specified parameters and the new value */
  def set(obj: js.Any, propertyName: String, parameters: js.Array[_], newValue: js.Any): Unit = js.native
}

