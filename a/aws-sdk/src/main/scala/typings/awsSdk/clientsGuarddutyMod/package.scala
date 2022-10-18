package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.COUNT_BY_SEVERITY
import typings.awsSdk.awsSdkStrings.EC2_INSTANCE_TAG
import typings.awsSdk.awsSdkStrings.S3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountDetails = js.Array[AccountDetail]

type AccountFreeTrialInfos = js.Array[AccountFreeTrialInfo]

type AccountId = java.lang.String

type AccountIds = js.Array[AccountId]

type AdminAccounts = js.Array[AdminAccount]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLE_IN_PROGRESS
  - java.lang.String
*/
type AdminStatus = _AdminStatus | java.lang.String

type AffectedResources = StringDictionary[String]

type Boolean = scala.Boolean

type ClientToken = java.lang.String

type Containers = js.Array[Container]

type CountBySeverity = StringDictionary[Integer]

type Criterion = StringDictionary[Condition]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EC2_INSTANCE_ARN
  - typings.awsSdk.awsSdkStrings.SCAN_ID
  - typings.awsSdk.awsSdkStrings.ACCOUNT_ID
  - typings.awsSdk.awsSdkStrings.GUARDDUTY_FINDING_ID
  - typings.awsSdk.awsSdkStrings.SCAN_START_TIME
  - typings.awsSdk.awsSdkStrings.SCAN_STATUS
  - java.lang.String
*/
type CriterionKey = _CriterionKey | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FLOW_LOGS
  - typings.awsSdk.awsSdkStrings.CLOUD_TRAIL
  - typings.awsSdk.awsSdkStrings.DNS_LOGS
  - typings.awsSdk.awsSdkStrings.S3_LOGS
  - typings.awsSdk.awsSdkStrings.KUBERNETES_AUDIT_LOGS
  - typings.awsSdk.awsSdkStrings.EC2_MALWARE_SCAN
  - java.lang.String
*/
type DataSource = _DataSource | java.lang.String

type DataSourceList = js.Array[DataSource]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type DataSourceStatus = _DataSourceStatus | java.lang.String

type DestinationType = S3 | java.lang.String

type Destinations = js.Array[Destination]

type DetectorId = java.lang.String

type DetectorIds = js.Array[DetectorId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type DetectorStatus = _DetectorStatus | java.lang.String

type Double = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NO_RETENTION
  - typings.awsSdk.awsSdkStrings.RETENTION_WITH_FINDING
  - java.lang.String
*/
type EbsSnapshotPreservation = _EbsSnapshotPreservation | java.lang.String

type Email = java.lang.String

type Eq = js.Array[String]

type Equals = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USEFUL
  - typings.awsSdk.awsSdkStrings.NOT_USEFUL
  - java.lang.String
*/
type Feedback = _Feedback | java.lang.String

type FilePaths = js.Array[ScanFilePath]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOOP
  - typings.awsSdk.awsSdkStrings.ARCHIVE
  - java.lang.String
*/
type FilterAction = _FilterAction | java.lang.String

type FilterCriterionList = js.Array[FilterCriterion]

type FilterDescription = java.lang.String

type FilterName = java.lang.String

type FilterNames = js.Array[FilterName]

type FilterRank = scala.Double

type FindingId = java.lang.String

type FindingIds = js.Array[FindingId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FIFTEEN_MINUTES
  - typings.awsSdk.awsSdkStrings.ONE_HOUR
  - typings.awsSdk.awsSdkStrings.SIX_HOURS
  - java.lang.String
*/
type FindingPublishingFrequency = _FindingPublishingFrequency | java.lang.String

type FindingStatisticType = COUNT_BY_SEVERITY | java.lang.String

type FindingStatisticTypes = js.Array[FindingStatisticType]

type FindingType = java.lang.String

type FindingTypes = js.Array[FindingType]

type Findings = js.Array[Finding]

type Groups = js.Array[String]

type GuardDutyArn = java.lang.String

type InstanceArn = java.lang.String

type Integer = scala.Double

type IntegerValueWithMax = scala.Double

type Invitations = js.Array[Invitation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TXT
  - typings.awsSdk.awsSdkStrings.STIX
  - typings.awsSdk.awsSdkStrings.OTX_CSV
  - typings.awsSdk.awsSdkStrings.ALIEN_VAULT
  - typings.awsSdk.awsSdkStrings.PROOF_POINT
  - typings.awsSdk.awsSdkStrings.FIRE_EYE
  - java.lang.String
*/
type IpSetFormat = _IpSetFormat | java.lang.String

type IpSetIds = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - typings.awsSdk.awsSdkStrings.ACTIVATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DEACTIVATING
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.DELETE_PENDING
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type IpSetStatus = _IpSetStatus | java.lang.String

type Ipv6Addresses = js.Array[String]

type Location = java.lang.String

type Long = scala.Double

type LongValue = scala.Double

type MapEquals = js.Array[ScanConditionPair]

type MaxResults = scala.Double

type MemberDataSourceConfigurations = js.Array[MemberDataSourceConfiguration]

type Members = js.Array[Member]

type Name = java.lang.String

type Neq = js.Array[String]

type NetworkInterfaces = js.Array[NetworkInterface]

type NonEmptyString = java.lang.String

type NotEquals = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASC
  - typings.awsSdk.awsSdkStrings.DESC
  - java.lang.String
*/
type OrderBy = _OrderBy | java.lang.String

type PortProbeDetails = js.Array[PortProbeDetail]

type PositiveLong = scala.Double

type PrivateIpAddresses = js.Array[PrivateIpAddressDetails]

type ProductCodes = js.Array[ProductCode]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING_VERIFICATION
  - typings.awsSdk.awsSdkStrings.PUBLISHING
  - typings.awsSdk.awsSdkStrings.UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY
  - typings.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type PublishingStatus = _PublishingStatus | java.lang.String

type ResourceList = js.Array[String]

type S3BucketDetails = js.Array[S3BucketDetail]

type ScanCriterion = StringDictionary[ScanCondition]

type ScanCriterionKey = EC2_INSTANCE_TAG | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CLEAN
  - typings.awsSdk.awsSdkStrings.INFECTED
  - java.lang.String
*/
type ScanResult = _ScanResult | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ScanStatus = _ScanStatus | java.lang.String

type ScanThreatNames = js.Array[ScanThreatName]

type Scans = js.Array[Scan]

type SecurityGroups = js.Array[SecurityGroup]

type SourceIps = js.Array[String]

type Sources = js.Array[String]

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type Tags = js.Array[Tag]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TXT
  - typings.awsSdk.awsSdkStrings.STIX
  - typings.awsSdk.awsSdkStrings.OTX_CSV
  - typings.awsSdk.awsSdkStrings.ALIEN_VAULT
  - typings.awsSdk.awsSdkStrings.PROOF_POINT
  - typings.awsSdk.awsSdkStrings.FIRE_EYE
  - java.lang.String
*/
type ThreatIntelSetFormat = _ThreatIntelSetFormat | java.lang.String

type ThreatIntelSetIds = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - typings.awsSdk.awsSdkStrings.ACTIVATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DEACTIVATING
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.DELETE_PENDING
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type ThreatIntelSetStatus = _ThreatIntelSetStatus | java.lang.String

type ThreatIntelligenceDetails = js.Array[ThreatIntelligenceDetail]

type ThreatNames = js.Array[String]

type Timestamp = js.Date

type UnprocessedAccounts = js.Array[UnprocessedAccount]

type UsageAccountResultList = js.Array[UsageAccountResult]

type UsageDataSourceResultList = js.Array[UsageDataSourceResult]

type UsageResourceResultList = js.Array[UsageResourceResult]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUM_BY_ACCOUNT
  - typings.awsSdk.awsSdkStrings.SUM_BY_DATA_SOURCE
  - typings.awsSdk.awsSdkStrings.SUM_BY_RESOURCE
  - typings.awsSdk.awsSdkStrings.TOP_RESOURCES
  - java.lang.String
*/
type UsageStatisticType = _UsageStatisticType | java.lang.String

type VolumeDetails = js.Array[VolumeDetail]

type VolumeMounts = js.Array[VolumeMount]

type Volumes = js.Array[Volume]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-11-28`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
