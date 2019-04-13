package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaConvert
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MediaConvert: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Associates an AWS Certificate Manager (ACM) Amazon Resource Name (ARN) with AWS Elemental MediaConvert.
    */
  def associateCertificate(): awsDashSdkLib.libRequestMod.Request[AssociateCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates an AWS Certificate Manager (ACM) Amazon Resource Name (ARN) with AWS Elemental MediaConvert.
    */
  def associateCertificate(params: AssociateCertificateRequest): awsDashSdkLib.libRequestMod.Request[AssociateCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateCertificate(
    params: AssociateCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Permanently cancel a job. Once you have canceled a job, you can't start it again.
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
    * Permanently cancel a job. Once you have canceled a job, you can't start it again.
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
    * Create a new transcoding job. For information about jobs and job settings, see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
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
    * Create a new transcoding job. For information about jobs and job settings, see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
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
    * Create a new job template. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  def createJobTemplate(): awsDashSdkLib.libRequestMod.Request[CreateJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createJobTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateJobTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create a new job template. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  def createJobTemplate(params: CreateJobTemplateRequest): awsDashSdkLib.libRequestMod.Request[CreateJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createJobTemplate(
    params: CreateJobTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateJobTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create a new preset. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
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
    * Create a new preset. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
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
    * Create a new transcoding queue. For information about queues, see Working With Queues in the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html
    */
  def createQueue(): awsDashSdkLib.libRequestMod.Request[CreateQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createQueue(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateQueueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create a new transcoding queue. For information about queues, see Working With Queues in the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html
    */
  def createQueue(params: CreateQueueRequest): awsDashSdkLib.libRequestMod.Request[CreateQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createQueue(
    params: CreateQueueRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateQueueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Permanently delete a job template you have created.
    */
  def deleteJobTemplate(): awsDashSdkLib.libRequestMod.Request[DeleteJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteJobTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteJobTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Permanently delete a job template you have created.
    */
  def deleteJobTemplate(params: DeleteJobTemplateRequest): awsDashSdkLib.libRequestMod.Request[DeleteJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteJobTemplate(
    params: DeleteJobTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteJobTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Permanently delete a preset you have created.
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
    * Permanently delete a preset you have created.
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
    * Permanently delete a queue you have created.
    */
  def deleteQueue(): awsDashSdkLib.libRequestMod.Request[DeleteQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteQueue(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteQueueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Permanently delete a queue you have created.
    */
  def deleteQueue(params: DeleteQueueRequest): awsDashSdkLib.libRequestMod.Request[DeleteQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteQueue(
    params: DeleteQueueRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteQueueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Send an request with an empty body to the regional API endpoint to get your account API endpoint.
    */
  def describeEndpoints(): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Send an request with an empty body to the regional API endpoint to get your account API endpoint.
    */
  def describeEndpoints(params: DescribeEndpointsRequest): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEndpoints(
    params: DescribeEndpointsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes an association between the Amazon Resource Name (ARN) of an AWS Certificate Manager (ACM) certificate and an AWS Elemental MediaConvert resource.
    */
  def disassociateCertificate(): awsDashSdkLib.libRequestMod.Request[DisassociateCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes an association between the Amazon Resource Name (ARN) of an AWS Certificate Manager (ACM) certificate and an AWS Elemental MediaConvert resource.
    */
  def disassociateCertificate(params: DisassociateCertificateRequest): awsDashSdkLib.libRequestMod.Request[DisassociateCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateCertificate(
    params: DisassociateCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve the JSON for a specific completed transcoding job.
    */
  def getJob(): awsDashSdkLib.libRequestMod.Request[GetJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetJobResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve the JSON for a specific completed transcoding job.
    */
  def getJob(params: GetJobRequest): awsDashSdkLib.libRequestMod.Request[GetJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getJob(
    params: GetJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetJobResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve the JSON for a specific job template.
    */
  def getJobTemplate(): awsDashSdkLib.libRequestMod.Request[GetJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getJobTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetJobTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve the JSON for a specific job template.
    */
  def getJobTemplate(params: GetJobTemplateRequest): awsDashSdkLib.libRequestMod.Request[GetJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getJobTemplate(
    params: GetJobTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetJobTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve the JSON for a specific preset.
    */
  def getPreset(): awsDashSdkLib.libRequestMod.Request[GetPresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPreset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPresetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve the JSON for a specific preset.
    */
  def getPreset(params: GetPresetRequest): awsDashSdkLib.libRequestMod.Request[GetPresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPreset(
    params: GetPresetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPresetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve the JSON for a specific queue.
    */
  def getQueue(): awsDashSdkLib.libRequestMod.Request[GetQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getQueue(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetQueueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve the JSON for a specific queue.
    */
  def getQueue(params: GetQueueRequest): awsDashSdkLib.libRequestMod.Request[GetQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getQueue(
    params: GetQueueRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetQueueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve a JSON array of up to twenty of your job templates. This will return the templates themselves, not just a list of them. To retrieve the next twenty templates, use the nextToken string returned with the array
    */
  def listJobTemplates(): awsDashSdkLib.libRequestMod.Request[ListJobTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listJobTemplates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListJobTemplatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListJobTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve a JSON array of up to twenty of your job templates. This will return the templates themselves, not just a list of them. To retrieve the next twenty templates, use the nextToken string returned with the array
    */
  def listJobTemplates(params: ListJobTemplatesRequest): awsDashSdkLib.libRequestMod.Request[ListJobTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listJobTemplates(
    params: ListJobTemplatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListJobTemplatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListJobTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve a JSON array of up to twenty of your most recently created jobs. This array includes in-process, completed, and errored jobs. This will return the jobs themselves, not just a list of the jobs. To retrieve the twenty next most recent jobs, use the nextToken string returned with the array.
    */
  def listJobs(): awsDashSdkLib.libRequestMod.Request[ListJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve a JSON array of up to twenty of your most recently created jobs. This array includes in-process, completed, and errored jobs. This will return the jobs themselves, not just a list of the jobs. To retrieve the twenty next most recent jobs, use the nextToken string returned with the array.
    */
  def listJobs(params: ListJobsRequest): awsDashSdkLib.libRequestMod.Request[ListJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listJobs(
    params: ListJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve a JSON array of up to twenty of your presets. This will return the presets themselves, not just a list of them. To retrieve the next twenty presets, use the nextToken string returned with the array.
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
    * Retrieve a JSON array of up to twenty of your presets. This will return the presets themselves, not just a list of them. To retrieve the next twenty presets, use the nextToken string returned with the array.
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
    * Retrieve a JSON array of up to twenty of your queues. This will return the queues themselves, not just a list of them. To retrieve the next twenty queues, use the nextToken string returned with the array.
    */
  def listQueues(): awsDashSdkLib.libRequestMod.Request[ListQueuesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listQueues(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListQueuesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListQueuesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve a JSON array of up to twenty of your queues. This will return the queues themselves, not just a list of them. To retrieve the next twenty queues, use the nextToken string returned with the array.
    */
  def listQueues(params: ListQueuesRequest): awsDashSdkLib.libRequestMod.Request[ListQueuesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listQueues(
    params: ListQueuesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListQueuesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListQueuesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve the tags for a MediaConvert resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve the tags for a MediaConvert resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Add tags to a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Add tags to a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Remove tags from a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Remove tags from a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modify one of your existing job templates.
    */
  def updateJobTemplate(): awsDashSdkLib.libRequestMod.Request[UpdateJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateJobTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateJobTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modify one of your existing job templates.
    */
  def updateJobTemplate(params: UpdateJobTemplateRequest): awsDashSdkLib.libRequestMod.Request[UpdateJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateJobTemplate(
    params: UpdateJobTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateJobTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modify one of your existing presets.
    */
  def updatePreset(): awsDashSdkLib.libRequestMod.Request[UpdatePresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePreset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdatePresetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdatePresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modify one of your existing presets.
    */
  def updatePreset(params: UpdatePresetRequest): awsDashSdkLib.libRequestMod.Request[UpdatePresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePreset(
    params: UpdatePresetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdatePresetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdatePresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modify one of your existing queues.
    */
  def updateQueue(): awsDashSdkLib.libRequestMod.Request[UpdateQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateQueue(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateQueueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modify one of your existing queues.
    */
  def updateQueue(params: UpdateQueueRequest): awsDashSdkLib.libRequestMod.Request[UpdateQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateQueue(
    params: UpdateQueueRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateQueueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

