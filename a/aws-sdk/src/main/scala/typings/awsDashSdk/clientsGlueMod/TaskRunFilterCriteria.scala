package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskRunFilterCriteria extends js.Object {
  /**
    * Filter on task runs started after this date.
    */
  var StartedAfter: js.UndefOr[Timestamp] = js.undefined
  /**
    * Filter on task runs started before this date.
    */
  var StartedBefore: js.UndefOr[Timestamp] = js.undefined
  /**
    * The current status of the task run.
    */
  var Status: js.UndefOr[TaskStatusType] = js.undefined
  /**
    * The type of task run.
    */
  var TaskRunType: js.UndefOr[TaskType] = js.undefined
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
    if (StartedAfter != null) __obj.updateDynamic("StartedAfter")(StartedAfter)
    if (StartedBefore != null) __obj.updateDynamic("StartedBefore")(StartedBefore)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TaskRunType != null) __obj.updateDynamic("TaskRunType")(TaskRunType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskRunFilterCriteria]
  }
}

