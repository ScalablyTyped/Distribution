package typings.asap.rawMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asap/raw", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Executes a task as soon as possible.
    * @param task Function or any object that implements `call()`.
    */
  def apply(task: Task): Unit = js.native
  /**
    * Flushes the event queue.
    */
  def requestFlush(): Unit = js.native
}

