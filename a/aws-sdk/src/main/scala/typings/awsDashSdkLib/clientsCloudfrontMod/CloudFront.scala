package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFront
  extends awsDashSdkLib.libServicesCloudfrontMod.CloudFrontCustomizations {
  @JSName("config")
  var config_CloudFront: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ClientConfiguration = js.native
  /**
     * Creates a new origin access identity. If you're using Amazon S3 for your origin, you can use an origin access identity to require users to access your content using a CloudFront URL instead of the Amazon S3 URL. For more information about how to use origin access identities, see Serving Private Content through CloudFront in the Amazon CloudFront Developer Guide.
     */
  def createCloudFrontOriginAccessIdentity(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateCloudFrontOriginAccessIdentityResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new origin access identity. If you're using Amazon S3 for your origin, you can use an origin access identity to require users to access your content using a CloudFront URL instead of the Amazon S3 URL. For more information about how to use origin access identities, see Serving Private Content through CloudFront in the Amazon CloudFront Developer Guide.
     */
  def createCloudFrontOriginAccessIdentity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateCloudFrontOriginAccessIdentityResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateCloudFrontOriginAccessIdentityResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new origin access identity. If you're using Amazon S3 for your origin, you can use an origin access identity to require users to access your content using a CloudFront URL instead of the Amazon S3 URL. For more information about how to use origin access identities, see Serving Private Content through CloudFront in the Amazon CloudFront Developer Guide.
     */
  def createCloudFrontOriginAccessIdentity(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateCloudFrontOriginAccessIdentityRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateCloudFrontOriginAccessIdentityResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new origin access identity. If you're using Amazon S3 for your origin, you can use an origin access identity to require users to access your content using a CloudFront URL instead of the Amazon S3 URL. For more information about how to use origin access identities, see Serving Private Content through CloudFront in the Amazon CloudFront Developer Guide.
     */
  def createCloudFrontOriginAccessIdentity(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateCloudFrontOriginAccessIdentityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateCloudFrontOriginAccessIdentityResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateCloudFrontOriginAccessIdentityResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new web distribution. You create a CloudFront distribution to tell CloudFront where you want content to be delivered from, and the details about how to track and manage content delivery. Send a POST request to the /CloudFront API version/distribution/distribution ID resource.  When you update a distribution, there are more required fields than when you create a distribution. When you update your distribution by using UpdateDistribution, follow the steps included in the documentation to get the current configuration and then make your updates. This helps to make sure that you include all of the required fields. To view a summary, see Required Fields for Create Distribution and Update Distribution in the Amazon CloudFront Developer Guide.  If you are using Adobe Flash Media Server's RTMP protocol, you set up a different kind of CloudFront distribution. For more information, see CreateStreamingDistribution.
     */
  def createDistribution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new web distribution. You create a CloudFront distribution to tell CloudFront where you want content to be delivered from, and the details about how to track and manage content delivery. Send a POST request to the /CloudFront API version/distribution/distribution ID resource.  When you update a distribution, there are more required fields than when you create a distribution. When you update your distribution by using UpdateDistribution, follow the steps included in the documentation to get the current configuration and then make your updates. This helps to make sure that you include all of the required fields. To view a summary, see Required Fields for Create Distribution and Update Distribution in the Amazon CloudFront Developer Guide.  If you are using Adobe Flash Media Server's RTMP protocol, you set up a different kind of CloudFront distribution. For more information, see CreateStreamingDistribution.
     */
  def createDistribution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new web distribution. You create a CloudFront distribution to tell CloudFront where you want content to be delivered from, and the details about how to track and manage content delivery. Send a POST request to the /CloudFront API version/distribution/distribution ID resource.  When you update a distribution, there are more required fields than when you create a distribution. When you update your distribution by using UpdateDistribution, follow the steps included in the documentation to get the current configuration and then make your updates. This helps to make sure that you include all of the required fields. To view a summary, see Required Fields for Create Distribution and Update Distribution in the Amazon CloudFront Developer Guide.  If you are using Adobe Flash Media Server's RTMP protocol, you set up a different kind of CloudFront distribution. For more information, see CreateStreamingDistribution.
     */
  def createDistribution(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateDistributionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new web distribution. You create a CloudFront distribution to tell CloudFront where you want content to be delivered from, and the details about how to track and manage content delivery. Send a POST request to the /CloudFront API version/distribution/distribution ID resource.  When you update a distribution, there are more required fields than when you create a distribution. When you update your distribution by using UpdateDistribution, follow the steps included in the documentation to get the current configuration and then make your updates. This helps to make sure that you include all of the required fields. To view a summary, see Required Fields for Create Distribution and Update Distribution in the Amazon CloudFront Developer Guide.  If you are using Adobe Flash Media Server's RTMP protocol, you set up a different kind of CloudFront distribution. For more information, see CreateStreamingDistribution.
     */
  def createDistribution(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateDistributionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new distribution with tags.
     */
  def createDistributionWithTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateDistributionWithTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new distribution with tags.
     */
  def createDistributionWithTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateDistributionWithTagsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateDistributionWithTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new distribution with tags.
     */
  def createDistributionWithTags(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateDistributionWithTagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateDistributionWithTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new distribution with tags.
     */
  def createDistributionWithTags(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateDistributionWithTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateDistributionWithTagsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateDistributionWithTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new field-level encryption configuration.
     */
  def createFieldLevelEncryptionConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateFieldLevelEncryptionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new field-level encryption configuration.
     */
  def createFieldLevelEncryptionConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateFieldLevelEncryptionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateFieldLevelEncryptionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new field-level encryption configuration.
     */
  def createFieldLevelEncryptionConfig(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateFieldLevelEncryptionConfigRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateFieldLevelEncryptionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new field-level encryption configuration.
     */
  def createFieldLevelEncryptionConfig(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateFieldLevelEncryptionConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateFieldLevelEncryptionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateFieldLevelEncryptionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a field-level encryption profile.
     */
  def createFieldLevelEncryptionProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateFieldLevelEncryptionProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a field-level encryption profile.
     */
  def createFieldLevelEncryptionProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateFieldLevelEncryptionProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateFieldLevelEncryptionProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a field-level encryption profile.
     */
  def createFieldLevelEncryptionProfile(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateFieldLevelEncryptionProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateFieldLevelEncryptionProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a field-level encryption profile.
     */
  def createFieldLevelEncryptionProfile(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateFieldLevelEncryptionProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateFieldLevelEncryptionProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateFieldLevelEncryptionProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new invalidation. 
     */
  def createInvalidation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateInvalidationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new invalidation. 
     */
  def createInvalidation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateInvalidationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateInvalidationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new invalidation. 
     */
  def createInvalidation(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateInvalidationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateInvalidationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new invalidation. 
     */
  def createInvalidation(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateInvalidationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateInvalidationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateInvalidationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Add a new public key to CloudFront to use, for example, for field-level encryption. You can add a maximum of 10 public keys with one AWS account.
     */
  def createPublicKey(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreatePublicKeyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Add a new public key to CloudFront to use, for example, for field-level encryption. You can add a maximum of 10 public keys with one AWS account.
     */
  def createPublicKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreatePublicKeyResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreatePublicKeyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Add a new public key to CloudFront to use, for example, for field-level encryption. You can add a maximum of 10 public keys with one AWS account.
     */
  def createPublicKey(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreatePublicKeyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreatePublicKeyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Add a new public key to CloudFront to use, for example, for field-level encryption. You can add a maximum of 10 public keys with one AWS account.
     */
  def createPublicKey(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreatePublicKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreatePublicKeyResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreatePublicKeyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new RMTP distribution. An RTMP distribution is similar to a web distribution, but an RTMP distribution streams media files using the Adobe Real-Time Messaging Protocol (RTMP) instead of serving files using HTTP.  To create a new web distribution, submit a POST request to the CloudFront API version/distribution resource. The request body must include a document with a StreamingDistributionConfig element. The response echoes the StreamingDistributionConfig element and returns other information about the RTMP distribution. To get the status of your request, use the GET StreamingDistribution API action. When the value of Enabled is true and the value of Status is Deployed, your distribution is ready. A distribution usually deploys in less than 15 minutes. For more information about web distributions, see Working with RTMP Distributions in the Amazon CloudFront Developer Guide.  Beginning with the 2012-05-05 version of the CloudFront API, we made substantial changes to the format of the XML document that you include in the request body when you create or update a web distribution or an RTMP distribution, and when you invalidate objects. With previous versions of the API, we discovered that it was too easy to accidentally delete one or more values for an element that accepts multiple values, for example, CNAMEs and trusted signers. Our changes for the 2012-05-05 release are intended to prevent these accidental deletions and to notify you when there's a mismatch between the number of values you say you're specifying in the Quantity element and the number of values specified. 
     */
  def createStreamingDistribution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateStreamingDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new RMTP distribution. An RTMP distribution is similar to a web distribution, but an RTMP distribution streams media files using the Adobe Real-Time Messaging Protocol (RTMP) instead of serving files using HTTP.  To create a new web distribution, submit a POST request to the CloudFront API version/distribution resource. The request body must include a document with a StreamingDistributionConfig element. The response echoes the StreamingDistributionConfig element and returns other information about the RTMP distribution. To get the status of your request, use the GET StreamingDistribution API action. When the value of Enabled is true and the value of Status is Deployed, your distribution is ready. A distribution usually deploys in less than 15 minutes. For more information about web distributions, see Working with RTMP Distributions in the Amazon CloudFront Developer Guide.  Beginning with the 2012-05-05 version of the CloudFront API, we made substantial changes to the format of the XML document that you include in the request body when you create or update a web distribution or an RTMP distribution, and when you invalidate objects. With previous versions of the API, we discovered that it was too easy to accidentally delete one or more values for an element that accepts multiple values, for example, CNAMEs and trusted signers. Our changes for the 2012-05-05 release are intended to prevent these accidental deletions and to notify you when there's a mismatch between the number of values you say you're specifying in the Quantity element and the number of values specified. 
     */
  def createStreamingDistribution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateStreamingDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateStreamingDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new RMTP distribution. An RTMP distribution is similar to a web distribution, but an RTMP distribution streams media files using the Adobe Real-Time Messaging Protocol (RTMP) instead of serving files using HTTP.  To create a new web distribution, submit a POST request to the CloudFront API version/distribution resource. The request body must include a document with a StreamingDistributionConfig element. The response echoes the StreamingDistributionConfig element and returns other information about the RTMP distribution. To get the status of your request, use the GET StreamingDistribution API action. When the value of Enabled is true and the value of Status is Deployed, your distribution is ready. A distribution usually deploys in less than 15 minutes. For more information about web distributions, see Working with RTMP Distributions in the Amazon CloudFront Developer Guide.  Beginning with the 2012-05-05 version of the CloudFront API, we made substantial changes to the format of the XML document that you include in the request body when you create or update a web distribution or an RTMP distribution, and when you invalidate objects. With previous versions of the API, we discovered that it was too easy to accidentally delete one or more values for an element that accepts multiple values, for example, CNAMEs and trusted signers. Our changes for the 2012-05-05 release are intended to prevent these accidental deletions and to notify you when there's a mismatch between the number of values you say you're specifying in the Quantity element and the number of values specified. 
     */
  def createStreamingDistribution(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateStreamingDistributionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateStreamingDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new RMTP distribution. An RTMP distribution is similar to a web distribution, but an RTMP distribution streams media files using the Adobe Real-Time Messaging Protocol (RTMP) instead of serving files using HTTP.  To create a new web distribution, submit a POST request to the CloudFront API version/distribution resource. The request body must include a document with a StreamingDistributionConfig element. The response echoes the StreamingDistributionConfig element and returns other information about the RTMP distribution. To get the status of your request, use the GET StreamingDistribution API action. When the value of Enabled is true and the value of Status is Deployed, your distribution is ready. A distribution usually deploys in less than 15 minutes. For more information about web distributions, see Working with RTMP Distributions in the Amazon CloudFront Developer Guide.  Beginning with the 2012-05-05 version of the CloudFront API, we made substantial changes to the format of the XML document that you include in the request body when you create or update a web distribution or an RTMP distribution, and when you invalidate objects. With previous versions of the API, we discovered that it was too easy to accidentally delete one or more values for an element that accepts multiple values, for example, CNAMEs and trusted signers. Our changes for the 2012-05-05 release are intended to prevent these accidental deletions and to notify you when there's a mismatch between the number of values you say you're specifying in the Quantity element and the number of values specified. 
     */
  def createStreamingDistribution(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateStreamingDistributionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateStreamingDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateStreamingDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new streaming distribution with tags.
     */
  def createStreamingDistributionWithTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateStreamingDistributionWithTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new streaming distribution with tags.
     */
  def createStreamingDistributionWithTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateStreamingDistributionWithTagsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateStreamingDistributionWithTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new streaming distribution with tags.
     */
  def createStreamingDistributionWithTags(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateStreamingDistributionWithTagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateStreamingDistributionWithTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new streaming distribution with tags.
     */
  def createStreamingDistributionWithTags(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateStreamingDistributionWithTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateStreamingDistributionWithTagsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.CreateStreamingDistributionWithTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an origin access identity. 
     */
  def deleteCloudFrontOriginAccessIdentity(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Delete an origin access identity. 
     */
  def deleteCloudFrontOriginAccessIdentity(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Delete an origin access identity. 
     */
  def deleteCloudFrontOriginAccessIdentity(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.DeleteCloudFrontOriginAccessIdentityRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Delete an origin access identity. 
     */
  def deleteCloudFrontOriginAccessIdentity(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.DeleteCloudFrontOriginAccessIdentityRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Delete a distribution. 
     */
  def deleteDistribution(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Delete a distribution. 
     */
  def deleteDistribution(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Delete a distribution. 
     */
  def deleteDistribution(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.DeleteDistributionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Delete a distribution. 
     */
  def deleteDistribution(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.DeleteDistributionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Remove a field-level encryption configuration.
     */
  def deleteFieldLevelEncryptionConfig(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Remove a field-level encryption configuration.
     */
  def deleteFieldLevelEncryptionConfig(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Remove a field-level encryption configuration.
     */
  def deleteFieldLevelEncryptionConfig(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.DeleteFieldLevelEncryptionConfigRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Remove a field-level encryption configuration.
     */
  def deleteFieldLevelEncryptionConfig(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.DeleteFieldLevelEncryptionConfigRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Remove a field-level encryption profile.
     */
  def deleteFieldLevelEncryptionProfile(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Remove a field-level encryption profile.
     */
  def deleteFieldLevelEncryptionProfile(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Remove a field-level encryption profile.
     */
  def deleteFieldLevelEncryptionProfile(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.DeleteFieldLevelEncryptionProfileRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Remove a field-level encryption profile.
     */
  def deleteFieldLevelEncryptionProfile(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.DeleteFieldLevelEncryptionProfileRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Remove a public key you previously added to CloudFront.
     */
  def deletePublicKey(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Remove a public key you previously added to CloudFront.
     */
  def deletePublicKey(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Remove a public key you previously added to CloudFront.
     */
  def deletePublicKey(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.DeletePublicKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Remove a public key you previously added to CloudFront.
     */
  def deletePublicKey(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.DeletePublicKeyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Delete a streaming distribution. To delete an RTMP distribution using the CloudFront API, perform the following steps.  To delete an RTMP distribution using the CloudFront API:   Disable the RTMP distribution.   Submit a GET Streaming Distribution Config request to get the current configuration and the Etag header for the distribution.    Update the XML document that was returned in the response to your GET Streaming Distribution Config request to change the value of Enabled to false.   Submit a PUT Streaming Distribution Config request to update the configuration for your distribution. In the request body, include the XML document that you updated in Step 3. Then set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Streaming Distribution Config request in Step 2.   Review the response to the PUT Streaming Distribution Config request to confirm that the distribution was successfully disabled.   Submit a GET Streaming Distribution Config request to confirm that your changes have propagated. When propagation is complete, the value of Status is Deployed.   Submit a DELETE Streaming Distribution request. Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Streaming Distribution Config request in Step 2.   Review the response to your DELETE Streaming Distribution request to confirm that the distribution was successfully deleted.   For information about deleting a distribution using the CloudFront console, see Deleting a Distribution in the Amazon CloudFront Developer Guide.
     */
  def deleteStreamingDistribution(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Delete a streaming distribution. To delete an RTMP distribution using the CloudFront API, perform the following steps.  To delete an RTMP distribution using the CloudFront API:   Disable the RTMP distribution.   Submit a GET Streaming Distribution Config request to get the current configuration and the Etag header for the distribution.    Update the XML document that was returned in the response to your GET Streaming Distribution Config request to change the value of Enabled to false.   Submit a PUT Streaming Distribution Config request to update the configuration for your distribution. In the request body, include the XML document that you updated in Step 3. Then set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Streaming Distribution Config request in Step 2.   Review the response to the PUT Streaming Distribution Config request to confirm that the distribution was successfully disabled.   Submit a GET Streaming Distribution Config request to confirm that your changes have propagated. When propagation is complete, the value of Status is Deployed.   Submit a DELETE Streaming Distribution request. Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Streaming Distribution Config request in Step 2.   Review the response to your DELETE Streaming Distribution request to confirm that the distribution was successfully deleted.   For information about deleting a distribution using the CloudFront console, see Deleting a Distribution in the Amazon CloudFront Developer Guide.
     */
  def deleteStreamingDistribution(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Delete a streaming distribution. To delete an RTMP distribution using the CloudFront API, perform the following steps.  To delete an RTMP distribution using the CloudFront API:   Disable the RTMP distribution.   Submit a GET Streaming Distribution Config request to get the current configuration and the Etag header for the distribution.    Update the XML document that was returned in the response to your GET Streaming Distribution Config request to change the value of Enabled to false.   Submit a PUT Streaming Distribution Config request to update the configuration for your distribution. In the request body, include the XML document that you updated in Step 3. Then set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Streaming Distribution Config request in Step 2.   Review the response to the PUT Streaming Distribution Config request to confirm that the distribution was successfully disabled.   Submit a GET Streaming Distribution Config request to confirm that your changes have propagated. When propagation is complete, the value of Status is Deployed.   Submit a DELETE Streaming Distribution request. Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Streaming Distribution Config request in Step 2.   Review the response to your DELETE Streaming Distribution request to confirm that the distribution was successfully deleted.   For information about deleting a distribution using the CloudFront console, see Deleting a Distribution in the Amazon CloudFront Developer Guide.
     */
  def deleteStreamingDistribution(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.DeleteStreamingDistributionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Delete a streaming distribution. To delete an RTMP distribution using the CloudFront API, perform the following steps.  To delete an RTMP distribution using the CloudFront API:   Disable the RTMP distribution.   Submit a GET Streaming Distribution Config request to get the current configuration and the Etag header for the distribution.    Update the XML document that was returned in the response to your GET Streaming Distribution Config request to change the value of Enabled to false.   Submit a PUT Streaming Distribution Config request to update the configuration for your distribution. In the request body, include the XML document that you updated in Step 3. Then set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Streaming Distribution Config request in Step 2.   Review the response to the PUT Streaming Distribution Config request to confirm that the distribution was successfully disabled.   Submit a GET Streaming Distribution Config request to confirm that your changes have propagated. When propagation is complete, the value of Status is Deployed.   Submit a DELETE Streaming Distribution request. Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Streaming Distribution Config request in Step 2.   Review the response to your DELETE Streaming Distribution request to confirm that the distribution was successfully deleted.   For information about deleting a distribution using the CloudFront console, see Deleting a Distribution in the Amazon CloudFront Developer Guide.
     */
  def deleteStreamingDistribution(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.DeleteStreamingDistributionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Get the information about an origin access identity. 
     */
  def getCloudFrontOriginAccessIdentity(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetCloudFrontOriginAccessIdentityResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the information about an origin access identity. 
     */
  def getCloudFrontOriginAccessIdentity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetCloudFrontOriginAccessIdentityResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetCloudFrontOriginAccessIdentityResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the information about an origin access identity. 
     */
  def getCloudFrontOriginAccessIdentity(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetCloudFrontOriginAccessIdentityRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetCloudFrontOriginAccessIdentityResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the information about an origin access identity. 
     */
  def getCloudFrontOriginAccessIdentity(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetCloudFrontOriginAccessIdentityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetCloudFrontOriginAccessIdentityResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetCloudFrontOriginAccessIdentityResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the configuration information about an origin access identity. 
     */
  def getCloudFrontOriginAccessIdentityConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetCloudFrontOriginAccessIdentityConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the configuration information about an origin access identity. 
     */
  def getCloudFrontOriginAccessIdentityConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetCloudFrontOriginAccessIdentityConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetCloudFrontOriginAccessIdentityConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the configuration information about an origin access identity. 
     */
  def getCloudFrontOriginAccessIdentityConfig(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetCloudFrontOriginAccessIdentityConfigRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetCloudFrontOriginAccessIdentityConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the configuration information about an origin access identity. 
     */
  def getCloudFrontOriginAccessIdentityConfig(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetCloudFrontOriginAccessIdentityConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetCloudFrontOriginAccessIdentityConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetCloudFrontOriginAccessIdentityConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the information about a distribution. 
     */
  def getDistribution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the information about a distribution. 
     */
  def getDistribution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the information about a distribution. 
     */
  def getDistribution(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetDistributionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the information about a distribution. 
     */
  def getDistribution(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetDistributionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the configuration information about a distribution. 
     */
  def getDistributionConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetDistributionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the configuration information about a distribution. 
     */
  def getDistributionConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetDistributionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetDistributionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the configuration information about a distribution. 
     */
  def getDistributionConfig(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetDistributionConfigRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetDistributionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the configuration information about a distribution. 
     */
  def getDistributionConfig(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetDistributionConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetDistributionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetDistributionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the field-level encryption configuration information.
     */
  def getFieldLevelEncryption(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the field-level encryption configuration information.
     */
  def getFieldLevelEncryption(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the field-level encryption configuration information.
     */
  def getFieldLevelEncryption(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the field-level encryption configuration information.
     */
  def getFieldLevelEncryption(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the field-level encryption configuration information.
     */
  def getFieldLevelEncryptionConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the field-level encryption configuration information.
     */
  def getFieldLevelEncryptionConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the field-level encryption configuration information.
     */
  def getFieldLevelEncryptionConfig(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionConfigRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the field-level encryption configuration information.
     */
  def getFieldLevelEncryptionConfig(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the field-level encryption profile information.
     */
  def getFieldLevelEncryptionProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the field-level encryption profile information.
     */
  def getFieldLevelEncryptionProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the field-level encryption profile information.
     */
  def getFieldLevelEncryptionProfile(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the field-level encryption profile information.
     */
  def getFieldLevelEncryptionProfile(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the field-level encryption profile configuration information.
     */
  def getFieldLevelEncryptionProfileConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionProfileConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the field-level encryption profile configuration information.
     */
  def getFieldLevelEncryptionProfileConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionProfileConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionProfileConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the field-level encryption profile configuration information.
     */
  def getFieldLevelEncryptionProfileConfig(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionProfileConfigRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionProfileConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the field-level encryption profile configuration information.
     */
  def getFieldLevelEncryptionProfileConfig(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionProfileConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionProfileConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetFieldLevelEncryptionProfileConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the information about an invalidation. 
     */
  def getInvalidation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetInvalidationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the information about an invalidation. 
     */
  def getInvalidation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetInvalidationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetInvalidationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the information about an invalidation. 
     */
  def getInvalidation(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetInvalidationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetInvalidationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the information about an invalidation. 
     */
  def getInvalidation(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetInvalidationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetInvalidationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetInvalidationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the public key information.
     */
  def getPublicKey(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetPublicKeyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the public key information.
     */
  def getPublicKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetPublicKeyResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetPublicKeyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the public key information.
     */
  def getPublicKey(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetPublicKeyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetPublicKeyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the public key information.
     */
  def getPublicKey(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetPublicKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetPublicKeyResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetPublicKeyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Return public key configuration informaation
     */
  def getPublicKeyConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetPublicKeyConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Return public key configuration informaation
     */
  def getPublicKeyConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetPublicKeyConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetPublicKeyConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Return public key configuration informaation
     */
  def getPublicKeyConfig(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetPublicKeyConfigRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetPublicKeyConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Return public key configuration informaation
     */
  def getPublicKeyConfig(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetPublicKeyConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetPublicKeyConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetPublicKeyConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a specified RTMP distribution, including the distribution configuration.
     */
  def getStreamingDistribution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetStreamingDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a specified RTMP distribution, including the distribution configuration.
     */
  def getStreamingDistribution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetStreamingDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetStreamingDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a specified RTMP distribution, including the distribution configuration.
     */
  def getStreamingDistribution(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetStreamingDistributionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetStreamingDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a specified RTMP distribution, including the distribution configuration.
     */
  def getStreamingDistribution(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetStreamingDistributionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetStreamingDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetStreamingDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the configuration information about a streaming distribution. 
     */
  def getStreamingDistributionConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetStreamingDistributionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the configuration information about a streaming distribution. 
     */
  def getStreamingDistributionConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetStreamingDistributionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetStreamingDistributionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the configuration information about a streaming distribution. 
     */
  def getStreamingDistributionConfig(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetStreamingDistributionConfigRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetStreamingDistributionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the configuration information about a streaming distribution. 
     */
  def getStreamingDistributionConfig(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetStreamingDistributionConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetStreamingDistributionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetStreamingDistributionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists origin access identities.
     */
  def listCloudFrontOriginAccessIdentities(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListCloudFrontOriginAccessIdentitiesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists origin access identities.
     */
  def listCloudFrontOriginAccessIdentities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListCloudFrontOriginAccessIdentitiesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListCloudFrontOriginAccessIdentitiesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists origin access identities.
     */
  def listCloudFrontOriginAccessIdentities(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListCloudFrontOriginAccessIdentitiesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListCloudFrontOriginAccessIdentitiesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists origin access identities.
     */
  def listCloudFrontOriginAccessIdentities(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListCloudFrontOriginAccessIdentitiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListCloudFrontOriginAccessIdentitiesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListCloudFrontOriginAccessIdentitiesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List distributions. 
     */
  def listDistributions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListDistributionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List distributions. 
     */
  def listDistributions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListDistributionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListDistributionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List distributions. 
     */
  def listDistributions(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListDistributionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListDistributionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List distributions. 
     */
  def listDistributions(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListDistributionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListDistributionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListDistributionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List the distributions that are associated with a specified AWS WAF web ACL. 
     */
  def listDistributionsByWebACLId(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListDistributionsByWebACLIdResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List the distributions that are associated with a specified AWS WAF web ACL. 
     */
  def listDistributionsByWebACLId(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListDistributionsByWebACLIdResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListDistributionsByWebACLIdResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List the distributions that are associated with a specified AWS WAF web ACL. 
     */
  def listDistributionsByWebACLId(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListDistributionsByWebACLIdRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListDistributionsByWebACLIdResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List the distributions that are associated with a specified AWS WAF web ACL. 
     */
  def listDistributionsByWebACLId(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListDistributionsByWebACLIdRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListDistributionsByWebACLIdResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListDistributionsByWebACLIdResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all field-level encryption configurations that have been created in CloudFront for this account.
     */
  def listFieldLevelEncryptionConfigs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListFieldLevelEncryptionConfigsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all field-level encryption configurations that have been created in CloudFront for this account.
     */
  def listFieldLevelEncryptionConfigs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListFieldLevelEncryptionConfigsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListFieldLevelEncryptionConfigsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all field-level encryption configurations that have been created in CloudFront for this account.
     */
  def listFieldLevelEncryptionConfigs(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListFieldLevelEncryptionConfigsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListFieldLevelEncryptionConfigsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all field-level encryption configurations that have been created in CloudFront for this account.
     */
  def listFieldLevelEncryptionConfigs(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListFieldLevelEncryptionConfigsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListFieldLevelEncryptionConfigsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListFieldLevelEncryptionConfigsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Request a list of field-level encryption profiles that have been created in CloudFront for this account.
     */
  def listFieldLevelEncryptionProfiles(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListFieldLevelEncryptionProfilesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Request a list of field-level encryption profiles that have been created in CloudFront for this account.
     */
  def listFieldLevelEncryptionProfiles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListFieldLevelEncryptionProfilesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListFieldLevelEncryptionProfilesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Request a list of field-level encryption profiles that have been created in CloudFront for this account.
     */
  def listFieldLevelEncryptionProfiles(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListFieldLevelEncryptionProfilesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListFieldLevelEncryptionProfilesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Request a list of field-level encryption profiles that have been created in CloudFront for this account.
     */
  def listFieldLevelEncryptionProfiles(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListFieldLevelEncryptionProfilesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListFieldLevelEncryptionProfilesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListFieldLevelEncryptionProfilesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists invalidation batches. 
     */
  def listInvalidations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListInvalidationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists invalidation batches. 
     */
  def listInvalidations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListInvalidationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListInvalidationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists invalidation batches. 
     */
  def listInvalidations(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListInvalidationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListInvalidationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists invalidation batches. 
     */
  def listInvalidations(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListInvalidationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListInvalidationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListInvalidationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all public keys that have been added to CloudFront for this account.
     */
  def listPublicKeys(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListPublicKeysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all public keys that have been added to CloudFront for this account.
     */
  def listPublicKeys(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListPublicKeysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListPublicKeysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all public keys that have been added to CloudFront for this account.
     */
  def listPublicKeys(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListPublicKeysRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListPublicKeysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all public keys that have been added to CloudFront for this account.
     */
  def listPublicKeys(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListPublicKeysRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListPublicKeysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListPublicKeysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List streaming distributions. 
     */
  def listStreamingDistributions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListStreamingDistributionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List streaming distributions. 
     */
  def listStreamingDistributions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListStreamingDistributionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListStreamingDistributionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List streaming distributions. 
     */
  def listStreamingDistributions(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListStreamingDistributionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListStreamingDistributionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List streaming distributions. 
     */
  def listStreamingDistributions(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListStreamingDistributionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListStreamingDistributionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListStreamingDistributionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List tags for a CloudFront resource.
     */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListTagsForResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List tags for a CloudFront resource.
     */
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListTagsForResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListTagsForResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List tags for a CloudFront resource.
     */
  def listTagsForResource(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListTagsForResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List tags for a CloudFront resource.
     */
  def listTagsForResource(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListTagsForResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ListTagsForResourceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Add tags to a CloudFront resource.
     */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Add tags to a CloudFront resource.
     */
  def tagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Add tags to a CloudFront resource.
     */
  def tagResource(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Add tags to a CloudFront resource.
     */
  def tagResource(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.TagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Remove tags from a CloudFront resource.
     */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Remove tags from a CloudFront resource.
     */
  def untagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Remove tags from a CloudFront resource.
     */
  def untagResource(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Remove tags from a CloudFront resource.
     */
  def untagResource(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UntagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Update an origin access identity. 
     */
  def updateCloudFrontOriginAccessIdentity(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateCloudFrontOriginAccessIdentityResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an origin access identity. 
     */
  def updateCloudFrontOriginAccessIdentity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateCloudFrontOriginAccessIdentityResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateCloudFrontOriginAccessIdentityResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an origin access identity. 
     */
  def updateCloudFrontOriginAccessIdentity(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateCloudFrontOriginAccessIdentityRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateCloudFrontOriginAccessIdentityResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an origin access identity. 
     */
  def updateCloudFrontOriginAccessIdentity(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateCloudFrontOriginAccessIdentityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateCloudFrontOriginAccessIdentityResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateCloudFrontOriginAccessIdentityResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the configuration for a web distribution.   When you update a distribution, there are more required fields than when you create a distribution. When you update your distribution by using this API action, follow the steps here to get the current configuration and then make your updates, to make sure that you include all of the required fields. To view a summary, see Required Fields for Create Distribution and Update Distribution in the Amazon CloudFront Developer Guide.  The update process includes getting the current distribution configuration, updating the XML document that is returned to make your changes, and then submitting an UpdateDistribution request to make the updates. For information about updating a distribution using the CloudFront console instead, see Creating a Distribution in the Amazon CloudFront Developer Guide.  To update a web distribution using the CloudFront API    Submit a GetDistributionConfig request to get the current configuration and an Etag header for the distribution.  If you update the distribution again, you must get a new Etag header.    Update the XML document that was returned in the response to your GetDistributionConfig request to include your changes.   When you edit the XML file, be aware of the following:   You must strip out the ETag parameter that is returned.   Additional fields are required when you update a distribution. There may be fields included in the XML file for features that you haven't configured for your distribution. This is expected and required to successfully update the distribution.   You can't change the value of CallerReference. If you try to change this value, CloudFront returns an IllegalUpdate error.    The new configuration replaces the existing configuration; the values that you specify in an UpdateDistribution request are not merged into your existing configuration. When you add, delete, or replace values in an element that allows multiple values (for example, CNAME), you must specify all of the values that you want to appear in the updated distribution. In addition, you must update the corresponding Quantity element.      Submit an UpdateDistribution request to update the configuration for your distribution:   In the request body, include the XML document that you updated in Step 2. The request body must include an XML document with a DistributionConfig element.   Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GetDistributionConfig request in Step 1.     Review the response to the UpdateDistribution request to confirm that the configuration was successfully updated.   Optional: Submit a GetDistribution request to confirm that your changes have propagated. When propagation is complete, the value of Status is Deployed.  
     */
  def updateDistribution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the configuration for a web distribution.   When you update a distribution, there are more required fields than when you create a distribution. When you update your distribution by using this API action, follow the steps here to get the current configuration and then make your updates, to make sure that you include all of the required fields. To view a summary, see Required Fields for Create Distribution and Update Distribution in the Amazon CloudFront Developer Guide.  The update process includes getting the current distribution configuration, updating the XML document that is returned to make your changes, and then submitting an UpdateDistribution request to make the updates. For information about updating a distribution using the CloudFront console instead, see Creating a Distribution in the Amazon CloudFront Developer Guide.  To update a web distribution using the CloudFront API    Submit a GetDistributionConfig request to get the current configuration and an Etag header for the distribution.  If you update the distribution again, you must get a new Etag header.    Update the XML document that was returned in the response to your GetDistributionConfig request to include your changes.   When you edit the XML file, be aware of the following:   You must strip out the ETag parameter that is returned.   Additional fields are required when you update a distribution. There may be fields included in the XML file for features that you haven't configured for your distribution. This is expected and required to successfully update the distribution.   You can't change the value of CallerReference. If you try to change this value, CloudFront returns an IllegalUpdate error.    The new configuration replaces the existing configuration; the values that you specify in an UpdateDistribution request are not merged into your existing configuration. When you add, delete, or replace values in an element that allows multiple values (for example, CNAME), you must specify all of the values that you want to appear in the updated distribution. In addition, you must update the corresponding Quantity element.      Submit an UpdateDistribution request to update the configuration for your distribution:   In the request body, include the XML document that you updated in Step 2. The request body must include an XML document with a DistributionConfig element.   Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GetDistributionConfig request in Step 1.     Review the response to the UpdateDistribution request to confirm that the configuration was successfully updated.   Optional: Submit a GetDistribution request to confirm that your changes have propagated. When propagation is complete, the value of Status is Deployed.  
     */
  def updateDistribution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the configuration for a web distribution.   When you update a distribution, there are more required fields than when you create a distribution. When you update your distribution by using this API action, follow the steps here to get the current configuration and then make your updates, to make sure that you include all of the required fields. To view a summary, see Required Fields for Create Distribution and Update Distribution in the Amazon CloudFront Developer Guide.  The update process includes getting the current distribution configuration, updating the XML document that is returned to make your changes, and then submitting an UpdateDistribution request to make the updates. For information about updating a distribution using the CloudFront console instead, see Creating a Distribution in the Amazon CloudFront Developer Guide.  To update a web distribution using the CloudFront API    Submit a GetDistributionConfig request to get the current configuration and an Etag header for the distribution.  If you update the distribution again, you must get a new Etag header.    Update the XML document that was returned in the response to your GetDistributionConfig request to include your changes.   When you edit the XML file, be aware of the following:   You must strip out the ETag parameter that is returned.   Additional fields are required when you update a distribution. There may be fields included in the XML file for features that you haven't configured for your distribution. This is expected and required to successfully update the distribution.   You can't change the value of CallerReference. If you try to change this value, CloudFront returns an IllegalUpdate error.    The new configuration replaces the existing configuration; the values that you specify in an UpdateDistribution request are not merged into your existing configuration. When you add, delete, or replace values in an element that allows multiple values (for example, CNAME), you must specify all of the values that you want to appear in the updated distribution. In addition, you must update the corresponding Quantity element.      Submit an UpdateDistribution request to update the configuration for your distribution:   In the request body, include the XML document that you updated in Step 2. The request body must include an XML document with a DistributionConfig element.   Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GetDistributionConfig request in Step 1.     Review the response to the UpdateDistribution request to confirm that the configuration was successfully updated.   Optional: Submit a GetDistribution request to confirm that your changes have propagated. When propagation is complete, the value of Status is Deployed.  
     */
  def updateDistribution(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateDistributionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the configuration for a web distribution.   When you update a distribution, there are more required fields than when you create a distribution. When you update your distribution by using this API action, follow the steps here to get the current configuration and then make your updates, to make sure that you include all of the required fields. To view a summary, see Required Fields for Create Distribution and Update Distribution in the Amazon CloudFront Developer Guide.  The update process includes getting the current distribution configuration, updating the XML document that is returned to make your changes, and then submitting an UpdateDistribution request to make the updates. For information about updating a distribution using the CloudFront console instead, see Creating a Distribution in the Amazon CloudFront Developer Guide.  To update a web distribution using the CloudFront API    Submit a GetDistributionConfig request to get the current configuration and an Etag header for the distribution.  If you update the distribution again, you must get a new Etag header.    Update the XML document that was returned in the response to your GetDistributionConfig request to include your changes.   When you edit the XML file, be aware of the following:   You must strip out the ETag parameter that is returned.   Additional fields are required when you update a distribution. There may be fields included in the XML file for features that you haven't configured for your distribution. This is expected and required to successfully update the distribution.   You can't change the value of CallerReference. If you try to change this value, CloudFront returns an IllegalUpdate error.    The new configuration replaces the existing configuration; the values that you specify in an UpdateDistribution request are not merged into your existing configuration. When you add, delete, or replace values in an element that allows multiple values (for example, CNAME), you must specify all of the values that you want to appear in the updated distribution. In addition, you must update the corresponding Quantity element.      Submit an UpdateDistribution request to update the configuration for your distribution:   In the request body, include the XML document that you updated in Step 2. The request body must include an XML document with a DistributionConfig element.   Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GetDistributionConfig request in Step 1.     Review the response to the UpdateDistribution request to confirm that the configuration was successfully updated.   Optional: Submit a GetDistribution request to confirm that your changes have propagated. When propagation is complete, the value of Status is Deployed.  
     */
  def updateDistribution(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateDistributionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update a field-level encryption configuration. 
     */
  def updateFieldLevelEncryptionConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateFieldLevelEncryptionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update a field-level encryption configuration. 
     */
  def updateFieldLevelEncryptionConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateFieldLevelEncryptionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateFieldLevelEncryptionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update a field-level encryption configuration. 
     */
  def updateFieldLevelEncryptionConfig(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateFieldLevelEncryptionConfigRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateFieldLevelEncryptionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update a field-level encryption configuration. 
     */
  def updateFieldLevelEncryptionConfig(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateFieldLevelEncryptionConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateFieldLevelEncryptionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateFieldLevelEncryptionConfigResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update a field-level encryption profile. 
     */
  def updateFieldLevelEncryptionProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateFieldLevelEncryptionProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update a field-level encryption profile. 
     */
  def updateFieldLevelEncryptionProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateFieldLevelEncryptionProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateFieldLevelEncryptionProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update a field-level encryption profile. 
     */
  def updateFieldLevelEncryptionProfile(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateFieldLevelEncryptionProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateFieldLevelEncryptionProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update a field-level encryption profile. 
     */
  def updateFieldLevelEncryptionProfile(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateFieldLevelEncryptionProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateFieldLevelEncryptionProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateFieldLevelEncryptionProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update public key information. Note that the only value you can change is the comment.
     */
  def updatePublicKey(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdatePublicKeyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update public key information. Note that the only value you can change is the comment.
     */
  def updatePublicKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdatePublicKeyResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdatePublicKeyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update public key information. Note that the only value you can change is the comment.
     */
  def updatePublicKey(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdatePublicKeyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdatePublicKeyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update public key information. Note that the only value you can change is the comment.
     */
  def updatePublicKey(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdatePublicKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdatePublicKeyResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdatePublicKeyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update a streaming distribution. 
     */
  def updateStreamingDistribution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateStreamingDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update a streaming distribution. 
     */
  def updateStreamingDistribution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateStreamingDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateStreamingDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update a streaming distribution. 
     */
  def updateStreamingDistribution(params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateStreamingDistributionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateStreamingDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update a streaming distribution. 
     */
  def updateStreamingDistribution(
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateStreamingDistributionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateStreamingDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.UpdateStreamingDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the distributionDeployed state by periodically calling the underlying CloudFront.getDistributionoperation every 60 seconds (at most 25 times). Wait until a distribution is deployed.
     */
  @JSName("waitFor")
  def waitFor_distributionDeployed(state: awsDashSdkLib.awsDashSdkLibStrings.distributionDeployed): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the distributionDeployed state by periodically calling the underlying CloudFront.getDistributionoperation every 60 seconds (at most 25 times). Wait until a distribution is deployed.
     */
  @JSName("waitFor")
  def waitFor_distributionDeployed(
    state: awsDashSdkLib.awsDashSdkLibStrings.distributionDeployed,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the distributionDeployed state by periodically calling the underlying CloudFront.getDistributionoperation every 60 seconds (at most 25 times). Wait until a distribution is deployed.
     */
  @JSName("waitFor")
  def waitFor_distributionDeployed(
    state: awsDashSdkLib.awsDashSdkLibStrings.distributionDeployed,
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetDistributionRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the distributionDeployed state by periodically calling the underlying CloudFront.getDistributionoperation every 60 seconds (at most 25 times). Wait until a distribution is deployed.
     */
  @JSName("waitFor")
  def waitFor_distributionDeployed(
    state: awsDashSdkLib.awsDashSdkLibStrings.distributionDeployed,
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetDistributionRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the invalidationCompleted state by periodically calling the underlying CloudFront.getInvalidationoperation every 20 seconds (at most 30 times). Wait until an invalidation has completed.
     */
  @JSName("waitFor")
  def waitFor_invalidationCompleted(state: awsDashSdkLib.awsDashSdkLibStrings.invalidationCompleted): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetInvalidationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the invalidationCompleted state by periodically calling the underlying CloudFront.getInvalidationoperation every 20 seconds (at most 30 times). Wait until an invalidation has completed.
     */
  @JSName("waitFor")
  def waitFor_invalidationCompleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.invalidationCompleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetInvalidationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetInvalidationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the invalidationCompleted state by periodically calling the underlying CloudFront.getInvalidationoperation every 20 seconds (at most 30 times). Wait until an invalidation has completed.
     */
  @JSName("waitFor")
  def waitFor_invalidationCompleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.invalidationCompleted,
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetInvalidationRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetInvalidationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the invalidationCompleted state by periodically calling the underlying CloudFront.getInvalidationoperation every 20 seconds (at most 30 times). Wait until an invalidation has completed.
     */
  @JSName("waitFor")
  def waitFor_invalidationCompleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.invalidationCompleted,
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetInvalidationRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetInvalidationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetInvalidationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the streamingDistributionDeployed state by periodically calling the underlying CloudFront.getStreamingDistributionoperation every 60 seconds (at most 25 times). Wait until a streaming distribution is deployed.
     */
  @JSName("waitFor")
  def waitFor_streamingDistributionDeployed(state: awsDashSdkLib.awsDashSdkLibStrings.streamingDistributionDeployed): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetStreamingDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the streamingDistributionDeployed state by periodically calling the underlying CloudFront.getStreamingDistributionoperation every 60 seconds (at most 25 times). Wait until a streaming distribution is deployed.
     */
  @JSName("waitFor")
  def waitFor_streamingDistributionDeployed(
    state: awsDashSdkLib.awsDashSdkLibStrings.streamingDistributionDeployed,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetStreamingDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetStreamingDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the streamingDistributionDeployed state by periodically calling the underlying CloudFront.getStreamingDistributionoperation every 60 seconds (at most 25 times). Wait until a streaming distribution is deployed.
     */
  @JSName("waitFor")
  def waitFor_streamingDistributionDeployed(
    state: awsDashSdkLib.awsDashSdkLibStrings.streamingDistributionDeployed,
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetStreamingDistributionRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetStreamingDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the streamingDistributionDeployed state by periodically calling the underlying CloudFront.getStreamingDistributionoperation every 60 seconds (at most 25 times). Wait until a streaming distribution is deployed.
     */
  @JSName("waitFor")
  def waitFor_streamingDistributionDeployed(
    state: awsDashSdkLib.awsDashSdkLibStrings.streamingDistributionDeployed,
    params: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetStreamingDistributionRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetStreamingDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.GetStreamingDistributionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

