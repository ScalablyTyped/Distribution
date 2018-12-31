package typings
package activexDashHelpersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def hasRegisteredObjects(): scala.Boolean = js.native
  /** Unregister all handlers, all handlers on a specific object, all handlers for a specific object's events, or a specific handler */
  def off(): scala.Unit = js.native
  def off(obj: js.Any): scala.Unit = js.native
  def off(obj: js.Any, eventName: java.lang.String): scala.Unit = js.native
  def off(obj: js.Any, eventName: java.lang.String, handler: js.Function): scala.Unit = js.native
  /** Register an event handler with the passed-in object, for the specified event */
  def on[T](
    obj: T,
    eventName: java.lang.String,
    handler: js.ThisFunction1[/* this */ T, /* parameter */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  /** Register an event handler with the passed-in object, for the specified event; 
    * specifying the parameters on the object passed into the handler */
  def on[T, K /* <: java.lang.String */](
    obj: T,
    eventName: java.lang.String,
    parameterNames: js.Array[K],
    handler: js.ThisFunction1[/* this */ T, /* parameter */ stdLib.Record[K, _], scala.Unit]
  ): scala.Unit = js.native
  /** Call a parameterized setter on a given object with the specified parameters and the new value */
  def set(obj: js.Any, propertyName: java.lang.String, parameters: js.Array[_], newValue: js.Any): scala.Unit = js.native
}

