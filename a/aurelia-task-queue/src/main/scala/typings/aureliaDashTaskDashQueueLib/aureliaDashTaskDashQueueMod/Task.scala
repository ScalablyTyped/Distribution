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
  def apply(call: js.Function0[scala.Unit]): Task = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("call")(call)
    __obj.asInstanceOf[Task]
  }
}

