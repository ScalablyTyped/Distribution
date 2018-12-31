package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atom", "Task")
@js.native
class Task protected () extends js.Object {
  /** Creates a task. You should probably use .once */
  def this(taskPath: java.lang.String) = this()
  /** Cancel the running task and emit an event if it was canceled. */
  def cancel(): scala.Boolean = js.native
  /** Call a function when an event is emitted by the child process. */
  // tslint:disable-next-line:no-any
  def on(eventName: java.lang.String, callback: js.Function1[/* param */ js.Any, scala.Unit]): Disposable = js.native
  def send(): scala.Unit = js.native
  /**
    *  Send message to the task.
    *  Throws an error if this task has already been terminated or if sending a
    *  message to the child process fails.
    */
  // tslint:disable-next-line:no-any
  def send(message: java.lang.String): scala.Unit = js.native
  def send(message: js.Array[_]): scala.Unit = js.native
  def send(message: js.Object): scala.Unit = js.native
  def send(message: scala.Boolean): scala.Unit = js.native
  def send(message: scala.Double): scala.Unit = js.native
  // NOTE: this is actually the best we can do here with the REST parameter
  // for this appearing in the beginning of the parameter list, which isn't
  // aligned with the ES6 spec.
  /**
    *  Starts the task.
    *  Throws an error if this task has already been terminated or if sending a
    *  message to the child process fails.
    */
  // tslint:disable-next-line:no-any
  def start(args: js.Any*): scala.Unit = js.native
  /**
    *  Forcefully stop the running task.
    *  No more events are emitted once this method is called.
    */
  def terminate(): scala.Unit = js.native
}

@JSImport("atom", "Task")
@js.native
object Task extends js.Object {
  // NOTE: this is actually the best we can do here with the REST parameter for
  // this appearing in the middle of the parameter list, which isn't aligned with
  // the ES6 spec. Maybe when they rewrite it in JavaScript this will change.
  /** A helper method to easily launch and run a task once. */
  // tslint:disable-next-line:no-any
  def once(taskPath: java.lang.String, args: js.Any*): atomLib.atomMod.Task = js.native
}

