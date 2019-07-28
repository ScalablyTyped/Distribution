package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMaintenanceWindowTaskResult extends js.Object {
  /**
    * The updated task description.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
  /**
    * The updated logging information in Amazon S3.   LoggingInfo has been deprecated. To specify an S3 bucket to contain logs, instead use the OutputS3BucketName and OutputS3KeyPrefix options in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var LoggingInfo: js.UndefOr[typings.awsDashSdk.clientsSsmMod.LoggingInfo] = js.undefined
  /**
    * The updated MaxConcurrency value.
    */
  var MaxConcurrency: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxConcurrency] = js.undefined
  /**
    * The updated MaxErrors value.
    */
  var MaxErrors: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxErrors] = js.undefined
  /**
    * The updated task name.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  /**
    * The updated priority value.
    */
  var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined
  /**
    * The ARN of the IAM service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications for maintenance window Run Command tasks.
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined
  /**
    * The updated target values.
    */
  var Targets: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Targets] = js.undefined
  /**
    * The updated task ARN value.
    */
  var TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined
  /**
    * The updated parameter values.
    */
  var TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters] = js.undefined
  /**
    * The updated parameter values.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined
  /**
    * The ID of the maintenance window that was updated.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
  /**
    * The task ID of the maintenance window that was updated.
    */
  var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
}

object UpdateMaintenanceWindowTaskResult {
  @scala.inline
  def apply(
    Description: MaintenanceWindowDescription = null,
    LoggingInfo: LoggingInfo = null,
    MaxConcurrency: MaxConcurrency = null,
    MaxErrors: MaxErrors = null,
    Name: MaintenanceWindowName = null,
    Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined,
    ServiceRoleArn: ServiceRole = null,
    Targets: Targets = null,
    TaskArn: MaintenanceWindowTaskArn = null,
    TaskInvocationParameters: MaintenanceWindowTaskInvocationParameters = null,
    TaskParameters: MaintenanceWindowTaskParameters = null,
    WindowId: MaintenanceWindowId = null,
    WindowTaskId: MaintenanceWindowTaskId = null
  ): UpdateMaintenanceWindowTaskResult = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (LoggingInfo != null) __obj.updateDynamic("LoggingInfo")(LoggingInfo)
    if (MaxConcurrency != null) __obj.updateDynamic("MaxConcurrency")(MaxConcurrency)
    if (MaxErrors != null) __obj.updateDynamic("MaxErrors")(MaxErrors)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (!js.isUndefined(Priority)) __obj.updateDynamic("Priority")(Priority)
    if (ServiceRoleArn != null) __obj.updateDynamic("ServiceRoleArn")(ServiceRoleArn)
    if (Targets != null) __obj.updateDynamic("Targets")(Targets)
    if (TaskArn != null) __obj.updateDynamic("TaskArn")(TaskArn)
    if (TaskInvocationParameters != null) __obj.updateDynamic("TaskInvocationParameters")(TaskInvocationParameters)
    if (TaskParameters != null) __obj.updateDynamic("TaskParameters")(TaskParameters)
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId)
    if (WindowTaskId != null) __obj.updateDynamic("WindowTaskId")(WindowTaskId)
    __obj.asInstanceOf[UpdateMaintenanceWindowTaskResult]
  }
}

