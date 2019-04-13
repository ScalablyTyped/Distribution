package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSwfMod {
  type ActivityId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.START_TO_CLOSE
    - awsDashSdkLib.awsDashSdkLibStrings.SCHEDULE_TO_START
    - awsDashSdkLib.awsDashSdkLibStrings.SCHEDULE_TO_CLOSE
    - awsDashSdkLib.awsDashSdkLibStrings.HEARTBEAT
    - java.lang.String
  */
  type ActivityTaskTimeoutType = _ActivityTaskTimeoutType | java.lang.String
  type ActivityTypeInfoList = js.Array[ActivityTypeInfo]
  type Arn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TIMER_ID_UNKNOWN
    - awsDashSdkLib.awsDashSdkLibStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type CancelTimerFailedCause = _CancelTimerFailedCause | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.UNHANDLED_DECISION
    - awsDashSdkLib.awsDashSdkLibStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type CancelWorkflowExecutionFailedCause = _CancelWorkflowExecutionFailedCause | java.lang.String
  type Canceled = scala.Boolean
  type CauseMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATE
    - awsDashSdkLib.awsDashSdkLibStrings.REQUEST_CANCEL
    - awsDashSdkLib.awsDashSdkLibStrings.ABANDON
    - java.lang.String
  */
  type ChildPolicy = _ChildPolicy | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELED
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATED
    - awsDashSdkLib.awsDashSdkLibStrings.CONTINUED_AS_NEW
    - awsDashSdkLib.awsDashSdkLibStrings.TIMED_OUT
    - java.lang.String
  */
  type CloseStatus = _CloseStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.UNHANDLED_DECISION
    - awsDashSdkLib.awsDashSdkLibStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type CompleteWorkflowExecutionFailedCause = _CompleteWorkflowExecutionFailedCause | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.UNHANDLED_DECISION
    - awsDashSdkLib.awsDashSdkLibStrings.WORKFLOW_TYPE_DEPRECATED
    - awsDashSdkLib.awsDashSdkLibStrings.WORKFLOW_TYPE_DOES_NOT_EXIST
    - awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED
    - awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED
    - awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_TASK_LIST_UNDEFINED
    - awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_CHILD_POLICY_UNDEFINED
    - awsDashSdkLib.awsDashSdkLibStrings.CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type ContinueAsNewWorkflowExecutionFailedCause = _ContinueAsNewWorkflowExecutionFailedCause | java.lang.String
  type Count = scala.Double
  type Data = java.lang.String
  type DecisionList = js.Array[Decision]
  type DecisionTaskTimeoutType = awsDashSdkLib.awsDashSdkLibStrings.START_TO_CLOSE | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ScheduleActivityTask
    - awsDashSdkLib.awsDashSdkLibStrings.RequestCancelActivityTask
    - awsDashSdkLib.awsDashSdkLibStrings.CompleteWorkflowExecution
    - awsDashSdkLib.awsDashSdkLibStrings.FailWorkflowExecution
    - awsDashSdkLib.awsDashSdkLibStrings.CancelWorkflowExecution
    - awsDashSdkLib.awsDashSdkLibStrings.ContinueAsNewWorkflowExecution
    - awsDashSdkLib.awsDashSdkLibStrings.RecordMarker
    - awsDashSdkLib.awsDashSdkLibStrings.StartTimer
    - awsDashSdkLib.awsDashSdkLibStrings.CancelTimer
    - awsDashSdkLib.awsDashSdkLibStrings.SignalExternalWorkflowExecution
    - awsDashSdkLib.awsDashSdkLibStrings.RequestCancelExternalWorkflowExecution
    - awsDashSdkLib.awsDashSdkLibStrings.StartChildWorkflowExecution
    - awsDashSdkLib.awsDashSdkLibStrings.ScheduleLambdaFunction
    - java.lang.String
  */
  type DecisionType = _DecisionType | java.lang.String
  type Description = java.lang.String
  type DomainInfoList = js.Array[DomainInfo]
  type DomainName = java.lang.String
  type DurationInDays = java.lang.String
  type DurationInSeconds = java.lang.String
  type DurationInSecondsOptional = java.lang.String
  type EventId = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.WorkflowExecutionStarted
    - awsDashSdkLib.awsDashSdkLibStrings.WorkflowExecutionCancelRequested
    - awsDashSdkLib.awsDashSdkLibStrings.WorkflowExecutionCompleted
    - awsDashSdkLib.awsDashSdkLibStrings.CompleteWorkflowExecutionFailed
    - awsDashSdkLib.awsDashSdkLibStrings.WorkflowExecutionFailed
    - awsDashSdkLib.awsDashSdkLibStrings.FailWorkflowExecutionFailed
    - awsDashSdkLib.awsDashSdkLibStrings.WorkflowExecutionTimedOut
    - awsDashSdkLib.awsDashSdkLibStrings.WorkflowExecutionCanceled
    - awsDashSdkLib.awsDashSdkLibStrings.CancelWorkflowExecutionFailed
    - awsDashSdkLib.awsDashSdkLibStrings.WorkflowExecutionContinuedAsNew
    - awsDashSdkLib.awsDashSdkLibStrings.ContinueAsNewWorkflowExecutionFailed
    - awsDashSdkLib.awsDashSdkLibStrings.WorkflowExecutionTerminated
    - awsDashSdkLib.awsDashSdkLibStrings.DecisionTaskScheduled
    - awsDashSdkLib.awsDashSdkLibStrings.DecisionTaskStarted
    - awsDashSdkLib.awsDashSdkLibStrings.DecisionTaskCompleted
    - awsDashSdkLib.awsDashSdkLibStrings.DecisionTaskTimedOut
    - awsDashSdkLib.awsDashSdkLibStrings.ActivityTaskScheduled
    - awsDashSdkLib.awsDashSdkLibStrings.ScheduleActivityTaskFailed
    - awsDashSdkLib.awsDashSdkLibStrings.ActivityTaskStarted
    - awsDashSdkLib.awsDashSdkLibStrings.ActivityTaskCompleted
    - awsDashSdkLib.awsDashSdkLibStrings.ActivityTaskFailed
    - awsDashSdkLib.awsDashSdkLibStrings.ActivityTaskTimedOut
    - awsDashSdkLib.awsDashSdkLibStrings.ActivityTaskCanceled
    - awsDashSdkLib.awsDashSdkLibStrings.ActivityTaskCancelRequested
    - awsDashSdkLib.awsDashSdkLibStrings.RequestCancelActivityTaskFailed
    - awsDashSdkLib.awsDashSdkLibStrings.WorkflowExecutionSignaled
    - awsDashSdkLib.awsDashSdkLibStrings.MarkerRecorded
    - awsDashSdkLib.awsDashSdkLibStrings.RecordMarkerFailed
    - awsDashSdkLib.awsDashSdkLibStrings.TimerStarted
    - awsDashSdkLib.awsDashSdkLibStrings.StartTimerFailed
    - awsDashSdkLib.awsDashSdkLibStrings.TimerFired
    - awsDashSdkLib.awsDashSdkLibStrings.TimerCanceled
    - awsDashSdkLib.awsDashSdkLibStrings.CancelTimerFailed
    - awsDashSdkLib.awsDashSdkLibStrings.StartChildWorkflowExecutionInitiated
    - awsDashSdkLib.awsDashSdkLibStrings.StartChildWorkflowExecutionFailed
    - awsDashSdkLib.awsDashSdkLibStrings.ChildWorkflowExecutionStarted
    - awsDashSdkLib.awsDashSdkLibStrings.ChildWorkflowExecutionCompleted
    - awsDashSdkLib.awsDashSdkLibStrings.ChildWorkflowExecutionFailed
    - awsDashSdkLib.awsDashSdkLibStrings.ChildWorkflowExecutionTimedOut
    - awsDashSdkLib.awsDashSdkLibStrings.ChildWorkflowExecutionCanceled
    - awsDashSdkLib.awsDashSdkLibStrings.ChildWorkflowExecutionTerminated
    - awsDashSdkLib.awsDashSdkLibStrings.SignalExternalWorkflowExecutionInitiated
    - awsDashSdkLib.awsDashSdkLibStrings.SignalExternalWorkflowExecutionFailed
    - awsDashSdkLib.awsDashSdkLibStrings.ExternalWorkflowExecutionSignaled
    - awsDashSdkLib.awsDashSdkLibStrings.RequestCancelExternalWorkflowExecutionInitiated
    - awsDashSdkLib.awsDashSdkLibStrings.RequestCancelExternalWorkflowExecutionFailed
    - awsDashSdkLib.awsDashSdkLibStrings.ExternalWorkflowExecutionCancelRequested
    - awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionScheduled
    - awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionStarted
    - awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionCompleted
    - awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionFailed
    - awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionTimedOut
    - awsDashSdkLib.awsDashSdkLibStrings.ScheduleLambdaFunctionFailed
    - awsDashSdkLib.awsDashSdkLibStrings.StartLambdaFunctionFailed
    - java.lang.String
  */
  type EventType = _EventType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.OPEN
    - awsDashSdkLib.awsDashSdkLibStrings.CLOSED
    - java.lang.String
  */
  type ExecutionStatus = _ExecutionStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.UNHANDLED_DECISION
    - awsDashSdkLib.awsDashSdkLibStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type FailWorkflowExecutionFailedCause = _FailWorkflowExecutionFailedCause | java.lang.String
  type FailureReason = java.lang.String
  type FunctionId = java.lang.String
  type FunctionInput = java.lang.String
  type FunctionName = java.lang.String
  type HistoryEventList = js.Array[HistoryEvent]
  type Identity = java.lang.String
  type LambdaFunctionTimeoutType = awsDashSdkLib.awsDashSdkLibStrings.START_TO_CLOSE | java.lang.String
  type LimitedData = java.lang.String
  type MarkerName = java.lang.String
  type Name = java.lang.String
  type OpenDecisionTasksCount = scala.Double
  type PageSize = scala.Double
  type PageToken = java.lang.String
  type RecordMarkerFailedCause = awsDashSdkLib.awsDashSdkLibStrings.OPERATION_NOT_PERMITTED | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.REGISTERED
    - awsDashSdkLib.awsDashSdkLibStrings.DEPRECATED
    - java.lang.String
  */
  type RegistrationStatus = _RegistrationStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVITY_ID_UNKNOWN
    - awsDashSdkLib.awsDashSdkLibStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type RequestCancelActivityTaskFailedCause = _RequestCancelActivityTaskFailedCause | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION
    - awsDashSdkLib.awsDashSdkLibStrings.REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type RequestCancelExternalWorkflowExecutionFailedCause = _RequestCancelExternalWorkflowExecutionFailedCause | java.lang.String
  type ReverseOrder = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVITY_TYPE_DEPRECATED
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVITY_TYPE_DOES_NOT_EXIST
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVITY_ID_ALREADY_IN_USE
    - awsDashSdkLib.awsDashSdkLibStrings.OPEN_ACTIVITIES_LIMIT_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVITY_CREATION_RATE_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED
    - awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_TASK_LIST_UNDEFINED
    - awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED
    - awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED
    - awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED
    - awsDashSdkLib.awsDashSdkLibStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type ScheduleActivityTaskFailedCause = _ScheduleActivityTaskFailedCause | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ID_ALREADY_IN_USE
    - awsDashSdkLib.awsDashSdkLibStrings.OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION
    - java.lang.String
  */
  type ScheduleLambdaFunctionFailedCause = _ScheduleLambdaFunctionFailedCause | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION
    - awsDashSdkLib.awsDashSdkLibStrings.SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type SignalExternalWorkflowExecutionFailedCause = _SignalExternalWorkflowExecutionFailedCause | java.lang.String
  type SignalName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.WORKFLOW_TYPE_DOES_NOT_EXIST
    - awsDashSdkLib.awsDashSdkLibStrings.WORKFLOW_TYPE_DEPRECATED
    - awsDashSdkLib.awsDashSdkLibStrings.OPEN_CHILDREN_LIMIT_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.OPEN_WORKFLOWS_LIMIT_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.CHILD_CREATION_RATE_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.WORKFLOW_ALREADY_RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED
    - awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_TASK_LIST_UNDEFINED
    - awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED
    - awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_CHILD_POLICY_UNDEFINED
    - awsDashSdkLib.awsDashSdkLibStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type StartChildWorkflowExecutionFailedCause = _StartChildWorkflowExecutionFailedCause | java.lang.String
  type StartLambdaFunctionFailedCause = awsDashSdkLib.awsDashSdkLibStrings.ASSUME_ROLE_FAILED | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TIMER_ID_ALREADY_IN_USE
    - awsDashSdkLib.awsDashSdkLibStrings.OPEN_TIMERS_LIMIT_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.TIMER_CREATION_RATE_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type StartTimerFailedCause = _StartTimerFailedCause | java.lang.String
  type Tag = java.lang.String
  type TagList = js.Array[Tag]
  type TaskPriority = java.lang.String
  type TaskToken = java.lang.String
  type TerminateReason = java.lang.String
  type TimerId = java.lang.String
  type Timestamp = stdLib.Date
  type Truncated = scala.Boolean
  type Version = java.lang.String
  type VersionOptional = java.lang.String
  type WorkflowExecutionCancelRequestedCause = awsDashSdkLib.awsDashSdkLibStrings.CHILD_POLICY_APPLIED | java.lang.String
  type WorkflowExecutionInfoList = js.Array[WorkflowExecutionInfo]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CHILD_POLICY_APPLIED
    - awsDashSdkLib.awsDashSdkLibStrings.EVENT_LIMIT_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.OPERATOR_INITIATED
    - java.lang.String
  */
  type WorkflowExecutionTerminatedCause = _WorkflowExecutionTerminatedCause | java.lang.String
  type WorkflowExecutionTimeoutType = awsDashSdkLib.awsDashSdkLibStrings.START_TO_CLOSE | java.lang.String
  type WorkflowId = java.lang.String
  type WorkflowRunId = java.lang.String
  type WorkflowRunIdOptional = java.lang.String
  type WorkflowTypeInfoList = js.Array[WorkflowTypeInfo]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2012-01-25`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
