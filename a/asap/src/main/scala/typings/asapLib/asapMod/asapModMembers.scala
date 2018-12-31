package typings
package asapLib.asapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asap", JSImport.Namespace)
@js.native
object asapModMembers extends js.Object {
  /**
    * Executes a task as soon as possible.
    * @param task Function or any object that implements `call()`.
    */
  def apply(task: Task): scala.Unit = js.native
}

