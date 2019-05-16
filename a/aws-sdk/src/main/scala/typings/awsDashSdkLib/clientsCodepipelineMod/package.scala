package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCodepipelineMod {
  type AWSRegionName = java.lang.String
  type AccessKeyId = java.lang.String
  type AccountId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Source
    - awsDashSdkLib.awsDashSdkLibStrings.Build
    - awsDashSdkLib.awsDashSdkLibStrings.Deploy
    - awsDashSdkLib.awsDashSdkLibStrings.Test
    - awsDashSdkLib.awsDashSdkLibStrings.Invoke
    - awsDashSdkLib.awsDashSdkLibStrings.Approval
    - java.lang.String
  */
  type ActionCategory = _ActionCategory | java.lang.String
  type ActionConfigurationKey = java.lang.String
  type ActionConfigurationMap = org.scalablytyped.runtime.StringDictionary[ActionConfigurationValue]
  type ActionConfigurationPropertyList = js.Array[ActionConfigurationProperty]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.String
    - awsDashSdkLib.awsDashSdkLibStrings.Number
    - awsDashSdkLib.awsDashSdkLibStrings.Boolean
    - java.lang.String
  */
  type ActionConfigurationPropertyType = _ActionConfigurationPropertyType | java.lang.String
  type ActionConfigurationQueryableValue = java.lang.String
  type ActionConfigurationValue = java.lang.String
  type ActionExecutionDetailList = js.Array[ActionExecutionDetail]
  type ActionExecutionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Succeeded
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type ActionExecutionStatus = _ActionExecutionStatus | java.lang.String
  type ActionExecutionToken = java.lang.String
  type ActionName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AWS
    - awsDashSdkLib.awsDashSdkLibStrings.ThirdParty
    - awsDashSdkLib.awsDashSdkLibStrings.Custom
    - java.lang.String
  */
  type ActionOwner = _ActionOwner | java.lang.String
  type ActionProvider = java.lang.String
  type ActionRunOrder = scala.Double
  type ActionStateList = js.Array[ActionState]
  type ActionTypeList = js.Array[ActionType]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Approved
    - awsDashSdkLib.awsDashSdkLibStrings.Rejected
    - java.lang.String
  */
  type ApprovalStatus = _ApprovalStatus | java.lang.String
  type ApprovalSummary = java.lang.String
  type ApprovalToken = java.lang.String
  type ArtifactDetailList = js.Array[ArtifactDetail]
  type ArtifactList = js.Array[Artifact]
  type ArtifactLocationType = awsDashSdkLib.awsDashSdkLibStrings.S3 | java.lang.String
  type ArtifactName = java.lang.String
  type ArtifactRevisionList = js.Array[ArtifactRevision]
  type ArtifactStoreLocation = java.lang.String
  type ArtifactStoreMap = org.scalablytyped.runtime.StringDictionary[ArtifactStore]
  type ArtifactStoreType = awsDashSdkLib.awsDashSdkLibStrings.S3 | java.lang.String
  type BlockerName = java.lang.String
  type BlockerType = awsDashSdkLib.awsDashSdkLibStrings.Schedule | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientId = java.lang.String
  type ClientRequestToken = java.lang.String
  type ClientToken = java.lang.String
  type Code = java.lang.String
  type ContinuationToken = java.lang.String
  type Description = java.lang.String
  type DisabledReason = java.lang.String
  type Enabled = scala.Boolean
  type EncryptionKeyId = java.lang.String
  type EncryptionKeyType = awsDashSdkLib.awsDashSdkLibStrings.KMS | java.lang.String
  type ExecutionId = java.lang.String
  type ExecutionSummary = java.lang.String
  type ExternalExecutionId = java.lang.String
  type ExternalExecutionSummary = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.JobFailed
    - awsDashSdkLib.awsDashSdkLibStrings.ConfigurationError
    - awsDashSdkLib.awsDashSdkLibStrings.PermissionError
    - awsDashSdkLib.awsDashSdkLibStrings.RevisionOutOfSync
    - awsDashSdkLib.awsDashSdkLibStrings.RevisionUnavailable
    - awsDashSdkLib.awsDashSdkLibStrings.SystemUnavailable
    - java.lang.String
  */
  type FailureType = _FailureType | java.lang.String
  type InputArtifactList = js.Array[InputArtifact]
  type JobId = java.lang.String
  type JobList = js.Array[Job]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Created
    - awsDashSdkLib.awsDashSdkLibStrings.Queued
    - awsDashSdkLib.awsDashSdkLibStrings.Dispatched
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.TimedOut
    - awsDashSdkLib.awsDashSdkLibStrings.Succeeded
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type JobStatus = _JobStatus | java.lang.String
  type JsonPath = java.lang.String
  type LastChangedAt = stdLib.Date
  type LastChangedBy = java.lang.String
  type LastUpdatedBy = java.lang.String
  type MatchEquals = java.lang.String
  type MaxBatchSize = scala.Double
  type MaxResults = scala.Double
  type MaximumArtifactCount = scala.Double
  type Message = java.lang.String
  type MinimumArtifactCount = scala.Double
  type NextToken = java.lang.String
  type Nonce = java.lang.String
  type OutputArtifactList = js.Array[OutputArtifact]
  type Percentage = scala.Double
  type PipelineArn = java.lang.String
  type PipelineExecutionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Succeeded
    - awsDashSdkLib.awsDashSdkLibStrings.Superseded
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type PipelineExecutionStatus = _PipelineExecutionStatus | java.lang.String
  type PipelineExecutionSummaryList = js.Array[PipelineExecutionSummary]
  type PipelineList = js.Array[PipelineSummary]
  type PipelineName = java.lang.String
  type PipelineStageDeclarationList = js.Array[StageDeclaration]
  type PipelineVersion = scala.Double
  type QueryParamMap = org.scalablytyped.runtime.StringDictionary[ActionConfigurationQueryableValue]
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
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Succeeded
    - java.lang.String
  */
  type StageExecutionStatus = _StageExecutionStatus | java.lang.String
  type StageName = java.lang.String
  type StageRetryMode = awsDashSdkLib.awsDashSdkLibStrings.FAILED_ACTIONS | java.lang.String
  type StageStateList = js.Array[StageState]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Inbound
    - awsDashSdkLib.awsDashSdkLibStrings.Outbound
    - java.lang.String
  */
  type StageTransitionType = _StageTransitionType | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type ThirdPartyJobId = java.lang.String
  type ThirdPartyJobList = js.Array[ThirdPartyJob]
  type Time = stdLib.Date
  type Timestamp = stdLib.Date
  type Url = java.lang.String
  type UrlTemplate = java.lang.String
  type Version = java.lang.String
  type WebhookArn = java.lang.String
  type WebhookAuthConfigurationAllowedIPRange = java.lang.String
  type WebhookAuthConfigurationSecretToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.GITHUB_HMAC
    - awsDashSdkLib.awsDashSdkLibStrings.IP
    - awsDashSdkLib.awsDashSdkLibStrings.UNAUTHENTICATED
    - java.lang.String
  */
  type WebhookAuthenticationType = _WebhookAuthenticationType | java.lang.String
  type WebhookErrorCode = java.lang.String
  type WebhookErrorMessage = java.lang.String
  type WebhookFilters = js.Array[WebhookFilterRule]
  type WebhookLastTriggered = stdLib.Date
  type WebhookList = js.Array[ListWebhookItem]
  type WebhookName = java.lang.String
  type WebhookUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-07-09`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
