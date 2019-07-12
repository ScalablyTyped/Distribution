package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsEventbridgeMod {
  type AccountId = java.lang.String
  type Action = java.lang.String
  type Arn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - java.lang.String
  */
  type AssignPublicIp = _AssignPublicIp | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ErrorCode = java.lang.String
  type ErrorMessage = java.lang.String
  type EventBusList = js.Array[EventBus]
  type EventBusName = java.lang.String
  type EventId = java.lang.String
  type EventPattern = java.lang.String
  type EventResource = java.lang.String
  type EventResourceList = js.Array[EventResource]
  type EventSourceList = js.Array[EventSource]
  type EventSourceName = java.lang.String
  type EventSourceNamePrefix = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - java.lang.String
  */
  type EventSourceState = _EventSourceState | java.lang.String
  type EventTime = stdLib.Date
  type InputTransformerPathKey = java.lang.String
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EC2
    - awsDashSdkLib.awsDashSdkLibStrings.FARGATE
    - java.lang.String
  */
  type LaunchType = _LaunchType | java.lang.String
  type LimitMax100 = scala.Double
  type LimitMin1 = scala.Double
  type ManagedBy = java.lang.String
  type MessageGroupId = java.lang.String
  type NextToken = java.lang.String
  type NonPartnerEventBusName = java.lang.String
  type PartnerEventSourceAccountList = js.Array[PartnerEventSourceAccount]
  type PartnerEventSourceList = js.Array[PartnerEventSource]
  type PartnerEventSourceNamePrefix = java.lang.String
  type Principal = java.lang.String
  type PutEventsRequestEntryList = js.Array[PutEventsRequestEntry]
  type PutEventsResultEntryList = js.Array[PutEventsResultEntry]
  type PutPartnerEventsRequestEntryList = js.Array[PutPartnerEventsRequestEntry]
  type PutPartnerEventsResultEntryList = js.Array[PutPartnerEventsResultEntry]
  type PutTargetsResultEntryList = js.Array[PutTargetsResultEntry]
  type RemoveTargetsResultEntryList = js.Array[RemoveTargetsResultEntry]
  type RoleArn = java.lang.String
  type RuleArn = java.lang.String
  type RuleDescription = java.lang.String
  type RuleName = java.lang.String
  type RuleNameList = js.Array[RuleName]
  type RuleResponseList = js.Array[Rule]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - java.lang.String
  */
  type RuleState = _RuleState | java.lang.String
  type RunCommandTargetKey = java.lang.String
  type RunCommandTargetValue = java.lang.String
  type RunCommandTargetValues = js.Array[RunCommandTargetValue]
  type RunCommandTargets = js.Array[RunCommandTarget]
  type ScheduleExpression = java.lang.String
  type StatementId = java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type TargetArn = java.lang.String
  type TargetId = java.lang.String
  type TargetIdList = js.Array[TargetId]
  type TargetInput = java.lang.String
  type TargetInputPath = java.lang.String
  type TargetList = js.Array[Target]
  type TargetPartitionKeyPath = java.lang.String
  type Timestamp = stdLib.Date
  type TransformerInput = java.lang.String
  type TransformerPaths = org.scalablytyped.runtime.StringDictionary[TargetInputPath]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-10-07`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
