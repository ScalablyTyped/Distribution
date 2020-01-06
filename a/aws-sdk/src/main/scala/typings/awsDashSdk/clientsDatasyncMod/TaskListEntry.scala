package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskListEntry extends js.Object {
  /**
    * The name of the task.
    */
  var Name: js.UndefOr[TagValue] = js.native
  /**
    * The status of the task.
    */
  var Status: js.UndefOr[TaskStatus] = js.native
  /**
    * The Amazon Resource Name (ARN) of the task.
    */
  var TaskArn: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.TaskArn] = js.native
}

object TaskListEntry {
  @scala.inline
  def apply(Name: TagValue = null, Status: TaskStatus = null, TaskArn: TaskArn = null): TaskListEntry = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TaskArn != null) __obj.updateDynamic("TaskArn")(TaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskListEntry]
  }
}

