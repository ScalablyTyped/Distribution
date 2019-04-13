package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMaintenanceWindowExecutionResult extends js.Object {
  /**
    * The time the Maintenance Window finished running.
    */
  var EndTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The time the Maintenance Window started running.
    */
  var StartTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The status of the Maintenance Window execution.
    */
  var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined
  /**
    * The details explaining the Status. Only available for certain status values.
    */
  var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined
  /**
    * The ID of the task executions from the Maintenance Window execution.
    */
  var TaskIds: js.UndefOr[MaintenanceWindowExecutionTaskIdList] = js.undefined
  /**
    * The ID of the Maintenance Window execution.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
}

object GetMaintenanceWindowExecutionResult {
  @scala.inline
  def apply(
    EndTime: DateTime = null,
    StartTime: DateTime = null,
    Status: MaintenanceWindowExecutionStatus = null,
    StatusDetails: MaintenanceWindowExecutionStatusDetails = null,
    TaskIds: MaintenanceWindowExecutionTaskIdList = null,
    WindowExecutionId: MaintenanceWindowExecutionId = null
  ): GetMaintenanceWindowExecutionResult = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusDetails != null) __obj.updateDynamic("StatusDetails")(StatusDetails)
    if (TaskIds != null) __obj.updateDynamic("TaskIds")(TaskIds)
    if (WindowExecutionId != null) __obj.updateDynamic("WindowExecutionId")(WindowExecutionId)
    __obj.asInstanceOf[GetMaintenanceWindowExecutionResult]
  }
}

