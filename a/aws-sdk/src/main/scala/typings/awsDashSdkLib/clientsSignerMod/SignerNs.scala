package typings
package awsDashSdkLib.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/signer", "Signer")
@js.native
object SignerNs extends js.Object {
  
  trait CancelSigningProfileRequest extends js.Object {
    /**
         * The name of the signing profile to be canceled.
         */
    var profileName: ProfileName
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait DescribeSigningJobRequest extends js.Object {
    /**
         * The ID of the signing job on input.
         */
    var jobId: JobId
  }
  
  
  trait DescribeSigningJobResponse extends js.Object {
    /**
         * Date and time that the signing job was completed.
         */
    var completedAt: js.UndefOr[CompletedAt] = js.undefined
    /**
         * Date and time that the signing job was created.
         */
    var createdAt: js.UndefOr[CreatedAt] = js.undefined
    /**
         * The ID of the signing job on output.
         */
    var jobId: js.UndefOr[JobId] = js.undefined
    /**
         * A list of any overrides that were applied to the signing operation.
         */
    var overrides: js.UndefOr[SigningPlatformOverrides] = js.undefined
    /**
         * The microcontroller platform to which your signed code image will be distributed.
         */
    var platformId: js.UndefOr[PlatformId] = js.undefined
    /**
         * The name of the profile that initiated the signing operation.
         */
    var profileName: js.UndefOr[ProfileName] = js.undefined
    /**
         * The IAM principal that requested the signing job.
         */
    var requestedBy: js.UndefOr[RequestedBy] = js.undefined
    /**
         * Name of the S3 bucket where the signed code image is saved by AWS Signer.
         */
    var signedObject: js.UndefOr[SignedObject] = js.undefined
    /**
         * Amazon Resource Name (ARN) of your code signing certificate.
         */
    var signingMaterial: js.UndefOr[SigningMaterial] = js.undefined
    /**
         * Map of user-assigned key-value pairs used during signing. These values contain any information that you specified for use in your signing job. 
         */
    var signingParameters: js.UndefOr[SigningParameters] = js.undefined
    /**
         * The object that contains the name of your S3 bucket or your raw code.
         */
    var source: js.UndefOr[Source] = js.undefined
    /**
         * Status of the signing job.
         */
    var status: js.UndefOr[SigningStatus] = js.undefined
    /**
         * String value that contains the status reason.
         */
    var statusReason: js.UndefOr[StatusReason] = js.undefined
  }
  
  
  trait Destination extends js.Object {
    /**
         * The S3Destination object.
         */
    var s3: js.UndefOr[S3Destination] = js.undefined
  }
  
  
  trait EncryptionAlgorithmOptions extends js.Object {
    /**
         * The set of accepted encryption algorithms that are allowed in an AWS Signer job.
         */
    var allowedValues: EncryptionAlgorithms
    /**
         * The default encryption algorithm that is used by an AWS Signer job.
         */
    var defaultValue: EncryptionAlgorithm
  }
  
  
  trait GetSigningPlatformRequest extends js.Object {
    /**
         * The ID of the target signing platform.
         */
    var platformId: PlatformId
  }
  
  
  trait GetSigningPlatformResponse extends js.Object {
    /**
         * The category type of the target signing platform.
         */
    var category: js.UndefOr[Category] = js.undefined
    /**
         * The display name of the target signing platform.
         */
    var displayName: js.UndefOr[DisplayName] = js.undefined
    /**
         * The maximum size (in MB) of the payload that can be signed by the target platform.
         */
    var maxSizeInMB: js.UndefOr[MaxSizeInMB] = js.undefined
    /**
         * A list of partner entities that use the target signing platform.
         */
    var partner: js.UndefOr[String] = js.undefined
    /**
         * The ID of the target signing platform.
         */
    var platformId: js.UndefOr[PlatformId] = js.undefined
    /**
         * A list of configurations applied to the target platform at signing.
         */
    var signingConfiguration: js.UndefOr[SigningConfiguration] = js.undefined
    /**
         * The format of the target platform's signing image.
         */
    var signingImageFormat: js.UndefOr[SigningImageFormat] = js.undefined
    /**
         * The validation template that is used by the target signing platform.
         */
    var target: js.UndefOr[String] = js.undefined
  }
  
  
  trait GetSigningProfileRequest extends js.Object {
    /**
         * The name of the target signing profile.
         */
    var profileName: ProfileName
  }
  
  
  trait GetSigningProfileResponse extends js.Object {
    /**
         * A list of overrides applied by the target signing profile for signing operations.
         */
    var overrides: js.UndefOr[SigningPlatformOverrides] = js.undefined
    /**
         * The ID of the platform that is used by the target signing profile.
         */
    var platformId: js.UndefOr[PlatformId] = js.undefined
    /**
         * The name of the target signing profile.
         */
    var profileName: js.UndefOr[ProfileName] = js.undefined
    /**
         * The ARN of the certificate that the target profile uses for signing operations.
         */
    var signingMaterial: js.UndefOr[SigningMaterial] = js.undefined
    /**
         * A map of key-value pairs for signing operations that is attached to the target signing profile.
         */
    var signingParameters: js.UndefOr[SigningParameters] = js.undefined
    /**
         * The status of the target signing profile.
         */
    var status: js.UndefOr[SigningProfileStatus] = js.undefined
  }
  
  
  trait HashAlgorithmOptions extends js.Object {
    /**
         * The set of accepted hash algorithms allowed in an AWS Signer job.
         */
    var allowedValues: HashAlgorithms
    /**
         * The default hash algorithm that is used in an AWS Signer job.
         */
    var defaultValue: HashAlgorithm
  }
  
  
  trait ListSigningJobsRequest extends js.Object {
    /**
         * Specifies the maximum number of items to return in the response. Use this parameter when paginating results. If additional items exist beyond the number you specify, the nextToken element is set in the response. Use the nextToken value in a subsequent request to retrieve additional items. 
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * String for specifying the next set of paginated results to return. After you receive a response with truncated results, use this parameter in a subsequent request. Set it to the value of nextToken from the response that you just received.
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The ID of microcontroller platform that you specified for the distribution of your code image.
         */
    var platformId: js.UndefOr[PlatformId] = js.undefined
    /**
         * The IAM principal that requested the signing job.
         */
    var requestedBy: js.UndefOr[RequestedBy] = js.undefined
    /**
         * A status value with which to filter your results.
         */
    var status: js.UndefOr[SigningStatus] = js.undefined
  }
  
  
  trait ListSigningJobsResponse extends js.Object {
    /**
         * A list of your signing jobs.
         */
    var jobs: js.UndefOr[SigningJobs] = js.undefined
    /**
         * String for specifying the next set of paginated results.
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListSigningPlatformsRequest extends js.Object {
    /**
         * The category type of a signing platform.
         */
    var category: js.UndefOr[String] = js.undefined
    /**
         * The maximum number of results to be returned by this operation.
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * Value for specifying the next set of paginated results to return. After you receive a response with truncated results, use this parameter in a subsequent request. Set it to the value of nextToken from the response that you just received.
         */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
         * Any partner entities connected to a signing platform.
         */
    var partner: js.UndefOr[String] = js.undefined
    /**
         * The validation template that is used by the target signing platform.
         */
    var target: js.UndefOr[String] = js.undefined
  }
  
  
  trait ListSigningPlatformsResponse extends js.Object {
    /**
         * Value for specifying the next set of paginated results to return.
         */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
         * A list of all platforms that match the request parameters.
         */
    var platforms: js.UndefOr[SigningPlatforms] = js.undefined
  }
  
  
  trait ListSigningProfilesRequest extends js.Object {
    /**
         * Designates whether to include profiles with the status of CANCELED.
         */
    var includeCanceled: js.UndefOr[bool] = js.undefined
    /**
         * The maximum number of profiles to be returned.
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * Value for specifying the next set of paginated results to return. After you receive a response with truncated results, use this parameter in a subsequent request. Set it to the value of nextToken from the response that you just received.
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListSigningProfilesResponse extends js.Object {
    /**
         * Value for specifying the next set of paginated results to return.
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * A list of profiles that are available in the AWS account. This includes profiles with the status of CANCELED if the includeCanceled parameter is set to true.
         */
    var profiles: js.UndefOr[SigningProfiles] = js.undefined
  }
  
  
  trait PutSigningProfileRequest extends js.Object {
    /**
         * A subfield of platform. This specifies any different configuration options that you want to apply to the chosen platform (such as a different hash-algorithm or signing-algorithm).
         */
    var overrides: js.UndefOr[SigningPlatformOverrides] = js.undefined
    /**
         * The ID of the signing profile to be created.
         */
    var platformId: PlatformId
    /**
         * The name of the signing profile to be created.
         */
    var profileName: ProfileName
    /**
         * The AWS Certificate Manager certificate that will be used to sign code with the new signing profile.
         */
    var signingMaterial: SigningMaterial
    /**
         * Map of key-value pairs for signing. These can include any information that you want to use during signing.
         */
    var signingParameters: js.UndefOr[SigningParameters] = js.undefined
  }
  
  
  trait PutSigningProfileResponse extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the signing profile created.
         */
    var arn: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait S3Destination extends js.Object {
    /**
         * Name of the S3 bucket.
         */
    var bucketName: js.UndefOr[BucketName] = js.undefined
    /**
         * An Amazon S3 prefix that you can use to limit responses to those that begin with the specified prefix.
         */
    var prefix: js.UndefOr[Prefix] = js.undefined
  }
  
  
  trait S3SignedObject extends js.Object {
    /**
         * Name of the S3 bucket.
         */
    var bucketName: js.UndefOr[BucketName] = js.undefined
    /**
         * Key name that uniquely identifies a signed code image in your bucket.
         */
    var key: js.UndefOr[key] = js.undefined
  }
  
  
  trait S3Source extends js.Object {
    /**
         * Name of the S3 bucket.
         */
    var bucketName: BucketName
    /**
         * Key name of the bucket object that contains your unsigned code.
         */
    var key: Key
    /**
         * Version of your source image in your version enabled S3 bucket.
         */
    var version: Version
  }
  
  
  trait SignedObject extends js.Object {
    /**
         * The S3SignedObject.
         */
    var s3: js.UndefOr[S3SignedObject] = js.undefined
  }
  
  
  trait SigningConfiguration extends js.Object {
    /**
         * The encryption algorithm options that are available for an AWS Signer job.
         */
    var encryptionAlgorithmOptions: EncryptionAlgorithmOptions
    /**
         * The hash algorithm options that are available for an AWS Signer job.
         */
    var hashAlgorithmOptions: HashAlgorithmOptions
  }
  
  
  trait SigningConfigurationOverrides extends js.Object {
    /**
         * A specified override of the default encryption algorithm that is used in an AWS Signer job.
         */
    var encryptionAlgorithm: js.UndefOr[EncryptionAlgorithm] = js.undefined
    /**
         * A specified override of the default hash algorithm that is used in an AWS Signer job.
         */
    var hashAlgorithm: js.UndefOr[HashAlgorithm] = js.undefined
  }
  
  
  trait SigningImageFormat extends js.Object {
    /**
         * The default format of an AWS Signer signing image.
         */
    var defaultFormat: ImageFormat
    /**
         * The supported formats of an AWS Signer signing image.
         */
    var supportedFormats: ImageFormats
  }
  
  
  trait SigningJob extends js.Object {
    /**
         * The date and time that the signing job was created.
         */
    var createdAt: js.UndefOr[CreatedAt] = js.undefined
    /**
         * The ID of the signing job.
         */
    var jobId: js.UndefOr[JobId] = js.undefined
    /**
         * A SignedObject structure that contains information about a signing job's signed code image.
         */
    var signedObject: js.UndefOr[SignedObject] = js.undefined
    /**
         * A SigningMaterial object that contains the Amazon Resource Name (ARN) of the certificate used for the signing job.
         */
    var signingMaterial: js.UndefOr[SigningMaterial] = js.undefined
    /**
         * A Source that contains information about a signing job's code image source.
         */
    var source: js.UndefOr[Source] = js.undefined
    /**
         * The status of the signing job.
         */
    var status: js.UndefOr[SigningStatus] = js.undefined
  }
  
  
  trait SigningMaterial extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the certificates that is used to sign your code.
         */
    var certificateArn: CertificateArn
  }
  
  
  trait SigningParameters
    extends /* key */ org.scalablytyped.runtime.StringDictionary[SigningParameterValue]
  
  
  trait SigningPlatform extends js.Object {
    /**
         * The category of an AWS Signer platform.
         */
    var category: js.UndefOr[Category] = js.undefined
    /**
         * The display name of an AWS Signer platform.
         */
    var displayName: js.UndefOr[String] = js.undefined
    /**
         * The maximum size (in MB) of code that can be signed by a AWS Signer platform.
         */
    var maxSizeInMB: js.UndefOr[MaxSizeInMB] = js.undefined
    /**
         * Any partner entities linked to an AWS Signer platform.
         */
    var partner: js.UndefOr[String] = js.undefined
    /**
         * The ID of an AWS Signer platform.
         */
    var platformId: js.UndefOr[String] = js.undefined
    /**
         * The configuration of an AWS Signer platform. This includes the designated hash algorithm and encryption algorithm of a signing platform.
         */
    var signingConfiguration: js.UndefOr[SigningConfiguration] = js.undefined
    /**
         * The signing image format that is used by an AWS Signer platform.
         */
    var signingImageFormat: js.UndefOr[SigningImageFormat] = js.undefined
    /**
         * The types of targets that can be signed by an AWS Signer platform.
         */
    var target: js.UndefOr[String] = js.undefined
  }
  
  
  trait SigningPlatformOverrides extends js.Object {
    var signingConfiguration: js.UndefOr[SigningConfigurationOverrides] = js.undefined
  }
  
  
  trait SigningProfile extends js.Object {
    /**
         * The ID of a platform that is available for use by a signing profile.
         */
    var platformId: js.UndefOr[PlatformId] = js.undefined
    /**
         * The name of the AWS Signer profile.
         */
    var profileName: js.UndefOr[ProfileName] = js.undefined
    /**
         * The ACM certificate that is available for use by a signing profile.
         */
    var signingMaterial: js.UndefOr[SigningMaterial] = js.undefined
    /**
         * The parameters that are available for use by an AWS Signer user.
         */
    var signingParameters: js.UndefOr[SigningParameters] = js.undefined
    /**
         * The status of an AWS Signer profile.
         */
    var status: js.UndefOr[SigningProfileStatus] = js.undefined
  }
  
  
  trait Source extends js.Object {
    /**
         * The S3Source object.
         */
    var s3: js.UndefOr[S3Source] = js.undefined
  }
  
  
  trait StartSigningJobRequest extends js.Object {
    /**
         * String that identifies the signing request. All calls after the first that use this token return the same response as the first call.
         */
    var clientRequestToken: ClientRequestToken
    /**
         * The S3 bucket in which to save your signed object. The destination contains the name of your bucket and an optional prefix.
         */
    var destination: Destination
    /**
         * The name of the signing profile.
         */
    var profileName: js.UndefOr[ProfileName] = js.undefined
    /**
         * The S3 bucket that contains the object to sign or a BLOB that contains your raw code.
         */
    var source: Source
  }
  
  
  trait StartSigningJobResponse extends js.Object {
    /**
         * The ID of your signing job.
         */
    var jobId: js.UndefOr[JobId] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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
    def cancelSigningProfile(params: CancelSigningProfileRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes the state of an ACTIVE signing profile to CANCELED. A canceled profile is still viewable with the ListSigningProfiles operation, but it cannot perform new signing jobs, and is deleted two years after cancelation.
       */
    def cancelSigningProfile(
      params: CancelSigningProfileRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a specific code signing job. You specify the job by using the jobId value that is returned by the StartSigningJob operation. 
       */
    def describeSigningJob(): awsDashSdkLib.libRequestMod.Request[DescribeSigningJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a specific code signing job. You specify the job by using the jobId value that is returned by the StartSigningJob operation. 
       */
    def describeSigningJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSigningJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSigningJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a specific code signing job. You specify the job by using the jobId value that is returned by the StartSigningJob operation. 
       */
    def describeSigningJob(params: DescribeSigningJobRequest): awsDashSdkLib.libRequestMod.Request[DescribeSigningJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a specific code signing job. You specify the job by using the jobId value that is returned by the StartSigningJob operation. 
       */
    def describeSigningJob(
      params: DescribeSigningJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSigningJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSigningJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information on a specific signing platform.
       */
    def getSigningPlatform(): awsDashSdkLib.libRequestMod.Request[GetSigningPlatformResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information on a specific signing platform.
       */
    def getSigningPlatform(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSigningPlatformResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSigningPlatformResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information on a specific signing platform.
       */
    def getSigningPlatform(params: GetSigningPlatformRequest): awsDashSdkLib.libRequestMod.Request[GetSigningPlatformResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information on a specific signing platform.
       */
    def getSigningPlatform(
      params: GetSigningPlatformRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSigningPlatformResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSigningPlatformResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information on a specific signing profile.
       */
    def getSigningProfile(): awsDashSdkLib.libRequestMod.Request[GetSigningProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information on a specific signing profile.
       */
    def getSigningProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSigningProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSigningProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information on a specific signing profile.
       */
    def getSigningProfile(params: GetSigningProfileRequest): awsDashSdkLib.libRequestMod.Request[GetSigningProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information on a specific signing profile.
       */
    def getSigningProfile(
      params: GetSigningProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSigningProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSigningProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all your signing jobs. You can use the maxResults parameter to limit the number of signing jobs that are returned in the response. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned. 
       */
    def listSigningJobs(): awsDashSdkLib.libRequestMod.Request[ListSigningJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all your signing jobs. You can use the maxResults parameter to limit the number of signing jobs that are returned in the response. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned. 
       */
    def listSigningJobs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSigningJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSigningJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all your signing jobs. You can use the maxResults parameter to limit the number of signing jobs that are returned in the response. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned. 
       */
    def listSigningJobs(params: ListSigningJobsRequest): awsDashSdkLib.libRequestMod.Request[ListSigningJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all your signing jobs. You can use the maxResults parameter to limit the number of signing jobs that are returned in the response. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned. 
       */
    def listSigningJobs(
      params: ListSigningJobsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSigningJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSigningJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all signing platforms available in AWS Signer that match the request parameters. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned.
       */
    def listSigningPlatforms(): awsDashSdkLib.libRequestMod.Request[ListSigningPlatformsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all signing platforms available in AWS Signer that match the request parameters. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned.
       */
    def listSigningPlatforms(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSigningPlatformsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSigningPlatformsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all signing platforms available in AWS Signer that match the request parameters. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned.
       */
    def listSigningPlatforms(params: ListSigningPlatformsRequest): awsDashSdkLib.libRequestMod.Request[ListSigningPlatformsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all signing platforms available in AWS Signer that match the request parameters. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned.
       */
    def listSigningPlatforms(
      params: ListSigningPlatformsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSigningPlatformsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSigningPlatformsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all available signing profiles in your AWS account. Returns only profiles with an ACTIVE status unless the includeCanceled request field is set to true. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned.
       */
    def listSigningProfiles(): awsDashSdkLib.libRequestMod.Request[ListSigningProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all available signing profiles in your AWS account. Returns only profiles with an ACTIVE status unless the includeCanceled request field is set to true. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned.
       */
    def listSigningProfiles(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSigningProfilesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSigningProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all available signing profiles in your AWS account. Returns only profiles with an ACTIVE status unless the includeCanceled request field is set to true. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned.
       */
    def listSigningProfiles(params: ListSigningProfilesRequest): awsDashSdkLib.libRequestMod.Request[ListSigningProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all available signing profiles in your AWS account. Returns only profiles with an ACTIVE status unless the includeCanceled request field is set to true. If additional jobs remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that AWS Signer returns in the nextToken parameter until all of your signing jobs have been returned.
       */
    def listSigningProfiles(
      params: ListSigningProfilesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSigningProfilesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSigningProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a signing profile. A signing profile is an AWS Signer template that can be used to carry out a pre-defined signing job. For more information, see http://docs.aws.amazon.com/signer/latest/developerguide/gs-profile.html 
       */
    def putSigningProfile(): awsDashSdkLib.libRequestMod.Request[PutSigningProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a signing profile. A signing profile is an AWS Signer template that can be used to carry out a pre-defined signing job. For more information, see http://docs.aws.amazon.com/signer/latest/developerguide/gs-profile.html 
       */
    def putSigningProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutSigningProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutSigningProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a signing profile. A signing profile is an AWS Signer template that can be used to carry out a pre-defined signing job. For more information, see http://docs.aws.amazon.com/signer/latest/developerguide/gs-profile.html 
       */
    def putSigningProfile(params: PutSigningProfileRequest): awsDashSdkLib.libRequestMod.Request[PutSigningProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a signing profile. A signing profile is an AWS Signer template that can be used to carry out a pre-defined signing job. For more information, see http://docs.aws.amazon.com/signer/latest/developerguide/gs-profile.html 
       */
    def putSigningProfile(
      params: PutSigningProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutSigningProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutSigningProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Initiates a signing job to be performed on the code provided. Signing jobs are viewable by the ListSigningJobs operation for two years after they are performed. Note the following requirements:     You must create an Amazon S3 source bucket. For more information, see Create a Bucket in the Amazon S3 Getting Started Guide.    Your S3 source bucket must be version enabled.   You must create an S3 destination bucket. AWS Signer uses your S3 destination bucket to write your signed code.   You specify the name of the source and destination buckets when calling the StartSigningJob operation.   You must also specify a request token that identifies your request to AWS Signer.    You can call the DescribeSigningJob and the ListSigningJobs actions after you call StartSigningJob. For a Java example that shows how to use this action, see http://docs.aws.amazon.com/acm/latest/userguide/ 
       */
    def startSigningJob(): awsDashSdkLib.libRequestMod.Request[StartSigningJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Initiates a signing job to be performed on the code provided. Signing jobs are viewable by the ListSigningJobs operation for two years after they are performed. Note the following requirements:     You must create an Amazon S3 source bucket. For more information, see Create a Bucket in the Amazon S3 Getting Started Guide.    Your S3 source bucket must be version enabled.   You must create an S3 destination bucket. AWS Signer uses your S3 destination bucket to write your signed code.   You specify the name of the source and destination buckets when calling the StartSigningJob operation.   You must also specify a request token that identifies your request to AWS Signer.    You can call the DescribeSigningJob and the ListSigningJobs actions after you call StartSigningJob. For a Java example that shows how to use this action, see http://docs.aws.amazon.com/acm/latest/userguide/ 
       */
    def startSigningJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartSigningJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartSigningJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Initiates a signing job to be performed on the code provided. Signing jobs are viewable by the ListSigningJobs operation for two years after they are performed. Note the following requirements:     You must create an Amazon S3 source bucket. For more information, see Create a Bucket in the Amazon S3 Getting Started Guide.    Your S3 source bucket must be version enabled.   You must create an S3 destination bucket. AWS Signer uses your S3 destination bucket to write your signed code.   You specify the name of the source and destination buckets when calling the StartSigningJob operation.   You must also specify a request token that identifies your request to AWS Signer.    You can call the DescribeSigningJob and the ListSigningJobs actions after you call StartSigningJob. For a Java example that shows how to use this action, see http://docs.aws.amazon.com/acm/latest/userguide/ 
       */
    def startSigningJob(params: StartSigningJobRequest): awsDashSdkLib.libRequestMod.Request[StartSigningJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Initiates a signing job to be performed on the code provided. Signing jobs are viewable by the ListSigningJobs operation for two years after they are performed. Note the following requirements:     You must create an Amazon S3 source bucket. For more information, see Create a Bucket in the Amazon S3 Getting Started Guide.    Your S3 source bucket must be version enabled.   You must create an S3 destination bucket. AWS Signer uses your S3 destination bucket to write your signed code.   You specify the name of the source and destination buckets when calling the StartSigningJob operation.   You must also specify a request token that identifies your request to AWS Signer.    You can call the DescribeSigningJob and the ListSigningJobs actions after you call StartSigningJob. For a Java example that shows how to use this action, see http://docs.aws.amazon.com/acm/latest/userguide/ 
       */
    def startSigningJob(
      params: StartSigningJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartSigningJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartSigningJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the successfulSigningJob state by periodically calling the underlying Signer.describeSigningJoboperation every 20 seconds (at most 25 times).
       */
    @JSName("waitFor")
    def waitFor_successfulSigningJob(state: awsDashSdkLib.awsDashSdkLibStrings.successfulSigningJob): awsDashSdkLib.libRequestMod.Request[DescribeSigningJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the successfulSigningJob state by periodically calling the underlying Signer.describeSigningJoboperation every 20 seconds (at most 25 times).
       */
    @JSName("waitFor")
    def waitFor_successfulSigningJob(
      state: awsDashSdkLib.awsDashSdkLibStrings.successfulSigningJob,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSigningJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSigningJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the successfulSigningJob state by periodically calling the underlying Signer.describeSigningJoboperation every 20 seconds (at most 25 times).
       */
    @JSName("waitFor")
    def waitFor_successfulSigningJob(
      state: awsDashSdkLib.awsDashSdkLibStrings.successfulSigningJob,
      params: DescribeSigningJobRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeSigningJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the successfulSigningJob state by periodically calling the underlying Signer.describeSigningJoboperation every 20 seconds (at most 25 times).
       */
    @JSName("waitFor")
    def waitFor_successfulSigningJob(
      state: awsDashSdkLib.awsDashSdkLibStrings.successfulSigningJob,
      params: DescribeSigningJobRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSigningJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSigningJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  val TypesNs: this.type = js.native
  type BucketName = java.lang.String
  type Category = awsDashSdkLib.awsDashSdkLibStrings.AWSIoT | java.lang.String
  type CertificateArn = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  type CompletedAt = stdLib.Date
  type CreatedAt = stdLib.Date
  type DisplayName = java.lang.String
  type EncryptionAlgorithm = awsDashSdkLib.awsDashSdkLibStrings.RSA | awsDashSdkLib.awsDashSdkLibStrings.ECDSA | java.lang.String
  type EncryptionAlgorithms = js.Array[EncryptionAlgorithm]
  type HashAlgorithm = awsDashSdkLib.awsDashSdkLibStrings.SHA1 | awsDashSdkLib.awsDashSdkLibStrings.SHA256 | java.lang.String
  type HashAlgorithms = js.Array[HashAlgorithm]
  type ImageFormat = awsDashSdkLib.awsDashSdkLibStrings.JSON | java.lang.String
  type ImageFormats = js.Array[ImageFormat]
  type JobId = java.lang.String
  type Key = java.lang.String
  type MaxResults = scala.Double
  type MaxSizeInMB = scala.Double
  type NextToken = java.lang.String
  type PlatformId = java.lang.String
  type Prefix = java.lang.String
  type ProfileName = java.lang.String
  type RequestedBy = java.lang.String
  type SigningJobs = js.Array[SigningJob]
  type SigningParameterKey = java.lang.String
  type SigningParameterValue = java.lang.String
  type SigningPlatforms = js.Array[SigningPlatform]
  type SigningProfileStatus = awsDashSdkLib.awsDashSdkLibStrings.Active | awsDashSdkLib.awsDashSdkLibStrings.Canceled | java.lang.String
  type SigningProfiles = js.Array[SigningProfile]
  type SigningStatus = awsDashSdkLib.awsDashSdkLibStrings.InProgress | awsDashSdkLib.awsDashSdkLibStrings.Failed | awsDashSdkLib.awsDashSdkLibStrings.Succeeded | java.lang.String
  type StatusReason = java.lang.String
  type String = java.lang.String
  type Version = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-08-25` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
  type bool = scala.Boolean
  type key = java.lang.String
}

