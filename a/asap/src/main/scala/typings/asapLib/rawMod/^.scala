package typings
package asapLib.rawMod

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
  def apply(task: Task): scala.Unit = js.native
  /**
    * Flushes the event queue.
    */
  def requestFlush(): scala.Unit = js.native
}

