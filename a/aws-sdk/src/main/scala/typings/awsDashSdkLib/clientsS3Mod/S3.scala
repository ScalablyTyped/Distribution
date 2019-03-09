package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3
  extends awsDashSdkLib.libServicesS3Mod.S3Customizations {
  @JSName("config")
  var config_S3: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsS3Mod.S3Ns.ClientConfiguration = js.native
  /**
    * Aborts a multipart upload. To verify that all parts have been removed, so you don't get charged for the part storage, you should call the List Parts operation and ensure the parts list is empty.
    */
  def abortMultipartUpload(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.AbortMultipartUploadOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def abortMultipartUpload(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.AbortMultipartUploadOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.AbortMultipartUploadOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Aborts a multipart upload. To verify that all parts have been removed, so you don't get charged for the part storage, you should call the List Parts operation and ensure the parts list is empty.
    */
  def abortMultipartUpload(params: awsDashSdkLib.clientsS3Mod.S3Ns.AbortMultipartUploadRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.AbortMultipartUploadOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def abortMultipartUpload(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.AbortMultipartUploadRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.AbortMultipartUploadOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.AbortMultipartUploadOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Completes a multipart upload by assembling previously uploaded parts.
    */
  def completeMultipartUpload(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.CompleteMultipartUploadOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def completeMultipartUpload(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.CompleteMultipartUploadOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.CompleteMultipartUploadOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Completes a multipart upload by assembling previously uploaded parts.
    */
  def completeMultipartUpload(params: awsDashSdkLib.clientsS3Mod.S3Ns.CompleteMultipartUploadRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.CompleteMultipartUploadOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def completeMultipartUpload(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.CompleteMultipartUploadRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.CompleteMultipartUploadOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.CompleteMultipartUploadOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a copy of an object that is already stored in Amazon S3.
    */
  def copyObject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.CopyObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyObject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.CopyObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.CopyObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a copy of an object that is already stored in Amazon S3.
    */
  def copyObject(params: awsDashSdkLib.clientsS3Mod.S3Ns.CopyObjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.CopyObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyObject(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.CopyObjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.CopyObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.CopyObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new bucket.
    */
  def createBucket(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.CreateBucketOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createBucket(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.CreateBucketOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.CreateBucketOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new bucket.
    */
  def createBucket(params: awsDashSdkLib.clientsS3Mod.S3Ns.CreateBucketRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.CreateBucketOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createBucket(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.CreateBucketRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.CreateBucketOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.CreateBucketOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Initiates a multipart upload and returns an upload ID.  Note: After you initiate multipart upload and upload one or more parts, you must either complete or abort multipart upload in order to stop getting charged for storage of the uploaded parts. Only after you either complete or abort multipart upload, Amazon S3 frees up the parts storage and stops charging you for the parts storage.
    */
  def createMultipartUpload(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.CreateMultipartUploadOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createMultipartUpload(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.CreateMultipartUploadOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.CreateMultipartUploadOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Initiates a multipart upload and returns an upload ID.  Note: After you initiate multipart upload and upload one or more parts, you must either complete or abort multipart upload in order to stop getting charged for storage of the uploaded parts. Only after you either complete or abort multipart upload, Amazon S3 frees up the parts storage and stops charging you for the parts storage.
    */
  def createMultipartUpload(params: awsDashSdkLib.clientsS3Mod.S3Ns.CreateMultipartUploadRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.CreateMultipartUploadOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createMultipartUpload(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.CreateMultipartUploadRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.CreateMultipartUploadOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.CreateMultipartUploadOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def deleteBucket(params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteBucketRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucket(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteBucketRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an analytics configuration for the bucket (specified by the analytics configuration ID).
    */
  def deleteBucketAnalyticsConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketAnalyticsConfiguration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an analytics configuration for the bucket (specified by the analytics configuration ID).
    */
  def deleteBucketAnalyticsConfiguration(params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteBucketAnalyticsConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketAnalyticsConfiguration(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteBucketAnalyticsConfigurationRequest,
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
  def deleteBucketCors(params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteBucketCorsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketCors(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteBucketCorsRequest,
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
  def deleteBucketEncryption(params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteBucketEncryptionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketEncryption(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteBucketEncryptionRequest,
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
  def deleteBucketInventoryConfiguration(params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteBucketInventoryConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketInventoryConfiguration(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteBucketInventoryConfigurationRequest,
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
  def deleteBucketLifecycle(params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteBucketLifecycleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketLifecycle(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteBucketLifecycleRequest,
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
  def deleteBucketMetricsConfiguration(params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteBucketMetricsConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketMetricsConfiguration(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteBucketMetricsConfigurationRequest,
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
  def deleteBucketPolicy(params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteBucketPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketPolicy(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteBucketPolicyRequest,
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
  def deleteBucketReplication(params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteBucketReplicationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketReplication(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteBucketReplicationRequest,
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
  def deleteBucketTagging(params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteBucketTaggingRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketTagging(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteBucketTaggingRequest,
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
  def deleteBucketWebsite(params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteBucketWebsiteRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBucketWebsite(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteBucketWebsiteRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the null version (if there is one) of an object and inserts a delete marker, which becomes the latest version of the object. If there isn't a null version, Amazon S3 does not remove any objects.
    */
  def deleteObject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.DeleteObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteObject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.DeleteObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.DeleteObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the null version (if there is one) of an object and inserts a delete marker, which becomes the latest version of the object. If there isn't a null version, Amazon S3 does not remove any objects.
    */
  def deleteObject(params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteObjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.DeleteObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteObject(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteObjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.DeleteObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.DeleteObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the tag-set from an existing object.
    */
  def deleteObjectTagging(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.DeleteObjectTaggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteObjectTagging(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.DeleteObjectTaggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.DeleteObjectTaggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the tag-set from an existing object.
    */
  def deleteObjectTagging(params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteObjectTaggingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.DeleteObjectTaggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteObjectTagging(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteObjectTaggingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.DeleteObjectTaggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.DeleteObjectTaggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * This operation enables you to delete multiple objects from a bucket using a single HTTP request. You may specify up to 1000 keys.
    */
  def deleteObjects(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.DeleteObjectsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteObjects(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.DeleteObjectsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.DeleteObjectsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * This operation enables you to delete multiple objects from a bucket using a single HTTP request. You may specify up to 1000 keys.
    */
  def deleteObjects(params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteObjectsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.DeleteObjectsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteObjects(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.DeleteObjectsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.DeleteObjectsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.DeleteObjectsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def deletePublicAccessBlock(params: awsDashSdkLib.clientsS3Mod.S3Ns.DeletePublicAccessBlockRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePublicAccessBlock(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.DeletePublicAccessBlockRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the accelerate configuration of a bucket.
    */
  def getBucketAccelerateConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketAccelerateConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketAccelerateConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketAccelerateConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketAccelerateConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the accelerate configuration of a bucket.
    */
  def getBucketAccelerateConfiguration(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketAccelerateConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketAccelerateConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketAccelerateConfiguration(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketAccelerateConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketAccelerateConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketAccelerateConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the access control policy for the bucket.
    */
  def getBucketAcl(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketAclOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketAcl(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketAclOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketAclOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the access control policy for the bucket.
    */
  def getBucketAcl(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketAclRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketAclOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketAcl(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketAclRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketAclOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketAclOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets an analytics configuration for the bucket (specified by the analytics configuration ID).
    */
  def getBucketAnalyticsConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketAnalyticsConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketAnalyticsConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketAnalyticsConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketAnalyticsConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets an analytics configuration for the bucket (specified by the analytics configuration ID).
    */
  def getBucketAnalyticsConfiguration(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketAnalyticsConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketAnalyticsConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketAnalyticsConfiguration(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketAnalyticsConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketAnalyticsConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketAnalyticsConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the CORS configuration for the bucket.
    */
  def getBucketCors(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketCorsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketCors(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketCorsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketCorsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the CORS configuration for the bucket.
    */
  def getBucketCors(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketCorsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketCorsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketCors(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketCorsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketCorsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketCorsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the server-side encryption configuration of a bucket.
    */
  def getBucketEncryption(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketEncryptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketEncryption(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketEncryptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketEncryptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the server-side encryption configuration of a bucket.
    */
  def getBucketEncryption(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketEncryptionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketEncryptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketEncryption(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketEncryptionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketEncryptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketEncryptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an inventory configuration (identified by the inventory ID) from the bucket.
    */
  def getBucketInventoryConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketInventoryConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketInventoryConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketInventoryConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketInventoryConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an inventory configuration (identified by the inventory ID) from the bucket.
    */
  def getBucketInventoryConfiguration(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketInventoryConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketInventoryConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketInventoryConfiguration(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketInventoryConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketInventoryConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketInventoryConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  No longer used, see the GetBucketLifecycleConfiguration operation.
    */
  def getBucketLifecycle(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLifecycleOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketLifecycle(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLifecycleOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLifecycleOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  No longer used, see the GetBucketLifecycleConfiguration operation.
    */
  def getBucketLifecycle(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLifecycleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLifecycleOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketLifecycle(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLifecycleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLifecycleOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLifecycleOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the lifecycle configuration information set on the bucket.
    */
  def getBucketLifecycleConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLifecycleConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketLifecycleConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLifecycleConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLifecycleConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the lifecycle configuration information set on the bucket.
    */
  def getBucketLifecycleConfiguration(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLifecycleConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLifecycleConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketLifecycleConfiguration(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLifecycleConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLifecycleConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLifecycleConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the region the bucket resides in.
    */
  def getBucketLocation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLocationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketLocation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLocationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLocationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the region the bucket resides in.
    */
  def getBucketLocation(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLocationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLocationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketLocation(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLocationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLocationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLocationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the logging status of a bucket and the permissions users have to view and modify that status. To use GET, you must be the bucket owner.
    */
  def getBucketLogging(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLoggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketLogging(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLoggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLoggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the logging status of a bucket and the permissions users have to view and modify that status. To use GET, you must be the bucket owner.
    */
  def getBucketLogging(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLoggingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLoggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketLogging(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLoggingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLoggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketLoggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a metrics configuration (specified by the metrics configuration ID) from the bucket.
    */
  def getBucketMetricsConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketMetricsConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketMetricsConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketMetricsConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketMetricsConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a metrics configuration (specified by the metrics configuration ID) from the bucket.
    */
  def getBucketMetricsConfiguration(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketMetricsConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketMetricsConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketMetricsConfiguration(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketMetricsConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketMetricsConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketMetricsConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  No longer used, see the GetBucketNotificationConfiguration operation.
    */
  def getBucketNotification(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.NotificationConfigurationDeprecated, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketNotification(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.NotificationConfigurationDeprecated, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.NotificationConfigurationDeprecated, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  No longer used, see the GetBucketNotificationConfiguration operation.
    */
  def getBucketNotification(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketNotificationConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.NotificationConfigurationDeprecated, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketNotification(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketNotificationConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.NotificationConfigurationDeprecated, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.NotificationConfigurationDeprecated, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the notification configuration of a bucket.
    */
  def getBucketNotificationConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.NotificationConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketNotificationConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.NotificationConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.NotificationConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the notification configuration of a bucket.
    */
  def getBucketNotificationConfiguration(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketNotificationConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.NotificationConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketNotificationConfiguration(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketNotificationConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.NotificationConfiguration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.NotificationConfiguration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the policy of a specified bucket.
    */
  def getBucketPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the policy of a specified bucket.
    */
  def getBucketPolicy(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketPolicy(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the policy status for an Amazon S3 bucket, indicating whether the bucket is public.
    */
  def getBucketPolicyStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketPolicyStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketPolicyStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketPolicyStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketPolicyStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the policy status for an Amazon S3 bucket, indicating whether the bucket is public.
    */
  def getBucketPolicyStatus(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketPolicyStatusRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketPolicyStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketPolicyStatus(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketPolicyStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketPolicyStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketPolicyStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the replication configuration of a bucket.   It can take a while to propagate the put or delete a replication configuration to all Amazon S3 systems. Therefore, a get request soon after put or delete can return a wrong result.  
    */
  def getBucketReplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketReplicationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketReplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketReplicationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketReplicationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the replication configuration of a bucket.   It can take a while to propagate the put or delete a replication configuration to all Amazon S3 systems. Therefore, a get request soon after put or delete can return a wrong result.  
    */
  def getBucketReplication(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketReplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketReplicationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketReplication(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketReplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketReplicationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketReplicationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the request payment configuration of a bucket.
    */
  def getBucketRequestPayment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketRequestPaymentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketRequestPayment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketRequestPaymentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketRequestPaymentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the request payment configuration of a bucket.
    */
  def getBucketRequestPayment(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketRequestPaymentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketRequestPaymentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketRequestPayment(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketRequestPaymentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketRequestPaymentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketRequestPaymentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the tag set associated with the bucket.
    */
  def getBucketTagging(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketTaggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketTagging(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketTaggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketTaggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the tag set associated with the bucket.
    */
  def getBucketTagging(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketTaggingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketTaggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketTagging(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketTaggingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketTaggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketTaggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the versioning state of a bucket.
    */
  def getBucketVersioning(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketVersioningOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketVersioning(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketVersioningOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketVersioningOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the versioning state of a bucket.
    */
  def getBucketVersioning(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketVersioningRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketVersioningOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketVersioning(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketVersioningRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketVersioningOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketVersioningOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the website configuration for a bucket.
    */
  def getBucketWebsite(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketWebsiteOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketWebsite(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketWebsiteOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketWebsiteOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the website configuration for a bucket.
    */
  def getBucketWebsite(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketWebsiteRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketWebsiteOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBucketWebsite(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketWebsiteRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketWebsiteOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetBucketWebsiteOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves objects from Amazon S3.
    */
  def getObject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getObject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves objects from Amazon S3.
    */
  def getObject(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getObject(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the access control list (ACL) of an object.
    */
  def getObjectAcl(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectAclOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getObjectAcl(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectAclOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectAclOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the access control list (ACL) of an object.
    */
  def getObjectAcl(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectAclRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectAclOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getObjectAcl(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectAclRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectAclOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectAclOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets an object's current Legal Hold status.
    */
  def getObjectLegalHold(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectLegalHoldOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getObjectLegalHold(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectLegalHoldOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectLegalHoldOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets an object's current Legal Hold status.
    */
  def getObjectLegalHold(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectLegalHoldRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectLegalHoldOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getObjectLegalHold(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectLegalHoldRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectLegalHoldOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectLegalHoldOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the Object Lock configuration for a bucket. The rule specified in the Object Lock configuration will be applied by default to every new object placed in the specified bucket.
    */
  def getObjectLockConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectLockConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getObjectLockConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectLockConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectLockConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the Object Lock configuration for a bucket. The rule specified in the Object Lock configuration will be applied by default to every new object placed in the specified bucket.
    */
  def getObjectLockConfiguration(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectLockConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectLockConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getObjectLockConfiguration(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectLockConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectLockConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectLockConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves an object's retention settings.
    */
  def getObjectRetention(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectRetentionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getObjectRetention(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectRetentionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectRetentionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves an object's retention settings.
    */
  def getObjectRetention(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectRetentionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectRetentionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getObjectRetention(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectRetentionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectRetentionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectRetentionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the tag-set of an object.
    */
  def getObjectTagging(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectTaggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getObjectTagging(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectTaggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectTaggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the tag-set of an object.
    */
  def getObjectTagging(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectTaggingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectTaggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getObjectTagging(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectTaggingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectTaggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectTaggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Return torrent files from a bucket.
    */
  def getObjectTorrent(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectTorrentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getObjectTorrent(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectTorrentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectTorrentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Return torrent files from a bucket.
    */
  def getObjectTorrent(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectTorrentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectTorrentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getObjectTorrent(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectTorrentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectTorrentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectTorrentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the PublicAccessBlock configuration for an Amazon S3 bucket.
    */
  def getPublicAccessBlock(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetPublicAccessBlockOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPublicAccessBlock(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetPublicAccessBlockOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetPublicAccessBlockOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the PublicAccessBlock configuration for an Amazon S3 bucket.
    */
  def getPublicAccessBlock(params: awsDashSdkLib.clientsS3Mod.S3Ns.GetPublicAccessBlockRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetPublicAccessBlockOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPublicAccessBlock(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.GetPublicAccessBlockRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.GetPublicAccessBlockOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.GetPublicAccessBlockOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def headBucket(params: awsDashSdkLib.clientsS3Mod.S3Ns.HeadBucketRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def headBucket(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.HeadBucketRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The HEAD operation retrieves metadata from an object without returning the object itself. This operation is useful if you're only interested in an object's metadata. To use HEAD, you must have READ access to the object.
    */
  def headObject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.HeadObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def headObject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.HeadObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.HeadObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The HEAD operation retrieves metadata from an object without returning the object itself. This operation is useful if you're only interested in an object's metadata. To use HEAD, you must have READ access to the object.
    */
  def headObject(params: awsDashSdkLib.clientsS3Mod.S3Ns.HeadObjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.HeadObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def headObject(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.HeadObjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.HeadObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.HeadObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the analytics configurations for the bucket.
    */
  def listBucketAnalyticsConfigurations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketAnalyticsConfigurationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBucketAnalyticsConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketAnalyticsConfigurationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketAnalyticsConfigurationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the analytics configurations for the bucket.
    */
  def listBucketAnalyticsConfigurations(params: awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketAnalyticsConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketAnalyticsConfigurationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBucketAnalyticsConfigurations(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketAnalyticsConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketAnalyticsConfigurationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketAnalyticsConfigurationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of inventory configurations for the bucket.
    */
  def listBucketInventoryConfigurations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketInventoryConfigurationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBucketInventoryConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketInventoryConfigurationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketInventoryConfigurationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of inventory configurations for the bucket.
    */
  def listBucketInventoryConfigurations(params: awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketInventoryConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketInventoryConfigurationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBucketInventoryConfigurations(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketInventoryConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketInventoryConfigurationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketInventoryConfigurationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the metrics configurations for the bucket.
    */
  def listBucketMetricsConfigurations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketMetricsConfigurationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBucketMetricsConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketMetricsConfigurationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketMetricsConfigurationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the metrics configurations for the bucket.
    */
  def listBucketMetricsConfigurations(params: awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketMetricsConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketMetricsConfigurationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBucketMetricsConfigurations(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketMetricsConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketMetricsConfigurationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketMetricsConfigurationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of all buckets owned by the authenticated sender of the request.
    */
  def listBuckets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBuckets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListBucketsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * This operation lists in-progress multipart uploads.
    */
  def listMultipartUploads(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListMultipartUploadsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listMultipartUploads(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.ListMultipartUploadsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListMultipartUploadsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * This operation lists in-progress multipart uploads.
    */
  def listMultipartUploads(params: awsDashSdkLib.clientsS3Mod.S3Ns.ListMultipartUploadsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListMultipartUploadsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listMultipartUploads(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.ListMultipartUploadsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.ListMultipartUploadsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListMultipartUploadsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns metadata about all of the versions of objects in a bucket.
    */
  def listObjectVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListObjectVersionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listObjectVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.ListObjectVersionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListObjectVersionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns metadata about all of the versions of objects in a bucket.
    */
  def listObjectVersions(params: awsDashSdkLib.clientsS3Mod.S3Ns.ListObjectVersionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListObjectVersionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listObjectVersions(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.ListObjectVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.ListObjectVersionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListObjectVersionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns some or all (up to 1000) of the objects in a bucket. You can use the request parameters as selection criteria to return a subset of the objects in a bucket.
    */
  def listObjects(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListObjectsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listObjects(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.ListObjectsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListObjectsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns some or all (up to 1000) of the objects in a bucket. You can use the request parameters as selection criteria to return a subset of the objects in a bucket.
    */
  def listObjects(params: awsDashSdkLib.clientsS3Mod.S3Ns.ListObjectsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListObjectsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listObjects(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.ListObjectsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.ListObjectsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListObjectsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns some or all (up to 1000) of the objects in a bucket. You can use the request parameters as selection criteria to return a subset of the objects in a bucket. Note: ListObjectsV2 is the revised List Objects API and we recommend you use this revised API for new application development.
    */
  def listObjectsV2(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListObjectsV2Output, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listObjectsV2(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.ListObjectsV2Output, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListObjectsV2Output, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns some or all (up to 1000) of the objects in a bucket. You can use the request parameters as selection criteria to return a subset of the objects in a bucket. Note: ListObjectsV2 is the revised List Objects API and we recommend you use this revised API for new application development.
    */
  def listObjectsV2(params: awsDashSdkLib.clientsS3Mod.S3Ns.ListObjectsV2Request): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListObjectsV2Output, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listObjectsV2(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.ListObjectsV2Request,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.ListObjectsV2Output, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListObjectsV2Output, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the parts that have been uploaded for a specific multipart upload.
    */
  def listParts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListPartsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listParts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.ListPartsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListPartsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the parts that have been uploaded for a specific multipart upload.
    */
  def listParts(params: awsDashSdkLib.clientsS3Mod.S3Ns.ListPartsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListPartsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listParts(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.ListPartsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.ListPartsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.ListPartsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def putBucketAccelerateConfiguration(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketAccelerateConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketAccelerateConfiguration(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketAccelerateConfigurationRequest,
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
  def putBucketAcl(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketAclRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketAcl(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketAclRequest,
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
  def putBucketAnalyticsConfiguration(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketAnalyticsConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketAnalyticsConfiguration(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketAnalyticsConfigurationRequest,
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
  def putBucketCors(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketCorsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketCors(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketCorsRequest,
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
  def putBucketEncryption(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketEncryptionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketEncryption(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketEncryptionRequest,
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
  def putBucketInventoryConfiguration(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketInventoryConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketInventoryConfiguration(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketInventoryConfigurationRequest,
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
  def putBucketLifecycle(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketLifecycleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketLifecycle(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketLifecycleRequest,
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
  def putBucketLifecycleConfiguration(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketLifecycleConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketLifecycleConfiguration(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketLifecycleConfigurationRequest,
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
  def putBucketLogging(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketLoggingRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketLogging(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketLoggingRequest,
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
  def putBucketMetricsConfiguration(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketMetricsConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketMetricsConfiguration(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketMetricsConfigurationRequest,
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
  def putBucketNotification(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketNotificationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketNotification(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketNotificationRequest,
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
  def putBucketNotificationConfiguration(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketNotificationConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketNotificationConfiguration(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketNotificationConfigurationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Replaces a policy on a bucket. If the bucket already has a policy, the one in this request completely replaces it.
    */
  def putBucketPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Replaces a policy on a bucket. If the bucket already has a policy, the one in this request completely replaces it.
    */
  def putBucketPolicy(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketPolicy(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketPolicyRequest,
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
  def putBucketReplication(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketReplicationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketReplication(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketReplicationRequest,
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
  def putBucketRequestPayment(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketRequestPaymentRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketRequestPayment(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketRequestPaymentRequest,
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
  def putBucketTagging(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketTaggingRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketTagging(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketTaggingRequest,
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
  def putBucketVersioning(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketVersioningRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketVersioning(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketVersioningRequest,
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
  def putBucketWebsite(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketWebsiteRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBucketWebsite(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutBucketWebsiteRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds an object to a bucket.
    */
  def putObject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putObject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an object to a bucket.
    */
  def putObject(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putObject(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * uses the acl subresource to set the access control list (ACL) permissions for an object that already exists in a bucket
    */
  def putObjectAcl(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectAclOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putObjectAcl(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectAclOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectAclOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * uses the acl subresource to set the access control list (ACL) permissions for an object that already exists in a bucket
    */
  def putObjectAcl(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectAclRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectAclOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putObjectAcl(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectAclRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectAclOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectAclOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Applies a Legal Hold configuration to the specified object.
    */
  def putObjectLegalHold(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectLegalHoldOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putObjectLegalHold(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectLegalHoldOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectLegalHoldOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Applies a Legal Hold configuration to the specified object.
    */
  def putObjectLegalHold(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectLegalHoldRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectLegalHoldOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putObjectLegalHold(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectLegalHoldRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectLegalHoldOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectLegalHoldOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Places an Object Lock configuration on the specified bucket. The rule specified in the Object Lock configuration will be applied by default to every new object placed in the specified bucket.
    */
  def putObjectLockConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectLockConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putObjectLockConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectLockConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectLockConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Places an Object Lock configuration on the specified bucket. The rule specified in the Object Lock configuration will be applied by default to every new object placed in the specified bucket.
    */
  def putObjectLockConfiguration(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectLockConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectLockConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putObjectLockConfiguration(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectLockConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectLockConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectLockConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Places an Object Retention configuration on an object.
    */
  def putObjectRetention(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectRetentionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putObjectRetention(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectRetentionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectRetentionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Places an Object Retention configuration on an object.
    */
  def putObjectRetention(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectRetentionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectRetentionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putObjectRetention(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectRetentionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectRetentionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectRetentionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the supplied tag-set to an object that already exists in a bucket
    */
  def putObjectTagging(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectTaggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putObjectTagging(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectTaggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectTaggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the supplied tag-set to an object that already exists in a bucket
    */
  def putObjectTagging(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectTaggingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectTaggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putObjectTagging(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectTaggingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectTaggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectTaggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def putPublicAccessBlock(params: awsDashSdkLib.clientsS3Mod.S3Ns.PutPublicAccessBlockRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putPublicAccessBlock(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.PutPublicAccessBlockRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Restores an archived copy of an object back into Amazon S3
    */
  def restoreObject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.RestoreObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreObject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.RestoreObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.RestoreObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Restores an archived copy of an object back into Amazon S3
    */
  def restoreObject(params: awsDashSdkLib.clientsS3Mod.S3Ns.RestoreObjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.RestoreObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreObject(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.RestoreObjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.RestoreObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.RestoreObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * This operation filters the contents of an Amazon S3 object based on a simple Structured Query Language (SQL) statement. In the request, along with the SQL expression, you must also specify a data serialization format (JSON or CSV) of the object. Amazon S3 uses this to parse object data into records, and returns only records that match the specified SQL expression. You must also specify the data serialization format for the response.
    */
  def selectObjectContent(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.SelectObjectContentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def selectObjectContent(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.SelectObjectContentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.SelectObjectContentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * This operation filters the contents of an Amazon S3 object based on a simple Structured Query Language (SQL) statement. In the request, along with the SQL expression, you must also specify a data serialization format (JSON or CSV) of the object. Amazon S3 uses this to parse object data into records, and returns only records that match the specified SQL expression. You must also specify the data serialization format for the response.
    */
  def selectObjectContent(params: awsDashSdkLib.clientsS3Mod.S3Ns.SelectObjectContentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.SelectObjectContentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def selectObjectContent(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.SelectObjectContentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.SelectObjectContentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.SelectObjectContentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Uploads a part in a multipart upload.  Note: After you initiate multipart upload and upload one or more parts, you must either complete or abort multipart upload in order to stop getting charged for storage of the uploaded parts. Only after you either complete or abort multipart upload, Amazon S3 frees up the parts storage and stops charging you for the parts storage.
    */
  def uploadPart(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.UploadPartOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def uploadPart(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.UploadPartOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.UploadPartOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Uploads a part in a multipart upload.  Note: After you initiate multipart upload and upload one or more parts, you must either complete or abort multipart upload in order to stop getting charged for storage of the uploaded parts. Only after you either complete or abort multipart upload, Amazon S3 frees up the parts storage and stops charging you for the parts storage.
    */
  def uploadPart(params: awsDashSdkLib.clientsS3Mod.S3Ns.UploadPartRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.UploadPartOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def uploadPart(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.UploadPartRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.UploadPartOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.UploadPartOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Uploads a part by copying data from an existing object as data source.
    */
  def uploadPartCopy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.UploadPartCopyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def uploadPartCopy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.UploadPartCopyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.UploadPartCopyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Uploads a part by copying data from an existing object as data source.
    */
  def uploadPartCopy(params: awsDashSdkLib.clientsS3Mod.S3Ns.UploadPartCopyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.UploadPartCopyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def uploadPartCopy(
    params: awsDashSdkLib.clientsS3Mod.S3Ns.UploadPartCopyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.UploadPartCopyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.UploadPartCopyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
    params: awsDashSdkLib.clientsS3Mod.S3Ns.HeadBucketRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_bucketExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.bucketExists,
    params: awsDashSdkLib.clientsS3Mod.S3Ns.HeadBucketRequest with awsDashSdkLib.Anon_Waiter,
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
    params: awsDashSdkLib.clientsS3Mod.S3Ns.HeadBucketRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_bucketNotExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.bucketNotExists,
    params: awsDashSdkLib.clientsS3Mod.S3Ns.HeadBucketRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the objectExists state by periodically calling the underlying S3.headObjectoperation every 5 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_objectExists(state: awsDashSdkLib.awsDashSdkLibStrings.objectExists): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.HeadObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_objectExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.objectExists,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.HeadObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.HeadObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the objectExists state by periodically calling the underlying S3.headObjectoperation every 5 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_objectExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.objectExists,
    params: awsDashSdkLib.clientsS3Mod.S3Ns.HeadObjectRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.HeadObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_objectExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.objectExists,
    params: awsDashSdkLib.clientsS3Mod.S3Ns.HeadObjectRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.HeadObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.HeadObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the objectNotExists state by periodically calling the underlying S3.headObjectoperation every 5 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_objectNotExists(state: awsDashSdkLib.awsDashSdkLibStrings.objectNotExists): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.HeadObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_objectNotExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.objectNotExists,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.HeadObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.HeadObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the objectNotExists state by periodically calling the underlying S3.headObjectoperation every 5 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_objectNotExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.objectNotExists,
    params: awsDashSdkLib.clientsS3Mod.S3Ns.HeadObjectRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.HeadObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_objectNotExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.objectNotExists,
    params: awsDashSdkLib.clientsS3Mod.S3Ns.HeadObjectRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3Mod.S3Ns.HeadObjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3Mod.S3Ns.HeadObjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

