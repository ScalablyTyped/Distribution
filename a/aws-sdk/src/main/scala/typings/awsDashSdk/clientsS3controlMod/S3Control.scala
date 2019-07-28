package typings.awsDashSdk.clientsS3controlMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Control extends Service {
  @JSName("config")
  var config_S3Control: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates an Amazon S3 batch operations job.
    */
  def createJob(): Request[CreateJobResult, AWSError] = js.native
  def createJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateJobResult, Unit]): Request[CreateJobResult, AWSError] = js.native
  /**
    * Creates an Amazon S3 batch operations job.
    */
  def createJob(params: CreateJobRequest): Request[CreateJobResult, AWSError] = js.native
  def createJob(
    params: CreateJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateJobResult, Unit]
  ): Request[CreateJobResult, AWSError] = js.native
  /**
    * Deletes the block public access configuration for the specified account.
    */
  def deletePublicAccessBlock(): Request[js.Object, AWSError] = js.native
  def deletePublicAccessBlock(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the block public access configuration for the specified account.
    */
  def deletePublicAccessBlock(params: DeletePublicAccessBlockRequest): Request[js.Object, AWSError] = js.native
  def deletePublicAccessBlock(
    params: DeletePublicAccessBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Retrieves the configuration parameters and status for a batch operations job.
    */
  def describeJob(): Request[DescribeJobResult, AWSError] = js.native
  def describeJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobResult, Unit]): Request[DescribeJobResult, AWSError] = js.native
  /**
    * Retrieves the configuration parameters and status for a batch operations job.
    */
  def describeJob(params: DescribeJobRequest): Request[DescribeJobResult, AWSError] = js.native
  def describeJob(
    params: DescribeJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobResult, Unit]
  ): Request[DescribeJobResult, AWSError] = js.native
  /**
    * 
    */
  def getPublicAccessBlock(): Request[GetPublicAccessBlockOutput, AWSError] = js.native
  def getPublicAccessBlock(callback: js.Function2[/* err */ AWSError, /* data */ GetPublicAccessBlockOutput, Unit]): Request[GetPublicAccessBlockOutput, AWSError] = js.native
  /**
    * 
    */
  def getPublicAccessBlock(params: GetPublicAccessBlockRequest): Request[GetPublicAccessBlockOutput, AWSError] = js.native
  def getPublicAccessBlock(
    params: GetPublicAccessBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPublicAccessBlockOutput, Unit]
  ): Request[GetPublicAccessBlockOutput, AWSError] = js.native
  /**
    * Lists current jobs and jobs that have ended within the last 30 days for the AWS account making the request.
    */
  def listJobs(): Request[ListJobsResult, AWSError] = js.native
  def listJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResult, Unit]): Request[ListJobsResult, AWSError] = js.native
  /**
    * Lists current jobs and jobs that have ended within the last 30 days for the AWS account making the request.
    */
  def listJobs(params: ListJobsRequest): Request[ListJobsResult, AWSError] = js.native
  def listJobs(
    params: ListJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResult, Unit]
  ): Request[ListJobsResult, AWSError] = js.native
  /**
    * 
    */
  def putPublicAccessBlock(): Request[js.Object, AWSError] = js.native
  def putPublicAccessBlock(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * 
    */
  def putPublicAccessBlock(params: PutPublicAccessBlockRequest): Request[js.Object, AWSError] = js.native
  def putPublicAccessBlock(
    params: PutPublicAccessBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Updates an existing job's priority.
    */
  def updateJobPriority(): Request[UpdateJobPriorityResult, AWSError] = js.native
  def updateJobPriority(callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobPriorityResult, Unit]): Request[UpdateJobPriorityResult, AWSError] = js.native
  /**
    * Updates an existing job's priority.
    */
  def updateJobPriority(params: UpdateJobPriorityRequest): Request[UpdateJobPriorityResult, AWSError] = js.native
  def updateJobPriority(
    params: UpdateJobPriorityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobPriorityResult, Unit]
  ): Request[UpdateJobPriorityResult, AWSError] = js.native
  /**
    * Updates the status for the specified job. Use this operation to confirm that you want to run a job or to cancel an existing job.
    */
  def updateJobStatus(): Request[UpdateJobStatusResult, AWSError] = js.native
  def updateJobStatus(callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobStatusResult, Unit]): Request[UpdateJobStatusResult, AWSError] = js.native
  /**
    * Updates the status for the specified job. Use this operation to confirm that you want to run a job or to cancel an existing job.
    */
  def updateJobStatus(params: UpdateJobStatusRequest): Request[UpdateJobStatusResult, AWSError] = js.native
  def updateJobStatus(
    params: UpdateJobStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobStatusResult, Unit]
  ): Request[UpdateJobStatusResult, AWSError] = js.native
}

