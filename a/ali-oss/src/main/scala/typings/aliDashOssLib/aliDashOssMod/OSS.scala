package typings
package aliDashOssLib.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OSS extends js.Object {
  /**
       * Abort a multipart upload for object.
       */
  def abortMultipartUpload(name: java.lang.String, uploadId: java.lang.String): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Abort a multipart upload for object.
       */
  def abortMultipartUpload(
    name: java.lang.String,
    uploadId: java.lang.String,
    options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Append an object to the bucket, it's almost same as put, but it can add content to existing object rather than override it.
       */
  def append(name: java.lang.String, file: js.Any): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.AppendObjectResult] = js.native
  /**
       * Append an object to the bucket, it's almost same as put, but it can add content to existing object rather than override it.
       */
  def append(
    name: java.lang.String,
    file: js.Any,
    options: aliDashOssLib.aliDashOssMod.OSSNs.AppendObjectOptions
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.AppendObjectResult] = js.native
  /**
       * After uploading all data parts, you must call the Complete Multipart Upload API to complete Multipart Upload for the entire file.
       */
  def completeMultipartUpload(name: java.lang.String, uploadId: java.lang.String, parts: js.Array[aliDashOssLib.Anon_Etag]): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.CompleteMultipartUploadResult] = js.native
  /**
       * After uploading all data parts, you must call the Complete Multipart Upload API to complete Multipart Upload for the entire file.
       */
  def completeMultipartUpload(
    name: java.lang.String,
    uploadId: java.lang.String,
    parts: js.Array[aliDashOssLib.Anon_Etag],
    options: aliDashOssLib.aliDashOssMod.OSSNs.CompleteMultipartUploadOptions
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.CompleteMultipartUploadResult] = js.native
  /**
       * Copy an object from sourceName to name.
       */
  def copy(name: java.lang.String, sourceName: java.lang.String): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.CopyAndPutMetaResult] = js.native
  /**
       * Copy an object from sourceName to name.
       */
  def copy(
    name: java.lang.String,
    sourceName: java.lang.String,
    options: aliDashOssLib.aliDashOssMod.OSSNs.CopyObjectOptions
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.CopyAndPutMetaResult] = js.native
  /**
       * Create a VOD playlist for the channel.
       */
  def createVod(id: java.lang.String, name: java.lang.String, time: aliDashOssLib.Anon_EndTime): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Create a VOD playlist for the channel.
       */
  def createVod(
    id: java.lang.String,
    name: java.lang.String,
    time: aliDashOssLib.Anon_EndTime,
    options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Delete an object from the bucket.
       */
  def delete(name: java.lang.String): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Delete an object from the bucket.
       */
  def delete(name: java.lang.String, options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Delete an empty bucket.
       */
  def deleteBucket(name: java.lang.String): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Delete an empty bucket.
       */
  def deleteBucket(name: java.lang.String, options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Delete CORS rules of the bucket object.
       */
  def deleteBucketCORS(name: java.lang.String): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Delete the bucket object lifecycle.
       */
  def deleteBucketLifecycle(name: java.lang.String): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Delete the bucket object lifecycle.
       */
  def deleteBucketLifecycle(name: java.lang.String, options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Delete the bucket logging settings.
       */
  def deleteBucketLogging(name: java.lang.String): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Delete the bucket logging settings.
       */
  def deleteBucketLogging(name: java.lang.String, options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Delete the bucket request Referer white list.
       */
  def deleteBucketReferer(name: java.lang.String): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Delete the bucket request Referer white list.
       */
  def deleteBucketReferer(name: java.lang.String, options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Delete the bucket website config.
       */
  def deleteBucketWebsite(name: java.lang.String): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Delete the bucket website config.
       */
  def deleteBucketWebsite(name: java.lang.String, options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Delete a live channel.
       */
  def deleteChannel(id: java.lang.String): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Delete a live channel.
       */
  def deleteChannel(id: java.lang.String, options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Delete multi objects in one request.
       */
  def deleteMulti(names: js.Array[java.lang.String]): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.DeleteMultiResult] = js.native
  /**
       * Delete multi objects in one request.
       */
  def deleteMulti(names: js.Array[java.lang.String], options: aliDashOssLib.aliDashOssMod.OSSNs.DeleteMultiOptions): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.DeleteMultiResult] = js.native
  /**
       * Get the Object url. If provide baseUrl, will use baseUrl instead the default bucket and endpoint. Suggest use generateObjectUrl instead of getObjectUrl.
       */
  def generateObjectUrl(name: java.lang.String): java.lang.String = js.native
  /**
       * Get the Object url. If provide baseUrl, will use baseUrl instead the default bucket and endpoint. Suggest use generateObjectUrl instead of getObjectUrl.
       */
  def generateObjectUrl(name: java.lang.String, baseUrl: java.lang.String): java.lang.String = js.native
  /**
       * Get an object from the bucket.
       */
  def get(name: java.lang.String): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.GetObjectResult] = js.native
  /**
       * Get an object from the bucket.
       */
  def get(name: java.lang.String, file: js.Any): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.GetObjectResult] = js.native
  /**
       * Get an object from the bucket.
       */
  def get(name: java.lang.String, file: js.Any, options: aliDashOssLib.aliDashOssMod.OSSNs.GetObjectOptions): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.GetObjectResult] = js.native
  /**
       * Get object's ACL.
       */
  def getACL(name: java.lang.String): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.GetACLResult] = js.native
  /**
       * Get object's ACL.
       */
  def getACL(name: java.lang.String, options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.GetACLResult] = js.native
  /**
       * Get the bucket ACL.
       *   acl - acl settings string
       */
  def getBucketACL(name: java.lang.String): js.Promise[aliDashOssLib.Anon_Acl] = js.native
  /**
       * Get the bucket ACL.
       *   acl - acl settings string
       */
  def getBucketACL(name: java.lang.String, options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions): js.Promise[aliDashOssLib.Anon_Acl] = js.native
  /**
       * Get CORS rules of the bucket object.
       */
  def getBucketCORS(name: java.lang.String): js.Promise[aliDashOssLib.Anon_RulesRes] = js.native
  /**
       * Get bucket information,include CreationDate、ExtranetEndpoint、IntranetEndpoint、Location、Name、StorageClass、 Owner、AccessControlList
       */
  def getBucketInfo(name: java.lang.String): js.Promise[_] = js.native
  /**
       * Get the bucket object lifecycle.
       */
  def getBucketLifecycle(name: java.lang.String): js.Promise[aliDashOssLib.Anon_Rules] = js.native
  /**
       * Get the bucket object lifecycle.
       */
  def getBucketLifecycle(name: java.lang.String, options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions): js.Promise[aliDashOssLib.Anon_Rules] = js.native
  /**
       * Get bucket location
       */
  def getBucketLocation(name: java.lang.String): js.Promise[_] = js.native
  /**
       * Get the bucket logging settings.
       */
  def getBucketLogging(name: java.lang.String): js.Promise[aliDashOssLib.Anon_Prefix] = js.native
  /**
       * Get the bucket logging settings.
       */
  def getBucketLogging(name: java.lang.String, options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions): js.Promise[aliDashOssLib.Anon_Prefix] = js.native
  /**
       * Get the bucket request Referer white list.
       */
  def getBucketReferer(name: java.lang.String): js.Promise[aliDashOssLib.Anon_AllowEmpty] = js.native
  /**
       * Get the bucket request Referer white list.
       */
  def getBucketReferer(name: java.lang.String, options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions): js.Promise[aliDashOssLib.Anon_AllowEmpty] = js.native
  /**
       * Get the bucket website config.
       */
  def getBucketWebsite(name: java.lang.String): js.Promise[aliDashOssLib.Anon_Error] = js.native
  /**
       * Get the bucket website config.
       */
  def getBucketWebsite(name: java.lang.String, options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions): js.Promise[aliDashOssLib.Anon_Error] = js.native
  /**
       * Get live channel info.
       */
  def getChannel(id: java.lang.String): js.Promise[aliDashOssLib.Anon_DataResPutChannelConf] = js.native
  /**
       * Get live channel info.
       */
  def getChannel(id: java.lang.String, options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions): js.Promise[aliDashOssLib.Anon_DataResPutChannelConf] = js.native
  /**
       * Get the live channel history.
       */
  def getChannelHistory(id: java.lang.String): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.ChannelHistoryResult] = js.native
  /**
       * Get the live channel history.
       */
  def getChannelHistory(id: java.lang.String, options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.ChannelHistoryResult] = js.native
  /**
       * Get the live channel status.
       */
  def getChannelStatus(id: java.lang.String): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.GetChannelResult] = js.native
  /**
       * Get the live channel status.
       */
  def getChannelStatus(id: java.lang.String, options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.GetChannelResult] = js.native
  /**
       * Get the Object url. If provide baseUrl, will use baseUrl instead the default endpoint.
       */
  def getObjectUrl(name: java.lang.String): java.lang.String = js.native
  /**
       * Get the Object url. If provide baseUrl, will use baseUrl instead the default endpoint.
       */
  def getObjectUrl(name: java.lang.String, baseUrl: java.lang.String): java.lang.String = js.native
  /**
       * Get signatured rtmp url for publishing.
       */
  def getRtmpUrl(): java.lang.String = js.native
  /**
       * Get signatured rtmp url for publishing.
       */
  def getRtmpUrl(channelId: java.lang.String): java.lang.String = js.native
  /**
       * Get signatured rtmp url for publishing.
       */
  def getRtmpUrl(channelId: java.lang.String, options: aliDashOssLib.aliDashOssMod.OSSNs.GetRtmpUrlOptions): java.lang.String = js.native
  /**
       * Get an object read stream.
       */
  def getStream(): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.GetStreamResult] = js.native
  /**
       * Get an object read stream.
       */
  def getStream(name: java.lang.String): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.GetStreamResult] = js.native
  /**
       * Get an object read stream.
       */
  def getStream(name: java.lang.String, options: aliDashOssLib.aliDashOssMod.OSSNs.GetStreamOptions): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.GetStreamResult] = js.native
  /**
       * Head an object and get the meta info.
       */
  def head(name: java.lang.String): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.HeadObjectResult] = js.native
  /**
       * Head an object and get the meta info.
       */
  def head(name: java.lang.String, options: aliDashOssLib.aliDashOssMod.OSSNs.HeadObjectOptions): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.HeadObjectResult] = js.native
  /**
       * multi upload
       */
  def initMultipartUpload(name: java.lang.String): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.InitMultipartUploadResult] = js.native
  /**
       * multi upload
       */
  def initMultipartUpload(name: java.lang.String, options: aliDashOssLib.aliDashOssMod.OSSNs.InitMultipartUploadOptions): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.InitMultipartUploadResult] = js.native
  /********************************************************** Object operations ********************************************/
  /**
       * List objects in the bucket.
       */
  def list(
    query: aliDashOssLib.aliDashOssMod.OSSNs.ListObjectsQuery,
    options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.ListObjectResult] = js.native
  /********************************************************** Object operations ********************************************/
  /**
       * List objects in the bucket.
       */
  def list(query: scala.Null, options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.ListObjectResult] = js.native
  /******************************************* the bucket operations *************************************************/
  
  // base operators
  /**
       * List buckets in this account.
       */
  def listBuckets(): js.Promise[js.Array[aliDashOssLib.aliDashOssMod.OSSNs.Bucket]] = js.native
  /******************************************* the bucket operations *************************************************/
  
  // base operators
  /**
       * List buckets in this account.
       */
  def listBuckets(query: aliDashOssLib.aliDashOssMod.OSSNs.ListBucketsQueryType): js.Promise[js.Array[aliDashOssLib.aliDashOssMod.OSSNs.Bucket]] = js.native
  /******************************************* the bucket operations *************************************************/
  
  // base operators
  /**
       * List buckets in this account.
       */
  def listBuckets(
    query: aliDashOssLib.aliDashOssMod.OSSNs.ListBucketsQueryType,
    options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions
  ): js.Promise[js.Array[aliDashOssLib.aliDashOssMod.OSSNs.Bucket]] = js.native
  /******************************************* the bucket operations *************************************************/
  
  // base operators
  /**
       * List buckets in this account.
       */
  def listBuckets(query: scala.Null, options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions): js.Promise[js.Array[aliDashOssLib.aliDashOssMod.OSSNs.Bucket]] = js.native
  /**
       * List channels.
       */
  def listChannels(query: aliDashOssLib.aliDashOssMod.OSSNs.ListChannelsQuery): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.ListChannelsResult] = js.native
  /**
       * List channels.
       */
  def listChannels(
    query: aliDashOssLib.aliDashOssMod.OSSNs.ListChannelsQuery,
    options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.ListChannelsResult] = js.native
  /**
       * The ListParts command can be used to list all successfully uploaded parts mapped to a specific upload ID, i.e.: those not completed and not aborted.
       */
  def listParts(name: java.lang.String, uploadId: java.lang.String): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.ListPartsResult] = js.native
  /**
       * The ListParts command can be used to list all successfully uploaded parts mapped to a specific upload ID, i.e.: those not completed and not aborted.
       */
  def listParts(
    name: java.lang.String,
    uploadId: java.lang.String,
    query: aliDashOssLib.aliDashOssMod.OSSNs.ListPartsQuery
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.ListPartsResult] = js.native
  /**
       * The ListParts command can be used to list all successfully uploaded parts mapped to a specific upload ID, i.e.: those not completed and not aborted.
       */
  def listParts(
    name: java.lang.String,
    uploadId: java.lang.String,
    query: aliDashOssLib.aliDashOssMod.OSSNs.ListPartsQuery,
    options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.ListPartsResult] = js.native
  /**
       * List on-going multipart uploads, i.e.: those not completed and not aborted.
       */
  def listUploads(query: aliDashOssLib.aliDashOssMod.OSSNs.ListUploadsQuery): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.ListUploadsResult] = js.native
  /**
       * List on-going multipart uploads, i.e.: those not completed and not aborted.
       */
  def listUploads(
    query: aliDashOssLib.aliDashOssMod.OSSNs.ListUploadsQuery,
    options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.ListUploadsResult] = js.native
  /**
       * Upload file with OSS multipart.
       */
  def multipartUpload(
    name: java.lang.String,
    file: js.Any,
    options: aliDashOssLib.aliDashOssMod.OSSNs.MultipartUploadOptions
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.MultipartUploadResult] = js.native
  /**
       * Copy file with OSS multipart.
       * this function contains head, initMultipartUpload, uploadPartCopy, completeMultipartUpload.
       * When copying a file larger than 1 GB, you should use the Upload Part Copy method. If you want to copy a file smaller than 1 GB, see Copy Object.
       */
  def multipartUploadCopy(
    name: java.lang.String,
    sourceData: aliDashOssLib.aliDashOssMod.OSSNs.MultipartUploadCopySourceData
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.MultipartUploadCopyResult] = js.native
  /**
       * Copy file with OSS multipart.
       * this function contains head, initMultipartUpload, uploadPartCopy, completeMultipartUpload.
       * When copying a file larger than 1 GB, you should use the Upload Part Copy method. If you want to copy a file smaller than 1 GB, see Copy Object.
       */
  def multipartUploadCopy(
    name: java.lang.String,
    sourceData: aliDashOssLib.aliDashOssMod.OSSNs.MultipartUploadCopySourceData,
    options: aliDashOssLib.aliDashOssMod.OSSNs.MultipartUploadOptions
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.MultipartUploadCopyResult] = js.native
  /**
       * Add an object to the bucket.
       */
  def put(name: java.lang.String, file: js.Any): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.PutObjectResult] = js.native
  /**
       * Add an object to the bucket.
       */
  def put(name: java.lang.String, file: js.Any, options: aliDashOssLib.aliDashOssMod.OSSNs.PutObjectOptions): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.PutObjectResult] = js.native
  /**
       * Set object's ACL.
       */
  def putACL(name: java.lang.String, acl: aliDashOssLib.aliDashOssMod.OSSNs.ACLType): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Set object's ACL.
       */
  def putACL(
    name: java.lang.String,
    acl: aliDashOssLib.aliDashOssMod.OSSNs.ACLType,
    options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Create a new bucket.
       */
  def putBucket(name: java.lang.String): js.Promise[aliDashOssLib.Anon_Bucket] = js.native
  /**
       * Create a new bucket.
       */
  def putBucket(name: java.lang.String, options: aliDashOssLib.aliDashOssMod.OSSNs.PutBucketOptions): js.Promise[aliDashOssLib.Anon_Bucket] = js.native
  // ACL operations
  /**
       * Update the bucket ACL.
       */
  def putBucketACL(name: java.lang.String, acl: aliDashOssLib.aliDashOssMod.OSSNs.ACLType): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  // ACL operations
  /**
       * Update the bucket ACL.
       */
  def putBucketACL(
    name: java.lang.String,
    acl: aliDashOssLib.aliDashOssMod.OSSNs.ACLType,
    options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  // CORS operations
  /**
       * Set CORS rules of the bucket object
       */
  def putBucketCORS(name: java.lang.String, rules: js.Array[aliDashOssLib.aliDashOssMod.OSSNs.CORSRule]): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  // CORS operations
  /**
       * Set CORS rules of the bucket object
       */
  def putBucketCORS(
    name: java.lang.String,
    rules: js.Array[aliDashOssLib.aliDashOssMod.OSSNs.CORSRule],
    options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  // lifecycle operations
  /**
       * Set the bucket object lifecycle.
       */
  def putBucketLifecycle(name: java.lang.String, rules: js.Array[aliDashOssLib.aliDashOssMod.OSSNs.LifecycleRule]): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  // lifecycle operations
  /**
       * Set the bucket object lifecycle.
       */
  def putBucketLifecycle(
    name: java.lang.String,
    rules: js.Array[aliDashOssLib.aliDashOssMod.OSSNs.LifecycleRule],
    options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  // logging operations
  /**
       * Update the bucket logging settings. Log file will create every one hour and name format: <prefix><bucket>-YYYY-mm-DD-HH-MM-SS-UniqueString.
       */
  def putBucketLogging(name: java.lang.String): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  // logging operations
  /**
       * Update the bucket logging settings. Log file will create every one hour and name format: <prefix><bucket>-YYYY-mm-DD-HH-MM-SS-UniqueString.
       */
  def putBucketLogging(name: java.lang.String, prefix: java.lang.String): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  // logging operations
  /**
       * Update the bucket logging settings. Log file will create every one hour and name format: <prefix><bucket>-YYYY-mm-DD-HH-MM-SS-UniqueString.
       */
  def putBucketLogging(
    name: java.lang.String,
    prefix: java.lang.String,
    options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  // referer operations
  /**
       * Set the bucket request Referer white list.
       */
  def putBucketReferer(name: java.lang.String, allowEmpty: scala.Boolean, referers: js.Array[java.lang.String]): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  // referer operations
  /**
       * Set the bucket request Referer white list.
       */
  def putBucketReferer(
    name: java.lang.String,
    allowEmpty: scala.Boolean,
    referers: js.Array[java.lang.String],
    options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  // Website operations
  /**
       * Set the bucket as a static website.
       */
  def putBucketWebsite(name: java.lang.String, config: aliDashOssLib.aliDashOssMod.OSSNs.PutBucketWebsiteConfig): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /************************************************ RTMP Operations *************************************************************/
  /**
       * Create a live channel.
       */
  def putChannel(id: java.lang.String, conf: aliDashOssLib.aliDashOssMod.OSSNs.PutChannelConf): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.PutChannelResult] = js.native
  /************************************************ RTMP Operations *************************************************************/
  /**
       * Create a live channel.
       */
  def putChannel(
    id: java.lang.String,
    conf: aliDashOssLib.aliDashOssMod.OSSNs.PutChannelConf,
    options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.PutChannelResult] = js.native
  /**
       * Change the live channel status.
       */
  def putChannelStatus(id: java.lang.String): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Change the live channel status.
       */
  def putChannelStatus(id: java.lang.String, status: java.lang.String): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Change the live channel status.
       */
  def putChannelStatus(
    id: java.lang.String,
    status: java.lang.String,
    options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Set an exists object meta.
       */
  def putMeta(
    name: java.lang.String,
    meta: aliDashOssLib.aliDashOssMod.OSSNs.UserMeta,
    options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.CopyAndPutMetaResult] = js.native
  /**
       * Add a stream object to the bucket.
       */
  def putStream(name: java.lang.String, stream: js.Any): js.Promise[aliDashOssLib.Anon_Name] = js.native
  /**
       * Add a stream object to the bucket.
       */
  def putStream(
    name: java.lang.String,
    stream: js.Any,
    options: aliDashOssLib.aliDashOssMod.OSSNs.PutStreamOptions
  ): js.Promise[aliDashOssLib.Anon_Name] = js.native
  /**
       * Restore Object.
       */
  def restore(name: java.lang.String): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Restore Object.
       */
  def restore(name: java.lang.String, options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse] = js.native
  /**
       * Create a signature url for download or upload object. When you put object with signatureUrl ,you need to pass Content-Type.Please look at the example.
       */
  def signatureUrl(name: java.lang.String): java.lang.String = js.native
  /**
       * Create a signature url for download or upload object. When you put object with signatureUrl ,you need to pass Content-Type.Please look at the example.
       */
  def signatureUrl(name: java.lang.String, options: aliDashOssLib.aliDashOssMod.OSSNs.SignatureUrlOptions): java.lang.String = js.native
  /**
       * After initiating a Multipart Upload event, you can upload data in parts based on the specified object name and Upload ID.
       */
  def uploadPart(
    name: java.lang.String,
    uploadId: java.lang.String,
    partNo: scala.Double,
    file: js.Any,
    start: scala.Double,
    end: scala.Double
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.UploadPartResult] = js.native
  /**
       * After initiating a Multipart Upload event, you can upload data in parts based on the specified object name and Upload ID.
       */
  def uploadPart(
    name: java.lang.String,
    uploadId: java.lang.String,
    partNo: scala.Double,
    file: js.Any,
    start: scala.Double,
    end: scala.Double,
    options: aliDashOssLib.aliDashOssMod.OSSNs.RequestOptions
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.UploadPartResult] = js.native
  /**
       * Using Upload Part Copy, you can copy data from an existing object and upload a part of the data.
       * When copying a file larger than 1 GB, you must use the Upload Part Copy method. If you want to copy a file smaller than 1 GB, see Copy Object.
       */
  def uploadPartCopy(
    name: java.lang.String,
    uploadId: java.lang.String,
    partNo: scala.Double,
    range: java.lang.String,
    sourceData: aliDashOssLib.Anon_SourceBucketName,
    options: aliDashOssLib.Anon_Timeout
  ): js.Promise[aliDashOssLib.aliDashOssMod.OSSNs.UploadPartResult] = js.native
  /**
       * Use the bucket.
       */
  def useBucket(name: java.lang.String): scala.Unit = js.native
}

