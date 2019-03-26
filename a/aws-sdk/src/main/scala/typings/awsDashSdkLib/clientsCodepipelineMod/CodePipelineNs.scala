package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/codepipeline", "CodePipeline")
@js.native
object CodePipelineNs extends js.Object {
  trait AWSSessionCredentials extends js.Object {
    /**
      * The access key for the session.
      */
    var accessKeyId: AccessKeyId
    /**
      * The secret access key for the session.
      */
    var secretAccessKey: SecretAccessKey
    /**
      * The token for the session.
      */
    var sessionToken: SessionToken
  }
  
  trait AcknowledgeJobInput extends js.Object {
    /**
      * The unique system-generated ID of the job for which you want to confirm receipt.
      */
    var jobId: JobId
    /**
      * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one job worker. Get this number from the response of the PollForJobs request that returned this job.
      */
    var nonce: Nonce
  }
  
  trait AcknowledgeJobOutput extends js.Object {
    /**
      * Whether the job worker has received the specified job.
      */
    var status: js.UndefOr[JobStatus] = js.undefined
  }
  
  trait AcknowledgeThirdPartyJobInput extends js.Object {
    /**
      * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed access to the job and its details.
      */
    var clientToken: ClientToken
    /**
      * The unique system-generated ID of the job.
      */
    var jobId: ThirdPartyJobId
    /**
      * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one job worker. Get this number from the response to a GetThirdPartyJobDetails request.
      */
    var nonce: Nonce
  }
  
  trait AcknowledgeThirdPartyJobOutput extends js.Object {
    /**
      * The status information for the third party job, if any.
      */
    var status: js.UndefOr[JobStatus] = js.undefined
  }
  
  trait ActionConfiguration extends js.Object {
    /**
      * The configuration data for the action.
      */
    var configuration: js.UndefOr[ActionConfigurationMap] = js.undefined
  }
  
  trait ActionConfigurationMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[ActionConfigurationValue]
  
  trait ActionConfigurationProperty extends js.Object {
    /**
      * The description of the action configuration property that will be displayed to users.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * Whether the configuration property is a key.
      */
    var key: Boolean
    /**
      * The name of the action configuration property.
      */
    var name: ActionConfigurationKey
    /**
      * Indicates that the property will be used in conjunction with PollForJobs. When creating a custom action, an action can have up to one queryable property. If it has one, that property must be both required and not secret. If you create a pipeline with a custom action type, and that custom action contains a queryable property, the value for that configuration property is subject to additional restrictions. The value must be less than or equal to twenty (20) characters. The value can contain only alphanumeric characters, underscores, and hyphens.
      */
    var queryable: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the configuration property is a required value.
      */
    var required: Boolean
    /**
      * Whether the configuration property is secret. Secrets are hidden from all calls except for GetJobDetails, GetThirdPartyJobDetails, PollForJobs, and PollForThirdPartyJobs. When updating a pipeline, passing * * * * * without changing any other values of the action will preserve the prior value of the secret.
      */
    var secret: Boolean
    /**
      * The type of the configuration property.
      */
    var `type`: js.UndefOr[ActionConfigurationPropertyType] = js.undefined
  }
  
  trait ActionContext extends js.Object {
    /**
      * The name of the action within the context of a job.
      */
    var name: js.UndefOr[ActionName] = js.undefined
  }
  
  trait ActionDeclaration extends js.Object {
    /**
      * The configuration information for the action type.
      */
    var actionTypeId: ActionTypeId
    /**
      * The action declaration's configuration.
      */
    var configuration: js.UndefOr[ActionConfigurationMap] = js.undefined
    /**
      * The name or ID of the artifact consumed by the action, such as a test or build artifact.
      */
    var inputArtifacts: js.UndefOr[InputArtifactList] = js.undefined
    /**
      * The action declaration's name.
      */
    var name: ActionName
    /**
      * The name or ID of the result of the action declaration, such as a test or build artifact.
      */
    var outputArtifacts: js.UndefOr[OutputArtifactList] = js.undefined
    /**
      * The action declaration's AWS Region, such as us-east-1.
      */
    var region: js.UndefOr[AWSRegionName] = js.undefined
    /**
      * The ARN of the IAM service role that will perform the declared action. This is assumed through the roleArn for the pipeline.
      */
    var roleArn: js.UndefOr[RoleArn] = js.undefined
    /**
      * The order in which actions are run.
      */
    var runOrder: js.UndefOr[ActionRunOrder] = js.undefined
  }
  
  trait ActionExecution extends js.Object {
    /**
      * The details of an error returned by a URL external to AWS.
      */
    var errorDetails: js.UndefOr[ErrorDetails] = js.undefined
    /**
      * The external ID of the run of the action.
      */
    var externalExecutionId: js.UndefOr[ExecutionId] = js.undefined
    /**
      * The URL of a resource external to AWS that will be used when running the action, for example an external repository URL.
      */
    var externalExecutionUrl: js.UndefOr[Url] = js.undefined
    /**
      * The last status change of the action.
      */
    var lastStatusChange: js.UndefOr[Timestamp] = js.undefined
    /**
      * The ARN of the user who last changed the pipeline.
      */
    var lastUpdatedBy: js.UndefOr[LastUpdatedBy] = js.undefined
    /**
      * A percentage of completeness of the action as it runs.
      */
    var percentComplete: js.UndefOr[Percentage] = js.undefined
    /**
      * The status of the action, or for a completed action, the last status of the action.
      */
    var status: js.UndefOr[ActionExecutionStatus] = js.undefined
    /**
      * A summary of the run of the action.
      */
    var summary: js.UndefOr[ExecutionSummary] = js.undefined
    /**
      * The system-generated token used to identify a unique approval request. The token for each open approval request can be obtained using the GetPipelineState command and is used to validate that the approval request corresponding to this token is still valid.
      */
    var token: js.UndefOr[ActionExecutionToken] = js.undefined
  }
  
  trait ActionExecutionDetail extends js.Object {
    /**
      * The action execution ID.
      */
    var actionExecutionId: js.UndefOr[ActionExecutionId] = js.undefined
    /**
      * The name of the action.
      */
    var actionName: js.UndefOr[ActionName] = js.undefined
    /**
      * Input details for the action execution, such as role ARN, Region, and input artifacts.
      */
    var input: js.UndefOr[ActionExecutionInput] = js.undefined
    /**
      * The last update time of the action execution.
      */
    var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Output details for the action execution, such as the action execution result.
      */
    var output: js.UndefOr[ActionExecutionOutput] = js.undefined
    /**
      * The pipeline execution ID for the action execution.
      */
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
    /**
      * The version of the pipeline where the action was run.
      */
    var pipelineVersion: js.UndefOr[PipelineVersion] = js.undefined
    /**
      * The name of the stage that contains the action.
      */
    var stageName: js.UndefOr[StageName] = js.undefined
    /**
      * The start time of the action execution.
      */
    var startTime: js.UndefOr[Timestamp] = js.undefined
    /**
      *  The status of the action execution. Status categories are InProgress, Succeeded, and Failed.
      */
    var status: js.UndefOr[ActionExecutionStatus] = js.undefined
  }
  
  trait ActionExecutionFilter extends js.Object {
    /**
      * The pipeline execution ID used to filter action execution history.
      */
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
  }
  
  trait ActionExecutionInput extends js.Object {
    var actionTypeId: js.UndefOr[ActionTypeId] = js.undefined
    /**
      * Configuration data for an action execution.
      */
    var configuration: js.UndefOr[ActionConfigurationMap] = js.undefined
    /**
      * Details of input artifacts of the action that correspond to the action execution.
      */
    var inputArtifacts: js.UndefOr[ArtifactDetailList] = js.undefined
    /**
      * The AWS Region for the action, such as us-east-1.
      */
    var region: js.UndefOr[AWSRegionName] = js.undefined
    /**
      * The ARN of the IAM service role that performs the declared action. This is assumed through the roleArn for the pipeline. 
      */
    var roleArn: js.UndefOr[RoleArn] = js.undefined
  }
  
  trait ActionExecutionOutput extends js.Object {
    /**
      * Execution result information listed in the output details for an action execution.
      */
    var executionResult: js.UndefOr[ActionExecutionResult] = js.undefined
    /**
      * Details of output artifacts of the action that correspond to the action execution.
      */
    var outputArtifacts: js.UndefOr[ArtifactDetailList] = js.undefined
  }
  
  trait ActionExecutionResult extends js.Object {
    /**
      * The action provider's external ID for the action execution.
      */
    var externalExecutionId: js.UndefOr[ExternalExecutionId] = js.undefined
    /**
      * The action provider's summary for the action execution.
      */
    var externalExecutionSummary: js.UndefOr[ExternalExecutionSummary] = js.undefined
    /**
      * The deepest external link to the external resource (for example, a repository URL or deployment endpoint) that is used when running the action.
      */
    var externalExecutionUrl: js.UndefOr[Url] = js.undefined
  }
  
  trait ActionRevision extends js.Object {
    /**
      * The date and time when the most recent version of the action was created, in timestamp format.
      */
    var created: Timestamp
    /**
      * The unique identifier of the change that set the state to this revision, for example a deployment ID or timestamp.
      */
    var revisionChangeId: RevisionChangeIdentifier
    /**
      * The system-generated unique ID that identifies the revision number of the action.
      */
    var revisionId: Revision
  }
  
  trait ActionState extends js.Object {
    /**
      * The name of the action.
      */
    var actionName: js.UndefOr[ActionName] = js.undefined
    /**
      * Represents information about the version (or revision) of an action.
      */
    var currentRevision: js.UndefOr[ActionRevision] = js.undefined
    /**
      * A URL link for more information about the state of the action, such as a deployment group details page.
      */
    var entityUrl: js.UndefOr[Url] = js.undefined
    /**
      * Represents information about the run of an action.
      */
    var latestExecution: js.UndefOr[ActionExecution] = js.undefined
    /**
      * A URL link for more information about the revision, such as a commit details page.
      */
    var revisionUrl: js.UndefOr[Url] = js.undefined
  }
  
  trait ActionType extends js.Object {
    /**
      * The configuration properties for the action type.
      */
    var actionConfigurationProperties: js.UndefOr[ActionConfigurationPropertyList] = js.undefined
    /**
      * Represents information about an action type.
      */
    var id: ActionTypeId
    /**
      * The details of the input artifact for the action, such as its commit ID.
      */
    var inputArtifactDetails: ArtifactDetails
    /**
      * The details of the output artifact of the action, such as its commit ID.
      */
    var outputArtifactDetails: ArtifactDetails
    /**
      * The settings for the action type.
      */
    var settings: js.UndefOr[ActionTypeSettings] = js.undefined
  }
  
  trait ActionTypeId extends js.Object {
    /**
      * A category defines what kind of action can be taken in the stage, and constrains the provider type for the action. Valid categories are limited to one of the values below.
      */
    var category: ActionCategory
    /**
      * The creator of the action being called.
      */
    var owner: ActionOwner
    /**
      * The provider of the service being called by the action. Valid providers are determined by the action category. For example, an action in the Deploy category type might have a provider of AWS CodeDeploy, which would be specified as CodeDeploy. To reference a list of action providers by action type, see Valid Action Types and Providers in CodePipeline.
      */
    var provider: ActionProvider
    /**
      * A string that describes the action version.
      */
    var version: Version
  }
  
  trait ActionTypeSettings extends js.Object {
    /**
      * The URL returned to the AWS CodePipeline console that provides a deep link to the resources of the external system, such as the configuration page for an AWS CodeDeploy deployment group. This link is provided as part of the action display within the pipeline.
      */
    var entityUrlTemplate: js.UndefOr[UrlTemplate] = js.undefined
    /**
      * The URL returned to the AWS CodePipeline console that contains a link to the top-level landing page for the external system, such as console page for AWS CodeDeploy. This link is shown on the pipeline view page in the AWS CodePipeline console and provides a link to the execution entity of the external action.
      */
    var executionUrlTemplate: js.UndefOr[UrlTemplate] = js.undefined
    /**
      * The URL returned to the AWS CodePipeline console that contains a link to the page where customers can update or change the configuration of the external action.
      */
    var revisionUrlTemplate: js.UndefOr[UrlTemplate] = js.undefined
    /**
      * The URL of a sign-up page where users can sign up for an external service and perform initial configuration of the action provided by that service.
      */
    var thirdPartyConfigurationUrl: js.UndefOr[Url] = js.undefined
  }
  
  trait ApprovalResult extends js.Object {
    /**
      * The response submitted by a reviewer assigned to an approval action request.
      */
    var status: ApprovalStatus
    /**
      * The summary of the current status of the approval request.
      */
    var summary: ApprovalSummary
  }
  
  trait Artifact extends js.Object {
    /**
      * The location of an artifact.
      */
    var location: js.UndefOr[ArtifactLocation] = js.undefined
    /**
      * The artifact's name.
      */
    var name: js.UndefOr[ArtifactName] = js.undefined
    /**
      * The artifact's revision ID. Depending on the type of object, this could be a commit ID (GitHub) or a revision ID (Amazon S3).
      */
    var revision: js.UndefOr[Revision] = js.undefined
  }
  
  trait ArtifactDetail extends js.Object {
    /**
      * The artifact object name for the action execution.
      */
    var name: js.UndefOr[ArtifactName] = js.undefined
    /**
      * The Amazon S3 artifact location for the action execution.
      */
    var s3location: js.UndefOr[S3Location] = js.undefined
  }
  
  trait ArtifactDetails extends js.Object {
    /**
      * The maximum number of artifacts allowed for the action type.
      */
    var maximumCount: MaximumArtifactCount
    /**
      * The minimum number of artifacts allowed for the action type.
      */
    var minimumCount: MinimumArtifactCount
  }
  
  trait ArtifactLocation extends js.Object {
    /**
      * The Amazon S3 bucket that contains the artifact.
      */
    var s3Location: js.UndefOr[S3ArtifactLocation] = js.undefined
    /**
      * The type of artifact in the location.
      */
    var `type`: js.UndefOr[ArtifactLocationType] = js.undefined
  }
  
  trait ArtifactRevision extends js.Object {
    /**
      * The date and time when the most recent revision of the artifact was created, in timestamp format.
      */
    var created: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of an artifact. This name might be system-generated, such as "MyApp", or might be defined by the user when an action is created.
      */
    var name: js.UndefOr[ArtifactName] = js.undefined
    /**
      * An additional identifier for a revision, such as a commit date or, for artifacts stored in Amazon S3 buckets, the ETag value.
      */
    var revisionChangeIdentifier: js.UndefOr[RevisionChangeIdentifier] = js.undefined
    /**
      * The revision ID of the artifact.
      */
    var revisionId: js.UndefOr[Revision] = js.undefined
    /**
      * Summary information about the most recent revision of the artifact. For GitHub and AWS CodeCommit repositories, the commit message. For Amazon S3 buckets or actions, the user-provided content of a codepipeline-artifact-revision-summary key specified in the object metadata.
      */
    var revisionSummary: js.UndefOr[RevisionSummary] = js.undefined
    /**
      * The commit ID for the artifact revision. For artifacts stored in GitHub or AWS CodeCommit repositories, the commit ID is linked to a commit details page.
      */
    var revisionUrl: js.UndefOr[Url] = js.undefined
  }
  
  trait ArtifactStore extends js.Object {
    /**
      * The encryption key used to encrypt the data in the artifact store, such as an AWS Key Management Service (AWS KMS) key. If this is undefined, the default key for Amazon S3 is used.
      */
    var encryptionKey: js.UndefOr[EncryptionKey] = js.undefined
    /**
      * The Amazon S3 bucket used for storing the artifacts for a pipeline. You can specify the name of an S3 bucket but not a folder within the bucket. A folder to contain the pipeline artifacts is created for you based on the name of the pipeline. You can use any Amazon S3 bucket in the same AWS Region as the pipeline to store your pipeline artifacts.
      */
    var location: ArtifactStoreLocation
    /**
      * The type of the artifact store, such as S3.
      */
    var `type`: ArtifactStoreType
  }
  
  trait ArtifactStoreMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[ArtifactStore]
  
  trait BlockerDeclaration extends js.Object {
    /**
      * Reserved for future use.
      */
    var name: BlockerName
    /**
      * Reserved for future use.
      */
    var `type`: BlockerType
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateCustomActionTypeInput extends js.Object {
    /**
      * The category of the custom action, such as a build action or a test action.  Although Source and Approval are listed as valid values, they are not currently functional. These values are reserved for future use. 
      */
    var category: ActionCategory
    /**
      * The configuration properties for the custom action.  You can refer to a name in the configuration properties of the custom action within the URL templates by following the format of {Config:name}, as long as the configuration property is both required and not secret. For more information, see Create a Custom Action for a Pipeline. 
      */
    var configurationProperties: js.UndefOr[ActionConfigurationPropertyList] = js.undefined
    /**
      * The details of the input artifact for the action, such as its commit ID.
      */
    var inputArtifactDetails: ArtifactDetails
    /**
      * The details of the output artifact of the action, such as its commit ID.
      */
    var outputArtifactDetails: ArtifactDetails
    /**
      * The provider of the service used in the custom action, such as AWS CodeDeploy.
      */
    var provider: ActionProvider
    /**
      * Returns information about the settings for an action type.
      */
    var settings: js.UndefOr[ActionTypeSettings] = js.undefined
    /**
      * The version identifier of the custom action.
      */
    var version: Version
  }
  
  trait CreateCustomActionTypeOutput extends js.Object {
    /**
      * Returns information about the details of an action type.
      */
    var actionType: ActionType
  }
  
  trait CreatePipelineInput extends js.Object {
    /**
      * Represents the structure of actions and stages to be performed in the pipeline. 
      */
    var pipeline: PipelineDeclaration
  }
  
  trait CreatePipelineOutput extends js.Object {
    /**
      * Represents the structure of actions and stages to be performed in the pipeline. 
      */
    var pipeline: js.UndefOr[PipelineDeclaration] = js.undefined
  }
  
  trait CurrentRevision extends js.Object {
    /**
      * The change identifier for the current revision.
      */
    var changeIdentifier: RevisionChangeIdentifier
    /**
      * The date and time when the most recent revision of the artifact was created, in timestamp format.
      */
    var created: js.UndefOr[Time] = js.undefined
    /**
      * The revision ID of the current version of an artifact.
      */
    var revision: Revision
    /**
      * The summary of the most recent revision of the artifact.
      */
    var revisionSummary: js.UndefOr[RevisionSummary] = js.undefined
  }
  
  trait DeleteCustomActionTypeInput extends js.Object {
    /**
      * The category of the custom action that you want to delete, such as source or deploy.
      */
    var category: ActionCategory
    /**
      * The provider of the service used in the custom action, such as AWS CodeDeploy.
      */
    var provider: ActionProvider
    /**
      * The version of the custom action to delete.
      */
    var version: Version
  }
  
  trait DeletePipelineInput extends js.Object {
    /**
      * The name of the pipeline to be deleted.
      */
    var name: PipelineName
  }
  
  trait DeleteWebhookInput extends js.Object {
    /**
      * The name of the webhook you want to delete.
      */
    var name: WebhookName
  }
  
  trait DeleteWebhookOutput extends js.Object
  
  trait DeregisterWebhookWithThirdPartyInput extends js.Object {
    /**
      * The name of the webhook you want to deregister.
      */
    var webhookName: js.UndefOr[WebhookName] = js.undefined
  }
  
  trait DeregisterWebhookWithThirdPartyOutput extends js.Object
  
  trait DisableStageTransitionInput extends js.Object {
    /**
      * The name of the pipeline in which you want to disable the flow of artifacts from one stage to another.
      */
    var pipelineName: PipelineName
    /**
      * The reason given to the user why a stage is disabled, such as waiting for manual approval or manual tests. This message is displayed in the pipeline console UI.
      */
    var reason: DisabledReason
    /**
      * The name of the stage where you want to disable the inbound or outbound transition of artifacts.
      */
    var stageName: StageName
    /**
      * Specifies whether artifacts will be prevented from transitioning into the stage and being processed by the actions in that stage (inbound), or prevented from transitioning from the stage after they have been processed by the actions in that stage (outbound).
      */
    var transitionType: StageTransitionType
  }
  
  trait EnableStageTransitionInput extends js.Object {
    /**
      * The name of the pipeline in which you want to enable the flow of artifacts from one stage to another.
      */
    var pipelineName: PipelineName
    /**
      * The name of the stage where you want to enable the transition of artifacts, either into the stage (inbound) or from that stage to the next stage (outbound).
      */
    var stageName: StageName
    /**
      * Specifies whether artifacts will be allowed to enter the stage and be processed by the actions in that stage (inbound) or whether already-processed artifacts will be allowed to transition to the next stage (outbound).
      */
    var transitionType: StageTransitionType
  }
  
  trait EncryptionKey extends js.Object {
    /**
      * The ID used to identify the key. For an AWS KMS key, this is the key ID or key ARN.
      */
    var id: EncryptionKeyId
    /**
      * The type of encryption key, such as an AWS Key Management Service (AWS KMS) key. When creating or updating a pipeline, the value must be set to 'KMS'.
      */
    var `type`: EncryptionKeyType
  }
  
  trait ErrorDetails extends js.Object {
    /**
      * The system ID or error number code of the error.
      */
    var code: js.UndefOr[Code] = js.undefined
    /**
      * The text of the error message.
      */
    var message: js.UndefOr[Message] = js.undefined
  }
  
  trait ExecutionDetails extends js.Object {
    /**
      * The system-generated unique ID of this action used to identify this job worker in any external systems, such as AWS CodeDeploy.
      */
    var externalExecutionId: js.UndefOr[ExecutionId] = js.undefined
    /**
      * The percentage of work completed on the action, represented on a scale of zero to one hundred percent.
      */
    var percentComplete: js.UndefOr[Percentage] = js.undefined
    /**
      * The summary of the current status of the actions.
      */
    var summary: js.UndefOr[ExecutionSummary] = js.undefined
  }
  
  trait FailureDetails extends js.Object {
    /**
      * The external ID of the run of the action that failed.
      */
    var externalExecutionId: js.UndefOr[ExecutionId] = js.undefined
    /**
      * The message about the failure.
      */
    var message: Message
    /**
      * The type of the failure.
      */
    var `type`: FailureType
  }
  
  trait GetJobDetailsInput extends js.Object {
    /**
      * The unique system-generated ID for the job.
      */
    var jobId: JobId
  }
  
  trait GetJobDetailsOutput extends js.Object {
    /**
      * The details of the job.  If AWSSessionCredentials is used, a long-running job can call GetJobDetails again to obtain new credentials. 
      */
    var jobDetails: js.UndefOr[JobDetails] = js.undefined
  }
  
  trait GetPipelineExecutionInput extends js.Object {
    /**
      * The ID of the pipeline execution about which you want to get execution details.
      */
    var pipelineExecutionId: PipelineExecutionId
    /**
      * The name of the pipeline about which you want to get execution details.
      */
    var pipelineName: PipelineName
  }
  
  trait GetPipelineExecutionOutput extends js.Object {
    /**
      * Represents information about the execution of a pipeline.
      */
    var pipelineExecution: js.UndefOr[PipelineExecution] = js.undefined
  }
  
  trait GetPipelineInput extends js.Object {
    /**
      * The name of the pipeline for which you want to get information. Pipeline names must be unique under an Amazon Web Services (AWS) user account.
      */
    var name: PipelineName
    /**
      * The version number of the pipeline. If you do not specify a version, defaults to the most current version.
      */
    var version: js.UndefOr[PipelineVersion] = js.undefined
  }
  
  trait GetPipelineOutput extends js.Object {
    /**
      * Represents the pipeline metadata information returned as part of the output of a GetPipeline action.
      */
    var metadata: js.UndefOr[PipelineMetadata] = js.undefined
    /**
      * Represents the structure of actions and stages to be performed in the pipeline. 
      */
    var pipeline: js.UndefOr[PipelineDeclaration] = js.undefined
  }
  
  trait GetPipelineStateInput extends js.Object {
    /**
      * The name of the pipeline about which you want to get information.
      */
    var name: PipelineName
  }
  
  trait GetPipelineStateOutput extends js.Object {
    /**
      * The date and time the pipeline was created, in timestamp format.
      */
    var created: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the pipeline for which you want to get the state.
      */
    var pipelineName: js.UndefOr[PipelineName] = js.undefined
    /**
      * The version number of the pipeline.  A newly-created pipeline is always assigned a version number of 1. 
      */
    var pipelineVersion: js.UndefOr[PipelineVersion] = js.undefined
    /**
      * A list of the pipeline stage output information, including stage name, state, most recent run details, whether the stage is disabled, and other data.
      */
    var stageStates: js.UndefOr[StageStateList] = js.undefined
    /**
      * The date and time the pipeline was last updated, in timestamp format.
      */
    var updated: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait GetThirdPartyJobDetailsInput extends js.Object {
    /**
      * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed access to the job and its details.
      */
    var clientToken: ClientToken
    /**
      * The unique system-generated ID used for identifying the job.
      */
    var jobId: ThirdPartyJobId
  }
  
  trait GetThirdPartyJobDetailsOutput extends js.Object {
    /**
      * The details of the job, including any protected values defined for the job.
      */
    var jobDetails: js.UndefOr[ThirdPartyJobDetails] = js.undefined
  }
  
  trait InputArtifact extends js.Object {
    /**
      * The name of the artifact to be worked on, for example, "My App". The input artifact of an action must exactly match the output artifact declared in a preceding action, but the input artifact does not have to be the next action in strict sequence from the action that provided the output artifact. Actions in parallel can declare different output artifacts, which are in turn consumed by different following actions.
      */
    var name: ArtifactName
  }
  
  trait Job extends js.Object {
    /**
      * The ID of the AWS account to use when performing the job.
      */
    var accountId: js.UndefOr[AccountId] = js.undefined
    /**
      * Additional data about a job.
      */
    var data: js.UndefOr[JobData] = js.undefined
    /**
      * The unique system-generated ID of the job.
      */
    var id: js.UndefOr[JobId] = js.undefined
    /**
      * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one job worker. Use this number in an AcknowledgeJob request.
      */
    var nonce: js.UndefOr[Nonce] = js.undefined
  }
  
  trait JobData extends js.Object {
    /**
      * Represents information about an action configuration.
      */
    var actionConfiguration: js.UndefOr[ActionConfiguration] = js.undefined
    /**
      * Represents information about an action type.
      */
    var actionTypeId: js.UndefOr[ActionTypeId] = js.undefined
    /**
      * Represents an AWS session credentials object. These credentials are temporary credentials that are issued by AWS Secure Token Service (STS). They can be used to access input and output artifacts in the Amazon S3 bucket used to store artifact for the pipeline in AWS CodePipeline.
      */
    var artifactCredentials: js.UndefOr[AWSSessionCredentials] = js.undefined
    /**
      * A system-generated token, such as a AWS CodeDeploy deployment ID, that a job requires in order to continue the job asynchronously.
      */
    var continuationToken: js.UndefOr[ContinuationToken] = js.undefined
    /**
      * Represents information about the key used to encrypt data in the artifact store, such as an AWS Key Management Service (AWS KMS) key. 
      */
    var encryptionKey: js.UndefOr[EncryptionKey] = js.undefined
    /**
      * The artifact supplied to the job.
      */
    var inputArtifacts: js.UndefOr[ArtifactList] = js.undefined
    /**
      * The output of the job.
      */
    var outputArtifacts: js.UndefOr[ArtifactList] = js.undefined
    /**
      * Represents information about a pipeline to a job worker.
      */
    var pipelineContext: js.UndefOr[PipelineContext] = js.undefined
  }
  
  trait JobDetails extends js.Object {
    /**
      * The AWS account ID associated with the job.
      */
    var accountId: js.UndefOr[AccountId] = js.undefined
    /**
      * Represents additional information about a job required for a job worker to complete the job. 
      */
    var data: js.UndefOr[JobData] = js.undefined
    /**
      * The unique system-generated ID of the job.
      */
    var id: js.UndefOr[JobId] = js.undefined
  }
  
  trait ListActionExecutionsInput extends js.Object {
    /**
      * Input information used to filter action execution history.
      */
    var filter: js.UndefOr[ActionExecutionFilter] = js.undefined
    /**
      * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned nextToken value. The action execution history is limited to the most recent 12 months, based on action execution start times. Default value is 100. 
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token that was returned from the previous ListActionExecutions call, which can be used to return the next set of action executions in the list.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      *  The name of the pipeline for which you want to list action execution history.
      */
    var pipelineName: PipelineName
  }
  
  trait ListActionExecutionsOutput extends js.Object {
    /**
      * The details for a list of recent executions, such as action execution ID.
      */
    var actionExecutionDetails: js.UndefOr[ActionExecutionDetailList] = js.undefined
    /**
      * If the amount of returned information is significantly large, an identifier is also returned and can be used in a subsequent ListActionExecutions call to return the next set of action executions in the list.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListActionTypesInput extends js.Object {
    /**
      * Filters the list of action types to those created by a specified entity.
      */
    var actionOwnerFilter: js.UndefOr[ActionOwner] = js.undefined
    /**
      * An identifier that was returned from the previous list action types call, which can be used to return the next set of action types in the list.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListActionTypesOutput extends js.Object {
    /**
      * Provides details of the action types.
      */
    var actionTypes: ActionTypeList
    /**
      * If the amount of returned information is significantly large, an identifier is also returned which can be used in a subsequent list action types call to return the next set of action types in the list.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListPipelineExecutionsInput extends js.Object {
    /**
      * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned nextToken value. The available pipeline execution history is limited to the most recent 12 months, based on pipeline execution start times. Default value is 100.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token that was returned from the previous ListPipelineExecutions call, which can be used to return the next set of pipeline executions in the list.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The name of the pipeline for which you want to get execution summary information.
      */
    var pipelineName: PipelineName
  }
  
  trait ListPipelineExecutionsOutput extends js.Object {
    /**
      * A token that can be used in the next ListPipelineExecutions call. To view all items in the list, continue to call this operation with each subsequent token until no more nextToken values are returned.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of executions in the history of a pipeline.
      */
    var pipelineExecutionSummaries: js.UndefOr[PipelineExecutionSummaryList] = js.undefined
  }
  
  trait ListPipelinesInput extends js.Object {
    /**
      * An identifier that was returned from the previous list pipelines call, which can be used to return the next set of pipelines in the list.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListPipelinesOutput extends js.Object {
    /**
      * If the amount of returned information is significantly large, an identifier is also returned which can be used in a subsequent list pipelines call to return the next set of pipelines in the list.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The list of pipelines.
      */
    var pipelines: js.UndefOr[PipelineList] = js.undefined
  }
  
  trait ListWebhookItem extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the webhook.
      */
    var arn: js.UndefOr[WebhookArn] = js.undefined
    /**
      * The detail returned for each webhook, such as the webhook authentication type and filter rules.
      */
    var definition: WebhookDefinition
    /**
      * The number code of the error.
      */
    var errorCode: js.UndefOr[WebhookErrorCode] = js.undefined
    /**
      * The text of the error message about the webhook.
      */
    var errorMessage: js.UndefOr[WebhookErrorMessage] = js.undefined
    /**
      * The date and time a webhook was last successfully triggered, in timestamp format.
      */
    var lastTriggered: js.UndefOr[WebhookLastTriggered] = js.undefined
    /**
      * A unique URL generated by CodePipeline. When a POST request is made to this URL, the defined pipeline is started as long as the body of the post request satisfies the defined authentication and filtering conditions. Deleting and re-creating a webhook will make the old URL invalid and generate a new URL.
      */
    var url: WebhookUrl
  }
  
  trait ListWebhooksInput extends js.Object {
    /**
      * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned nextToken value.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token that was returned from the previous ListWebhooks call, which can be used to return the next set of webhooks in the list.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListWebhooksOutput extends js.Object {
    /**
      * If the amount of returned information is significantly large, an identifier is also returned and can be used in a subsequent ListWebhooks call to return the next set of webhooks in the list. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The JSON detail returned for each webhook in the list output for the ListWebhooks call.
      */
    var webhooks: js.UndefOr[WebhookList] = js.undefined
  }
  
  trait OutputArtifact extends js.Object {
    /**
      * The name of the output of an artifact, such as "My App". The input artifact of an action must exactly match the output artifact declared in a preceding action, but the input artifact does not have to be the next action in strict sequence from the action that provided the output artifact. Actions in parallel can declare different output artifacts, which are in turn consumed by different following actions. Output artifact names must be unique within a pipeline.
      */
    var name: ArtifactName
  }
  
  trait PipelineContext extends js.Object {
    /**
      * The context of an action to a job worker within the stage of a pipeline.
      */
    var action: js.UndefOr[ActionContext] = js.undefined
    /**
      * The name of the pipeline. This is a user-specified value. Pipeline names must be unique across all pipeline names under an Amazon Web Services account.
      */
    var pipelineName: js.UndefOr[PipelineName] = js.undefined
    /**
      * The stage of the pipeline.
      */
    var stage: js.UndefOr[StageContext] = js.undefined
  }
  
  trait PipelineDeclaration extends js.Object {
    /**
      * Represents information about the Amazon S3 bucket where artifacts are stored for the pipeline. 
      */
    var artifactStore: js.UndefOr[ArtifactStore] = js.undefined
    /**
      * A mapping of artifactStore objects and their corresponding regions. There must be an artifact store for the pipeline region and for each cross-region action within the pipeline. You can only use either artifactStore or artifactStores, not both. If you create a cross-region action in your pipeline, you must use artifactStores.
      */
    var artifactStores: js.UndefOr[ArtifactStoreMap] = js.undefined
    /**
      * The name of the action to be performed.
      */
    var name: PipelineName
    /**
      * The Amazon Resource Name (ARN) for AWS CodePipeline to use to either perform actions with no actionRoleArn, or to use to assume roles for actions with an actionRoleArn.
      */
    var roleArn: RoleArn
    /**
      * The stage in which to perform the action.
      */
    var stages: PipelineStageDeclarationList
    /**
      * The version number of the pipeline. A new pipeline always has a version number of 1. This number is automatically incremented when a pipeline is updated.
      */
    var version: js.UndefOr[PipelineVersion] = js.undefined
  }
  
  trait PipelineExecution extends js.Object {
    /**
      * A list of ArtifactRevision objects included in a pipeline execution.
      */
    var artifactRevisions: js.UndefOr[ArtifactRevisionList] = js.undefined
    /**
      * The ID of the pipeline execution.
      */
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
    /**
      * The name of the pipeline that was executed.
      */
    var pipelineName: js.UndefOr[PipelineName] = js.undefined
    /**
      * The version number of the pipeline that was executed.
      */
    var pipelineVersion: js.UndefOr[PipelineVersion] = js.undefined
    /**
      * The status of the pipeline execution.   InProgress: The pipeline execution is currently running.   Succeeded: The pipeline execution was completed successfully.    Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline execution advanced and continued through the pipeline instead.    Failed: The pipeline execution was not completed successfully.  
      */
    var status: js.UndefOr[PipelineExecutionStatus] = js.undefined
  }
  
  trait PipelineExecutionSummary extends js.Object {
    /**
      * The date and time of the last change to the pipeline execution, in timestamp format.
      */
    var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The ID of the pipeline execution.
      */
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
    /**
      * A list of the source artifact revisions that initiated a pipeline execution.
      */
    var sourceRevisions: js.UndefOr[SourceRevisionList] = js.undefined
    /**
      * The date and time when the pipeline execution began, in timestamp format.
      */
    var startTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The status of the pipeline execution.   InProgress: The pipeline execution is currently running.   Succeeded: The pipeline execution was completed successfully.    Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline execution advanced and continued through the pipeline instead.    Failed: The pipeline execution was not completed successfully.  
      */
    var status: js.UndefOr[PipelineExecutionStatus] = js.undefined
  }
  
  trait PipelineMetadata extends js.Object {
    /**
      * The date and time the pipeline was created, in timestamp format.
      */
    var created: js.UndefOr[Timestamp] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the pipeline.
      */
    var pipelineArn: js.UndefOr[PipelineArn] = js.undefined
    /**
      * The date and time the pipeline was last updated, in timestamp format.
      */
    var updated: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait PipelineSummary extends js.Object {
    /**
      * The date and time the pipeline was created, in timestamp format.
      */
    var created: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the pipeline.
      */
    var name: js.UndefOr[PipelineName] = js.undefined
    /**
      * The date and time of the last update to the pipeline, in timestamp format.
      */
    var updated: js.UndefOr[Timestamp] = js.undefined
    /**
      * The version number of the pipeline.
      */
    var version: js.UndefOr[PipelineVersion] = js.undefined
  }
  
  trait PollForJobsInput extends js.Object {
    /**
      * Represents information about an action type.
      */
    var actionTypeId: ActionTypeId
    /**
      * The maximum number of jobs to return in a poll for jobs call.
      */
    var maxBatchSize: js.UndefOr[MaxBatchSize] = js.undefined
    /**
      * A map of property names and values. For an action type with no queryable properties, this value must be null or an empty map. For an action type with a queryable property, you must supply that property as a key in the map. Only jobs whose action configuration matches the mapped value will be returned.
      */
    var queryParam: js.UndefOr[QueryParamMap] = js.undefined
  }
  
  trait PollForJobsOutput extends js.Object {
    /**
      * Information about the jobs to take action on.
      */
    var jobs: js.UndefOr[JobList] = js.undefined
  }
  
  trait PollForThirdPartyJobsInput extends js.Object {
    /**
      * Represents information about an action type.
      */
    var actionTypeId: ActionTypeId
    /**
      * The maximum number of jobs to return in a poll for jobs call.
      */
    var maxBatchSize: js.UndefOr[MaxBatchSize] = js.undefined
  }
  
  trait PollForThirdPartyJobsOutput extends js.Object {
    /**
      * Information about the jobs to take action on.
      */
    var jobs: js.UndefOr[ThirdPartyJobList] = js.undefined
  }
  
  trait PutActionRevisionInput extends js.Object {
    /**
      * The name of the action that will process the revision.
      */
    var actionName: ActionName
    /**
      * Represents information about the version (or revision) of an action.
      */
    var actionRevision: ActionRevision
    /**
      * The name of the pipeline that will start processing the revision to the source.
      */
    var pipelineName: PipelineName
    /**
      * The name of the stage that contains the action that will act upon the revision.
      */
    var stageName: StageName
  }
  
  trait PutActionRevisionOutput extends js.Object {
    /**
      * Indicates whether the artifact revision was previously used in an execution of the specified pipeline.
      */
    var newRevision: js.UndefOr[Boolean] = js.undefined
    /**
      * The ID of the current workflow state of the pipeline.
      */
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
  }
  
  trait PutApprovalResultInput extends js.Object {
    /**
      * The name of the action for which approval is requested.
      */
    var actionName: ActionName
    /**
      * The name of the pipeline that contains the action. 
      */
    var pipelineName: PipelineName
    /**
      * Represents information about the result of the approval request.
      */
    var result: ApprovalResult
    /**
      * The name of the stage that contains the action.
      */
    var stageName: StageName
    /**
      * The system-generated token used to identify a unique approval request. The token for each open approval request can be obtained using the GetPipelineState action and is used to validate that the approval request corresponding to this token is still valid.
      */
    var token: ApprovalToken
  }
  
  trait PutApprovalResultOutput extends js.Object {
    /**
      * The timestamp showing when the approval or rejection was submitted.
      */
    var approvedAt: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait PutJobFailureResultInput extends js.Object {
    /**
      * The details about the failure of a job.
      */
    var failureDetails: FailureDetails
    /**
      * The unique system-generated ID of the job that failed. This is the same ID returned from PollForJobs.
      */
    var jobId: JobId
  }
  
  trait PutJobSuccessResultInput extends js.Object {
    /**
      * A token generated by a job worker, such as an AWS CodeDeploy deployment ID, that a successful job provides to identify a custom action in progress. Future jobs will use this token in order to identify the running instance of the action. It can be reused to return additional information about the progress of the custom action. When the action is complete, no continuation token should be supplied.
      */
    var continuationToken: js.UndefOr[ContinuationToken] = js.undefined
    /**
      * The ID of the current revision of the artifact successfully worked upon by the job.
      */
    var currentRevision: js.UndefOr[CurrentRevision] = js.undefined
    /**
      * The execution details of the successful job, such as the actions taken by the job worker.
      */
    var executionDetails: js.UndefOr[ExecutionDetails] = js.undefined
    /**
      * The unique system-generated ID of the job that succeeded. This is the same ID returned from PollForJobs.
      */
    var jobId: JobId
  }
  
  trait PutThirdPartyJobFailureResultInput extends js.Object {
    /**
      * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed access to the job and its details.
      */
    var clientToken: ClientToken
    /**
      * Represents information about failure details.
      */
    var failureDetails: FailureDetails
    /**
      * The ID of the job that failed. This is the same ID returned from PollForThirdPartyJobs.
      */
    var jobId: ThirdPartyJobId
  }
  
  trait PutThirdPartyJobSuccessResultInput extends js.Object {
    /**
      * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed access to the job and its details.
      */
    var clientToken: ClientToken
    /**
      * A token generated by a job worker, such as an AWS CodeDeploy deployment ID, that a successful job provides to identify a partner action in progress. Future jobs will use this token in order to identify the running instance of the action. It can be reused to return additional information about the progress of the partner action. When the action is complete, no continuation token should be supplied.
      */
    var continuationToken: js.UndefOr[ContinuationToken] = js.undefined
    /**
      * Represents information about a current revision.
      */
    var currentRevision: js.UndefOr[CurrentRevision] = js.undefined
    /**
      * The details of the actions taken and results produced on an artifact as it passes through stages in the pipeline. 
      */
    var executionDetails: js.UndefOr[ExecutionDetails] = js.undefined
    /**
      * The ID of the job that successfully completed. This is the same ID returned from PollForThirdPartyJobs.
      */
    var jobId: ThirdPartyJobId
  }
  
  trait PutWebhookInput extends js.Object {
    /**
      * The detail provided in an input file to create the webhook, such as the webhook name, the pipeline name, and the action name. Give the webhook a unique name which identifies the webhook being defined. You may choose to name the webhook after the pipeline and action it targets so that you can easily recognize what it's used for later.
      */
    var webhook: WebhookDefinition
  }
  
  trait PutWebhookOutput extends js.Object {
    /**
      * The detail returned from creating the webhook, such as the webhook name, webhook URL, and webhook ARN.
      */
    var webhook: js.UndefOr[ListWebhookItem] = js.undefined
  }
  
  trait QueryParamMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[ActionConfigurationQueryableValue]
  
  trait RegisterWebhookWithThirdPartyInput extends js.Object {
    /**
      * The name of an existing webhook created with PutWebhook to register with a supported third party. 
      */
    var webhookName: js.UndefOr[WebhookName] = js.undefined
  }
  
  trait RegisterWebhookWithThirdPartyOutput extends js.Object
  
  trait RetryStageExecutionInput extends js.Object {
    /**
      * The ID of the pipeline execution in the failed stage to be retried. Use the GetPipelineState action to retrieve the current pipelineExecutionId of the failed stage
      */
    var pipelineExecutionId: PipelineExecutionId
    /**
      * The name of the pipeline that contains the failed stage.
      */
    var pipelineName: PipelineName
    /**
      * The scope of the retry attempt. Currently, the only supported value is FAILED_ACTIONS.
      */
    var retryMode: StageRetryMode
    /**
      * The name of the failed stage to be retried.
      */
    var stageName: StageName
  }
  
  trait RetryStageExecutionOutput extends js.Object {
    /**
      * The ID of the current workflow execution in the failed stage.
      */
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
  }
  
  trait S3ArtifactLocation extends js.Object {
    /**
      * The name of the Amazon S3 bucket.
      */
    var bucketName: S3BucketName
    /**
      * The key of the object in the Amazon S3 bucket, which uniquely identifies the object in the bucket.
      */
    var objectKey: S3ObjectKey
  }
  
  trait S3Location extends js.Object {
    /**
      * The Amazon S3 artifact bucket for an action's artifacts.
      */
    var bucket: js.UndefOr[S3Bucket] = js.undefined
    /**
      * The artifact name.
      */
    var key: js.UndefOr[S3Key] = js.undefined
  }
  
  trait SourceRevision extends js.Object {
    /**
      * The name of the action that processed the revision to the source artifact.
      */
    var actionName: ActionName
    /**
      * The system-generated unique ID that identifies the revision number of the artifact.
      */
    var revisionId: js.UndefOr[Revision] = js.undefined
    /**
      * Summary information about the most recent revision of the artifact. For GitHub and AWS CodeCommit repositories, the commit message. For Amazon S3 buckets or actions, the user-provided content of a codepipeline-artifact-revision-summary key specified in the object metadata.
      */
    var revisionSummary: js.UndefOr[RevisionSummary] = js.undefined
    /**
      * The commit ID for the artifact revision. For artifacts stored in GitHub or AWS CodeCommit repositories, the commit ID is linked to a commit details page.
      */
    var revisionUrl: js.UndefOr[Url] = js.undefined
  }
  
  trait StageContext extends js.Object {
    /**
      * The name of the stage.
      */
    var name: js.UndefOr[StageName] = js.undefined
  }
  
  trait StageDeclaration extends js.Object {
    /**
      * The actions included in a stage.
      */
    var actions: StageActionDeclarationList
    /**
      * Reserved for future use.
      */
    var blockers: js.UndefOr[StageBlockerDeclarationList] = js.undefined
    /**
      * The name of the stage.
      */
    var name: StageName
  }
  
  trait StageExecution extends js.Object {
    /**
      * The ID of the pipeline execution associated with the stage.
      */
    var pipelineExecutionId: PipelineExecutionId
    /**
      * The status of the stage, or for a completed stage, the last status of the stage.
      */
    var status: StageExecutionStatus
  }
  
  trait StageState extends js.Object {
    /**
      * The state of the stage.
      */
    var actionStates: js.UndefOr[ActionStateList] = js.undefined
    /**
      * The state of the inbound transition, which is either enabled or disabled.
      */
    var inboundTransitionState: js.UndefOr[TransitionState] = js.undefined
    /**
      * Information about the latest execution in the stage, including its ID and status.
      */
    var latestExecution: js.UndefOr[StageExecution] = js.undefined
    /**
      * The name of the stage.
      */
    var stageName: js.UndefOr[StageName] = js.undefined
  }
  
  trait StartPipelineExecutionInput extends js.Object {
    /**
      * The system-generated unique ID used to identify a unique execution request.
      */
    var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The name of the pipeline to start.
      */
    var name: PipelineName
  }
  
  trait StartPipelineExecutionOutput extends js.Object {
    /**
      * The unique system-generated ID of the pipeline execution that was started.
      */
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
  }
  
  trait ThirdPartyJob extends js.Object {
    /**
      * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed access to the job and its details.
      */
    var clientId: js.UndefOr[ClientId] = js.undefined
    /**
      * The identifier used to identify the job in AWS CodePipeline.
      */
    var jobId: js.UndefOr[JobId] = js.undefined
  }
  
  trait ThirdPartyJobData extends js.Object {
    /**
      * Represents information about an action configuration.
      */
    var actionConfiguration: js.UndefOr[ActionConfiguration] = js.undefined
    /**
      * Represents information about an action type.
      */
    var actionTypeId: js.UndefOr[ActionTypeId] = js.undefined
    /**
      * Represents an AWS session credentials object. These credentials are temporary credentials that are issued by AWS Secure Token Service (STS). They can be used to access input and output artifacts in the Amazon S3 bucket used to store artifact for the pipeline in AWS CodePipeline. 
      */
    var artifactCredentials: js.UndefOr[AWSSessionCredentials] = js.undefined
    /**
      * A system-generated token, such as a AWS CodeDeploy deployment ID, that a job requires in order to continue the job asynchronously.
      */
    var continuationToken: js.UndefOr[ContinuationToken] = js.undefined
    /**
      * The encryption key used to encrypt and decrypt data in the artifact store for the pipeline, such as an AWS Key Management Service (AWS KMS) key. This is optional and might not be present.
      */
    var encryptionKey: js.UndefOr[EncryptionKey] = js.undefined
    /**
      * The name of the artifact that will be worked upon by the action, if any. This name might be system-generated, such as "MyApp", or might be defined by the user when the action is created. The input artifact name must match the name of an output artifact generated by an action in an earlier action or stage of the pipeline.
      */
    var inputArtifacts: js.UndefOr[ArtifactList] = js.undefined
    /**
      * The name of the artifact that will be the result of the action, if any. This name might be system-generated, such as "MyBuiltApp", or might be defined by the user when the action is created.
      */
    var outputArtifacts: js.UndefOr[ArtifactList] = js.undefined
    /**
      * Represents information about a pipeline to a job worker.
      */
    var pipelineContext: js.UndefOr[PipelineContext] = js.undefined
  }
  
  trait ThirdPartyJobDetails extends js.Object {
    /**
      * The data to be returned by the third party job worker.
      */
    var data: js.UndefOr[ThirdPartyJobData] = js.undefined
    /**
      * The identifier used to identify the job details in AWS CodePipeline.
      */
    var id: js.UndefOr[ThirdPartyJobId] = js.undefined
    /**
      * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one job worker. Use this number in an AcknowledgeThirdPartyJob request.
      */
    var nonce: js.UndefOr[Nonce] = js.undefined
  }
  
  trait TransitionState extends js.Object {
    /**
      * The user-specified reason why the transition between two stages of a pipeline was disabled.
      */
    var disabledReason: js.UndefOr[DisabledReason] = js.undefined
    /**
      * Whether the transition between stages is enabled (true) or disabled (false).
      */
    var enabled: js.UndefOr[Enabled] = js.undefined
    /**
      * The timestamp when the transition state was last changed.
      */
    var lastChangedAt: js.UndefOr[LastChangedAt] = js.undefined
    /**
      * The ID of the user who last changed the transition state.
      */
    var lastChangedBy: js.UndefOr[LastChangedBy] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Returns information about a specified job and whether that job has been received by the job worker. Only used for custom actions.
      */
    def acknowledgeJob(): awsDashSdkLib.libRequestMod.Request[AcknowledgeJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def acknowledgeJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AcknowledgeJobOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AcknowledgeJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a specified job and whether that job has been received by the job worker. Only used for custom actions.
      */
    def acknowledgeJob(params: AcknowledgeJobInput): awsDashSdkLib.libRequestMod.Request[AcknowledgeJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def acknowledgeJob(
      params: AcknowledgeJobInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AcknowledgeJobOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AcknowledgeJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Confirms a job worker has received the specified job. Only used for partner actions.
      */
    def acknowledgeThirdPartyJob(): awsDashSdkLib.libRequestMod.Request[AcknowledgeThirdPartyJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def acknowledgeThirdPartyJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AcknowledgeThirdPartyJobOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AcknowledgeThirdPartyJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Confirms a job worker has received the specified job. Only used for partner actions.
      */
    def acknowledgeThirdPartyJob(params: AcknowledgeThirdPartyJobInput): awsDashSdkLib.libRequestMod.Request[AcknowledgeThirdPartyJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def acknowledgeThirdPartyJob(
      params: AcknowledgeThirdPartyJobInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AcknowledgeThirdPartyJobOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AcknowledgeThirdPartyJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new custom action that can be used in all pipelines associated with the AWS account. Only used for custom actions.
      */
    def createCustomActionType(): awsDashSdkLib.libRequestMod.Request[CreateCustomActionTypeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCustomActionType(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCustomActionTypeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCustomActionTypeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new custom action that can be used in all pipelines associated with the AWS account. Only used for custom actions.
      */
    def createCustomActionType(params: CreateCustomActionTypeInput): awsDashSdkLib.libRequestMod.Request[CreateCustomActionTypeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCustomActionType(
      params: CreateCustomActionTypeInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCustomActionTypeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCustomActionTypeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a pipeline.
      */
    def createPipeline(): awsDashSdkLib.libRequestMod.Request[CreatePipelineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPipeline(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePipelineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePipelineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a pipeline.
      */
    def createPipeline(params: CreatePipelineInput): awsDashSdkLib.libRequestMod.Request[CreatePipelineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPipeline(
      params: CreatePipelineInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePipelineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePipelineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Marks a custom action as deleted. PollForJobs for the custom action will fail after the action is marked for deletion. Only used for custom actions.  To re-create a custom action after it has been deleted you must use a string in the version field that has never been used before. This string can be an incremented version number, for example. To restore a deleted custom action, use a JSON file that is identical to the deleted action, including the original string in the version field. 
      */
    def deleteCustomActionType(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCustomActionType(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Marks a custom action as deleted. PollForJobs for the custom action will fail after the action is marked for deletion. Only used for custom actions.  To re-create a custom action after it has been deleted you must use a string in the version field that has never been used before. This string can be an incremented version number, for example. To restore a deleted custom action, use a JSON file that is identical to the deleted action, including the original string in the version field. 
      */
    def deleteCustomActionType(params: DeleteCustomActionTypeInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCustomActionType(
      params: DeleteCustomActionTypeInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified pipeline.
      */
    def deletePipeline(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePipeline(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified pipeline.
      */
    def deletePipeline(params: DeletePipelineInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePipeline(
      params: DeletePipelineInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a previously created webhook by name. Deleting the webhook stops AWS CodePipeline from starting a pipeline every time an external event occurs. The API will return successfully when trying to delete a webhook that is already deleted. If a deleted webhook is re-created by calling PutWebhook with the same name, it will have a different URL.
      */
    def deleteWebhook(): awsDashSdkLib.libRequestMod.Request[DeleteWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteWebhook(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteWebhookOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a previously created webhook by name. Deleting the webhook stops AWS CodePipeline from starting a pipeline every time an external event occurs. The API will return successfully when trying to delete a webhook that is already deleted. If a deleted webhook is re-created by calling PutWebhook with the same name, it will have a different URL.
      */
    def deleteWebhook(params: DeleteWebhookInput): awsDashSdkLib.libRequestMod.Request[DeleteWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteWebhook(
      params: DeleteWebhookInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteWebhookOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the connection between the webhook that was created by CodePipeline and the external tool with events to be detected. Currently only supported for webhooks that target an action type of GitHub.
      */
    def deregisterWebhookWithThirdParty(): awsDashSdkLib.libRequestMod.Request[DeregisterWebhookWithThirdPartyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterWebhookWithThirdParty(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterWebhookWithThirdPartyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterWebhookWithThirdPartyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the connection between the webhook that was created by CodePipeline and the external tool with events to be detected. Currently only supported for webhooks that target an action type of GitHub.
      */
    def deregisterWebhookWithThirdParty(params: DeregisterWebhookWithThirdPartyInput): awsDashSdkLib.libRequestMod.Request[DeregisterWebhookWithThirdPartyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterWebhookWithThirdParty(
      params: DeregisterWebhookWithThirdPartyInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterWebhookWithThirdPartyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterWebhookWithThirdPartyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Prevents artifacts in a pipeline from transitioning to the next stage in the pipeline.
      */
    def disableStageTransition(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableStageTransition(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Prevents artifacts in a pipeline from transitioning to the next stage in the pipeline.
      */
    def disableStageTransition(params: DisableStageTransitionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableStageTransition(
      params: DisableStageTransitionInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables artifacts in a pipeline to transition to a stage in a pipeline.
      */
    def enableStageTransition(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableStageTransition(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables artifacts in a pipeline to transition to a stage in a pipeline.
      */
    def enableStageTransition(params: EnableStageTransitionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableStageTransition(
      params: EnableStageTransitionInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a job. Only used for custom actions.  When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts. Additionally, this API returns any secret values defined for the action. 
      */
    def getJobDetails(): awsDashSdkLib.libRequestMod.Request[GetJobDetailsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getJobDetails(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetJobDetailsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetJobDetailsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a job. Only used for custom actions.  When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts. Additionally, this API returns any secret values defined for the action. 
      */
    def getJobDetails(params: GetJobDetailsInput): awsDashSdkLib.libRequestMod.Request[GetJobDetailsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getJobDetails(
      params: GetJobDetailsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetJobDetailsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetJobDetailsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the metadata, structure, stages, and actions of a pipeline. Can be used to return the entire structure of a pipeline in JSON format, which can then be modified and used to update the pipeline structure with UpdatePipeline.
      */
    def getPipeline(): awsDashSdkLib.libRequestMod.Request[GetPipelineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPipeline(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPipelineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPipelineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the metadata, structure, stages, and actions of a pipeline. Can be used to return the entire structure of a pipeline in JSON format, which can then be modified and used to update the pipeline structure with UpdatePipeline.
      */
    def getPipeline(params: GetPipelineInput): awsDashSdkLib.libRequestMod.Request[GetPipelineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPipeline(
      params: GetPipelineInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPipelineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPipelineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about an execution of a pipeline, including details about artifacts, the pipeline execution ID, and the name, version, and status of the pipeline.
      */
    def getPipelineExecution(): awsDashSdkLib.libRequestMod.Request[GetPipelineExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPipelineExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPipelineExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPipelineExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about an execution of a pipeline, including details about artifacts, the pipeline execution ID, and the name, version, and status of the pipeline.
      */
    def getPipelineExecution(params: GetPipelineExecutionInput): awsDashSdkLib.libRequestMod.Request[GetPipelineExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPipelineExecution(
      params: GetPipelineExecutionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPipelineExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPipelineExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the state of a pipeline, including the stages and actions.  Values returned in the revisionId and revisionUrl fields indicate the source revision information, such as the commit ID, for the current state. 
      */
    def getPipelineState(): awsDashSdkLib.libRequestMod.Request[GetPipelineStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPipelineState(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPipelineStateOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPipelineStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the state of a pipeline, including the stages and actions.  Values returned in the revisionId and revisionUrl fields indicate the source revision information, such as the commit ID, for the current state. 
      */
    def getPipelineState(params: GetPipelineStateInput): awsDashSdkLib.libRequestMod.Request[GetPipelineStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPipelineState(
      params: GetPipelineStateInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPipelineStateOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPipelineStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests the details of a job for a third party action. Only used for partner actions.  When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts. Additionally, this API returns any secret values defined for the action. 
      */
    def getThirdPartyJobDetails(): awsDashSdkLib.libRequestMod.Request[GetThirdPartyJobDetailsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getThirdPartyJobDetails(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetThirdPartyJobDetailsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetThirdPartyJobDetailsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests the details of a job for a third party action. Only used for partner actions.  When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts. Additionally, this API returns any secret values defined for the action. 
      */
    def getThirdPartyJobDetails(params: GetThirdPartyJobDetailsInput): awsDashSdkLib.libRequestMod.Request[GetThirdPartyJobDetailsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getThirdPartyJobDetails(
      params: GetThirdPartyJobDetailsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetThirdPartyJobDetailsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetThirdPartyJobDetailsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the action executions that have occurred in a pipeline.
      */
    def listActionExecutions(): awsDashSdkLib.libRequestMod.Request[ListActionExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listActionExecutions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListActionExecutionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListActionExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the action executions that have occurred in a pipeline.
      */
    def listActionExecutions(params: ListActionExecutionsInput): awsDashSdkLib.libRequestMod.Request[ListActionExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listActionExecutions(
      params: ListActionExecutionsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListActionExecutionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListActionExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a summary of all AWS CodePipeline action types associated with your account.
      */
    def listActionTypes(): awsDashSdkLib.libRequestMod.Request[ListActionTypesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listActionTypes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListActionTypesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListActionTypesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a summary of all AWS CodePipeline action types associated with your account.
      */
    def listActionTypes(params: ListActionTypesInput): awsDashSdkLib.libRequestMod.Request[ListActionTypesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listActionTypes(
      params: ListActionTypesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListActionTypesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListActionTypesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a summary of the most recent executions for a pipeline.
      */
    def listPipelineExecutions(): awsDashSdkLib.libRequestMod.Request[ListPipelineExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPipelineExecutions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPipelineExecutionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPipelineExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a summary of the most recent executions for a pipeline.
      */
    def listPipelineExecutions(params: ListPipelineExecutionsInput): awsDashSdkLib.libRequestMod.Request[ListPipelineExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPipelineExecutions(
      params: ListPipelineExecutionsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPipelineExecutionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPipelineExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a summary of all of the pipelines associated with your account.
      */
    def listPipelines(): awsDashSdkLib.libRequestMod.Request[ListPipelinesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPipelines(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPipelinesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPipelinesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a summary of all of the pipelines associated with your account.
      */
    def listPipelines(params: ListPipelinesInput): awsDashSdkLib.libRequestMod.Request[ListPipelinesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPipelines(
      params: ListPipelinesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPipelinesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPipelinesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a listing of all the webhooks in this region for this account. The output lists all webhooks and includes the webhook URL and ARN, as well the configuration for each webhook.
      */
    def listWebhooks(): awsDashSdkLib.libRequestMod.Request[ListWebhooksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listWebhooks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListWebhooksOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListWebhooksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a listing of all the webhooks in this region for this account. The output lists all webhooks and includes the webhook URL and ARN, as well the configuration for each webhook.
      */
    def listWebhooks(params: ListWebhooksInput): awsDashSdkLib.libRequestMod.Request[ListWebhooksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listWebhooks(
      params: ListWebhooksInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListWebhooksOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListWebhooksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about any jobs for AWS CodePipeline to act upon. PollForJobs is only valid for action types with "Custom" in the owner field. If the action type contains "AWS" or "ThirdParty" in the owner field, the PollForJobs action returns an error.  When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts. Additionally, this API returns any secret values defined for the action. 
      */
    def pollForJobs(): awsDashSdkLib.libRequestMod.Request[PollForJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def pollForJobs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PollForJobsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PollForJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about any jobs for AWS CodePipeline to act upon. PollForJobs is only valid for action types with "Custom" in the owner field. If the action type contains "AWS" or "ThirdParty" in the owner field, the PollForJobs action returns an error.  When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts. Additionally, this API returns any secret values defined for the action. 
      */
    def pollForJobs(params: PollForJobsInput): awsDashSdkLib.libRequestMod.Request[PollForJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def pollForJobs(
      params: PollForJobsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PollForJobsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PollForJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Determines whether there are any third party jobs for a job worker to act on. Only used for partner actions.  When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts. 
      */
    def pollForThirdPartyJobs(): awsDashSdkLib.libRequestMod.Request[PollForThirdPartyJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def pollForThirdPartyJobs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PollForThirdPartyJobsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PollForThirdPartyJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Determines whether there are any third party jobs for a job worker to act on. Only used for partner actions.  When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts. 
      */
    def pollForThirdPartyJobs(params: PollForThirdPartyJobsInput): awsDashSdkLib.libRequestMod.Request[PollForThirdPartyJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def pollForThirdPartyJobs(
      params: PollForThirdPartyJobsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PollForThirdPartyJobsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PollForThirdPartyJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides information to AWS CodePipeline about new revisions to a source.
      */
    def putActionRevision(): awsDashSdkLib.libRequestMod.Request[PutActionRevisionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putActionRevision(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutActionRevisionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutActionRevisionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides information to AWS CodePipeline about new revisions to a source.
      */
    def putActionRevision(params: PutActionRevisionInput): awsDashSdkLib.libRequestMod.Request[PutActionRevisionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putActionRevision(
      params: PutActionRevisionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutActionRevisionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutActionRevisionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides the response to a manual approval request to AWS CodePipeline. Valid responses include Approved and Rejected.
      */
    def putApprovalResult(): awsDashSdkLib.libRequestMod.Request[PutApprovalResultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putApprovalResult(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutApprovalResultOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutApprovalResultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides the response to a manual approval request to AWS CodePipeline. Valid responses include Approved and Rejected.
      */
    def putApprovalResult(params: PutApprovalResultInput): awsDashSdkLib.libRequestMod.Request[PutApprovalResultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putApprovalResult(
      params: PutApprovalResultInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutApprovalResultOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutApprovalResultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Represents the failure of a job as returned to the pipeline by a job worker. Only used for custom actions.
      */
    def putJobFailureResult(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putJobFailureResult(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Represents the failure of a job as returned to the pipeline by a job worker. Only used for custom actions.
      */
    def putJobFailureResult(params: PutJobFailureResultInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putJobFailureResult(
      params: PutJobFailureResultInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Represents the success of a job as returned to the pipeline by a job worker. Only used for custom actions.
      */
    def putJobSuccessResult(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putJobSuccessResult(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Represents the success of a job as returned to the pipeline by a job worker. Only used for custom actions.
      */
    def putJobSuccessResult(params: PutJobSuccessResultInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putJobSuccessResult(
      params: PutJobSuccessResultInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Represents the failure of a third party job as returned to the pipeline by a job worker. Only used for partner actions.
      */
    def putThirdPartyJobFailureResult(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putThirdPartyJobFailureResult(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Represents the failure of a third party job as returned to the pipeline by a job worker. Only used for partner actions.
      */
    def putThirdPartyJobFailureResult(params: PutThirdPartyJobFailureResultInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putThirdPartyJobFailureResult(
      params: PutThirdPartyJobFailureResultInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Represents the success of a third party job as returned to the pipeline by a job worker. Only used for partner actions.
      */
    def putThirdPartyJobSuccessResult(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putThirdPartyJobSuccessResult(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Represents the success of a third party job as returned to the pipeline by a job worker. Only used for partner actions.
      */
    def putThirdPartyJobSuccessResult(params: PutThirdPartyJobSuccessResultInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putThirdPartyJobSuccessResult(
      params: PutThirdPartyJobSuccessResultInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Defines a webhook and returns a unique webhook URL generated by CodePipeline. This URL can be supplied to third party source hosting providers to call every time there's a code change. When CodePipeline receives a POST request on this URL, the pipeline defined in the webhook is started as long as the POST request satisfied the authentication and filtering requirements supplied when defining the webhook. RegisterWebhookWithThirdParty and DeregisterWebhookWithThirdParty APIs can be used to automatically configure supported third parties to call the generated webhook URL.
      */
    def putWebhook(): awsDashSdkLib.libRequestMod.Request[PutWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putWebhook(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutWebhookOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Defines a webhook and returns a unique webhook URL generated by CodePipeline. This URL can be supplied to third party source hosting providers to call every time there's a code change. When CodePipeline receives a POST request on this URL, the pipeline defined in the webhook is started as long as the POST request satisfied the authentication and filtering requirements supplied when defining the webhook. RegisterWebhookWithThirdParty and DeregisterWebhookWithThirdParty APIs can be used to automatically configure supported third parties to call the generated webhook URL.
      */
    def putWebhook(params: PutWebhookInput): awsDashSdkLib.libRequestMod.Request[PutWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putWebhook(
      params: PutWebhookInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutWebhookOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Configures a connection between the webhook that was created and the external tool with events to be detected.
      */
    def registerWebhookWithThirdParty(): awsDashSdkLib.libRequestMod.Request[RegisterWebhookWithThirdPartyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerWebhookWithThirdParty(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterWebhookWithThirdPartyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterWebhookWithThirdPartyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Configures a connection between the webhook that was created and the external tool with events to be detected.
      */
    def registerWebhookWithThirdParty(params: RegisterWebhookWithThirdPartyInput): awsDashSdkLib.libRequestMod.Request[RegisterWebhookWithThirdPartyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerWebhookWithThirdParty(
      params: RegisterWebhookWithThirdPartyInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterWebhookWithThirdPartyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterWebhookWithThirdPartyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Resumes the pipeline execution by retrying the last failed actions in a stage.
      */
    def retryStageExecution(): awsDashSdkLib.libRequestMod.Request[RetryStageExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def retryStageExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RetryStageExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RetryStageExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Resumes the pipeline execution by retrying the last failed actions in a stage.
      */
    def retryStageExecution(params: RetryStageExecutionInput): awsDashSdkLib.libRequestMod.Request[RetryStageExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def retryStageExecution(
      params: RetryStageExecutionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RetryStageExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RetryStageExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts the specified pipeline. Specifically, it begins processing the latest commit to the source location specified as part of the pipeline.
      */
    def startPipelineExecution(): awsDashSdkLib.libRequestMod.Request[StartPipelineExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startPipelineExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartPipelineExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartPipelineExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts the specified pipeline. Specifically, it begins processing the latest commit to the source location specified as part of the pipeline.
      */
    def startPipelineExecution(params: StartPipelineExecutionInput): awsDashSdkLib.libRequestMod.Request[StartPipelineExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startPipelineExecution(
      params: StartPipelineExecutionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartPipelineExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartPipelineExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a specified pipeline with edits or changes to its structure. Use a JSON file with the pipeline structure in conjunction with UpdatePipeline to provide the full structure of the pipeline. Updating the pipeline increases the version number of the pipeline by 1.
      */
    def updatePipeline(): awsDashSdkLib.libRequestMod.Request[UpdatePipelineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updatePipeline(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdatePipelineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdatePipelineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a specified pipeline with edits or changes to its structure. Use a JSON file with the pipeline structure in conjunction with UpdatePipeline to provide the full structure of the pipeline. Updating the pipeline increases the version number of the pipeline by 1.
      */
    def updatePipeline(params: UpdatePipelineInput): awsDashSdkLib.libRequestMod.Request[UpdatePipelineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updatePipeline(
      params: UpdatePipelineInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdatePipelineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdatePipelineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdatePipelineInput extends js.Object {
    /**
      * The name of the pipeline to be updated.
      */
    var pipeline: PipelineDeclaration
  }
  
  trait UpdatePipelineOutput extends js.Object {
    /**
      * The structure of the updated pipeline.
      */
    var pipeline: js.UndefOr[PipelineDeclaration] = js.undefined
  }
  
  trait WebhookAuthConfiguration extends js.Object {
    /**
      * The property used to configure acceptance of webhooks within a specific IP range. For IP, only the AllowedIPRange property must be set, and this property must be set to a valid CIDR range.
      */
    var AllowedIPRange: js.UndefOr[WebhookAuthConfigurationAllowedIPRange] = js.undefined
    /**
      * The property used to configure GitHub authentication. For GITHUB_HMAC, only the SecretToken property must be set.
      */
    var SecretToken: js.UndefOr[WebhookAuthConfigurationSecretToken] = js.undefined
  }
  
  trait WebhookDefinition extends js.Object {
    /**
      * Supported options are GITHUB_HMAC, IP and UNAUTHENTICATED.    GITHUB_HMAC implements the authentication scheme described here: https://developer.github.com/webhooks/securing/    IP will reject webhooks trigger requests unless they originate from an IP within the IP range whitelisted in the authentication configuration.    UNAUTHENTICATED will accept all webhook trigger requests regardless of origin.  
      */
    var authentication: WebhookAuthenticationType
    /**
      * Properties that configure the authentication applied to incoming webhook trigger requests. The required properties depend on the authentication type. For GITHUB_HMAC, only the SecretToken property must be set. For IP, only the AllowedIPRange property must be set to a valid CIDR range. For UNAUTHENTICATED, no properties can be set.
      */
    var authenticationConfiguration: WebhookAuthConfiguration
    /**
      * A list of rules applied to the body/payload sent in the POST request to a webhook URL. All defined rules must pass for the request to be accepted and the pipeline started.
      */
    var filters: WebhookFilters
    /**
      * The name of the webhook.
      */
    var name: WebhookName
    /**
      * The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
      */
    var targetAction: ActionName
    /**
      * The name of the pipeline you want to connect to the webhook.
      */
    var targetPipeline: PipelineName
  }
  
  trait WebhookFilterRule extends js.Object {
    /**
      * A JsonPath expression that will be applied to the body/payload of the webhook. The value selected by JsonPath expression must match the value specified in the matchEquals field, otherwise the request will be ignored. More information on JsonPath expressions can be found here: https://github.com/json-path/JsonPath.
      */
    var jsonPath: JsonPath
    /**
      * The value selected by the JsonPath expression must match what is supplied in the MatchEquals field, otherwise the request will be ignored. Properties from the target action configuration can be included as placeholders in this value by surrounding the action configuration key with curly braces. For example, if the value supplied here is "refs/heads/{Branch}" and the target action has an action configuration property called "Branch" with a value of "master", the MatchEquals value will be evaluated as "refs/heads/master". A list of action configuration properties for built-in action types can be found here: Pipeline Structure Reference Action Requirements.
      */
    var matchEquals: js.UndefOr[MatchEquals] = js.undefined
  }
  
  trait _ActionCategory extends js.Object
  
  trait _ActionConfigurationPropertyType extends js.Object
  
  trait _ActionExecutionStatus extends js.Object
  
  trait _ActionOwner extends js.Object
  
  trait _ApprovalStatus extends js.Object
  
  trait _FailureType extends js.Object
  
  trait _JobStatus extends js.Object
  
  trait _PipelineExecutionStatus extends js.Object
  
  trait _StageExecutionStatus extends js.Object
  
  trait _StageTransitionType extends js.Object
  
  trait _WebhookAuthenticationType extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
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

