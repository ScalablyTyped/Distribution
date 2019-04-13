package typings
package awsDashSdkLib.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticTranscoder
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ElasticTranscoder: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * The CancelJob operation cancels an unfinished job.  You can only cancel a job that has a status of Submitted. To prevent a pipeline from starting to process a job while you're getting the job identifier, use UpdatePipelineStatus to temporarily pause the pipeline. 
    */
  def cancelJob(): awsDashSdkLib.libRequestMod.Request[CancelJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CancelJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CancelJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The CancelJob operation cancels an unfinished job.  You can only cancel a job that has a status of Submitted. To prevent a pipeline from starting to process a job while you're getting the job identifier, use UpdatePipelineStatus to temporarily pause the pipeline. 
    */
  def cancelJob(params: CancelJobRequest): awsDashSdkLib.libRequestMod.Request[CancelJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelJob(
    params: CancelJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CancelJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CancelJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * When you create a job, Elastic Transcoder returns JSON data that includes the values that you specified plus information about the job that is created. If you have specified more than one output for your jobs (for example, one output for the Kindle Fire and another output for the Apple iPhone 4s), you currently must use the Elastic Transcoder API to list the jobs (as opposed to the AWS Console).
    */
  def createJob(): awsDashSdkLib.libRequestMod.Request[CreateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * When you create a job, Elastic Transcoder returns JSON data that includes the values that you specified plus information about the job that is created. If you have specified more than one output for your jobs (for example, one output for the Kindle Fire and another output for the Apple iPhone 4s), you currently must use the Elastic Transcoder API to list the jobs (as opposed to the AWS Console).
    */
  def createJob(params: CreateJobRequest): awsDashSdkLib.libRequestMod.Request[CreateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createJob(
    params: CreateJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The CreatePipeline operation creates a pipeline with settings that you specify.
    */
  def createPipeline(): awsDashSdkLib.libRequestMod.Request[CreatePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPipeline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The CreatePipeline operation creates a pipeline with settings that you specify.
    */
  def createPipeline(params: CreatePipelineRequest): awsDashSdkLib.libRequestMod.Request[CreatePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPipeline(
    params: CreatePipelineRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The CreatePreset operation creates a preset with settings that you specify.  Elastic Transcoder checks the CreatePreset settings to ensure that they meet Elastic Transcoder requirements and to determine whether they comply with H.264 standards. If your settings are not valid for Elastic Transcoder, Elastic Transcoder returns an HTTP 400 response (ValidationException) and does not create the preset. If the settings are valid for Elastic Transcoder but aren't strictly compliant with the H.264 standard, Elastic Transcoder creates the preset and returns a warning message in the response. This helps you determine whether your settings comply with the H.264 standard while giving you greater flexibility with respect to the video that Elastic Transcoder produces.  Elastic Transcoder uses the H.264 video-compression format. For more information, see the International Telecommunication Union publication Recommendation ITU-T H.264: Advanced video coding for generic audiovisual services.
    */
  def createPreset(): awsDashSdkLib.libRequestMod.Request[CreatePresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPreset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePresetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The CreatePreset operation creates a preset with settings that you specify.  Elastic Transcoder checks the CreatePreset settings to ensure that they meet Elastic Transcoder requirements and to determine whether they comply with H.264 standards. If your settings are not valid for Elastic Transcoder, Elastic Transcoder returns an HTTP 400 response (ValidationException) and does not create the preset. If the settings are valid for Elastic Transcoder but aren't strictly compliant with the H.264 standard, Elastic Transcoder creates the preset and returns a warning message in the response. This helps you determine whether your settings comply with the H.264 standard while giving you greater flexibility with respect to the video that Elastic Transcoder produces.  Elastic Transcoder uses the H.264 video-compression format. For more information, see the International Telecommunication Union publication Recommendation ITU-T H.264: Advanced video coding for generic audiovisual services.
    */
  def createPreset(params: CreatePresetRequest): awsDashSdkLib.libRequestMod.Request[CreatePresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPreset(
    params: CreatePresetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePresetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The DeletePipeline operation removes a pipeline.  You can only delete a pipeline that has never been used or that is not currently in use (doesn't contain any active jobs). If the pipeline is currently in use, DeletePipeline returns an error. 
    */
  def deletePipeline(): awsDashSdkLib.libRequestMod.Request[DeletePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePipeline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeletePipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeletePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The DeletePipeline operation removes a pipeline.  You can only delete a pipeline that has never been used or that is not currently in use (doesn't contain any active jobs). If the pipeline is currently in use, DeletePipeline returns an error. 
    */
  def deletePipeline(params: DeletePipelineRequest): awsDashSdkLib.libRequestMod.Request[DeletePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePipeline(
    params: DeletePipelineRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeletePipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeletePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The DeletePreset operation removes a preset that you've added in an AWS region.  You can't delete the default presets that are included with Elastic Transcoder. 
    */
  def deletePreset(): awsDashSdkLib.libRequestMod.Request[DeletePresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePreset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeletePresetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeletePresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The DeletePreset operation removes a preset that you've added in an AWS region.  You can't delete the default presets that are included with Elastic Transcoder. 
    */
  def deletePreset(params: DeletePresetRequest): awsDashSdkLib.libRequestMod.Request[DeletePresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePreset(
    params: DeletePresetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeletePresetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeletePresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The ListJobsByPipeline operation gets a list of the jobs currently in a pipeline. Elastic Transcoder returns all of the jobs currently in the specified pipeline. The response body contains one element for each job that satisfies the search criteria.
    */
  def listJobsByPipeline(): awsDashSdkLib.libRequestMod.Request[ListJobsByPipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listJobsByPipeline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListJobsByPipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListJobsByPipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The ListJobsByPipeline operation gets a list of the jobs currently in a pipeline. Elastic Transcoder returns all of the jobs currently in the specified pipeline. The response body contains one element for each job that satisfies the search criteria.
    */
  def listJobsByPipeline(params: ListJobsByPipelineRequest): awsDashSdkLib.libRequestMod.Request[ListJobsByPipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listJobsByPipeline(
    params: ListJobsByPipelineRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListJobsByPipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListJobsByPipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The ListJobsByStatus operation gets a list of jobs that have a specified status. The response body contains one element for each job that satisfies the search criteria.
    */
  def listJobsByStatus(): awsDashSdkLib.libRequestMod.Request[ListJobsByStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listJobsByStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListJobsByStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListJobsByStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The ListJobsByStatus operation gets a list of jobs that have a specified status. The response body contains one element for each job that satisfies the search criteria.
    */
  def listJobsByStatus(params: ListJobsByStatusRequest): awsDashSdkLib.libRequestMod.Request[ListJobsByStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listJobsByStatus(
    params: ListJobsByStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListJobsByStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListJobsByStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The ListPipelines operation gets a list of the pipelines associated with the current AWS account.
    */
  def listPipelines(): awsDashSdkLib.libRequestMod.Request[ListPipelinesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPipelines(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPipelinesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPipelinesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The ListPipelines operation gets a list of the pipelines associated with the current AWS account.
    */
  def listPipelines(params: ListPipelinesRequest): awsDashSdkLib.libRequestMod.Request[ListPipelinesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPipelines(
    params: ListPipelinesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPipelinesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPipelinesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The ListPresets operation gets a list of the default presets included with Elastic Transcoder and the presets that you've added in an AWS region.
    */
  def listPresets(): awsDashSdkLib.libRequestMod.Request[ListPresetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPresets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPresetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPresetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The ListPresets operation gets a list of the default presets included with Elastic Transcoder and the presets that you've added in an AWS region.
    */
  def listPresets(params: ListPresetsRequest): awsDashSdkLib.libRequestMod.Request[ListPresetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPresets(
    params: ListPresetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPresetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPresetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The ReadJob operation returns detailed information about a job.
    */
  def readJob(): awsDashSdkLib.libRequestMod.Request[ReadJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def readJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ReadJobResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ReadJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The ReadJob operation returns detailed information about a job.
    */
  def readJob(params: ReadJobRequest): awsDashSdkLib.libRequestMod.Request[ReadJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def readJob(
    params: ReadJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ReadJobResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ReadJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The ReadPipeline operation gets detailed information about a pipeline.
    */
  def readPipeline(): awsDashSdkLib.libRequestMod.Request[ReadPipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def readPipeline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ReadPipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ReadPipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The ReadPipeline operation gets detailed information about a pipeline.
    */
  def readPipeline(params: ReadPipelineRequest): awsDashSdkLib.libRequestMod.Request[ReadPipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def readPipeline(
    params: ReadPipelineRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ReadPipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ReadPipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The ReadPreset operation gets detailed information about a preset.
    */
  def readPreset(): awsDashSdkLib.libRequestMod.Request[ReadPresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def readPreset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ReadPresetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ReadPresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The ReadPreset operation gets detailed information about a preset.
    */
  def readPreset(params: ReadPresetRequest): awsDashSdkLib.libRequestMod.Request[ReadPresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def readPreset(
    params: ReadPresetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ReadPresetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ReadPresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The TestRole operation tests the IAM role used to create the pipeline. The TestRole action lets you determine whether the IAM role you are using has sufficient permissions to let Elastic Transcoder perform tasks associated with the transcoding process. The action attempts to assume the specified IAM role, checks read access to the input and output buckets, and tries to send a test notification to Amazon SNS topics that you specify.
    */
  def testRole(): awsDashSdkLib.libRequestMod.Request[TestRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def testRole(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TestRoleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TestRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The TestRole operation tests the IAM role used to create the pipeline. The TestRole action lets you determine whether the IAM role you are using has sufficient permissions to let Elastic Transcoder perform tasks associated with the transcoding process. The action attempts to assume the specified IAM role, checks read access to the input and output buckets, and tries to send a test notification to Amazon SNS topics that you specify.
    */
  def testRole(params: TestRoleRequest): awsDashSdkLib.libRequestMod.Request[TestRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def testRole(
    params: TestRoleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TestRoleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TestRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Use the UpdatePipeline operation to update settings for a pipeline.  When you change pipeline settings, your changes take effect immediately. Jobs that you have already submitted and that Elastic Transcoder has not started to process are affected in addition to jobs that you submit after you change settings.  
    */
  def updatePipeline(): awsDashSdkLib.libRequestMod.Request[UpdatePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePipeline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdatePipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdatePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Use the UpdatePipeline operation to update settings for a pipeline.  When you change pipeline settings, your changes take effect immediately. Jobs that you have already submitted and that Elastic Transcoder has not started to process are affected in addition to jobs that you submit after you change settings.  
    */
  def updatePipeline(params: UpdatePipelineRequest): awsDashSdkLib.libRequestMod.Request[UpdatePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePipeline(
    params: UpdatePipelineRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdatePipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdatePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * With the UpdatePipelineNotifications operation, you can update Amazon Simple Notification Service (Amazon SNS) notifications for a pipeline. When you update notifications for a pipeline, Elastic Transcoder returns the values that you specified in the request.
    */
  def updatePipelineNotifications(): awsDashSdkLib.libRequestMod.Request[UpdatePipelineNotificationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePipelineNotifications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdatePipelineNotificationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdatePipelineNotificationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * With the UpdatePipelineNotifications operation, you can update Amazon Simple Notification Service (Amazon SNS) notifications for a pipeline. When you update notifications for a pipeline, Elastic Transcoder returns the values that you specified in the request.
    */
  def updatePipelineNotifications(params: UpdatePipelineNotificationsRequest): awsDashSdkLib.libRequestMod.Request[UpdatePipelineNotificationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePipelineNotifications(
    params: UpdatePipelineNotificationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdatePipelineNotificationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdatePipelineNotificationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The UpdatePipelineStatus operation pauses or reactivates a pipeline, so that the pipeline stops or restarts the processing of jobs. Changing the pipeline status is useful if you want to cancel one or more jobs. You can't cancel jobs after Elastic Transcoder has started processing them; if you pause the pipeline to which you submitted the jobs, you have more time to get the job IDs for the jobs that you want to cancel, and to send a CancelJob request. 
    */
  def updatePipelineStatus(): awsDashSdkLib.libRequestMod.Request[UpdatePipelineStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePipelineStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdatePipelineStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdatePipelineStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The UpdatePipelineStatus operation pauses or reactivates a pipeline, so that the pipeline stops or restarts the processing of jobs. Changing the pipeline status is useful if you want to cancel one or more jobs. You can't cancel jobs after Elastic Transcoder has started processing them; if you pause the pipeline to which you submitted the jobs, you have more time to get the job IDs for the jobs that you want to cancel, and to send a CancelJob request. 
    */
  def updatePipelineStatus(params: UpdatePipelineStatusRequest): awsDashSdkLib.libRequestMod.Request[UpdatePipelineStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePipelineStatus(
    params: UpdatePipelineStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdatePipelineStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdatePipelineStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the jobComplete state by periodically calling the underlying ElasticTranscoder.readJoboperation every 30 seconds (at most 120 times).
    */
  @JSName("waitFor")
  def waitFor_jobComplete(state: awsDashSdkLib.awsDashSdkLibStrings.jobComplete): awsDashSdkLib.libRequestMod.Request[ReadJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_jobComplete(
    state: awsDashSdkLib.awsDashSdkLibStrings.jobComplete,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ReadJobResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ReadJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the jobComplete state by periodically calling the underlying ElasticTranscoder.readJoboperation every 30 seconds (at most 120 times).
    */
  @JSName("waitFor")
  def waitFor_jobComplete(
    state: awsDashSdkLib.awsDashSdkLibStrings.jobComplete,
    params: ReadJobRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[ReadJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_jobComplete(
    state: awsDashSdkLib.awsDashSdkLibStrings.jobComplete,
    params: ReadJobRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ReadJobResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ReadJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

