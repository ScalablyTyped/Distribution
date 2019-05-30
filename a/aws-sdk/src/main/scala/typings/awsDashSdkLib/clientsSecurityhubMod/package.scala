package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSecurityhubMod {
  type AccountDetailsList = js.Array[AccountDetails]
  type AccountId = java.lang.String
  type AccountIdList = js.Array[NonEmptyString]
  type ArnList = js.Array[NonEmptyString]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Active
    - awsDashSdkLib.awsDashSdkLibStrings.Inactive
    - java.lang.String
  */
  type AwsIamAccessKeyStatus = _AwsIamAccessKeyStatus | java.lang.String
  type AwsSecurityFindingList = js.Array[AwsSecurityFinding]
  type Boolean = scala.Boolean
  type CategoryList = js.Array[NonEmptyString]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PASSED
    - awsDashSdkLib.awsDashSdkLibStrings.WARNING
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_AVAILABLE
    - java.lang.String
  */
  type ComplianceStatus = _ComplianceStatus | java.lang.String
  type DateFilterList = js.Array[DateFilter]
  type DateRangeUnit = awsDashSdkLib.awsDashSdkLibStrings.DAYS | java.lang.String
  type Double = scala.Double
  type FieldMap = org.scalablytyped.runtime.StringDictionary[NonEmptyString]
  type ImportFindingsErrorList = js.Array[ImportFindingsError]
  type InsightList = js.Array[Insight]
  type InsightResultValueList = js.Array[InsightResultValue]
  type Integer = scala.Double
  type InvitationList = js.Array[Invitation]
  type IpFilterList = js.Array[IpFilter]
  type KeywordFilterList = js.Array[KeywordFilter]
  type MalwareList = js.Array[Malware]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.OBSERVED
    - awsDashSdkLib.awsDashSdkLibStrings.REMOVAL_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.REMOVED
    - java.lang.String
  */
  type MalwareState = _MalwareState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ADWARE
    - awsDashSdkLib.awsDashSdkLibStrings.BLENDED_THREAT
    - awsDashSdkLib.awsDashSdkLibStrings.BOTNET_AGENT
    - awsDashSdkLib.awsDashSdkLibStrings.COIN_MINER
    - awsDashSdkLib.awsDashSdkLibStrings.EXPLOIT_KIT
    - awsDashSdkLib.awsDashSdkLibStrings.KEYLOGGER
    - awsDashSdkLib.awsDashSdkLibStrings.MACRO
    - awsDashSdkLib.awsDashSdkLibStrings.POTENTIALLY_UNWANTED
    - awsDashSdkLib.awsDashSdkLibStrings.SPYWARE
    - awsDashSdkLib.awsDashSdkLibStrings.RANSOMWARE
    - awsDashSdkLib.awsDashSdkLibStrings.REMOTE_ACCESS
    - awsDashSdkLib.awsDashSdkLibStrings.ROOTKIT
    - awsDashSdkLib.awsDashSdkLibStrings.TROJAN
    - awsDashSdkLib.awsDashSdkLibStrings.VIRUS
    - awsDashSdkLib.awsDashSdkLibStrings.WORM
    - java.lang.String
  */
  type MalwareType = _MalwareType | java.lang.String
  type MapFilterComparison = awsDashSdkLib.awsDashSdkLibStrings.EQUALS | java.lang.String
  type MapFilterList = js.Array[MapFilter]
  type MaxResults = scala.Double
  type MemberList = js.Array[Member]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IN
    - awsDashSdkLib.awsDashSdkLibStrings.OUT
    - java.lang.String
  */
  type NetworkDirection = _NetworkDirection | java.lang.String
  type NextToken = java.lang.String
  type NonEmptyString = java.lang.String
  type NumberFilterList = js.Array[NumberFilter]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.aws
    - awsDashSdkLib.awsDashSdkLibStrings.`aws-cn`
    - awsDashSdkLib.awsDashSdkLibStrings.`aws-us-gov`
    - java.lang.String
  */
  type Partition = _Partition | java.lang.String
  type ProductSubscribersList = js.Array[NonEmptyString]
  type ProductSubscriptionArnList = js.Array[NonEmptyString]
  type ProductsList = js.Array[Product]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.ARCHIVED
    - java.lang.String
  */
  type RecordState = _RecordState | java.lang.String
  type RelatedFindingList = js.Array[RelatedFinding]
  type ResourceList = js.Array[Resource]
  type ResultList = js.Array[Result]
  type SortCriteria = js.Array[SortCriterion]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.asc
    - awsDashSdkLib.awsDashSdkLibStrings.desc
    - java.lang.String
  */
  type SortOrder = _SortOrder | java.lang.String
  type StandardsInputParameterMap = org.scalablytyped.runtime.StringDictionary[NonEmptyString]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.READY
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.INCOMPLETE
    - java.lang.String
  */
  type StandardsStatus = _StandardsStatus | java.lang.String
  type StandardsSubscriptionArns = js.Array[NonEmptyString]
  type StandardsSubscriptionRequests = js.Array[StandardsSubscriptionRequest]
  type StandardsSubscriptions = js.Array[StandardsSubscription]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EQUALS
    - awsDashSdkLib.awsDashSdkLibStrings.PREFIX
    - java.lang.String
  */
  type StringFilterComparison = _StringFilterComparison | java.lang.String
  type StringFilterList = js.Array[StringFilter]
  type StringList = js.Array[NonEmptyString]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.BACKDOOR
    - awsDashSdkLib.awsDashSdkLibStrings.CARD_STEALER
    - awsDashSdkLib.awsDashSdkLibStrings.COMMAND_AND_CONTROL
    - awsDashSdkLib.awsDashSdkLibStrings.DROP_SITE
    - awsDashSdkLib.awsDashSdkLibStrings.EXPLOIT_SITE
    - awsDashSdkLib.awsDashSdkLibStrings.KEYLOGGER
    - java.lang.String
  */
  type ThreatIntelIndicatorCategory = _ThreatIntelIndicatorCategory | java.lang.String
  type ThreatIntelIndicatorList = js.Array[ThreatIntelIndicator]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DOMAIN
    - awsDashSdkLib.awsDashSdkLibStrings.EMAIL_ADDRESS
    - awsDashSdkLib.awsDashSdkLibStrings.HASH_MD5
    - awsDashSdkLib.awsDashSdkLibStrings.HASH_SHA1
    - awsDashSdkLib.awsDashSdkLibStrings.HASH_SHA256
    - awsDashSdkLib.awsDashSdkLibStrings.HASH_SHA512
    - awsDashSdkLib.awsDashSdkLibStrings.IPV4_ADDRESS
    - awsDashSdkLib.awsDashSdkLibStrings.IPV6_ADDRESS
    - awsDashSdkLib.awsDashSdkLibStrings.MUTEX
    - awsDashSdkLib.awsDashSdkLibStrings.PROCESS
    - awsDashSdkLib.awsDashSdkLibStrings.URL
    - java.lang.String
  */
  type ThreatIntelIndicatorType = _ThreatIntelIndicatorType | java.lang.String
  type Timestamp = stdLib.Date
  type TypeList = js.Array[NonEmptyString]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN
    - awsDashSdkLib.awsDashSdkLibStrings.TRUE_POSITIVE
    - awsDashSdkLib.awsDashSdkLibStrings.FALSE_POSITIVE
    - awsDashSdkLib.awsDashSdkLibStrings.BENIGN_POSITIVE
    - java.lang.String
  */
  type VerificationState = _VerificationState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NEW
    - awsDashSdkLib.awsDashSdkLibStrings.ASSIGNED
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.DEFERRED
    - awsDashSdkLib.awsDashSdkLibStrings.RESOLVED
    - java.lang.String
  */
  type WorkflowState = _WorkflowState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-10-26`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
