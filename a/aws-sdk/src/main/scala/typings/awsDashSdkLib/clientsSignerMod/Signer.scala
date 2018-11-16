package typings
package awsDashSdkLib.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Signer
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Signer: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsSignerMod.SignerNs.ClientConfiguration = js.native
  /**
     * Changes the state of an ACTIVE signing profile to CANCELED. A canceled profile is still viewable with the ListSigningProfiles operation, but it cannot perform new signing jobs, and is deleted two years after cancelation.
     */
  def cancelSigningProfile(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the state of an ACTIVE signing profile to CANCELED. A canceled profile is still viewable with the ListSigningProfiles operation, but it cannot perform new signing jobs, and is deleted two years after cancelation.
     */
  def cancelSigningProfile(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the state of an ACTIVE signing profile to CANCELED. A canceled profile is still viewable with the ListSigningProfiles operation, but it cannot perform new signing jobs, and is deleted two years after cancelation.
     */
  def cancelSigningProfile(params: awsDashSdkLib.clientsSignerMod.SignerNs.CancelSigningProfileRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the state of an ACTIVE signing profile to CANCELED. A canceled profile is still viewable with the ListSigningProfiles operation, but it cannot perform new signing jobs, and is deleted two years after cancelation.
     */
  def cancelSigningProfile(
    params: awsDashSdkLib.clientsSignerMod.SignerNs.CancelSigningProfileRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Returns information about a specific code signing job. You specify the job by using the jobId value that is returned by the StartSigningJob operation. 
     */
  def describeSigningJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.DescribeSigningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a specific code signing job. You specify the job by using the jobId value that is returned by the StartSigningJob operation. 
     */
  def describeSigningJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSignerMod.SignerNs.DescribeSigningJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.DescribeSigningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a specific code signing job. You specify the job by using the jobId value that is returned by the StartSigningJob operation. 
     */
  def describeSigningJob(params: awsDashSdkLib.clientsSignerMod.SignerNs.DescribeSigningJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.DescribeSigningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a specific code signing job. You specify the job by using the jobId value that is returned by the StartSigningJob operation. 
     */
  def describeSigningJob(
    params: awsDashSdkLib.clientsSignerMod.SignerNs.DescribeSigningJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSignerMod.SignerNs.DescribeSigningJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.DescribeSigningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information on a specific signing platform.
     */
  def getSigningPlatform(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.GetSigningPlatformResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information on a specific signing platform.
     */
  def getSigningPlatform(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSignerMod.SignerNs.GetSigningPlatformResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.GetSigningPlatformResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information on a specific signing platform.
     */
  def getSigningPlatform(params: awsDashSdkLib.clientsSignerMod.SignerNs.GetSigningPlatformRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.GetSigningPlatformResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information on a specific signing platform.
     */
  def getSigningPlatform(
    params: awsDashSdkLib.clientsSignerMod.SignerNs.GetSigningPlatformRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSignerMod.SignerNs.GetSigningPlatformResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.GetSigningPlatformResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information on a specific signing profile.
     */
  def getSigningProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.GetSigningProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information on a specific signing profile.
     */
  def getSigningProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSignerMod.SignerNs.GetSigningProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.GetSigningProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information on a specific signing profile.
     */
  def getSigningProfile(params: awsDashSdkLib.clientsSignerMod.SignerNs.GetSigningProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.GetSigningProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information on a specific signing profile.
     */
  def getSigningProfile(
    params: awsDashSdkLib.clientsSignerMod.SignerNs.GetSigningProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSignerMod.SignerNs.GetSigningProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.GetSigningProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all your signing jobs. You can use the maxResults parameter to limit the number of signing jobs that are returned in the response. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned. 
     */
  def listSigningJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.ListSigningJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all your signing jobs. You can use the maxResults parameter to limit the number of signing jobs that are returned in the response. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned. 
     */
  def listSigningJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSignerMod.SignerNs.ListSigningJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.ListSigningJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all your signing jobs. You can use the maxResults parameter to limit the number of signing jobs that are returned in the response. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned. 
     */
  def listSigningJobs(params: awsDashSdkLib.clientsSignerMod.SignerNs.ListSigningJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.ListSigningJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all your signing jobs. You can use the maxResults parameter to limit the number of signing jobs that are returned in the response. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned. 
     */
  def listSigningJobs(
    params: awsDashSdkLib.clientsSignerMod.SignerNs.ListSigningJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSignerMod.SignerNs.ListSigningJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.ListSigningJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all signing platforms available in AWS Signer that match the request parameters. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned.
     */
  def listSigningPlatforms(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.ListSigningPlatformsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all signing platforms available in AWS Signer that match the request parameters. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned.
     */
  def listSigningPlatforms(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSignerMod.SignerNs.ListSigningPlatformsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.ListSigningPlatformsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all signing platforms available in AWS Signer that match the request parameters. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned.
     */
  def listSigningPlatforms(params: awsDashSdkLib.clientsSignerMod.SignerNs.ListSigningPlatformsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.ListSigningPlatformsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all signing platforms available in AWS Signer that match the request parameters. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned.
     */
  def listSigningPlatforms(
    params: awsDashSdkLib.clientsSignerMod.SignerNs.ListSigningPlatformsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSignerMod.SignerNs.ListSigningPlatformsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.ListSigningPlatformsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all available signing profiles in your AWS account. Returns only profiles with an ACTIVE status unless the includeCanceled request field is set to true. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned.
     */
  def listSigningProfiles(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.ListSigningProfilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all available signing profiles in your AWS account. Returns only profiles with an ACTIVE status unless the includeCanceled request field is set to true. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned.
     */
  def listSigningProfiles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSignerMod.SignerNs.ListSigningProfilesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.ListSigningProfilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all available signing profiles in your AWS account. Returns only profiles with an ACTIVE status unless the includeCanceled request field is set to true. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned.
     */
  def listSigningProfiles(params: awsDashSdkLib.clientsSignerMod.SignerNs.ListSigningProfilesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.ListSigningProfilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all available signing profiles in your AWS account. Returns only profiles with an ACTIVE status unless the includeCanceled request field is set to true. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned.
     */
  def listSigningProfiles(
    params: awsDashSdkLib.clientsSignerMod.SignerNs.ListSigningProfilesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSignerMod.SignerNs.ListSigningProfilesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.ListSigningProfilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a signing profile. A signing profile is an AWS Signer template that can be used to carry out a pre-defined signing job. For more information, see http://docs.aws.amazon.com/signer/latest/developerguide/gs-profile.html 
     */
  def putSigningProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.PutSigningProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a signing profile. A signing profile is an AWS Signer template that can be used to carry out a pre-defined signing job. For more information, see http://docs.aws.amazon.com/signer/latest/developerguide/gs-profile.html 
     */
  def putSigningProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSignerMod.SignerNs.PutSigningProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.PutSigningProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a signing profile. A signing profile is an AWS Signer template that can be used to carry out a pre-defined signing job. For more information, see http://docs.aws.amazon.com/signer/latest/developerguide/gs-profile.html 
     */
  def putSigningProfile(params: awsDashSdkLib.clientsSignerMod.SignerNs.PutSigningProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.PutSigningProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a signing profile. A signing profile is an AWS Signer template that can be used to carry out a pre-defined signing job. For more information, see http://docs.aws.amazon.com/signer/latest/developerguide/gs-profile.html 
     */
  def putSigningProfile(
    params: awsDashSdkLib.clientsSignerMod.SignerNs.PutSigningProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSignerMod.SignerNs.PutSigningProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.PutSigningProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Initiates a signing job to be performed on the code provided. Signing jobs are viewable by the ListSigningJobs operation for two years after they are performed. Note the following requirements:     You must create an Amazon S3 source bucket. For more information, see Create a Bucket in the Amazon S3 Getting Started Guide.    Your S3 source bucket must be version enabled.   You must create an S3 destination bucket. AWS Signer uses your S3 destination bucket to write your signed code.   You specify the name of the source and destination buckets when calling the StartSigningJob operation.   You must also specify a request token that identifies your request to AWS Signer.    You can call the DescribeSigningJob and the ListSigningJobs actions after you call StartSigningJob. For a Java example that shows how to use this action, see http://docs.aws.amazon.com/acm/latest/userguide/ 
     */
  def startSigningJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.StartSigningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Initiates a signing job to be performed on the code provided. Signing jobs are viewable by the ListSigningJobs operation for two years after they are performed. Note the following requirements:     You must create an Amazon S3 source bucket. For more information, see Create a Bucket in the Amazon S3 Getting Started Guide.    Your S3 source bucket must be version enabled.   You must create an S3 destination bucket. AWS Signer uses your S3 destination bucket to write your signed code.   You specify the name of the source and destination buckets when calling the StartSigningJob operation.   You must also specify a request token that identifies your request to AWS Signer.    You can call the DescribeSigningJob and the ListSigningJobs actions after you call StartSigningJob. For a Java example that shows how to use this action, see http://docs.aws.amazon.com/acm/latest/userguide/ 
     */
  def startSigningJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSignerMod.SignerNs.StartSigningJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.StartSigningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Initiates a signing job to be performed on the code provided. Signing jobs are viewable by the ListSigningJobs operation for two years after they are performed. Note the following requirements:     You must create an Amazon S3 source bucket. For more information, see Create a Bucket in the Amazon S3 Getting Started Guide.    Your S3 source bucket must be version enabled.   You must create an S3 destination bucket. AWS Signer uses your S3 destination bucket to write your signed code.   You specify the name of the source and destination buckets when calling the StartSigningJob operation.   You must also specify a request token that identifies your request to AWS Signer.    You can call the DescribeSigningJob and the ListSigningJobs actions after you call StartSigningJob. For a Java example that shows how to use this action, see http://docs.aws.amazon.com/acm/latest/userguide/ 
     */
  def startSigningJob(params: awsDashSdkLib.clientsSignerMod.SignerNs.StartSigningJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.StartSigningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Initiates a signing job to be performed on the code provided. Signing jobs are viewable by the ListSigningJobs operation for two years after they are performed. Note the following requirements:     You must create an Amazon S3 source bucket. For more information, see Create a Bucket in the Amazon S3 Getting Started Guide.    Your S3 source bucket must be version enabled.   You must create an S3 destination bucket. AWS Signer uses your S3 destination bucket to write your signed code.   You specify the name of the source and destination buckets when calling the StartSigningJob operation.   You must also specify a request token that identifies your request to AWS Signer.    You can call the DescribeSigningJob and the ListSigningJobs actions after you call StartSigningJob. For a Java example that shows how to use this action, see http://docs.aws.amazon.com/acm/latest/userguide/ 
     */
  def startSigningJob(
    params: awsDashSdkLib.clientsSignerMod.SignerNs.StartSigningJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSignerMod.SignerNs.StartSigningJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.StartSigningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the successfulSigningJob state by periodically calling the underlying Signer.describeSigningJoboperation every 20 seconds (at most 25 times).
     */
  @JSName("waitFor")
  def waitFor_successfulSigningJob(state: awsDashSdkLib.awsDashSdkLibStrings.successfulSigningJob): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.DescribeSigningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the successfulSigningJob state by periodically calling the underlying Signer.describeSigningJoboperation every 20 seconds (at most 25 times).
     */
  @JSName("waitFor")
  def waitFor_successfulSigningJob(
    state: awsDashSdkLib.awsDashSdkLibStrings.successfulSigningJob,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSignerMod.SignerNs.DescribeSigningJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.DescribeSigningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the successfulSigningJob state by periodically calling the underlying Signer.describeSigningJoboperation every 20 seconds (at most 25 times).
     */
  @JSName("waitFor")
  def waitFor_successfulSigningJob(
    state: awsDashSdkLib.awsDashSdkLibStrings.successfulSigningJob,
    params: awsDashSdkLib.clientsSignerMod.SignerNs.DescribeSigningJobRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.DescribeSigningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the successfulSigningJob state by periodically calling the underlying Signer.describeSigningJoboperation every 20 seconds (at most 25 times).
     */
  @JSName("waitFor")
  def waitFor_successfulSigningJob(
    state: awsDashSdkLib.awsDashSdkLibStrings.successfulSigningJob,
    params: awsDashSdkLib.clientsSignerMod.SignerNs.DescribeSigningJobRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSignerMod.SignerNs.DescribeSigningJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSignerMod.SignerNs.DescribeSigningJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

