package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3
  extends awsDashSdkLib.libServicesS3Mod.S3Customizations {
  @JSName("config")
  var config_S3: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Aborts a multipart upload. To verify that all parts have been removed, so you don't get charged for the part storage, you should call the List Parts operation and ensure the parts list is empty.
    */
  def abortMultipartUpload(): awsDashSdkLib.libRequestMod.Request[AbortMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def abortMultipartUpload(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AbortMultipartUploadOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AbortMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Aborts a multipart upload. To verify that all parts have been removed, so you don't get charged for the part storage, you should call the List Parts operation and ensure the parts list is empty.
    */
  def abortMultipartUpload(params: AbortMultipartUploadRequest): awsDashSdkLib.libRequestMod.Request[AbortMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def abortMultipartUpload(
    params: AbortMultipartUploadRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AbortMultipartUploadOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AbortMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Completes a multipart upload by assembling previously uploaded parts.
    */
  def completeMultipartUpload(): awsDashSdkLib.libRequestMod.Request[CompleteMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def completeMultipartUpload(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CompleteMultipartUploadOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CompleteMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Completes a multipart upload by assembling previously uploaded parts.
    */
  def completeMultipartUpload(params: CompleteMultipartUploadRequest): awsDashSdkLib.libRequestMod.Request[CompleteMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def completeMultipartUpload(
    params: CompleteMultipartUploadRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CompleteMultipartUploadOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CompleteMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a copy of an object that is already stored in Amazon S3.
    */
  def copyObject(): awsDashSdkLib.libRequestMod.Request[CopyObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def copyObject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CopyObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CopyObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a copy of an object that is already stored in Amazon S3.
    */
  def copyObject(params: CopyObjectRequest): awsDashSdkLib.libRequestMod.Request[CopyObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def copyObject(
    params: CopyObjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CopyObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CopyObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new bucket.
    */
  def createBucket(): awsDashSdkLib.libRequestMod.Request[CreateBucketOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createBucket(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateBucketOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateBucketOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new bucket.
    */
  def createBucket(params: CreateBucketRequest): awsDashSdkLib.libRequestMod.Request[CreateBucketOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createBucket(
    params: CreateBucketRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateBucketOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateBucketOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Initiates a multipart upload and returns an upload ID.  Note: After you initiate multipart upload and upload one or more parts, you must either complete or abort multipart upload in order to stop getting charged for storage of the uploaded parts. Only after you either complete or abort multipart upload, Amazon S3 frees up the parts storage and stops charging you for the parts storage.
    */
  def createMultipartUpload(): awsDashSdkLib.libRequestMod.Request[CreateMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createMultipartUpload(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateMultipartUploadOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Initiates a multipart upload and returns an upload ID.  Note: After you initiate multipart upload and upload one or more parts, you must either complete or abort multipart upload in order to stop getting charged for storage of the uploaded parts. Only after you either complete or abort multipart upload, Amazon S3 frees up the parts storage and stops charging you for the parts storage.
    */
  def createMultipartUpload(params: CreateMultipartUploadRequest): awsDashSdkLib.libRequestMod.Request[CreateMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createMultipartUpload(
    params: CreateMultipartUploadRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateMultipartUploadOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the bucket. All objects (including all object versions and Delete Markers) in the bucket must be deleted before the bucket itself can be deleted.
    */
  def deleteBucket(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucket(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the bucket. All objects (including all object versions and Delete Markers) in the bucket must be deleted before the bucket itself can be deleted.
    */
  def deleteBucket(params: DeleteBucketRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucket(
    params: DeleteBucketRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an analytics configuration for the bucket (specified by the analytics configuration ID). To use this operation, you must have permissions to perform the s3:PutAnalyticsConfiguration action. The bucket owner has this permission by default. The bucket owner can grant this permission to others. 
    */
  def deleteBucketAnalyticsConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketAnalyticsConfiguration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an analytics configuration for the bucket (specified by the analytics configuration ID). To use this operation, you must have permissions to perform the s3:PutAnalyticsConfiguration action. The bucket owner has this permission by default. The bucket owner can grant this permission to others. 
    */
  def deleteBucketAnalyticsConfiguration(params: DeleteBucketAnalyticsConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketAnalyticsConfiguration(
    params: DeleteBucketAnalyticsConfigurationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the CORS configuration information set for the bucket.
    */
  def deleteBucketCors(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketCors(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the CORS configuration information set for the bucket.
    */
  def deleteBucketCors(params: DeleteBucketCorsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketCors(
    params: DeleteBucketCorsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the server-side encryption configuration from the bucket.
    */
  def deleteBucketEncryption(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketEncryption(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the server-side encryption configuration from the bucket.
    */
  def deleteBucketEncryption(params: DeleteBucketEncryptionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketEncryption(
    params: DeleteBucketEncryptionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an inventory configuration (identified by the inventory ID) from the bucket.
    */
  def deleteBucketInventoryConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketInventoryConfiguration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an inventory configuration (identified by the inventory ID) from the bucket.
    */
  def deleteBucketInventoryConfiguration(params: DeleteBucketInventoryConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketInventoryConfiguration(
    params: DeleteBucketInventoryConfigurationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the lifecycle configuration from the bucket.
    */
  def deleteBucketLifecycle(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketLifecycle(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the lifecycle configuration from the bucket.
    */
  def deleteBucketLifecycle(params: DeleteBucketLifecycleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketLifecycle(
    params: DeleteBucketLifecycleRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a metrics configuration (specified by the metrics configuration ID) from the bucket.
    */
  def deleteBucketMetricsConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketMetricsConfiguration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a metrics configuration (specified by the metrics configuration ID) from the bucket.
    */
  def deleteBucketMetricsConfiguration(params: DeleteBucketMetricsConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketMetricsConfiguration(
    params: DeleteBucketMetricsConfigurationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the policy from the bucket.
    */
  def deleteBucketPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the policy from the bucket.
    */
  def deleteBucketPolicy(params: DeleteBucketPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketPolicy(
    params: DeleteBucketPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Deletes the replication configuration from the bucket. For information about replication configuration, see Cross-Region Replication (CRR) in the Amazon S3 Developer Guide. 
    */
  def deleteBucketReplication(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketReplication(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Deletes the replication configuration from the bucket. For information about replication configuration, see Cross-Region Replication (CRR) in the Amazon S3 Developer Guide. 
    */
  def deleteBucketReplication(params: DeleteBucketReplicationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketReplication(
    params: DeleteBucketReplicationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the tags from the bucket.
    */
  def deleteBucketTagging(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketTagging(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the tags from the bucket.
    */
  def deleteBucketTagging(params: DeleteBucketTaggingRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketTagging(
    params: DeleteBucketTaggingRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This operation removes the website configuration from the bucket.
    */
  def deleteBucketWebsite(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketWebsite(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This operation removes the website configuration from the bucket.
    */
  def deleteBucketWebsite(params: DeleteBucketWebsiteRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketWebsite(
    params: DeleteBucketWebsiteRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the null version (if there is one) of an object and inserts a delete marker, which becomes the latest version of the object. If there isn't a null version, Amazon S3 does not remove any objects.
    */
  def deleteObject(): awsDashSdkLib.libRequestMod.Request[DeleteObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteObject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the null version (if there is one) of an object and inserts a delete marker, which becomes the latest version of the object. If there isn't a null version, Amazon S3 does not remove any objects.
    */
  def deleteObject(params: DeleteObjectRequest): awsDashSdkLib.libRequestMod.Request[DeleteObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteObject(
    params: DeleteObjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the tag-set from an existing object.
    */
  def deleteObjectTagging(): awsDashSdkLib.libRequestMod.Request[DeleteObjectTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteObjectTagging(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteObjectTaggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteObjectTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the tag-set from an existing object.
    */
  def deleteObjectTagging(params: DeleteObjectTaggingRequest): awsDashSdkLib.libRequestMod.Request[DeleteObjectTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteObjectTagging(
    params: DeleteObjectTaggingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteObjectTaggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteObjectTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This operation enables you to delete multiple objects from a bucket using a single HTTP request. You may specify up to 1000 keys.
    */
  def deleteObjects(): awsDashSdkLib.libRequestMod.Request[DeleteObjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteObjects(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteObjectsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteObjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This operation enables you to delete multiple objects from a bucket using a single HTTP request. You may specify up to 1000 keys.
    */
  def deleteObjects(params: DeleteObjectsRequest): awsDashSdkLib.libRequestMod.Request[DeleteObjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteObjects(
    params: DeleteObjectsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteObjectsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteObjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the PublicAccessBlock configuration from an Amazon S3 bucket.
    */
  def deletePublicAccessBlock(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePublicAccessBlock(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the PublicAccessBlock configuration from an Amazon S3 bucket.
    */
  def deletePublicAccessBlock(params: DeletePublicAccessBlockRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePublicAccessBlock(
    params: DeletePublicAccessBlockRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the accelerate configuration of a bucket.
    */
  def getBucketAccelerateConfiguration(): awsDashSdkLib.libRequestMod.Request[GetBucketAccelerateConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketAccelerateConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketAccelerateConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketAccelerateConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the accelerate configuration of a bucket.
    */
  def getBucketAccelerateConfiguration(params: GetBucketAccelerateConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetBucketAccelerateConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketAccelerateConfiguration(
    params: GetBucketAccelerateConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketAccelerateConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketAccelerateConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the access control policy for the bucket.
    */
  def getBucketAcl(): awsDashSdkLib.libRequestMod.Request[GetBucketAclOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketAcl(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketAclOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketAclOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the access control policy for the bucket.
    */
  def getBucketAcl(params: GetBucketAclRequest): awsDashSdkLib.libRequestMod.Request[GetBucketAclOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketAcl(
    params: GetBucketAclRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketAclOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketAclOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets an analytics configuration for the bucket (specified by the analytics configuration ID).
    */
  def getBucketAnalyticsConfiguration(): awsDashSdkLib.libRequestMod.Request[GetBucketAnalyticsConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketAnalyticsConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketAnalyticsConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketAnalyticsConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets an analytics configuration for the bucket (specified by the analytics configuration ID).
    */
  def getBucketAnalyticsConfiguration(params: GetBucketAnalyticsConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetBucketAnalyticsConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketAnalyticsConfiguration(
    params: GetBucketAnalyticsConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketAnalyticsConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketAnalyticsConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the CORS configuration for the bucket.
    */
  def getBucketCors(): awsDashSdkLib.libRequestMod.Request[GetBucketCorsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketCors(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketCorsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketCorsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the CORS configuration for the bucket.
    */
  def getBucketCors(params: GetBucketCorsRequest): awsDashSdkLib.libRequestMod.Request[GetBucketCorsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketCors(
    params: GetBucketCorsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketCorsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketCorsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the server-side encryption configuration of a bucket.
    */
  def getBucketEncryption(): awsDashSdkLib.libRequestMod.Request[GetBucketEncryptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketEncryption(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketEncryptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketEncryptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the server-side encryption configuration of a bucket.
    */
  def getBucketEncryption(params: GetBucketEncryptionRequest): awsDashSdkLib.libRequestMod.Request[GetBucketEncryptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketEncryption(
    params: GetBucketEncryptionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketEncryptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketEncryptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns an inventory configuration (identified by the inventory ID) from the bucket.
    */
  def getBucketInventoryConfiguration(): awsDashSdkLib.libRequestMod.Request[GetBucketInventoryConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketInventoryConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketInventoryConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketInventoryConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns an inventory configuration (identified by the inventory ID) from the bucket.
    */
  def getBucketInventoryConfiguration(params: GetBucketInventoryConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetBucketInventoryConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketInventoryConfiguration(
    params: GetBucketInventoryConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketInventoryConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketInventoryConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  No longer used, see the GetBucketLifecycleConfiguration operation.
    */
  def getBucketLifecycle(): awsDashSdkLib.libRequestMod.Request[GetBucketLifecycleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketLifecycle(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketLifecycleOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketLifecycleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  No longer used, see the GetBucketLifecycleConfiguration operation.
    */
  def getBucketLifecycle(params: GetBucketLifecycleRequest): awsDashSdkLib.libRequestMod.Request[GetBucketLifecycleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketLifecycle(
    params: GetBucketLifecycleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketLifecycleOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketLifecycleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the lifecycle configuration information set on the bucket.
    */
  def getBucketLifecycleConfiguration(): awsDashSdkLib.libRequestMod.Request[GetBucketLifecycleConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketLifecycleConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketLifecycleConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketLifecycleConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the lifecycle configuration information set on the bucket.
    */
  def getBucketLifecycleConfiguration(params: GetBucketLifecycleConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetBucketLifecycleConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketLifecycleConfiguration(
    params: GetBucketLifecycleConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketLifecycleConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketLifecycleConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the region the bucket resides in.
    */
  def getBucketLocation(): awsDashSdkLib.libRequestMod.Request[GetBucketLocationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketLocation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketLocationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketLocationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the region the bucket resides in.
    */
  def getBucketLocation(params: GetBucketLocationRequest): awsDashSdkLib.libRequestMod.Request[GetBucketLocationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketLocation(
    params: GetBucketLocationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketLocationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketLocationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the logging status of a bucket and the permissions users have to view and modify that status. To use GET, you must be the bucket owner.
    */
  def getBucketLogging(): awsDashSdkLib.libRequestMod.Request[GetBucketLoggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketLogging(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketLoggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketLoggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the logging status of a bucket and the permissions users have to view and modify that status. To use GET, you must be the bucket owner.
    */
  def getBucketLogging(params: GetBucketLoggingRequest): awsDashSdkLib.libRequestMod.Request[GetBucketLoggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketLogging(
    params: GetBucketLoggingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketLoggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketLoggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a metrics configuration (specified by the metrics configuration ID) from the bucket.
    */
  def getBucketMetricsConfiguration(): awsDashSdkLib.libRequestMod.Request[GetBucketMetricsConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketMetricsConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketMetricsConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketMetricsConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a metrics configuration (specified by the metrics configuration ID) from the bucket.
    */
  def getBucketMetricsConfiguration(params: GetBucketMetricsConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetBucketMetricsConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketMetricsConfiguration(
    params: GetBucketMetricsConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketMetricsConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketMetricsConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  No longer used, see the GetBucketNotificationConfiguration operation.
    */
  def getBucketNotification(): awsDashSdkLib.libRequestMod.Request[NotificationConfigurationDeprecated, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketNotification(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ NotificationConfigurationDeprecated, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[NotificationConfigurationDeprecated, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  No longer used, see the GetBucketNotificationConfiguration operation.
    */
  def getBucketNotification(params: GetBucketNotificationConfigurationRequest): awsDashSdkLib.libRequestMod.Request[NotificationConfigurationDeprecated, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketNotification(
    params: GetBucketNotificationConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ NotificationConfigurationDeprecated, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[NotificationConfigurationDeprecated, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the notification configuration of a bucket.
    */
  def getBucketNotificationConfiguration(): awsDashSdkLib.libRequestMod.Request[NotificationConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketNotificationConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ NotificationConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[NotificationConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the notification configuration of a bucket.
    */
  def getBucketNotificationConfiguration(params: GetBucketNotificationConfigurationRequest): awsDashSdkLib.libRequestMod.Request[NotificationConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketNotificationConfiguration(
    params: GetBucketNotificationConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ NotificationConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[NotificationConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the policy of a specified bucket.
    */
  def getBucketPolicy(): awsDashSdkLib.libRequestMod.Request[GetBucketPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the policy of a specified bucket.
    */
  def getBucketPolicy(params: GetBucketPolicyRequest): awsDashSdkLib.libRequestMod.Request[GetBucketPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketPolicy(
    params: GetBucketPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the policy status for an Amazon S3 bucket, indicating whether the bucket is public.
    */
  def getBucketPolicyStatus(): awsDashSdkLib.libRequestMod.Request[GetBucketPolicyStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketPolicyStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketPolicyStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketPolicyStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the policy status for an Amazon S3 bucket, indicating whether the bucket is public.
    */
  def getBucketPolicyStatus(params: GetBucketPolicyStatusRequest): awsDashSdkLib.libRequestMod.Request[GetBucketPolicyStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketPolicyStatus(
    params: GetBucketPolicyStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketPolicyStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketPolicyStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the replication configuration of a bucket.   It can take a while to propagate the put or delete a replication configuration to all Amazon S3 systems. Therefore, a get request soon after put or delete can return a wrong result.  
    */
  def getBucketReplication(): awsDashSdkLib.libRequestMod.Request[GetBucketReplicationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketReplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketReplicationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketReplicationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the replication configuration of a bucket.   It can take a while to propagate the put or delete a replication configuration to all Amazon S3 systems. Therefore, a get request soon after put or delete can return a wrong result.  
    */
  def getBucketReplication(params: GetBucketReplicationRequest): awsDashSdkLib.libRequestMod.Request[GetBucketReplicationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketReplication(
    params: GetBucketReplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketReplicationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketReplicationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the request payment configuration of a bucket.
    */
  def getBucketRequestPayment(): awsDashSdkLib.libRequestMod.Request[GetBucketRequestPaymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketRequestPayment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketRequestPaymentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketRequestPaymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the request payment configuration of a bucket.
    */
  def getBucketRequestPayment(params: GetBucketRequestPaymentRequest): awsDashSdkLib.libRequestMod.Request[GetBucketRequestPaymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketRequestPayment(
    params: GetBucketRequestPaymentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketRequestPaymentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketRequestPaymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the tag set associated with the bucket.
    */
  def getBucketTagging(): awsDashSdkLib.libRequestMod.Request[GetBucketTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketTagging(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketTaggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the tag set associated with the bucket.
    */
  def getBucketTagging(params: GetBucketTaggingRequest): awsDashSdkLib.libRequestMod.Request[GetBucketTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketTagging(
    params: GetBucketTaggingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketTaggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the versioning state of a bucket.
    */
  def getBucketVersioning(): awsDashSdkLib.libRequestMod.Request[GetBucketVersioningOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketVersioning(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketVersioningOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketVersioningOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the versioning state of a bucket.
    */
  def getBucketVersioning(params: GetBucketVersioningRequest): awsDashSdkLib.libRequestMod.Request[GetBucketVersioningOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketVersioning(
    params: GetBucketVersioningRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketVersioningOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketVersioningOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the website configuration for a bucket.
    */
  def getBucketWebsite(): awsDashSdkLib.libRequestMod.Request[GetBucketWebsiteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketWebsite(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketWebsiteOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketWebsiteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the website configuration for a bucket.
    */
  def getBucketWebsite(params: GetBucketWebsiteRequest): awsDashSdkLib.libRequestMod.Request[GetBucketWebsiteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBucketWebsite(
    params: GetBucketWebsiteRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBucketWebsiteOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBucketWebsiteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves objects from Amazon S3.
    */
  def getObject(): awsDashSdkLib.libRequestMod.Request[GetObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getObject(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetObjectOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves objects from Amazon S3.
    */
  def getObject(params: GetObjectRequest): awsDashSdkLib.libRequestMod.Request[GetObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getObject(
    params: GetObjectRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetObjectOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the access control list (ACL) of an object.
    */
  def getObjectAcl(): awsDashSdkLib.libRequestMod.Request[GetObjectAclOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getObjectAcl(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetObjectAclOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetObjectAclOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the access control list (ACL) of an object.
    */
  def getObjectAcl(params: GetObjectAclRequest): awsDashSdkLib.libRequestMod.Request[GetObjectAclOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getObjectAcl(
    params: GetObjectAclRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetObjectAclOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetObjectAclOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets an object's current Legal Hold status.
    */
  def getObjectLegalHold(): awsDashSdkLib.libRequestMod.Request[GetObjectLegalHoldOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getObjectLegalHold(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetObjectLegalHoldOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetObjectLegalHoldOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets an object's current Legal Hold status.
    */
  def getObjectLegalHold(params: GetObjectLegalHoldRequest): awsDashSdkLib.libRequestMod.Request[GetObjectLegalHoldOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getObjectLegalHold(
    params: GetObjectLegalHoldRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetObjectLegalHoldOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetObjectLegalHoldOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the object lock configuration for a bucket. The rule specified in the object lock configuration will be applied by default to every new object placed in the specified bucket.
    */
  def getObjectLockConfiguration(): awsDashSdkLib.libRequestMod.Request[GetObjectLockConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getObjectLockConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetObjectLockConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetObjectLockConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the object lock configuration for a bucket. The rule specified in the object lock configuration will be applied by default to every new object placed in the specified bucket.
    */
  def getObjectLockConfiguration(params: GetObjectLockConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetObjectLockConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getObjectLockConfiguration(
    params: GetObjectLockConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetObjectLockConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetObjectLockConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves an object's retention settings.
    */
  def getObjectRetention(): awsDashSdkLib.libRequestMod.Request[GetObjectRetentionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getObjectRetention(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetObjectRetentionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetObjectRetentionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves an object's retention settings.
    */
  def getObjectRetention(params: GetObjectRetentionRequest): awsDashSdkLib.libRequestMod.Request[GetObjectRetentionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getObjectRetention(
    params: GetObjectRetentionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetObjectRetentionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetObjectRetentionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the tag-set of an object.
    */
  def getObjectTagging(): awsDashSdkLib.libRequestMod.Request[GetObjectTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getObjectTagging(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetObjectTaggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetObjectTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the tag-set of an object.
    */
  def getObjectTagging(params: GetObjectTaggingRequest): awsDashSdkLib.libRequestMod.Request[GetObjectTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getObjectTagging(
    params: GetObjectTaggingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetObjectTaggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetObjectTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Return torrent files from a bucket.
    */
  def getObjectTorrent(): awsDashSdkLib.libRequestMod.Request[GetObjectTorrentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getObjectTorrent(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetObjectTorrentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetObjectTorrentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Return torrent files from a bucket.
    */
  def getObjectTorrent(params: GetObjectTorrentRequest): awsDashSdkLib.libRequestMod.Request[GetObjectTorrentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getObjectTorrent(
    params: GetObjectTorrentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetObjectTorrentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetObjectTorrentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the PublicAccessBlock configuration for an Amazon S3 bucket.
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
    * Retrieves the PublicAccessBlock configuration for an Amazon S3 bucket.
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
    * This operation is useful to determine if a bucket exists and you have permission to access it.
    */
  def headBucket(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def headBucket(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This operation is useful to determine if a bucket exists and you have permission to access it.
    */
  def headBucket(params: HeadBucketRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def headBucket(
    params: HeadBucketRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The HEAD operation retrieves metadata from an object without returning the object itself. This operation is useful if you're only interested in an object's metadata. To use HEAD, you must have READ access to the object.
    */
  def headObject(): awsDashSdkLib.libRequestMod.Request[HeadObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def headObject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ HeadObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[HeadObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The HEAD operation retrieves metadata from an object without returning the object itself. This operation is useful if you're only interested in an object's metadata. To use HEAD, you must have READ access to the object.
    */
  def headObject(params: HeadObjectRequest): awsDashSdkLib.libRequestMod.Request[HeadObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def headObject(
    params: HeadObjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ HeadObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[HeadObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the analytics configurations for the bucket.
    */
  def listBucketAnalyticsConfigurations(): awsDashSdkLib.libRequestMod.Request[ListBucketAnalyticsConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBucketAnalyticsConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBucketAnalyticsConfigurationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBucketAnalyticsConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the analytics configurations for the bucket.
    */
  def listBucketAnalyticsConfigurations(params: ListBucketAnalyticsConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[ListBucketAnalyticsConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBucketAnalyticsConfigurations(
    params: ListBucketAnalyticsConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBucketAnalyticsConfigurationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBucketAnalyticsConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of inventory configurations for the bucket.
    */
  def listBucketInventoryConfigurations(): awsDashSdkLib.libRequestMod.Request[ListBucketInventoryConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBucketInventoryConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBucketInventoryConfigurationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBucketInventoryConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of inventory configurations for the bucket.
    */
  def listBucketInventoryConfigurations(params: ListBucketInventoryConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[ListBucketInventoryConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBucketInventoryConfigurations(
    params: ListBucketInventoryConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBucketInventoryConfigurationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBucketInventoryConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the metrics configurations for the bucket.
    */
  def listBucketMetricsConfigurations(): awsDashSdkLib.libRequestMod.Request[ListBucketMetricsConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBucketMetricsConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBucketMetricsConfigurationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBucketMetricsConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the metrics configurations for the bucket.
    */
  def listBucketMetricsConfigurations(params: ListBucketMetricsConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[ListBucketMetricsConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBucketMetricsConfigurations(
    params: ListBucketMetricsConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBucketMetricsConfigurationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBucketMetricsConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of all buckets owned by the authenticated sender of the request.
    */
  def listBuckets(): awsDashSdkLib.libRequestMod.Request[ListBucketsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBuckets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBucketsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBucketsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This operation lists in-progress multipart uploads.
    */
  def listMultipartUploads(): awsDashSdkLib.libRequestMod.Request[ListMultipartUploadsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listMultipartUploads(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListMultipartUploadsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListMultipartUploadsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This operation lists in-progress multipart uploads.
    */
  def listMultipartUploads(params: ListMultipartUploadsRequest): awsDashSdkLib.libRequestMod.Request[ListMultipartUploadsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listMultipartUploads(
    params: ListMultipartUploadsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListMultipartUploadsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListMultipartUploadsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata about all of the versions of objects in a bucket.
    */
  def listObjectVersions(): awsDashSdkLib.libRequestMod.Request[ListObjectVersionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listObjectVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListObjectVersionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListObjectVersionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata about all of the versions of objects in a bucket.
    */
  def listObjectVersions(params: ListObjectVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListObjectVersionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listObjectVersions(
    params: ListObjectVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListObjectVersionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListObjectVersionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns some or all (up to 1000) of the objects in a bucket. You can use the request parameters as selection criteria to return a subset of the objects in a bucket.
    */
  def listObjects(): awsDashSdkLib.libRequestMod.Request[ListObjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listObjects(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListObjectsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListObjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns some or all (up to 1000) of the objects in a bucket. You can use the request parameters as selection criteria to return a subset of the objects in a bucket.
    */
  def listObjects(params: ListObjectsRequest): awsDashSdkLib.libRequestMod.Request[ListObjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listObjects(
    params: ListObjectsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListObjectsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListObjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns some or all (up to 1000) of the objects in a bucket. You can use the request parameters as selection criteria to return a subset of the objects in a bucket. Note: ListObjectsV2 is the revised List Objects API and we recommend you use this revised API for new application development.
    */
  def listObjectsV2(): awsDashSdkLib.libRequestMod.Request[ListObjectsV2Output, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listObjectsV2(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListObjectsV2Output, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListObjectsV2Output, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns some or all (up to 1000) of the objects in a bucket. You can use the request parameters as selection criteria to return a subset of the objects in a bucket. Note: ListObjectsV2 is the revised List Objects API and we recommend you use this revised API for new application development.
    */
  def listObjectsV2(params: ListObjectsV2Request): awsDashSdkLib.libRequestMod.Request[ListObjectsV2Output, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listObjectsV2(
    params: ListObjectsV2Request,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListObjectsV2Output, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListObjectsV2Output, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the parts that have been uploaded for a specific multipart upload.
    */
  def listParts(): awsDashSdkLib.libRequestMod.Request[ListPartsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listParts(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListPartsOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ListPartsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the parts that have been uploaded for a specific multipart upload.
    */
  def listParts(params: ListPartsRequest): awsDashSdkLib.libRequestMod.Request[ListPartsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listParts(
    params: ListPartsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListPartsOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ListPartsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the accelerate configuration of an existing bucket.
    */
  def putBucketAccelerateConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketAccelerateConfiguration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the accelerate configuration of an existing bucket.
    */
  def putBucketAccelerateConfiguration(params: PutBucketAccelerateConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketAccelerateConfiguration(
    params: PutBucketAccelerateConfigurationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the permissions on a bucket using access control lists (ACL).
    */
  def putBucketAcl(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketAcl(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the permissions on a bucket using access control lists (ACL).
    */
  def putBucketAcl(params: PutBucketAclRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketAcl(
    params: PutBucketAclRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets an analytics configuration for the bucket (specified by the analytics configuration ID).
    */
  def putBucketAnalyticsConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketAnalyticsConfiguration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets an analytics configuration for the bucket (specified by the analytics configuration ID).
    */
  def putBucketAnalyticsConfiguration(params: PutBucketAnalyticsConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketAnalyticsConfiguration(
    params: PutBucketAnalyticsConfigurationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the CORS configuration for a bucket.
    */
  def putBucketCors(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketCors(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the CORS configuration for a bucket.
    */
  def putBucketCors(params: PutBucketCorsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketCors(
    params: PutBucketCorsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new server-side encryption configuration (or replaces an existing one, if present).
    */
  def putBucketEncryption(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketEncryption(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new server-side encryption configuration (or replaces an existing one, if present).
    */
  def putBucketEncryption(params: PutBucketEncryptionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketEncryption(
    params: PutBucketEncryptionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds an inventory configuration (identified by the inventory ID) from the bucket.
    */
  def putBucketInventoryConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketInventoryConfiguration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds an inventory configuration (identified by the inventory ID) from the bucket.
    */
  def putBucketInventoryConfiguration(params: PutBucketInventoryConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketInventoryConfiguration(
    params: PutBucketInventoryConfigurationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  No longer used, see the PutBucketLifecycleConfiguration operation.
    */
  def putBucketLifecycle(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketLifecycle(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  No longer used, see the PutBucketLifecycleConfiguration operation.
    */
  def putBucketLifecycle(params: PutBucketLifecycleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketLifecycle(
    params: PutBucketLifecycleRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets lifecycle configuration for your bucket. If a lifecycle configuration exists, it replaces it.
    */
  def putBucketLifecycleConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketLifecycleConfiguration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets lifecycle configuration for your bucket. If a lifecycle configuration exists, it replaces it.
    */
  def putBucketLifecycleConfiguration(params: PutBucketLifecycleConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketLifecycleConfiguration(
    params: PutBucketLifecycleConfigurationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Set the logging parameters for a bucket and to specify permissions for who can view and modify the logging parameters. To set the logging status of a bucket, you must be the bucket owner.
    */
  def putBucketLogging(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketLogging(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Set the logging parameters for a bucket and to specify permissions for who can view and modify the logging parameters. To set the logging status of a bucket, you must be the bucket owner.
    */
  def putBucketLogging(params: PutBucketLoggingRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketLogging(
    params: PutBucketLoggingRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets a metrics configuration (specified by the metrics configuration ID) for the bucket.
    */
  def putBucketMetricsConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketMetricsConfiguration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets a metrics configuration (specified by the metrics configuration ID) for the bucket.
    */
  def putBucketMetricsConfiguration(params: PutBucketMetricsConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketMetricsConfiguration(
    params: PutBucketMetricsConfigurationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  No longer used, see the PutBucketNotificationConfiguration operation.
    */
  def putBucketNotification(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketNotification(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  No longer used, see the PutBucketNotificationConfiguration operation.
    */
  def putBucketNotification(params: PutBucketNotificationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketNotification(
    params: PutBucketNotificationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables notifications of specified events for a bucket.
    */
  def putBucketNotificationConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketNotificationConfiguration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables notifications of specified events for a bucket.
    */
  def putBucketNotificationConfiguration(params: PutBucketNotificationConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketNotificationConfiguration(
    params: PutBucketNotificationConfigurationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Applies an Amazon S3 bucket policy to an Amazon S3 bucket.
    */
  def putBucketPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Applies an Amazon S3 bucket policy to an Amazon S3 bucket.
    */
  def putBucketPolicy(params: PutBucketPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketPolicy(
    params: PutBucketPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Creates a replication configuration or replaces an existing one. For more information, see Cross-Region Replication (CRR) in the Amazon S3 Developer Guide. 
    */
  def putBucketReplication(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketReplication(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Creates a replication configuration or replaces an existing one. For more information, see Cross-Region Replication (CRR) in the Amazon S3 Developer Guide. 
    */
  def putBucketReplication(params: PutBucketReplicationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketReplication(
    params: PutBucketReplicationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the request payment configuration for a bucket. By default, the bucket owner pays for downloads from the bucket. This configuration parameter enables the bucket owner (only) to specify that the person requesting the download will be charged for the download. Documentation on requester pays buckets can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html
    */
  def putBucketRequestPayment(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketRequestPayment(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the request payment configuration for a bucket. By default, the bucket owner pays for downloads from the bucket. This configuration parameter enables the bucket owner (only) to specify that the person requesting the download will be charged for the download. Documentation on requester pays buckets can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html
    */
  def putBucketRequestPayment(params: PutBucketRequestPaymentRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketRequestPayment(
    params: PutBucketRequestPaymentRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the tags for a bucket.
    */
  def putBucketTagging(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketTagging(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the tags for a bucket.
    */
  def putBucketTagging(params: PutBucketTaggingRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketTagging(
    params: PutBucketTaggingRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the versioning state of an existing bucket. To set the versioning state, you must be the bucket owner.
    */
  def putBucketVersioning(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketVersioning(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the versioning state of an existing bucket. To set the versioning state, you must be the bucket owner.
    */
  def putBucketVersioning(params: PutBucketVersioningRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketVersioning(
    params: PutBucketVersioningRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Set the website configuration for a bucket.
    */
  def putBucketWebsite(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketWebsite(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Set the website configuration for a bucket.
    */
  def putBucketWebsite(params: PutBucketWebsiteRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketWebsite(
    params: PutBucketWebsiteRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds an object to a bucket.
    */
  def putObject(): awsDashSdkLib.libRequestMod.Request[PutObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putObject(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PutObjectOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[PutObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds an object to a bucket.
    */
  def putObject(params: PutObjectRequest): awsDashSdkLib.libRequestMod.Request[PutObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putObject(
    params: PutObjectRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PutObjectOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[PutObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * uses the acl subresource to set the access control list (ACL) permissions for an object that already exists in a bucket
    */
  def putObjectAcl(): awsDashSdkLib.libRequestMod.Request[PutObjectAclOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putObjectAcl(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutObjectAclOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutObjectAclOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * uses the acl subresource to set the access control list (ACL) permissions for an object that already exists in a bucket
    */
  def putObjectAcl(params: PutObjectAclRequest): awsDashSdkLib.libRequestMod.Request[PutObjectAclOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putObjectAcl(
    params: PutObjectAclRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutObjectAclOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutObjectAclOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Applies a Legal Hold configuration to the specified object.
    */
  def putObjectLegalHold(): awsDashSdkLib.libRequestMod.Request[PutObjectLegalHoldOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putObjectLegalHold(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutObjectLegalHoldOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutObjectLegalHoldOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Applies a Legal Hold configuration to the specified object.
    */
  def putObjectLegalHold(params: PutObjectLegalHoldRequest): awsDashSdkLib.libRequestMod.Request[PutObjectLegalHoldOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putObjectLegalHold(
    params: PutObjectLegalHoldRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutObjectLegalHoldOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutObjectLegalHoldOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Places an object lock configuration on the specified bucket. The rule specified in the object lock configuration will be applied by default to every new object placed in the specified bucket.
    */
  def putObjectLockConfiguration(): awsDashSdkLib.libRequestMod.Request[PutObjectLockConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putObjectLockConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutObjectLockConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutObjectLockConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Places an object lock configuration on the specified bucket. The rule specified in the object lock configuration will be applied by default to every new object placed in the specified bucket.
    */
  def putObjectLockConfiguration(params: PutObjectLockConfigurationRequest): awsDashSdkLib.libRequestMod.Request[PutObjectLockConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putObjectLockConfiguration(
    params: PutObjectLockConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutObjectLockConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutObjectLockConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Places an Object Retention configuration on an object.
    */
  def putObjectRetention(): awsDashSdkLib.libRequestMod.Request[PutObjectRetentionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putObjectRetention(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutObjectRetentionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutObjectRetentionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Places an Object Retention configuration on an object.
    */
  def putObjectRetention(params: PutObjectRetentionRequest): awsDashSdkLib.libRequestMod.Request[PutObjectRetentionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putObjectRetention(
    params: PutObjectRetentionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutObjectRetentionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutObjectRetentionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the supplied tag-set to an object that already exists in a bucket
    */
  def putObjectTagging(): awsDashSdkLib.libRequestMod.Request[PutObjectTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putObjectTagging(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutObjectTaggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutObjectTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the supplied tag-set to an object that already exists in a bucket
    */
  def putObjectTagging(params: PutObjectTaggingRequest): awsDashSdkLib.libRequestMod.Request[PutObjectTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putObjectTagging(
    params: PutObjectTaggingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutObjectTaggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutObjectTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or modifies the PublicAccessBlock configuration for an Amazon S3 bucket.
    */
  def putPublicAccessBlock(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putPublicAccessBlock(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or modifies the PublicAccessBlock configuration for an Amazon S3 bucket.
    */
  def putPublicAccessBlock(params: PutPublicAccessBlockRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putPublicAccessBlock(
    params: PutPublicAccessBlockRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Restores an archived copy of an object back into Amazon S3
    */
  def restoreObject(): awsDashSdkLib.libRequestMod.Request[RestoreObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def restoreObject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RestoreObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RestoreObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Restores an archived copy of an object back into Amazon S3
    */
  def restoreObject(params: RestoreObjectRequest): awsDashSdkLib.libRequestMod.Request[RestoreObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def restoreObject(
    params: RestoreObjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RestoreObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RestoreObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This operation filters the contents of an Amazon S3 object based on a simple Structured Query Language (SQL) statement. In the request, along with the SQL expression, you must also specify a data serialization format (JSON or CSV) of the object. Amazon S3 uses this to parse object data into records, and returns only records that match the specified SQL expression. You must also specify the data serialization format for the response.
    */
  def selectObjectContent(): awsDashSdkLib.libRequestMod.Request[SelectObjectContentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def selectObjectContent(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SelectObjectContentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SelectObjectContentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This operation filters the contents of an Amazon S3 object based on a simple Structured Query Language (SQL) statement. In the request, along with the SQL expression, you must also specify a data serialization format (JSON or CSV) of the object. Amazon S3 uses this to parse object data into records, and returns only records that match the specified SQL expression. You must also specify the data serialization format for the response.
    */
  def selectObjectContent(params: SelectObjectContentRequest): awsDashSdkLib.libRequestMod.Request[SelectObjectContentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def selectObjectContent(
    params: SelectObjectContentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SelectObjectContentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SelectObjectContentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Uploads a part in a multipart upload.  Note: After you initiate multipart upload and upload one or more parts, you must either complete or abort multipart upload in order to stop getting charged for storage of the uploaded parts. Only after you either complete or abort multipart upload, Amazon S3 frees up the parts storage and stops charging you for the parts storage.
    */
  def uploadPart(): awsDashSdkLib.libRequestMod.Request[UploadPartOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def uploadPart(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UploadPartOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UploadPartOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Uploads a part in a multipart upload.  Note: After you initiate multipart upload and upload one or more parts, you must either complete or abort multipart upload in order to stop getting charged for storage of the uploaded parts. Only after you either complete or abort multipart upload, Amazon S3 frees up the parts storage and stops charging you for the parts storage.
    */
  def uploadPart(params: UploadPartRequest): awsDashSdkLib.libRequestMod.Request[UploadPartOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def uploadPart(
    params: UploadPartRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UploadPartOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UploadPartOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Uploads a part by copying data from an existing object as data source.
    */
  def uploadPartCopy(): awsDashSdkLib.libRequestMod.Request[UploadPartCopyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def uploadPartCopy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UploadPartCopyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UploadPartCopyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Uploads a part by copying data from an existing object as data source.
    */
  def uploadPartCopy(params: UploadPartCopyRequest): awsDashSdkLib.libRequestMod.Request[UploadPartCopyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def uploadPartCopy(
    params: UploadPartCopyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UploadPartCopyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UploadPartCopyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the bucketExists state by periodically calling the underlying S3.headBucketoperation every 5 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_bucketExists(state: awsDashSdkLib.awsDashSdkLibStrings.bucketExists): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_bucketExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.bucketExists,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the bucketExists state by periodically calling the underlying S3.headBucketoperation every 5 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_bucketExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.bucketExists,
    params: HeadBucketRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_bucketExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.bucketExists,
    params: HeadBucketRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the bucketNotExists state by periodically calling the underlying S3.headBucketoperation every 5 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_bucketNotExists(state: awsDashSdkLib.awsDashSdkLibStrings.bucketNotExists): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_bucketNotExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.bucketNotExists,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the bucketNotExists state by periodically calling the underlying S3.headBucketoperation every 5 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_bucketNotExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.bucketNotExists,
    params: HeadBucketRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_bucketNotExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.bucketNotExists,
    params: HeadBucketRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the objectExists state by periodically calling the underlying S3.headObjectoperation every 5 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_objectExists(state: awsDashSdkLib.awsDashSdkLibStrings.objectExists): awsDashSdkLib.libRequestMod.Request[HeadObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_objectExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.objectExists,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ HeadObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[HeadObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the objectExists state by periodically calling the underlying S3.headObjectoperation every 5 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_objectExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.objectExists,
    params: HeadObjectRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[HeadObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_objectExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.objectExists,
    params: HeadObjectRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ HeadObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[HeadObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the objectNotExists state by periodically calling the underlying S3.headObjectoperation every 5 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_objectNotExists(state: awsDashSdkLib.awsDashSdkLibStrings.objectNotExists): awsDashSdkLib.libRequestMod.Request[HeadObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_objectNotExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.objectNotExists,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ HeadObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[HeadObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the objectNotExists state by periodically calling the underlying S3.headObjectoperation every 5 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_objectNotExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.objectNotExists,
    params: HeadObjectRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[HeadObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_objectNotExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.objectNotExists,
    params: HeadObjectRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ HeadObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[HeadObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

