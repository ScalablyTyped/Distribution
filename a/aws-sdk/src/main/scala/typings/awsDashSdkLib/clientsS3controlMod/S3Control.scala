package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Control
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_S3Control: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Creates an Amazon S3 batch operations job.
    */
  def createJob(): awsDashSdkLib.libRequestMod.Request[CreateJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ CreateJobResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[CreateJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an Amazon S3 batch operations job.
    */
  def createJob(params: CreateJobRequest): awsDashSdkLib.libRequestMod.Request[CreateJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createJob(
    params: CreateJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ CreateJobResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[CreateJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the block public access configuration for the specified account.
    */
  def deletePublicAccessBlock(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePublicAccessBlock(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the block public access configuration for the specified account.
    */
  def deletePublicAccessBlock(params: DeletePublicAccessBlockRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePublicAccessBlock(
    params: DeletePublicAccessBlockRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the configuration parameters and status for a batch operations job.
    */
  def describeJob(): awsDashSdkLib.libRequestMod.Request[DescribeJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeJobResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the configuration parameters and status for a batch operations job.
    */
  def describeJob(params: DescribeJobRequest): awsDashSdkLib.libRequestMod.Request[DescribeJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeJob(
    params: DescribeJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeJobResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def getPublicAccessBlock(): awsDashSdkLib.libRequestMod.Request[GetPublicAccessBlockOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPublicAccessBlock(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPublicAccessBlockOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPublicAccessBlockOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def getPublicAccessBlock(params: GetPublicAccessBlockRequest): awsDashSdkLib.libRequestMod.Request[GetPublicAccessBlockOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPublicAccessBlock(
    params: GetPublicAccessBlockRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPublicAccessBlockOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPublicAccessBlockOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists current jobs and jobs that have ended within the last 30 days for the AWS account making the request.
    */
  def listJobs(): awsDashSdkLib.libRequestMod.Request[ListJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listJobs(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListJobsResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ListJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists current jobs and jobs that have ended within the last 30 days for the AWS account making the request.
    */
  def listJobs(params: ListJobsRequest): awsDashSdkLib.libRequestMod.Request[ListJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listJobs(
    params: ListJobsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListJobsResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ListJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def putPublicAccessBlock(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putPublicAccessBlock(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def putPublicAccessBlock(params: PutPublicAccessBlockRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putPublicAccessBlock(
    params: PutPublicAccessBlockRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing job's priority.
    */
  def updateJobPriority(): awsDashSdkLib.libRequestMod.Request[UpdateJobPriorityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateJobPriority(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateJobPriorityResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateJobPriorityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing job's priority.
    */
  def updateJobPriority(params: UpdateJobPriorityRequest): awsDashSdkLib.libRequestMod.Request[UpdateJobPriorityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateJobPriority(
    params: UpdateJobPriorityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateJobPriorityResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateJobPriorityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the status for the specified job. Use this operation to confirm that you want to run a job or to cancel an existing job.
    */
  def updateJobStatus(): awsDashSdkLib.libRequestMod.Request[UpdateJobStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateJobStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateJobStatusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateJobStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the status for the specified job. Use this operation to confirm that you want to run a job or to cancel an existing job.
    */
  def updateJobStatus(params: UpdateJobStatusRequest): awsDashSdkLib.libRequestMod.Request[UpdateJobStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateJobStatus(
    params: UpdateJobStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateJobStatusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateJobStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

