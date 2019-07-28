package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.awsDashSdkStrings.CANCEL
import typings.awsDashSdk.awsDashSdkStrings.SNS
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.node.Buffer
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsIotMod {
  type AbortAction = CANCEL | java.lang.String
  type AbortCriteriaList = js.Array[AbortCriteria]
  type AbortThresholdPercentage = Double
  type ActionList = js.Array[Action]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PUBLISH
    - typings.awsDashSdk.awsDashSdkStrings.SUBSCRIBE
    - typings.awsDashSdk.awsDashSdkStrings.RECEIVE
    - typings.awsDashSdk.awsDashSdkStrings.CONNECT
    - java.lang.String
  */
  type ActionType = _ActionType | java.lang.String
  type ActiveViolations = js.Array[ActiveViolation]
  type AdditionalMetricsToRetainList = js.Array[BehaviorMetric]
  type AdditionalParameterMap = StringDictionary[Value]
  type AggregationField = java.lang.String
  type AlarmName = java.lang.String
  type AlertTargetArn = java.lang.String
  type AlertTargetType = SNS | java.lang.String
  type AlertTargets = StringDictionary[AlertTarget]
  type AllowAutoRegistration = scala.Boolean
  type ApproximateSecondsBeforeTimedOut = Double
  type AscendingOrder = scala.Boolean
  type AttributeKey = java.lang.String
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type Attributes = StringDictionary[AttributeValue]
  type AttributesMap = StringDictionary[Value]
  type AuditCheckConfigurations = StringDictionary[AuditCheckConfiguration]
  type AuditCheckName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.WAITING_FOR_DATA_COLLECTION
    - typings.awsDashSdk.awsDashSdkStrings.CANCELED
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED_COMPLIANT
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED_NON_COMPLIANT
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type AuditCheckRunStatus = _AuditCheckRunStatus | java.lang.String
  type AuditDetails = StringDictionary[AuditCheckDetails]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CRITICAL
    - typings.awsDashSdk.awsDashSdkStrings.HIGH
    - typings.awsDashSdk.awsDashSdkStrings.MEDIUM
    - typings.awsDashSdk.awsDashSdkStrings.LOW
    - java.lang.String
  */
  type AuditFindingSeverity = _AuditFindingSeverity | java.lang.String
  type AuditFindings = js.Array[AuditFinding]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DAILY
    - typings.awsDashSdk.awsDashSdkStrings.WEEKLY
    - typings.awsDashSdk.awsDashSdkStrings.BIWEEKLY
    - typings.awsDashSdk.awsDashSdkStrings.MONTHLY
    - java.lang.String
  */
  type AuditFrequency = _AuditFrequency | java.lang.String
  type AuditNotificationTargetConfigurations = StringDictionary[AuditNotificationTarget]
  type AuditNotificationType = SNS | java.lang.String
  type AuditTaskId = java.lang.String
  type AuditTaskMetadataList = js.Array[AuditTaskMetadata]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.CANCELED
    - java.lang.String
  */
  type AuditTaskStatus = _AuditTaskStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ON_DEMAND_AUDIT_TASK
    - typings.awsDashSdk.awsDashSdkStrings.SCHEDULED_AUDIT_TASK
    - java.lang.String
  */
  type AuditTaskType = _AuditTaskType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALLOWED
    - typings.awsDashSdk.awsDashSdkStrings.EXPLICIT_DENY
    - typings.awsDashSdk.awsDashSdkStrings.IMPLICIT_DENY
    - java.lang.String
  */
  type AuthDecision = _AuthDecision | java.lang.String
  type AuthInfos = js.Array[AuthInfo]
  type AuthResults = js.Array[AuthResult]
  type AuthorizerArn = java.lang.String
  type AuthorizerFunctionArn = java.lang.String
  type AuthorizerName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.INACTIVE
    - java.lang.String
  */
  type AuthorizerStatus = _AuthorizerStatus | java.lang.String
  type Authorizers = js.Array[AuthorizerSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLE
    - typings.awsDashSdk.awsDashSdkStrings.DISABLE
    - java.lang.String
  */
  type AutoRegistrationStatus = _AutoRegistrationStatus | java.lang.String
  type AwsAccountId = java.lang.String
  type AwsArn = java.lang.String
  type AwsIotJobArn = java.lang.String
  type AwsIotJobId = java.lang.String
  type AwsIotSqlVersion = java.lang.String
  type BehaviorMetric = java.lang.String
  type BehaviorName = java.lang.String
  type Behaviors = js.Array[Behavior]
  type BillingGroupArn = java.lang.String
  type BillingGroupDescription = java.lang.String
  type BillingGroupId = java.lang.String
  type BillingGroupName = java.lang.String
  type BillingGroupNameAndArnList = js.Array[GroupNameAndArn]
  type Boolean = scala.Boolean
  type BucketName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.INACTIVE
    - java.lang.String
  */
  type CACertificateStatus = _CACertificateStatus | java.lang.String
  type CACertificates = js.Array[CACertificate]
  type CanceledChecksCount = Double
  type CanceledThings = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`private`
    - typings.awsDashSdk.awsDashSdkStrings.`public-read`
    - typings.awsDashSdk.awsDashSdkStrings.`public-read-write`
    - typings.awsDashSdk.awsDashSdkStrings.`aws-exec-read`
    - typings.awsDashSdk.awsDashSdkStrings.`authenticated-read`
    - typings.awsDashSdk.awsDashSdkStrings.`bucket-owner-read`
    - typings.awsDashSdk.awsDashSdkStrings.`bucket-owner-full-control`
    - typings.awsDashSdk.awsDashSdkStrings.`log-delivery-write`
    - java.lang.String
  */
  type CannedAccessControlList = _CannedAccessControlList | java.lang.String
  type CertificateArn = java.lang.String
  type CertificateId = java.lang.String
  type CertificateName = java.lang.String
  type CertificatePathOnDevice = java.lang.String
  type CertificatePem = java.lang.String
  type CertificateSigningRequest = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.INACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.REVOKED
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_TRANSFER
    - typings.awsDashSdk.awsDashSdkStrings.REGISTER_INACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_ACTIVATION
    - java.lang.String
  */
  type CertificateStatus = _CertificateStatus | java.lang.String
  type Certificates = js.Array[Certificate]
  type ChannelName = java.lang.String
  type CheckCompliant = scala.Boolean
  type Cidr = java.lang.String
  type Cidrs = js.Array[Cidr]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientId = java.lang.String
  type Code = java.lang.String
  type CognitoIdentityPoolId = java.lang.String
  type Comment = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`less-than`
    - typings.awsDashSdk.awsDashSdkStrings.`less-than-equals`
    - typings.awsDashSdk.awsDashSdkStrings.`greater-than`
    - typings.awsDashSdk.awsDashSdkStrings.`greater-than-equals`
    - typings.awsDashSdk.awsDashSdkStrings.`in-cidr-set`
    - typings.awsDashSdk.awsDashSdkStrings.`not-in-cidr-set`
    - typings.awsDashSdk.awsDashSdkStrings.`in-port-set`
    - typings.awsDashSdk.awsDashSdkStrings.`not-in-port-set`
    - java.lang.String
  */
  type ComparisonOperator = _ComparisonOperator | java.lang.String
  type CompliantChecksCount = Double
  type ConnectivityTimestamp = Double
  type ConsecutiveDatapointsToAlarm = Double
  type ConsecutiveDatapointsToClear = Double
  type Count = Double
  type CreatedAtDate = Date
  type CreationDate = Date
  type CredentialDurationSeconds = Double
  type CustomerVersion = Double
  type DateType = Date
  type DayOfMonth = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUN
    - typings.awsDashSdk.awsDashSdkStrings.MON
    - typings.awsDashSdk.awsDashSdkStrings.TUE
    - typings.awsDashSdk.awsDashSdkStrings.WED
    - typings.awsDashSdk.awsDashSdkStrings.THU
    - typings.awsDashSdk.awsDashSdkStrings.FRI
    - typings.awsDashSdk.awsDashSdkStrings.SAT
    - java.lang.String
  */
  type DayOfWeek = _DayOfWeek | java.lang.String
  type DeleteAdditionalMetricsToRetain = scala.Boolean
  type DeleteAlertTargets = scala.Boolean
  type DeleteBehaviors = scala.Boolean
  type DeleteScheduledAudits = scala.Boolean
  type DeleteStream = scala.Boolean
  type DeliveryStreamName = java.lang.String
  type DeprecationDate = Date
  type Description = java.lang.String
  type DetailsKey = java.lang.String
  type DetailsMap = StringDictionary[DetailsValue]
  type DetailsValue = java.lang.String
  type DisableAllLogs = scala.Boolean
  type DurationSeconds = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.BUILDING
    - typings.awsDashSdk.awsDashSdkStrings.REBUILDING
    - java.lang.String
  */
  type DynamicGroupStatus = _DynamicGroupStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STRING
    - typings.awsDashSdk.awsDashSdkStrings.NUMBER
    - java.lang.String
  */
  type DynamoKeyType = _DynamoKeyType | java.lang.String
  type DynamoOperation = java.lang.String
  type EffectivePolicies = js.Array[EffectivePolicy]
  type ElasticsearchEndpoint = java.lang.String
  type ElasticsearchId = java.lang.String
  type ElasticsearchIndex = java.lang.String
  type ElasticsearchType = java.lang.String
  type Enabled = scala.Boolean
  type EndpointAddress = java.lang.String
  type EndpointType = java.lang.String
  type ErrorCode = java.lang.String
  type ErrorMessage = java.lang.String
  type EvaluationStatistic = java.lang.String
  type EventConfigurations = StringDictionary[Configuration]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.THING
    - typings.awsDashSdk.awsDashSdkStrings.THING_GROUP
    - typings.awsDashSdk.awsDashSdkStrings.THING_TYPE
    - typings.awsDashSdk.awsDashSdkStrings.THING_GROUP_MEMBERSHIP
    - typings.awsDashSdk.awsDashSdkStrings.THING_GROUP_HIERARCHY
    - typings.awsDashSdk.awsDashSdkStrings.THING_TYPE_ASSOCIATION
    - typings.awsDashSdk.awsDashSdkStrings.JOB
    - typings.awsDashSdk.awsDashSdkStrings.JOB_EXECUTION
    - typings.awsDashSdk.awsDashSdkStrings.POLICY
    - typings.awsDashSdk.awsDashSdkStrings.CERTIFICATE
    - typings.awsDashSdk.awsDashSdkStrings.CA_CERTIFICATE
    - java.lang.String
  */
  type EventType = _EventType | java.lang.String
  type ExecutionNamePrefix = java.lang.String
  type ExecutionNumber = Double
  type ExpectedVersion = Double
  type ExpiresInSec = Double
  type FailedChecksCount = Double
  type FailedThings = Double
  type FileId = Double
  type FileName = java.lang.String
  type FirehoseSeparator = java.lang.String
  type Flag = scala.Boolean
  type ForceDelete = scala.Boolean
  type ForceDeleteAWSJob = scala.Boolean
  type ForceFlag = scala.Boolean
  type Forced = scala.Boolean
  type FunctionArn = java.lang.String
  type GEMaxResults = Double
  type GenerationId = java.lang.String
  type HashAlgorithm = java.lang.String
  type HashKeyField = java.lang.String
  type HashKeyValue = java.lang.String
  type InProgressChecksCount = Double
  type InProgressThings = Double
  type InProgressTimeoutInMinutes = Double
  type IncrementFactor = Double
  type IndexName = java.lang.String
  type IndexNamesList = js.Array[IndexName]
  type IndexSchema = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.BUILDING
    - typings.awsDashSdk.awsDashSdkStrings.REBUILDING
    - java.lang.String
  */
  type IndexStatus = _IndexStatus | java.lang.String
  type InlineDocument = java.lang.String
  type InputName = java.lang.String
  type IsAuthenticated = scala.Boolean
  type IsDefaultVersion = scala.Boolean
  type IsDisabled = scala.Boolean
  type JobArn = java.lang.String
  type JobDescription = java.lang.String
  type JobDocument = java.lang.String
  type JobDocumentSource = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.REJECTED
    - typings.awsDashSdk.awsDashSdkStrings.TIMED_OUT
    - typings.awsDashSdk.awsDashSdkStrings.ALL
    - java.lang.String
  */
  type JobExecutionFailureType = _JobExecutionFailureType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.QUEUED
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.TIMED_OUT
    - typings.awsDashSdk.awsDashSdkStrings.REJECTED
    - typings.awsDashSdk.awsDashSdkStrings.REMOVED
    - typings.awsDashSdk.awsDashSdkStrings.CANCELED
    - java.lang.String
  */
  type JobExecutionStatus = _JobExecutionStatus | java.lang.String
  type JobExecutionSummaryForJobList = js.Array[JobExecutionSummaryForJob]
  type JobExecutionSummaryForThingList = js.Array[JobExecutionSummaryForThing]
  type JobId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.CANCELED
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.DELETION_IN_PROGRESS
    - java.lang.String
  */
  type JobStatus = _JobStatus | java.lang.String
  type JobSummaryList = js.Array[JobSummary]
  type JobTargets = js.Array[TargetArn]
  type JsonDocument = java.lang.String
  type Key = java.lang.String
  type KeyName = java.lang.String
  type KeyValue = java.lang.String
  type LaserMaxResults = Double
  type LastModifiedDate = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DEBUG
    - typings.awsDashSdk.awsDashSdkStrings.INFO
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - typings.awsDashSdk.awsDashSdkStrings.WARN
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type LogLevel = _LogLevel | java.lang.String
  type LogTargetConfigurations = js.Array[LogTargetConfiguration]
  type LogTargetName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT
    - typings.awsDashSdk.awsDashSdkStrings.THING_GROUP
    - java.lang.String
  */
  type LogTargetType = _LogTargetType | java.lang.String
  type Marker = java.lang.String
  type MaxJobExecutionsPerMin = Double
  type MaxResults = Double
  type MaximumPerMinute = Double
  type Message = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RAW
    - typings.awsDashSdk.awsDashSdkStrings.JSON
    - java.lang.String
  */
  type MessageFormat = _MessageFormat | java.lang.String
  type MessageId = java.lang.String
  type MinimumNumberOfExecutedThings = Double
  type MissingContextValue = java.lang.String
  type MissingContextValues = js.Array[MissingContextValue]
  type NextToken = java.lang.String
  type NonCompliantChecksCount = Double
  type NonCompliantResourcesCount = Double
  type NumberOfThings = Double
  type OTAUpdateArn = java.lang.String
  type OTAUpdateDescription = java.lang.String
  type OTAUpdateErrorMessage = java.lang.String
  type OTAUpdateFileVersion = java.lang.String
  type OTAUpdateFiles = js.Array[OTAUpdateFile]
  type OTAUpdateId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_PENDING
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_COMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_FAILED
    - java.lang.String
  */
  type OTAUpdateStatus = _OTAUpdateStatus | java.lang.String
  type OTAUpdatesSummary = js.Array[OTAUpdateSummary]
  type OptionalVersion = Double
  type OutgoingCertificates = js.Array[OutgoingCertificate]
  type OverrideDynamicGroups = scala.Boolean
  type PageSize = Double
  type Parameter = java.lang.String
  type Parameters = StringDictionary[Value]
  type PartitionKey = java.lang.String
  type PayloadField = java.lang.String
  type Percentage = Double
  type Platform = java.lang.String
  type Policies = js.Array[Policy]
  type PolicyArn = java.lang.String
  type PolicyDocument = java.lang.String
  type PolicyDocuments = js.Array[PolicyDocument]
  type PolicyName = java.lang.String
  type PolicyNames = js.Array[PolicyName]
  type PolicyTarget = java.lang.String
  type PolicyTargets = js.Array[PolicyTarget]
  type PolicyVersionId = java.lang.String
  type PolicyVersions = js.Array[PolicyVersion]
  type Port = Double
  type Ports = js.Array[Port]
  type Prefix = java.lang.String
  type Principal = java.lang.String
  type PrincipalArn = java.lang.String
  type PrincipalId = java.lang.String
  type Principals = js.Array[PrincipalArn]
  type PrivateKey = java.lang.String
  type ProcessingTargetName = java.lang.String
  type ProcessingTargetNameList = js.Array[ProcessingTargetName]
  type PublicKey = java.lang.String
  type PublicKeyMap = StringDictionary[KeyValue]
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
  type Recursive = scala.Boolean
  type RecursiveWithoutDefault = scala.Boolean
  type RegistrationCode = java.lang.String
  type RegistryMaxResults = Double
  type RegistryS3BucketName = java.lang.String
  type RegistryS3KeyName = java.lang.String
  type RejectedThings = Double
  type RelatedResources = js.Array[RelatedResource]
  type RemoveAutoRegistration = scala.Boolean
  type RemoveThingType = scala.Boolean
  type RemovedThings = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ERRORS
    - typings.awsDashSdk.awsDashSdkStrings.RESULTS
    - java.lang.String
  */
  type ReportType = _ReportType | java.lang.String
  type Resource = java.lang.String
  type ResourceArn = java.lang.String
  type ResourceArns = StringDictionary[ResourceArn]
  type ResourceLogicalId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DEVICE_CERTIFICATE
    - typings.awsDashSdk.awsDashSdkStrings.CA_CERTIFICATE
    - typings.awsDashSdk.awsDashSdkStrings.IOT_POLICY
    - typings.awsDashSdk.awsDashSdkStrings.COGNITO_IDENTITY_POOL
    - typings.awsDashSdk.awsDashSdkStrings.CLIENT_ID
    - typings.awsDashSdk.awsDashSdkStrings.ACCOUNT_SETTINGS
    - java.lang.String
  */
  type ResourceType = _ResourceType | java.lang.String
  type Resources = js.Array[Resource]
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
  type SearchableAttributes = js.Array[AttributeName]
  type Seconds = Double
  type SecurityProfileArn = java.lang.String
  type SecurityProfileDescription = java.lang.String
  type SecurityProfileIdentifiers = js.Array[SecurityProfileIdentifier]
  type SecurityProfileName = java.lang.String
  type SecurityProfileTargetArn = java.lang.String
  type SecurityProfileTargetMappings = js.Array[SecurityProfileTargetMapping]
  type SecurityProfileTargets = js.Array[SecurityProfileTarget]
  type SetAsActive = scala.Boolean
  type SetAsActiveFlag = scala.Boolean
  type SetAsDefault = scala.Boolean
  type Signature = Buffer | Uint8Array | Blob | java.lang.String
  type SignatureAlgorithm = java.lang.String
  type SigningJobId = java.lang.String
  type SigningProfileName = java.lang.String
  type SkyfallMaxResults = Double
  type StateMachineName = java.lang.String
  type StateReason = java.lang.String
  type StateValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Completed
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.Cancelled
    - typings.awsDashSdk.awsDashSdkStrings.Cancelling
    - java.lang.String
  */
  type Status = _Status | java.lang.String
  type StreamArn = java.lang.String
  type StreamDescription = java.lang.String
  type StreamFiles = js.Array[StreamFile]
  type StreamId = java.lang.String
  type StreamName = java.lang.String
  type StreamVersion = Double
  type StreamsSummary = js.Array[StreamSummary]
  type String = java.lang.String
  type StringMap = StringDictionary[String]
  type SucceededThings = Double
  type TableName = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type Target = java.lang.String
  type TargetArn = java.lang.String
  type TargetAuditCheckNames = js.Array[AuditCheckName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CONTINUOUS
    - typings.awsDashSdk.awsDashSdkStrings.SNAPSHOT
    - java.lang.String
  */
  type TargetSelection = _TargetSelection | java.lang.String
  type Targets = js.Array[Target]
  type TaskId = java.lang.String
  type TaskIdList = js.Array[TaskId]
  type TemplateBody = java.lang.String
  type ThingArn = java.lang.String
  type ThingAttributeList = js.Array[ThingAttribute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OFF
    - typings.awsDashSdk.awsDashSdkStrings.STATUS
    - java.lang.String
  */
  type ThingConnectivityIndexingMode = _ThingConnectivityIndexingMode | java.lang.String
  type ThingDocumentList = js.Array[ThingDocument]
  type ThingGroupArn = java.lang.String
  type ThingGroupDescription = java.lang.String
  type ThingGroupDocumentList = js.Array[ThingGroupDocument]
  type ThingGroupId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OFF
    - typings.awsDashSdk.awsDashSdkStrings.ON
    - java.lang.String
  */
  type ThingGroupIndexingMode = _ThingGroupIndexingMode | java.lang.String
  type ThingGroupList = js.Array[ThingGroupName]
  type ThingGroupName = java.lang.String
  type ThingGroupNameAndArnList = js.Array[GroupNameAndArn]
  type ThingGroupNameList = js.Array[ThingGroupName]
  type ThingId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OFF
    - typings.awsDashSdk.awsDashSdkStrings.REGISTRY
    - typings.awsDashSdk.awsDashSdkStrings.REGISTRY_AND_SHADOW
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
  type Timestamp = Date
  type Token = java.lang.String
  type TokenKeyName = java.lang.String
  type TokenSignature = java.lang.String
  type Topic = java.lang.String
  type TopicPattern = java.lang.String
  type TopicRuleList = js.Array[TopicRuleListItem]
  type TotalChecksCount = Double
  type TotalResourcesCount = Double
  type UndoDeprecate = scala.Boolean
  type UnsignedLong = Double
  type UseBase64 = scala.Boolean
  type Valid = scala.Boolean
  type ValidationErrors = js.Array[ValidationError]
  type Value = java.lang.String
  type Version = Double
  type VersionNumber = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`in-alarm`
    - typings.awsDashSdk.awsDashSdkStrings.`alarm-cleared`
    - typings.awsDashSdk.awsDashSdkStrings.`alarm-invalidated`
    - java.lang.String
  */
  type ViolationEventType = _ViolationEventType | java.lang.String
  type ViolationEvents = js.Array[ViolationEvent]
  type ViolationId = java.lang.String
  type WaitingForDataCollectionChecksCount = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2015-05-28`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
