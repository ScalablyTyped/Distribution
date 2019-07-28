package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskListEntry extends js.Object {
  /**
    * The name of the task.
    */
  var Name: js.UndefOr[TagValue] = js.undefined
  /**
    * The status of the task.
    */
  var Status: js.UndefOr[TaskStatus] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the task.
    */
  var TaskArn: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.TaskArn] = js.undefined
}

object TaskListEntry {
  @scala.inline
  def apply(Name: TagValue = null, Status: TaskStatus = null, TaskArn: TaskArn = null): TaskListEntry = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TaskArn != null) __obj.updateDynamic("TaskArn")(TaskArn)
    __obj.asInstanceOf[TaskListEntry]
  }
}

