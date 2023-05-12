package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.ACCESS_DENIED
import typings.awsSdk.awsSdkStrings.AWS_API_CALL
import typings.awsSdk.awsSdkStrings.S3_OBJECT
import typings.awsSdk.awsSdkStrings.TERABYTES
import typings.awsSdk.awsSdkStrings.USD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLING_IN_PROGRESS
  - java.lang.String
*/
type AdminStatus = _AdminStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OK
  - typings.awsSdk.awsSdkStrings.S3_OBJECT_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.S3_USER_ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.S3_OBJECT_ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.S3_THROTTLED
  - typings.awsSdk.awsSdkStrings.S3_OBJECT_OVERSIZE
  - typings.awsSdk.awsSdkStrings.S3_OBJECT_EMPTY
  - typings.awsSdk.awsSdkStrings.UNKNOWN_ERROR
  - java.lang.String
*/
type AllowListStatusCode = _AllowListStatusCode | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TRUE
  - typings.awsSdk.awsSdkStrings.FALSE
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type AllowsUnencryptedObjectUploads = _AllowsUnencryptedObjectUploads | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type AutomatedDiscoveryStatus = _AutomatedDiscoveryStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.UNAVAILABLE
  - java.lang.String
*/
type AvailabilityCode = _AvailabilityCode | String

type BucketCriteria = StringDictionary[BucketCriteriaAdditionalProperties]

type BucketMetadataErrorCode = ACCESS_DENIED | String

type Cells = js.Array[Cell]

type ClassificationScopeId = String

type ClassificationScopeName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ADD
  - typings.awsSdk.awsSdkStrings.REPLACE
  - typings.awsSdk.awsSdkStrings.REMOVE
  - java.lang.String
*/
type ClassificationScopeUpdateOperation = _ClassificationScopeUpdateOperation | String

type Criterion = StringDictionary[CriterionAdditionalProperties]

type Currency = USD | String

type CustomDetections = js.Array[CustomDetection]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LOW
  - typings.awsSdk.awsSdkStrings.MEDIUM
  - typings.awsSdk.awsSdkStrings.HIGH
  - java.lang.String
*/
type DataIdentifierSeverity = _DataIdentifierSeverity | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CUSTOM
  - typings.awsSdk.awsSdkStrings.MANAGED
  - java.lang.String
*/
type DataIdentifierType = _DataIdentifierType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUNDAY
  - typings.awsSdk.awsSdkStrings.MONDAY
  - typings.awsSdk.awsSdkStrings.TUESDAY
  - typings.awsSdk.awsSdkStrings.WEDNESDAY
  - typings.awsSdk.awsSdkStrings.THURSDAY
  - typings.awsSdk.awsSdkStrings.FRIDAY
  - typings.awsSdk.awsSdkStrings.SATURDAY
  - java.lang.String
*/
type DayOfWeek = _DayOfWeek | String

type DefaultDetections = js.Array[DefaultDetection]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PUBLIC
  - typings.awsSdk.awsSdkStrings.NOT_PUBLIC
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type EffectivePermission = _EffectivePermission | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.AES256
  - typings.awsSdk.awsSdkStrings.awsColonkms
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type EncryptionType = _EncryptionType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ClientError
  - typings.awsSdk.awsSdkStrings.InternalError
  - java.lang.String
*/
type ErrorCode = _ErrorCode | String

type FindingActionType = AWS_API_CALL | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CLASSIFICATION
  - typings.awsSdk.awsSdkStrings.POLICY
  - java.lang.String
*/
type FindingCategory = _FindingCategory | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FIFTEEN_MINUTES
  - typings.awsSdk.awsSdkStrings.ONE_HOUR
  - typings.awsSdk.awsSdkStrings.SIX_HOURS
  - java.lang.String
*/
type FindingPublishingFrequency = _FindingPublishingFrequency | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.groupKey
  - typings.awsSdk.awsSdkStrings.count__
  - java.lang.String
*/
type FindingStatisticsSortAttributeName = _FindingStatisticsSortAttributeName | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SensitiveDataColonS3ObjectSlashMultiple
  - typings.awsSdk.awsSdkStrings.SensitiveDataColonS3ObjectSlashFinancial
  - typings.awsSdk.awsSdkStrings.SensitiveDataColonS3ObjectSlashPersonal
  - typings.awsSdk.awsSdkStrings.SensitiveDataColonS3ObjectSlashCredentials
  - typings.awsSdk.awsSdkStrings.SensitiveDataColonS3ObjectSlashCustomIdentifier
  - typings.awsSdk.awsSdkStrings.PolicyColonIAMUserSlashS3BucketPublic
  - typings.awsSdk.awsSdkStrings.PolicyColonIAMUserSlashS3BucketSharedExternally
  - typings.awsSdk.awsSdkStrings.PolicyColonIAMUserSlashS3BucketReplicatedExternally
  - typings.awsSdk.awsSdkStrings.PolicyColonIAMUserSlashS3BucketEncryptionDisabled
  - typings.awsSdk.awsSdkStrings.PolicyColonIAMUserSlashS3BlockPublicAccessDisabled
  - typings.awsSdk.awsSdkStrings.PolicyColonIAMUserSlashS3BucketSharedWithCloudFront
  - java.lang.String
*/
type FindingType = _FindingType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ARCHIVE
  - typings.awsSdk.awsSdkStrings.NOOP
  - java.lang.String
*/
type FindingsFilterAction = _FindingsFilterAction | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.resourcesAffectedDots3BucketDotname
  - typings.awsSdk.awsSdkStrings.type__
  - typings.awsSdk.awsSdkStrings.classificationDetailsDotjobId
  - typings.awsSdk.awsSdkStrings.severityDotdescription
  - java.lang.String
*/
type GroupBy = _GroupBy | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TRUE
  - typings.awsSdk.awsSdkStrings.FALSE
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type IsDefinedInJob = _IsDefinedInJob | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TRUE
  - typings.awsSdk.awsSdkStrings.FALSE
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type IsMonitoredByJob = _IsMonitoredByJob | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EQ
  - typings.awsSdk.awsSdkStrings.GT
  - typings.awsSdk.awsSdkStrings.GTE
  - typings.awsSdk.awsSdkStrings.LT
  - typings.awsSdk.awsSdkStrings.LTE
  - typings.awsSdk.awsSdkStrings.NE
  - typings.awsSdk.awsSdkStrings.CONTAINS
  - typings.awsSdk.awsSdkStrings.STARTS_WITH
  - java.lang.String
*/
type JobComparator = _JobComparator | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.PAUSED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.COMPLETE
  - typings.awsSdk.awsSdkStrings.IDLE
  - typings.awsSdk.awsSdkStrings.USER_PAUSED
  - java.lang.String
*/
type JobStatus = _JobStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ONE_TIME
  - typings.awsSdk.awsSdkStrings.SCHEDULED
  - java.lang.String
*/
type JobType = _JobType | String

type KeyValuePairList = js.Array[KeyValuePair]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type LastRunErrorStatusCode = _LastRunErrorStatusCode | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.jobType
  - typings.awsSdk.awsSdkStrings.jobStatus_
  - typings.awsSdk.awsSdkStrings.createdAt_
  - typings.awsSdk.awsSdkStrings.name__
  - java.lang.String
*/
type ListJobsFilterKey = _ListJobsFilterKey | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.createdAt_
  - typings.awsSdk.awsSdkStrings.jobStatus_
  - typings.awsSdk.awsSdkStrings.name__
  - typings.awsSdk.awsSdkStrings.jobType
  - java.lang.String
*/
type ListJobsSortAttributeName = _ListJobsSortAttributeName | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PAUSED
  - typings.awsSdk.awsSdkStrings.ENABLED
  - java.lang.String
*/
type MacieStatus = _MacieStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.EXCLUDE
  - typings.awsSdk.awsSdkStrings.INCLUDE
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type ManagedDataIdentifierSelector = _ManagedDataIdentifierSelector | String

type MaxResults = Double

type NextToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASC
  - typings.awsSdk.awsSdkStrings.DESC
  - java.lang.String
*/
type OrderBy = _OrderBy | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SENSITIVE_DATA_DISCOVERY_JOB
  - typings.awsSdk.awsSdkStrings.AUTOMATED_SENSITIVE_DATA_DISCOVERY
  - java.lang.String
*/
type OriginType = _OriginType | String

type Pages = js.Array[Page]

type Ranges = js.Array[Range]

type Records = js.Array[Record]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Paused_
  - typings.awsSdk.awsSdkStrings.Invited_
  - typings.awsSdk.awsSdkStrings.Created_
  - typings.awsSdk.awsSdkStrings.Removed_
  - typings.awsSdk.awsSdkStrings.Resigned_
  - typings.awsSdk.awsSdkStrings.EmailVerificationInProgress
  - typings.awsSdk.awsSdkStrings.EmailVerificationFailed
  - typings.awsSdk.awsSdkStrings.RegionDisabled
  - typings.awsSdk.awsSdkStrings.AccountSuspended
  - java.lang.String
*/
type RelationshipStatus = _RelationshipStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.PROCESSING
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type RevealRequestStatus = _RevealRequestStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type RevealStatus = _RevealStatus | String

type S3BucketName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OBJECT_EXTENSION
  - typings.awsSdk.awsSdkStrings.OBJECT_LAST_MODIFIED_DATE
  - typings.awsSdk.awsSdkStrings.OBJECT_SIZE
  - typings.awsSdk.awsSdkStrings.OBJECT_KEY
  - java.lang.String
*/
type ScopeFilterKey = _ScopeFilterKey | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EQ
  - typings.awsSdk.awsSdkStrings.NE
  - java.lang.String
*/
type SearchResourcesComparator = _SearchResourcesComparator | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACCOUNT_ID
  - typings.awsSdk.awsSdkStrings.S3_BUCKET_NAME
  - typings.awsSdk.awsSdkStrings.S3_BUCKET_EFFECTIVE_PERMISSION
  - typings.awsSdk.awsSdkStrings.S3_BUCKET_SHARED_ACCESS
  - java.lang.String
*/
type SearchResourcesSimpleCriterionKey = _SearchResourcesSimpleCriterionKey | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACCOUNT_ID
  - typings.awsSdk.awsSdkStrings.RESOURCE_NAME
  - typings.awsSdk.awsSdkStrings.S3_CLASSIFIABLE_OBJECT_COUNT
  - typings.awsSdk.awsSdkStrings.S3_CLASSIFIABLE_SIZE_IN_BYTES
  - java.lang.String
*/
type SearchResourcesSortAttributeName = _SearchResourcesSortAttributeName | String

type SensitiveData = js.Array[SensitiveDataItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FINANCIAL_INFORMATION
  - typings.awsSdk.awsSdkStrings.PERSONAL_INFORMATION
  - typings.awsSdk.awsSdkStrings.CREDENTIALS
  - typings.awsSdk.awsSdkStrings.CUSTOM_IDENTIFIER
  - java.lang.String
*/
type SensitiveDataItemCategory = _SensitiveDataItemCategory | String

type SensitiveDataOccurrences = StringDictionary[listOfDetectedDataDetails]

type SensitivityInspectionTemplateId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Low_
  - typings.awsSdk.awsSdkStrings.Medium_
  - typings.awsSdk.awsSdkStrings.High_
  - java.lang.String
*/
type SeverityDescription = _SeverityDescription | String

type SeverityLevelList = js.Array[SeverityLevel]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EXTERNAL
  - typings.awsSdk.awsSdkStrings.INTERNAL
  - typings.awsSdk.awsSdkStrings.NOT_SHARED
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type SharedAccess = _SharedAccess | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACCOUNT_ID
  - typings.awsSdk.awsSdkStrings.S3_BUCKET_NAME
  - typings.awsSdk.awsSdkStrings.S3_BUCKET_EFFECTIVE_PERMISSION
  - typings.awsSdk.awsSdkStrings.S3_BUCKET_SHARED_ACCESS
  - java.lang.String
*/
type SimpleCriterionKeyForJob = _SimpleCriterionKeyForJob | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STANDARD
  - typings.awsSdk.awsSdkStrings.REDUCED_REDUNDANCY
  - typings.awsSdk.awsSdkStrings.STANDARD_IA
  - typings.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
  - typings.awsSdk.awsSdkStrings.DEEP_ARCHIVE
  - typings.awsSdk.awsSdkStrings.ONEZONE_IA
  - typings.awsSdk.awsSdkStrings.GLACIER
  - typings.awsSdk.awsSdkStrings.GLACIER_IR
  - typings.awsSdk.awsSdkStrings.OUTPOSTS
  - java.lang.String
*/
type StorageClass = _StorageClass | String

type TagMap = StringDictionary[string]

type TagTarget = S3_OBJECT | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MONTH_TO_DATE
  - typings.awsSdk.awsSdkStrings.PAST_30_DAYS
  - java.lang.String
*/
type TimeRange = _TimeRange | String

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.AES256
  - typings.awsSdk.awsSdkStrings.awsColonkms
  - java.lang.String
*/
type Type = _Type | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OBJECT_EXCEEDS_SIZE_QUOTA
  - typings.awsSdk.awsSdkStrings.UNSUPPORTED_OBJECT_TYPE
  - typings.awsSdk.awsSdkStrings.UNSUPPORTED_FINDING_TYPE
  - typings.awsSdk.awsSdkStrings.INVALID_CLASSIFICATION_RESULT
  - typings.awsSdk.awsSdkStrings.OBJECT_UNAVAILABLE
  - java.lang.String
*/
type UnavailabilityReasonCode = _UnavailabilityReasonCode | String

type Unit = TERABYTES | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GT
  - typings.awsSdk.awsSdkStrings.GTE
  - typings.awsSdk.awsSdkStrings.LT
  - typings.awsSdk.awsSdkStrings.LTE
  - typings.awsSdk.awsSdkStrings.EQ
  - typings.awsSdk.awsSdkStrings.NE
  - typings.awsSdk.awsSdkStrings.CONTAINS
  - java.lang.String
*/
type UsageStatisticsFilterComparator = _UsageStatisticsFilterComparator | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.accountId_
  - typings.awsSdk.awsSdkStrings.serviceLimit
  - typings.awsSdk.awsSdkStrings.freeTrialStartDate
  - typings.awsSdk.awsSdkStrings.total_
  - java.lang.String
*/
type UsageStatisticsFilterKey = _UsageStatisticsFilterKey | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.accountId_
  - typings.awsSdk.awsSdkStrings.total_
  - typings.awsSdk.awsSdkStrings.serviceLimitValue
  - typings.awsSdk.awsSdkStrings.freeTrialStartDate
  - java.lang.String
*/
type UsageStatisticsSortKey = _UsageStatisticsSortKey | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DATA_INVENTORY_EVALUATION
  - typings.awsSdk.awsSdkStrings.SENSITIVE_DATA_DISCOVERY
  - typings.awsSdk.awsSdkStrings.AUTOMATED_SENSITIVE_DATA_DISCOVERY
  - typings.awsSdk.awsSdkStrings.AUTOMATED_OBJECT_MONITORING
  - java.lang.String
*/
type UsageType = _UsageType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AssumedRole
  - typings.awsSdk.awsSdkStrings.IAMUser
  - typings.awsSdk.awsSdkStrings.FederatedUser
  - typings.awsSdk.awsSdkStrings.Root_
  - typings.awsSdk.awsSdkStrings.AWSAccount_
  - typings.awsSdk.awsSdkStrings.AWSService_
  - java.lang.String
*/
type UserIdentityType = _UserIdentityType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-01-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type boolean = Boolean

type double = Double

type integer = Double

type listOfAdminAccount = js.Array[AdminAccount]

type listOfAllowListSummary = js.Array[AllowListSummary]

type listOfBatchGetCustomDataIdentifierSummary = js.Array[BatchGetCustomDataIdentifierSummary]

type listOfBucketMetadata = js.Array[BucketMetadata]

type listOfClassificationScopeSummary = js.Array[ClassificationScopeSummary]

type listOfCriteriaForJob = js.Array[CriteriaForJob]

type listOfCustomDataIdentifierSummary = js.Array[CustomDataIdentifierSummary]

type listOfDetectedDataDetails = js.Array[DetectedDataDetails]

type listOfDetection = js.Array[Detection]

type listOfFinding = js.Array[Finding]

type listOfFindingType = js.Array[FindingType]

type listOfFindingsFilterListItem = js.Array[FindingsFilterListItem]

type listOfGroupCount = js.Array[GroupCount]

type listOfInvitation = js.Array[Invitation]

type listOfJobScopeTerm = js.Array[JobScopeTerm]

type listOfJobSummary = js.Array[JobSummary]

type listOfKeyValuePair = js.Array[KeyValuePair]

type listOfListJobsFilterTerm = js.Array[ListJobsFilterTerm]

type listOfManagedDataIdentifierSummary = js.Array[ManagedDataIdentifierSummary]

type listOfMatchingResource = js.Array[MatchingResource]

type listOfMember = js.Array[Member]

type listOfResourceProfileArtifact = js.Array[ResourceProfileArtifact]

type listOfS3BucketDefinitionForJob = js.Array[S3BucketDefinitionForJob]

type listOfS3BucketName = js.Array[S3BucketName]

type listOfSearchResourcesCriteria = js.Array[SearchResourcesCriteria]

type listOfSearchResourcesTagCriterionPair = js.Array[SearchResourcesTagCriterionPair]

type listOfSensitivityInspectionTemplatesEntry = js.Array[SensitivityInspectionTemplatesEntry]

type listOfString = js.Array[string]

type listOfSuppressDataIdentifier = js.Array[SuppressDataIdentifier]

type listOfTagCriterionPairForJob = js.Array[TagCriterionPairForJob]

type listOfTagValuePair = js.Array[TagValuePair]

type listOfUnavailabilityReasonCode = js.Array[UnavailabilityReasonCode]

type listOfUnprocessedAccount = js.Array[UnprocessedAccount]

type listOfUsageByAccount = js.Array[UsageByAccount]

type listOfUsageRecord = js.Array[UsageRecord]

type listOfUsageStatisticsFilter = js.Array[UsageStatisticsFilter]

type listOfUsageTotal = js.Array[UsageTotal]

type long = Double

type string = String

type stringMin1Max1024PatternSS = String

type stringMin1Max128 = String

type stringMin1Max128Pattern = String

type stringMin1Max2048 = String

type stringMin1Max512PatternSS = String

type stringMin22Max22PatternAZ0922 = String

type stringMin3Max255PatternAZaZ093255 = String

type stringMin71Max89PatternArnAwsAwsCnAwsUsGovMacie2AZ19920D12AllowListAZ0922 = String

type timestampIso8601 = js.Date
