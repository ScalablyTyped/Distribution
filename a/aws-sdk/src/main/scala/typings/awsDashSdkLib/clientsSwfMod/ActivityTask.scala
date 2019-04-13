package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityTask extends js.Object {
  /**
    * The unique ID of the task.
    */
  var activityId: ActivityId
  /**
    * The type of this activity task.
    */
  var activityType: ActivityType
  /**
    * The inputs provided when the activity task was scheduled. The form of the input is user defined and should be meaningful to the activity implementation.
    */
  var input: js.UndefOr[Data] = js.undefined
  /**
    * The ID of the ActivityTaskStarted event recorded in the history.
    */
  var startedEventId: EventId
  /**
    * The opaque string used as a handle on the task. This token is used by workers to communicate progress and response information back to the system about the task.
    */
  var taskToken: TaskToken
  /**
    * The workflow execution that started this activity task.
    */
  var workflowExecution: WorkflowExecution
}

object ActivityTask {
  @scala.inline
  def apply(
    activityId: ActivityId,
    activityType: ActivityType,
    startedEventId: EventId,
    taskToken: TaskToken,
    workflowExecution: WorkflowExecution,
    input: Data = null
  ): ActivityTask = {
    val __obj = js.Dynamic.literal(activityId = activityId, activityType = activityType, startedEventId = startedEventId, taskToken = taskToken, workflowExecution = workflowExecution)
    if (input != null) __obj.updateDynamic("input")(input)
    __obj.asInstanceOf[ActivityTask]
  }
}

