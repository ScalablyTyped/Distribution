package typings.awsDashSdk.clientsSignerMod

import typings.awsDashSdk.Anon_Waiter
import typings.awsDashSdk.awsDashSdkStrings.successfulSigningJob
import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Signer extends Service {
  @JSName("config")
  var config_Signer: ConfigBase with ClientConfiguration = js.native
  /**
    * Changes the state of an ACTIVE signing profile to CANCELED. A canceled profile is still viewable with the ListSigningProfiles operation, but it cannot perform new signing jobs, and is deleted two years after cancelation.
    */
  def cancelSigningProfile(): Request[js.Object, AWSError] = js.native
  def cancelSigningProfile(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Changes the state of an ACTIVE signing profile to CANCELED. A canceled profile is still viewable with the ListSigningProfiles operation, but it cannot perform new signing jobs, and is deleted two years after cancelation.
    */
  def cancelSigningProfile(params: CancelSigningProfileRequest): Request[js.Object, AWSError] = js.native
  def cancelSigningProfile(
    params: CancelSigningProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Returns information about a specific code signing job. You specify the job by using the jobId value that is returned by the StartSigningJob operation. 
    */
  def describeSigningJob(): Request[DescribeSigningJobResponse, AWSError] = js.native
  def describeSigningJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSigningJobResponse, Unit]): Request[DescribeSigningJobResponse, AWSError] = js.native
  /**
    * Returns information about a specific code signing job. You specify the job by using the jobId value that is returned by the StartSigningJob operation. 
    */
  def describeSigningJob(params: DescribeSigningJobRequest): Request[DescribeSigningJobResponse, AWSError] = js.native
  def describeSigningJob(
    params: DescribeSigningJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSigningJobResponse, Unit]
  ): Request[DescribeSigningJobResponse, AWSError] = js.native
  /**
    * Returns information on a specific signing platform.
    */
  def getSigningPlatform(): Request[GetSigningPlatformResponse, AWSError] = js.native
  def getSigningPlatform(callback: js.Function2[/* err */ AWSError, /* data */ GetSigningPlatformResponse, Unit]): Request[GetSigningPlatformResponse, AWSError] = js.native
  /**
    * Returns information on a specific signing platform.
    */
  def getSigningPlatform(params: GetSigningPlatformRequest): Request[GetSigningPlatformResponse, AWSError] = js.native
  def getSigningPlatform(
    params: GetSigningPlatformRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSigningPlatformResponse, Unit]
  ): Request[GetSigningPlatformResponse, AWSError] = js.native
  /**
    * Returns information on a specific signing profile.
    */
  def getSigningProfile(): Request[GetSigningProfileResponse, AWSError] = js.native
  def getSigningProfile(callback: js.Function2[/* err */ AWSError, /* data */ GetSigningProfileResponse, Unit]): Request[GetSigningProfileResponse, AWSError] = js.native
  /**
    * Returns information on a specific signing profile.
    */
  def getSigningProfile(params: GetSigningProfileRequest): Request[GetSigningProfileResponse, AWSError] = js.native
  def getSigningProfile(
    params: GetSigningProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSigningProfileResponse, Unit]
  ): Request[GetSigningProfileResponse, AWSError] = js.native
  /**
    * Lists all your signing jobs. You can use the maxResults parameter to limit the number of signing jobs that are returned in the response. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned. 
    */
  def listSigningJobs(): Request[ListSigningJobsResponse, AWSError] = js.native
  def listSigningJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListSigningJobsResponse, Unit]): Request[ListSigningJobsResponse, AWSError] = js.native
  /**
    * Lists all your signing jobs. You can use the maxResults parameter to limit the number of signing jobs that are returned in the response. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned. 
    */
  def listSigningJobs(params: ListSigningJobsRequest): Request[ListSigningJobsResponse, AWSError] = js.native
  def listSigningJobs(
    params: ListSigningJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSigningJobsResponse, Unit]
  ): Request[ListSigningJobsResponse, AWSError] = js.native
  /**
    * Lists all signing platforms available in AWS Signer that match the request parameters. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned.
    */
  def listSigningPlatforms(): Request[ListSigningPlatformsResponse, AWSError] = js.native
  def listSigningPlatforms(callback: js.Function2[/* err */ AWSError, /* data */ ListSigningPlatformsResponse, Unit]): Request[ListSigningPlatformsResponse, AWSError] = js.native
  /**
    * Lists all signing platforms available in AWS Signer that match the request parameters. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned.
    */
  def listSigningPlatforms(params: ListSigningPlatformsRequest): Request[ListSigningPlatformsResponse, AWSError] = js.native
  def listSigningPlatforms(
    params: ListSigningPlatformsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSigningPlatformsResponse, Unit]
  ): Request[ListSigningPlatformsResponse, AWSError] = js.native
  /**
    * Lists all available signing profiles in your AWS account. Returns only profiles with an ACTIVE status unless the includeCanceled request field is set to true. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned.
    */
  def listSigningProfiles(): Request[ListSigningProfilesResponse, AWSError] = js.native
  def listSigningProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ListSigningProfilesResponse, Unit]): Request[ListSigningProfilesResponse, AWSError] = js.native
  /**
    * Lists all available signing profiles in your AWS account. Returns only profiles with an ACTIVE status unless the includeCanceled request field is set to true. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned.
    */
  def listSigningProfiles(params: ListSigningProfilesRequest): Request[ListSigningProfilesResponse, AWSError] = js.native
  def listSigningProfiles(
    params: ListSigningProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSigningProfilesResponse, Unit]
  ): Request[ListSigningProfilesResponse, AWSError] = js.native
  /**
    * Creates a signing profile. A signing profile is an AWS Signer template that can be used to carry out a pre-defined signing job. For more information, see http://docs.aws.amazon.com/signer/latest/developerguide/gs-profile.html 
    */
  def putSigningProfile(): Request[PutSigningProfileResponse, AWSError] = js.native
  def putSigningProfile(callback: js.Function2[/* err */ AWSError, /* data */ PutSigningProfileResponse, Unit]): Request[PutSigningProfileResponse, AWSError] = js.native
  /**
    * Creates a signing profile. A signing profile is an AWS Signer template that can be used to carry out a pre-defined signing job. For more information, see http://docs.aws.amazon.com/signer/latest/developerguide/gs-profile.html 
    */
  def putSigningProfile(params: PutSigningProfileRequest): Request[PutSigningProfileResponse, AWSError] = js.native
  def putSigningProfile(
    params: PutSigningProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutSigningProfileResponse, Unit]
  ): Request[PutSigningProfileResponse, AWSError] = js.native
  /**
    * Initiates a signing job to be performed on the code provided. Signing jobs are viewable by the ListSigningJobs operation for two years after they are performed. Note the following requirements:     You must create an Amazon S3 source bucket. For more information, see Create a Bucket in the Amazon S3 Getting Started Guide.    Your S3 source bucket must be version enabled.   You must create an S3 destination bucket. AWS Signer uses your S3 destination bucket to write your signed code.   You specify the name of the source and destination buckets when calling the StartSigningJob operation.   You must also specify a request token that identifies your request to AWS Signer.    You can call the DescribeSigningJob and the ListSigningJobs actions after you call StartSigningJob. For a Java example that shows how to use this action, see http://docs.aws.amazon.com/acm/latest/userguide/ 
    */
  def startSigningJob(): Request[StartSigningJobResponse, AWSError] = js.native
  def startSigningJob(callback: js.Function2[/* err */ AWSError, /* data */ StartSigningJobResponse, Unit]): Request[StartSigningJobResponse, AWSError] = js.native
  /**
    * Initiates a signing job to be performed on the code provided. Signing jobs are viewable by the ListSigningJobs operation for two years after they are performed. Note the following requirements:     You must create an Amazon S3 source bucket. For more information, see Create a Bucket in the Amazon S3 Getting Started Guide.    Your S3 source bucket must be version enabled.   You must create an S3 destination bucket. AWS Signer uses your S3 destination bucket to write your signed code.   You specify the name of the source and destination buckets when calling the StartSigningJob operation.   You must also specify a request token that identifies your request to AWS Signer.    You can call the DescribeSigningJob and the ListSigningJobs actions after you call StartSigningJob. For a Java example that shows how to use this action, see http://docs.aws.amazon.com/acm/latest/userguide/ 
    */
  def startSigningJob(params: StartSigningJobRequest): Request[StartSigningJobResponse, AWSError] = js.native
  def startSigningJob(
    params: StartSigningJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartSigningJobResponse, Unit]
  ): Request[StartSigningJobResponse, AWSError] = js.native
  /**
    * Waits for the successfulSigningJob state by periodically calling the underlying Signer.describeSigningJoboperation every 20 seconds (at most 25 times).
    */
  @JSName("waitFor")
  def waitFor_successfulSigningJob(state: successfulSigningJob): Request[DescribeSigningJobResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_successfulSigningJob(
    state: successfulSigningJob,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSigningJobResponse, Unit]
  ): Request[DescribeSigningJobResponse, AWSError] = js.native
  /**
    * Waits for the successfulSigningJob state by periodically calling the underlying Signer.describeSigningJoboperation every 20 seconds (at most 25 times).
    */
  @JSName("waitFor")
  def waitFor_successfulSigningJob(state: successfulSigningJob, params: DescribeSigningJobRequest with Anon_Waiter): Request[DescribeSigningJobResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_successfulSigningJob(
    state: successfulSigningJob,
    params: DescribeSigningJobRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSigningJobResponse, Unit]
  ): Request[DescribeSigningJobResponse, AWSError] = js.native
}

