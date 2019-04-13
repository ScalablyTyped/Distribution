package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsStepfunctionsMod {
  type ActivityList = js.Array[ActivityListItem]
  type Arn = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ConnectorParameters = java.lang.String
  type Definition = java.lang.String
  type EventId = scala.Double
  type ExecutionList = js.Array[ExecutionListItem]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.TIMED_OUT
    - awsDashSdkLib.awsDashSdkLibStrings.ABORTED
    - java.lang.String
  */
  type ExecutionStatus = _ExecutionStatus | java.lang.String
  type HistoryEventList = js.Array[HistoryEvent]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ActivityFailed
    - awsDashSdkLib.awsDashSdkLibStrings.ActivityScheduleFailed
    - awsDashSdkLib.awsDashSdkLibStrings.ActivityScheduled
    - awsDashSdkLib.awsDashSdkLibStrings.ActivityStarted
    - awsDashSdkLib.awsDashSdkLibStrings.ActivitySucceeded
    - awsDashSdkLib.awsDashSdkLibStrings.ActivityTimedOut
    - awsDashSdkLib.awsDashSdkLibStrings.ChoiceStateEntered
    - awsDashSdkLib.awsDashSdkLibStrings.ChoiceStateExited
    - awsDashSdkLib.awsDashSdkLibStrings.TaskFailed
    - awsDashSdkLib.awsDashSdkLibStrings.TaskScheduled
    - awsDashSdkLib.awsDashSdkLibStrings.TaskStartFailed
    - awsDashSdkLib.awsDashSdkLibStrings.TaskStarted
    - awsDashSdkLib.awsDashSdkLibStrings.TaskSubmitFailed
    - awsDashSdkLib.awsDashSdkLibStrings.TaskSubmitted
    - awsDashSdkLib.awsDashSdkLibStrings.TaskSucceeded
    - awsDashSdkLib.awsDashSdkLibStrings.TaskTimedOut
    - awsDashSdkLib.awsDashSdkLibStrings.ExecutionFailed
    - awsDashSdkLib.awsDashSdkLibStrings.ExecutionStarted
    - awsDashSdkLib.awsDashSdkLibStrings.ExecutionSucceeded
    - awsDashSdkLib.awsDashSdkLibStrings.ExecutionAborted
    - awsDashSdkLib.awsDashSdkLibStrings.ExecutionTimedOut
    - awsDashSdkLib.awsDashSdkLibStrings.FailStateEntered
    - awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionFailed
    - awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionScheduleFailed
    - awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionScheduled
    - awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionStartFailed
    - awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionStarted
    - awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionSucceeded
    - awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionTimedOut
    - awsDashSdkLib.awsDashSdkLibStrings.SucceedStateEntered
    - awsDashSdkLib.awsDashSdkLibStrings.SucceedStateExited
    - awsDashSdkLib.awsDashSdkLibStrings.TaskStateAborted
    - awsDashSdkLib.awsDashSdkLibStrings.TaskStateEntered
    - awsDashSdkLib.awsDashSdkLibStrings.TaskStateExited
    - awsDashSdkLib.awsDashSdkLibStrings.PassStateEntered
    - awsDashSdkLib.awsDashSdkLibStrings.PassStateExited
    - awsDashSdkLib.awsDashSdkLibStrings.ParallelStateAborted
    - awsDashSdkLib.awsDashSdkLibStrings.ParallelStateEntered
    - awsDashSdkLib.awsDashSdkLibStrings.ParallelStateExited
    - awsDashSdkLib.awsDashSdkLibStrings.ParallelStateFailed
    - awsDashSdkLib.awsDashSdkLibStrings.ParallelStateStarted
    - awsDashSdkLib.awsDashSdkLibStrings.ParallelStateSucceeded
    - awsDashSdkLib.awsDashSdkLibStrings.WaitStateAborted
    - awsDashSdkLib.awsDashSdkLibStrings.WaitStateEntered
    - awsDashSdkLib.awsDashSdkLibStrings.WaitStateExited
    - java.lang.String
  */
  type HistoryEventType = _HistoryEventType | java.lang.String
  type Identity = java.lang.String
  type Name = java.lang.String
  type PageSize = scala.Double
  type PageToken = java.lang.String
  type ReverseOrder = scala.Boolean
  type SensitiveCause = java.lang.String
  type SensitiveData = java.lang.String
  type SensitiveDataJobInput = java.lang.String
  type SensitiveError = java.lang.String
  type StateMachineList = js.Array[StateMachineListItem]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - java.lang.String
  */
  type StateMachineStatus = _StateMachineStatus | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type TaskToken = java.lang.String
  type TimeoutInSeconds = scala.Double
  type Timestamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-11-23`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
