package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryEvent extends js.Object {
  var activityFailedEventDetails: js.UndefOr[ActivityFailedEventDetails] = js.undefined
  /**
    * Contains details about an activity schedule event that failed during an execution.
    */
  var activityScheduleFailedEventDetails: js.UndefOr[ActivityScheduleFailedEventDetails] = js.undefined
  var activityScheduledEventDetails: js.UndefOr[ActivityScheduledEventDetails] = js.undefined
  var activityStartedEventDetails: js.UndefOr[ActivityStartedEventDetails] = js.undefined
  var activitySucceededEventDetails: js.UndefOr[ActivitySucceededEventDetails] = js.undefined
  var activityTimedOutEventDetails: js.UndefOr[ActivityTimedOutEventDetails] = js.undefined
  var executionAbortedEventDetails: js.UndefOr[ExecutionAbortedEventDetails] = js.undefined
  var executionFailedEventDetails: js.UndefOr[ExecutionFailedEventDetails] = js.undefined
  var executionStartedEventDetails: js.UndefOr[ExecutionStartedEventDetails] = js.undefined
  var executionSucceededEventDetails: js.UndefOr[ExecutionSucceededEventDetails] = js.undefined
  var executionTimedOutEventDetails: js.UndefOr[ExecutionTimedOutEventDetails] = js.undefined
  /**
    * The id of the event. Events are numbered sequentially, starting at one.
    */
  var id: EventId
  var lambdaFunctionFailedEventDetails: js.UndefOr[LambdaFunctionFailedEventDetails] = js.undefined
  var lambdaFunctionScheduleFailedEventDetails: js.UndefOr[LambdaFunctionScheduleFailedEventDetails] = js.undefined
  var lambdaFunctionScheduledEventDetails: js.UndefOr[LambdaFunctionScheduledEventDetails] = js.undefined
  /**
    * Contains details about a lambda function that failed to start during an execution.
    */
  var lambdaFunctionStartFailedEventDetails: js.UndefOr[LambdaFunctionStartFailedEventDetails] = js.undefined
  /**
    * Contains details about a lambda function that terminated successfully during an execution.
    */
  var lambdaFunctionSucceededEventDetails: js.UndefOr[LambdaFunctionSucceededEventDetails] = js.undefined
  var lambdaFunctionTimedOutEventDetails: js.UndefOr[LambdaFunctionTimedOutEventDetails] = js.undefined
  /**
    * Contains details about an iteration of a Map state that was aborted.
    */
  var mapIterationAbortedEventDetails: js.UndefOr[MapIterationEventDetails] = js.undefined
  /**
    * Contains details about an iteration of a Map state that failed.
    */
  var mapIterationFailedEventDetails: js.UndefOr[MapIterationEventDetails] = js.undefined
  /**
    * Contains details about an iteration of a Map state that was started.
    */
  var mapIterationStartedEventDetails: js.UndefOr[MapIterationEventDetails] = js.undefined
  /**
    * Contains details about an iteration of a Map state that succeeded.
    */
  var mapIterationSucceededEventDetails: js.UndefOr[MapIterationEventDetails] = js.undefined
  /**
    * Contains details about Map state that was started.
    */
  var mapStateStartedEventDetails: js.UndefOr[MapStateStartedEventDetails] = js.undefined
  /**
    * The id of the previous event.
    */
  var previousEventId: js.UndefOr[EventId] = js.undefined
  var stateEnteredEventDetails: js.UndefOr[StateEnteredEventDetails] = js.undefined
  var stateExitedEventDetails: js.UndefOr[StateExitedEventDetails] = js.undefined
  /**
    * Contains details about the failure of a task.
    */
  var taskFailedEventDetails: js.UndefOr[TaskFailedEventDetails] = js.undefined
  /**
    * Contains details about a task that was scheduled.
    */
  var taskScheduledEventDetails: js.UndefOr[TaskScheduledEventDetails] = js.undefined
  /**
    * Contains details about a task that failed to start.
    */
  var taskStartFailedEventDetails: js.UndefOr[TaskStartFailedEventDetails] = js.undefined
  /**
    * Contains details about a task that was started.
    */
  var taskStartedEventDetails: js.UndefOr[TaskStartedEventDetails] = js.undefined
  /**
    * Contains details about a task that where the submit failed.
    */
  var taskSubmitFailedEventDetails: js.UndefOr[TaskSubmitFailedEventDetails] = js.undefined
  /**
    * Contains details about a submitted task.
    */
  var taskSubmittedEventDetails: js.UndefOr[TaskSubmittedEventDetails] = js.undefined
  /**
    * Contains details about a task that succeeded.
    */
  var taskSucceededEventDetails: js.UndefOr[TaskSucceededEventDetails] = js.undefined
  /**
    * Contains details about a task that timed out.
    */
  var taskTimedOutEventDetails: js.UndefOr[TaskTimedOutEventDetails] = js.undefined
  /**
    * The date and time the event occurred.
    */
  var timestamp: Timestamp
  /**
    * The type of the event.
    */
  var `type`: HistoryEventType
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
    val __obj = js.Dynamic.literal(id = id, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (activityFailedEventDetails != null) __obj.updateDynamic("activityFailedEventDetails")(activityFailedEventDetails)
    if (activityScheduleFailedEventDetails != null) __obj.updateDynamic("activityScheduleFailedEventDetails")(activityScheduleFailedEventDetails)
    if (activityScheduledEventDetails != null) __obj.updateDynamic("activityScheduledEventDetails")(activityScheduledEventDetails)
    if (activityStartedEventDetails != null) __obj.updateDynamic("activityStartedEventDetails")(activityStartedEventDetails)
    if (activitySucceededEventDetails != null) __obj.updateDynamic("activitySucceededEventDetails")(activitySucceededEventDetails)
    if (activityTimedOutEventDetails != null) __obj.updateDynamic("activityTimedOutEventDetails")(activityTimedOutEventDetails)
    if (executionAbortedEventDetails != null) __obj.updateDynamic("executionAbortedEventDetails")(executionAbortedEventDetails)
    if (executionFailedEventDetails != null) __obj.updateDynamic("executionFailedEventDetails")(executionFailedEventDetails)
    if (executionStartedEventDetails != null) __obj.updateDynamic("executionStartedEventDetails")(executionStartedEventDetails)
    if (executionSucceededEventDetails != null) __obj.updateDynamic("executionSucceededEventDetails")(executionSucceededEventDetails)
    if (executionTimedOutEventDetails != null) __obj.updateDynamic("executionTimedOutEventDetails")(executionTimedOutEventDetails)
    if (lambdaFunctionFailedEventDetails != null) __obj.updateDynamic("lambdaFunctionFailedEventDetails")(lambdaFunctionFailedEventDetails)
    if (lambdaFunctionScheduleFailedEventDetails != null) __obj.updateDynamic("lambdaFunctionScheduleFailedEventDetails")(lambdaFunctionScheduleFailedEventDetails)
    if (lambdaFunctionScheduledEventDetails != null) __obj.updateDynamic("lambdaFunctionScheduledEventDetails")(lambdaFunctionScheduledEventDetails)
    if (lambdaFunctionStartFailedEventDetails != null) __obj.updateDynamic("lambdaFunctionStartFailedEventDetails")(lambdaFunctionStartFailedEventDetails)
    if (lambdaFunctionSucceededEventDetails != null) __obj.updateDynamic("lambdaFunctionSucceededEventDetails")(lambdaFunctionSucceededEventDetails)
    if (lambdaFunctionTimedOutEventDetails != null) __obj.updateDynamic("lambdaFunctionTimedOutEventDetails")(lambdaFunctionTimedOutEventDetails)
    if (mapIterationAbortedEventDetails != null) __obj.updateDynamic("mapIterationAbortedEventDetails")(mapIterationAbortedEventDetails)
    if (mapIterationFailedEventDetails != null) __obj.updateDynamic("mapIterationFailedEventDetails")(mapIterationFailedEventDetails)
    if (mapIterationStartedEventDetails != null) __obj.updateDynamic("mapIterationStartedEventDetails")(mapIterationStartedEventDetails)
    if (mapIterationSucceededEventDetails != null) __obj.updateDynamic("mapIterationSucceededEventDetails")(mapIterationSucceededEventDetails)
    if (mapStateStartedEventDetails != null) __obj.updateDynamic("mapStateStartedEventDetails")(mapStateStartedEventDetails)
    if (previousEventId != null) __obj.updateDynamic("previousEventId")(previousEventId.asInstanceOf[js.Any])
    if (stateEnteredEventDetails != null) __obj.updateDynamic("stateEnteredEventDetails")(stateEnteredEventDetails)
    if (stateExitedEventDetails != null) __obj.updateDynamic("stateExitedEventDetails")(stateExitedEventDetails)
    if (taskFailedEventDetails != null) __obj.updateDynamic("taskFailedEventDetails")(taskFailedEventDetails)
    if (taskScheduledEventDetails != null) __obj.updateDynamic("taskScheduledEventDetails")(taskScheduledEventDetails)
    if (taskStartFailedEventDetails != null) __obj.updateDynamic("taskStartFailedEventDetails")(taskStartFailedEventDetails)
    if (taskStartedEventDetails != null) __obj.updateDynamic("taskStartedEventDetails")(taskStartedEventDetails)
    if (taskSubmitFailedEventDetails != null) __obj.updateDynamic("taskSubmitFailedEventDetails")(taskSubmitFailedEventDetails)
    if (taskSubmittedEventDetails != null) __obj.updateDynamic("taskSubmittedEventDetails")(taskSubmittedEventDetails)
    if (taskSucceededEventDetails != null) __obj.updateDynamic("taskSucceededEventDetails")(taskSucceededEventDetails)
    if (taskTimedOutEventDetails != null) __obj.updateDynamic("taskTimedOutEventDetails")(taskTimedOutEventDetails)
    __obj.asInstanceOf[HistoryEvent]
  }
}

