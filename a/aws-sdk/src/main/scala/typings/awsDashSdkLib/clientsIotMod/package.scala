package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsIotMod {
  type AbortAction = awsDashSdkLib.awsDashSdkLibStrings.CANCEL | java.lang.String
  type AbortCriteriaList = js.Array[AbortCriteria]
  type AbortThresholdPercentage = scala.Double
  type ActionList = js.Array[Action]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PUBLISH
    - awsDashSdkLib.awsDashSdkLibStrings.SUBSCRIBE
    - awsDashSdkLib.awsDashSdkLibStrings.RECEIVE
    - awsDashSdkLib.awsDashSdkLibStrings.CONNECT
    - java.lang.String
  */
  type ActionType = _ActionType | java.lang.String
  type ActiveViolations = js.Array[ActiveViolation]
  type AdditionalMetricsToRetainList = js.Array[BehaviorMetric]
  type AdditionalParameterMap = org.scalablytyped.runtime.StringDictionary[Value]
  type AggregationField = java.lang.String
  type AlarmName = java.lang.String
  type AlertTargetArn = java.lang.String
  type AlertTargetType = awsDashSdkLib.awsDashSdkLibStrings.SNS | java.lang.String
  type AlertTargets = org.scalablytyped.runtime.StringDictionary[AlertTarget]
  type AllowAutoRegistration = scala.Boolean
  type ApproximateSecondsBeforeTimedOut = scala.Double
  type AscendingOrder = scala.Boolean
  type AttributeKey = java.lang.String
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type Attributes = org.scalablytyped.runtime.StringDictionary[AttributeValue]
  type AttributesMap = org.scalablytyped.runtime.StringDictionary[Value]
  type AuditCheckConfigurations = org.scalablytyped.runtime.StringDictionary[AuditCheckConfiguration]
  type AuditCheckName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.WAITING_FOR_DATA_COLLECTION
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELED
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED_COMPLIANT
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED_NON_COMPLIANT
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type AuditCheckRunStatus = _AuditCheckRunStatus | java.lang.String
  type AuditDetails = org.scalablytyped.runtime.StringDictionary[AuditCheckDetails]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CRITICAL
    - awsDashSdkLib.awsDashSdkLibStrings.HIGH
    - awsDashSdkLib.awsDashSdkLibStrings.MEDIUM
    - awsDashSdkLib.awsDashSdkLibStrings.LOW
    - java.lang.String
  */
  type AuditFindingSeverity = _AuditFindingSeverity | java.lang.String
  type AuditFindings = js.Array[AuditFinding]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DAILY
    - awsDashSdkLib.awsDashSdkLibStrings.WEEKLY
    - awsDashSdkLib.awsDashSdkLibStrings.BIWEEKLY
    - awsDashSdkLib.awsDashSdkLibStrings.MONTHLY
    - java.lang.String
  */
  type AuditFrequency = _AuditFrequency | java.lang.String
  type AuditNotificationTargetConfigurations = org.scalablytyped.runtime.StringDictionary[AuditNotificationTarget]
  type AuditNotificationType = awsDashSdkLib.awsDashSdkLibStrings.SNS | java.lang.String
  type AuditTaskId = java.lang.String
  type AuditTaskMetadataList = js.Array[AuditTaskMetadata]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELED
    - java.lang.String
  */
  type AuditTaskStatus = _AuditTaskStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ON_DEMAND_AUDIT_TASK
    - awsDashSdkLib.awsDashSdkLibStrings.SCHEDULED_AUDIT_TASK
    - java.lang.String
  */
  type AuditTaskType = _AuditTaskType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ALLOWED
    - awsDashSdkLib.awsDashSdkLibStrings.EXPLICIT_DENY
    - awsDashSdkLib.awsDashSdkLibStrings.IMPLICIT_DENY
    - java.lang.String
  */
  type AuthDecision = _AuthDecision | java.lang.String
  type AuthInfos = js.Array[AuthInfo]
  type AuthResults = js.Array[AuthResult]
  type AuthorizerArn = java.lang.String
  type AuthorizerFunctionArn = java.lang.String
  type AuthorizerName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.INACTIVE
    - java.lang.String
  */
  type AuthorizerStatus = _AuthorizerStatus | java.lang.String
  type Authorizers = js.Array[AuthorizerSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLE
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLE
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
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.INACTIVE
    - java.lang.String
  */
  type CACertificateStatus = _CACertificateStatus | java.lang.String
  type CACertificates = js.Array[CACertificate]
  type CanceledChecksCount = scala.Double
  type CanceledThings = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`private`
    - awsDashSdkLib.awsDashSdkLibStrings.`public-read`
    - awsDashSdkLib.awsDashSdkLibStrings.`public-read-write`
    - awsDashSdkLib.awsDashSdkLibStrings.`aws-exec-read`
    - awsDashSdkLib.awsDashSdkLibStrings.`authenticated-read`
    - awsDashSdkLib.awsDashSdkLibStrings.`bucket-owner-read`
    - awsDashSdkLib.awsDashSdkLibStrings.`bucket-owner-full-control`
    - awsDashSdkLib.awsDashSdkLibStrings.`log-delivery-write`
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
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.INACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.REVOKED
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_TRANSFER
    - awsDashSdkLib.awsDashSdkLibStrings.REGISTER_INACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_ACTIVATION
    - java.lang.String
  */
  type CertificateStatus = _CertificateStatus | java.lang.String
  type Certificates = js.Array[Certificate]
  type ChannelName = java.lang.String
  type CheckCompliant = scala.Boolean
  type Cidr = java.lang.String
  type Cidrs = js.Array[Cidr]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientId = java.lang.String
  type Code = java.lang.String
  type CognitoIdentityPoolId = java.lang.String
  type Comment = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`less-than`
    - awsDashSdkLib.awsDashSdkLibStrings.`less-than-equals`
    - awsDashSdkLib.awsDashSdkLibStrings.`greater-than`
    - awsDashSdkLib.awsDashSdkLibStrings.`greater-than-equals`
    - awsDashSdkLib.awsDashSdkLibStrings.`in-cidr-set`
    - awsDashSdkLib.awsDashSdkLibStrings.`not-in-cidr-set`
    - awsDashSdkLib.awsDashSdkLibStrings.`in-port-set`
    - awsDashSdkLib.awsDashSdkLibStrings.`not-in-port-set`
    - java.lang.String
  */
  type ComparisonOperator = _ComparisonOperator | java.lang.String
  type CompliantChecksCount = scala.Double
  type ConnectivityTimestamp = scala.Double
  type ConsecutiveDatapointsToAlarm = scala.Double
  type ConsecutiveDatapointsToClear = scala.Double
  type Count = scala.Double
  type CreatedAtDate = stdLib.Date
  type CreationDate = stdLib.Date
  type CredentialDurationSeconds = scala.Double
  type CustomerVersion = scala.Double
  type DateType = stdLib.Date
  type DayOfMonth = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SUN
    - awsDashSdkLib.awsDashSdkLibStrings.MON
    - awsDashSdkLib.awsDashSdkLibStrings.TUE
    - awsDashSdkLib.awsDashSdkLibStrings.WED
    - awsDashSdkLib.awsDashSdkLibStrings.THU
    - awsDashSdkLib.awsDashSdkLibStrings.FRI
    - awsDashSdkLib.awsDashSdkLibStrings.SAT
    - java.lang.String
  */
  type DayOfWeek = _DayOfWeek | java.lang.String
  type DeleteAdditionalMetricsToRetain = scala.Boolean
  type DeleteAlertTargets = scala.Boolean
  type DeleteBehaviors = scala.Boolean
  type DeleteScheduledAudits = scala.Boolean
  type DeleteStream = scala.Boolean
  type DeliveryStreamName = java.lang.String
  type DeprecationDate = stdLib.Date
  type Description = java.lang.String
  type DetailsKey = java.lang.String
  type DetailsMap = org.scalablytyped.runtime.StringDictionary[DetailsValue]
  type DetailsValue = java.lang.String
  type DisableAllLogs = scala.Boolean
  type DurationSeconds = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.BUILDING
    - awsDashSdkLib.awsDashSdkLibStrings.REBUILDING
    - java.lang.String
  */
  type DynamicGroupStatus = _DynamicGroupStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.STRING
    - awsDashSdkLib.awsDashSdkLibStrings.NUMBER
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
  type EventConfigurations = org.scalablytyped.runtime.StringDictionary[Configuration]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.THING
    - awsDashSdkLib.awsDashSdkLibStrings.THING_GROUP
    - awsDashSdkLib.awsDashSdkLibStrings.THING_TYPE
    - awsDashSdkLib.awsDashSdkLibStrings.THING_GROUP_MEMBERSHIP
    - awsDashSdkLib.awsDashSdkLibStrings.THING_GROUP_HIERARCHY
    - awsDashSdkLib.awsDashSdkLibStrings.THING_TYPE_ASSOCIATION
    - awsDashSdkLib.awsDashSdkLibStrings.JOB
    - awsDashSdkLib.awsDashSdkLibStrings.JOB_EXECUTION
    - awsDashSdkLib.awsDashSdkLibStrings.POLICY
    - awsDashSdkLib.awsDashSdkLibStrings.CERTIFICATE
    - awsDashSdkLib.awsDashSdkLibStrings.CA_CERTIFICATE
    - java.lang.String
  */
  type EventType = _EventType | java.lang.String
  type ExecutionNamePrefix = java.lang.String
  type ExecutionNumber = scala.Double
  type ExpectedVersion = scala.Double
  type ExpiresInSec = scala.Double
  type FailedChecksCount = scala.Double
  type FailedThings = scala.Double
  type FileId = scala.Double
  type FileName = java.lang.String
  type FirehoseSeparator = java.lang.String
  type Flag = scala.Boolean
  type ForceDelete = scala.Boolean
  type ForceDeleteAWSJob = scala.Boolean
  type ForceFlag = scala.Boolean
  type Forced = scala.Boolean
  type FunctionArn = java.lang.String
  type GEMaxResults = scala.Double
  type GenerationId = java.lang.String
  type HashAlgorithm = java.lang.String
  type HashKeyField = java.lang.String
  type HashKeyValue = java.lang.String
  type InProgressChecksCount = scala.Double
  type InProgressThings = scala.Double
  type InProgressTimeoutInMinutes = scala.Double
  type IncrementFactor = scala.Double
  type IndexName = java.lang.String
  type IndexNamesList = js.Array[IndexName]
  type IndexSchema = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.BUILDING
    - awsDashSdkLib.awsDashSdkLibStrings.REBUILDING
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
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.REJECTED
    - awsDashSdkLib.awsDashSdkLibStrings.TIMED_OUT
    - awsDashSdkLib.awsDashSdkLibStrings.ALL
    - java.lang.String
  */
  type JobExecutionFailureType = _JobExecutionFailureType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.QUEUED
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.TIMED_OUT
    - awsDashSdkLib.awsDashSdkLibStrings.REJECTED
    - awsDashSdkLib.awsDashSdkLibStrings.REMOVED
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELED
    - java.lang.String
  */
  type JobExecutionStatus = _JobExecutionStatus | java.lang.String
  type JobExecutionSummaryForJobList = js.Array[JobExecutionSummaryForJob]
  type JobExecutionSummaryForThingList = js.Array[JobExecutionSummaryForThing]
  type JobId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELED
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETION_IN_PROGRESS
    - java.lang.String
  */
  type JobStatus = _JobStatus | java.lang.String
  type JobSummaryList = js.Array[JobSummary]
  type JobTargets = js.Array[TargetArn]
  type JsonDocument = java.lang.String
  type Key = java.lang.String
  type KeyName = java.lang.String
  type KeyValue = java.lang.String
  type LaserMaxResults = scala.Double
  type LastModifiedDate = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DEBUG
    - awsDashSdkLib.awsDashSdkLibStrings.INFO
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.WARN
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - java.lang.String
  */
  type LogLevel = _LogLevel | java.lang.String
  type LogTargetConfigurations = js.Array[LogTargetConfiguration]
  type LogTargetName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DEFAULT
    - awsDashSdkLib.awsDashSdkLibStrings.THING_GROUP
    - java.lang.String
  */
  type LogTargetType = _LogTargetType | java.lang.String
  type Marker = java.lang.String
  type MaxJobExecutionsPerMin = scala.Double
  type MaxResults = scala.Double
  type MaximumPerMinute = scala.Double
  type Message = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.RAW
    - awsDashSdkLib.awsDashSdkLibStrings.JSON
    - java.lang.String
  */
  type MessageFormat = _MessageFormat | java.lang.String
  type MessageId = java.lang.String
  type MinimumNumberOfExecutedThings = scala.Double
  type MissingContextValue = java.lang.String
  type MissingContextValues = js.Array[MissingContextValue]
  type NextToken = java.lang.String
  type NonCompliantChecksCount = scala.Double
  type NonCompliantResourcesCount = scala.Double
  type NumberOfThings = scala.Double
  type OTAUpdateArn = java.lang.String
  type OTAUpdateDescription = java.lang.String
  type OTAUpdateErrorMessage = java.lang.String
  type OTAUpdateFileVersion = java.lang.String
  type OTAUpdateFiles = js.Array[OTAUpdateFile]
  type OTAUpdateId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_COMPLETE
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_FAILED
    - java.lang.String
  */
  type OTAUpdateStatus = _OTAUpdateStatus | java.lang.String
  type OTAUpdatesSummary = js.Array[OTAUpdateSummary]
  type OptionalVersion = scala.Double
  type OutgoingCertificates = js.Array[OutgoingCertificate]
  type OverrideDynamicGroups = scala.Boolean
  type PageSize = scala.Double
  type Parameter = java.lang.String
  type Parameters = org.scalablytyped.runtime.StringDictionary[Value]
  type PartitionKey = java.lang.String
  type PayloadField = java.lang.String
  type Percentage = scala.Double
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
  type Port = scala.Double
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
  type PublicKeyMap = org.scalablytyped.runtime.StringDictionary[KeyValue]
  type QueryMaxResults = scala.Double
  type QueryString = java.lang.String
  type QueryVersion = java.lang.String
  type QueueUrl = java.lang.String
  type QueuedThings = scala.Double
  type RangeKeyField = java.lang.String
  type RangeKeyValue = java.lang.String
  type ReasonCode = java.lang.String
  type ReasonForNonCompliance = java.lang.String
  type ReasonForNonComplianceCode = java.lang.String
  type Recursive = scala.Boolean
  type RecursiveWithoutDefault = scala.Boolean
  type RegistrationCode = java.lang.String
  type RegistryMaxResults = scala.Double
  type RegistryS3BucketName = java.lang.String
  type RegistryS3KeyName = java.lang.String
  type RejectedThings = scala.Double
  type RelatedResources = js.Array[RelatedResource]
  type RemoveAutoRegistration = scala.Boolean
  type RemoveThingType = scala.Boolean
  type RemovedThings = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ERRORS
    - awsDashSdkLib.awsDashSdkLibStrings.RESULTS
    - java.lang.String
  */
  type ReportType = _ReportType | java.lang.String
  type Resource = java.lang.String
  type ResourceArn = java.lang.String
  type ResourceArns = org.scalablytyped.runtime.StringDictionary[ResourceArn]
  type ResourceLogicalId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DEVICE_CERTIFICATE
    - awsDashSdkLib.awsDashSdkLibStrings.CA_CERTIFICATE
    - awsDashSdkLib.awsDashSdkLibStrings.IOT_POLICY
    - awsDashSdkLib.awsDashSdkLibStrings.COGNITO_IDENTITY_POOL
    - awsDashSdkLib.awsDashSdkLibStrings.CLIENT_ID
    - awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT_SETTINGS
    - java.lang.String
  */
  type ResourceType = _ResourceType | java.lang.String
  type Resources = js.Array[Resource]
  type RoleAlias = java.lang.String
  type RoleAliasArn = java.lang.String
  type RoleAliases = js.Array[RoleAlias]
  type RoleArn = java.lang.String
  type RolloutRatePerMinute = scala.Double
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
  type Seconds = scala.Double
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
  type Signature = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type SignatureAlgorithm = java.lang.String
  type SigningJobId = java.lang.String
  type SigningProfileName = java.lang.String
  type SkyfallMaxResults = scala.Double
  type StateMachineName = java.lang.String
  type StateReason = java.lang.String
  type StateValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Completed
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Cancelled
    - awsDashSdkLib.awsDashSdkLibStrings.Cancelling
    - java.lang.String
  */
  type Status = _Status | java.lang.String
  type StreamArn = java.lang.String
  type StreamDescription = java.lang.String
  type StreamFiles = js.Array[StreamFile]
  type StreamId = java.lang.String
  type StreamName = java.lang.String
  type StreamVersion = scala.Double
  type StreamsSummary = js.Array[StreamSummary]
  type String = java.lang.String
  type StringMap = org.scalablytyped.runtime.StringDictionary[String]
  type SucceededThings = scala.Double
  type TableName = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type Target = java.lang.String
  type TargetArn = java.lang.String
  type TargetAuditCheckNames = js.Array[AuditCheckName]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CONTINUOUS
    - awsDashSdkLib.awsDashSdkLibStrings.SNAPSHOT
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
    - awsDashSdkLib.awsDashSdkLibStrings.OFF
    - awsDashSdkLib.awsDashSdkLibStrings.STATUS
    - java.lang.String
  */
  type ThingConnectivityIndexingMode = _ThingConnectivityIndexingMode | java.lang.String
  type ThingDocumentList = js.Array[ThingDocument]
  type ThingGroupArn = java.lang.String
  type ThingGroupDescription = java.lang.String
  type ThingGroupDocumentList = js.Array[ThingGroupDocument]
  type ThingGroupId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.OFF
    - awsDashSdkLib.awsDashSdkLibStrings.ON
    - java.lang.String
  */
  type ThingGroupIndexingMode = _ThingGroupIndexingMode | java.lang.String
  type ThingGroupList = js.Array[ThingGroupName]
  type ThingGroupName = java.lang.String
  type ThingGroupNameAndArnList = js.Array[GroupNameAndArn]
  type ThingGroupNameList = js.Array[ThingGroupName]
  type ThingId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.OFF
    - awsDashSdkLib.awsDashSdkLibStrings.REGISTRY
    - awsDashSdkLib.awsDashSdkLibStrings.REGISTRY_AND_SHADOW
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
  type TimedOutThings = scala.Double
  type Timestamp = stdLib.Date
  type Token = java.lang.String
  type TokenKeyName = java.lang.String
  type TokenSignature = java.lang.String
  type Topic = java.lang.String
  type TopicPattern = java.lang.String
  type TopicRuleList = js.Array[TopicRuleListItem]
  type TotalChecksCount = scala.Double
  type TotalResourcesCount = scala.Double
  type UndoDeprecate = scala.Boolean
  type UnsignedLong = scala.Double
  type UseBase64 = scala.Boolean
  type Valid = scala.Boolean
  type ValidationErrors = js.Array[ValidationError]
  type Value = java.lang.String
  type Version = scala.Double
  type VersionNumber = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`in-alarm`
    - awsDashSdkLib.awsDashSdkLibStrings.`alarm-cleared`
    - awsDashSdkLib.awsDashSdkLibStrings.`alarm-invalidated`
    - java.lang.String
  */
  type ViolationEventType = _ViolationEventType | java.lang.String
  type ViolationEvents = js.Array[ViolationEvent]
  type ViolationId = java.lang.String
  type WaitingForDataCollectionChecksCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-05-28`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
