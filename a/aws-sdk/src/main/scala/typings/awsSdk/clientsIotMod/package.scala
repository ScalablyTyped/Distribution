package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.BLANK_POLICY
import typings.awsSdk.awsSdkStrings.CANCEL
import typings.awsSdk.awsSdkStrings.DEACTIVATE
import typings.awsSdk.awsSdkStrings.SNS
import typings.awsSdk.awsSdkStrings.TOPIC_FILTER
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AbortAction = CANCEL | java.lang.String

type AbortCriteriaList = js.Array[AbortCriteria]

type AbortThresholdPercentage = Double

type AcmCertificateArn = java.lang.String

type ActionList = js.Array[Action]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PUBLISH
  - typings.awsSdk.awsSdkStrings.SUBSCRIBE
  - typings.awsSdk.awsSdkStrings.RECEIVE
  - typings.awsSdk.awsSdkStrings.CONNECT
  - java.lang.String
*/
type ActionType = _ActionType | java.lang.String

type ActiveViolations = js.Array[ActiveViolation]

type AdditionalMetricsToRetainList = js.Array[BehaviorMetric]

type AdditionalMetricsToRetainV2List = js.Array[MetricToRetain]

type AdditionalParameterMap = StringDictionary[Value]

type AggregationField = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Statistics_
  - typings.awsSdk.awsSdkStrings.Percentiles
  - typings.awsSdk.awsSdkStrings.Cardinality
  - java.lang.String
*/
type AggregationTypeName = _AggregationTypeName | java.lang.String

type AggregationTypeValue = java.lang.String

type AggregationTypeValues = js.Array[AggregationTypeValue]

type AlarmName = java.lang.String

type AlertTargetArn = java.lang.String

type AlertTargetType = SNS | java.lang.String

type AlertTargets = StringDictionary[AlertTarget]

type AllowAuthorizerOverride = scala.Boolean

type AllowAutoRegistration = scala.Boolean

type ApproximateSecondsBeforeTimedOut = Double

type AscendingOrder = scala.Boolean

type AssetId = java.lang.String

type AssetPropertyAlias = java.lang.String

type AssetPropertyBooleanValue = java.lang.String

type AssetPropertyDoubleValue = java.lang.String

type AssetPropertyEntryId = java.lang.String

type AssetPropertyId = java.lang.String

type AssetPropertyIntegerValue = java.lang.String

type AssetPropertyOffsetInNanos = java.lang.String

type AssetPropertyQuality = java.lang.String

type AssetPropertyStringValue = java.lang.String

type AssetPropertyTimeInSeconds = java.lang.String

type AssetPropertyValueList = js.Array[AssetPropertyValue]

type AttributeKey = java.lang.String

type AttributeName = java.lang.String

type AttributeValue = java.lang.String

type Attributes = StringDictionary[AttributeValue]

type AttributesMap = StringDictionary[Value]

type AuditCheckConfigurations = StringDictionary[AuditCheckConfiguration]

type AuditCheckName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.WAITING_FOR_DATA_COLLECTION
  - typings.awsSdk.awsSdkStrings.CANCELED
  - typings.awsSdk.awsSdkStrings.COMPLETED_COMPLIANT
  - typings.awsSdk.awsSdkStrings.COMPLETED_NON_COMPLIANT
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type AuditCheckRunStatus = _AuditCheckRunStatus | java.lang.String

type AuditCheckToActionsMapping = StringDictionary[MitigationActionNameList]

type AuditCheckToReasonCodeFilter = StringDictionary[ReasonForNonComplianceCodes]

type AuditDescription = java.lang.String

type AuditDetails = StringDictionary[AuditCheckDetails]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CRITICAL
  - typings.awsSdk.awsSdkStrings.HIGH
  - typings.awsSdk.awsSdkStrings.MEDIUM
  - typings.awsSdk.awsSdkStrings.LOW
  - java.lang.String
*/
type AuditFindingSeverity = _AuditFindingSeverity | java.lang.String

type AuditFindings = js.Array[AuditFinding]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DAILY
  - typings.awsSdk.awsSdkStrings.WEEKLY
  - typings.awsSdk.awsSdkStrings.BIWEEKLY
  - typings.awsSdk.awsSdkStrings.MONTHLY
  - java.lang.String
*/
type AuditFrequency = _AuditFrequency | java.lang.String

type AuditMitigationActionExecutionMetadataList = js.Array[AuditMitigationActionExecutionMetadata]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.CANCELED
  - typings.awsSdk.awsSdkStrings.SKIPPED
  - typings.awsSdk.awsSdkStrings.PENDING
  - java.lang.String
*/
type AuditMitigationActionsExecutionStatus = _AuditMitigationActionsExecutionStatus | java.lang.String

type AuditMitigationActionsTaskMetadataList = js.Array[AuditMitigationActionsTaskMetadata]

type AuditMitigationActionsTaskStatistics = StringDictionary[TaskStatisticsForAuditCheck]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.CANCELED
  - java.lang.String
*/
type AuditMitigationActionsTaskStatus = _AuditMitigationActionsTaskStatus | java.lang.String

type AuditNotificationTargetConfigurations = StringDictionary[AuditNotificationTarget]

type AuditNotificationType = SNS | java.lang.String

type AuditSuppressionList = js.Array[AuditSuppression]

type AuditTaskId = java.lang.String

type AuditTaskMetadataList = js.Array[AuditTaskMetadata]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.CANCELED
  - java.lang.String
*/
type AuditTaskStatus = _AuditTaskStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ON_DEMAND_AUDIT_TASK
  - typings.awsSdk.awsSdkStrings.SCHEDULED_AUDIT_TASK
  - java.lang.String
*/
type AuditTaskType = _AuditTaskType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALLOWED
  - typings.awsSdk.awsSdkStrings.EXPLICIT_DENY
  - typings.awsSdk.awsSdkStrings.IMPLICIT_DENY
  - java.lang.String
*/
type AuthDecision = _AuthDecision | java.lang.String

type AuthInfos = js.Array[AuthInfo]

type AuthResults = js.Array[AuthResult]

type AuthorizerArn = java.lang.String

type AuthorizerFunctionArn = java.lang.String

type AuthorizerName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type AuthorizerStatus = _AuthorizerStatus | java.lang.String

type Authorizers = js.Array[AuthorizerSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLE
  - typings.awsSdk.awsSdkStrings.DISABLE
  - java.lang.String
*/
type AutoRegistrationStatus = _AutoRegistrationStatus | java.lang.String

type Average = Double

type AwsAccountId = java.lang.String

type AwsArn = java.lang.String

type AwsIotJobArn = java.lang.String

type AwsIotJobId = java.lang.String

type AwsIotSqlVersion = java.lang.String

type AwsJobAbortCriteriaAbortAction = CANCEL | java.lang.String

type AwsJobAbortCriteriaAbortThresholdPercentage = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.REJECTED
  - typings.awsSdk.awsSdkStrings.TIMED_OUT
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type AwsJobAbortCriteriaFailureType = _AwsJobAbortCriteriaFailureType | java.lang.String

type AwsJobAbortCriteriaList = js.Array[AwsJobAbortCriteria]

type AwsJobAbortCriteriaMinimumNumberOfExecutedThings = Double

type AwsJobRateIncreaseCriteriaNumberOfThings = Double

type AwsJobRolloutIncrementFactor = Double

type AwsJobRolloutRatePerMinute = Double

type AwsJobTimeoutInProgressTimeoutInMinutes = Double

type BatchMode = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STATIC
  - typings.awsSdk.awsSdkStrings.STATISTICAL
  - typings.awsSdk.awsSdkStrings.MACHINE_LEARNING
  - java.lang.String
*/
type BehaviorCriteriaType = _BehaviorCriteriaType | java.lang.String

type BehaviorMetric = java.lang.String

type BehaviorModelTrainingSummaries = js.Array[BehaviorModelTrainingSummary]

type BehaviorName = java.lang.String

type Behaviors = js.Array[Behavior]

type BillingGroupArn = java.lang.String

type BillingGroupDescription = java.lang.String

type BillingGroupId = java.lang.String

type BillingGroupName = java.lang.String

type BillingGroupNameAndArnList = js.Array[GroupNameAndArn]

type Boolean = scala.Boolean

type BooleanKey = scala.Boolean

type BooleanWrapperObject = scala.Boolean

type BucketKeyValue = java.lang.String

type BucketName = java.lang.String

type Buckets = js.Array[Bucket]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type CACertificateStatus = _CACertificateStatus | java.lang.String

type CACertificateUpdateAction = DEACTIVATE | java.lang.String

type CACertificates = js.Array[CACertificate]

type CanceledChecksCount = Double

type CanceledFindingsCount = Double

type CanceledThings = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.private__
  - typings.awsSdk.awsSdkStrings.`public-read`
  - typings.awsSdk.awsSdkStrings.`public-read-write`
  - typings.awsSdk.awsSdkStrings.`aws-exec-read`
  - typings.awsSdk.awsSdkStrings.`authenticated-read`
  - typings.awsSdk.awsSdkStrings.`bucket-owner-read`
  - typings.awsSdk.awsSdkStrings.`bucket-owner-full-control`
  - typings.awsSdk.awsSdkStrings.`log-delivery-write`
  - java.lang.String
*/
type CannedAccessControlList = _CannedAccessControlList | java.lang.String

type CertificateArn = java.lang.String

type CertificateId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEFAULT
  - typings.awsSdk.awsSdkStrings.SNI_ONLY
  - java.lang.String
*/
type CertificateMode = _CertificateMode | java.lang.String

type CertificateName = java.lang.String

type CertificatePathOnDevice = java.lang.String

type CertificatePem = java.lang.String

type CertificateSigningRequest = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - typings.awsSdk.awsSdkStrings.REVOKED
  - typings.awsSdk.awsSdkStrings.PENDING_TRANSFER
  - typings.awsSdk.awsSdkStrings.REGISTER_INACTIVE
  - typings.awsSdk.awsSdkStrings.PENDING_ACTIVATION
  - java.lang.String
*/
type CertificateStatus = _CertificateStatus | java.lang.String

type Certificates = js.Array[Certificate]

type ChannelName = java.lang.String

type CheckCompliant = scala.Boolean

type Cidr = java.lang.String

type Cidrs = js.Array[Cidr]

type ClientId = java.lang.String

type ClientProperties = StringDictionary[String]

type ClientRequestToken = java.lang.String

type Code = java.lang.String

type CognitoIdentityPoolId = java.lang.String

type Comment = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`less-than`
  - typings.awsSdk.awsSdkStrings.`less-than-equals`
  - typings.awsSdk.awsSdkStrings.`greater-than`
  - typings.awsSdk.awsSdkStrings.`greater-than-equals`
  - typings.awsSdk.awsSdkStrings.`in-cidr-set`
  - typings.awsSdk.awsSdkStrings.`not-in-cidr-set`
  - typings.awsSdk.awsSdkStrings.`in-port-set`
  - typings.awsSdk.awsSdkStrings.`not-in-port-set`
  - typings.awsSdk.awsSdkStrings.`in-set`
  - typings.awsSdk.awsSdkStrings.`not-in-set`
  - java.lang.String
*/
type ComparisonOperator = _ComparisonOperator | java.lang.String

type CompliantChecksCount = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LOW
  - typings.awsSdk.awsSdkStrings.MEDIUM
  - typings.awsSdk.awsSdkStrings.HIGH
  - java.lang.String
*/
type ConfidenceLevel = _ConfidenceLevel | java.lang.String

type ConfirmationToken = java.lang.String

type ConnectivityTimestamp = Double

type ConsecutiveDatapointsToAlarm = Double

type ConsecutiveDatapointsToClear = Double

type ContentType = java.lang.String

type CorrelationData = java.lang.String

type Count = Double

type CreatedAtDate = js.Date

type CreationDate = js.Date

type CredentialDurationSeconds = Double

type CronExpression = java.lang.String

type CustomMetricArn = java.lang.String

type CustomMetricDisplayName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`string-list`
  - typings.awsSdk.awsSdkStrings.`ip-address-list`
  - typings.awsSdk.awsSdkStrings.`number-list`
  - typings.awsSdk.awsSdkStrings.number__
  - java.lang.String
*/
type CustomMetricType = _CustomMetricType | java.lang.String

type CustomerVersion = Double

type DataCollectionPercentage = Double

type DateType = js.Date

type DayOfMonth = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUN
  - typings.awsSdk.awsSdkStrings.MON
  - typings.awsSdk.awsSdkStrings.TUE
  - typings.awsSdk.awsSdkStrings.WED
  - typings.awsSdk.awsSdkStrings.THU
  - typings.awsSdk.awsSdkStrings.FRI
  - typings.awsSdk.awsSdkStrings.SAT
  - java.lang.String
*/
type DayOfWeek = _DayOfWeek | java.lang.String

type DeleteAdditionalMetricsToRetain = scala.Boolean

type DeleteAlertTargets = scala.Boolean

type DeleteBehaviors = scala.Boolean

type DeleteScheduledAudits = scala.Boolean

type DeleteStream = scala.Boolean

type DeliveryStreamName = java.lang.String

type DeprecationDate = js.Date

type Description = java.lang.String

type DetailsKey = java.lang.String

type DetailsMap = StringDictionary[DetailsValue]

type DetailsValue = java.lang.String

type DetectMitigationActionExecutionErrorCode = java.lang.String

type DetectMitigationActionExecutionList = js.Array[DetectMitigationActionExecution]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.SKIPPED
  - java.lang.String
*/
type DetectMitigationActionExecutionStatus = _DetectMitigationActionExecutionStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.CANCELED
  - java.lang.String
*/
type DetectMitigationActionsTaskStatus = _DetectMitigationActionsTaskStatus | java.lang.String

type DetectMitigationActionsTaskSummaryList = js.Array[DetectMitigationActionsTaskSummary]

type DetectMitigationActionsToExecuteList = js.Array[MitigationActionName]

type DeviceCertificateUpdateAction = DEACTIVATE | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OFF
  - typings.awsSdk.awsSdkStrings.VIOLATIONS
  - java.lang.String
*/
type DeviceDefenderIndexingMode = _DeviceDefenderIndexingMode | java.lang.String

type DeviceDefenderThingName = java.lang.String

type DimensionArn = java.lang.String

type DimensionName = java.lang.String

type DimensionNames = js.Array[DimensionName]

type DimensionStringValue = java.lang.String

type DimensionStringValues = js.Array[DimensionStringValue]

type DimensionType = TOPIC_FILTER | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN
  - typings.awsSdk.awsSdkStrings.NOT_IN
  - java.lang.String
*/
type DimensionValueOperator = _DimensionValueOperator | java.lang.String

type DisableAllLogs = scala.Boolean

type DisconnectReason = java.lang.String

type DocumentParameters = js.Array[DocumentParameter]

type DomainConfigurationArn = java.lang.String

type DomainConfigurationName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type DomainConfigurationStatus = _DomainConfigurationStatus | java.lang.String

type DomainConfigurations = js.Array[DomainConfigurationSummary]

type DomainName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENDPOINT
  - typings.awsSdk.awsSdkStrings.AWS_MANAGED
  - typings.awsSdk.awsSdkStrings.CUSTOMER_MANAGED
  - java.lang.String
*/
type DomainType = _DomainType | java.lang.String

type DurationInMinutes = Double

type DurationSeconds = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.BUILDING
  - typings.awsSdk.awsSdkStrings.REBUILDING
  - java.lang.String
*/
type DynamicGroupStatus = _DynamicGroupStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STRING
  - typings.awsSdk.awsSdkStrings.NUMBER
  - java.lang.String
*/
type DynamoKeyType = _DynamoKeyType | java.lang.String

type DynamoOperation = java.lang.String

type EffectivePolicies = js.Array[EffectivePolicy]

type ElasticsearchEndpoint = java.lang.String

type ElasticsearchId = java.lang.String

type ElasticsearchIndex = java.lang.String

type ElasticsearchType = java.lang.String

type EnableCachingForHttp = scala.Boolean

type Enabled = scala.Boolean

type EndpointAddress = java.lang.String

type EndpointType = java.lang.String

type Environment = java.lang.String

type Environments = js.Array[Environment]

type ErrorCode = java.lang.String

type ErrorMessage = java.lang.String

type EvaluationStatistic = java.lang.String

type EventConfigurations = StringDictionary[Configuration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.THING
  - typings.awsSdk.awsSdkStrings.THING_GROUP
  - typings.awsSdk.awsSdkStrings.THING_TYPE
  - typings.awsSdk.awsSdkStrings.THING_GROUP_MEMBERSHIP
  - typings.awsSdk.awsSdkStrings.THING_GROUP_HIERARCHY
  - typings.awsSdk.awsSdkStrings.THING_TYPE_ASSOCIATION
  - typings.awsSdk.awsSdkStrings.JOB
  - typings.awsSdk.awsSdkStrings.JOB_EXECUTION
  - typings.awsSdk.awsSdkStrings.POLICY
  - typings.awsSdk.awsSdkStrings.CERTIFICATE
  - typings.awsSdk.awsSdkStrings.CA_CERTIFICATE
  - java.lang.String
*/
type EventType = _EventType | java.lang.String

type Example = java.lang.String

type ExecutionNamePrefix = java.lang.String

type ExecutionNumber = Double

type ExpectedVersion = Double

type ExpiresInSec = Double

type ExpiresInSeconds = Double

type FailedChecksCount = Double

type FailedFindingsCount = Double

type FailedThings = Double

type FieldName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Number_
  - typings.awsSdk.awsSdkStrings.String_
  - typings.awsSdk.awsSdkStrings.Boolean_
  - java.lang.String
*/
type FieldType = _FieldType | java.lang.String

type Fields = js.Array[Field]

type FileId = Double

type FileName = java.lang.String

type FileType = Double

type FindingId = java.lang.String

type FindingIds = js.Array[FindingId]

type FirehoseSeparator = java.lang.String

type Flag = scala.Boolean

type FleetMetricArn = java.lang.String

type FleetMetricDescription = java.lang.String

type FleetMetricName = java.lang.String

type FleetMetricNameAndArnList = js.Array[FleetMetricNameAndArn]

type FleetMetricPeriod = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Seconds_
  - typings.awsSdk.awsSdkStrings.Microseconds_
  - typings.awsSdk.awsSdkStrings.Milliseconds_
  - typings.awsSdk.awsSdkStrings.Bytes_
  - typings.awsSdk.awsSdkStrings.Kilobytes
  - typings.awsSdk.awsSdkStrings.Megabytes
  - typings.awsSdk.awsSdkStrings.Gigabytes
  - typings.awsSdk.awsSdkStrings.Terabytes_
  - typings.awsSdk.awsSdkStrings.Bits_
  - typings.awsSdk.awsSdkStrings.Kilobits
  - typings.awsSdk.awsSdkStrings.Megabits
  - typings.awsSdk.awsSdkStrings.Gigabits
  - typings.awsSdk.awsSdkStrings.Terabits
  - typings.awsSdk.awsSdkStrings.Percent_
  - typings.awsSdk.awsSdkStrings.Count_
  - typings.awsSdk.awsSdkStrings.BytesSlashSecond
  - typings.awsSdk.awsSdkStrings.KilobytesSlashSecond
  - typings.awsSdk.awsSdkStrings.MegabytesSlashSecond
  - typings.awsSdk.awsSdkStrings.GigabytesSlashSecond
  - typings.awsSdk.awsSdkStrings.TerabytesSlashSecond
  - typings.awsSdk.awsSdkStrings.BitsSlashSecond
  - typings.awsSdk.awsSdkStrings.KilobitsSlashSecond
  - typings.awsSdk.awsSdkStrings.MegabitsSlashSecond
  - typings.awsSdk.awsSdkStrings.GigabitsSlashSecond
  - typings.awsSdk.awsSdkStrings.TerabitsSlashSecond
  - typings.awsSdk.awsSdkStrings.CountSlashSecond
  - typings.awsSdk.awsSdkStrings.None_
  - java.lang.String
*/
type FleetMetricUnit = _FleetMetricUnit | java.lang.String

type ForceDelete = scala.Boolean

type ForceDeleteAWSJob = scala.Boolean

type ForceFlag = scala.Boolean

type Forced = scala.Boolean

type FunctionArn = java.lang.String

type GenerationId = java.lang.String

type GenericLongValue = Double

type HashAlgorithm = java.lang.String

type HashKeyField = java.lang.String

type HashKeyValue = java.lang.String

type HeaderKey = java.lang.String

type HeaderList = js.Array[HttpActionHeader]

type HeaderValue = java.lang.String

type HttpHeaderName = java.lang.String

type HttpHeaderValue = java.lang.String

type HttpHeaders = StringDictionary[HttpHeaderValue]

type HttpQueryString = java.lang.String

type InProgressChecksCount = Double

type InProgressThings = Double

type InProgressTimeoutInMinutes = Double

type IncrementFactor = Double

type IndexName = java.lang.String

type IndexNamesList = js.Array[IndexName]

type IndexSchema = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.BUILDING
  - typings.awsSdk.awsSdkStrings.REBUILDING
  - java.lang.String
*/
type IndexStatus = _IndexStatus | java.lang.String

type InlineDocument = java.lang.String

type InputName = java.lang.String

type IsAuthenticated = scala.Boolean

type IsDefaultVersion = scala.Boolean

type IsDisabled = scala.Boolean

type IsSuppressed = scala.Boolean

type IssuerCertificateSerialNumber = java.lang.String

type IssuerCertificateSubject = java.lang.String

type IssuerId = java.lang.String

type JobArn = java.lang.String

type JobDescription = java.lang.String

type JobDocument = java.lang.String

type JobDocumentSource = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STOP_ROLLOUT
  - typings.awsSdk.awsSdkStrings.CANCEL
  - typings.awsSdk.awsSdkStrings.FORCE_CANCEL
  - java.lang.String
*/
type JobEndBehavior = _JobEndBehavior | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.REJECTED
  - typings.awsSdk.awsSdkStrings.TIMED_OUT
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type JobExecutionFailureType = _JobExecutionFailureType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.QUEUED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.TIMED_OUT
  - typings.awsSdk.awsSdkStrings.REJECTED
  - typings.awsSdk.awsSdkStrings.REMOVED
  - typings.awsSdk.awsSdkStrings.CANCELED
  - java.lang.String
*/
type JobExecutionStatus = _JobExecutionStatus | java.lang.String

type JobExecutionSummaryForJobList = js.Array[JobExecutionSummaryForJob]

type JobExecutionSummaryForThingList = js.Array[JobExecutionSummaryForThing]

type JobId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CANCELED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.DELETION_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SCHEDULED
  - java.lang.String
*/
type JobStatus = _JobStatus | java.lang.String

type JobSummaryList = js.Array[JobSummary]

type JobTargets = js.Array[TargetArn]

type JobTemplateArn = java.lang.String

type JobTemplateId = java.lang.String

type JobTemplateSummaryList = js.Array[JobTemplateSummary]

type JsonDocument = java.lang.String

type Key = java.lang.String

type KeyName = java.lang.String

type KeyValue = java.lang.String

type LaserMaxResults = Double

type LastModifiedDate = js.Date

type LastUpdatedAtDate = js.Date

type ListSuppressedAlerts = scala.Boolean

type ListSuppressedFindings = scala.Boolean

type LogGroupName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEBUG
  - typings.awsSdk.awsSdkStrings.INFO
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.WARN
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type LogLevel = _LogLevel | java.lang.String

type LogTargetConfigurations = js.Array[LogTargetConfiguration]

type LogTargetName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEFAULT
  - typings.awsSdk.awsSdkStrings.THING_GROUP
  - typings.awsSdk.awsSdkStrings.CLIENT_ID
  - typings.awsSdk.awsSdkStrings.SOURCE_IP
  - typings.awsSdk.awsSdkStrings.PRINCIPAL_ID
  - java.lang.String
*/
type LogTargetType = _LogTargetType | java.lang.String

type MaintenanceWindows = js.Array[MaintenanceWindow]

type ManagedJobTemplateName = java.lang.String

type ManagedJobTemplatesSummaryList = js.Array[ManagedJobTemplateSummary]

type ManagedTemplateVersion = java.lang.String

type Marker = java.lang.String

type MaxBuckets = Double

type MaxJobExecutionsPerMin = Double

type MaxResults = Double

type Maximum = Double

type MaximumPerMinute = Double

type Message = java.lang.String

type MessageExpiry = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RAW
  - typings.awsSdk.awsSdkStrings.JSON
  - java.lang.String
*/
type MessageFormat = _MessageFormat | java.lang.String

type MessageId = java.lang.String

type MetricDatumList = js.Array[MetricDatum]

type MetricName = java.lang.String

type MetricNames = js.Array[MetricName]

type Minimum = Double

type MinimumNumberOfExecutedThings = Double

type MissingContextValue = java.lang.String

type MissingContextValues = js.Array[MissingContextValue]

type MitigationActionArn = java.lang.String

type MitigationActionId = java.lang.String

type MitigationActionIdentifierList = js.Array[MitigationActionIdentifier]

type MitigationActionList = js.Array[MitigationAction]

type MitigationActionName = java.lang.String

type MitigationActionNameList = js.Array[MitigationActionName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UPDATE_DEVICE_CERTIFICATE
  - typings.awsSdk.awsSdkStrings.UPDATE_CA_CERTIFICATE
  - typings.awsSdk.awsSdkStrings.ADD_THINGS_TO_THING_GROUP
  - typings.awsSdk.awsSdkStrings.REPLACE_DEFAULT_POLICY_VERSION
  - typings.awsSdk.awsSdkStrings.ENABLE_IOT_LOGGING
  - typings.awsSdk.awsSdkStrings.PUBLISH_FINDING_TO_SNS
  - java.lang.String
*/
type MitigationActionType = _MitigationActionType | java.lang.String

type MitigationActionsTaskId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING_BUILD
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.EXPIRED
  - java.lang.String
*/
type ModelStatus = _ModelStatus | java.lang.String

type MqttClientId = java.lang.String

type MqttPassword = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type MqttUsername = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OFF
  - typings.awsSdk.awsSdkStrings.ON
  - java.lang.String
*/
type NamedShadowIndexingMode = _NamedShadowIndexingMode | java.lang.String

type NamedShadowNamesFilter = js.Array[ShadowName]

type NamespaceId = java.lang.String

type NextToken = java.lang.String

type NonCompliantChecksCount = Double

type NonCompliantResourcesCount = Double

type NullableBoolean = scala.Boolean

type Number = Double

type NumberList = js.Array[Number]

type NumberOfRetries = Double

type NumberOfThings = Double

type OTAUpdateArn = java.lang.String

type OTAUpdateDescription = java.lang.String

type OTAUpdateErrorMessage = java.lang.String

type OTAUpdateFileVersion = java.lang.String

type OTAUpdateFiles = js.Array[OTAUpdateFile]

type OTAUpdateId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_PENDING
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CREATE_COMPLETE
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type OTAUpdateStatus = _OTAUpdateStatus | java.lang.String

type OTAUpdatesSummary = js.Array[OTAUpdateSummary]

type Optional = scala.Boolean

type OptionalVersion = Double

type OutgoingCertificates = js.Array[OutgoingCertificate]

type OverrideDynamicGroups = scala.Boolean

type PageSize = Double

type Parameter = java.lang.String

type ParameterKey = java.lang.String

type ParameterMap = StringDictionary[ParameterValue]

type ParameterValue = java.lang.String

type Parameters = StringDictionary[Value]

type PartitionKey = java.lang.String

type PayloadField = java.lang.String

type PayloadFormatIndicator = java.lang.String

type PayloadVersion = java.lang.String

type Percent = Double

type PercentList = js.Array[Percent]

type PercentValue = Double

type Percentage = Double

type Percentiles = js.Array[PercentPair]

type Platform = java.lang.String

type Policies = js.Array[Policy]

type PolicyArn = java.lang.String

type PolicyDocument = java.lang.String

type PolicyDocuments = js.Array[PolicyDocument]

type PolicyName = java.lang.String

type PolicyNames = js.Array[PolicyName]

type PolicyTarget = java.lang.String

type PolicyTargets = js.Array[PolicyTarget]

type PolicyTemplateName = BLANK_POLICY | java.lang.String

type PolicyVersionId = java.lang.String

type PolicyVersions = js.Array[PolicyVersion]

type Port = Double

type Ports = js.Array[Port]

type Prefix = java.lang.String

type PrimitiveBoolean = scala.Boolean

type Principal = java.lang.String

type PrincipalArn = java.lang.String

type PrincipalId = java.lang.String

type Principals = js.Array[PrincipalArn]

type PrivateKey = java.lang.String

type ProcessingTargetName = java.lang.String

type ProcessingTargetNameList = js.Array[ProcessingTargetName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MQTT
  - typings.awsSdk.awsSdkStrings.HTTP
  - java.lang.String
*/
type Protocol = _Protocol | java.lang.String

type Protocols = js.Array[Protocol]

type ProvisioningTemplateListing = js.Array[ProvisioningTemplateSummary]

type ProvisioningTemplateVersionListing = js.Array[ProvisioningTemplateVersionSummary]

type PublicKey = java.lang.String

type PublicKeyMap = StringDictionary[KeyValue]

type PutAssetPropertyValueEntryList = js.Array[PutAssetPropertyValueEntry]

type Qos = Double

type QueryMaxResults = Double

type QueryString = java.lang.String

type QueryVersion = java.lang.String

type QueueUrl = java.lang.String

type QueuedThings = Double

type RangeKeyField = java.lang.String

type RangeKeyValue = java.lang.String

type ReasonCode = java.lang.String

type ReasonForNonCompliance = java.lang.String

type ReasonForNonComplianceCode = java.lang.String

type ReasonForNonComplianceCodes = js.Array[ReasonForNonComplianceCode]

type Recursive = scala.Boolean

type RecursiveWithoutDefault = scala.Boolean

type Regex = java.lang.String

type RegistrationCode = java.lang.String

type RegistryMaxResults = Double

type RegistryS3BucketName = java.lang.String

type RegistryS3KeyName = java.lang.String

type RejectedThings = Double

type RelatedResources = js.Array[RelatedResource]

type RemoveAuthorizerConfig = scala.Boolean

type RemoveAutoRegistration = scala.Boolean

type RemoveHook = scala.Boolean

type RemoveThingType = scala.Boolean

type RemovedThings = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ERRORS
  - typings.awsSdk.awsSdkStrings.RESULTS
  - java.lang.String
*/
type ReportType = _ReportType | java.lang.String

type ReservedDomainConfigurationName = java.lang.String

type Resource = java.lang.String

type ResourceArn = java.lang.String

type ResourceArns = StringDictionary[ResourceArn]

type ResourceLogicalId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEVICE_CERTIFICATE
  - typings.awsSdk.awsSdkStrings.CA_CERTIFICATE
  - typings.awsSdk.awsSdkStrings.IOT_POLICY
  - typings.awsSdk.awsSdkStrings.COGNITO_IDENTITY_POOL
  - typings.awsSdk.awsSdkStrings.CLIENT_ID
  - typings.awsSdk.awsSdkStrings.ACCOUNT_SETTINGS
  - typings.awsSdk.awsSdkStrings.ROLE_ALIAS
  - typings.awsSdk.awsSdkStrings.IAM_ROLE
  - typings.awsSdk.awsSdkStrings.ISSUER_CERTIFICATE
  - java.lang.String
*/
type ResourceType = _ResourceType | java.lang.String

type Resources = js.Array[Resource]

type ResponseTopic = java.lang.String

type RetryAttempt = Double

type RetryCriteriaList = js.Array[RetryCriteria]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.TIMED_OUT
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type RetryableFailureType = _RetryableFailureType | java.lang.String

type RoleAlias = java.lang.String

type RoleAliasArn = java.lang.String

type RoleAliases = js.Array[RoleAlias]

type RoleArn = java.lang.String

type RolloutRatePerMinute = Double

type RuleArn = java.lang.String

type RuleName = java.lang.String

type S3Bucket = java.lang.String

type S3FileUrl = java.lang.String

type S3FileUrlList = js.Array[S3FileUrl]

type S3Key = java.lang.String

type S3Version = java.lang.String

type SQL = java.lang.String

type SalesforceEndpoint = java.lang.String

type SalesforceToken = java.lang.String

type ScheduledAuditArn = java.lang.String

type ScheduledAuditMetadataList = js.Array[ScheduledAuditMetadata]

type ScheduledAuditName = java.lang.String

type ScheduledJobRolloutList = js.Array[ScheduledJobRollout]

type SearchableAttributes = js.Array[AttributeName]

type Seconds = Double

type SecurityGroupId = java.lang.String

type SecurityGroupList = js.Array[SecurityGroupId]

type SecurityPolicy = java.lang.String

type SecurityProfileArn = java.lang.String

type SecurityProfileDescription = java.lang.String

type SecurityProfileIdentifiers = js.Array[SecurityProfileIdentifier]

type SecurityProfileName = java.lang.String

type SecurityProfileTargetArn = java.lang.String

type SecurityProfileTargetMappings = js.Array[SecurityProfileTargetMapping]

type SecurityProfileTargets = js.Array[SecurityProfileTarget]

type ServerCertificateArns = js.Array[AcmCertificateArn]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INVALID
  - typings.awsSdk.awsSdkStrings.VALID
  - java.lang.String
*/
type ServerCertificateStatus = _ServerCertificateStatus | java.lang.String

type ServerCertificateStatusDetail = java.lang.String

type ServerCertificates = js.Array[ServerCertificateSummary]

type ServerName = java.lang.String

type ServiceName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DATA
  - typings.awsSdk.awsSdkStrings.CREDENTIAL_PROVIDER
  - typings.awsSdk.awsSdkStrings.JOBS
  - java.lang.String
*/
type ServiceType = _ServiceType | java.lang.String

type SetAsActive = scala.Boolean

type SetAsActiveFlag = scala.Boolean

type SetAsDefault = scala.Boolean

type ShadowName = java.lang.String

type Signature = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type SignatureAlgorithm = java.lang.String

type SigningJobId = java.lang.String

type SigningProfileName = java.lang.String

type SigningRegion = java.lang.String

type SkippedFindingsCount = Double

type SkyfallMaxResults = Double

type SnsTopicArn = java.lang.String

type StateMachineName = java.lang.String

type StateReason = java.lang.String

type StateValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Completed_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Cancelled_
  - typings.awsSdk.awsSdkStrings.Cancelling_
  - java.lang.String
*/
type Status = _Status | java.lang.String

type StdDeviation = Double

type StreamArn = java.lang.String

type StreamDescription = java.lang.String

type StreamFiles = js.Array[StreamFile]

type StreamId = java.lang.String

type StreamName = java.lang.String

type StreamVersion = Double

type StreamsSummary = js.Array[StreamSummary]

type String = java.lang.String

type StringDateTime = java.lang.String

type StringList = js.Array[stringValue]

type StringMap = StringDictionary[String]

type SubnetId = java.lang.String

type SubnetIdList = js.Array[SubnetId]

type SucceededFindingsCount = Double

type SucceededThings = Double

type Sum = Double

type SumOfSquares = Double

type SuppressAlerts = scala.Boolean

type SuppressIndefinitely = scala.Boolean

type SuppressedNonCompliantResourcesCount = Double

type TableName = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type Target = java.lang.String

type TargetArn = java.lang.String

type TargetAuditCheckNames = js.Array[AuditCheckName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONTINUOUS
  - typings.awsSdk.awsSdkStrings.SNAPSHOT
  - java.lang.String
*/
type TargetSelection = _TargetSelection | java.lang.String

type TargetViolationIdsForDetectMitigationActions = js.Array[ViolationId]

type Targets = js.Array[Target]

type TaskId = java.lang.String

type TaskIdList = js.Array[TaskId]

type TemplateArn = java.lang.String

type TemplateBody = java.lang.String

type TemplateDescription = java.lang.String

type TemplateName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FLEET_PROVISIONING
  - typings.awsSdk.awsSdkStrings.JITP
  - java.lang.String
*/
type TemplateType = _TemplateType | java.lang.String

type TemplateVersionId = Double

type ThingArn = java.lang.String

type ThingAttributeList = js.Array[ThingAttribute]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OFF
  - typings.awsSdk.awsSdkStrings.STATUS
  - java.lang.String
*/
type ThingConnectivityIndexingMode = _ThingConnectivityIndexingMode | java.lang.String

type ThingDocumentList = js.Array[ThingDocument]

type ThingGroupArn = java.lang.String

type ThingGroupDescription = java.lang.String

type ThingGroupDocumentList = js.Array[ThingGroupDocument]

type ThingGroupId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OFF
  - typings.awsSdk.awsSdkStrings.ON
  - java.lang.String
*/
type ThingGroupIndexingMode = _ThingGroupIndexingMode | java.lang.String

type ThingGroupList = js.Array[ThingGroupName]

type ThingGroupName = java.lang.String

type ThingGroupNameAndArnList = js.Array[GroupNameAndArn]

type ThingGroupNameList = js.Array[ThingGroupName]

type ThingGroupNames = js.Array[ThingGroupName]

type ThingId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OFF
  - typings.awsSdk.awsSdkStrings.REGISTRY
  - typings.awsSdk.awsSdkStrings.REGISTRY_AND_SHADOW
  - java.lang.String
*/
type ThingIndexingMode = _ThingIndexingMode | java.lang.String

type ThingName = java.lang.String

type ThingNameList = js.Array[ThingName]

type ThingTypeArn = java.lang.String

type ThingTypeDescription = java.lang.String

type ThingTypeId = java.lang.String

type ThingTypeList = js.Array[ThingTypeDefinition]

type ThingTypeName = java.lang.String

type TimedOutThings = Double

type Timestamp = js.Date

type TimestreamDatabaseName = java.lang.String

type TimestreamDimensionList = js.Array[TimestreamDimension]

type TimestreamDimensionName = java.lang.String

type TimestreamDimensionValue = java.lang.String

type TimestreamTableName = java.lang.String

type TimestreamTimestampUnit = java.lang.String

type TimestreamTimestampValue = java.lang.String

type TinyMaxResults = Double

type Token = java.lang.String

type TokenKeyName = java.lang.String

type TokenSignature = java.lang.String

type Topic = java.lang.String

type TopicPattern = java.lang.String

type TopicRuleDestinationMaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type TopicRuleDestinationStatus = _TopicRuleDestinationStatus | java.lang.String

type TopicRuleDestinationSummaries = js.Array[TopicRuleDestinationSummary]

type TopicRuleList = js.Array[TopicRuleListItem]

type TopicRuleMaxResults = Double

type TotalChecksCount = Double

type TotalFindingsCount = Double

type TotalResourcesCount = Double

type UndoDeprecate = scala.Boolean

type UnsignedLong = Double

type Url = java.lang.String

type UseBase64 = scala.Boolean

type UserProperties = js.Array[UserProperty]

type UserPropertyKey = java.lang.String

type UserPropertyValue = java.lang.String

type Valid = scala.Boolean

type ValidationErrors = js.Array[ValidationError]

type Value = java.lang.String

type Variance = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FALSE_POSITIVE
  - typings.awsSdk.awsSdkStrings.BENIGN_POSITIVE
  - typings.awsSdk.awsSdkStrings.TRUE_POSITIVE
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type VerificationState = _VerificationState | java.lang.String

type VerificationStateDescription = java.lang.String

type Version = Double

type VersionNumber = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`in-alarm`
  - typings.awsSdk.awsSdkStrings.`alarm-cleared`
  - typings.awsSdk.awsSdkStrings.`alarm-invalidated`
  - java.lang.String
*/
type ViolationEventType = _ViolationEventType | java.lang.String

type ViolationEvents = js.Array[ViolationEvent]

type ViolationId = java.lang.String

type VpcId = java.lang.String

type WaitingForDataCollectionChecksCount = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2015-05-28`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String

type stringValue = java.lang.String

type usePrefixAttributeValue = scala.Boolean
