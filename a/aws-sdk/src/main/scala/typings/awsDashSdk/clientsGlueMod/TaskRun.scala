package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskRun extends js.Object {
  /**
    * The last point in time that the requested task run was completed.
    */
  var CompletedOn: js.UndefOr[Timestamp] = js.native
  /**
    * The list of error strings associated with this task run.
    */
  var ErrorString: js.UndefOr[GenericString] = js.native
  /**
    * The amount of time (in seconds) that the task run consumed resources.
    */
  var ExecutionTime: js.UndefOr[typings.awsDashSdk.clientsGlueMod.ExecutionTime] = js.native
  /**
    * The last point in time that the requested task run was updated.
    */
  var LastModifiedOn: js.UndefOr[Timestamp] = js.native
  /**
    * The names of the log group for secure logging, associated with this task run.
    */
  var LogGroupName: js.UndefOr[GenericString] = js.native
  /**
    * Specifies configuration properties associated with this task run.
    */
  var Properties: js.UndefOr[TaskRunProperties] = js.native
  /**
    * The date and time that this task run started.
    */
  var StartedOn: js.UndefOr[Timestamp] = js.native
  /**
    * The current status of the requested task run.
    */
  var Status: js.UndefOr[TaskStatusType] = js.native
  /**
    * The unique identifier for this task run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.native
  /**
    * The unique identifier for the transform.
    */
  var TransformId: js.UndefOr[HashString] = js.native
}

object TaskRun {
  @scala.inline
  def apply(
    CompletedOn: Timestamp = null,
    ErrorString: GenericString = null,
    ExecutionTime: Int | Double = null,
    LastModifiedOn: Timestamp = null,
    LogGroupName: GenericString = null,
    Properties: TaskRunProperties = null,
    StartedOn: Timestamp = null,
    Status: TaskStatusType = null,
    TaskRunId: HashString = null,
    TransformId: HashString = null
  ): TaskRun = {
    val __obj = js.Dynamic.literal()
    if (CompletedOn != null) __obj.updateDynamic("CompletedOn")(CompletedOn.asInstanceOf[js.Any])
    if (ErrorString != null) __obj.updateDynamic("ErrorString")(ErrorString.asInstanceOf[js.Any])
    if (ExecutionTime != null) __obj.updateDynamic("ExecutionTime")(ExecutionTime.asInstanceOf[js.Any])
    if (LastModifiedOn != null) __obj.updateDynamic("LastModifiedOn")(LastModifiedOn.asInstanceOf[js.Any])
    if (LogGroupName != null) __obj.updateDynamic("LogGroupName")(LogGroupName.asInstanceOf[js.Any])
    if (Properties != null) __obj.updateDynamic("Properties")(Properties.asInstanceOf[js.Any])
    if (StartedOn != null) __obj.updateDynamic("StartedOn")(StartedOn.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TaskRunId != null) __obj.updateDynamic("TaskRunId")(TaskRunId.asInstanceOf[js.Any])
    if (TransformId != null) __obj.updateDynamic("TransformId")(TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskRun]
  }
}

