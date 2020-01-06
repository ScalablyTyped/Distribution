package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsInspectorMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.EN_US
  import typings.awsDashSdk.awsDashSdkStrings.`ec2-instance`
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AddRemoveAttributesFindingArnList = js.Array[Arn]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HEALTHY
    - typings.awsDashSdk.awsDashSdkStrings.UNHEALTHY
    - typings.awsDashSdk.awsDashSdkStrings.UNKNOWN
    - java.lang.String
  */
  type AgentHealth = _AgentHealth | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IDLE
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.SHUTDOWN
    - typings.awsDashSdk.awsDashSdkStrings.UNHEALTHY
    - typings.awsDashSdk.awsDashSdkStrings.THROTTLED
    - typings.awsDashSdk.awsDashSdkStrings.UNKNOWN
    - java.lang.String
  */
  type AgentHealthCode = _AgentHealthCode | String
  type AgentHealthCodeList = js.Array[AgentHealthCode]
  type AgentHealthList = js.Array[AgentHealth]
  type AgentId = String
  type AgentIdList = js.Array[AgentId]
  type AgentPreviewList = js.Array[AgentPreview]
  type AgentVersion = String
  type AmiId = String
  type Arn = String
  type ArnCount = Double
  type AssessmentRulesPackageArnList = js.Array[Arn]
  type AssessmentRunAgentList = js.Array[AssessmentRunAgent]
  type AssessmentRunDuration = Double
  type AssessmentRunFindingCounts = StringDictionary[FindingCount]
  type AssessmentRunList = js.Array[AssessmentRun]
  type AssessmentRunName = String
  type AssessmentRunNotificationList = js.Array[AssessmentRunNotification]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUCCESS
    - typings.awsDashSdk.awsDashSdkStrings.TOPIC_DOES_NOT_EXIST
    - typings.awsDashSdk.awsDashSdkStrings.ACCESS_DENIED
    - typings.awsDashSdk.awsDashSdkStrings.INTERNAL_ERROR
    - java.lang.String
  */
  type AssessmentRunNotificationSnsStatusCode = _AssessmentRunNotificationSnsStatusCode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATED
    - typings.awsDashSdk.awsDashSdkStrings.START_DATA_COLLECTION_PENDING
    - typings.awsDashSdk.awsDashSdkStrings.START_DATA_COLLECTION_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.COLLECTING_DATA
    - typings.awsDashSdk.awsDashSdkStrings.STOP_DATA_COLLECTION_PENDING
    - typings.awsDashSdk.awsDashSdkStrings.DATA_COLLECTED
    - typings.awsDashSdk.awsDashSdkStrings.START_EVALUATING_RULES_PENDING
    - typings.awsDashSdk.awsDashSdkStrings.EVALUATING_RULES
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED_WITH_ERRORS
    - typings.awsDashSdk.awsDashSdkStrings.CANCELED
    - java.lang.String
  */
  type AssessmentRunState = _AssessmentRunState | String
  type AssessmentRunStateChangeList = js.Array[AssessmentRunStateChange]
  type AssessmentRunStateList = js.Array[AssessmentRunState]
  type AssessmentTargetList = js.Array[AssessmentTarget]
  type AssessmentTargetName = String
  type AssessmentTemplateList = js.Array[AssessmentTemplate]
  type AssessmentTemplateName = String
  type AssessmentTemplateRulesPackageArnList = js.Array[Arn]
  type AssetType = `ec2-instance` | String
  type AttributeKey = String
  type AttributeList = js.Array[Attribute]
  type AttributeValue = String
  type AutoScalingGroup = String
  type AutoScalingGroupList = js.Array[AutoScalingGroup]
  type BatchDescribeArnList = js.Array[Arn]
  type BatchDescribeExclusionsArnList = js.Array[Arn]
  type Bool = Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type EventSubscriptionList = js.Array[EventSubscription]
  type ExclusionMap = StringDictionary[Exclusion]
  type ExclusionPreviewList = js.Array[ExclusionPreview]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INVALID_ARN
    - typings.awsDashSdk.awsDashSdkStrings.DUPLICATE_ARN
    - typings.awsDashSdk.awsDashSdkStrings.ITEM_DOES_NOT_EXIST
    - typings.awsDashSdk.awsDashSdkStrings.ACCESS_DENIED
    - typings.awsDashSdk.awsDashSdkStrings.LIMIT_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.INTERNAL_ERROR
    - java.lang.String
  */
  type FailedItemErrorCode = _FailedItemErrorCode | String
  type FailedItems = StringDictionary[FailedItemDetails]
  type FilterRulesPackageArnList = js.Array[Arn]
  type FindingCount = Double
  type FindingId = String
  type FindingList = js.Array[Finding]
  type Hostname = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ASSESSMENT_RUN_STARTED
    - typings.awsDashSdk.awsDashSdkStrings.ASSESSMENT_RUN_COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.ASSESSMENT_RUN_STATE_CHANGED
    - typings.awsDashSdk.awsDashSdkStrings.FINDING_REPORTED
    - typings.awsDashSdk.awsDashSdkStrings.OTHER
    - java.lang.String
  */
  type InspectorEvent = _InspectorEvent | String
  type IocConfidence = Double
  type Ipv4Address = String
  type Ipv4AddressList = js.Array[Ipv4Address]
  type Ipv6Addresses = js.Array[Text]
  type KernelVersion = String
  type ListEventSubscriptionsMaxResults = Double
  type ListMaxResults = Double
  type ListParentArnList = js.Array[Arn]
  type ListReturnedArnList = js.Array[Arn]
  type Locale = EN_US | String
  type Long = Double
  type Message = String
  type MessageType = String
  type NamePattern = String
  type NetworkInterfaces = js.Array[NetworkInterface]
  type NumericSeverity = Double
  type NumericVersion = Double
  type OperatingSystem = String
  type PaginationToken = String
  type PreviewAgentsMaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.WORK_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - java.lang.String
  */
  type PreviewStatus = _PreviewStatus | String
  type PrivateIpAddresses = js.Array[PrivateIp]
  type ProviderName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HTML
    - typings.awsDashSdk.awsDashSdkStrings.PDF
    - java.lang.String
  */
  type ReportFileFormat = _ReportFileFormat | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.WORK_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - java.lang.String
  */
  type ReportStatus = _ReportStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FINDING
    - typings.awsDashSdk.awsDashSdkStrings.FULL
    - java.lang.String
  */
  type ReportType = _ReportType | String
  type ResourceGroupList = js.Array[ResourceGroup]
  type ResourceGroupTags = js.Array[ResourceGroupTag]
  type RuleName = String
  type RuleNameList = js.Array[RuleName]
  type RulesPackageList = js.Array[RulesPackage]
  type RulesPackageName = String
  type ScopeList = js.Array[Scope]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INSTANCE_ID
    - typings.awsDashSdk.awsDashSdkStrings.RULES_PACKAGE_ARN
    - java.lang.String
  */
  type ScopeType = _ScopeType | String
  type ScopeValue = String
  type SecurityGroups = js.Array[SecurityGroup]
  type ServiceName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Low_
    - typings.awsDashSdk.awsDashSdkStrings.Medium_
    - typings.awsDashSdk.awsDashSdkStrings.High_
    - typings.awsDashSdk.awsDashSdkStrings.Informational_
    - typings.awsDashSdk.awsDashSdkStrings.Undefined_
    - java.lang.String
  */
  type Severity = _Severity | String
  type SeverityList = js.Array[Severity]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.START_EVALUATION
    - typings.awsDashSdk.awsDashSdkStrings.SKIP_EVALUATION
    - java.lang.String
  */
  type StopAction = _StopAction | String
  type SubscriptionList = js.Array[Subscription]
  type TagKey = String
  type TagList = js.Array[Tag]
  type TagValue = String
  type Tags = js.Array[Tag]
  type TelemetryMetadataList = js.Array[TelemetryMetadata]
  type Text = String
  type Timestamp = Date
  type UUID = String
  type Url = String
  type UserAttributeKeyList = js.Array[AttributeKey]
  type UserAttributeList = js.Array[Attribute]
  type Version = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2015-08-18`
    - typings.awsDashSdk.awsDashSdkStrings.`2016-02-16`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
