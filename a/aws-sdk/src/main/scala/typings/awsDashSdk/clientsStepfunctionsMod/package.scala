package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsStepfunctionsMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type ActivityList = js.Array[ActivityListItem]
  type Arn = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ConnectorParameters = String
  type Definition = String
  type EventId = Double
  type ExecutionList = js.Array[ExecutionListItem]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.TIMED_OUT
    - typings.awsDashSdk.awsDashSdkStrings.ABORTED
    - java.lang.String
  */
  type ExecutionStatus = _ExecutionStatus | String
  type HistoryEventList = js.Array[HistoryEvent]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ActivityFailed
    - typings.awsDashSdk.awsDashSdkStrings.ActivityScheduled
    - typings.awsDashSdk.awsDashSdkStrings.ActivityScheduleFailed
    - typings.awsDashSdk.awsDashSdkStrings.ActivityStarted
    - typings.awsDashSdk.awsDashSdkStrings.ActivitySucceeded
    - typings.awsDashSdk.awsDashSdkStrings.ActivityTimedOut
    - typings.awsDashSdk.awsDashSdkStrings.ChoiceStateEntered
    - typings.awsDashSdk.awsDashSdkStrings.ChoiceStateExited
    - typings.awsDashSdk.awsDashSdkStrings.ExecutionAborted
    - typings.awsDashSdk.awsDashSdkStrings.ExecutionFailed
    - typings.awsDashSdk.awsDashSdkStrings.ExecutionStarted
    - typings.awsDashSdk.awsDashSdkStrings.ExecutionSucceeded
    - typings.awsDashSdk.awsDashSdkStrings.ExecutionTimedOut
    - typings.awsDashSdk.awsDashSdkStrings.FailStateEntered
    - typings.awsDashSdk.awsDashSdkStrings.LambdaFunctionFailed
    - typings.awsDashSdk.awsDashSdkStrings.LambdaFunctionScheduled
    - typings.awsDashSdk.awsDashSdkStrings.LambdaFunctionScheduleFailed
    - typings.awsDashSdk.awsDashSdkStrings.LambdaFunctionStarted
    - typings.awsDashSdk.awsDashSdkStrings.LambdaFunctionStartFailed
    - typings.awsDashSdk.awsDashSdkStrings.LambdaFunctionSucceeded
    - typings.awsDashSdk.awsDashSdkStrings.LambdaFunctionTimedOut
    - typings.awsDashSdk.awsDashSdkStrings.MapIterationAborted
    - typings.awsDashSdk.awsDashSdkStrings.MapIterationFailed
    - typings.awsDashSdk.awsDashSdkStrings.MapIterationStarted
    - typings.awsDashSdk.awsDashSdkStrings.MapIterationSucceeded
    - typings.awsDashSdk.awsDashSdkStrings.MapStateAborted
    - typings.awsDashSdk.awsDashSdkStrings.MapStateEntered
    - typings.awsDashSdk.awsDashSdkStrings.MapStateExited
    - typings.awsDashSdk.awsDashSdkStrings.MapStateFailed
    - typings.awsDashSdk.awsDashSdkStrings.MapStateStarted
    - typings.awsDashSdk.awsDashSdkStrings.MapStateSucceeded
    - typings.awsDashSdk.awsDashSdkStrings.ParallelStateAborted
    - typings.awsDashSdk.awsDashSdkStrings.ParallelStateEntered
    - typings.awsDashSdk.awsDashSdkStrings.ParallelStateExited
    - typings.awsDashSdk.awsDashSdkStrings.ParallelStateFailed
    - typings.awsDashSdk.awsDashSdkStrings.ParallelStateStarted
    - typings.awsDashSdk.awsDashSdkStrings.ParallelStateSucceeded
    - typings.awsDashSdk.awsDashSdkStrings.PassStateEntered
    - typings.awsDashSdk.awsDashSdkStrings.PassStateExited
    - typings.awsDashSdk.awsDashSdkStrings.SucceedStateEntered
    - typings.awsDashSdk.awsDashSdkStrings.SucceedStateExited
    - typings.awsDashSdk.awsDashSdkStrings.TaskFailed
    - typings.awsDashSdk.awsDashSdkStrings.TaskScheduled
    - typings.awsDashSdk.awsDashSdkStrings.TaskStarted
    - typings.awsDashSdk.awsDashSdkStrings.TaskStartFailed
    - typings.awsDashSdk.awsDashSdkStrings.TaskStateAborted
    - typings.awsDashSdk.awsDashSdkStrings.TaskStateEntered
    - typings.awsDashSdk.awsDashSdkStrings.TaskStateExited
    - typings.awsDashSdk.awsDashSdkStrings.TaskSubmitFailed
    - typings.awsDashSdk.awsDashSdkStrings.TaskSubmitted
    - typings.awsDashSdk.awsDashSdkStrings.TaskSucceeded
    - typings.awsDashSdk.awsDashSdkStrings.TaskTimedOut
    - typings.awsDashSdk.awsDashSdkStrings.WaitStateAborted
    - typings.awsDashSdk.awsDashSdkStrings.WaitStateEntered
    - typings.awsDashSdk.awsDashSdkStrings.WaitStateExited
    - java.lang.String
  */
  type HistoryEventType = _HistoryEventType | String
  type Identity = String
  type ListExecutionsPageToken = String
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
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - java.lang.String
  */
  type StateMachineStatus = _StateMachineStatus | String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TaskToken = String
  type TimeoutInSeconds = Double
  type Timestamp = Date
  type UnsignedInteger = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-11-23`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
