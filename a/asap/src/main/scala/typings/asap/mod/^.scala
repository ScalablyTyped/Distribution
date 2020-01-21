package typings.asap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asap", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Executes a task as soon as possible.
    * @param task Function or any object that implements `call()`.
    */
  def apply(task: Task): Unit = js.native
}

