package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodePipeline
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CodePipeline: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ClientConfiguration = js.native
  /**
    * Returns information about a specified job and whether that job has been received by the job worker. Only used for custom actions.
    */
  def acknowledgeJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.AcknowledgeJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def acknowledgeJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.AcknowledgeJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.AcknowledgeJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specified job and whether that job has been received by the job worker. Only used for custom actions.
    */
  def acknowledgeJob(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.AcknowledgeJobInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.AcknowledgeJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def acknowledgeJob(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.AcknowledgeJobInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.AcknowledgeJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.AcknowledgeJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Confirms a job worker has received the specified job. Only used for partner actions.
    */
  def acknowledgeThirdPartyJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.AcknowledgeThirdPartyJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def acknowledgeThirdPartyJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.AcknowledgeThirdPartyJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.AcknowledgeThirdPartyJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Confirms a job worker has received the specified job. Only used for partner actions.
    */
  def acknowledgeThirdPartyJob(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.AcknowledgeThirdPartyJobInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.AcknowledgeThirdPartyJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def acknowledgeThirdPartyJob(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.AcknowledgeThirdPartyJobInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.AcknowledgeThirdPartyJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.AcknowledgeThirdPartyJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new custom action that can be used in all pipelines associated with the AWS account. Only used for custom actions.
    */
  def createCustomActionType(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.CreateCustomActionTypeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCustomActionType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.CreateCustomActionTypeOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.CreateCustomActionTypeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new custom action that can be used in all pipelines associated with the AWS account. Only used for custom actions.
    */
  def createCustomActionType(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.CreateCustomActionTypeInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.CreateCustomActionTypeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCustomActionType(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.CreateCustomActionTypeInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.CreateCustomActionTypeOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.CreateCustomActionTypeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a pipeline.
    */
  def createPipeline(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.CreatePipelineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createPipeline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.CreatePipelineOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.CreatePipelineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a pipeline.
    */
  def createPipeline(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.CreatePipelineInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.CreatePipelineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createPipeline(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.CreatePipelineInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.CreatePipelineOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.CreatePipelineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def deleteCustomActionType(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.DeleteCustomActionTypeInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCustomActionType(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.DeleteCustomActionTypeInput,
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
  def deletePipeline(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.DeletePipelineInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePipeline(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.DeletePipelineInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a previously created webhook by name. Deleting the webhook stops AWS CodePipeline from starting a pipeline every time an external event occurs. The API will return successfully when trying to delete a webhook that is already deleted. If a deleted webhook is re-created by calling PutWebhook with the same name, it will have a different URL.
    */
  def deleteWebhook(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.DeleteWebhookOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteWebhook(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.DeleteWebhookOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.DeleteWebhookOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a previously created webhook by name. Deleting the webhook stops AWS CodePipeline from starting a pipeline every time an external event occurs. The API will return successfully when trying to delete a webhook that is already deleted. If a deleted webhook is re-created by calling PutWebhook with the same name, it will have a different URL.
    */
  def deleteWebhook(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.DeleteWebhookInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.DeleteWebhookOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteWebhook(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.DeleteWebhookInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.DeleteWebhookOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.DeleteWebhookOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the connection between the webhook that was created by CodePipeline and the external tool with events to be detected. Currently only supported for webhooks that target an action type of GitHub.
    */
  def deregisterWebhookWithThirdParty(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.DeregisterWebhookWithThirdPartyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deregisterWebhookWithThirdParty(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.DeregisterWebhookWithThirdPartyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.DeregisterWebhookWithThirdPartyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the connection between the webhook that was created by CodePipeline and the external tool with events to be detected. Currently only supported for webhooks that target an action type of GitHub.
    */
  def deregisterWebhookWithThirdParty(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.DeregisterWebhookWithThirdPartyInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.DeregisterWebhookWithThirdPartyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deregisterWebhookWithThirdParty(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.DeregisterWebhookWithThirdPartyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.DeregisterWebhookWithThirdPartyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.DeregisterWebhookWithThirdPartyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def disableStageTransition(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.DisableStageTransitionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableStageTransition(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.DisableStageTransitionInput,
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
  def enableStageTransition(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.EnableStageTransitionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableStageTransition(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.EnableStageTransitionInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a job. Only used for custom actions.  When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts. Additionally, this API returns any secret values defined for the action. 
    */
  def getJobDetails(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetJobDetailsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getJobDetails(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetJobDetailsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetJobDetailsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a job. Only used for custom actions.  When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts. Additionally, this API returns any secret values defined for the action. 
    */
  def getJobDetails(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetJobDetailsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetJobDetailsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getJobDetails(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetJobDetailsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetJobDetailsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetJobDetailsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the metadata, structure, stages, and actions of a pipeline. Can be used to return the entire structure of a pipeline in JSON format, which can then be modified and used to update the pipeline structure with UpdatePipeline.
    */
  def getPipeline(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetPipelineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPipeline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetPipelineOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetPipelineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the metadata, structure, stages, and actions of a pipeline. Can be used to return the entire structure of a pipeline in JSON format, which can then be modified and used to update the pipeline structure with UpdatePipeline.
    */
  def getPipeline(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetPipelineInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetPipelineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPipeline(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetPipelineInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetPipelineOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetPipelineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about an execution of a pipeline, including details about artifacts, the pipeline execution ID, and the name, version, and status of the pipeline.
    */
  def getPipelineExecution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetPipelineExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPipelineExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetPipelineExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetPipelineExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about an execution of a pipeline, including details about artifacts, the pipeline execution ID, and the name, version, and status of the pipeline.
    */
  def getPipelineExecution(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetPipelineExecutionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetPipelineExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPipelineExecution(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetPipelineExecutionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetPipelineExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetPipelineExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about the state of a pipeline, including the stages and actions.
    */
  def getPipelineState(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetPipelineStateOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPipelineState(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetPipelineStateOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetPipelineStateOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about the state of a pipeline, including the stages and actions.
    */
  def getPipelineState(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetPipelineStateInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetPipelineStateOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPipelineState(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetPipelineStateInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetPipelineStateOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetPipelineStateOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Requests the details of a job for a third party action. Only used for partner actions.  When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts. Additionally, this API returns any secret values defined for the action. 
    */
  def getThirdPartyJobDetails(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetThirdPartyJobDetailsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getThirdPartyJobDetails(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetThirdPartyJobDetailsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetThirdPartyJobDetailsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Requests the details of a job for a third party action. Only used for partner actions.  When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts. Additionally, this API returns any secret values defined for the action. 
    */
  def getThirdPartyJobDetails(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetThirdPartyJobDetailsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetThirdPartyJobDetailsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getThirdPartyJobDetails(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetThirdPartyJobDetailsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetThirdPartyJobDetailsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.GetThirdPartyJobDetailsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a summary of all AWS CodePipeline action types associated with your account.
    */
  def listActionTypes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListActionTypesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listActionTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListActionTypesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListActionTypesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a summary of all AWS CodePipeline action types associated with your account.
    */
  def listActionTypes(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListActionTypesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListActionTypesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listActionTypes(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListActionTypesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListActionTypesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListActionTypesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a summary of the most recent executions for a pipeline.
    */
  def listPipelineExecutions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListPipelineExecutionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPipelineExecutions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListPipelineExecutionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListPipelineExecutionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a summary of the most recent executions for a pipeline.
    */
  def listPipelineExecutions(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListPipelineExecutionsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListPipelineExecutionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPipelineExecutions(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListPipelineExecutionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListPipelineExecutionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListPipelineExecutionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a summary of all of the pipelines associated with your account.
    */
  def listPipelines(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListPipelinesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPipelines(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListPipelinesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListPipelinesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a summary of all of the pipelines associated with your account.
    */
  def listPipelines(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListPipelinesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListPipelinesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPipelines(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListPipelinesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListPipelinesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListPipelinesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a listing of all the webhooks in this region for this account. The output lists all webhooks and includes the webhook URL and ARN, as well the configuration for each webhook.
    */
  def listWebhooks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListWebhooksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listWebhooks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListWebhooksOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListWebhooksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a listing of all the webhooks in this region for this account. The output lists all webhooks and includes the webhook URL and ARN, as well the configuration for each webhook.
    */
  def listWebhooks(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListWebhooksInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListWebhooksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listWebhooks(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListWebhooksInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListWebhooksOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.ListWebhooksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about any jobs for AWS CodePipeline to act upon. PollForJobs is only valid for action types with "Custom" in the owner field. If the action type contains "AWS" or "ThirdParty" in the owner field, the PollForJobs action returns an error.  When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts. Additionally, this API returns any secret values defined for the action. 
    */
  def pollForJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PollForJobsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def pollForJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PollForJobsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PollForJobsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about any jobs for AWS CodePipeline to act upon. PollForJobs is only valid for action types with "Custom" in the owner field. If the action type contains "AWS" or "ThirdParty" in the owner field, the PollForJobs action returns an error.  When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts. Additionally, this API returns any secret values defined for the action. 
    */
  def pollForJobs(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PollForJobsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PollForJobsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def pollForJobs(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PollForJobsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PollForJobsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PollForJobsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Determines whether there are any third party jobs for a job worker to act on. Only used for partner actions.  When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts. 
    */
  def pollForThirdPartyJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PollForThirdPartyJobsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def pollForThirdPartyJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PollForThirdPartyJobsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PollForThirdPartyJobsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Determines whether there are any third party jobs for a job worker to act on. Only used for partner actions.  When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts. 
    */
  def pollForThirdPartyJobs(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PollForThirdPartyJobsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PollForThirdPartyJobsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def pollForThirdPartyJobs(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PollForThirdPartyJobsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PollForThirdPartyJobsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PollForThirdPartyJobsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides information to AWS CodePipeline about new revisions to a source.
    */
  def putActionRevision(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutActionRevisionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putActionRevision(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutActionRevisionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutActionRevisionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides information to AWS CodePipeline about new revisions to a source.
    */
  def putActionRevision(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutActionRevisionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutActionRevisionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putActionRevision(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutActionRevisionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutActionRevisionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutActionRevisionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides the response to a manual approval request to AWS CodePipeline. Valid responses include Approved and Rejected.
    */
  def putApprovalResult(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutApprovalResultOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putApprovalResult(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutApprovalResultOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutApprovalResultOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides the response to a manual approval request to AWS CodePipeline. Valid responses include Approved and Rejected.
    */
  def putApprovalResult(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutApprovalResultInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutApprovalResultOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putApprovalResult(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutApprovalResultInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutApprovalResultOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutApprovalResultOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def putJobFailureResult(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutJobFailureResultInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putJobFailureResult(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutJobFailureResultInput,
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
  def putJobSuccessResult(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutJobSuccessResultInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putJobSuccessResult(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutJobSuccessResultInput,
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
  def putThirdPartyJobFailureResult(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutThirdPartyJobFailureResultInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putThirdPartyJobFailureResult(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutThirdPartyJobFailureResultInput,
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
  def putThirdPartyJobSuccessResult(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutThirdPartyJobSuccessResultInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putThirdPartyJobSuccessResult(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutThirdPartyJobSuccessResultInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Defines a webhook and returns a unique webhook URL generated by CodePipeline. This URL can be supplied to third party source hosting providers to call every time there's a code change. When CodePipeline receives a POST request on this URL, the pipeline defined in the webhook is started as long as the POST request satisfied the authentication and filtering requirements supplied when defining the webhook. RegisterWebhookWithThirdParty and DeregisterWebhookWithThirdParty APIs can be used to automatically configure supported third parties to call the generated webhook URL.
    */
  def putWebhook(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutWebhookOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putWebhook(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutWebhookOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutWebhookOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Defines a webhook and returns a unique webhook URL generated by CodePipeline. This URL can be supplied to third party source hosting providers to call every time there's a code change. When CodePipeline receives a POST request on this URL, the pipeline defined in the webhook is started as long as the POST request satisfied the authentication and filtering requirements supplied when defining the webhook. RegisterWebhookWithThirdParty and DeregisterWebhookWithThirdParty APIs can be used to automatically configure supported third parties to call the generated webhook URL.
    */
  def putWebhook(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutWebhookInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutWebhookOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putWebhook(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutWebhookInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutWebhookOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.PutWebhookOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Configures a connection between the webhook that was created and the external tool with events to be detected.
    */
  def registerWebhookWithThirdParty(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.RegisterWebhookWithThirdPartyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def registerWebhookWithThirdParty(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.RegisterWebhookWithThirdPartyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.RegisterWebhookWithThirdPartyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Configures a connection between the webhook that was created and the external tool with events to be detected.
    */
  def registerWebhookWithThirdParty(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.RegisterWebhookWithThirdPartyInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.RegisterWebhookWithThirdPartyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def registerWebhookWithThirdParty(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.RegisterWebhookWithThirdPartyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.RegisterWebhookWithThirdPartyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.RegisterWebhookWithThirdPartyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Resumes the pipeline execution by retrying the last failed actions in a stage.
    */
  def retryStageExecution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.RetryStageExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def retryStageExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.RetryStageExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.RetryStageExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Resumes the pipeline execution by retrying the last failed actions in a stage.
    */
  def retryStageExecution(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.RetryStageExecutionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.RetryStageExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def retryStageExecution(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.RetryStageExecutionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.RetryStageExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.RetryStageExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts the specified pipeline. Specifically, it begins processing the latest commit to the source location specified as part of the pipeline.
    */
  def startPipelineExecution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.StartPipelineExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startPipelineExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.StartPipelineExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.StartPipelineExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts the specified pipeline. Specifically, it begins processing the latest commit to the source location specified as part of the pipeline.
    */
  def startPipelineExecution(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.StartPipelineExecutionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.StartPipelineExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startPipelineExecution(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.StartPipelineExecutionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.StartPipelineExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.StartPipelineExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a specified pipeline with edits or changes to its structure. Use a JSON file with the pipeline structure in conjunction with UpdatePipeline to provide the full structure of the pipeline. Updating the pipeline increases the version number of the pipeline by 1.
    */
  def updatePipeline(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.UpdatePipelineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updatePipeline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.UpdatePipelineOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.UpdatePipelineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a specified pipeline with edits or changes to its structure. Use a JSON file with the pipeline structure in conjunction with UpdatePipeline to provide the full structure of the pipeline. Updating the pipeline increases the version number of the pipeline by 1.
    */
  def updatePipeline(params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.UpdatePipelineInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.UpdatePipelineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updatePipeline(
    params: awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.UpdatePipelineInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.UpdatePipelineOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodepipelineMod.CodePipelineNs.UpdatePipelineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

