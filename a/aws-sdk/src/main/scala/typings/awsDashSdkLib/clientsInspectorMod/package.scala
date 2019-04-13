package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsInspectorMod {
  type AddRemoveAttributesFindingArnList = js.Array[Arn]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HEALTHY
    - awsDashSdkLib.awsDashSdkLibStrings.UNHEALTHY
    - awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN
    - java.lang.String
  */
  type AgentHealth = _AgentHealth | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IDLE
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.SHUTDOWN
    - awsDashSdkLib.awsDashSdkLibStrings.UNHEALTHY
    - awsDashSdkLib.awsDashSdkLibStrings.THROTTLED
    - awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN
    - java.lang.String
  */
  type AgentHealthCode = _AgentHealthCode | java.lang.String
  type AgentHealthCodeList = js.Array[AgentHealthCode]
  type AgentHealthList = js.Array[AgentHealth]
  type AgentId = java.lang.String
  type AgentIdList = js.Array[AgentId]
  type AgentPreviewList = js.Array[AgentPreview]
  type AgentVersion = java.lang.String
  type AmiId = java.lang.String
  type Arn = java.lang.String
  type ArnCount = scala.Double
  type AssessmentRulesPackageArnList = js.Array[Arn]
  type AssessmentRunAgentList = js.Array[AssessmentRunAgent]
  type AssessmentRunDuration = scala.Double
  type AssessmentRunFindingCounts = org.scalablytyped.runtime.StringDictionary[FindingCount]
  type AssessmentRunList = js.Array[AssessmentRun]
  type AssessmentRunName = java.lang.String
  type AssessmentRunNotificationList = js.Array[AssessmentRunNotification]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCESS
    - awsDashSdkLib.awsDashSdkLibStrings.TOPIC_DOES_NOT_EXIST
    - awsDashSdkLib.awsDashSdkLibStrings.ACCESS_DENIED
    - awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_ERROR
    - java.lang.String
  */
  type AssessmentRunNotificationSnsStatusCode = _AssessmentRunNotificationSnsStatusCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATED
    - awsDashSdkLib.awsDashSdkLibStrings.START_DATA_COLLECTION_PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.START_DATA_COLLECTION_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.COLLECTING_DATA
    - awsDashSdkLib.awsDashSdkLibStrings.STOP_DATA_COLLECTION_PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.DATA_COLLECTED
    - awsDashSdkLib.awsDashSdkLibStrings.START_EVALUATING_RULES_PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.EVALUATING_RULES
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED_WITH_ERRORS
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELED
    - java.lang.String
  */
  type AssessmentRunState = _AssessmentRunState | java.lang.String
  type AssessmentRunStateChangeList = js.Array[AssessmentRunStateChange]
  type AssessmentRunStateList = js.Array[AssessmentRunState]
  type AssessmentTargetList = js.Array[AssessmentTarget]
  type AssessmentTargetName = java.lang.String
  type AssessmentTemplateList = js.Array[AssessmentTemplate]
  type AssessmentTemplateName = java.lang.String
  type AssessmentTemplateRulesPackageArnList = js.Array[Arn]
  type AssetType = awsDashSdkLib.awsDashSdkLibStrings.`ec2-instance` | java.lang.String
  type AttributeKey = java.lang.String
  type AttributeList = js.Array[Attribute]
  type AttributeValue = java.lang.String
  type AutoScalingGroup = java.lang.String
  type AutoScalingGroupList = js.Array[AutoScalingGroup]
  type BatchDescribeArnList = js.Array[Arn]
  type BatchDescribeExclusionsArnList = js.Array[Arn]
  type Bool = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type EventSubscriptionList = js.Array[EventSubscription]
  type ExclusionMap = org.scalablytyped.runtime.StringDictionary[Exclusion]
  type ExclusionPreviewList = js.Array[ExclusionPreview]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INVALID_ARN
    - awsDashSdkLib.awsDashSdkLibStrings.DUPLICATE_ARN
    - awsDashSdkLib.awsDashSdkLibStrings.ITEM_DOES_NOT_EXIST
    - awsDashSdkLib.awsDashSdkLibStrings.ACCESS_DENIED
    - awsDashSdkLib.awsDashSdkLibStrings.LIMIT_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_ERROR
    - java.lang.String
  */
  type FailedItemErrorCode = _FailedItemErrorCode | java.lang.String
  type FailedItems = org.scalablytyped.runtime.StringDictionary[FailedItemDetails]
  type FilterRulesPackageArnList = js.Array[Arn]
  type FindingCount = scala.Double
  type FindingId = java.lang.String
  type FindingList = js.Array[Finding]
  type Hostname = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ASSESSMENT_RUN_STARTED
    - awsDashSdkLib.awsDashSdkLibStrings.ASSESSMENT_RUN_COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.ASSESSMENT_RUN_STATE_CHANGED
    - awsDashSdkLib.awsDashSdkLibStrings.FINDING_REPORTED
    - awsDashSdkLib.awsDashSdkLibStrings.OTHER
    - java.lang.String
  */
  type InspectorEvent = _InspectorEvent | java.lang.String
  type IocConfidence = scala.Double
  type Ipv4Address = java.lang.String
  type Ipv4AddressList = js.Array[Ipv4Address]
  type Ipv6Addresses = js.Array[Text]
  type KernelVersion = java.lang.String
  type ListEventSubscriptionsMaxResults = scala.Double
  type ListMaxResults = scala.Double
  type ListParentArnList = js.Array[Arn]
  type ListReturnedArnList = js.Array[Arn]
  type Locale = awsDashSdkLib.awsDashSdkLibStrings.EN_US | java.lang.String
  type Long = scala.Double
  type Message = java.lang.String
  type MessageType = java.lang.String
  type NamePattern = java.lang.String
  type NetworkInterfaces = js.Array[NetworkInterface]
  type NumericSeverity = scala.Double
  type NumericVersion = scala.Double
  type OperatingSystem = java.lang.String
  type PaginationToken = java.lang.String
  type PreviewAgentsMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.WORK_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - java.lang.String
  */
  type PreviewStatus = _PreviewStatus | java.lang.String
  type PrivateIpAddresses = js.Array[PrivateIp]
  type ProviderName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HTML
    - awsDashSdkLib.awsDashSdkLibStrings.PDF
    - java.lang.String
  */
  type ReportFileFormat = _ReportFileFormat | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.WORK_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - java.lang.String
  */
  type ReportStatus = _ReportStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FINDING
    - awsDashSdkLib.awsDashSdkLibStrings.FULL
    - java.lang.String
  */
  type ReportType = _ReportType | java.lang.String
  type ResourceGroupList = js.Array[ResourceGroup]
  type ResourceGroupTags = js.Array[ResourceGroupTag]
  type RuleName = java.lang.String
  type RuleNameList = js.Array[RuleName]
  type RulesPackageList = js.Array[RulesPackage]
  type RulesPackageName = java.lang.String
  type ScopeList = js.Array[Scope]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_ID
    - awsDashSdkLib.awsDashSdkLibStrings.RULES_PACKAGE_ARN
    - java.lang.String
  */
  type ScopeType = _ScopeType | java.lang.String
  type ScopeValue = java.lang.String
  type SecurityGroups = js.Array[SecurityGroup]
  type ServiceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Low
    - awsDashSdkLib.awsDashSdkLibStrings.Medium
    - awsDashSdkLib.awsDashSdkLibStrings.High
    - awsDashSdkLib.awsDashSdkLibStrings.Informational
    - awsDashSdkLib.awsDashSdkLibStrings.Undefined
    - java.lang.String
  */
  type Severity = _Severity | java.lang.String
  type SeverityList = js.Array[Severity]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.START_EVALUATION
    - awsDashSdkLib.awsDashSdkLibStrings.SKIP_EVALUATION
    - java.lang.String
  */
  type StopAction = _StopAction | java.lang.String
  type SubscriptionList = js.Array[Subscription]
  type TagKey = java.lang.String
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  type TelemetryMetadataList = js.Array[TelemetryMetadata]
  type Text = java.lang.String
  type Timestamp = stdLib.Date
  type UUID = java.lang.String
  type Url = java.lang.String
  type UserAttributeKeyList = js.Array[AttributeKey]
  type UserAttributeList = js.Array[Attribute]
  type Version = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-08-18`
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-02-16`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
