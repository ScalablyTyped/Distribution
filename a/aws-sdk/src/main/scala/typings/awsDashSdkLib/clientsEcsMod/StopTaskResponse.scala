package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopTaskResponse extends js.Object {
  /**
    * The task that was stopped.
    */
  var task: js.UndefOr[Task] = js.undefined
}

object StopTaskResponse {
  @scala.inline
  def apply(task: Task = null): StopTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (task != null) __obj.updateDynamic("task")(task)
    __obj.asInstanceOf[StopTaskResponse]
  }
}

