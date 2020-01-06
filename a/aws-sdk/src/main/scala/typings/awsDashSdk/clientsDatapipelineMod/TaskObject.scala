package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskObject extends js.Object {
  /**
    * The ID of the pipeline task attempt object. AWS Data Pipeline uses this value to track how many times a task is attempted.
    */
  var attemptId: js.UndefOr[id] = js.native
  /**
    * Connection information for the location where the task runner will publish the output of the task.
    */
  var objects: js.UndefOr[PipelineObjectMap] = js.native
  /**
    * The ID of the pipeline that provided the task.
    */
  var pipelineId: js.UndefOr[id] = js.native
  /**
    * An internal identifier for the task. This ID is passed to the SetTaskStatus and ReportTaskProgress actions.
    */
  var taskId: js.UndefOr[typings.awsDashSdk.clientsDatapipelineMod.taskId] = js.native
}

object TaskObject {
  @scala.inline
  def apply(
    attemptId: id = null,
    objects: PipelineObjectMap = null,
    pipelineId: id = null,
    taskId: taskId = null
  ): TaskObject = {
    val __obj = js.Dynamic.literal()
    if (attemptId != null) __obj.updateDynamic("attemptId")(attemptId.asInstanceOf[js.Any])
    if (objects != null) __obj.updateDynamic("objects")(objects.asInstanceOf[js.Any])
    if (pipelineId != null) __obj.updateDynamic("pipelineId")(pipelineId.asInstanceOf[js.Any])
    if (taskId != null) __obj.updateDynamic("taskId")(taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskObject]
  }
}

