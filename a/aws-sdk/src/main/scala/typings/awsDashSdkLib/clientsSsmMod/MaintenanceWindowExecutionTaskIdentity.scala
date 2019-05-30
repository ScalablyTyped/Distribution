package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowExecutionTaskIdentity extends js.Object {
  /**
    * The time the task execution finished.
    */
  var EndTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The time the task execution started.
    */
  var StartTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The status of the task execution.
    */
  var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined
  /**
    * The details explaining the status of the task execution. Only available for certain status values.
    */
  var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined
  /**
    * The ARN of the task that ran.
    */
  var TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined
  /**
    * The ID of the specific task execution in the maintenance window execution.
    */
  var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined
  /**
    * The type of task that ran.
    */
  var TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.undefined
  /**
    * The ID of the maintenance window execution that ran the task.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
}

object MaintenanceWindowExecutionTaskIdentity {
  @scala.inline
  def apply(
    EndTime: DateTime = null,
    StartTime: DateTime = null,
    Status: MaintenanceWindowExecutionStatus = null,
    StatusDetails: MaintenanceWindowExecutionStatusDetails = null,
    TaskArn: MaintenanceWindowTaskArn = null,
    TaskExecutionId: MaintenanceWindowExecutionTaskId = null,
    TaskType: MaintenanceWindowTaskType = null,
    WindowExecutionId: MaintenanceWindowExecutionId = null
  ): MaintenanceWindowExecutionTaskIdentity = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusDetails != null) __obj.updateDynamic("StatusDetails")(StatusDetails)
    if (TaskArn != null) __obj.updateDynamic("TaskArn")(TaskArn)
    if (TaskExecutionId != null) __obj.updateDynamic("TaskExecutionId")(TaskExecutionId)
    if (TaskType != null) __obj.updateDynamic("TaskType")(TaskType.asInstanceOf[js.Any])
    if (WindowExecutionId != null) __obj.updateDynamic("WindowExecutionId")(WindowExecutionId)
    __obj.asInstanceOf[MaintenanceWindowExecutionTaskIdentity]
  }
}

