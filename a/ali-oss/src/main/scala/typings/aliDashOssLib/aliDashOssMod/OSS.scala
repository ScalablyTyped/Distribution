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
  def abortMultipartUpload(name: java.lang.String, uploadId: java.lang.String): js.Promise[NormalSuccessResponse] = js.native
  def abortMultipartUpload(name: java.lang.String, uploadId: java.lang.String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  /**
    * Append an object to the bucket, it's almost same as put, but it can add content to existing object rather than override it.
    */
  def append(name: java.lang.String, file: js.Any): js.Promise[AppendObjectResult] = js.native
  def append(name: java.lang.String, file: js.Any, options: AppendObjectOptions): js.Promise[AppendObjectResult] = js.native
  /**
    * After uploading all data parts, you must call the Complete Multipart Upload API to complete Multipart Upload for the entire file.
    */
  def completeMultipartUpload(name: java.lang.String, uploadId: java.lang.String, parts: js.Array[aliDashOssLib.Anon_Etag]): js.Promise[CompleteMultipartUploadResult] = js.native
  def completeMultipartUpload(
    name: java.lang.String,
    uploadId: java.lang.String,
    parts: js.Array[aliDashOssLib.Anon_Etag],
    options: CompleteMultipartUploadOptions
  ): js.Promise[CompleteMultipartUploadResult] = js.native
  /**
    * Copy an object from sourceName to name.
    */
  def copy(name: java.lang.String, sourceName: java.lang.String): js.Promise[CopyAndPutMetaResult] = js.native
  def copy(name: java.lang.String, sourceName: java.lang.String, options: CopyObjectOptions): js.Promise[CopyAndPutMetaResult] = js.native
  /**
    * Create a VOD playlist for the channel.
    */
  def createVod(id: java.lang.String, name: java.lang.String, time: aliDashOssLib.Anon_EndTime): js.Promise[NormalSuccessResponse] = js.native
  def createVod(
    id: java.lang.String,
    name: java.lang.String,
    time: aliDashOssLib.Anon_EndTime,
    options: RequestOptions
  ): js.Promise[NormalSuccessResponse] = js.native
  /**
    * Delete an object from the bucket.
    */
  def delete(name: java.lang.String): js.Promise[NormalSuccessResponse] = js.native
  def delete(name: java.lang.String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  /**
    * Delete an empty bucket.
    */
  def deleteBucket(name: java.lang.String): js.Promise[NormalSuccessResponse] = js.native
  def deleteBucket(name: java.lang.String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  /**
    * Delete CORS rules of the bucket object.
    */
  def deleteBucketCORS(name: java.lang.String): js.Promise[NormalSuccessResponse] = js.native
  /**
    * Delete the bucket object lifecycle.
    */
  def deleteBucketLifecycle(name: java.lang.String): js.Promise[NormalSuccessResponse] = js.native
  def deleteBucketLifecycle(name: java.lang.String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  /**
    * Delete the bucket logging settings.
    */
  def deleteBucketLogging(name: java.lang.String): js.Promise[NormalSuccessResponse] = js.native
  def deleteBucketLogging(name: java.lang.String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  /**
    * Delete the bucket request Referer white list.
    */
  def deleteBucketReferer(name: java.lang.String): js.Promise[NormalSuccessResponse] = js.native
  def deleteBucketReferer(name: java.lang.String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  /**
    * Delete the bucket website config.
    */
  def deleteBucketWebsite(name: java.lang.String): js.Promise[NormalSuccessResponse] = js.native
  def deleteBucketWebsite(name: java.lang.String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  /**
    * Delete a live channel.
    */
  def deleteChannel(id: java.lang.String): js.Promise[NormalSuccessResponse] = js.native
  def deleteChannel(id: java.lang.String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  /**
    * Delete multi objects in one request.
    */
  def deleteMulti(names: js.Array[java.lang.String]): js.Promise[DeleteMultiResult] = js.native
  def deleteMulti(names: js.Array[java.lang.String], options: DeleteMultiOptions): js.Promise[DeleteMultiResult] = js.native
  /**
    * Get the Object url. If provide baseUrl, will use baseUrl instead the default bucket and endpoint. Suggest use generateObjectUrl instead of getObjectUrl.
    */
  def generateObjectUrl(name: java.lang.String): java.lang.String = js.native
  def generateObjectUrl(name: java.lang.String, baseUrl: java.lang.String): java.lang.String = js.native
  /**
    * Get an object from the bucket.
    */
  def get(name: java.lang.String): js.Promise[GetObjectResult] = js.native
  def get(name: java.lang.String, file: js.Any): js.Promise[GetObjectResult] = js.native
  def get(name: java.lang.String, file: js.Any, options: GetObjectOptions): js.Promise[GetObjectResult] = js.native
  /**
    * Get object's ACL.
    */
  def getACL(name: java.lang.String): js.Promise[GetACLResult] = js.native
  def getACL(name: java.lang.String, options: RequestOptions): js.Promise[GetACLResult] = js.native
  /**
    * Get the bucket ACL.
    *   acl - acl settings string
    */
  def getBucketACL(name: java.lang.String): js.Promise[aliDashOssLib.Anon_Acl] = js.native
  def getBucketACL(name: java.lang.String, options: RequestOptions): js.Promise[aliDashOssLib.Anon_Acl] = js.native
  /**
    * Get CORS rules of the bucket object.
    */
  def getBucketCORS(name: java.lang.String): js.Promise[aliDashOssLib.Anon_ResRulesArray] = js.native
  /**
    * Get bucket information,include CreationDate、ExtranetEndpoint、IntranetEndpoint、Location、Name、StorageClass、 Owner、AccessControlList
    */
  def getBucketInfo(name: java.lang.String): js.Promise[_] = js.native
  /**
    * Get the bucket object lifecycle.
    */
  def getBucketLifecycle(name: java.lang.String): js.Promise[aliDashOssLib.Anon_ResRules] = js.native
  def getBucketLifecycle(name: java.lang.String, options: RequestOptions): js.Promise[aliDashOssLib.Anon_ResRules] = js.native
  /**
    * Get bucket location
    */
  def getBucketLocation(name: java.lang.String): js.Promise[_] = js.native
  /**
    * Get the bucket logging settings.
    */
  def getBucketLogging(name: java.lang.String): js.Promise[aliDashOssLib.Anon_Enable] = js.native
  def getBucketLogging(name: java.lang.String, options: RequestOptions): js.Promise[aliDashOssLib.Anon_Enable] = js.native
  /**
    * Get the bucket request Referer white list.
    */
  def getBucketReferer(name: java.lang.String): js.Promise[aliDashOssLib.Anon_AllowEmpty] = js.native
  def getBucketReferer(name: java.lang.String, options: RequestOptions): js.Promise[aliDashOssLib.Anon_AllowEmpty] = js.native
  /**
    * Get the bucket website config.
    */
  def getBucketWebsite(name: java.lang.String): js.Promise[aliDashOssLib.Anon_Error] = js.native
  def getBucketWebsite(name: java.lang.String, options: RequestOptions): js.Promise[aliDashOssLib.Anon_Error] = js.native
  /**
    * Get live channel info.
    */
  def getChannel(id: java.lang.String): js.Promise[aliDashOssLib.Anon_DataResNormalSuccessResponse] = js.native
  def getChannel(id: java.lang.String, options: RequestOptions): js.Promise[aliDashOssLib.Anon_DataResNormalSuccessResponse] = js.native
  /**
    * Get the live channel history.
    */
  def getChannelHistory(id: java.lang.String): js.Promise[ChannelHistoryResult] = js.native
  def getChannelHistory(id: java.lang.String, options: RequestOptions): js.Promise[ChannelHistoryResult] = js.native
  /**
    * Get the live channel status.
    */
  def getChannelStatus(id: java.lang.String): js.Promise[GetChannelResult] = js.native
  def getChannelStatus(id: java.lang.String, options: RequestOptions): js.Promise[GetChannelResult] = js.native
  /**
    * Get the Object url. If provide baseUrl, will use baseUrl instead the default endpoint.
    */
  def getObjectUrl(name: java.lang.String): java.lang.String = js.native
  def getObjectUrl(name: java.lang.String, baseUrl: java.lang.String): java.lang.String = js.native
  /**
    * Get signatured rtmp url for publishing.
    */
  def getRtmpUrl(): java.lang.String = js.native
  def getRtmpUrl(channelId: java.lang.String): java.lang.String = js.native
  def getRtmpUrl(channelId: java.lang.String, options: GetRtmpUrlOptions): java.lang.String = js.native
  /**
    * Get an object read stream.
    */
  def getStream(): js.Promise[GetStreamResult] = js.native
  def getStream(name: java.lang.String): js.Promise[GetStreamResult] = js.native
  def getStream(name: java.lang.String, options: GetStreamOptions): js.Promise[GetStreamResult] = js.native
  /**
    * Head an object and get the meta info.
    */
  def head(name: java.lang.String): js.Promise[HeadObjectResult] = js.native
  def head(name: java.lang.String, options: HeadObjectOptions): js.Promise[HeadObjectResult] = js.native
  /**
    * multi upload
    */
  def initMultipartUpload(name: java.lang.String): js.Promise[InitMultipartUploadResult] = js.native
  def initMultipartUpload(name: java.lang.String, options: InitMultipartUploadOptions): js.Promise[InitMultipartUploadResult] = js.native
  /********************************************************** Object operations ********************************************/
  /**
    * List objects in the bucket.
    */
  def list(query: ListObjectsQuery, options: RequestOptions): js.Promise[ListObjectResult] = js.native
  def list(query: scala.Null, options: RequestOptions): js.Promise[ListObjectResult] = js.native
  def listBuckets(): js.Promise[js.Array[Bucket]] = js.native
  /******************************************* the bucket operations *************************************************/
  // base operators
  /**
    * List buckets in this account.
    */
  def listBuckets(query: ListBucketsQueryType): js.Promise[js.Array[Bucket]] = js.native
  def listBuckets(query: ListBucketsQueryType, options: RequestOptions): js.Promise[js.Array[Bucket]] = js.native
  def listBuckets(query: scala.Null, options: RequestOptions): js.Promise[js.Array[Bucket]] = js.native
  /**
    * List channels.
    */
  def listChannels(query: ListChannelsQuery): js.Promise[ListChannelsResult] = js.native
  def listChannels(query: ListChannelsQuery, options: RequestOptions): js.Promise[ListChannelsResult] = js.native
  /**
    * The ListParts command can be used to list all successfully uploaded parts mapped to a specific upload ID, i.e.: those not completed and not aborted.
    */
  def listParts(name: java.lang.String, uploadId: java.lang.String): js.Promise[ListPartsResult] = js.native
  def listParts(name: java.lang.String, uploadId: java.lang.String, query: ListPartsQuery): js.Promise[ListPartsResult] = js.native
  def listParts(name: java.lang.String, uploadId: java.lang.String, query: ListPartsQuery, options: RequestOptions): js.Promise[ListPartsResult] = js.native
  /**
    * List on-going multipart uploads, i.e.: those not completed and not aborted.
    */
  def listUploads(query: ListUploadsQuery): js.Promise[ListUploadsResult] = js.native
  def listUploads(query: ListUploadsQuery, options: RequestOptions): js.Promise[ListUploadsResult] = js.native
  /**
    * Upload file with OSS multipart.
    */
  def multipartUpload(name: java.lang.String, file: js.Any, options: MultipartUploadOptions): js.Promise[MultipartUploadResult] = js.native
  /**
    * Copy file with OSS multipart.
    * this function contains head, initMultipartUpload, uploadPartCopy, completeMultipartUpload.
    * When copying a file larger than 1 GB, you should use the Upload Part Copy method. If you want to copy a file smaller than 1 GB, see Copy Object.
    */
  def multipartUploadCopy(name: java.lang.String, sourceData: MultipartUploadCopySourceData): js.Promise[MultipartUploadCopyResult] = js.native
  def multipartUploadCopy(name: java.lang.String, sourceData: MultipartUploadCopySourceData, options: MultipartUploadOptions): js.Promise[MultipartUploadCopyResult] = js.native
  /**
    * Add an object to the bucket.
    */
  def put(name: java.lang.String, file: js.Any): js.Promise[PutObjectResult] = js.native
  def put(name: java.lang.String, file: js.Any, options: PutObjectOptions): js.Promise[PutObjectResult] = js.native
  /**
    * Set object's ACL.
    */
  def putACL(name: java.lang.String, acl: ACLType): js.Promise[NormalSuccessResponse] = js.native
  def putACL(name: java.lang.String, acl: ACLType, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  /**
    * Create a new bucket.
    */
  def putBucket(name: java.lang.String): js.Promise[aliDashOssLib.Anon_Bucket] = js.native
  def putBucket(name: java.lang.String, options: PutBucketOptions): js.Promise[aliDashOssLib.Anon_Bucket] = js.native
  // ACL operations
  /**
    * Update the bucket ACL.
    */
  def putBucketACL(name: java.lang.String, acl: ACLType): js.Promise[NormalSuccessResponse] = js.native
  def putBucketACL(name: java.lang.String, acl: ACLType, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  // CORS operations
  /**
    * Set CORS rules of the bucket object
    */
  def putBucketCORS(name: java.lang.String, rules: js.Array[CORSRule]): js.Promise[NormalSuccessResponse] = js.native
  def putBucketCORS(name: java.lang.String, rules: js.Array[CORSRule], options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  // lifecycle operations
  /**
    * Set the bucket object lifecycle.
    */
  def putBucketLifecycle(name: java.lang.String, rules: js.Array[LifecycleRule]): js.Promise[NormalSuccessResponse] = js.native
  def putBucketLifecycle(name: java.lang.String, rules: js.Array[LifecycleRule], options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  // logging operations
  /**
    * Update the bucket logging settings. Log file will create every one hour and name format: <prefix><bucket>-YYYY-mm-DD-HH-MM-SS-UniqueString.
    */
  def putBucketLogging(name: java.lang.String): js.Promise[NormalSuccessResponse] = js.native
  def putBucketLogging(name: java.lang.String, prefix: java.lang.String): js.Promise[NormalSuccessResponse] = js.native
  def putBucketLogging(name: java.lang.String, prefix: java.lang.String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  // referer operations
  /**
    * Set the bucket request Referer white list.
    */
  def putBucketReferer(name: java.lang.String, allowEmpty: scala.Boolean, referers: js.Array[java.lang.String]): js.Promise[NormalSuccessResponse] = js.native
  def putBucketReferer(
    name: java.lang.String,
    allowEmpty: scala.Boolean,
    referers: js.Array[java.lang.String],
    options: RequestOptions
  ): js.Promise[NormalSuccessResponse] = js.native
  // Website operations
  /**
    * Set the bucket as a static website.
    */
  def putBucketWebsite(name: java.lang.String, config: PutBucketWebsiteConfig): js.Promise[NormalSuccessResponse] = js.native
  /************************************************ RTMP Operations *************************************************************/
  /**
    * Create a live channel.
    */
  def putChannel(id: java.lang.String, conf: PutChannelConf): js.Promise[PutChannelResult] = js.native
  def putChannel(id: java.lang.String, conf: PutChannelConf, options: RequestOptions): js.Promise[PutChannelResult] = js.native
  /**
    * Change the live channel status.
    */
  def putChannelStatus(id: java.lang.String): js.Promise[NormalSuccessResponse] = js.native
  def putChannelStatus(id: java.lang.String, status: java.lang.String): js.Promise[NormalSuccessResponse] = js.native
  def putChannelStatus(id: java.lang.String, status: java.lang.String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  /**
    * Set an exists object meta.
    */
  def putMeta(name: java.lang.String, meta: UserMeta, options: RequestOptions): js.Promise[CopyAndPutMetaResult] = js.native
  /**
    * Add a stream object to the bucket.
    */
  def putStream(name: java.lang.String, stream: js.Any): js.Promise[aliDashOssLib.Anon_Name] = js.native
  def putStream(name: java.lang.String, stream: js.Any, options: PutStreamOptions): js.Promise[aliDashOssLib.Anon_Name] = js.native
  /**
    * Restore Object.
    */
  def restore(name: java.lang.String): js.Promise[NormalSuccessResponse] = js.native
  def restore(name: java.lang.String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  /**
    * Create a signature url for download or upload object. When you put object with signatureUrl ,you need to pass Content-Type.Please look at the example.
    */
  def signatureUrl(name: java.lang.String): java.lang.String = js.native
  def signatureUrl(name: java.lang.String, options: SignatureUrlOptions): java.lang.String = js.native
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
  ): js.Promise[UploadPartResult] = js.native
  def uploadPart(
    name: java.lang.String,
    uploadId: java.lang.String,
    partNo: scala.Double,
    file: js.Any,
    start: scala.Double,
    end: scala.Double,
    options: RequestOptions
  ): js.Promise[UploadPartResult] = js.native
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
    options: aliDashOssLib.Anon_HeadersTimeout
  ): js.Promise[UploadPartResult] = js.native
  /**
    * Use the bucket.
    */
  def useBucket(name: java.lang.String): scala.Unit = js.native
}

