package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskExecutionListEntry extends js.Object {
  /**
    * The status of a task execution.
    */
  var Status: js.UndefOr[TaskExecutionStatus] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the task that was executed.
    */
  var TaskExecutionArn: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.TaskExecutionArn] = js.undefined
}

object TaskExecutionListEntry {
  @scala.inline
  def apply(Status: TaskExecutionStatus = null, TaskExecutionArn: TaskExecutionArn = null): TaskExecutionListEntry = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TaskExecutionArn != null) __obj.updateDynamic("TaskExecutionArn")(TaskExecutionArn)
    __obj.asInstanceOf[TaskExecutionListEntry]
  }
}

