package typings
package awsDashSdkLib.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskObject extends js.Object {
  /**
    * The ID of the pipeline task attempt object. AWS Data Pipeline uses this value to track how many times a task is attempted.
    */
  var attemptId: js.UndefOr[id] = js.undefined
  /**
    * Connection information for the location where the task runner will publish the output of the task.
    */
  var objects: js.UndefOr[PipelineObjectMap] = js.undefined
  /**
    * The ID of the pipeline that provided the task.
    */
  var pipelineId: js.UndefOr[id] = js.undefined
  /**
    * An internal identifier for the task. This ID is passed to the SetTaskStatus and ReportTaskProgress actions.
    */
  var taskId: js.UndefOr[taskId] = js.undefined
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
    if (attemptId != null) __obj.updateDynamic("attemptId")(attemptId)
    if (objects != null) __obj.updateDynamic("objects")(objects)
    if (pipelineId != null) __obj.updateDynamic("pipelineId")(pipelineId)
    if (taskId != null) __obj.updateDynamic("taskId")(taskId)
    __obj.asInstanceOf[TaskObject]
  }
}

