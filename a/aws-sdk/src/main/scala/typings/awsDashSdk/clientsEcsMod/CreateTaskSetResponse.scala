package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTaskSetResponse extends js.Object {
  var taskSet: js.UndefOr[TaskSet] = js.native
}

object CreateTaskSetResponse {
  @scala.inline
  def apply(taskSet: TaskSet = null): CreateTaskSetResponse = {
    val __obj = js.Dynamic.literal()
    if (taskSet != null) __obj.updateDynamic("taskSet")(taskSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTaskSetResponse]
  }
}

