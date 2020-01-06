package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCodepipelineMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.FAILED_ACTIONS
  import typings.awsDashSdk.awsDashSdkStrings.KMS
  import typings.awsDashSdk.awsDashSdkStrings.S3
  import typings.awsDashSdk.awsDashSdkStrings.Schedule
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AWSRegionName = java.lang.String
  type AccessKeyId = java.lang.String
  type AccountId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Source
    - typings.awsDashSdk.awsDashSdkStrings.Build_
    - typings.awsDashSdk.awsDashSdkStrings.Deploy
    - typings.awsDashSdk.awsDashSdkStrings.Test_
    - typings.awsDashSdk.awsDashSdkStrings.Invoke
    - typings.awsDashSdk.awsDashSdkStrings.Approval
    - java.lang.String
  */
  type ActionCategory = _ActionCategory | java.lang.String
  type ActionConfigurationKey = java.lang.String
  type ActionConfigurationMap = StringDictionary[ActionConfigurationValue]
  type ActionConfigurationPropertyList = js.Array[ActionConfigurationProperty]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.String_
    - typings.awsDashSdk.awsDashSdkStrings.Number_
    - typings.awsDashSdk.awsDashSdkStrings.Boolean_
    - java.lang.String
  */
  type ActionConfigurationPropertyType = _ActionConfigurationPropertyType | java.lang.String
  type ActionConfigurationQueryableValue = java.lang.String
  type ActionConfigurationValue = java.lang.String
  type ActionExecutionDetailList = js.Array[ActionExecutionDetail]
  type ActionExecutionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - typings.awsDashSdk.awsDashSdkStrings.Succeeded_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - java.lang.String
  */
  type ActionExecutionStatus = _ActionExecutionStatus | java.lang.String
  type ActionExecutionToken = java.lang.String
  type ActionName = java.lang.String
  type ActionNamespace = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AWS
    - typings.awsDashSdk.awsDashSdkStrings.ThirdParty
    - typings.awsDashSdk.awsDashSdkStrings.Custom_
    - java.lang.String
  */
  type ActionOwner = _ActionOwner | java.lang.String
  type ActionProvider = java.lang.String
  type ActionRunOrder = Double
  type ActionStateList = js.Array[ActionState]
  type ActionTypeList = js.Array[ActionType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Approved_
    - typings.awsDashSdk.awsDashSdkStrings.Rejected_
    - java.lang.String
  */
  type ApprovalStatus = _ApprovalStatus | java.lang.String
  type ApprovalSummary = java.lang.String
  type ApprovalToken = java.lang.String
  type ArtifactDetailList = js.Array[ArtifactDetail]
  type ArtifactList = js.Array[Artifact]
  type ArtifactLocationType = S3 | java.lang.String
  type ArtifactName = java.lang.String
  type ArtifactRevisionList = js.Array[ArtifactRevision]
  type ArtifactStoreLocation = java.lang.String
  type ArtifactStoreMap = StringDictionary[ArtifactStore]
  type ArtifactStoreType = S3 | java.lang.String
  type BlockerName = java.lang.String
  type BlockerType = Schedule | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientId = java.lang.String
  type ClientRequestToken = java.lang.String
  type ClientToken = java.lang.String
  type Code = java.lang.String
  type ContinuationToken = java.lang.String
  type Description = java.lang.String
  type DisabledReason = java.lang.String
  type Enabled = scala.Boolean
  type EncryptionKeyId = java.lang.String
  type EncryptionKeyType = KMS | java.lang.String
  type ExecutionId = java.lang.String
  type ExecutionSummary = java.lang.String
  type ExternalExecutionId = java.lang.String
  type ExternalExecutionSummary = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.JobFailed
    - typings.awsDashSdk.awsDashSdkStrings.ConfigurationError
    - typings.awsDashSdk.awsDashSdkStrings.PermissionError
    - typings.awsDashSdk.awsDashSdkStrings.RevisionOutOfSync
    - typings.awsDashSdk.awsDashSdkStrings.RevisionUnavailable
    - typings.awsDashSdk.awsDashSdkStrings.SystemUnavailable
    - java.lang.String
  */
  type FailureType = _FailureType | java.lang.String
  type InputArtifactList = js.Array[InputArtifact]
  type JobId = java.lang.String
  type JobList = js.Array[Job]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Created_
    - typings.awsDashSdk.awsDashSdkStrings.Queued_
    - typings.awsDashSdk.awsDashSdkStrings.Dispatched
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - typings.awsDashSdk.awsDashSdkStrings.TimedOut_
    - typings.awsDashSdk.awsDashSdkStrings.Succeeded_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - java.lang.String
  */
  type JobStatus = _JobStatus | java.lang.String
  type JsonPath = java.lang.String
  type LastChangedAt = Date
  type LastChangedBy = java.lang.String
  type LastUpdatedBy = java.lang.String
  type MatchEquals = java.lang.String
  type MaxBatchSize = Double
  type MaxResults = Double
  type MaximumArtifactCount = Double
  type Message = java.lang.String
  type MinimumArtifactCount = Double
  type NextToken = java.lang.String
  type Nonce = java.lang.String
  type OutputArtifactList = js.Array[OutputArtifact]
  type OutputVariablesKey = java.lang.String
  type OutputVariablesMap = StringDictionary[OutputVariablesValue]
  type OutputVariablesValue = java.lang.String
  type Percentage = Double
  type PipelineArn = java.lang.String
  type PipelineExecutionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - typings.awsDashSdk.awsDashSdkStrings.Succeeded_
    - typings.awsDashSdk.awsDashSdkStrings.Superseded_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - java.lang.String
  */
  type PipelineExecutionStatus = _PipelineExecutionStatus | java.lang.String
  type PipelineExecutionSummaryList = js.Array[PipelineExecutionSummary]
  type PipelineList = js.Array[PipelineSummary]
  type PipelineName = java.lang.String
  type PipelineStageDeclarationList = js.Array[StageDeclaration]
  type PipelineVersion = Double
  type QueryParamMap = StringDictionary[ActionConfigurationQueryableValue]
  type ResolvedActionConfigurationMap = StringDictionary[String]
  type ResourceArn = java.lang.String
  type Revision = java.lang.String
  type RevisionChangeIdentifier = java.lang.String
  type RevisionSummary = java.lang.String
  type RoleArn = java.lang.String
  type S3Bucket = java.lang.String
  type S3BucketName = java.lang.String
  type S3Key = java.lang.String
  type S3ObjectKey = java.lang.String
  type SecretAccessKey = java.lang.String
  type SessionToken = java.lang.String
  type SourceRevisionList = js.Array[SourceRevision]
  type StageActionDeclarationList = js.Array[ActionDeclaration]
  type StageBlockerDeclarationList = js.Array[BlockerDeclaration]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Succeeded_
    - java.lang.String
  */
  type StageExecutionStatus = _StageExecutionStatus | java.lang.String
  type StageName = java.lang.String
  type StageRetryMode = FAILED_ACTIONS | java.lang.String
  type StageStateList = js.Array[StageState]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Inbound_
    - typings.awsDashSdk.awsDashSdkStrings.Outbound_
    - java.lang.String
  */
  type StageTransitionType = _StageTransitionType | java.lang.String
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type ThirdPartyJobId = java.lang.String
  type ThirdPartyJobList = js.Array[ThirdPartyJob]
  type Time = Date
  type Timestamp = Date
  type TriggerDetail = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CreatePipeline
    - typings.awsDashSdk.awsDashSdkStrings.StartPipelineExecution
    - typings.awsDashSdk.awsDashSdkStrings.PollForSourceChanges
    - typings.awsDashSdk.awsDashSdkStrings.Webhook
    - typings.awsDashSdk.awsDashSdkStrings.CloudWatchEvent
    - typings.awsDashSdk.awsDashSdkStrings.PutActionRevision
    - java.lang.String
  */
  type TriggerType = _TriggerType | java.lang.String
  type Url = java.lang.String
  type UrlTemplate = java.lang.String
  type Version = java.lang.String
  type WebhookArn = java.lang.String
  type WebhookAuthConfigurationAllowedIPRange = java.lang.String
  type WebhookAuthConfigurationSecretToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.GITHUB_HMAC
    - typings.awsDashSdk.awsDashSdkStrings.IP
    - typings.awsDashSdk.awsDashSdkStrings.UNAUTHENTICATED
    - java.lang.String
  */
  type WebhookAuthenticationType = _WebhookAuthenticationType | java.lang.String
  type WebhookErrorCode = java.lang.String
  type WebhookErrorMessage = java.lang.String
  type WebhookFilters = js.Array[WebhookFilterRule]
  type WebhookLastTriggered = Date
  type WebhookList = js.Array[ListWebhookItem]
  type WebhookName = java.lang.String
  type WebhookUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2015-07-09`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
