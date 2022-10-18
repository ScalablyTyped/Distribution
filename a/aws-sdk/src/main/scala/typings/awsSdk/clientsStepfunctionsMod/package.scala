package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActivityList = js.Array[ActivityListItem]

type Arn = String

type BilledDuration = Double

type BilledMemoryUsed = Double

type ConnectorParameters = String

type Definition = String

type Enabled = Boolean

type EventId = Double

type ExecutionList = js.Array[ExecutionListItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.TIMED_OUT
  - typings.awsSdk.awsSdkStrings.ABORTED
  - java.lang.String
*/
type ExecutionStatus = _ExecutionStatus | String

type HistoryEventList = js.Array[HistoryEvent]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ActivityFailed
  - typings.awsSdk.awsSdkStrings.ActivityScheduled
  - typings.awsSdk.awsSdkStrings.ActivityScheduleFailed
  - typings.awsSdk.awsSdkStrings.ActivityStarted
  - typings.awsSdk.awsSdkStrings.ActivitySucceeded
  - typings.awsSdk.awsSdkStrings.ActivityTimedOut
  - typings.awsSdk.awsSdkStrings.ChoiceStateEntered
  - typings.awsSdk.awsSdkStrings.ChoiceStateExited
  - typings.awsSdk.awsSdkStrings.ExecutionAborted
  - typings.awsSdk.awsSdkStrings.ExecutionFailed
  - typings.awsSdk.awsSdkStrings.ExecutionStarted
  - typings.awsSdk.awsSdkStrings.ExecutionSucceeded
  - typings.awsSdk.awsSdkStrings.ExecutionTimedOut
  - typings.awsSdk.awsSdkStrings.FailStateEntered
  - typings.awsSdk.awsSdkStrings.LambdaFunctionFailed
  - typings.awsSdk.awsSdkStrings.LambdaFunctionScheduled
  - typings.awsSdk.awsSdkStrings.LambdaFunctionScheduleFailed
  - typings.awsSdk.awsSdkStrings.LambdaFunctionStarted
  - typings.awsSdk.awsSdkStrings.LambdaFunctionStartFailed
  - typings.awsSdk.awsSdkStrings.LambdaFunctionSucceeded
  - typings.awsSdk.awsSdkStrings.LambdaFunctionTimedOut
  - typings.awsSdk.awsSdkStrings.MapIterationAborted
  - typings.awsSdk.awsSdkStrings.MapIterationFailed
  - typings.awsSdk.awsSdkStrings.MapIterationStarted
  - typings.awsSdk.awsSdkStrings.MapIterationSucceeded
  - typings.awsSdk.awsSdkStrings.MapStateAborted
  - typings.awsSdk.awsSdkStrings.MapStateEntered
  - typings.awsSdk.awsSdkStrings.MapStateExited
  - typings.awsSdk.awsSdkStrings.MapStateFailed
  - typings.awsSdk.awsSdkStrings.MapStateStarted
  - typings.awsSdk.awsSdkStrings.MapStateSucceeded
  - typings.awsSdk.awsSdkStrings.ParallelStateAborted
  - typings.awsSdk.awsSdkStrings.ParallelStateEntered
  - typings.awsSdk.awsSdkStrings.ParallelStateExited
  - typings.awsSdk.awsSdkStrings.ParallelStateFailed
  - typings.awsSdk.awsSdkStrings.ParallelStateStarted
  - typings.awsSdk.awsSdkStrings.ParallelStateSucceeded
  - typings.awsSdk.awsSdkStrings.PassStateEntered
  - typings.awsSdk.awsSdkStrings.PassStateExited
  - typings.awsSdk.awsSdkStrings.SucceedStateEntered
  - typings.awsSdk.awsSdkStrings.SucceedStateExited
  - typings.awsSdk.awsSdkStrings.TaskFailed
  - typings.awsSdk.awsSdkStrings.TaskScheduled
  - typings.awsSdk.awsSdkStrings.TaskStarted
  - typings.awsSdk.awsSdkStrings.TaskStartFailed
  - typings.awsSdk.awsSdkStrings.TaskStateAborted
  - typings.awsSdk.awsSdkStrings.TaskStateEntered
  - typings.awsSdk.awsSdkStrings.TaskStateExited
  - typings.awsSdk.awsSdkStrings.TaskSubmitFailed
  - typings.awsSdk.awsSdkStrings.TaskSubmitted
  - typings.awsSdk.awsSdkStrings.TaskSucceeded
  - typings.awsSdk.awsSdkStrings.TaskTimedOut
  - typings.awsSdk.awsSdkStrings.WaitStateAborted
  - typings.awsSdk.awsSdkStrings.WaitStateEntered
  - typings.awsSdk.awsSdkStrings.WaitStateExited
  - java.lang.String
*/
type HistoryEventType = _HistoryEventType | String

type Identity = String

type IncludeExecutionData = Boolean

type IncludeExecutionDataGetExecutionHistory = Boolean

type ListExecutionsPageToken = String

type LogDestinationList = js.Array[LogDestination]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.FATAL
  - typings.awsSdk.awsSdkStrings.OFF
  - java.lang.String
*/
type LogLevel = _LogLevel | String

type Name = String

type PageSize = Double

type PageToken = String

type ReverseOrder = Boolean

type SensitiveCause = String

type SensitiveData = String

type SensitiveDataJobInput = String

type SensitiveError = String

type StateMachineList = js.Array[StateMachineListItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type StateMachineStatus = _StateMachineStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STANDARD
  - typings.awsSdk.awsSdkStrings.EXPRESS
  - java.lang.String
*/
type StateMachineType = _StateMachineType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.TIMED_OUT
  - java.lang.String
*/
type SyncExecutionStatus = _SyncExecutionStatus | String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TaskToken = String

type TimeoutInSeconds = Double

type Timestamp = js.Date

type TraceHeader = String

type UnsignedInteger = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2016-11-23`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type includedDetails = Boolean

type truncated = Boolean
