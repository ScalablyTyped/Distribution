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
    * Creates an access point and associates it with the specified bucket.
    */
  def createAccessPoint(): Request[js.Object, AWSError] = js.native
  def createAccessPoint(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates an access point and associates it with the specified bucket.
    */
  def createAccessPoint(params: CreateAccessPointRequest): Request[js.Object, AWSError] = js.native
  def createAccessPoint(
    params: CreateAccessPointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
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
    * Deletes the specified access point.
    */
  def deleteAccessPoint(): Request[js.Object, AWSError] = js.native
  def deleteAccessPoint(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified access point.
    */
  def deleteAccessPoint(params: DeleteAccessPointRequest): Request[js.Object, AWSError] = js.native
  def deleteAccessPoint(
    params: DeleteAccessPointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the access point policy for the specified access point.
    */
  def deleteAccessPointPolicy(): Request[js.Object, AWSError] = js.native
  def deleteAccessPointPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the access point policy for the specified access point.
    */
  def deleteAccessPointPolicy(params: DeleteAccessPointPolicyRequest): Request[js.Object, AWSError] = js.native
  def deleteAccessPointPolicy(
    params: DeleteAccessPointPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Removes the PublicAccessBlock configuration for an Amazon Web Services account.
    */
  def deletePublicAccessBlock(): Request[js.Object, AWSError] = js.native
  def deletePublicAccessBlock(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the PublicAccessBlock configuration for an Amazon Web Services account.
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
    * Returns configuration information about the specified access point.
    */
  def getAccessPoint(): Request[GetAccessPointResult, AWSError] = js.native
  def getAccessPoint(callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPointResult, Unit]): Request[GetAccessPointResult, AWSError] = js.native
  /**
    * Returns configuration information about the specified access point.
    */
  def getAccessPoint(params: GetAccessPointRequest): Request[GetAccessPointResult, AWSError] = js.native
  def getAccessPoint(
    params: GetAccessPointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPointResult, Unit]
  ): Request[GetAccessPointResult, AWSError] = js.native
  /**
    * Returns the access point policy associated with the specified access point.
    */
  def getAccessPointPolicy(): Request[GetAccessPointPolicyResult, AWSError] = js.native
  def getAccessPointPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPointPolicyResult, Unit]): Request[GetAccessPointPolicyResult, AWSError] = js.native
  /**
    * Returns the access point policy associated with the specified access point.
    */
  def getAccessPointPolicy(params: GetAccessPointPolicyRequest): Request[GetAccessPointPolicyResult, AWSError] = js.native
  def getAccessPointPolicy(
    params: GetAccessPointPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPointPolicyResult, Unit]
  ): Request[GetAccessPointPolicyResult, AWSError] = js.native
  /**
    * Indicates whether the specified access point currently has a policy that allows public access. For more information about public access through access points, see Managing Data Access with Amazon S3 Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  def getAccessPointPolicyStatus(): Request[GetAccessPointPolicyStatusResult, AWSError] = js.native
  def getAccessPointPolicyStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPointPolicyStatusResult, Unit]): Request[GetAccessPointPolicyStatusResult, AWSError] = js.native
  /**
    * Indicates whether the specified access point currently has a policy that allows public access. For more information about public access through access points, see Managing Data Access with Amazon S3 Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  def getAccessPointPolicyStatus(params: GetAccessPointPolicyStatusRequest): Request[GetAccessPointPolicyStatusResult, AWSError] = js.native
  def getAccessPointPolicyStatus(
    params: GetAccessPointPolicyStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPointPolicyStatusResult, Unit]
  ): Request[GetAccessPointPolicyStatusResult, AWSError] = js.native
  /**
    * Retrieves the PublicAccessBlock configuration for an Amazon Web Services account.
    */
  def getPublicAccessBlock(): Request[GetPublicAccessBlockOutput, AWSError] = js.native
  def getPublicAccessBlock(callback: js.Function2[/* err */ AWSError, /* data */ GetPublicAccessBlockOutput, Unit]): Request[GetPublicAccessBlockOutput, AWSError] = js.native
  /**
    * Retrieves the PublicAccessBlock configuration for an Amazon Web Services account.
    */
  def getPublicAccessBlock(params: GetPublicAccessBlockRequest): Request[GetPublicAccessBlockOutput, AWSError] = js.native
  def getPublicAccessBlock(
    params: GetPublicAccessBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPublicAccessBlockOutput, Unit]
  ): Request[GetPublicAccessBlockOutput, AWSError] = js.native
  /**
    * Returns a list of the access points currently associated with the specified bucket. You can retrieve up to 1000 access points per call. If the specified bucket has more than 1000 access points (or the number specified in maxResults, whichever is less), then the response will include a continuation token that you can use to list the additional access points.
    */
  def listAccessPoints(): Request[ListAccessPointsResult, AWSError] = js.native
  def listAccessPoints(callback: js.Function2[/* err */ AWSError, /* data */ ListAccessPointsResult, Unit]): Request[ListAccessPointsResult, AWSError] = js.native
  /**
    * Returns a list of the access points currently associated with the specified bucket. You can retrieve up to 1000 access points per call. If the specified bucket has more than 1000 access points (or the number specified in maxResults, whichever is less), then the response will include a continuation token that you can use to list the additional access points.
    */
  def listAccessPoints(params: ListAccessPointsRequest): Request[ListAccessPointsResult, AWSError] = js.native
  def listAccessPoints(
    params: ListAccessPointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccessPointsResult, Unit]
  ): Request[ListAccessPointsResult, AWSError] = js.native
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
    * Associates an access policy with the specified access point. Each access point can have only one policy, so a request made to this API replaces any existing policy associated with the specified access point.
    */
  def putAccessPointPolicy(): Request[js.Object, AWSError] = js.native
  def putAccessPointPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Associates an access policy with the specified access point. Each access point can have only one policy, so a request made to this API replaces any existing policy associated with the specified access point.
    */
  def putAccessPointPolicy(params: PutAccessPointPolicyRequest): Request[js.Object, AWSError] = js.native
  def putAccessPointPolicy(
    params: PutAccessPointPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Creates or modifies the PublicAccessBlock configuration for an Amazon Web Services account.
    */
  def putPublicAccessBlock(): Request[js.Object, AWSError] = js.native
  def putPublicAccessBlock(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates or modifies the PublicAccessBlock configuration for an Amazon Web Services account.
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

