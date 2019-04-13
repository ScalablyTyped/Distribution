package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFront
  extends awsDashSdkLib.libServicesCloudfrontMod.CloudFrontCustomizations {
  @JSName("config")
  var config_CloudFront: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a new origin access identity. If you're using Amazon S3 for your origin, you can use an origin access identity to require users to access your content using a CloudFront URL instead of the Amazon S3 URL. For more information about how to use origin access identities, see Serving Private Content through CloudFront in the Amazon CloudFront Developer Guide.
    */
  def createCloudFrontOriginAccessIdentity(): awsDashSdkLib.libRequestMod.Request[CreateCloudFrontOriginAccessIdentityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCloudFrontOriginAccessIdentity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCloudFrontOriginAccessIdentityResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCloudFrontOriginAccessIdentityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new origin access identity. If you're using Amazon S3 for your origin, you can use an origin access identity to require users to access your content using a CloudFront URL instead of the Amazon S3 URL. For more information about how to use origin access identities, see Serving Private Content through CloudFront in the Amazon CloudFront Developer Guide.
    */
  def createCloudFrontOriginAccessIdentity(params: CreateCloudFrontOriginAccessIdentityRequest): awsDashSdkLib.libRequestMod.Request[CreateCloudFrontOriginAccessIdentityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCloudFrontOriginAccessIdentity(
    params: CreateCloudFrontOriginAccessIdentityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCloudFrontOriginAccessIdentityResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCloudFrontOriginAccessIdentityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new web distribution. You create a CloudFront distribution to tell CloudFront where you want content to be delivered from, and the details about how to track and manage content delivery. Send a POST request to the /CloudFront API version/distribution/distribution ID resource.  When you update a distribution, there are more required fields than when you create a distribution. When you update your distribution by using UpdateDistribution, follow the steps included in the documentation to get the current configuration and then make your updates. This helps to make sure that you include all of the required fields. To view a summary, see Required Fields for Create Distribution and Update Distribution in the Amazon CloudFront Developer Guide.  If you are using Adobe Flash Media Server's RTMP protocol, you set up a different kind of CloudFront distribution. For more information, see CreateStreamingDistribution.
    */
  def createDistribution(): awsDashSdkLib.libRequestMod.Request[CreateDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDistribution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new web distribution. You create a CloudFront distribution to tell CloudFront where you want content to be delivered from, and the details about how to track and manage content delivery. Send a POST request to the /CloudFront API version/distribution/distribution ID resource.  When you update a distribution, there are more required fields than when you create a distribution. When you update your distribution by using UpdateDistribution, follow the steps included in the documentation to get the current configuration and then make your updates. This helps to make sure that you include all of the required fields. To view a summary, see Required Fields for Create Distribution and Update Distribution in the Amazon CloudFront Developer Guide.  If you are using Adobe Flash Media Server's RTMP protocol, you set up a different kind of CloudFront distribution. For more information, see CreateStreamingDistribution.
    */
  def createDistribution(params: CreateDistributionRequest): awsDashSdkLib.libRequestMod.Request[CreateDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDistribution(
    params: CreateDistributionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create a new distribution with tags.
    */
  def createDistributionWithTags(): awsDashSdkLib.libRequestMod.Request[CreateDistributionWithTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDistributionWithTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDistributionWithTagsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDistributionWithTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create a new distribution with tags.
    */
  def createDistributionWithTags(params: CreateDistributionWithTagsRequest): awsDashSdkLib.libRequestMod.Request[CreateDistributionWithTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDistributionWithTags(
    params: CreateDistributionWithTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDistributionWithTagsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDistributionWithTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create a new field-level encryption configuration.
    */
  def createFieldLevelEncryptionConfig(): awsDashSdkLib.libRequestMod.Request[CreateFieldLevelEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createFieldLevelEncryptionConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateFieldLevelEncryptionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateFieldLevelEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create a new field-level encryption configuration.
    */
  def createFieldLevelEncryptionConfig(params: CreateFieldLevelEncryptionConfigRequest): awsDashSdkLib.libRequestMod.Request[CreateFieldLevelEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createFieldLevelEncryptionConfig(
    params: CreateFieldLevelEncryptionConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateFieldLevelEncryptionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateFieldLevelEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create a field-level encryption profile.
    */
  def createFieldLevelEncryptionProfile(): awsDashSdkLib.libRequestMod.Request[CreateFieldLevelEncryptionProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createFieldLevelEncryptionProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateFieldLevelEncryptionProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateFieldLevelEncryptionProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create a field-level encryption profile.
    */
  def createFieldLevelEncryptionProfile(params: CreateFieldLevelEncryptionProfileRequest): awsDashSdkLib.libRequestMod.Request[CreateFieldLevelEncryptionProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createFieldLevelEncryptionProfile(
    params: CreateFieldLevelEncryptionProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateFieldLevelEncryptionProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateFieldLevelEncryptionProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create a new invalidation. 
    */
  def createInvalidation(): awsDashSdkLib.libRequestMod.Request[CreateInvalidationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createInvalidation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateInvalidationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateInvalidationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create a new invalidation. 
    */
  def createInvalidation(params: CreateInvalidationRequest): awsDashSdkLib.libRequestMod.Request[CreateInvalidationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createInvalidation(
    params: CreateInvalidationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateInvalidationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateInvalidationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Add a new public key to CloudFront to use, for example, for field-level encryption. You can add a maximum of 10 public keys with one AWS account.
    */
  def createPublicKey(): awsDashSdkLib.libRequestMod.Request[CreatePublicKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPublicKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePublicKeyResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePublicKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Add a new public key to CloudFront to use, for example, for field-level encryption. You can add a maximum of 10 public keys with one AWS account.
    */
  def createPublicKey(params: CreatePublicKeyRequest): awsDashSdkLib.libRequestMod.Request[CreatePublicKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPublicKey(
    params: CreatePublicKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePublicKeyResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePublicKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new RMTP distribution. An RTMP distribution is similar to a web distribution, but an RTMP distribution streams media files using the Adobe Real-Time Messaging Protocol (RTMP) instead of serving files using HTTP.  To create a new web distribution, submit a POST request to the CloudFront API version/distribution resource. The request body must include a document with a StreamingDistributionConfig element. The response echoes the StreamingDistributionConfig element and returns other information about the RTMP distribution. To get the status of your request, use the GET StreamingDistribution API action. When the value of Enabled is true and the value of Status is Deployed, your distribution is ready. A distribution usually deploys in less than 15 minutes. For more information about web distributions, see Working with RTMP Distributions in the Amazon CloudFront Developer Guide.  Beginning with the 2012-05-05 version of the CloudFront API, we made substantial changes to the format of the XML document that you include in the request body when you create or update a web distribution or an RTMP distribution, and when you invalidate objects. With previous versions of the API, we discovered that it was too easy to accidentally delete one or more values for an element that accepts multiple values, for example, CNAMEs and trusted signers. Our changes for the 2012-05-05 release are intended to prevent these accidental deletions and to notify you when there's a mismatch between the number of values you say you're specifying in the Quantity element and the number of values specified. 
    */
  def createStreamingDistribution(): awsDashSdkLib.libRequestMod.Request[CreateStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createStreamingDistribution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateStreamingDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new RMTP distribution. An RTMP distribution is similar to a web distribution, but an RTMP distribution streams media files using the Adobe Real-Time Messaging Protocol (RTMP) instead of serving files using HTTP.  To create a new web distribution, submit a POST request to the CloudFront API version/distribution resource. The request body must include a document with a StreamingDistributionConfig element. The response echoes the StreamingDistributionConfig element and returns other information about the RTMP distribution. To get the status of your request, use the GET StreamingDistribution API action. When the value of Enabled is true and the value of Status is Deployed, your distribution is ready. A distribution usually deploys in less than 15 minutes. For more information about web distributions, see Working with RTMP Distributions in the Amazon CloudFront Developer Guide.  Beginning with the 2012-05-05 version of the CloudFront API, we made substantial changes to the format of the XML document that you include in the request body when you create or update a web distribution or an RTMP distribution, and when you invalidate objects. With previous versions of the API, we discovered that it was too easy to accidentally delete one or more values for an element that accepts multiple values, for example, CNAMEs and trusted signers. Our changes for the 2012-05-05 release are intended to prevent these accidental deletions and to notify you when there's a mismatch between the number of values you say you're specifying in the Quantity element and the number of values specified. 
    */
  def createStreamingDistribution(params: CreateStreamingDistributionRequest): awsDashSdkLib.libRequestMod.Request[CreateStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createStreamingDistribution(
    params: CreateStreamingDistributionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateStreamingDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create a new streaming distribution with tags.
    */
  def createStreamingDistributionWithTags(): awsDashSdkLib.libRequestMod.Request[CreateStreamingDistributionWithTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createStreamingDistributionWithTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateStreamingDistributionWithTagsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateStreamingDistributionWithTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create a new streaming distribution with tags.
    */
  def createStreamingDistributionWithTags(params: CreateStreamingDistributionWithTagsRequest): awsDashSdkLib.libRequestMod.Request[CreateStreamingDistributionWithTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createStreamingDistributionWithTags(
    params: CreateStreamingDistributionWithTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateStreamingDistributionWithTagsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateStreamingDistributionWithTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delete an origin access identity. 
    */
  def deleteCloudFrontOriginAccessIdentity(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCloudFrontOriginAccessIdentity(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delete an origin access identity. 
    */
  def deleteCloudFrontOriginAccessIdentity(params: DeleteCloudFrontOriginAccessIdentityRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCloudFrontOriginAccessIdentity(
    params: DeleteCloudFrontOriginAccessIdentityRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delete a distribution. 
    */
  def deleteDistribution(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDistribution(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delete a distribution. 
    */
  def deleteDistribution(params: DeleteDistributionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDistribution(
    params: DeleteDistributionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Remove a field-level encryption configuration.
    */
  def deleteFieldLevelEncryptionConfig(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFieldLevelEncryptionConfig(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Remove a field-level encryption configuration.
    */
  def deleteFieldLevelEncryptionConfig(params: DeleteFieldLevelEncryptionConfigRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFieldLevelEncryptionConfig(
    params: DeleteFieldLevelEncryptionConfigRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Remove a field-level encryption profile.
    */
  def deleteFieldLevelEncryptionProfile(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFieldLevelEncryptionProfile(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Remove a field-level encryption profile.
    */
  def deleteFieldLevelEncryptionProfile(params: DeleteFieldLevelEncryptionProfileRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFieldLevelEncryptionProfile(
    params: DeleteFieldLevelEncryptionProfileRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Remove a public key you previously added to CloudFront.
    */
  def deletePublicKey(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePublicKey(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Remove a public key you previously added to CloudFront.
    */
  def deletePublicKey(params: DeletePublicKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePublicKey(
    params: DeletePublicKeyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delete a streaming distribution. To delete an RTMP distribution using the CloudFront API, perform the following steps.  To delete an RTMP distribution using the CloudFront API:   Disable the RTMP distribution.   Submit a GET Streaming Distribution Config request to get the current configuration and the Etag header for the distribution.    Update the XML document that was returned in the response to your GET Streaming Distribution Config request to change the value of Enabled to false.   Submit a PUT Streaming Distribution Config request to update the configuration for your distribution. In the request body, include the XML document that you updated in Step 3. Then set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Streaming Distribution Config request in Step 2.   Review the response to the PUT Streaming Distribution Config request to confirm that the distribution was successfully disabled.   Submit a GET Streaming Distribution Config request to confirm that your changes have propagated. When propagation is complete, the value of Status is Deployed.   Submit a DELETE Streaming Distribution request. Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Streaming Distribution Config request in Step 2.   Review the response to your DELETE Streaming Distribution request to confirm that the distribution was successfully deleted.   For information about deleting a distribution using the CloudFront console, see Deleting a Distribution in the Amazon CloudFront Developer Guide.
    */
  def deleteStreamingDistribution(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteStreamingDistribution(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delete a streaming distribution. To delete an RTMP distribution using the CloudFront API, perform the following steps.  To delete an RTMP distribution using the CloudFront API:   Disable the RTMP distribution.   Submit a GET Streaming Distribution Config request to get the current configuration and the Etag header for the distribution.    Update the XML document that was returned in the response to your GET Streaming Distribution Config request to change the value of Enabled to false.   Submit a PUT Streaming Distribution Config request to update the configuration for your distribution. In the request body, include the XML document that you updated in Step 3. Then set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Streaming Distribution Config request in Step 2.   Review the response to the PUT Streaming Distribution Config request to confirm that the distribution was successfully disabled.   Submit a GET Streaming Distribution Config request to confirm that your changes have propagated. When propagation is complete, the value of Status is Deployed.   Submit a DELETE Streaming Distribution request. Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Streaming Distribution Config request in Step 2.   Review the response to your DELETE Streaming Distribution request to confirm that the distribution was successfully deleted.   For information about deleting a distribution using the CloudFront console, see Deleting a Distribution in the Amazon CloudFront Developer Guide.
    */
  def deleteStreamingDistribution(params: DeleteStreamingDistributionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteStreamingDistribution(
    params: DeleteStreamingDistributionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the information about an origin access identity. 
    */
  def getCloudFrontOriginAccessIdentity(): awsDashSdkLib.libRequestMod.Request[GetCloudFrontOriginAccessIdentityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCloudFrontOriginAccessIdentity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCloudFrontOriginAccessIdentityResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCloudFrontOriginAccessIdentityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the information about an origin access identity. 
    */
  def getCloudFrontOriginAccessIdentity(params: GetCloudFrontOriginAccessIdentityRequest): awsDashSdkLib.libRequestMod.Request[GetCloudFrontOriginAccessIdentityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCloudFrontOriginAccessIdentity(
    params: GetCloudFrontOriginAccessIdentityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCloudFrontOriginAccessIdentityResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCloudFrontOriginAccessIdentityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the configuration information about an origin access identity. 
    */
  def getCloudFrontOriginAccessIdentityConfig(): awsDashSdkLib.libRequestMod.Request[GetCloudFrontOriginAccessIdentityConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCloudFrontOriginAccessIdentityConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCloudFrontOriginAccessIdentityConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCloudFrontOriginAccessIdentityConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the configuration information about an origin access identity. 
    */
  def getCloudFrontOriginAccessIdentityConfig(params: GetCloudFrontOriginAccessIdentityConfigRequest): awsDashSdkLib.libRequestMod.Request[GetCloudFrontOriginAccessIdentityConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCloudFrontOriginAccessIdentityConfig(
    params: GetCloudFrontOriginAccessIdentityConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCloudFrontOriginAccessIdentityConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCloudFrontOriginAccessIdentityConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the information about a distribution. 
    */
  def getDistribution(): awsDashSdkLib.libRequestMod.Request[GetDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDistribution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the information about a distribution. 
    */
  def getDistribution(params: GetDistributionRequest): awsDashSdkLib.libRequestMod.Request[GetDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDistribution(
    params: GetDistributionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the configuration information about a distribution. 
    */
  def getDistributionConfig(): awsDashSdkLib.libRequestMod.Request[GetDistributionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDistributionConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDistributionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDistributionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the configuration information about a distribution. 
    */
  def getDistributionConfig(params: GetDistributionConfigRequest): awsDashSdkLib.libRequestMod.Request[GetDistributionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDistributionConfig(
    params: GetDistributionConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDistributionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDistributionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the field-level encryption configuration information.
    */
  def getFieldLevelEncryption(): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFieldLevelEncryption(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFieldLevelEncryptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the field-level encryption configuration information.
    */
  def getFieldLevelEncryption(params: GetFieldLevelEncryptionRequest): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFieldLevelEncryption(
    params: GetFieldLevelEncryptionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFieldLevelEncryptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the field-level encryption configuration information.
    */
  def getFieldLevelEncryptionConfig(): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFieldLevelEncryptionConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFieldLevelEncryptionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the field-level encryption configuration information.
    */
  def getFieldLevelEncryptionConfig(params: GetFieldLevelEncryptionConfigRequest): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFieldLevelEncryptionConfig(
    params: GetFieldLevelEncryptionConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFieldLevelEncryptionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the field-level encryption profile information.
    */
  def getFieldLevelEncryptionProfile(): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFieldLevelEncryptionProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFieldLevelEncryptionProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the field-level encryption profile information.
    */
  def getFieldLevelEncryptionProfile(params: GetFieldLevelEncryptionProfileRequest): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFieldLevelEncryptionProfile(
    params: GetFieldLevelEncryptionProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFieldLevelEncryptionProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the field-level encryption profile configuration information.
    */
  def getFieldLevelEncryptionProfileConfig(): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionProfileConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFieldLevelEncryptionProfileConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFieldLevelEncryptionProfileConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionProfileConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the field-level encryption profile configuration information.
    */
  def getFieldLevelEncryptionProfileConfig(params: GetFieldLevelEncryptionProfileConfigRequest): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionProfileConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFieldLevelEncryptionProfileConfig(
    params: GetFieldLevelEncryptionProfileConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFieldLevelEncryptionProfileConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionProfileConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the information about an invalidation. 
    */
  def getInvalidation(): awsDashSdkLib.libRequestMod.Request[GetInvalidationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInvalidation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInvalidationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInvalidationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the information about an invalidation. 
    */
  def getInvalidation(params: GetInvalidationRequest): awsDashSdkLib.libRequestMod.Request[GetInvalidationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInvalidation(
    params: GetInvalidationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInvalidationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInvalidationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the public key information.
    */
  def getPublicKey(): awsDashSdkLib.libRequestMod.Request[GetPublicKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPublicKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPublicKeyResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPublicKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the public key information.
    */
  def getPublicKey(params: GetPublicKeyRequest): awsDashSdkLib.libRequestMod.Request[GetPublicKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPublicKey(
    params: GetPublicKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPublicKeyResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPublicKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Return public key configuration informaation
    */
  def getPublicKeyConfig(): awsDashSdkLib.libRequestMod.Request[GetPublicKeyConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPublicKeyConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPublicKeyConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPublicKeyConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Return public key configuration informaation
    */
  def getPublicKeyConfig(params: GetPublicKeyConfigRequest): awsDashSdkLib.libRequestMod.Request[GetPublicKeyConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPublicKeyConfig(
    params: GetPublicKeyConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPublicKeyConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPublicKeyConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a specified RTMP distribution, including the distribution configuration.
    */
  def getStreamingDistribution(): awsDashSdkLib.libRequestMod.Request[GetStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getStreamingDistribution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetStreamingDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a specified RTMP distribution, including the distribution configuration.
    */
  def getStreamingDistribution(params: GetStreamingDistributionRequest): awsDashSdkLib.libRequestMod.Request[GetStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getStreamingDistribution(
    params: GetStreamingDistributionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetStreamingDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the configuration information about a streaming distribution. 
    */
  def getStreamingDistributionConfig(): awsDashSdkLib.libRequestMod.Request[GetStreamingDistributionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getStreamingDistributionConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetStreamingDistributionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetStreamingDistributionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the configuration information about a streaming distribution. 
    */
  def getStreamingDistributionConfig(params: GetStreamingDistributionConfigRequest): awsDashSdkLib.libRequestMod.Request[GetStreamingDistributionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getStreamingDistributionConfig(
    params: GetStreamingDistributionConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetStreamingDistributionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetStreamingDistributionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists origin access identities.
    */
  def listCloudFrontOriginAccessIdentities(): awsDashSdkLib.libRequestMod.Request[ListCloudFrontOriginAccessIdentitiesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCloudFrontOriginAccessIdentities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCloudFrontOriginAccessIdentitiesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCloudFrontOriginAccessIdentitiesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists origin access identities.
    */
  def listCloudFrontOriginAccessIdentities(params: ListCloudFrontOriginAccessIdentitiesRequest): awsDashSdkLib.libRequestMod.Request[ListCloudFrontOriginAccessIdentitiesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCloudFrontOriginAccessIdentities(
    params: ListCloudFrontOriginAccessIdentitiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCloudFrontOriginAccessIdentitiesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCloudFrontOriginAccessIdentitiesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List distributions. 
    */
  def listDistributions(): awsDashSdkLib.libRequestMod.Request[ListDistributionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDistributions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDistributionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDistributionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List distributions. 
    */
  def listDistributions(params: ListDistributionsRequest): awsDashSdkLib.libRequestMod.Request[ListDistributionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDistributions(
    params: ListDistributionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDistributionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDistributionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List the distributions that are associated with a specified AWS WAF web ACL. 
    */
  def listDistributionsByWebACLId(): awsDashSdkLib.libRequestMod.Request[ListDistributionsByWebACLIdResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDistributionsByWebACLId(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDistributionsByWebACLIdResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDistributionsByWebACLIdResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List the distributions that are associated with a specified AWS WAF web ACL. 
    */
  def listDistributionsByWebACLId(params: ListDistributionsByWebACLIdRequest): awsDashSdkLib.libRequestMod.Request[ListDistributionsByWebACLIdResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDistributionsByWebACLId(
    params: ListDistributionsByWebACLIdRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDistributionsByWebACLIdResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDistributionsByWebACLIdResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List all field-level encryption configurations that have been created in CloudFront for this account.
    */
  def listFieldLevelEncryptionConfigs(): awsDashSdkLib.libRequestMod.Request[ListFieldLevelEncryptionConfigsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listFieldLevelEncryptionConfigs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListFieldLevelEncryptionConfigsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListFieldLevelEncryptionConfigsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List all field-level encryption configurations that have been created in CloudFront for this account.
    */
  def listFieldLevelEncryptionConfigs(params: ListFieldLevelEncryptionConfigsRequest): awsDashSdkLib.libRequestMod.Request[ListFieldLevelEncryptionConfigsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listFieldLevelEncryptionConfigs(
    params: ListFieldLevelEncryptionConfigsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListFieldLevelEncryptionConfigsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListFieldLevelEncryptionConfigsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Request a list of field-level encryption profiles that have been created in CloudFront for this account.
    */
  def listFieldLevelEncryptionProfiles(): awsDashSdkLib.libRequestMod.Request[ListFieldLevelEncryptionProfilesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listFieldLevelEncryptionProfiles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListFieldLevelEncryptionProfilesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListFieldLevelEncryptionProfilesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Request a list of field-level encryption profiles that have been created in CloudFront for this account.
    */
  def listFieldLevelEncryptionProfiles(params: ListFieldLevelEncryptionProfilesRequest): awsDashSdkLib.libRequestMod.Request[ListFieldLevelEncryptionProfilesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listFieldLevelEncryptionProfiles(
    params: ListFieldLevelEncryptionProfilesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListFieldLevelEncryptionProfilesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListFieldLevelEncryptionProfilesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists invalidation batches. 
    */
  def listInvalidations(): awsDashSdkLib.libRequestMod.Request[ListInvalidationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listInvalidations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListInvalidationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListInvalidationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists invalidation batches. 
    */
  def listInvalidations(params: ListInvalidationsRequest): awsDashSdkLib.libRequestMod.Request[ListInvalidationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listInvalidations(
    params: ListInvalidationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListInvalidationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListInvalidationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List all public keys that have been added to CloudFront for this account.
    */
  def listPublicKeys(): awsDashSdkLib.libRequestMod.Request[ListPublicKeysResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPublicKeys(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPublicKeysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPublicKeysResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List all public keys that have been added to CloudFront for this account.
    */
  def listPublicKeys(params: ListPublicKeysRequest): awsDashSdkLib.libRequestMod.Request[ListPublicKeysResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPublicKeys(
    params: ListPublicKeysRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPublicKeysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPublicKeysResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List streaming distributions. 
    */
  def listStreamingDistributions(): awsDashSdkLib.libRequestMod.Request[ListStreamingDistributionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listStreamingDistributions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListStreamingDistributionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListStreamingDistributionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List streaming distributions. 
    */
  def listStreamingDistributions(params: ListStreamingDistributionsRequest): awsDashSdkLib.libRequestMod.Request[ListStreamingDistributionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listStreamingDistributions(
    params: ListStreamingDistributionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListStreamingDistributionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListStreamingDistributionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List tags for a CloudFront resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List tags for a CloudFront resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Add tags to a CloudFront resource.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Add tags to a CloudFront resource.
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Remove tags from a CloudFront resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Remove tags from a CloudFront resource.
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update an origin access identity. 
    */
  def updateCloudFrontOriginAccessIdentity(): awsDashSdkLib.libRequestMod.Request[UpdateCloudFrontOriginAccessIdentityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCloudFrontOriginAccessIdentity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateCloudFrontOriginAccessIdentityResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateCloudFrontOriginAccessIdentityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update an origin access identity. 
    */
  def updateCloudFrontOriginAccessIdentity(params: UpdateCloudFrontOriginAccessIdentityRequest): awsDashSdkLib.libRequestMod.Request[UpdateCloudFrontOriginAccessIdentityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCloudFrontOriginAccessIdentity(
    params: UpdateCloudFrontOriginAccessIdentityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateCloudFrontOriginAccessIdentityResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateCloudFrontOriginAccessIdentityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the configuration for a web distribution.   When you update a distribution, there are more required fields than when you create a distribution. When you update your distribution by using this API action, follow the steps here to get the current configuration and then make your updates, to make sure that you include all of the required fields. To view a summary, see Required Fields for Create Distribution and Update Distribution in the Amazon CloudFront Developer Guide.  The update process includes getting the current distribution configuration, updating the XML document that is returned to make your changes, and then submitting an UpdateDistribution request to make the updates. For information about updating a distribution using the CloudFront console instead, see Creating a Distribution in the Amazon CloudFront Developer Guide.  To update a web distribution using the CloudFront API    Submit a GetDistributionConfig request to get the current configuration and an Etag header for the distribution.  If you update the distribution again, you must get a new Etag header.    Update the XML document that was returned in the response to your GetDistributionConfig request to include your changes.   When you edit the XML file, be aware of the following:   You must strip out the ETag parameter that is returned.   Additional fields are required when you update a distribution. There may be fields included in the XML file for features that you haven't configured for your distribution. This is expected and required to successfully update the distribution.   You can't change the value of CallerReference. If you try to change this value, CloudFront returns an IllegalUpdate error.    The new configuration replaces the existing configuration; the values that you specify in an UpdateDistribution request are not merged into your existing configuration. When you add, delete, or replace values in an element that allows multiple values (for example, CNAME), you must specify all of the values that you want to appear in the updated distribution. In addition, you must update the corresponding Quantity element.      Submit an UpdateDistribution request to update the configuration for your distribution:   In the request body, include the XML document that you updated in Step 2. The request body must include an XML document with a DistributionConfig element.   Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GetDistributionConfig request in Step 1.     Review the response to the UpdateDistribution request to confirm that the configuration was successfully updated.   Optional: Submit a GetDistribution request to confirm that your changes have propagated. When propagation is complete, the value of Status is Deployed.  
    */
  def updateDistribution(): awsDashSdkLib.libRequestMod.Request[UpdateDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDistribution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the configuration for a web distribution.   When you update a distribution, there are more required fields than when you create a distribution. When you update your distribution by using this API action, follow the steps here to get the current configuration and then make your updates, to make sure that you include all of the required fields. To view a summary, see Required Fields for Create Distribution and Update Distribution in the Amazon CloudFront Developer Guide.  The update process includes getting the current distribution configuration, updating the XML document that is returned to make your changes, and then submitting an UpdateDistribution request to make the updates. For information about updating a distribution using the CloudFront console instead, see Creating a Distribution in the Amazon CloudFront Developer Guide.  To update a web distribution using the CloudFront API    Submit a GetDistributionConfig request to get the current configuration and an Etag header for the distribution.  If you update the distribution again, you must get a new Etag header.    Update the XML document that was returned in the response to your GetDistributionConfig request to include your changes.   When you edit the XML file, be aware of the following:   You must strip out the ETag parameter that is returned.   Additional fields are required when you update a distribution. There may be fields included in the XML file for features that you haven't configured for your distribution. This is expected and required to successfully update the distribution.   You can't change the value of CallerReference. If you try to change this value, CloudFront returns an IllegalUpdate error.    The new configuration replaces the existing configuration; the values that you specify in an UpdateDistribution request are not merged into your existing configuration. When you add, delete, or replace values in an element that allows multiple values (for example, CNAME), you must specify all of the values that you want to appear in the updated distribution. In addition, you must update the corresponding Quantity element.      Submit an UpdateDistribution request to update the configuration for your distribution:   In the request body, include the XML document that you updated in Step 2. The request body must include an XML document with a DistributionConfig element.   Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GetDistributionConfig request in Step 1.     Review the response to the UpdateDistribution request to confirm that the configuration was successfully updated.   Optional: Submit a GetDistribution request to confirm that your changes have propagated. When propagation is complete, the value of Status is Deployed.  
    */
  def updateDistribution(params: UpdateDistributionRequest): awsDashSdkLib.libRequestMod.Request[UpdateDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDistribution(
    params: UpdateDistributionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update a field-level encryption configuration. 
    */
  def updateFieldLevelEncryptionConfig(): awsDashSdkLib.libRequestMod.Request[UpdateFieldLevelEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFieldLevelEncryptionConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFieldLevelEncryptionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFieldLevelEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update a field-level encryption configuration. 
    */
  def updateFieldLevelEncryptionConfig(params: UpdateFieldLevelEncryptionConfigRequest): awsDashSdkLib.libRequestMod.Request[UpdateFieldLevelEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFieldLevelEncryptionConfig(
    params: UpdateFieldLevelEncryptionConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFieldLevelEncryptionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFieldLevelEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update a field-level encryption profile. 
    */
  def updateFieldLevelEncryptionProfile(): awsDashSdkLib.libRequestMod.Request[UpdateFieldLevelEncryptionProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFieldLevelEncryptionProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFieldLevelEncryptionProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFieldLevelEncryptionProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update a field-level encryption profile. 
    */
  def updateFieldLevelEncryptionProfile(params: UpdateFieldLevelEncryptionProfileRequest): awsDashSdkLib.libRequestMod.Request[UpdateFieldLevelEncryptionProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFieldLevelEncryptionProfile(
    params: UpdateFieldLevelEncryptionProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFieldLevelEncryptionProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFieldLevelEncryptionProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update public key information. Note that the only value you can change is the comment.
    */
  def updatePublicKey(): awsDashSdkLib.libRequestMod.Request[UpdatePublicKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePublicKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdatePublicKeyResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdatePublicKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update public key information. Note that the only value you can change is the comment.
    */
  def updatePublicKey(params: UpdatePublicKeyRequest): awsDashSdkLib.libRequestMod.Request[UpdatePublicKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePublicKey(
    params: UpdatePublicKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdatePublicKeyResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdatePublicKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update a streaming distribution. 
    */
  def updateStreamingDistribution(): awsDashSdkLib.libRequestMod.Request[UpdateStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateStreamingDistribution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateStreamingDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update a streaming distribution. 
    */
  def updateStreamingDistribution(params: UpdateStreamingDistributionRequest): awsDashSdkLib.libRequestMod.Request[UpdateStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateStreamingDistribution(
    params: UpdateStreamingDistributionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateStreamingDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the distributionDeployed state by periodically calling the underlying CloudFront.getDistributionoperation every 60 seconds (at most 25 times). Wait until a distribution is deployed.
    */
  @JSName("waitFor")
  def waitFor_distributionDeployed(state: awsDashSdkLib.awsDashSdkLibStrings.distributionDeployed): awsDashSdkLib.libRequestMod.Request[GetDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_distributionDeployed(
    state: awsDashSdkLib.awsDashSdkLibStrings.distributionDeployed,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the distributionDeployed state by periodically calling the underlying CloudFront.getDistributionoperation every 60 seconds (at most 25 times). Wait until a distribution is deployed.
    */
  @JSName("waitFor")
  def waitFor_distributionDeployed(
    state: awsDashSdkLib.awsDashSdkLibStrings.distributionDeployed,
    params: GetDistributionRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[GetDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_distributionDeployed(
    state: awsDashSdkLib.awsDashSdkLibStrings.distributionDeployed,
    params: GetDistributionRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the invalidationCompleted state by periodically calling the underlying CloudFront.getInvalidationoperation every 20 seconds (at most 30 times). Wait until an invalidation has completed.
    */
  @JSName("waitFor")
  def waitFor_invalidationCompleted(state: awsDashSdkLib.awsDashSdkLibStrings.invalidationCompleted): awsDashSdkLib.libRequestMod.Request[GetInvalidationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_invalidationCompleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.invalidationCompleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInvalidationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInvalidationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the invalidationCompleted state by periodically calling the underlying CloudFront.getInvalidationoperation every 20 seconds (at most 30 times). Wait until an invalidation has completed.
    */
  @JSName("waitFor")
  def waitFor_invalidationCompleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.invalidationCompleted,
    params: GetInvalidationRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[GetInvalidationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_invalidationCompleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.invalidationCompleted,
    params: GetInvalidationRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInvalidationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInvalidationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the streamingDistributionDeployed state by periodically calling the underlying CloudFront.getStreamingDistributionoperation every 60 seconds (at most 25 times). Wait until a streaming distribution is deployed.
    */
  @JSName("waitFor")
  def waitFor_streamingDistributionDeployed(state: awsDashSdkLib.awsDashSdkLibStrings.streamingDistributionDeployed): awsDashSdkLib.libRequestMod.Request[GetStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_streamingDistributionDeployed(
    state: awsDashSdkLib.awsDashSdkLibStrings.streamingDistributionDeployed,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetStreamingDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the streamingDistributionDeployed state by periodically calling the underlying CloudFront.getStreamingDistributionoperation every 60 seconds (at most 25 times). Wait until a streaming distribution is deployed.
    */
  @JSName("waitFor")
  def waitFor_streamingDistributionDeployed(
    state: awsDashSdkLib.awsDashSdkLibStrings.streamingDistributionDeployed,
    params: GetStreamingDistributionRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[GetStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_streamingDistributionDeployed(
    state: awsDashSdkLib.awsDashSdkLibStrings.streamingDistributionDeployed,
    params: GetStreamingDistributionRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetStreamingDistributionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

