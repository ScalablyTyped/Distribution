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

  type AWSRegionName = String
  type AccessKeyId = String
  type AccountId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Source
    - typings.awsDashSdk.awsDashSdkStrings.Build
    - typings.awsDashSdk.awsDashSdkStrings.Deploy
    - typings.awsDashSdk.awsDashSdkStrings.Test
    - typings.awsDashSdk.awsDashSdkStrings.Invoke
    - typings.awsDashSdk.awsDashSdkStrings.Approval
    - java.lang.String
  */
  type ActionCategory = _ActionCategory | String
  type ActionConfigurationKey = String
  type ActionConfigurationMap = StringDictionary[ActionConfigurationValue]
  type ActionConfigurationPropertyList = js.Array[ActionConfigurationProperty]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.String
    - typings.awsDashSdk.awsDashSdkStrings.Number
    - typings.awsDashSdk.awsDashSdkStrings.Boolean
    - java.lang.String
  */
  type ActionConfigurationPropertyType = _ActionConfigurationPropertyType | String
  type ActionConfigurationQueryableValue = String
  type ActionConfigurationValue = String
  type ActionExecutionDetailList = js.Array[ActionExecutionDetail]
  type ActionExecutionId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Succeeded
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type ActionExecutionStatus = _ActionExecutionStatus | String
  type ActionExecutionToken = String
  type ActionName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AWS
    - typings.awsDashSdk.awsDashSdkStrings.ThirdParty
    - typings.awsDashSdk.awsDashSdkStrings.Custom
    - java.lang.String
  */
  type ActionOwner = _ActionOwner | String
  type ActionProvider = String
  type ActionRunOrder = Double
  type ActionStateList = js.Array[ActionState]
  type ActionTypeList = js.Array[ActionType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Approved
    - typings.awsDashSdk.awsDashSdkStrings.Rejected
    - java.lang.String
  */
  type ApprovalStatus = _ApprovalStatus | String
  type ApprovalSummary = String
  type ApprovalToken = String
  type ArtifactDetailList = js.Array[ArtifactDetail]
  type ArtifactList = js.Array[Artifact]
  type ArtifactLocationType = S3 | String
  type ArtifactName = String
  type ArtifactRevisionList = js.Array[ArtifactRevision]
  type ArtifactStoreLocation = String
  type ArtifactStoreMap = StringDictionary[ArtifactStore]
  type ArtifactStoreType = S3 | String
  type BlockerName = String
  type BlockerType = Schedule | String
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientId = String
  type ClientRequestToken = String
  type ClientToken = String
  type Code = String
  type ContinuationToken = String
  type Description = String
  type DisabledReason = String
  type Enabled = scala.Boolean
  type EncryptionKeyId = String
  type EncryptionKeyType = KMS | String
  type ExecutionId = String
  type ExecutionSummary = String
  type ExternalExecutionId = String
  type ExternalExecutionSummary = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.JobFailed
    - typings.awsDashSdk.awsDashSdkStrings.ConfigurationError
    - typings.awsDashSdk.awsDashSdkStrings.PermissionError
    - typings.awsDashSdk.awsDashSdkStrings.RevisionOutOfSync
    - typings.awsDashSdk.awsDashSdkStrings.RevisionUnavailable
    - typings.awsDashSdk.awsDashSdkStrings.SystemUnavailable
    - java.lang.String
  */
  type FailureType = _FailureType | String
  type InputArtifactList = js.Array[InputArtifact]
  type JobId = String
  type JobList = js.Array[Job]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Created
    - typings.awsDashSdk.awsDashSdkStrings.Queued
    - typings.awsDashSdk.awsDashSdkStrings.Dispatched
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.TimedOut
    - typings.awsDashSdk.awsDashSdkStrings.Succeeded
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type JobStatus = _JobStatus | String
  type JsonPath = String
  type LastChangedAt = Date
  type LastChangedBy = String
  type LastUpdatedBy = String
  type MatchEquals = String
  type MaxBatchSize = Double
  type MaxResults = Double
  type MaximumArtifactCount = Double
  type Message = String
  type MinimumArtifactCount = Double
  type NextToken = String
  type Nonce = String
  type OutputArtifactList = js.Array[OutputArtifact]
  type Percentage = Double
  type PipelineArn = String
  type PipelineExecutionId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Succeeded
    - typings.awsDashSdk.awsDashSdkStrings.Superseded
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type PipelineExecutionStatus = _PipelineExecutionStatus | String
  type PipelineExecutionSummaryList = js.Array[PipelineExecutionSummary]
  type PipelineList = js.Array[PipelineSummary]
  type PipelineName = String
  type PipelineStageDeclarationList = js.Array[StageDeclaration]
  type PipelineVersion = Double
  type QueryParamMap = StringDictionary[ActionConfigurationQueryableValue]
  type ResourceArn = String
  type Revision = String
  type RevisionChangeIdentifier = String
  type RevisionSummary = String
  type RoleArn = String
  type S3Bucket = String
  type S3BucketName = String
  type S3Key = String
  type S3ObjectKey = String
  type SecretAccessKey = String
  type SessionToken = String
  type SourceRevisionList = js.Array[SourceRevision]
  type StageActionDeclarationList = js.Array[ActionDeclaration]
  type StageBlockerDeclarationList = js.Array[BlockerDeclaration]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.Succeeded
    - java.lang.String
  */
  type StageExecutionStatus = _StageExecutionStatus | String
  type StageName = String
  type StageRetryMode = FAILED_ACTIONS | String
  type StageStateList = js.Array[StageState]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Inbound
    - typings.awsDashSdk.awsDashSdkStrings.Outbound
    - java.lang.String
  */
  type StageTransitionType = _StageTransitionType | String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type ThirdPartyJobId = String
  type ThirdPartyJobList = js.Array[ThirdPartyJob]
  type Time = Date
  type Timestamp = Date
  type Url = String
  type UrlTemplate = String
  type Version = String
  type WebhookArn = String
  type WebhookAuthConfigurationAllowedIPRange = String
  type WebhookAuthConfigurationSecretToken = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.GITHUB_HMAC
    - typings.awsDashSdk.awsDashSdkStrings.IP
    - typings.awsDashSdk.awsDashSdkStrings.UNAUTHENTICATED
    - java.lang.String
  */
  type WebhookAuthenticationType = _WebhookAuthenticationType | String
  type WebhookErrorCode = String
  type WebhookErrorMessage = String
  type WebhookFilters = js.Array[WebhookFilterRule]
  type WebhookLastTriggered = Date
  type WebhookList = js.Array[ListWebhookItem]
  type WebhookName = String
  type WebhookUrl = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2015-07-09`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
