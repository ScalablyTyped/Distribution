package typings.awsDashSdk

import typings.awsDashSdk.awsDashSdkStrings.ASSUME_ROLE_FAILED
import typings.awsDashSdk.awsDashSdkStrings.CHILD_POLICY_APPLIED
import typings.awsDashSdk.awsDashSdkStrings.OPERATION_NOT_PERMITTED
import typings.awsDashSdk.awsDashSdkStrings.START_TO_CLOSE
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSwfMod {
  type ActivityId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.START_TO_CLOSE
    - typings.awsDashSdk.awsDashSdkStrings.SCHEDULE_TO_START
    - typings.awsDashSdk.awsDashSdkStrings.SCHEDULE_TO_CLOSE
    - typings.awsDashSdk.awsDashSdkStrings.HEARTBEAT
    - java.lang.String
  */
  type ActivityTaskTimeoutType = _ActivityTaskTimeoutType | String
  type ActivityTypeInfoList = js.Array[ActivityTypeInfo]
  type Arn = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TIMER_ID_UNKNOWN
    - typings.awsDashSdk.awsDashSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type CancelTimerFailedCause = _CancelTimerFailedCause | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.UNHANDLED_DECISION
    - typings.awsDashSdk.awsDashSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type CancelWorkflowExecutionFailedCause = _CancelWorkflowExecutionFailedCause | String
  type Canceled = Boolean
  type CauseMessage = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATE
    - typings.awsDashSdk.awsDashSdkStrings.REQUEST_CANCEL
    - typings.awsDashSdk.awsDashSdkStrings.ABANDON
    - java.lang.String
  */
  type ChildPolicy = _ChildPolicy | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.CANCELED
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATED
    - typings.awsDashSdk.awsDashSdkStrings.CONTINUED_AS_NEW
    - typings.awsDashSdk.awsDashSdkStrings.TIMED_OUT
    - java.lang.String
  */
  type CloseStatus = _CloseStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.UNHANDLED_DECISION
    - typings.awsDashSdk.awsDashSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type CompleteWorkflowExecutionFailedCause = _CompleteWorkflowExecutionFailedCause | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.UNHANDLED_DECISION
    - typings.awsDashSdk.awsDashSdkStrings.WORKFLOW_TYPE_DEPRECATED
    - typings.awsDashSdk.awsDashSdkStrings.WORKFLOW_TYPE_DOES_NOT_EXIST
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT_TASK_LIST_UNDEFINED
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT_CHILD_POLICY_UNDEFINED
    - typings.awsDashSdk.awsDashSdkStrings.CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type ContinueAsNewWorkflowExecutionFailedCause = _ContinueAsNewWorkflowExecutionFailedCause | String
  type Count = Double
  type Data = String
  type DecisionList = js.Array[Decision]
  type DecisionTaskTimeoutType = START_TO_CLOSE | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ScheduleActivityTask
    - typings.awsDashSdk.awsDashSdkStrings.RequestCancelActivityTask
    - typings.awsDashSdk.awsDashSdkStrings.CompleteWorkflowExecution
    - typings.awsDashSdk.awsDashSdkStrings.FailWorkflowExecution
    - typings.awsDashSdk.awsDashSdkStrings.CancelWorkflowExecution
    - typings.awsDashSdk.awsDashSdkStrings.ContinueAsNewWorkflowExecution
    - typings.awsDashSdk.awsDashSdkStrings.RecordMarker
    - typings.awsDashSdk.awsDashSdkStrings.StartTimer
    - typings.awsDashSdk.awsDashSdkStrings.CancelTimer
    - typings.awsDashSdk.awsDashSdkStrings.SignalExternalWorkflowExecution
    - typings.awsDashSdk.awsDashSdkStrings.RequestCancelExternalWorkflowExecution
    - typings.awsDashSdk.awsDashSdkStrings.StartChildWorkflowExecution
    - typings.awsDashSdk.awsDashSdkStrings.ScheduleLambdaFunction
    - java.lang.String
  */
  type DecisionType = _DecisionType | String
  type Description = String
  type DomainInfoList = js.Array[DomainInfo]
  type DomainName = String
  type DurationInDays = String
  type DurationInSeconds = String
  type DurationInSecondsOptional = String
  type EventId = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.WorkflowExecutionStarted
    - typings.awsDashSdk.awsDashSdkStrings.WorkflowExecutionCancelRequested
    - typings.awsDashSdk.awsDashSdkStrings.WorkflowExecutionCompleted
    - typings.awsDashSdk.awsDashSdkStrings.CompleteWorkflowExecutionFailed
    - typings.awsDashSdk.awsDashSdkStrings.WorkflowExecutionFailed
    - typings.awsDashSdk.awsDashSdkStrings.FailWorkflowExecutionFailed
    - typings.awsDashSdk.awsDashSdkStrings.WorkflowExecutionTimedOut
    - typings.awsDashSdk.awsDashSdkStrings.WorkflowExecutionCanceled
    - typings.awsDashSdk.awsDashSdkStrings.CancelWorkflowExecutionFailed
    - typings.awsDashSdk.awsDashSdkStrings.WorkflowExecutionContinuedAsNew
    - typings.awsDashSdk.awsDashSdkStrings.ContinueAsNewWorkflowExecutionFailed
    - typings.awsDashSdk.awsDashSdkStrings.WorkflowExecutionTerminated
    - typings.awsDashSdk.awsDashSdkStrings.DecisionTaskScheduled
    - typings.awsDashSdk.awsDashSdkStrings.DecisionTaskStarted
    - typings.awsDashSdk.awsDashSdkStrings.DecisionTaskCompleted
    - typings.awsDashSdk.awsDashSdkStrings.DecisionTaskTimedOut
    - typings.awsDashSdk.awsDashSdkStrings.ActivityTaskScheduled
    - typings.awsDashSdk.awsDashSdkStrings.ScheduleActivityTaskFailed
    - typings.awsDashSdk.awsDashSdkStrings.ActivityTaskStarted
    - typings.awsDashSdk.awsDashSdkStrings.ActivityTaskCompleted
    - typings.awsDashSdk.awsDashSdkStrings.ActivityTaskFailed
    - typings.awsDashSdk.awsDashSdkStrings.ActivityTaskTimedOut
    - typings.awsDashSdk.awsDashSdkStrings.ActivityTaskCanceled
    - typings.awsDashSdk.awsDashSdkStrings.ActivityTaskCancelRequested
    - typings.awsDashSdk.awsDashSdkStrings.RequestCancelActivityTaskFailed
    - typings.awsDashSdk.awsDashSdkStrings.WorkflowExecutionSignaled
    - typings.awsDashSdk.awsDashSdkStrings.MarkerRecorded
    - typings.awsDashSdk.awsDashSdkStrings.RecordMarkerFailed
    - typings.awsDashSdk.awsDashSdkStrings.TimerStarted
    - typings.awsDashSdk.awsDashSdkStrings.StartTimerFailed
    - typings.awsDashSdk.awsDashSdkStrings.TimerFired
    - typings.awsDashSdk.awsDashSdkStrings.TimerCanceled
    - typings.awsDashSdk.awsDashSdkStrings.CancelTimerFailed
    - typings.awsDashSdk.awsDashSdkStrings.StartChildWorkflowExecutionInitiated
    - typings.awsDashSdk.awsDashSdkStrings.StartChildWorkflowExecutionFailed
    - typings.awsDashSdk.awsDashSdkStrings.ChildWorkflowExecutionStarted
    - typings.awsDashSdk.awsDashSdkStrings.ChildWorkflowExecutionCompleted
    - typings.awsDashSdk.awsDashSdkStrings.ChildWorkflowExecutionFailed
    - typings.awsDashSdk.awsDashSdkStrings.ChildWorkflowExecutionTimedOut
    - typings.awsDashSdk.awsDashSdkStrings.ChildWorkflowExecutionCanceled
    - typings.awsDashSdk.awsDashSdkStrings.ChildWorkflowExecutionTerminated
    - typings.awsDashSdk.awsDashSdkStrings.SignalExternalWorkflowExecutionInitiated
    - typings.awsDashSdk.awsDashSdkStrings.SignalExternalWorkflowExecutionFailed
    - typings.awsDashSdk.awsDashSdkStrings.ExternalWorkflowExecutionSignaled
    - typings.awsDashSdk.awsDashSdkStrings.RequestCancelExternalWorkflowExecutionInitiated
    - typings.awsDashSdk.awsDashSdkStrings.RequestCancelExternalWorkflowExecutionFailed
    - typings.awsDashSdk.awsDashSdkStrings.ExternalWorkflowExecutionCancelRequested
    - typings.awsDashSdk.awsDashSdkStrings.LambdaFunctionScheduled
    - typings.awsDashSdk.awsDashSdkStrings.LambdaFunctionStarted
    - typings.awsDashSdk.awsDashSdkStrings.LambdaFunctionCompleted
    - typings.awsDashSdk.awsDashSdkStrings.LambdaFunctionFailed
    - typings.awsDashSdk.awsDashSdkStrings.LambdaFunctionTimedOut
    - typings.awsDashSdk.awsDashSdkStrings.ScheduleLambdaFunctionFailed
    - typings.awsDashSdk.awsDashSdkStrings.StartLambdaFunctionFailed
    - java.lang.String
  */
  type EventType = _EventType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OPEN
    - typings.awsDashSdk.awsDashSdkStrings.CLOSED
    - java.lang.String
  */
  type ExecutionStatus = _ExecutionStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.UNHANDLED_DECISION
    - typings.awsDashSdk.awsDashSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type FailWorkflowExecutionFailedCause = _FailWorkflowExecutionFailedCause | String
  type FailureReason = String
  type FunctionId = String
  type FunctionInput = String
  type FunctionName = String
  type HistoryEventList = js.Array[HistoryEvent]
  type Identity = String
  type LambdaFunctionTimeoutType = START_TO_CLOSE | String
  type LimitedData = String
  type MarkerName = String
  type Name = String
  type OpenDecisionTasksCount = Double
  type PageSize = Double
  type PageToken = String
  type RecordMarkerFailedCause = OPERATION_NOT_PERMITTED | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.REGISTERED
    - typings.awsDashSdk.awsDashSdkStrings.DEPRECATED
    - java.lang.String
  */
  type RegistrationStatus = _RegistrationStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVITY_ID_UNKNOWN
    - typings.awsDashSdk.awsDashSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type RequestCancelActivityTaskFailedCause = _RequestCancelActivityTaskFailedCause | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION
    - typings.awsDashSdk.awsDashSdkStrings.REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type RequestCancelExternalWorkflowExecutionFailedCause = _RequestCancelExternalWorkflowExecutionFailedCause | String
  type ResourceTagKey = String
  type ResourceTagKeyList = js.Array[ResourceTagKey]
  type ResourceTagList = js.Array[ResourceTag]
  type ResourceTagValue = String
  type ReverseOrder = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVITY_TYPE_DEPRECATED
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVITY_TYPE_DOES_NOT_EXIST
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVITY_ID_ALREADY_IN_USE
    - typings.awsDashSdk.awsDashSdkStrings.OPEN_ACTIVITIES_LIMIT_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVITY_CREATION_RATE_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT_TASK_LIST_UNDEFINED
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED
    - typings.awsDashSdk.awsDashSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type ScheduleActivityTaskFailedCause = _ScheduleActivityTaskFailedCause | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ID_ALREADY_IN_USE
    - typings.awsDashSdk.awsDashSdkStrings.OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION
    - java.lang.String
  */
  type ScheduleLambdaFunctionFailedCause = _ScheduleLambdaFunctionFailedCause | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION
    - typings.awsDashSdk.awsDashSdkStrings.SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type SignalExternalWorkflowExecutionFailedCause = _SignalExternalWorkflowExecutionFailedCause | String
  type SignalName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.WORKFLOW_TYPE_DOES_NOT_EXIST
    - typings.awsDashSdk.awsDashSdkStrings.WORKFLOW_TYPE_DEPRECATED
    - typings.awsDashSdk.awsDashSdkStrings.OPEN_CHILDREN_LIMIT_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.OPEN_WORKFLOWS_LIMIT_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.CHILD_CREATION_RATE_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.WORKFLOW_ALREADY_RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT_TASK_LIST_UNDEFINED
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT_CHILD_POLICY_UNDEFINED
    - typings.awsDashSdk.awsDashSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type StartChildWorkflowExecutionFailedCause = _StartChildWorkflowExecutionFailedCause | String
  type StartLambdaFunctionFailedCause = ASSUME_ROLE_FAILED | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TIMER_ID_ALREADY_IN_USE
    - typings.awsDashSdk.awsDashSdkStrings.OPEN_TIMERS_LIMIT_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.TIMER_CREATION_RATE_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type StartTimerFailedCause = _StartTimerFailedCause | String
  type Tag = String
  type TagList = js.Array[Tag]
  type TaskPriority = String
  type TaskToken = String
  type TerminateReason = String
  type TimerId = String
  type Timestamp = Date
  type Truncated = Boolean
  type Version = String
  type VersionOptional = String
  type WorkflowExecutionCancelRequestedCause = CHILD_POLICY_APPLIED | String
  type WorkflowExecutionInfoList = js.Array[WorkflowExecutionInfo]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CHILD_POLICY_APPLIED
    - typings.awsDashSdk.awsDashSdkStrings.EVENT_LIMIT_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.OPERATOR_INITIATED
    - java.lang.String
  */
  type WorkflowExecutionTerminatedCause = _WorkflowExecutionTerminatedCause | String
  type WorkflowExecutionTimeoutType = START_TO_CLOSE | String
  type WorkflowId = String
  type WorkflowRunId = String
  type WorkflowRunIdOptional = String
  type WorkflowTypeInfoList = js.Array[WorkflowTypeInfo]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2012-01-25`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
