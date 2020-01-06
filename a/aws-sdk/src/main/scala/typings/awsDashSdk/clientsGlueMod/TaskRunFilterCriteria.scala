package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskRunFilterCriteria extends js.Object {
  /**
    * Filter on task runs started after this date.
    */
  var StartedAfter: js.UndefOr[Timestamp] = js.native
  /**
    * Filter on task runs started before this date.
    */
  var StartedBefore: js.UndefOr[Timestamp] = js.native
  /**
    * The current status of the task run.
    */
  var Status: js.UndefOr[TaskStatusType] = js.native
  /**
    * The type of task run.
    */
  var TaskRunType: js.UndefOr[TaskType] = js.native
}

object TaskRunFilterCriteria {
  @scala.inline
  def apply(
    StartedAfter: Timestamp = null,
    StartedBefore: Timestamp = null,
    Status: TaskStatusType = null,
    TaskRunType: TaskType = null
  ): TaskRunFilterCriteria = {
    val __obj = js.Dynamic.literal()
    if (StartedAfter != null) __obj.updateDynamic("StartedAfter")(StartedAfter.asInstanceOf[js.Any])
    if (StartedBefore != null) __obj.updateDynamic("StartedBefore")(StartedBefore.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TaskRunType != null) __obj.updateDynamic("TaskRunType")(TaskRunType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskRunFilterCriteria]
  }
}

