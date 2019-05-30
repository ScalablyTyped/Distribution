package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowExecution extends js.Object {
  /**
    * The time the execution finished.
    */
  var EndTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The time the execution started.
    */
  var StartTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The status of the execution.
    */
  var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined
  /**
    * The details explaining the Status. Only available for certain status values.
    */
  var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined
  /**
    * The ID of the maintenance window execution.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
  /**
    * The ID of the maintenance window.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
}

object MaintenanceWindowExecution {
  @scala.inline
  def apply(
    EndTime: DateTime = null,
    StartTime: DateTime = null,
    Status: MaintenanceWindowExecutionStatus = null,
    StatusDetails: MaintenanceWindowExecutionStatusDetails = null,
    WindowExecutionId: MaintenanceWindowExecutionId = null,
    WindowId: MaintenanceWindowId = null
  ): MaintenanceWindowExecution = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusDetails != null) __obj.updateDynamic("StatusDetails")(StatusDetails)
    if (WindowExecutionId != null) __obj.updateDynamic("WindowExecutionId")(WindowExecutionId)
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId)
    __obj.asInstanceOf[MaintenanceWindowExecution]
  }
}

