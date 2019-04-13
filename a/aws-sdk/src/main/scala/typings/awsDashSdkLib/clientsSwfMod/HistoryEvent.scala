package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryEvent extends js.Object {
  /**
    * If the event is of type ActivityTaskcancelRequested then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskCancelRequestedEventAttributes: js.UndefOr[ActivityTaskCancelRequestedEventAttributes] = js.undefined
  /**
    * If the event is of type ActivityTaskCanceled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskCanceledEventAttributes: js.UndefOr[ActivityTaskCanceledEventAttributes] = js.undefined
  /**
    * If the event is of type ActivityTaskCompleted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskCompletedEventAttributes: js.UndefOr[ActivityTaskCompletedEventAttributes] = js.undefined
  /**
    * If the event is of type ActivityTaskFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskFailedEventAttributes: js.UndefOr[ActivityTaskFailedEventAttributes] = js.undefined
  /**
    * If the event is of type ActivityTaskScheduled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskScheduledEventAttributes: js.UndefOr[ActivityTaskScheduledEventAttributes] = js.undefined
  /**
    * If the event is of type ActivityTaskStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskStartedEventAttributes: js.UndefOr[ActivityTaskStartedEventAttributes] = js.undefined
  /**
    * If the event is of type ActivityTaskTimedOut then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskTimedOutEventAttributes: js.UndefOr[ActivityTaskTimedOutEventAttributes] = js.undefined
  /**
    * If the event is of type CancelTimerFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var cancelTimerFailedEventAttributes: js.UndefOr[CancelTimerFailedEventAttributes] = js.undefined
  /**
    * If the event is of type CancelWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var cancelWorkflowExecutionFailedEventAttributes: js.UndefOr[CancelWorkflowExecutionFailedEventAttributes] = js.undefined
  /**
    * If the event is of type ChildWorkflowExecutionCanceled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var childWorkflowExecutionCanceledEventAttributes: js.UndefOr[ChildWorkflowExecutionCanceledEventAttributes] = js.undefined
  /**
    * If the event is of type ChildWorkflowExecutionCompleted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var childWorkflowExecutionCompletedEventAttributes: js.UndefOr[ChildWorkflowExecutionCompletedEventAttributes] = js.undefined
  /**
    * If the event is of type ChildWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var childWorkflowExecutionFailedEventAttributes: js.UndefOr[ChildWorkflowExecutionFailedEventAttributes] = js.undefined
  /**
    * If the event is of type ChildWorkflowExecutionStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var childWorkflowExecutionStartedEventAttributes: js.UndefOr[ChildWorkflowExecutionStartedEventAttributes] = js.undefined
  /**
    * If the event is of type ChildWorkflowExecutionTerminated then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var childWorkflowExecutionTerminatedEventAttributes: js.UndefOr[ChildWorkflowExecutionTerminatedEventAttributes] = js.undefined
  /**
    * If the event is of type ChildWorkflowExecutionTimedOut then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var childWorkflowExecutionTimedOutEventAttributes: js.UndefOr[ChildWorkflowExecutionTimedOutEventAttributes] = js.undefined
  /**
    * If the event is of type CompleteWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var completeWorkflowExecutionFailedEventAttributes: js.UndefOr[CompleteWorkflowExecutionFailedEventAttributes] = js.undefined
  /**
    * If the event is of type ContinueAsNewWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var continueAsNewWorkflowExecutionFailedEventAttributes: js.UndefOr[ContinueAsNewWorkflowExecutionFailedEventAttributes] = js.undefined
  /**
    * If the event is of type DecisionTaskCompleted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var decisionTaskCompletedEventAttributes: js.UndefOr[DecisionTaskCompletedEventAttributes] = js.undefined
  /**
    * If the event is of type DecisionTaskScheduled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var decisionTaskScheduledEventAttributes: js.UndefOr[DecisionTaskScheduledEventAttributes] = js.undefined
  /**
    * If the event is of type DecisionTaskStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var decisionTaskStartedEventAttributes: js.UndefOr[DecisionTaskStartedEventAttributes] = js.undefined
  /**
    * If the event is of type DecisionTaskTimedOut then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var decisionTaskTimedOutEventAttributes: js.UndefOr[DecisionTaskTimedOutEventAttributes] = js.undefined
  /**
    * The system generated ID of the event. This ID uniquely identifies the event with in the workflow execution history.
    */
  var eventId: EventId
  /**
    * The date and time when the event occurred.
    */
  var eventTimestamp: Timestamp
  /**
    * The type of the history event.
    */
  var eventType: EventType
  /**
    * If the event is of type ExternalWorkflowExecutionCancelRequested then this member is set and provides detailed information about the event. It isn't set for other event types. 
    */
  var externalWorkflowExecutionCancelRequestedEventAttributes: js.UndefOr[ExternalWorkflowExecutionCancelRequestedEventAttributes] = js.undefined
  /**
    * If the event is of type ExternalWorkflowExecutionSignaled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var externalWorkflowExecutionSignaledEventAttributes: js.UndefOr[ExternalWorkflowExecutionSignaledEventAttributes] = js.undefined
  /**
    * If the event is of type FailWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var failWorkflowExecutionFailedEventAttributes: js.UndefOr[FailWorkflowExecutionFailedEventAttributes] = js.undefined
  /**
    * Provides the details of the LambdaFunctionCompleted event. It isn't set for other event types.
    */
  var lambdaFunctionCompletedEventAttributes: js.UndefOr[LambdaFunctionCompletedEventAttributes] = js.undefined
  /**
    * Provides the details of the LambdaFunctionFailed event. It isn't set for other event types.
    */
  var lambdaFunctionFailedEventAttributes: js.UndefOr[LambdaFunctionFailedEventAttributes] = js.undefined
  /**
    * Provides the details of the LambdaFunctionScheduled event. It isn't set for other event types.
    */
  var lambdaFunctionScheduledEventAttributes: js.UndefOr[LambdaFunctionScheduledEventAttributes] = js.undefined
  /**
    * Provides the details of the LambdaFunctionStarted event. It isn't set for other event types.
    */
  var lambdaFunctionStartedEventAttributes: js.UndefOr[LambdaFunctionStartedEventAttributes] = js.undefined
  /**
    * Provides the details of the LambdaFunctionTimedOut event. It isn't set for other event types.
    */
  var lambdaFunctionTimedOutEventAttributes: js.UndefOr[LambdaFunctionTimedOutEventAttributes] = js.undefined
  /**
    * If the event is of type MarkerRecorded then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var markerRecordedEventAttributes: js.UndefOr[MarkerRecordedEventAttributes] = js.undefined
  /**
    * If the event is of type DecisionTaskFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var recordMarkerFailedEventAttributes: js.UndefOr[RecordMarkerFailedEventAttributes] = js.undefined
  /**
    * If the event is of type RequestCancelActivityTaskFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var requestCancelActivityTaskFailedEventAttributes: js.UndefOr[RequestCancelActivityTaskFailedEventAttributes] = js.undefined
  /**
    * If the event is of type RequestCancelExternalWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var requestCancelExternalWorkflowExecutionFailedEventAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionFailedEventAttributes] = js.undefined
  /**
    * If the event is of type RequestCancelExternalWorkflowExecutionInitiated then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var requestCancelExternalWorkflowExecutionInitiatedEventAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionInitiatedEventAttributes] = js.undefined
  /**
    * If the event is of type ScheduleActivityTaskFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var scheduleActivityTaskFailedEventAttributes: js.UndefOr[ScheduleActivityTaskFailedEventAttributes] = js.undefined
  /**
    * Provides the details of the ScheduleLambdaFunctionFailed event. It isn't set for other event types.
    */
  var scheduleLambdaFunctionFailedEventAttributes: js.UndefOr[ScheduleLambdaFunctionFailedEventAttributes] = js.undefined
  /**
    * If the event is of type SignalExternalWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var signalExternalWorkflowExecutionFailedEventAttributes: js.UndefOr[SignalExternalWorkflowExecutionFailedEventAttributes] = js.undefined
  /**
    * If the event is of type SignalExternalWorkflowExecutionInitiated then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var signalExternalWorkflowExecutionInitiatedEventAttributes: js.UndefOr[SignalExternalWorkflowExecutionInitiatedEventAttributes] = js.undefined
  /**
    * If the event is of type StartChildWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var startChildWorkflowExecutionFailedEventAttributes: js.UndefOr[StartChildWorkflowExecutionFailedEventAttributes] = js.undefined
  /**
    * If the event is of type StartChildWorkflowExecutionInitiated then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var startChildWorkflowExecutionInitiatedEventAttributes: js.UndefOr[StartChildWorkflowExecutionInitiatedEventAttributes] = js.undefined
  /**
    * Provides the details of the StartLambdaFunctionFailed event. It isn't set for other event types.
    */
  var startLambdaFunctionFailedEventAttributes: js.UndefOr[StartLambdaFunctionFailedEventAttributes] = js.undefined
  /**
    * If the event is of type StartTimerFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var startTimerFailedEventAttributes: js.UndefOr[StartTimerFailedEventAttributes] = js.undefined
  /**
    * If the event is of type TimerCanceled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var timerCanceledEventAttributes: js.UndefOr[TimerCanceledEventAttributes] = js.undefined
  /**
    * If the event is of type TimerFired then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var timerFiredEventAttributes: js.UndefOr[TimerFiredEventAttributes] = js.undefined
  /**
    * If the event is of type TimerStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var timerStartedEventAttributes: js.UndefOr[TimerStartedEventAttributes] = js.undefined
  /**
    * If the event is of type WorkflowExecutionCancelRequested then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionCancelRequestedEventAttributes: js.UndefOr[WorkflowExecutionCancelRequestedEventAttributes] = js.undefined
  /**
    * If the event is of type WorkflowExecutionCanceled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionCanceledEventAttributes: js.UndefOr[WorkflowExecutionCanceledEventAttributes] = js.undefined
  /**
    * If the event is of type WorkflowExecutionCompleted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionCompletedEventAttributes: js.UndefOr[WorkflowExecutionCompletedEventAttributes] = js.undefined
  /**
    * If the event is of type WorkflowExecutionContinuedAsNew then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionContinuedAsNewEventAttributes: js.UndefOr[WorkflowExecutionContinuedAsNewEventAttributes] = js.undefined
  /**
    * If the event is of type WorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionFailedEventAttributes: js.UndefOr[WorkflowExecutionFailedEventAttributes] = js.undefined
  /**
    * If the event is of type WorkflowExecutionSignaled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionSignaledEventAttributes: js.UndefOr[WorkflowExecutionSignaledEventAttributes] = js.undefined
  /**
    * If the event is of type WorkflowExecutionStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionStartedEventAttributes: js.UndefOr[WorkflowExecutionStartedEventAttributes] = js.undefined
  /**
    * If the event is of type WorkflowExecutionTerminated then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionTerminatedEventAttributes: js.UndefOr[WorkflowExecutionTerminatedEventAttributes] = js.undefined
  /**
    * If the event is of type WorkflowExecutionTimedOut then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionTimedOutEventAttributes: js.UndefOr[WorkflowExecutionTimedOutEventAttributes] = js.undefined
}

object HistoryEvent {
  @scala.inline
  def apply(
    eventId: EventId,
    eventTimestamp: Timestamp,
    eventType: EventType,
    activityTaskCancelRequestedEventAttributes: ActivityTaskCancelRequestedEventAttributes = null,
    activityTaskCanceledEventAttributes: ActivityTaskCanceledEventAttributes = null,
    activityTaskCompletedEventAttributes: ActivityTaskCompletedEventAttributes = null,
    activityTaskFailedEventAttributes: ActivityTaskFailedEventAttributes = null,
    activityTaskScheduledEventAttributes: ActivityTaskScheduledEventAttributes = null,
    activityTaskStartedEventAttributes: ActivityTaskStartedEventAttributes = null,
    activityTaskTimedOutEventAttributes: ActivityTaskTimedOutEventAttributes = null,
    cancelTimerFailedEventAttributes: CancelTimerFailedEventAttributes = null,
    cancelWorkflowExecutionFailedEventAttributes: CancelWorkflowExecutionFailedEventAttributes = null,
    childWorkflowExecutionCanceledEventAttributes: ChildWorkflowExecutionCanceledEventAttributes = null,
    childWorkflowExecutionCompletedEventAttributes: ChildWorkflowExecutionCompletedEventAttributes = null,
    childWorkflowExecutionFailedEventAttributes: ChildWorkflowExecutionFailedEventAttributes = null,
    childWorkflowExecutionStartedEventAttributes: ChildWorkflowExecutionStartedEventAttributes = null,
    childWorkflowExecutionTerminatedEventAttributes: ChildWorkflowExecutionTerminatedEventAttributes = null,
    childWorkflowExecutionTimedOutEventAttributes: ChildWorkflowExecutionTimedOutEventAttributes = null,
    completeWorkflowExecutionFailedEventAttributes: CompleteWorkflowExecutionFailedEventAttributes = null,
    continueAsNewWorkflowExecutionFailedEventAttributes: ContinueAsNewWorkflowExecutionFailedEventAttributes = null,
    decisionTaskCompletedEventAttributes: DecisionTaskCompletedEventAttributes = null,
    decisionTaskScheduledEventAttributes: DecisionTaskScheduledEventAttributes = null,
    decisionTaskStartedEventAttributes: DecisionTaskStartedEventAttributes = null,
    decisionTaskTimedOutEventAttributes: DecisionTaskTimedOutEventAttributes = null,
    externalWorkflowExecutionCancelRequestedEventAttributes: ExternalWorkflowExecutionCancelRequestedEventAttributes = null,
    externalWorkflowExecutionSignaledEventAttributes: ExternalWorkflowExecutionSignaledEventAttributes = null,
    failWorkflowExecutionFailedEventAttributes: FailWorkflowExecutionFailedEventAttributes = null,
    lambdaFunctionCompletedEventAttributes: LambdaFunctionCompletedEventAttributes = null,
    lambdaFunctionFailedEventAttributes: LambdaFunctionFailedEventAttributes = null,
    lambdaFunctionScheduledEventAttributes: LambdaFunctionScheduledEventAttributes = null,
    lambdaFunctionStartedEventAttributes: LambdaFunctionStartedEventAttributes = null,
    lambdaFunctionTimedOutEventAttributes: LambdaFunctionTimedOutEventAttributes = null,
    markerRecordedEventAttributes: MarkerRecordedEventAttributes = null,
    recordMarkerFailedEventAttributes: RecordMarkerFailedEventAttributes = null,
    requestCancelActivityTaskFailedEventAttributes: RequestCancelActivityTaskFailedEventAttributes = null,
    requestCancelExternalWorkflowExecutionFailedEventAttributes: RequestCancelExternalWorkflowExecutionFailedEventAttributes = null,
    requestCancelExternalWorkflowExecutionInitiatedEventAttributes: RequestCancelExternalWorkflowExecutionInitiatedEventAttributes = null,
    scheduleActivityTaskFailedEventAttributes: ScheduleActivityTaskFailedEventAttributes = null,
    scheduleLambdaFunctionFailedEventAttributes: ScheduleLambdaFunctionFailedEventAttributes = null,
    signalExternalWorkflowExecutionFailedEventAttributes: SignalExternalWorkflowExecutionFailedEventAttributes = null,
    signalExternalWorkflowExecutionInitiatedEventAttributes: SignalExternalWorkflowExecutionInitiatedEventAttributes = null,
    startChildWorkflowExecutionFailedEventAttributes: StartChildWorkflowExecutionFailedEventAttributes = null,
    startChildWorkflowExecutionInitiatedEventAttributes: StartChildWorkflowExecutionInitiatedEventAttributes = null,
    startLambdaFunctionFailedEventAttributes: StartLambdaFunctionFailedEventAttributes = null,
    startTimerFailedEventAttributes: StartTimerFailedEventAttributes = null,
    timerCanceledEventAttributes: TimerCanceledEventAttributes = null,
    timerFiredEventAttributes: TimerFiredEventAttributes = null,
    timerStartedEventAttributes: TimerStartedEventAttributes = null,
    workflowExecutionCancelRequestedEventAttributes: WorkflowExecutionCancelRequestedEventAttributes = null,
    workflowExecutionCanceledEventAttributes: WorkflowExecutionCanceledEventAttributes = null,
    workflowExecutionCompletedEventAttributes: WorkflowExecutionCompletedEventAttributes = null,
    workflowExecutionContinuedAsNewEventAttributes: WorkflowExecutionContinuedAsNewEventAttributes = null,
    workflowExecutionFailedEventAttributes: WorkflowExecutionFailedEventAttributes = null,
    workflowExecutionSignaledEventAttributes: WorkflowExecutionSignaledEventAttributes = null,
    workflowExecutionStartedEventAttributes: WorkflowExecutionStartedEventAttributes = null,
    workflowExecutionTerminatedEventAttributes: WorkflowExecutionTerminatedEventAttributes = null,
    workflowExecutionTimedOutEventAttributes: WorkflowExecutionTimedOutEventAttributes = null
  ): HistoryEvent = {
    val __obj = js.Dynamic.literal(eventId = eventId, eventTimestamp = eventTimestamp, eventType = eventType.asInstanceOf[js.Any])
    if (activityTaskCancelRequestedEventAttributes != null) __obj.updateDynamic("activityTaskCancelRequestedEventAttributes")(activityTaskCancelRequestedEventAttributes)
    if (activityTaskCanceledEventAttributes != null) __obj.updateDynamic("activityTaskCanceledEventAttributes")(activityTaskCanceledEventAttributes)
    if (activityTaskCompletedEventAttributes != null) __obj.updateDynamic("activityTaskCompletedEventAttributes")(activityTaskCompletedEventAttributes)
    if (activityTaskFailedEventAttributes != null) __obj.updateDynamic("activityTaskFailedEventAttributes")(activityTaskFailedEventAttributes)
    if (activityTaskScheduledEventAttributes != null) __obj.updateDynamic("activityTaskScheduledEventAttributes")(activityTaskScheduledEventAttributes)
    if (activityTaskStartedEventAttributes != null) __obj.updateDynamic("activityTaskStartedEventAttributes")(activityTaskStartedEventAttributes)
    if (activityTaskTimedOutEventAttributes != null) __obj.updateDynamic("activityTaskTimedOutEventAttributes")(activityTaskTimedOutEventAttributes)
    if (cancelTimerFailedEventAttributes != null) __obj.updateDynamic("cancelTimerFailedEventAttributes")(cancelTimerFailedEventAttributes)
    if (cancelWorkflowExecutionFailedEventAttributes != null) __obj.updateDynamic("cancelWorkflowExecutionFailedEventAttributes")(cancelWorkflowExecutionFailedEventAttributes)
    if (childWorkflowExecutionCanceledEventAttributes != null) __obj.updateDynamic("childWorkflowExecutionCanceledEventAttributes")(childWorkflowExecutionCanceledEventAttributes)
    if (childWorkflowExecutionCompletedEventAttributes != null) __obj.updateDynamic("childWorkflowExecutionCompletedEventAttributes")(childWorkflowExecutionCompletedEventAttributes)
    if (childWorkflowExecutionFailedEventAttributes != null) __obj.updateDynamic("childWorkflowExecutionFailedEventAttributes")(childWorkflowExecutionFailedEventAttributes)
    if (childWorkflowExecutionStartedEventAttributes != null) __obj.updateDynamic("childWorkflowExecutionStartedEventAttributes")(childWorkflowExecutionStartedEventAttributes)
    if (childWorkflowExecutionTerminatedEventAttributes != null) __obj.updateDynamic("childWorkflowExecutionTerminatedEventAttributes")(childWorkflowExecutionTerminatedEventAttributes)
    if (childWorkflowExecutionTimedOutEventAttributes != null) __obj.updateDynamic("childWorkflowExecutionTimedOutEventAttributes")(childWorkflowExecutionTimedOutEventAttributes)
    if (completeWorkflowExecutionFailedEventAttributes != null) __obj.updateDynamic("completeWorkflowExecutionFailedEventAttributes")(completeWorkflowExecutionFailedEventAttributes)
    if (continueAsNewWorkflowExecutionFailedEventAttributes != null) __obj.updateDynamic("continueAsNewWorkflowExecutionFailedEventAttributes")(continueAsNewWorkflowExecutionFailedEventAttributes)
    if (decisionTaskCompletedEventAttributes != null) __obj.updateDynamic("decisionTaskCompletedEventAttributes")(decisionTaskCompletedEventAttributes)
    if (decisionTaskScheduledEventAttributes != null) __obj.updateDynamic("decisionTaskScheduledEventAttributes")(decisionTaskScheduledEventAttributes)
    if (decisionTaskStartedEventAttributes != null) __obj.updateDynamic("decisionTaskStartedEventAttributes")(decisionTaskStartedEventAttributes)
    if (decisionTaskTimedOutEventAttributes != null) __obj.updateDynamic("decisionTaskTimedOutEventAttributes")(decisionTaskTimedOutEventAttributes)
    if (externalWorkflowExecutionCancelRequestedEventAttributes != null) __obj.updateDynamic("externalWorkflowExecutionCancelRequestedEventAttributes")(externalWorkflowExecutionCancelRequestedEventAttributes)
    if (externalWorkflowExecutionSignaledEventAttributes != null) __obj.updateDynamic("externalWorkflowExecutionSignaledEventAttributes")(externalWorkflowExecutionSignaledEventAttributes)
    if (failWorkflowExecutionFailedEventAttributes != null) __obj.updateDynamic("failWorkflowExecutionFailedEventAttributes")(failWorkflowExecutionFailedEventAttributes)
    if (lambdaFunctionCompletedEventAttributes != null) __obj.updateDynamic("lambdaFunctionCompletedEventAttributes")(lambdaFunctionCompletedEventAttributes)
    if (lambdaFunctionFailedEventAttributes != null) __obj.updateDynamic("lambdaFunctionFailedEventAttributes")(lambdaFunctionFailedEventAttributes)
    if (lambdaFunctionScheduledEventAttributes != null) __obj.updateDynamic("lambdaFunctionScheduledEventAttributes")(lambdaFunctionScheduledEventAttributes)
    if (lambdaFunctionStartedEventAttributes != null) __obj.updateDynamic("lambdaFunctionStartedEventAttributes")(lambdaFunctionStartedEventAttributes)
    if (lambdaFunctionTimedOutEventAttributes != null) __obj.updateDynamic("lambdaFunctionTimedOutEventAttributes")(lambdaFunctionTimedOutEventAttributes)
    if (markerRecordedEventAttributes != null) __obj.updateDynamic("markerRecordedEventAttributes")(markerRecordedEventAttributes)
    if (recordMarkerFailedEventAttributes != null) __obj.updateDynamic("recordMarkerFailedEventAttributes")(recordMarkerFailedEventAttributes)
    if (requestCancelActivityTaskFailedEventAttributes != null) __obj.updateDynamic("requestCancelActivityTaskFailedEventAttributes")(requestCancelActivityTaskFailedEventAttributes)
    if (requestCancelExternalWorkflowExecutionFailedEventAttributes != null) __obj.updateDynamic("requestCancelExternalWorkflowExecutionFailedEventAttributes")(requestCancelExternalWorkflowExecutionFailedEventAttributes)
    if (requestCancelExternalWorkflowExecutionInitiatedEventAttributes != null) __obj.updateDynamic("requestCancelExternalWorkflowExecutionInitiatedEventAttributes")(requestCancelExternalWorkflowExecutionInitiatedEventAttributes)
    if (scheduleActivityTaskFailedEventAttributes != null) __obj.updateDynamic("scheduleActivityTaskFailedEventAttributes")(scheduleActivityTaskFailedEventAttributes)
    if (scheduleLambdaFunctionFailedEventAttributes != null) __obj.updateDynamic("scheduleLambdaFunctionFailedEventAttributes")(scheduleLambdaFunctionFailedEventAttributes)
    if (signalExternalWorkflowExecutionFailedEventAttributes != null) __obj.updateDynamic("signalExternalWorkflowExecutionFailedEventAttributes")(signalExternalWorkflowExecutionFailedEventAttributes)
    if (signalExternalWorkflowExecutionInitiatedEventAttributes != null) __obj.updateDynamic("signalExternalWorkflowExecutionInitiatedEventAttributes")(signalExternalWorkflowExecutionInitiatedEventAttributes)
    if (startChildWorkflowExecutionFailedEventAttributes != null) __obj.updateDynamic("startChildWorkflowExecutionFailedEventAttributes")(startChildWorkflowExecutionFailedEventAttributes)
    if (startChildWorkflowExecutionInitiatedEventAttributes != null) __obj.updateDynamic("startChildWorkflowExecutionInitiatedEventAttributes")(startChildWorkflowExecutionInitiatedEventAttributes)
    if (startLambdaFunctionFailedEventAttributes != null) __obj.updateDynamic("startLambdaFunctionFailedEventAttributes")(startLambdaFunctionFailedEventAttributes)
    if (startTimerFailedEventAttributes != null) __obj.updateDynamic("startTimerFailedEventAttributes")(startTimerFailedEventAttributes)
    if (timerCanceledEventAttributes != null) __obj.updateDynamic("timerCanceledEventAttributes")(timerCanceledEventAttributes)
    if (timerFiredEventAttributes != null) __obj.updateDynamic("timerFiredEventAttributes")(timerFiredEventAttributes)
    if (timerStartedEventAttributes != null) __obj.updateDynamic("timerStartedEventAttributes")(timerStartedEventAttributes)
    if (workflowExecutionCancelRequestedEventAttributes != null) __obj.updateDynamic("workflowExecutionCancelRequestedEventAttributes")(workflowExecutionCancelRequestedEventAttributes)
    if (workflowExecutionCanceledEventAttributes != null) __obj.updateDynamic("workflowExecutionCanceledEventAttributes")(workflowExecutionCanceledEventAttributes)
    if (workflowExecutionCompletedEventAttributes != null) __obj.updateDynamic("workflowExecutionCompletedEventAttributes")(workflowExecutionCompletedEventAttributes)
    if (workflowExecutionContinuedAsNewEventAttributes != null) __obj.updateDynamic("workflowExecutionContinuedAsNewEventAttributes")(workflowExecutionContinuedAsNewEventAttributes)
    if (workflowExecutionFailedEventAttributes != null) __obj.updateDynamic("workflowExecutionFailedEventAttributes")(workflowExecutionFailedEventAttributes)
    if (workflowExecutionSignaledEventAttributes != null) __obj.updateDynamic("workflowExecutionSignaledEventAttributes")(workflowExecutionSignaledEventAttributes)
    if (workflowExecutionStartedEventAttributes != null) __obj.updateDynamic("workflowExecutionStartedEventAttributes")(workflowExecutionStartedEventAttributes)
    if (workflowExecutionTerminatedEventAttributes != null) __obj.updateDynamic("workflowExecutionTerminatedEventAttributes")(workflowExecutionTerminatedEventAttributes)
    if (workflowExecutionTimedOutEventAttributes != null) __obj.updateDynamic("workflowExecutionTimedOutEventAttributes")(workflowExecutionTimedOutEventAttributes)
    __obj.asInstanceOf[HistoryEvent]
  }
}

