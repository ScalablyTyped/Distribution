package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSecurityhubMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.DAYS
  import typings.awsDashSdk.awsDashSdkStrings.EQUALS
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AccountDetailsList = js.Array[AccountDetails]
  type AccountId = String
  type AccountIdList = js.Array[NonEmptyString]
  type ActionTargetList = js.Array[ActionTarget]
  type ArnList = js.Array[NonEmptyString]
  type AvailabilityZones = js.Array[AvailabilityZone]
  type AwsCloudFrontDistributionOriginItemList = js.Array[AwsCloudFrontDistributionOriginItem]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Active_
    - typings.awsDashSdk.awsDashSdkStrings.Inactive_
    - java.lang.String
  */
  type AwsIamAccessKeyStatus = _AwsIamAccessKeyStatus | String
  type AwsIamRoleAssumeRolePolicyDocument = String
  type AwsLambdaFunctionLayerList = js.Array[AwsLambdaFunctionLayer]
  type AwsSecurityFindingList = js.Array[AwsSecurityFinding]
  type AwsSnsTopicSubscriptionList = js.Array[AwsSnsTopicSubscription]
  type Boolean = scala.Boolean
  type CategoryList = js.Array[NonEmptyString]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PASSED
    - typings.awsDashSdk.awsDashSdkStrings.WARNING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.NOT_AVAILABLE
    - java.lang.String
  */
  type ComplianceStatus = _ComplianceStatus | String
  type DateFilterList = js.Array[DateFilter]
  type DateRangeUnit = DAYS | String
  type Double = scala.Double
  type FieldMap = StringDictionary[NonEmptyString]
  type ImportFindingsErrorList = js.Array[ImportFindingsError]
  type InsightList = js.Array[Insight]
  type InsightResultValueList = js.Array[InsightResultValue]
  type Integer = scala.Double
  type InvitationList = js.Array[Invitation]
  type IpFilterList = js.Array[IpFilter]
  type KeywordFilterList = js.Array[KeywordFilter]
  type MalwareList = js.Array[Malware]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OBSERVED
    - typings.awsDashSdk.awsDashSdkStrings.REMOVAL_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.REMOVED
    - java.lang.String
  */
  type MalwareState = _MalwareState | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ADWARE
    - typings.awsDashSdk.awsDashSdkStrings.BLENDED_THREAT
    - typings.awsDashSdk.awsDashSdkStrings.BOTNET_AGENT
    - typings.awsDashSdk.awsDashSdkStrings.COIN_MINER
    - typings.awsDashSdk.awsDashSdkStrings.EXPLOIT_KIT
    - typings.awsDashSdk.awsDashSdkStrings.KEYLOGGER
    - typings.awsDashSdk.awsDashSdkStrings.MACRO
    - typings.awsDashSdk.awsDashSdkStrings.POTENTIALLY_UNWANTED
    - typings.awsDashSdk.awsDashSdkStrings.SPYWARE
    - typings.awsDashSdk.awsDashSdkStrings.RANSOMWARE
    - typings.awsDashSdk.awsDashSdkStrings.REMOTE_ACCESS
    - typings.awsDashSdk.awsDashSdkStrings.ROOTKIT
    - typings.awsDashSdk.awsDashSdkStrings.TROJAN
    - typings.awsDashSdk.awsDashSdkStrings.VIRUS
    - typings.awsDashSdk.awsDashSdkStrings.WORM
    - java.lang.String
  */
  type MalwareType = _MalwareType | String
  type MapFilterComparison = EQUALS | String
  type MapFilterList = js.Array[MapFilter]
  type MaxResults = scala.Double
  type MemberList = js.Array[Member]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IN
    - typings.awsDashSdk.awsDashSdkStrings.OUT
    - java.lang.String
  */
  type NetworkDirection = _NetworkDirection | String
  type NextToken = String
  type NonEmptyString = String
  type NonEmptyStringList = js.Array[NonEmptyString]
  type NumberFilterList = js.Array[NumberFilter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.aws_
    - typings.awsDashSdk.awsDashSdkStrings.`aws-cn`
    - typings.awsDashSdk.awsDashSdkStrings.`aws-us-gov`
    - java.lang.String
  */
  type Partition = _Partition | String
  type ProductSubscriptionArnList = js.Array[NonEmptyString]
  type ProductsList = js.Array[Product]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.ARCHIVED
    - java.lang.String
  */
  type RecordState = _RecordState | String
  type RelatedFindingList = js.Array[RelatedFinding]
  type ResourceArn = String
  type ResourceList = js.Array[Resource]
  type ResultList = js.Array[Result]
  type SecurityGroups = js.Array[NonEmptyString]
  type SortCriteria = js.Array[SortCriterion]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.asc_
    - typings.awsDashSdk.awsDashSdkStrings.desc_
    - java.lang.String
  */
  type SortOrder = _SortOrder | String
  type StandardsInputParameterMap = StringDictionary[NonEmptyString]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.READY
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.INCOMPLETE
    - java.lang.String
  */
  type StandardsStatus = _StandardsStatus | String
  type StandardsSubscriptionArns = js.Array[NonEmptyString]
  type StandardsSubscriptionRequests = js.Array[StandardsSubscriptionRequest]
  type StandardsSubscriptions = js.Array[StandardsSubscription]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EQUALS
    - typings.awsDashSdk.awsDashSdkStrings.PREFIX
    - java.lang.String
  */
  type StringFilterComparison = _StringFilterComparison | String
  type StringFilterList = js.Array[StringFilter]
  type StringList = js.Array[NonEmptyString]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = StringDictionary[TagValue]
  type TagValue = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BACKDOOR
    - typings.awsDashSdk.awsDashSdkStrings.CARD_STEALER
    - typings.awsDashSdk.awsDashSdkStrings.COMMAND_AND_CONTROL
    - typings.awsDashSdk.awsDashSdkStrings.DROP_SITE
    - typings.awsDashSdk.awsDashSdkStrings.EXPLOIT_SITE
    - typings.awsDashSdk.awsDashSdkStrings.KEYLOGGER
    - java.lang.String
  */
  type ThreatIntelIndicatorCategory = _ThreatIntelIndicatorCategory | String
  type ThreatIntelIndicatorList = js.Array[ThreatIntelIndicator]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DOMAIN
    - typings.awsDashSdk.awsDashSdkStrings.EMAIL_ADDRESS
    - typings.awsDashSdk.awsDashSdkStrings.HASH_MD5
    - typings.awsDashSdk.awsDashSdkStrings.HASH_SHA1
    - typings.awsDashSdk.awsDashSdkStrings.HASH_SHA256
    - typings.awsDashSdk.awsDashSdkStrings.HASH_SHA512
    - typings.awsDashSdk.awsDashSdkStrings.IPV4_ADDRESS
    - typings.awsDashSdk.awsDashSdkStrings.IPV6_ADDRESS
    - typings.awsDashSdk.awsDashSdkStrings.MUTEX
    - typings.awsDashSdk.awsDashSdkStrings.PROCESS
    - typings.awsDashSdk.awsDashSdkStrings.URL
    - java.lang.String
  */
  type ThreatIntelIndicatorType = _ThreatIntelIndicatorType | String
  type Timestamp = Date
  type TypeList = js.Array[NonEmptyString]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.UNKNOWN
    - typings.awsDashSdk.awsDashSdkStrings.TRUE_POSITIVE
    - typings.awsDashSdk.awsDashSdkStrings.FALSE_POSITIVE
    - typings.awsDashSdk.awsDashSdkStrings.BENIGN_POSITIVE
    - java.lang.String
  */
  type VerificationState = _VerificationState | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NEW
    - typings.awsDashSdk.awsDashSdkStrings.ASSIGNED
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.DEFERRED
    - typings.awsDashSdk.awsDashSdkStrings.RESOLVED
    - java.lang.String
  */
  type WorkflowState = _WorkflowState | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-10-26`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
