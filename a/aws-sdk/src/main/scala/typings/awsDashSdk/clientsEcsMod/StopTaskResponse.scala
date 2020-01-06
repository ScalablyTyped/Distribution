package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopTaskResponse extends js.Object {
  /**
    * The task that was stopped.
    */
  var task: js.UndefOr[Task] = js.native
}

object StopTaskResponse {
  @scala.inline
  def apply(task: Task = null): StopTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (task != null) __obj.updateDynamic("task")(task.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopTaskResponse]
  }
}

