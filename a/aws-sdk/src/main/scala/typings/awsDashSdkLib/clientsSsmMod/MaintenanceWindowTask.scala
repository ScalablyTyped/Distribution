package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTask extends js.Object {
  /**
    * A description of the task.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
  /**
    * Information about an Amazon S3 bucket to write task-level logs to.   LoggingInfo has been deprecated. To specify an S3 bucket to contain logs, instead use the OutputS3BucketName and OutputS3KeyPrefix options in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined
  /**
    * The maximum number of targets this task can be run for, in parallel.
    */
  var MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined
  /**
    * The maximum number of errors allowed before this task stops being scheduled.
    */
  var MaxErrors: js.UndefOr[MaxErrors] = js.undefined
  /**
    * The task name.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  /**
    * The priority of the task in the Maintenance Window. The lower the number, the higher the priority. Tasks that have the same priority are scheduled in parallel.
    */
  var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined
  /**
    * The role that should be assumed when running the task.
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined
  /**
    * The targets (either instances or tags). Instances are specified using Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag name&gt;,Values=&lt;tag value&gt;.
    */
  var Targets: js.UndefOr[Targets] = js.undefined
  /**
    * The resource that the task uses during execution. For RUN_COMMAND and AUTOMATION task types, TaskArn is the Systems Manager document name or ARN. For LAMBDA tasks, it's the function name or ARN. For STEP_FUNCTION tasks, it's the state machine ARN.
    */
  var TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined
  /**
    * The parameters that should be passed to the task when it is run.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined
  /**
    * The type of task. The type can be one of the following: RUN_COMMAND, AUTOMATION, LAMBDA, or STEP_FUNCTION.
    */
  var Type: js.UndefOr[MaintenanceWindowTaskType] = js.undefined
  /**
    * The ID of the Maintenance Window where the task is registered.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
  /**
    * The task ID.
    */
  var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
}

object MaintenanceWindowTask {
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
    TaskParameters: MaintenanceWindowTaskParameters = null,
    Type: MaintenanceWindowTaskType = null,
    WindowId: MaintenanceWindowId = null,
    WindowTaskId: MaintenanceWindowTaskId = null
  ): MaintenanceWindowTask = {
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
    if (TaskParameters != null) __obj.updateDynamic("TaskParameters")(TaskParameters)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId)
    if (WindowTaskId != null) __obj.updateDynamic("WindowTaskId")(WindowTaskId)
    __obj.asInstanceOf[MaintenanceWindowTask]
  }
}

