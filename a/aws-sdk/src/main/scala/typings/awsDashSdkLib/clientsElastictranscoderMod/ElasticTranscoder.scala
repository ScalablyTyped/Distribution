package typings
package awsDashSdkLib.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticTranscoder
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ElasticTranscoder: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ClientConfiguration = js.native
  /**
    * The CancelJob operation cancels an unfinished job.  You can only cancel a job that has a status of Submitted. To prevent a pipeline from starting to process a job while you're getting the job identifier, use UpdatePipelineStatus to temporarily pause the pipeline. 
    */
  def cancelJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CancelJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CancelJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CancelJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The CancelJob operation cancels an unfinished job.  You can only cancel a job that has a status of Submitted. To prevent a pipeline from starting to process a job while you're getting the job identifier, use UpdatePipelineStatus to temporarily pause the pipeline. 
    */
  def cancelJob(params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CancelJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CancelJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelJob(
    params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CancelJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CancelJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CancelJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * When you create a job, Elastic Transcoder returns JSON data that includes the values that you specified plus information about the job that is created. If you have specified more than one output for your jobs (for example, one output for the Kindle Fire and another output for the Apple iPhone 4s), you currently must use the Elastic Transcoder API to list the jobs (as opposed to the AWS Console).
    */
  def createJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CreateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CreateJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CreateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * When you create a job, Elastic Transcoder returns JSON data that includes the values that you specified plus information about the job that is created. If you have specified more than one output for your jobs (for example, one output for the Kindle Fire and another output for the Apple iPhone 4s), you currently must use the Elastic Transcoder API to list the jobs (as opposed to the AWS Console).
    */
  def createJob(params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CreateJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CreateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createJob(
    params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CreateJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CreateJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CreateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The CreatePipeline operation creates a pipeline with settings that you specify.
    */
  def createPipeline(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CreatePipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createPipeline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CreatePipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CreatePipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The CreatePipeline operation creates a pipeline with settings that you specify.
    */
  def createPipeline(params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CreatePipelineRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CreatePipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createPipeline(
    params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CreatePipelineRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CreatePipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CreatePipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The CreatePreset operation creates a preset with settings that you specify.  Elastic Transcoder checks the CreatePreset settings to ensure that they meet Elastic Transcoder requirements and to determine whether they comply with H.264 standards. If your settings are not valid for Elastic Transcoder, Elastic Transcoder returns an HTTP 400 response (ValidationException) and does not create the preset. If the settings are valid for Elastic Transcoder but aren't strictly compliant with the H.264 standard, Elastic Transcoder creates the preset and returns a warning message in the response. This helps you determine whether your settings comply with the H.264 standard while giving you greater flexibility with respect to the video that Elastic Transcoder produces.  Elastic Transcoder uses the H.264 video-compression format. For more information, see the International Telecommunication Union publication Recommendation ITU-T H.264: Advanced video coding for generic audiovisual services.
    */
  def createPreset(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CreatePresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createPreset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CreatePresetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CreatePresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The CreatePreset operation creates a preset with settings that you specify.  Elastic Transcoder checks the CreatePreset settings to ensure that they meet Elastic Transcoder requirements and to determine whether they comply with H.264 standards. If your settings are not valid for Elastic Transcoder, Elastic Transcoder returns an HTTP 400 response (ValidationException) and does not create the preset. If the settings are valid for Elastic Transcoder but aren't strictly compliant with the H.264 standard, Elastic Transcoder creates the preset and returns a warning message in the response. This helps you determine whether your settings comply with the H.264 standard while giving you greater flexibility with respect to the video that Elastic Transcoder produces.  Elastic Transcoder uses the H.264 video-compression format. For more information, see the International Telecommunication Union publication Recommendation ITU-T H.264: Advanced video coding for generic audiovisual services.
    */
  def createPreset(params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CreatePresetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CreatePresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createPreset(
    params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CreatePresetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CreatePresetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.CreatePresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The DeletePipeline operation removes a pipeline.  You can only delete a pipeline that has never been used or that is not currently in use (doesn't contain any active jobs). If the pipeline is currently in use, DeletePipeline returns an error. 
    */
  def deletePipeline(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.DeletePipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deletePipeline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.DeletePipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.DeletePipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The DeletePipeline operation removes a pipeline.  You can only delete a pipeline that has never been used or that is not currently in use (doesn't contain any active jobs). If the pipeline is currently in use, DeletePipeline returns an error. 
    */
  def deletePipeline(params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.DeletePipelineRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.DeletePipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deletePipeline(
    params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.DeletePipelineRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.DeletePipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.DeletePipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The DeletePreset operation removes a preset that you've added in an AWS region.  You can't delete the default presets that are included with Elastic Transcoder. 
    */
  def deletePreset(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.DeletePresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deletePreset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.DeletePresetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.DeletePresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The DeletePreset operation removes a preset that you've added in an AWS region.  You can't delete the default presets that are included with Elastic Transcoder. 
    */
  def deletePreset(params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.DeletePresetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.DeletePresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deletePreset(
    params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.DeletePresetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.DeletePresetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.DeletePresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The ListJobsByPipeline operation gets a list of the jobs currently in a pipeline. Elastic Transcoder returns all of the jobs currently in the specified pipeline. The response body contains one element for each job that satisfies the search criteria.
    */
  def listJobsByPipeline(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListJobsByPipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listJobsByPipeline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListJobsByPipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListJobsByPipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The ListJobsByPipeline operation gets a list of the jobs currently in a pipeline. Elastic Transcoder returns all of the jobs currently in the specified pipeline. The response body contains one element for each job that satisfies the search criteria.
    */
  def listJobsByPipeline(params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListJobsByPipelineRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListJobsByPipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listJobsByPipeline(
    params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListJobsByPipelineRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListJobsByPipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListJobsByPipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The ListJobsByStatus operation gets a list of jobs that have a specified status. The response body contains one element for each job that satisfies the search criteria.
    */
  def listJobsByStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListJobsByStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listJobsByStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListJobsByStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListJobsByStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The ListJobsByStatus operation gets a list of jobs that have a specified status. The response body contains one element for each job that satisfies the search criteria.
    */
  def listJobsByStatus(params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListJobsByStatusRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListJobsByStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listJobsByStatus(
    params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListJobsByStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListJobsByStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListJobsByStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The ListPipelines operation gets a list of the pipelines associated with the current AWS account.
    */
  def listPipelines(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListPipelinesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPipelines(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListPipelinesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListPipelinesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The ListPipelines operation gets a list of the pipelines associated with the current AWS account.
    */
  def listPipelines(params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListPipelinesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListPipelinesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPipelines(
    params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListPipelinesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListPipelinesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListPipelinesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The ListPresets operation gets a list of the default presets included with Elastic Transcoder and the presets that you've added in an AWS region.
    */
  def listPresets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListPresetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPresets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListPresetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListPresetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The ListPresets operation gets a list of the default presets included with Elastic Transcoder and the presets that you've added in an AWS region.
    */
  def listPresets(params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListPresetsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListPresetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPresets(
    params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListPresetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListPresetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ListPresetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The ReadJob operation returns detailed information about a job.
    */
  def readJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def readJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The ReadJob operation returns detailed information about a job.
    */
  def readJob(params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def readJob(
    params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The ReadPipeline operation gets detailed information about a pipeline.
    */
  def readPipeline(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadPipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def readPipeline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadPipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadPipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The ReadPipeline operation gets detailed information about a pipeline.
    */
  def readPipeline(params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadPipelineRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadPipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def readPipeline(
    params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadPipelineRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadPipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadPipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The ReadPreset operation gets detailed information about a preset.
    */
  def readPreset(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadPresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def readPreset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadPresetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadPresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The ReadPreset operation gets detailed information about a preset.
    */
  def readPreset(params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadPresetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadPresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def readPreset(
    params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadPresetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadPresetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadPresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The TestRole operation tests the IAM role used to create the pipeline. The TestRole action lets you determine whether the IAM role you are using has sufficient permissions to let Elastic Transcoder perform tasks associated with the transcoding process. The action attempts to assume the specified IAM role, checks read access to the input and output buckets, and tries to send a test notification to Amazon SNS topics that you specify.
    */
  def testRole(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.TestRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def testRole(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.TestRoleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.TestRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The TestRole operation tests the IAM role used to create the pipeline. The TestRole action lets you determine whether the IAM role you are using has sufficient permissions to let Elastic Transcoder perform tasks associated with the transcoding process. The action attempts to assume the specified IAM role, checks read access to the input and output buckets, and tries to send a test notification to Amazon SNS topics that you specify.
    */
  def testRole(params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.TestRoleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.TestRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def testRole(
    params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.TestRoleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.TestRoleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.TestRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Use the UpdatePipeline operation to update settings for a pipeline.  When you change pipeline settings, your changes take effect immediately. Jobs that you have already submitted and that Elastic Transcoder has not started to process are affected in addition to jobs that you submit after you change settings.  
    */
  def updatePipeline(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.UpdatePipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updatePipeline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.UpdatePipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.UpdatePipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Use the UpdatePipeline operation to update settings for a pipeline.  When you change pipeline settings, your changes take effect immediately. Jobs that you have already submitted and that Elastic Transcoder has not started to process are affected in addition to jobs that you submit after you change settings.  
    */
  def updatePipeline(params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.UpdatePipelineRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.UpdatePipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updatePipeline(
    params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.UpdatePipelineRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.UpdatePipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.UpdatePipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * With the UpdatePipelineNotifications operation, you can update Amazon Simple Notification Service (Amazon SNS) notifications for a pipeline. When you update notifications for a pipeline, Elastic Transcoder returns the values that you specified in the request.
    */
  def updatePipelineNotifications(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.UpdatePipelineNotificationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updatePipelineNotifications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.UpdatePipelineNotificationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.UpdatePipelineNotificationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * With the UpdatePipelineNotifications operation, you can update Amazon Simple Notification Service (Amazon SNS) notifications for a pipeline. When you update notifications for a pipeline, Elastic Transcoder returns the values that you specified in the request.
    */
  def updatePipelineNotifications(
    params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.UpdatePipelineNotificationsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.UpdatePipelineNotificationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updatePipelineNotifications(
    params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.UpdatePipelineNotificationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.UpdatePipelineNotificationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.UpdatePipelineNotificationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The UpdatePipelineStatus operation pauses or reactivates a pipeline, so that the pipeline stops or restarts the processing of jobs. Changing the pipeline status is useful if you want to cancel one or more jobs. You can't cancel jobs after Elastic Transcoder has started processing them; if you pause the pipeline to which you submitted the jobs, you have more time to get the job IDs for the jobs that you want to cancel, and to send a CancelJob request. 
    */
  def updatePipelineStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.UpdatePipelineStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updatePipelineStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.UpdatePipelineStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.UpdatePipelineStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The UpdatePipelineStatus operation pauses or reactivates a pipeline, so that the pipeline stops or restarts the processing of jobs. Changing the pipeline status is useful if you want to cancel one or more jobs. You can't cancel jobs after Elastic Transcoder has started processing them; if you pause the pipeline to which you submitted the jobs, you have more time to get the job IDs for the jobs that you want to cancel, and to send a CancelJob request. 
    */
  def updatePipelineStatus(params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.UpdatePipelineStatusRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.UpdatePipelineStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updatePipelineStatus(
    params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.UpdatePipelineStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.UpdatePipelineStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.UpdatePipelineStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the jobComplete state by periodically calling the underlying ElasticTranscoder.readJoboperation every 30 seconds (at most 120 times).
    */
  @JSName("waitFor")
  def waitFor_jobComplete(state: awsDashSdkLib.awsDashSdkLibStrings.jobComplete): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_jobComplete(
    state: awsDashSdkLib.awsDashSdkLibStrings.jobComplete,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the jobComplete state by periodically calling the underlying ElasticTranscoder.readJoboperation every 30 seconds (at most 120 times).
    */
  @JSName("waitFor")
  def waitFor_jobComplete(
    state: awsDashSdkLib.awsDashSdkLibStrings.jobComplete,
    params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadJobRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_jobComplete(
    state: awsDashSdkLib.awsDashSdkLibStrings.jobComplete,
    params: awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadJobRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElastictranscoderMod.ElasticTranscoderNs.ReadJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

