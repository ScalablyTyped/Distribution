package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaConvert
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MediaConvert: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ClientConfiguration = js.native
  /**
    * Associates an AWS Certificate Manager (ACM) Amazon Resource Name (ARN) with AWS Elemental MediaConvert.
    */
  def associateCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.AssociateCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.AssociateCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.AssociateCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates an AWS Certificate Manager (ACM) Amazon Resource Name (ARN) with AWS Elemental MediaConvert.
    */
  def associateCertificate(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.AssociateCertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.AssociateCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateCertificate(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.AssociateCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.AssociateCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.AssociateCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Permanently remove a job from a queue. Once you have canceled a job, you can't start it again. You can't delete a running job.
    */
  def cancelJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CancelJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CancelJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CancelJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Permanently remove a job from a queue. Once you have canceled a job, you can't start it again. You can't delete a running job.
    */
  def cancelJob(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CancelJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CancelJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelJob(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CancelJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CancelJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CancelJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create a new transcoding job. For information about jobs and job settings, see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  def createJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreateJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create a new transcoding job. For information about jobs and job settings, see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  def createJob(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreateJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createJob(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreateJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreateJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create a new job template. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  def createJobTemplate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreateJobTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createJobTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreateJobTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreateJobTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create a new job template. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  def createJobTemplate(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreateJobTemplateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreateJobTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createJobTemplate(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreateJobTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreateJobTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreateJobTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create a new preset. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  def createPreset(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreatePresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createPreset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreatePresetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreatePresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create a new preset. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  def createPreset(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreatePresetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreatePresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createPreset(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreatePresetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreatePresetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreatePresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create a new transcoding queue. For information about queues, see Working With Queues in the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html
    */
  def createQueue(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreateQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createQueue(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreateQueueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreateQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create a new transcoding queue. For information about queues, see Working With Queues in the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html
    */
  def createQueue(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreateQueueRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreateQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createQueue(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreateQueueRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreateQueueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.CreateQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Permanently delete a job template you have created.
    */
  def deleteJobTemplate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DeleteJobTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteJobTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DeleteJobTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DeleteJobTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Permanently delete a job template you have created.
    */
  def deleteJobTemplate(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DeleteJobTemplateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DeleteJobTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteJobTemplate(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DeleteJobTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DeleteJobTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DeleteJobTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Permanently delete a preset you have created.
    */
  def deletePreset(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DeletePresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deletePreset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DeletePresetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DeletePresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Permanently delete a preset you have created.
    */
  def deletePreset(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DeletePresetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DeletePresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deletePreset(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DeletePresetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DeletePresetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DeletePresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Permanently delete a queue you have created.
    */
  def deleteQueue(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DeleteQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteQueue(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DeleteQueueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DeleteQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Permanently delete a queue you have created.
    */
  def deleteQueue(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DeleteQueueRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DeleteQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteQueue(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DeleteQueueRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DeleteQueueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DeleteQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Send an request with an empty body to the regional API endpoint to get your account API endpoint.
    */
  def describeEndpoints(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DescribeEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DescribeEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DescribeEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Send an request with an empty body to the regional API endpoint to get your account API endpoint.
    */
  def describeEndpoints(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DescribeEndpointsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DescribeEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEndpoints(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DescribeEndpointsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DescribeEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DescribeEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes an association between the Amazon Resource Name (ARN) of an AWS Certificate Manager (ACM) certificate and an AWS Elemental MediaConvert resource.
    */
  def disassociateCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DisassociateCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DisassociateCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DisassociateCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes an association between the Amazon Resource Name (ARN) of an AWS Certificate Manager (ACM) certificate and an AWS Elemental MediaConvert resource.
    */
  def disassociateCertificate(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DisassociateCertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DisassociateCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateCertificate(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DisassociateCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DisassociateCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.DisassociateCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve the JSON for a specific completed transcoding job.
    */
  def getJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve the JSON for a specific completed transcoding job.
    */
  def getJob(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getJob(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve the JSON for a specific job template.
    */
  def getJobTemplate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetJobTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getJobTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetJobTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetJobTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve the JSON for a specific job template.
    */
  def getJobTemplate(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetJobTemplateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetJobTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getJobTemplate(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetJobTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetJobTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetJobTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve the JSON for a specific preset.
    */
  def getPreset(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetPresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPreset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetPresetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetPresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve the JSON for a specific preset.
    */
  def getPreset(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetPresetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetPresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPreset(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetPresetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetPresetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetPresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve the JSON for a specific queue.
    */
  def getQueue(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getQueue(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetQueueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve the JSON for a specific queue.
    */
  def getQueue(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetQueueRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getQueue(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetQueueRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetQueueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.GetQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve a JSON array of up to twenty of your job templates. This will return the templates themselves, not just a list of them. To retrieve the next twenty templates, use the nextToken string returned with the array
    */
  def listJobTemplates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListJobTemplatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listJobTemplates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListJobTemplatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListJobTemplatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve a JSON array of up to twenty of your job templates. This will return the templates themselves, not just a list of them. To retrieve the next twenty templates, use the nextToken string returned with the array
    */
  def listJobTemplates(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListJobTemplatesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListJobTemplatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listJobTemplates(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListJobTemplatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListJobTemplatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListJobTemplatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve a JSON array of up to twenty of your most recently created jobs. This array includes in-process, completed, and errored jobs. This will return the jobs themselves, not just a list of the jobs. To retrieve the twenty next most recent jobs, use the nextToken string returned with the array.
    */
  def listJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve a JSON array of up to twenty of your most recently created jobs. This array includes in-process, completed, and errored jobs. This will return the jobs themselves, not just a list of the jobs. To retrieve the twenty next most recent jobs, use the nextToken string returned with the array.
    */
  def listJobs(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listJobs(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve a JSON array of up to twenty of your presets. This will return the presets themselves, not just a list of them. To retrieve the next twenty presets, use the nextToken string returned with the array.
    */
  def listPresets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListPresetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPresets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListPresetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListPresetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve a JSON array of up to twenty of your presets. This will return the presets themselves, not just a list of them. To retrieve the next twenty presets, use the nextToken string returned with the array.
    */
  def listPresets(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListPresetsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListPresetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPresets(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListPresetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListPresetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListPresetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve a JSON array of up to twenty of your queues. This will return the queues themselves, not just a list of them. To retrieve the next twenty queues, use the nextToken string returned with the array.
    */
  def listQueues(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListQueuesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listQueues(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListQueuesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListQueuesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve a JSON array of up to twenty of your queues. This will return the queues themselves, not just a list of them. To retrieve the next twenty queues, use the nextToken string returned with the array.
    */
  def listQueues(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListQueuesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListQueuesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listQueues(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListQueuesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListQueuesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListQueuesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve the tags for a MediaConvert resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve the tags for a MediaConvert resource.
    */
  def listTagsForResource(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Add tags to a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Add tags to a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
    */
  def tagResource(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Remove tags from a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Remove tags from a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
    */
  def untagResource(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modify one of your existing job templates.
    */
  def updateJobTemplate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UpdateJobTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateJobTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UpdateJobTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UpdateJobTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modify one of your existing job templates.
    */
  def updateJobTemplate(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UpdateJobTemplateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UpdateJobTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateJobTemplate(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UpdateJobTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UpdateJobTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UpdateJobTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modify one of your existing presets.
    */
  def updatePreset(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UpdatePresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updatePreset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UpdatePresetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UpdatePresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modify one of your existing presets.
    */
  def updatePreset(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UpdatePresetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UpdatePresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updatePreset(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UpdatePresetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UpdatePresetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UpdatePresetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modify one of your existing queues.
    */
  def updateQueue(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UpdateQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateQueue(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UpdateQueueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UpdateQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modify one of your existing queues.
    */
  def updateQueue(params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UpdateQueueRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UpdateQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateQueue(
    params: awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UpdateQueueRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UpdateQueueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconvertMod.MediaConvertNs.UpdateQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

