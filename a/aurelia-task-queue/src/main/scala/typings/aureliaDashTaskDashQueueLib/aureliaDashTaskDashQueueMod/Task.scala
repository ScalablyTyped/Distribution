package typings
package aureliaDashTaskDashQueueLib.aureliaDashTaskDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  /**
    * Call it.
    */
  def call(): scala.Unit
}

object Task {
  @scala.inline
  def apply(call: () => scala.Unit): Task = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction0(call))
  
    __obj.asInstanceOf[Task]
  }
}

