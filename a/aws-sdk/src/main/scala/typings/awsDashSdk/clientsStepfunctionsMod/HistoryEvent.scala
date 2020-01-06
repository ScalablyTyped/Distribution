package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryEvent extends js.Object {
  var activityFailedEventDetails: js.UndefOr[ActivityFailedEventDetails] = js.native
  /**
    * Contains details about an activity schedule event that failed during an execution.
    */
  var activityScheduleFailedEventDetails: js.UndefOr[ActivityScheduleFailedEventDetails] = js.native
  var activityScheduledEventDetails: js.UndefOr[ActivityScheduledEventDetails] = js.native
  var activityStartedEventDetails: js.UndefOr[ActivityStartedEventDetails] = js.native
  var activitySucceededEventDetails: js.UndefOr[ActivitySucceededEventDetails] = js.native
  var activityTimedOutEventDetails: js.UndefOr[ActivityTimedOutEventDetails] = js.native
  var executionAbortedEventDetails: js.UndefOr[ExecutionAbortedEventDetails] = js.native
  var executionFailedEventDetails: js.UndefOr[ExecutionFailedEventDetails] = js.native
  var executionStartedEventDetails: js.UndefOr[ExecutionStartedEventDetails] = js.native
  var executionSucceededEventDetails: js.UndefOr[ExecutionSucceededEventDetails] = js.native
  var executionTimedOutEventDetails: js.UndefOr[ExecutionTimedOutEventDetails] = js.native
  /**
    * The id of the event. Events are numbered sequentially, starting at one.
    */
  var id: EventId = js.native
  var lambdaFunctionFailedEventDetails: js.UndefOr[LambdaFunctionFailedEventDetails] = js.native
  var lambdaFunctionScheduleFailedEventDetails: js.UndefOr[LambdaFunctionScheduleFailedEventDetails] = js.native
  var lambdaFunctionScheduledEventDetails: js.UndefOr[LambdaFunctionScheduledEventDetails] = js.native
  /**
    * Contains details about a lambda function that failed to start during an execution.
    */
  var lambdaFunctionStartFailedEventDetails: js.UndefOr[LambdaFunctionStartFailedEventDetails] = js.native
  /**
    * Contains details about a lambda function that terminated successfully during an execution.
    */
  var lambdaFunctionSucceededEventDetails: js.UndefOr[LambdaFunctionSucceededEventDetails] = js.native
  var lambdaFunctionTimedOutEventDetails: js.UndefOr[LambdaFunctionTimedOutEventDetails] = js.native
  /**
    * Contains details about an iteration of a Map state that was aborted.
    */
  var mapIterationAbortedEventDetails: js.UndefOr[MapIterationEventDetails] = js.native
  /**
    * Contains details about an iteration of a Map state that failed.
    */
  var mapIterationFailedEventDetails: js.UndefOr[MapIterationEventDetails] = js.native
  /**
    * Contains details about an iteration of a Map state that was started.
    */
  var mapIterationStartedEventDetails: js.UndefOr[MapIterationEventDetails] = js.native
  /**
    * Contains details about an iteration of a Map state that succeeded.
    */
  var mapIterationSucceededEventDetails: js.UndefOr[MapIterationEventDetails] = js.native
  /**
    * Contains details about Map state that was started.
    */
  var mapStateStartedEventDetails: js.UndefOr[MapStateStartedEventDetails] = js.native
  /**
    * The id of the previous event.
    */
  var previousEventId: js.UndefOr[EventId] = js.native
  var stateEnteredEventDetails: js.UndefOr[StateEnteredEventDetails] = js.native
  var stateExitedEventDetails: js.UndefOr[StateExitedEventDetails] = js.native
  /**
    * Contains details about the failure of a task.
    */
  var taskFailedEventDetails: js.UndefOr[TaskFailedEventDetails] = js.native
  /**
    * Contains details about a task that was scheduled.
    */
  var taskScheduledEventDetails: js.UndefOr[TaskScheduledEventDetails] = js.native
  /**
    * Contains details about a task that failed to start.
    */
  var taskStartFailedEventDetails: js.UndefOr[TaskStartFailedEventDetails] = js.native
  /**
    * Contains details about a task that was started.
    */
  var taskStartedEventDetails: js.UndefOr[TaskStartedEventDetails] = js.native
  /**
    * Contains details about a task that where the submit failed.
    */
  var taskSubmitFailedEventDetails: js.UndefOr[TaskSubmitFailedEventDetails] = js.native
  /**
    * Contains details about a submitted task.
    */
  var taskSubmittedEventDetails: js.UndefOr[TaskSubmittedEventDetails] = js.native
  /**
    * Contains details about a task that succeeded.
    */
  var taskSucceededEventDetails: js.UndefOr[TaskSucceededEventDetails] = js.native
  /**
    * Contains details about a task that timed out.
    */
  var taskTimedOutEventDetails: js.UndefOr[TaskTimedOutEventDetails] = js.native
  /**
    * The date and time the event occurred.
    */
  var timestamp: Timestamp = js.native
  /**
    * The type of the event.
    */
  var `type`: HistoryEventType = js.native
}

object HistoryEvent {
  @scala.inline
  def apply(
    id: EventId,
    timestamp: Timestamp,
    `type`: HistoryEventType,
    activityFailedEventDetails: ActivityFailedEventDetails = null,
    activityScheduleFailedEventDetails: ActivityScheduleFailedEventDetails = null,
    activityScheduledEventDetails: ActivityScheduledEventDetails = null,
    activityStartedEventDetails: ActivityStartedEventDetails = null,
    activitySucceededEventDetails: ActivitySucceededEventDetails = null,
    activityTimedOutEventDetails: ActivityTimedOutEventDetails = null,
    executionAbortedEventDetails: ExecutionAbortedEventDetails = null,
    executionFailedEventDetails: ExecutionFailedEventDetails = null,
    executionStartedEventDetails: ExecutionStartedEventDetails = null,
    executionSucceededEventDetails: ExecutionSucceededEventDetails = null,
    executionTimedOutEventDetails: ExecutionTimedOutEventDetails = null,
    lambdaFunctionFailedEventDetails: LambdaFunctionFailedEventDetails = null,
    lambdaFunctionScheduleFailedEventDetails: LambdaFunctionScheduleFailedEventDetails = null,
    lambdaFunctionScheduledEventDetails: LambdaFunctionScheduledEventDetails = null,
    lambdaFunctionStartFailedEventDetails: LambdaFunctionStartFailedEventDetails = null,
    lambdaFunctionSucceededEventDetails: LambdaFunctionSucceededEventDetails = null,
    lambdaFunctionTimedOutEventDetails: LambdaFunctionTimedOutEventDetails = null,
    mapIterationAbortedEventDetails: MapIterationEventDetails = null,
    mapIterationFailedEventDetails: MapIterationEventDetails = null,
    mapIterationStartedEventDetails: MapIterationEventDetails = null,
    mapIterationSucceededEventDetails: MapIterationEventDetails = null,
    mapStateStartedEventDetails: MapStateStartedEventDetails = null,
    previousEventId: Int | Double = null,
    stateEnteredEventDetails: StateEnteredEventDetails = null,
    stateExitedEventDetails: StateExitedEventDetails = null,
    taskFailedEventDetails: TaskFailedEventDetails = null,
    taskScheduledEventDetails: TaskScheduledEventDetails = null,
    taskStartFailedEventDetails: TaskStartFailedEventDetails = null,
    taskStartedEventDetails: TaskStartedEventDetails = null,
    taskSubmitFailedEventDetails: TaskSubmitFailedEventDetails = null,
    taskSubmittedEventDetails: TaskSubmittedEventDetails = null,
    taskSucceededEventDetails: TaskSucceededEventDetails = null,
    taskTimedOutEventDetails: TaskTimedOutEventDetails = null
  ): HistoryEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (activityFailedEventDetails != null) __obj.updateDynamic("activityFailedEventDetails")(activityFailedEventDetails.asInstanceOf[js.Any])
    if (activityScheduleFailedEventDetails != null) __obj.updateDynamic("activityScheduleFailedEventDetails")(activityScheduleFailedEventDetails.asInstanceOf[js.Any])
    if (activityScheduledEventDetails != null) __obj.updateDynamic("activityScheduledEventDetails")(activityScheduledEventDetails.asInstanceOf[js.Any])
    if (activityStartedEventDetails != null) __obj.updateDynamic("activityStartedEventDetails")(activityStartedEventDetails.asInstanceOf[js.Any])
    if (activitySucceededEventDetails != null) __obj.updateDynamic("activitySucceededEventDetails")(activitySucceededEventDetails.asInstanceOf[js.Any])
    if (activityTimedOutEventDetails != null) __obj.updateDynamic("activityTimedOutEventDetails")(activityTimedOutEventDetails.asInstanceOf[js.Any])
    if (executionAbortedEventDetails != null) __obj.updateDynamic("executionAbortedEventDetails")(executionAbortedEventDetails.asInstanceOf[js.Any])
    if (executionFailedEventDetails != null) __obj.updateDynamic("executionFailedEventDetails")(executionFailedEventDetails.asInstanceOf[js.Any])
    if (executionStartedEventDetails != null) __obj.updateDynamic("executionStartedEventDetails")(executionStartedEventDetails.asInstanceOf[js.Any])
    if (executionSucceededEventDetails != null) __obj.updateDynamic("executionSucceededEventDetails")(executionSucceededEventDetails.asInstanceOf[js.Any])
    if (executionTimedOutEventDetails != null) __obj.updateDynamic("executionTimedOutEventDetails")(executionTimedOutEventDetails.asInstanceOf[js.Any])
    if (lambdaFunctionFailedEventDetails != null) __obj.updateDynamic("lambdaFunctionFailedEventDetails")(lambdaFunctionFailedEventDetails.asInstanceOf[js.Any])
    if (lambdaFunctionScheduleFailedEventDetails != null) __obj.updateDynamic("lambdaFunctionScheduleFailedEventDetails")(lambdaFunctionScheduleFailedEventDetails.asInstanceOf[js.Any])
    if (lambdaFunctionScheduledEventDetails != null) __obj.updateDynamic("lambdaFunctionScheduledEventDetails")(lambdaFunctionScheduledEventDetails.asInstanceOf[js.Any])
    if (lambdaFunctionStartFailedEventDetails != null) __obj.updateDynamic("lambdaFunctionStartFailedEventDetails")(lambdaFunctionStartFailedEventDetails.asInstanceOf[js.Any])
    if (lambdaFunctionSucceededEventDetails != null) __obj.updateDynamic("lambdaFunctionSucceededEventDetails")(lambdaFunctionSucceededEventDetails.asInstanceOf[js.Any])
    if (lambdaFunctionTimedOutEventDetails != null) __obj.updateDynamic("lambdaFunctionTimedOutEventDetails")(lambdaFunctionTimedOutEventDetails.asInstanceOf[js.Any])
    if (mapIterationAbortedEventDetails != null) __obj.updateDynamic("mapIterationAbortedEventDetails")(mapIterationAbortedEventDetails.asInstanceOf[js.Any])
    if (mapIterationFailedEventDetails != null) __obj.updateDynamic("mapIterationFailedEventDetails")(mapIterationFailedEventDetails.asInstanceOf[js.Any])
    if (mapIterationStartedEventDetails != null) __obj.updateDynamic("mapIterationStartedEventDetails")(mapIterationStartedEventDetails.asInstanceOf[js.Any])
    if (mapIterationSucceededEventDetails != null) __obj.updateDynamic("mapIterationSucceededEventDetails")(mapIterationSucceededEventDetails.asInstanceOf[js.Any])
    if (mapStateStartedEventDetails != null) __obj.updateDynamic("mapStateStartedEventDetails")(mapStateStartedEventDetails.asInstanceOf[js.Any])
    if (previousEventId != null) __obj.updateDynamic("previousEventId")(previousEventId.asInstanceOf[js.Any])
    if (stateEnteredEventDetails != null) __obj.updateDynamic("stateEnteredEventDetails")(stateEnteredEventDetails.asInstanceOf[js.Any])
    if (stateExitedEventDetails != null) __obj.updateDynamic("stateExitedEventDetails")(stateExitedEventDetails.asInstanceOf[js.Any])
    if (taskFailedEventDetails != null) __obj.updateDynamic("taskFailedEventDetails")(taskFailedEventDetails.asInstanceOf[js.Any])
    if (taskScheduledEventDetails != null) __obj.updateDynamic("taskScheduledEventDetails")(taskScheduledEventDetails.asInstanceOf[js.Any])
    if (taskStartFailedEventDetails != null) __obj.updateDynamic("taskStartFailedEventDetails")(taskStartFailedEventDetails.asInstanceOf[js.Any])
    if (taskStartedEventDetails != null) __obj.updateDynamic("taskStartedEventDetails")(taskStartedEventDetails.asInstanceOf[js.Any])
    if (taskSubmitFailedEventDetails != null) __obj.updateDynamic("taskSubmitFailedEventDetails")(taskSubmitFailedEventDetails.asInstanceOf[js.Any])
    if (taskSubmittedEventDetails != null) __obj.updateDynamic("taskSubmittedEventDetails")(taskSubmittedEventDetails.asInstanceOf[js.Any])
    if (taskSucceededEventDetails != null) __obj.updateDynamic("taskSucceededEventDetails")(taskSucceededEventDetails.asInstanceOf[js.Any])
    if (taskTimedOutEventDetails != null) __obj.updateDynamic("taskTimedOutEventDetails")(taskTimedOutEventDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryEvent]
  }
}

