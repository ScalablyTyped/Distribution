package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityTask extends js.Object {
  /**
    * The unique ID of the task.
    */
  var activityId: ActivityId = js.native
  /**
    * The type of this activity task.
    */
  var activityType: ActivityType = js.native
  /**
    * The inputs provided when the activity task was scheduled. The form of the input is user defined and should be meaningful to the activity implementation.
    */
  var input: js.UndefOr[Data] = js.native
  /**
    * The ID of the ActivityTaskStarted event recorded in the history.
    */
  var startedEventId: EventId = js.native
  /**
    * The opaque string used as a handle on the task. This token is used by workers to communicate progress and response information back to the system about the task.
    */
  var taskToken: TaskToken = js.native
  /**
    * The workflow execution that started this activity task.
    */
  var workflowExecution: WorkflowExecution = js.native
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
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], activityType = activityType.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any], taskToken = taskToken.asInstanceOf[js.Any], workflowExecution = workflowExecution.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTask]
  }
}

