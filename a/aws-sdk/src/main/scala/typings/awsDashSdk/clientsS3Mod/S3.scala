package typings.awsDashSdk.clientsS3Mod

import typings.awsDashSdk.Anon_Waiter
import typings.awsDashSdk.awsDashSdkStrings.bucketExists
import typings.awsDashSdk.awsDashSdkStrings.bucketNotExists
import typings.awsDashSdk.awsDashSdkStrings.objectExists
import typings.awsDashSdk.awsDashSdkStrings.objectNotExists
import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServicesS3Mod.S3Customizations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3 extends S3Customizations {
  @JSName("config")
  var config_S3: ConfigBase with ClientConfiguration = js.native
  /**
    * Aborts a multipart upload. To verify that all parts have been removed, so you don't get charged for the part storage, you should call the List Parts operation and ensure the parts list is empty.
    */
  def abortMultipartUpload(): Request[AbortMultipartUploadOutput, AWSError] = js.native
  def abortMultipartUpload(callback: js.Function2[/* err */ AWSError, /* data */ AbortMultipartUploadOutput, Unit]): Request[AbortMultipartUploadOutput, AWSError] = js.native
  /**
    * Aborts a multipart upload. To verify that all parts have been removed, so you don't get charged for the part storage, you should call the List Parts operation and ensure the parts list is empty.
    */
  def abortMultipartUpload(params: AbortMultipartUploadRequest): Request[AbortMultipartUploadOutput, AWSError] = js.native
  def abortMultipartUpload(
    params: AbortMultipartUploadRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AbortMultipartUploadOutput, Unit]
  ): Request[AbortMultipartUploadOutput, AWSError] = js.native
  /**
    * Completes a multipart upload by assembling previously uploaded parts.
    */
  def completeMultipartUpload(): Request[CompleteMultipartUploadOutput, AWSError] = js.native
  def completeMultipartUpload(callback: js.Function2[/* err */ AWSError, /* data */ CompleteMultipartUploadOutput, Unit]): Request[CompleteMultipartUploadOutput, AWSError] = js.native
  /**
    * Completes a multipart upload by assembling previously uploaded parts.
    */
  def completeMultipartUpload(params: CompleteMultipartUploadRequest): Request[CompleteMultipartUploadOutput, AWSError] = js.native
  def completeMultipartUpload(
    params: CompleteMultipartUploadRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CompleteMultipartUploadOutput, Unit]
  ): Request[CompleteMultipartUploadOutput, AWSError] = js.native
  /**
    * Creates a copy of an object that is already stored in Amazon S3.
    */
  def copyObject(): Request[CopyObjectOutput, AWSError] = js.native
  def copyObject(callback: js.Function2[/* err */ AWSError, /* data */ CopyObjectOutput, Unit]): Request[CopyObjectOutput, AWSError] = js.native
  /**
    * Creates a copy of an object that is already stored in Amazon S3.
    */
  def copyObject(params: CopyObjectRequest): Request[CopyObjectOutput, AWSError] = js.native
  def copyObject(
    params: CopyObjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CopyObjectOutput, Unit]
  ): Request[CopyObjectOutput, AWSError] = js.native
  /**
    * Creates a new bucket.
    */
  def createBucket(): Request[CreateBucketOutput, AWSError] = js.native
  def createBucket(callback: js.Function2[/* err */ AWSError, /* data */ CreateBucketOutput, Unit]): Request[CreateBucketOutput, AWSError] = js.native
  /**
    * Creates a new bucket.
    */
  def createBucket(params: CreateBucketRequest): Request[CreateBucketOutput, AWSError] = js.native
  def createBucket(
    params: CreateBucketRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBucketOutput, Unit]
  ): Request[CreateBucketOutput, AWSError] = js.native
  /**
    * Initiates a multipart upload and returns an upload ID.  Note: After you initiate multipart upload and upload one or more parts, you must either complete or abort multipart upload in order to stop getting charged for storage of the uploaded parts. Only after you either complete or abort multipart upload, Amazon S3 frees up the parts storage and stops charging you for the parts storage.
    */
  def createMultipartUpload(): Request[CreateMultipartUploadOutput, AWSError] = js.native
  def createMultipartUpload(callback: js.Function2[/* err */ AWSError, /* data */ CreateMultipartUploadOutput, Unit]): Request[CreateMultipartUploadOutput, AWSError] = js.native
  /**
    * Initiates a multipart upload and returns an upload ID.  Note: After you initiate multipart upload and upload one or more parts, you must either complete or abort multipart upload in order to stop getting charged for storage of the uploaded parts. Only after you either complete or abort multipart upload, Amazon S3 frees up the parts storage and stops charging you for the parts storage.
    */
  def createMultipartUpload(params: CreateMultipartUploadRequest): Request[CreateMultipartUploadOutput, AWSError] = js.native
  def createMultipartUpload(
    params: CreateMultipartUploadRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMultipartUploadOutput, Unit]
  ): Request[CreateMultipartUploadOutput, AWSError] = js.native
  /**
    * Deletes the bucket. All objects (including all object versions and Delete Markers) in the bucket must be deleted before the bucket itself can be deleted.
    */
  def deleteBucket(): Request[js.Object, AWSError] = js.native
  def deleteBucket(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the bucket. All objects (including all object versions and Delete Markers) in the bucket must be deleted before the bucket itself can be deleted.
    */
  def deleteBucket(params: DeleteBucketRequest): Request[js.Object, AWSError] = js.native
  def deleteBucket(
    params: DeleteBucketRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an analytics configuration for the bucket (specified by the analytics configuration ID). To use this operation, you must have permissions to perform the s3:PutAnalyticsConfiguration action. The bucket owner has this permission by default. The bucket owner can grant this permission to others. 
    */
  def deleteBucketAnalyticsConfiguration(): Request[js.Object, AWSError] = js.native
  def deleteBucketAnalyticsConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an analytics configuration for the bucket (specified by the analytics configuration ID). To use this operation, you must have permissions to perform the s3:PutAnalyticsConfiguration action. The bucket owner has this permission by default. The bucket owner can grant this permission to others. 
    */
  def deleteBucketAnalyticsConfiguration(params: DeleteBucketAnalyticsConfigurationRequest): Request[js.Object, AWSError] = js.native
  def deleteBucketAnalyticsConfiguration(
    params: DeleteBucketAnalyticsConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the CORS configuration information set for the bucket.
    */
  def deleteBucketCors(): Request[js.Object, AWSError] = js.native
  def deleteBucketCors(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the CORS configuration information set for the bucket.
    */
  def deleteBucketCors(params: DeleteBucketCorsRequest): Request[js.Object, AWSError] = js.native
  def deleteBucketCors(
    params: DeleteBucketCorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the server-side encryption configuration from the bucket.
    */
  def deleteBucketEncryption(): Request[js.Object, AWSError] = js.native
  def deleteBucketEncryption(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the server-side encryption configuration from the bucket.
    */
  def deleteBucketEncryption(params: DeleteBucketEncryptionRequest): Request[js.Object, AWSError] = js.native
  def deleteBucketEncryption(
    params: DeleteBucketEncryptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an inventory configuration (identified by the inventory ID) from the bucket.
    */
  def deleteBucketInventoryConfiguration(): Request[js.Object, AWSError] = js.native
  def deleteBucketInventoryConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an inventory configuration (identified by the inventory ID) from the bucket.
    */
  def deleteBucketInventoryConfiguration(params: DeleteBucketInventoryConfigurationRequest): Request[js.Object, AWSError] = js.native
  def deleteBucketInventoryConfiguration(
    params: DeleteBucketInventoryConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the lifecycle configuration from the bucket.
    */
  def deleteBucketLifecycle(): Request[js.Object, AWSError] = js.native
  def deleteBucketLifecycle(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the lifecycle configuration from the bucket.
    */
  def deleteBucketLifecycle(params: DeleteBucketLifecycleRequest): Request[js.Object, AWSError] = js.native
  def deleteBucketLifecycle(
    params: DeleteBucketLifecycleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a metrics configuration (specified by the metrics configuration ID) from the bucket.
    */
  def deleteBucketMetricsConfiguration(): Request[js.Object, AWSError] = js.native
  def deleteBucketMetricsConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a metrics configuration (specified by the metrics configuration ID) from the bucket.
    */
  def deleteBucketMetricsConfiguration(params: DeleteBucketMetricsConfigurationRequest): Request[js.Object, AWSError] = js.native
  def deleteBucketMetricsConfiguration(
    params: DeleteBucketMetricsConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the policy from the bucket.
    */
  def deleteBucketPolicy(): Request[js.Object, AWSError] = js.native
  def deleteBucketPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the policy from the bucket.
    */
  def deleteBucketPolicy(params: DeleteBucketPolicyRequest): Request[js.Object, AWSError] = js.native
  def deleteBucketPolicy(
    params: DeleteBucketPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    *  Deletes the replication configuration from the bucket. For information about replication configuration, see Cross-Region Replication (CRR) in the Amazon S3 Developer Guide. 
    */
  def deleteBucketReplication(): Request[js.Object, AWSError] = js.native
  def deleteBucketReplication(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  Deletes the replication configuration from the bucket. For information about replication configuration, see Cross-Region Replication (CRR) in the Amazon S3 Developer Guide. 
    */
  def deleteBucketReplication(params: DeleteBucketReplicationRequest): Request[js.Object, AWSError] = js.native
  def deleteBucketReplication(
    params: DeleteBucketReplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the tags from the bucket.
    */
  def deleteBucketTagging(): Request[js.Object, AWSError] = js.native
  def deleteBucketTagging(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the tags from the bucket.
    */
  def deleteBucketTagging(params: DeleteBucketTaggingRequest): Request[js.Object, AWSError] = js.native
  def deleteBucketTagging(
    params: DeleteBucketTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * This operation removes the website configuration from the bucket.
    */
  def deleteBucketWebsite(): Request[js.Object, AWSError] = js.native
  def deleteBucketWebsite(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This operation removes the website configuration from the bucket.
    */
  def deleteBucketWebsite(params: DeleteBucketWebsiteRequest): Request[js.Object, AWSError] = js.native
  def deleteBucketWebsite(
    params: DeleteBucketWebsiteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Removes the null version (if there is one) of an object and inserts a delete marker, which becomes the latest version of the object. If there isn't a null version, Amazon S3 does not remove any objects.
    */
  def deleteObject(): Request[DeleteObjectOutput, AWSError] = js.native
  def deleteObject(callback: js.Function2[/* err */ AWSError, /* data */ DeleteObjectOutput, Unit]): Request[DeleteObjectOutput, AWSError] = js.native
  /**
    * Removes the null version (if there is one) of an object and inserts a delete marker, which becomes the latest version of the object. If there isn't a null version, Amazon S3 does not remove any objects.
    */
  def deleteObject(params: DeleteObjectRequest): Request[DeleteObjectOutput, AWSError] = js.native
  def deleteObject(
    params: DeleteObjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteObjectOutput, Unit]
  ): Request[DeleteObjectOutput, AWSError] = js.native
  /**
    * Removes the tag-set from an existing object.
    */
  def deleteObjectTagging(): Request[DeleteObjectTaggingOutput, AWSError] = js.native
  def deleteObjectTagging(callback: js.Function2[/* err */ AWSError, /* data */ DeleteObjectTaggingOutput, Unit]): Request[DeleteObjectTaggingOutput, AWSError] = js.native
  /**
    * Removes the tag-set from an existing object.
    */
  def deleteObjectTagging(params: DeleteObjectTaggingRequest): Request[DeleteObjectTaggingOutput, AWSError] = js.native
  def deleteObjectTagging(
    params: DeleteObjectTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteObjectTaggingOutput, Unit]
  ): Request[DeleteObjectTaggingOutput, AWSError] = js.native
  /**
    * This operation enables you to delete multiple objects from a bucket using a single HTTP request. You may specify up to 1000 keys.
    */
  def deleteObjects(): Request[DeleteObjectsOutput, AWSError] = js.native
  def deleteObjects(callback: js.Function2[/* err */ AWSError, /* data */ DeleteObjectsOutput, Unit]): Request[DeleteObjectsOutput, AWSError] = js.native
  /**
    * This operation enables you to delete multiple objects from a bucket using a single HTTP request. You may specify up to 1000 keys.
    */
  def deleteObjects(params: DeleteObjectsRequest): Request[DeleteObjectsOutput, AWSError] = js.native
  def deleteObjects(
    params: DeleteObjectsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteObjectsOutput, Unit]
  ): Request[DeleteObjectsOutput, AWSError] = js.native
  /**
    * Removes the PublicAccessBlock configuration from an Amazon S3 bucket.
    */
  def deletePublicAccessBlock(): Request[js.Object, AWSError] = js.native
  def deletePublicAccessBlock(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the PublicAccessBlock configuration from an Amazon S3 bucket.
    */
  def deletePublicAccessBlock(params: DeletePublicAccessBlockRequest): Request[js.Object, AWSError] = js.native
  def deletePublicAccessBlock(
    params: DeletePublicAccessBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Returns the accelerate configuration of a bucket.
    */
  def getBucketAccelerateConfiguration(): Request[GetBucketAccelerateConfigurationOutput, AWSError] = js.native
  def getBucketAccelerateConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketAccelerateConfigurationOutput, Unit]
  ): Request[GetBucketAccelerateConfigurationOutput, AWSError] = js.native
  /**
    * Returns the accelerate configuration of a bucket.
    */
  def getBucketAccelerateConfiguration(params: GetBucketAccelerateConfigurationRequest): Request[GetBucketAccelerateConfigurationOutput, AWSError] = js.native
  def getBucketAccelerateConfiguration(
    params: GetBucketAccelerateConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketAccelerateConfigurationOutput, Unit]
  ): Request[GetBucketAccelerateConfigurationOutput, AWSError] = js.native
  /**
    * Gets the access control policy for the bucket.
    */
  def getBucketAcl(): Request[GetBucketAclOutput, AWSError] = js.native
  def getBucketAcl(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketAclOutput, Unit]): Request[GetBucketAclOutput, AWSError] = js.native
  /**
    * Gets the access control policy for the bucket.
    */
  def getBucketAcl(params: GetBucketAclRequest): Request[GetBucketAclOutput, AWSError] = js.native
  def getBucketAcl(
    params: GetBucketAclRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketAclOutput, Unit]
  ): Request[GetBucketAclOutput, AWSError] = js.native
  /**
    * Gets an analytics configuration for the bucket (specified by the analytics configuration ID).
    */
  def getBucketAnalyticsConfiguration(): Request[GetBucketAnalyticsConfigurationOutput, AWSError] = js.native
  def getBucketAnalyticsConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketAnalyticsConfigurationOutput, Unit]): Request[GetBucketAnalyticsConfigurationOutput, AWSError] = js.native
  /**
    * Gets an analytics configuration for the bucket (specified by the analytics configuration ID).
    */
  def getBucketAnalyticsConfiguration(params: GetBucketAnalyticsConfigurationRequest): Request[GetBucketAnalyticsConfigurationOutput, AWSError] = js.native
  def getBucketAnalyticsConfiguration(
    params: GetBucketAnalyticsConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketAnalyticsConfigurationOutput, Unit]
  ): Request[GetBucketAnalyticsConfigurationOutput, AWSError] = js.native
  /**
    * Returns the CORS configuration for the bucket.
    */
  def getBucketCors(): Request[GetBucketCorsOutput, AWSError] = js.native
  def getBucketCors(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketCorsOutput, Unit]): Request[GetBucketCorsOutput, AWSError] = js.native
  /**
    * Returns the CORS configuration for the bucket.
    */
  def getBucketCors(params: GetBucketCorsRequest): Request[GetBucketCorsOutput, AWSError] = js.native
  def getBucketCors(
    params: GetBucketCorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketCorsOutput, Unit]
  ): Request[GetBucketCorsOutput, AWSError] = js.native
  /**
    * Returns the server-side encryption configuration of a bucket.
    */
  def getBucketEncryption(): Request[GetBucketEncryptionOutput, AWSError] = js.native
  def getBucketEncryption(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketEncryptionOutput, Unit]): Request[GetBucketEncryptionOutput, AWSError] = js.native
  /**
    * Returns the server-side encryption configuration of a bucket.
    */
  def getBucketEncryption(params: GetBucketEncryptionRequest): Request[GetBucketEncryptionOutput, AWSError] = js.native
  def getBucketEncryption(
    params: GetBucketEncryptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketEncryptionOutput, Unit]
  ): Request[GetBucketEncryptionOutput, AWSError] = js.native
  /**
    * Returns an inventory configuration (identified by the inventory ID) from the bucket.
    */
  def getBucketInventoryConfiguration(): Request[GetBucketInventoryConfigurationOutput, AWSError] = js.native
  def getBucketInventoryConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketInventoryConfigurationOutput, Unit]): Request[GetBucketInventoryConfigurationOutput, AWSError] = js.native
  /**
    * Returns an inventory configuration (identified by the inventory ID) from the bucket.
    */
  def getBucketInventoryConfiguration(params: GetBucketInventoryConfigurationRequest): Request[GetBucketInventoryConfigurationOutput, AWSError] = js.native
  def getBucketInventoryConfiguration(
    params: GetBucketInventoryConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketInventoryConfigurationOutput, Unit]
  ): Request[GetBucketInventoryConfigurationOutput, AWSError] = js.native
  /**
    *  No longer used, see the GetBucketLifecycleConfiguration operation.
    */
  def getBucketLifecycle(): Request[GetBucketLifecycleOutput, AWSError] = js.native
  def getBucketLifecycle(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketLifecycleOutput, Unit]): Request[GetBucketLifecycleOutput, AWSError] = js.native
  /**
    *  No longer used, see the GetBucketLifecycleConfiguration operation.
    */
  def getBucketLifecycle(params: GetBucketLifecycleRequest): Request[GetBucketLifecycleOutput, AWSError] = js.native
  def getBucketLifecycle(
    params: GetBucketLifecycleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketLifecycleOutput, Unit]
  ): Request[GetBucketLifecycleOutput, AWSError] = js.native
  /**
    * Returns the lifecycle configuration information set on the bucket.
    */
  def getBucketLifecycleConfiguration(): Request[GetBucketLifecycleConfigurationOutput, AWSError] = js.native
  def getBucketLifecycleConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketLifecycleConfigurationOutput, Unit]): Request[GetBucketLifecycleConfigurationOutput, AWSError] = js.native
  /**
    * Returns the lifecycle configuration information set on the bucket.
    */
  def getBucketLifecycleConfiguration(params: GetBucketLifecycleConfigurationRequest): Request[GetBucketLifecycleConfigurationOutput, AWSError] = js.native
  def getBucketLifecycleConfiguration(
    params: GetBucketLifecycleConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketLifecycleConfigurationOutput, Unit]
  ): Request[GetBucketLifecycleConfigurationOutput, AWSError] = js.native
  /**
    * Returns the region the bucket resides in.
    */
  def getBucketLocation(): Request[GetBucketLocationOutput, AWSError] = js.native
  def getBucketLocation(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketLocationOutput, Unit]): Request[GetBucketLocationOutput, AWSError] = js.native
  /**
    * Returns the region the bucket resides in.
    */
  def getBucketLocation(params: GetBucketLocationRequest): Request[GetBucketLocationOutput, AWSError] = js.native
  def getBucketLocation(
    params: GetBucketLocationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketLocationOutput, Unit]
  ): Request[GetBucketLocationOutput, AWSError] = js.native
  /**
    * Returns the logging status of a bucket and the permissions users have to view and modify that status. To use GET, you must be the bucket owner.
    */
  def getBucketLogging(): Request[GetBucketLoggingOutput, AWSError] = js.native
  def getBucketLogging(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketLoggingOutput, Unit]): Request[GetBucketLoggingOutput, AWSError] = js.native
  /**
    * Returns the logging status of a bucket and the permissions users have to view and modify that status. To use GET, you must be the bucket owner.
    */
  def getBucketLogging(params: GetBucketLoggingRequest): Request[GetBucketLoggingOutput, AWSError] = js.native
  def getBucketLogging(
    params: GetBucketLoggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketLoggingOutput, Unit]
  ): Request[GetBucketLoggingOutput, AWSError] = js.native
  /**
    * Gets a metrics configuration (specified by the metrics configuration ID) from the bucket.
    */
  def getBucketMetricsConfiguration(): Request[GetBucketMetricsConfigurationOutput, AWSError] = js.native
  def getBucketMetricsConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketMetricsConfigurationOutput, Unit]): Request[GetBucketMetricsConfigurationOutput, AWSError] = js.native
  /**
    * Gets a metrics configuration (specified by the metrics configuration ID) from the bucket.
    */
  def getBucketMetricsConfiguration(params: GetBucketMetricsConfigurationRequest): Request[GetBucketMetricsConfigurationOutput, AWSError] = js.native
  def getBucketMetricsConfiguration(
    params: GetBucketMetricsConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketMetricsConfigurationOutput, Unit]
  ): Request[GetBucketMetricsConfigurationOutput, AWSError] = js.native
  /**
    *  No longer used, see the GetBucketNotificationConfiguration operation.
    */
  def getBucketNotification(): Request[NotificationConfigurationDeprecated, AWSError] = js.native
  def getBucketNotification(callback: js.Function2[/* err */ AWSError, /* data */ NotificationConfigurationDeprecated, Unit]): Request[NotificationConfigurationDeprecated, AWSError] = js.native
  /**
    *  No longer used, see the GetBucketNotificationConfiguration operation.
    */
  def getBucketNotification(params: GetBucketNotificationConfigurationRequest): Request[NotificationConfigurationDeprecated, AWSError] = js.native
  def getBucketNotification(
    params: GetBucketNotificationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ NotificationConfigurationDeprecated, Unit]
  ): Request[NotificationConfigurationDeprecated, AWSError] = js.native
  /**
    * Returns the notification configuration of a bucket.
    */
  def getBucketNotificationConfiguration(): Request[NotificationConfiguration, AWSError] = js.native
  def getBucketNotificationConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ NotificationConfiguration, Unit]): Request[NotificationConfiguration, AWSError] = js.native
  /**
    * Returns the notification configuration of a bucket.
    */
  def getBucketNotificationConfiguration(params: GetBucketNotificationConfigurationRequest): Request[NotificationConfiguration, AWSError] = js.native
  def getBucketNotificationConfiguration(
    params: GetBucketNotificationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ NotificationConfiguration, Unit]
  ): Request[NotificationConfiguration, AWSError] = js.native
  /**
    * Returns the policy of a specified bucket.
    */
  def getBucketPolicy(): Request[GetBucketPolicyOutput, AWSError] = js.native
  def getBucketPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketPolicyOutput, Unit]): Request[GetBucketPolicyOutput, AWSError] = js.native
  /**
    * Returns the policy of a specified bucket.
    */
  def getBucketPolicy(params: GetBucketPolicyRequest): Request[GetBucketPolicyOutput, AWSError] = js.native
  def getBucketPolicy(
    params: GetBucketPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketPolicyOutput, Unit]
  ): Request[GetBucketPolicyOutput, AWSError] = js.native
  /**
    * Retrieves the policy status for an Amazon S3 bucket, indicating whether the bucket is public.
    */
  def getBucketPolicyStatus(): Request[GetBucketPolicyStatusOutput, AWSError] = js.native
  def getBucketPolicyStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketPolicyStatusOutput, Unit]): Request[GetBucketPolicyStatusOutput, AWSError] = js.native
  /**
    * Retrieves the policy status for an Amazon S3 bucket, indicating whether the bucket is public.
    */
  def getBucketPolicyStatus(params: GetBucketPolicyStatusRequest): Request[GetBucketPolicyStatusOutput, AWSError] = js.native
  def getBucketPolicyStatus(
    params: GetBucketPolicyStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketPolicyStatusOutput, Unit]
  ): Request[GetBucketPolicyStatusOutput, AWSError] = js.native
  /**
    * Returns the replication configuration of a bucket.   It can take a while to propagate the put or delete a replication configuration to all Amazon S3 systems. Therefore, a get request soon after put or delete can return a wrong result.  
    */
  def getBucketReplication(): Request[GetBucketReplicationOutput, AWSError] = js.native
  def getBucketReplication(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketReplicationOutput, Unit]): Request[GetBucketReplicationOutput, AWSError] = js.native
  /**
    * Returns the replication configuration of a bucket.   It can take a while to propagate the put or delete a replication configuration to all Amazon S3 systems. Therefore, a get request soon after put or delete can return a wrong result.  
    */
  def getBucketReplication(params: GetBucketReplicationRequest): Request[GetBucketReplicationOutput, AWSError] = js.native
  def getBucketReplication(
    params: GetBucketReplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketReplicationOutput, Unit]
  ): Request[GetBucketReplicationOutput, AWSError] = js.native
  /**
    * Returns the request payment configuration of a bucket.
    */
  def getBucketRequestPayment(): Request[GetBucketRequestPaymentOutput, AWSError] = js.native
  def getBucketRequestPayment(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketRequestPaymentOutput, Unit]): Request[GetBucketRequestPaymentOutput, AWSError] = js.native
  /**
    * Returns the request payment configuration of a bucket.
    */
  def getBucketRequestPayment(params: GetBucketRequestPaymentRequest): Request[GetBucketRequestPaymentOutput, AWSError] = js.native
  def getBucketRequestPayment(
    params: GetBucketRequestPaymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketRequestPaymentOutput, Unit]
  ): Request[GetBucketRequestPaymentOutput, AWSError] = js.native
  /**
    * Returns the tag set associated with the bucket.
    */
  def getBucketTagging(): Request[GetBucketTaggingOutput, AWSError] = js.native
  def getBucketTagging(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketTaggingOutput, Unit]): Request[GetBucketTaggingOutput, AWSError] = js.native
  /**
    * Returns the tag set associated with the bucket.
    */
  def getBucketTagging(params: GetBucketTaggingRequest): Request[GetBucketTaggingOutput, AWSError] = js.native
  def getBucketTagging(
    params: GetBucketTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketTaggingOutput, Unit]
  ): Request[GetBucketTaggingOutput, AWSError] = js.native
  /**
    * Returns the versioning state of a bucket.
    */
  def getBucketVersioning(): Request[GetBucketVersioningOutput, AWSError] = js.native
  def getBucketVersioning(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketVersioningOutput, Unit]): Request[GetBucketVersioningOutput, AWSError] = js.native
  /**
    * Returns the versioning state of a bucket.
    */
  def getBucketVersioning(params: GetBucketVersioningRequest): Request[GetBucketVersioningOutput, AWSError] = js.native
  def getBucketVersioning(
    params: GetBucketVersioningRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketVersioningOutput, Unit]
  ): Request[GetBucketVersioningOutput, AWSError] = js.native
  /**
    * Returns the website configuration for a bucket.
    */
  def getBucketWebsite(): Request[GetBucketWebsiteOutput, AWSError] = js.native
  def getBucketWebsite(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketWebsiteOutput, Unit]): Request[GetBucketWebsiteOutput, AWSError] = js.native
  /**
    * Returns the website configuration for a bucket.
    */
  def getBucketWebsite(params: GetBucketWebsiteRequest): Request[GetBucketWebsiteOutput, AWSError] = js.native
  def getBucketWebsite(
    params: GetBucketWebsiteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketWebsiteOutput, Unit]
  ): Request[GetBucketWebsiteOutput, AWSError] = js.native
  /**
    * Retrieves objects from Amazon S3.
    */
  def getObject(): Request[GetObjectOutput, AWSError] = js.native
  def getObject(callback: js.Function2[/* err */ AWSError, /* data */ GetObjectOutput, Unit]): Request[GetObjectOutput, AWSError] = js.native
  /**
    * Retrieves objects from Amazon S3.
    */
  def getObject(params: GetObjectRequest): Request[GetObjectOutput, AWSError] = js.native
  def getObject(
    params: GetObjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetObjectOutput, Unit]
  ): Request[GetObjectOutput, AWSError] = js.native
  /**
    * Returns the access control list (ACL) of an object.
    */
  def getObjectAcl(): Request[GetObjectAclOutput, AWSError] = js.native
  def getObjectAcl(callback: js.Function2[/* err */ AWSError, /* data */ GetObjectAclOutput, Unit]): Request[GetObjectAclOutput, AWSError] = js.native
  /**
    * Returns the access control list (ACL) of an object.
    */
  def getObjectAcl(params: GetObjectAclRequest): Request[GetObjectAclOutput, AWSError] = js.native
  def getObjectAcl(
    params: GetObjectAclRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetObjectAclOutput, Unit]
  ): Request[GetObjectAclOutput, AWSError] = js.native
  /**
    * Gets an object's current Legal Hold status.
    */
  def getObjectLegalHold(): Request[GetObjectLegalHoldOutput, AWSError] = js.native
  def getObjectLegalHold(callback: js.Function2[/* err */ AWSError, /* data */ GetObjectLegalHoldOutput, Unit]): Request[GetObjectLegalHoldOutput, AWSError] = js.native
  /**
    * Gets an object's current Legal Hold status.
    */
  def getObjectLegalHold(params: GetObjectLegalHoldRequest): Request[GetObjectLegalHoldOutput, AWSError] = js.native
  def getObjectLegalHold(
    params: GetObjectLegalHoldRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetObjectLegalHoldOutput, Unit]
  ): Request[GetObjectLegalHoldOutput, AWSError] = js.native
  /**
    * Gets the object lock configuration for a bucket. The rule specified in the object lock configuration will be applied by default to every new object placed in the specified bucket.
    */
  def getObjectLockConfiguration(): Request[GetObjectLockConfigurationOutput, AWSError] = js.native
  def getObjectLockConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetObjectLockConfigurationOutput, Unit]): Request[GetObjectLockConfigurationOutput, AWSError] = js.native
  /**
    * Gets the object lock configuration for a bucket. The rule specified in the object lock configuration will be applied by default to every new object placed in the specified bucket.
    */
  def getObjectLockConfiguration(params: GetObjectLockConfigurationRequest): Request[GetObjectLockConfigurationOutput, AWSError] = js.native
  def getObjectLockConfiguration(
    params: GetObjectLockConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetObjectLockConfigurationOutput, Unit]
  ): Request[GetObjectLockConfigurationOutput, AWSError] = js.native
  /**
    * Retrieves an object's retention settings.
    */
  def getObjectRetention(): Request[GetObjectRetentionOutput, AWSError] = js.native
  def getObjectRetention(callback: js.Function2[/* err */ AWSError, /* data */ GetObjectRetentionOutput, Unit]): Request[GetObjectRetentionOutput, AWSError] = js.native
  /**
    * Retrieves an object's retention settings.
    */
  def getObjectRetention(params: GetObjectRetentionRequest): Request[GetObjectRetentionOutput, AWSError] = js.native
  def getObjectRetention(
    params: GetObjectRetentionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetObjectRetentionOutput, Unit]
  ): Request[GetObjectRetentionOutput, AWSError] = js.native
  /**
    * Returns the tag-set of an object.
    */
  def getObjectTagging(): Request[GetObjectTaggingOutput, AWSError] = js.native
  def getObjectTagging(callback: js.Function2[/* err */ AWSError, /* data */ GetObjectTaggingOutput, Unit]): Request[GetObjectTaggingOutput, AWSError] = js.native
  /**
    * Returns the tag-set of an object.
    */
  def getObjectTagging(params: GetObjectTaggingRequest): Request[GetObjectTaggingOutput, AWSError] = js.native
  def getObjectTagging(
    params: GetObjectTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetObjectTaggingOutput, Unit]
  ): Request[GetObjectTaggingOutput, AWSError] = js.native
  /**
    * Return torrent files from a bucket.
    */
  def getObjectTorrent(): Request[GetObjectTorrentOutput, AWSError] = js.native
  def getObjectTorrent(callback: js.Function2[/* err */ AWSError, /* data */ GetObjectTorrentOutput, Unit]): Request[GetObjectTorrentOutput, AWSError] = js.native
  /**
    * Return torrent files from a bucket.
    */
  def getObjectTorrent(params: GetObjectTorrentRequest): Request[GetObjectTorrentOutput, AWSError] = js.native
  def getObjectTorrent(
    params: GetObjectTorrentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetObjectTorrentOutput, Unit]
  ): Request[GetObjectTorrentOutput, AWSError] = js.native
  /**
    * Retrieves the PublicAccessBlock configuration for an Amazon S3 bucket.
    */
  def getPublicAccessBlock(): Request[GetPublicAccessBlockOutput, AWSError] = js.native
  def getPublicAccessBlock(callback: js.Function2[/* err */ AWSError, /* data */ GetPublicAccessBlockOutput, Unit]): Request[GetPublicAccessBlockOutput, AWSError] = js.native
  /**
    * Retrieves the PublicAccessBlock configuration for an Amazon S3 bucket.
    */
  def getPublicAccessBlock(params: GetPublicAccessBlockRequest): Request[GetPublicAccessBlockOutput, AWSError] = js.native
  def getPublicAccessBlock(
    params: GetPublicAccessBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPublicAccessBlockOutput, Unit]
  ): Request[GetPublicAccessBlockOutput, AWSError] = js.native
  /**
    * This operation is useful to determine if a bucket exists and you have permission to access it.
    */
  def headBucket(): Request[js.Object, AWSError] = js.native
  def headBucket(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This operation is useful to determine if a bucket exists and you have permission to access it.
    */
  def headBucket(params: HeadBucketRequest): Request[js.Object, AWSError] = js.native
  def headBucket(params: HeadBucketRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * The HEAD operation retrieves metadata from an object without returning the object itself. This operation is useful if you're only interested in an object's metadata. To use HEAD, you must have READ access to the object.
    */
  def headObject(): Request[HeadObjectOutput, AWSError] = js.native
  def headObject(callback: js.Function2[/* err */ AWSError, /* data */ HeadObjectOutput, Unit]): Request[HeadObjectOutput, AWSError] = js.native
  /**
    * The HEAD operation retrieves metadata from an object without returning the object itself. This operation is useful if you're only interested in an object's metadata. To use HEAD, you must have READ access to the object.
    */
  def headObject(params: HeadObjectRequest): Request[HeadObjectOutput, AWSError] = js.native
  def headObject(
    params: HeadObjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ HeadObjectOutput, Unit]
  ): Request[HeadObjectOutput, AWSError] = js.native
  /**
    * Lists the analytics configurations for the bucket.
    */
  def listBucketAnalyticsConfigurations(): Request[ListBucketAnalyticsConfigurationsOutput, AWSError] = js.native
  def listBucketAnalyticsConfigurations(
    callback: js.Function2[/* err */ AWSError, /* data */ ListBucketAnalyticsConfigurationsOutput, Unit]
  ): Request[ListBucketAnalyticsConfigurationsOutput, AWSError] = js.native
  /**
    * Lists the analytics configurations for the bucket.
    */
  def listBucketAnalyticsConfigurations(params: ListBucketAnalyticsConfigurationsRequest): Request[ListBucketAnalyticsConfigurationsOutput, AWSError] = js.native
  def listBucketAnalyticsConfigurations(
    params: ListBucketAnalyticsConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBucketAnalyticsConfigurationsOutput, Unit]
  ): Request[ListBucketAnalyticsConfigurationsOutput, AWSError] = js.native
  /**
    * Returns a list of inventory configurations for the bucket.
    */
  def listBucketInventoryConfigurations(): Request[ListBucketInventoryConfigurationsOutput, AWSError] = js.native
  def listBucketInventoryConfigurations(
    callback: js.Function2[/* err */ AWSError, /* data */ ListBucketInventoryConfigurationsOutput, Unit]
  ): Request[ListBucketInventoryConfigurationsOutput, AWSError] = js.native
  /**
    * Returns a list of inventory configurations for the bucket.
    */
  def listBucketInventoryConfigurations(params: ListBucketInventoryConfigurationsRequest): Request[ListBucketInventoryConfigurationsOutput, AWSError] = js.native
  def listBucketInventoryConfigurations(
    params: ListBucketInventoryConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBucketInventoryConfigurationsOutput, Unit]
  ): Request[ListBucketInventoryConfigurationsOutput, AWSError] = js.native
  /**
    * Lists the metrics configurations for the bucket.
    */
  def listBucketMetricsConfigurations(): Request[ListBucketMetricsConfigurationsOutput, AWSError] = js.native
  def listBucketMetricsConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ ListBucketMetricsConfigurationsOutput, Unit]): Request[ListBucketMetricsConfigurationsOutput, AWSError] = js.native
  /**
    * Lists the metrics configurations for the bucket.
    */
  def listBucketMetricsConfigurations(params: ListBucketMetricsConfigurationsRequest): Request[ListBucketMetricsConfigurationsOutput, AWSError] = js.native
  def listBucketMetricsConfigurations(
    params: ListBucketMetricsConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBucketMetricsConfigurationsOutput, Unit]
  ): Request[ListBucketMetricsConfigurationsOutput, AWSError] = js.native
  /**
    * Returns a list of all buckets owned by the authenticated sender of the request.
    */
  def listBuckets(): Request[ListBucketsOutput, AWSError] = js.native
  def listBuckets(callback: js.Function2[/* err */ AWSError, /* data */ ListBucketsOutput, Unit]): Request[ListBucketsOutput, AWSError] = js.native
  /**
    * This operation lists in-progress multipart uploads.
    */
  def listMultipartUploads(): Request[ListMultipartUploadsOutput, AWSError] = js.native
  def listMultipartUploads(callback: js.Function2[/* err */ AWSError, /* data */ ListMultipartUploadsOutput, Unit]): Request[ListMultipartUploadsOutput, AWSError] = js.native
  /**
    * This operation lists in-progress multipart uploads.
    */
  def listMultipartUploads(params: ListMultipartUploadsRequest): Request[ListMultipartUploadsOutput, AWSError] = js.native
  def listMultipartUploads(
    params: ListMultipartUploadsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMultipartUploadsOutput, Unit]
  ): Request[ListMultipartUploadsOutput, AWSError] = js.native
  /**
    * Returns metadata about all of the versions of objects in a bucket.
    */
  def listObjectVersions(): Request[ListObjectVersionsOutput, AWSError] = js.native
  def listObjectVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListObjectVersionsOutput, Unit]): Request[ListObjectVersionsOutput, AWSError] = js.native
  /**
    * Returns metadata about all of the versions of objects in a bucket.
    */
  def listObjectVersions(params: ListObjectVersionsRequest): Request[ListObjectVersionsOutput, AWSError] = js.native
  def listObjectVersions(
    params: ListObjectVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListObjectVersionsOutput, Unit]
  ): Request[ListObjectVersionsOutput, AWSError] = js.native
  /**
    * Returns some or all (up to 1000) of the objects in a bucket. You can use the request parameters as selection criteria to return a subset of the objects in a bucket.
    */
  def listObjects(): Request[ListObjectsOutput, AWSError] = js.native
  def listObjects(callback: js.Function2[/* err */ AWSError, /* data */ ListObjectsOutput, Unit]): Request[ListObjectsOutput, AWSError] = js.native
  /**
    * Returns some or all (up to 1000) of the objects in a bucket. You can use the request parameters as selection criteria to return a subset of the objects in a bucket.
    */
  def listObjects(params: ListObjectsRequest): Request[ListObjectsOutput, AWSError] = js.native
  def listObjects(
    params: ListObjectsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListObjectsOutput, Unit]
  ): Request[ListObjectsOutput, AWSError] = js.native
  /**
    * Returns some or all (up to 1000) of the objects in a bucket. You can use the request parameters as selection criteria to return a subset of the objects in a bucket. Note: ListObjectsV2 is the revised List Objects API and we recommend you use this revised API for new application development.
    */
  def listObjectsV2(): Request[ListObjectsV2Output, AWSError] = js.native
  def listObjectsV2(callback: js.Function2[/* err */ AWSError, /* data */ ListObjectsV2Output, Unit]): Request[ListObjectsV2Output, AWSError] = js.native
  /**
    * Returns some or all (up to 1000) of the objects in a bucket. You can use the request parameters as selection criteria to return a subset of the objects in a bucket. Note: ListObjectsV2 is the revised List Objects API and we recommend you use this revised API for new application development.
    */
  def listObjectsV2(params: ListObjectsV2Request): Request[ListObjectsV2Output, AWSError] = js.native
  def listObjectsV2(
    params: ListObjectsV2Request,
    callback: js.Function2[/* err */ AWSError, /* data */ ListObjectsV2Output, Unit]
  ): Request[ListObjectsV2Output, AWSError] = js.native
  /**
    * Lists the parts that have been uploaded for a specific multipart upload.
    */
  def listParts(): Request[ListPartsOutput, AWSError] = js.native
  def listParts(callback: js.Function2[/* err */ AWSError, /* data */ ListPartsOutput, Unit]): Request[ListPartsOutput, AWSError] = js.native
  /**
    * Lists the parts that have been uploaded for a specific multipart upload.
    */
  def listParts(params: ListPartsRequest): Request[ListPartsOutput, AWSError] = js.native
  def listParts(
    params: ListPartsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPartsOutput, Unit]
  ): Request[ListPartsOutput, AWSError] = js.native
  /**
    * Sets the accelerate configuration of an existing bucket.
    */
  def putBucketAccelerateConfiguration(): Request[js.Object, AWSError] = js.native
  def putBucketAccelerateConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets the accelerate configuration of an existing bucket.
    */
  def putBucketAccelerateConfiguration(params: PutBucketAccelerateConfigurationRequest): Request[js.Object, AWSError] = js.native
  def putBucketAccelerateConfiguration(
    params: PutBucketAccelerateConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Sets the permissions on a bucket using access control lists (ACL).
    */
  def putBucketAcl(): Request[js.Object, AWSError] = js.native
  def putBucketAcl(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets the permissions on a bucket using access control lists (ACL).
    */
  def putBucketAcl(params: PutBucketAclRequest): Request[js.Object, AWSError] = js.native
  def putBucketAcl(
    params: PutBucketAclRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Sets an analytics configuration for the bucket (specified by the analytics configuration ID).
    */
  def putBucketAnalyticsConfiguration(): Request[js.Object, AWSError] = js.native
  def putBucketAnalyticsConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets an analytics configuration for the bucket (specified by the analytics configuration ID).
    */
  def putBucketAnalyticsConfiguration(params: PutBucketAnalyticsConfigurationRequest): Request[js.Object, AWSError] = js.native
  def putBucketAnalyticsConfiguration(
    params: PutBucketAnalyticsConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Sets the CORS configuration for a bucket.
    */
  def putBucketCors(): Request[js.Object, AWSError] = js.native
  def putBucketCors(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets the CORS configuration for a bucket.
    */
  def putBucketCors(params: PutBucketCorsRequest): Request[js.Object, AWSError] = js.native
  def putBucketCors(
    params: PutBucketCorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Creates a new server-side encryption configuration (or replaces an existing one, if present).
    */
  def putBucketEncryption(): Request[js.Object, AWSError] = js.native
  def putBucketEncryption(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates a new server-side encryption configuration (or replaces an existing one, if present).
    */
  def putBucketEncryption(params: PutBucketEncryptionRequest): Request[js.Object, AWSError] = js.native
  def putBucketEncryption(
    params: PutBucketEncryptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Adds an inventory configuration (identified by the inventory ID) from the bucket.
    */
  def putBucketInventoryConfiguration(): Request[js.Object, AWSError] = js.native
  def putBucketInventoryConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds an inventory configuration (identified by the inventory ID) from the bucket.
    */
  def putBucketInventoryConfiguration(params: PutBucketInventoryConfigurationRequest): Request[js.Object, AWSError] = js.native
  def putBucketInventoryConfiguration(
    params: PutBucketInventoryConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    *  No longer used, see the PutBucketLifecycleConfiguration operation.
    */
  def putBucketLifecycle(): Request[js.Object, AWSError] = js.native
  def putBucketLifecycle(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  No longer used, see the PutBucketLifecycleConfiguration operation.
    */
  def putBucketLifecycle(params: PutBucketLifecycleRequest): Request[js.Object, AWSError] = js.native
  def putBucketLifecycle(
    params: PutBucketLifecycleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Sets lifecycle configuration for your bucket. If a lifecycle configuration exists, it replaces it.
    */
  def putBucketLifecycleConfiguration(): Request[js.Object, AWSError] = js.native
  def putBucketLifecycleConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets lifecycle configuration for your bucket. If a lifecycle configuration exists, it replaces it.
    */
  def putBucketLifecycleConfiguration(params: PutBucketLifecycleConfigurationRequest): Request[js.Object, AWSError] = js.native
  def putBucketLifecycleConfiguration(
    params: PutBucketLifecycleConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Set the logging parameters for a bucket and to specify permissions for who can view and modify the logging parameters. To set the logging status of a bucket, you must be the bucket owner.
    */
  def putBucketLogging(): Request[js.Object, AWSError] = js.native
  def putBucketLogging(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Set the logging parameters for a bucket and to specify permissions for who can view and modify the logging parameters. To set the logging status of a bucket, you must be the bucket owner.
    */
  def putBucketLogging(params: PutBucketLoggingRequest): Request[js.Object, AWSError] = js.native
  def putBucketLogging(
    params: PutBucketLoggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Sets a metrics configuration (specified by the metrics configuration ID) for the bucket.
    */
  def putBucketMetricsConfiguration(): Request[js.Object, AWSError] = js.native
  def putBucketMetricsConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets a metrics configuration (specified by the metrics configuration ID) for the bucket.
    */
  def putBucketMetricsConfiguration(params: PutBucketMetricsConfigurationRequest): Request[js.Object, AWSError] = js.native
  def putBucketMetricsConfiguration(
    params: PutBucketMetricsConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    *  No longer used, see the PutBucketNotificationConfiguration operation.
    */
  def putBucketNotification(): Request[js.Object, AWSError] = js.native
  def putBucketNotification(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  No longer used, see the PutBucketNotificationConfiguration operation.
    */
  def putBucketNotification(params: PutBucketNotificationRequest): Request[js.Object, AWSError] = js.native
  def putBucketNotification(
    params: PutBucketNotificationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Enables notifications of specified events for a bucket.
    */
  def putBucketNotificationConfiguration(): Request[js.Object, AWSError] = js.native
  def putBucketNotificationConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Enables notifications of specified events for a bucket.
    */
  def putBucketNotificationConfiguration(params: PutBucketNotificationConfigurationRequest): Request[js.Object, AWSError] = js.native
  def putBucketNotificationConfiguration(
    params: PutBucketNotificationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Applies an Amazon S3 bucket policy to an Amazon S3 bucket.
    */
  def putBucketPolicy(): Request[js.Object, AWSError] = js.native
  def putBucketPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Applies an Amazon S3 bucket policy to an Amazon S3 bucket.
    */
  def putBucketPolicy(params: PutBucketPolicyRequest): Request[js.Object, AWSError] = js.native
  def putBucketPolicy(
    params: PutBucketPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    *  Creates a replication configuration or replaces an existing one. For more information, see Cross-Region Replication (CRR) in the Amazon S3 Developer Guide. 
    */
  def putBucketReplication(): Request[js.Object, AWSError] = js.native
  def putBucketReplication(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  Creates a replication configuration or replaces an existing one. For more information, see Cross-Region Replication (CRR) in the Amazon S3 Developer Guide. 
    */
  def putBucketReplication(params: PutBucketReplicationRequest): Request[js.Object, AWSError] = js.native
  def putBucketReplication(
    params: PutBucketReplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Sets the request payment configuration for a bucket. By default, the bucket owner pays for downloads from the bucket. This configuration parameter enables the bucket owner (only) to specify that the person requesting the download will be charged for the download. Documentation on requester pays buckets can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html
    */
  def putBucketRequestPayment(): Request[js.Object, AWSError] = js.native
  def putBucketRequestPayment(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets the request payment configuration for a bucket. By default, the bucket owner pays for downloads from the bucket. This configuration parameter enables the bucket owner (only) to specify that the person requesting the download will be charged for the download. Documentation on requester pays buckets can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html
    */
  def putBucketRequestPayment(params: PutBucketRequestPaymentRequest): Request[js.Object, AWSError] = js.native
  def putBucketRequestPayment(
    params: PutBucketRequestPaymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Sets the tags for a bucket.
    */
  def putBucketTagging(): Request[js.Object, AWSError] = js.native
  def putBucketTagging(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets the tags for a bucket.
    */
  def putBucketTagging(params: PutBucketTaggingRequest): Request[js.Object, AWSError] = js.native
  def putBucketTagging(
    params: PutBucketTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Sets the versioning state of an existing bucket. To set the versioning state, you must be the bucket owner.
    */
  def putBucketVersioning(): Request[js.Object, AWSError] = js.native
  def putBucketVersioning(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets the versioning state of an existing bucket. To set the versioning state, you must be the bucket owner.
    */
  def putBucketVersioning(params: PutBucketVersioningRequest): Request[js.Object, AWSError] = js.native
  def putBucketVersioning(
    params: PutBucketVersioningRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Set the website configuration for a bucket.
    */
  def putBucketWebsite(): Request[js.Object, AWSError] = js.native
  def putBucketWebsite(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Set the website configuration for a bucket.
    */
  def putBucketWebsite(params: PutBucketWebsiteRequest): Request[js.Object, AWSError] = js.native
  def putBucketWebsite(
    params: PutBucketWebsiteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Adds an object to a bucket.
    */
  def putObject(): Request[PutObjectOutput, AWSError] = js.native
  def putObject(callback: js.Function2[/* err */ AWSError, /* data */ PutObjectOutput, Unit]): Request[PutObjectOutput, AWSError] = js.native
  /**
    * Adds an object to a bucket.
    */
  def putObject(params: PutObjectRequest): Request[PutObjectOutput, AWSError] = js.native
  def putObject(
    params: PutObjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutObjectOutput, Unit]
  ): Request[PutObjectOutput, AWSError] = js.native
  /**
    * uses the acl subresource to set the access control list (ACL) permissions for an object that already exists in a bucket
    */
  def putObjectAcl(): Request[PutObjectAclOutput, AWSError] = js.native
  def putObjectAcl(callback: js.Function2[/* err */ AWSError, /* data */ PutObjectAclOutput, Unit]): Request[PutObjectAclOutput, AWSError] = js.native
  /**
    * uses the acl subresource to set the access control list (ACL) permissions for an object that already exists in a bucket
    */
  def putObjectAcl(params: PutObjectAclRequest): Request[PutObjectAclOutput, AWSError] = js.native
  def putObjectAcl(
    params: PutObjectAclRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutObjectAclOutput, Unit]
  ): Request[PutObjectAclOutput, AWSError] = js.native
  /**
    * Applies a Legal Hold configuration to the specified object.
    */
  def putObjectLegalHold(): Request[PutObjectLegalHoldOutput, AWSError] = js.native
  def putObjectLegalHold(callback: js.Function2[/* err */ AWSError, /* data */ PutObjectLegalHoldOutput, Unit]): Request[PutObjectLegalHoldOutput, AWSError] = js.native
  /**
    * Applies a Legal Hold configuration to the specified object.
    */
  def putObjectLegalHold(params: PutObjectLegalHoldRequest): Request[PutObjectLegalHoldOutput, AWSError] = js.native
  def putObjectLegalHold(
    params: PutObjectLegalHoldRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutObjectLegalHoldOutput, Unit]
  ): Request[PutObjectLegalHoldOutput, AWSError] = js.native
  /**
    * Places an object lock configuration on the specified bucket. The rule specified in the object lock configuration will be applied by default to every new object placed in the specified bucket.
    */
  def putObjectLockConfiguration(): Request[PutObjectLockConfigurationOutput, AWSError] = js.native
  def putObjectLockConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ PutObjectLockConfigurationOutput, Unit]): Request[PutObjectLockConfigurationOutput, AWSError] = js.native
  /**
    * Places an object lock configuration on the specified bucket. The rule specified in the object lock configuration will be applied by default to every new object placed in the specified bucket.
    */
  def putObjectLockConfiguration(params: PutObjectLockConfigurationRequest): Request[PutObjectLockConfigurationOutput, AWSError] = js.native
  def putObjectLockConfiguration(
    params: PutObjectLockConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutObjectLockConfigurationOutput, Unit]
  ): Request[PutObjectLockConfigurationOutput, AWSError] = js.native
  /**
    * Places an Object Retention configuration on an object.
    */
  def putObjectRetention(): Request[PutObjectRetentionOutput, AWSError] = js.native
  def putObjectRetention(callback: js.Function2[/* err */ AWSError, /* data */ PutObjectRetentionOutput, Unit]): Request[PutObjectRetentionOutput, AWSError] = js.native
  /**
    * Places an Object Retention configuration on an object.
    */
  def putObjectRetention(params: PutObjectRetentionRequest): Request[PutObjectRetentionOutput, AWSError] = js.native
  def putObjectRetention(
    params: PutObjectRetentionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutObjectRetentionOutput, Unit]
  ): Request[PutObjectRetentionOutput, AWSError] = js.native
  /**
    * Sets the supplied tag-set to an object that already exists in a bucket
    */
  def putObjectTagging(): Request[PutObjectTaggingOutput, AWSError] = js.native
  def putObjectTagging(callback: js.Function2[/* err */ AWSError, /* data */ PutObjectTaggingOutput, Unit]): Request[PutObjectTaggingOutput, AWSError] = js.native
  /**
    * Sets the supplied tag-set to an object that already exists in a bucket
    */
  def putObjectTagging(params: PutObjectTaggingRequest): Request[PutObjectTaggingOutput, AWSError] = js.native
  def putObjectTagging(
    params: PutObjectTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutObjectTaggingOutput, Unit]
  ): Request[PutObjectTaggingOutput, AWSError] = js.native
  /**
    * Creates or modifies the PublicAccessBlock configuration for an Amazon S3 bucket.
    */
  def putPublicAccessBlock(): Request[js.Object, AWSError] = js.native
  def putPublicAccessBlock(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates or modifies the PublicAccessBlock configuration for an Amazon S3 bucket.
    */
  def putPublicAccessBlock(params: PutPublicAccessBlockRequest): Request[js.Object, AWSError] = js.native
  def putPublicAccessBlock(
    params: PutPublicAccessBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Restores an archived copy of an object back into Amazon S3
    */
  def restoreObject(): Request[RestoreObjectOutput, AWSError] = js.native
  def restoreObject(callback: js.Function2[/* err */ AWSError, /* data */ RestoreObjectOutput, Unit]): Request[RestoreObjectOutput, AWSError] = js.native
  /**
    * Restores an archived copy of an object back into Amazon S3
    */
  def restoreObject(params: RestoreObjectRequest): Request[RestoreObjectOutput, AWSError] = js.native
  def restoreObject(
    params: RestoreObjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreObjectOutput, Unit]
  ): Request[RestoreObjectOutput, AWSError] = js.native
  /**
    * This operation filters the contents of an Amazon S3 object based on a simple Structured Query Language (SQL) statement. In the request, along with the SQL expression, you must also specify a data serialization format (JSON or CSV) of the object. Amazon S3 uses this to parse object data into records, and returns only records that match the specified SQL expression. You must also specify the data serialization format for the response.
    */
  def selectObjectContent(): Request[SelectObjectContentOutput, AWSError] = js.native
  def selectObjectContent(callback: js.Function2[/* err */ AWSError, /* data */ SelectObjectContentOutput, Unit]): Request[SelectObjectContentOutput, AWSError] = js.native
  /**
    * This operation filters the contents of an Amazon S3 object based on a simple Structured Query Language (SQL) statement. In the request, along with the SQL expression, you must also specify a data serialization format (JSON or CSV) of the object. Amazon S3 uses this to parse object data into records, and returns only records that match the specified SQL expression. You must also specify the data serialization format for the response.
    */
  def selectObjectContent(params: SelectObjectContentRequest): Request[SelectObjectContentOutput, AWSError] = js.native
  def selectObjectContent(
    params: SelectObjectContentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SelectObjectContentOutput, Unit]
  ): Request[SelectObjectContentOutput, AWSError] = js.native
  /**
    * Uploads a part in a multipart upload.  Note: After you initiate multipart upload and upload one or more parts, you must either complete or abort multipart upload in order to stop getting charged for storage of the uploaded parts. Only after you either complete or abort multipart upload, Amazon S3 frees up the parts storage and stops charging you for the parts storage.
    */
  def uploadPart(): Request[UploadPartOutput, AWSError] = js.native
  def uploadPart(callback: js.Function2[/* err */ AWSError, /* data */ UploadPartOutput, Unit]): Request[UploadPartOutput, AWSError] = js.native
  /**
    * Uploads a part in a multipart upload.  Note: After you initiate multipart upload and upload one or more parts, you must either complete or abort multipart upload in order to stop getting charged for storage of the uploaded parts. Only after you either complete or abort multipart upload, Amazon S3 frees up the parts storage and stops charging you for the parts storage.
    */
  def uploadPart(params: UploadPartRequest): Request[UploadPartOutput, AWSError] = js.native
  def uploadPart(
    params: UploadPartRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UploadPartOutput, Unit]
  ): Request[UploadPartOutput, AWSError] = js.native
  /**
    * Uploads a part by copying data from an existing object as data source.
    */
  def uploadPartCopy(): Request[UploadPartCopyOutput, AWSError] = js.native
  def uploadPartCopy(callback: js.Function2[/* err */ AWSError, /* data */ UploadPartCopyOutput, Unit]): Request[UploadPartCopyOutput, AWSError] = js.native
  /**
    * Uploads a part by copying data from an existing object as data source.
    */
  def uploadPartCopy(params: UploadPartCopyRequest): Request[UploadPartCopyOutput, AWSError] = js.native
  def uploadPartCopy(
    params: UploadPartCopyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UploadPartCopyOutput, Unit]
  ): Request[UploadPartCopyOutput, AWSError] = js.native
  /**
    * Waits for the bucketExists state by periodically calling the underlying S3.headBucketoperation every 5 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_bucketExists(state: bucketExists): Request[js.Object, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_bucketExists(state: bucketExists, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Waits for the bucketExists state by periodically calling the underlying S3.headBucketoperation every 5 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_bucketExists(state: bucketExists, params: HeadBucketRequest with Anon_Waiter): Request[js.Object, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_bucketExists(
    state: bucketExists,
    params: HeadBucketRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Waits for the bucketNotExists state by periodically calling the underlying S3.headBucketoperation every 5 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_bucketNotExists(state: bucketNotExists): Request[js.Object, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_bucketNotExists(state: bucketNotExists, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Waits for the bucketNotExists state by periodically calling the underlying S3.headBucketoperation every 5 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_bucketNotExists(state: bucketNotExists, params: HeadBucketRequest with Anon_Waiter): Request[js.Object, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_bucketNotExists(
    state: bucketNotExists,
    params: HeadBucketRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Waits for the objectExists state by periodically calling the underlying S3.headObjectoperation every 5 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_objectExists(state: objectExists): Request[HeadObjectOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_objectExists(state: objectExists, callback: js.Function2[/* err */ AWSError, /* data */ HeadObjectOutput, Unit]): Request[HeadObjectOutput, AWSError] = js.native
  /**
    * Waits for the objectExists state by periodically calling the underlying S3.headObjectoperation every 5 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_objectExists(state: objectExists, params: HeadObjectRequest with Anon_Waiter): Request[HeadObjectOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_objectExists(
    state: objectExists,
    params: HeadObjectRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ HeadObjectOutput, Unit]
  ): Request[HeadObjectOutput, AWSError] = js.native
  /**
    * Waits for the objectNotExists state by periodically calling the underlying S3.headObjectoperation every 5 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_objectNotExists(state: objectNotExists): Request[HeadObjectOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_objectNotExists(
    state: objectNotExists,
    callback: js.Function2[/* err */ AWSError, /* data */ HeadObjectOutput, Unit]
  ): Request[HeadObjectOutput, AWSError] = js.native
  /**
    * Waits for the objectNotExists state by periodically calling the underlying S3.headObjectoperation every 5 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_objectNotExists(state: objectNotExists, params: HeadObjectRequest with Anon_Waiter): Request[HeadObjectOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_objectNotExists(
    state: objectNotExists,
    params: HeadObjectRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ HeadObjectOutput, Unit]
  ): Request[HeadObjectOutput, AWSError] = js.native
}

