package typings.aliOss.mod

import typings.aliOss.anon.Acl
import typings.aliOss.anon.AllowEmpty
import typings.aliOss.anon.DataPutChannelConf
import typings.aliOss.anon.Enable
import typings.aliOss.anon.EndTime
import typings.aliOss.anon.Error
import typings.aliOss.anon.Etag
import typings.aliOss.anon.Name
import typings.aliOss.anon.ResRules
import typings.aliOss.anon.Rules
import typings.aliOss.anon.SourceBucketName
import typings.aliOss.anon.Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OSS extends js.Object {
  
  /**
    * Abort a multipart upload for object.
    */
  def abortMultipartUpload(name: String, uploadId: String): js.Promise[NormalSuccessResponse] = js.native
  def abortMultipartUpload(name: String, uploadId: String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  
  /**
    * Append an object to the bucket, it's almost same as put, but it can add content to existing object rather than override it.
    */
  def append(name: String, file: js.Any): js.Promise[AppendObjectResult] = js.native
  def append(name: String, file: js.Any, options: AppendObjectOptions): js.Promise[AppendObjectResult] = js.native
  
  /**
    * After uploading all data parts, you must call the Complete Multipart Upload API to complete Multipart Upload for the entire file.
    */
  def completeMultipartUpload(name: String, uploadId: String, parts: js.Array[Etag]): js.Promise[CompleteMultipartUploadResult] = js.native
  def completeMultipartUpload(name: String, uploadId: String, parts: js.Array[Etag], options: CompleteMultipartUploadOptions): js.Promise[CompleteMultipartUploadResult] = js.native
  
  /**
    * Copy an object from sourceName to name.
    */
  def copy(name: String, sourceName: String): js.Promise[CopyAndPutMetaResult] = js.native
  def copy(name: String, sourceName: String, options: CopyObjectOptions): js.Promise[CopyAndPutMetaResult] = js.native
  
  /**
    * Create a VOD playlist for the channel.
    */
  def createVod(id: String, name: String, time: EndTime): js.Promise[NormalSuccessResponse] = js.native
  def createVod(id: String, name: String, time: EndTime, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  
  /**
    * Delete an object from the bucket.
    */
  def delete(name: String): js.Promise[NormalSuccessResponse] = js.native
  def delete(name: String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  
  /**
    * Delete an empty bucket.
    */
  def deleteBucket(name: String): js.Promise[NormalSuccessResponse] = js.native
  def deleteBucket(name: String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  
  /**
    * Delete CORS rules of the bucket object.
    */
  def deleteBucketCORS(name: String): js.Promise[NormalSuccessResponse] = js.native
  
  /**
    * Delete the bucket object lifecycle.
    */
  def deleteBucketLifecycle(name: String): js.Promise[NormalSuccessResponse] = js.native
  def deleteBucketLifecycle(name: String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  
  /**
    * Delete the bucket logging settings.
    */
  def deleteBucketLogging(name: String): js.Promise[NormalSuccessResponse] = js.native
  def deleteBucketLogging(name: String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  
  /**
    * Delete the bucket request Referer white list.
    */
  def deleteBucketReferer(name: String): js.Promise[NormalSuccessResponse] = js.native
  def deleteBucketReferer(name: String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  
  /**
    * Delete the bucket website config.
    */
  def deleteBucketWebsite(name: String): js.Promise[NormalSuccessResponse] = js.native
  def deleteBucketWebsite(name: String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  
  /**
    * Delete a live channel.
    */
  def deleteChannel(id: String): js.Promise[NormalSuccessResponse] = js.native
  def deleteChannel(id: String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  
  /**
    * Delete multi objects in one request.
    */
  def deleteMulti(names: js.Array[String]): js.Promise[DeleteMultiResult] = js.native
  def deleteMulti(names: js.Array[String], options: DeleteMultiOptions): js.Promise[DeleteMultiResult] = js.native
  
  /**
    * Get the Object url. If provide baseUrl, will use baseUrl instead the default bucket and endpoint. Suggest use generateObjectUrl instead of getObjectUrl.
    */
  def generateObjectUrl(name: String): String = js.native
  def generateObjectUrl(name: String, baseUrl: String): String = js.native
  
  /**
    * Get an object from the bucket.
    */
  def get(name: String): js.Promise[GetObjectResult] = js.native
  def get(name: String, file: js.UndefOr[scala.Nothing], options: GetObjectOptions): js.Promise[GetObjectResult] = js.native
  def get(name: String, file: js.Any): js.Promise[GetObjectResult] = js.native
  def get(name: String, file: js.Any, options: GetObjectOptions): js.Promise[GetObjectResult] = js.native
  
  /**
    * Get object's ACL.
    */
  def getACL(name: String): js.Promise[GetACLResult] = js.native
  def getACL(name: String, options: RequestOptions): js.Promise[GetACLResult] = js.native
  
  /**
    * Get the bucket ACL.
    *   acl - acl settings string
    */
  def getBucketACL(name: String): js.Promise[Acl] = js.native
  def getBucketACL(name: String, options: RequestOptions): js.Promise[Acl] = js.native
  
  /**
    * Get CORS rules of the bucket object.
    */
  def getBucketCORS(name: String): js.Promise[ResRules] = js.native
  
  /**
    * Get bucket information,include CreationDate、ExtranetEndpoint、IntranetEndpoint、Location、Name、StorageClass、 Owner、AccessControlList
    */
  def getBucketInfo(name: String): js.Promise[_] = js.native
  
  /**
    * Get the bucket object lifecycle.
    */
  def getBucketLifecycle(name: String): js.Promise[Rules] = js.native
  def getBucketLifecycle(name: String, options: RequestOptions): js.Promise[Rules] = js.native
  
  /**
    * Get bucket location
    */
  def getBucketLocation(name: String): js.Promise[_] = js.native
  
  /**
    * Get the bucket logging settings.
    */
  def getBucketLogging(name: String): js.Promise[Enable] = js.native
  def getBucketLogging(name: String, options: RequestOptions): js.Promise[Enable] = js.native
  
  /**
    * Get the bucket request Referer white list.
    */
  def getBucketReferer(name: String): js.Promise[AllowEmpty] = js.native
  def getBucketReferer(name: String, options: RequestOptions): js.Promise[AllowEmpty] = js.native
  
  /**
    * Get the bucket website config.
    */
  def getBucketWebsite(name: String): js.Promise[Error] = js.native
  def getBucketWebsite(name: String, options: RequestOptions): js.Promise[Error] = js.native
  
  /**
    * Get live channel info.
    */
  def getChannel(id: String): js.Promise[DataPutChannelConf] = js.native
  def getChannel(id: String, options: RequestOptions): js.Promise[DataPutChannelConf] = js.native
  
  /**
    * Get the live channel history.
    */
  def getChannelHistory(id: String): js.Promise[ChannelHistoryResult] = js.native
  def getChannelHistory(id: String, options: RequestOptions): js.Promise[ChannelHistoryResult] = js.native
  
  /**
    * Get the live channel status.
    */
  def getChannelStatus(id: String): js.Promise[GetChannelResult] = js.native
  def getChannelStatus(id: String, options: RequestOptions): js.Promise[GetChannelResult] = js.native
  
  /**
    * Get the Object url. If provide baseUrl, will use baseUrl instead the default endpoint.
    */
  def getObjectUrl(name: String): String = js.native
  def getObjectUrl(name: String, baseUrl: String): String = js.native
  
  /**
    * Get signatured rtmp url for publishing.
    */
  def getRtmpUrl(): String = js.native
  def getRtmpUrl(channelId: js.UndefOr[scala.Nothing], options: GetRtmpUrlOptions): String = js.native
  def getRtmpUrl(channelId: String): String = js.native
  def getRtmpUrl(channelId: String, options: GetRtmpUrlOptions): String = js.native
  
  /**
    * Get an object read stream.
    */
  def getStream(): js.Promise[GetStreamResult] = js.native
  def getStream(name: js.UndefOr[scala.Nothing], options: GetStreamOptions): js.Promise[GetStreamResult] = js.native
  def getStream(name: String): js.Promise[GetStreamResult] = js.native
  def getStream(name: String, options: GetStreamOptions): js.Promise[GetStreamResult] = js.native
  
  /**
    * Head an object and get the meta info.
    */
  def head(name: String): js.Promise[HeadObjectResult] = js.native
  def head(name: String, options: HeadObjectOptions): js.Promise[HeadObjectResult] = js.native
  
  /**
    * multi upload
    */
  def initMultipartUpload(name: String): js.Promise[InitMultipartUploadResult] = js.native
  def initMultipartUpload(name: String, options: InitMultipartUploadOptions): js.Promise[InitMultipartUploadResult] = js.native
  
  def list(query: Null, options: RequestOptions): js.Promise[ListObjectResult] = js.native
  /********************************************************** Object operations ********************************************/
  /**
    * List objects in the bucket.
    */
  def list(query: ListObjectsQuery, options: RequestOptions): js.Promise[ListObjectResult] = js.native
  
  /******************************************* the bucket operations *************************************************/
  // base operators
  /**
    * List buckets in this account.
    */
  def listBuckets(): js.Promise[js.Array[Bucket]] = js.native
  def listBuckets(query: Null, options: RequestOptions): js.Promise[js.Array[Bucket]] = js.native
  def listBuckets(query: ListBucketsQueryType): js.Promise[js.Array[Bucket]] = js.native
  def listBuckets(query: ListBucketsQueryType, options: RequestOptions): js.Promise[js.Array[Bucket]] = js.native
  
  /**
    * List channels.
    */
  def listChannels(query: ListChannelsQuery): js.Promise[ListChannelsResult] = js.native
  def listChannels(query: ListChannelsQuery, options: RequestOptions): js.Promise[ListChannelsResult] = js.native
  
  /**
    * The ListParts command can be used to list all successfully uploaded parts mapped to a specific upload ID, i.e.: those not completed and not aborted.
    */
  def listParts(name: String, uploadId: String): js.Promise[ListPartsResult] = js.native
  def listParts(name: String, uploadId: String, query: js.UndefOr[scala.Nothing], options: RequestOptions): js.Promise[ListPartsResult] = js.native
  def listParts(name: String, uploadId: String, query: ListPartsQuery): js.Promise[ListPartsResult] = js.native
  def listParts(name: String, uploadId: String, query: ListPartsQuery, options: RequestOptions): js.Promise[ListPartsResult] = js.native
  
  /**
    * List on-going multipart uploads, i.e.: those not completed and not aborted.
    */
  def listUploads(query: ListUploadsQuery): js.Promise[ListUploadsResult] = js.native
  def listUploads(query: ListUploadsQuery, options: RequestOptions): js.Promise[ListUploadsResult] = js.native
  
  /**
    * Upload file with OSS multipart.
    */
  def multipartUpload(name: String, file: js.Any, options: MultipartUploadOptions): js.Promise[MultipartUploadResult] = js.native
  
  /**
    * Copy file with OSS multipart.
    * this function contains head, initMultipartUpload, uploadPartCopy, completeMultipartUpload.
    * When copying a file larger than 1 GB, you should use the Upload Part Copy method. If you want to copy a file smaller than 1 GB, see Copy Object.
    */
  def multipartUploadCopy(name: String, sourceData: MultipartUploadCopySourceData): js.Promise[MultipartUploadCopyResult] = js.native
  def multipartUploadCopy(name: String, sourceData: MultipartUploadCopySourceData, options: MultipartUploadOptions): js.Promise[MultipartUploadCopyResult] = js.native
  
  /**
    * Add an object to the bucket.
    */
  def put(name: String, file: js.Any): js.Promise[PutObjectResult] = js.native
  def put(name: String, file: js.Any, options: PutObjectOptions): js.Promise[PutObjectResult] = js.native
  
  /**
    * Set object's ACL.
    */
  def putACL(name: String, acl: ACLType): js.Promise[NormalSuccessResponse] = js.native
  def putACL(name: String, acl: ACLType, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  
  /**
    * Create a new bucket.
    */
  def putBucket(name: String): js.Promise[typings.aliOss.anon.Bucket] = js.native
  def putBucket(name: String, options: PutBucketOptions): js.Promise[typings.aliOss.anon.Bucket] = js.native
  
  // ACL operations
  /**
    * Update the bucket ACL.
    */
  def putBucketACL(name: String, acl: ACLType): js.Promise[NormalSuccessResponse] = js.native
  def putBucketACL(name: String, acl: ACLType, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  
  // CORS operations
  /**
    * Set CORS rules of the bucket object
    */
  def putBucketCORS(name: String, rules: js.Array[CORSRule]): js.Promise[NormalSuccessResponse] = js.native
  def putBucketCORS(name: String, rules: js.Array[CORSRule], options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  
  // lifecycle operations
  /**
    * Set the bucket object lifecycle.
    */
  def putBucketLifecycle(name: String, rules: js.Array[LifecycleRule]): js.Promise[NormalSuccessResponse] = js.native
  def putBucketLifecycle(name: String, rules: js.Array[LifecycleRule], options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  
  // logging operations
  /**
    * Update the bucket logging settings. Log file will create every one hour and name format: <prefix><bucket>-YYYY-mm-DD-HH-MM-SS-UniqueString.
    */
  def putBucketLogging(name: String): js.Promise[NormalSuccessResponse] = js.native
  def putBucketLogging(name: String, prefix: js.UndefOr[scala.Nothing], options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  def putBucketLogging(name: String, prefix: String): js.Promise[NormalSuccessResponse] = js.native
  def putBucketLogging(name: String, prefix: String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  
  // referer operations
  /**
    * Set the bucket request Referer white list.
    */
  def putBucketReferer(name: String, allowEmpty: Boolean, referers: js.Array[String]): js.Promise[NormalSuccessResponse] = js.native
  def putBucketReferer(name: String, allowEmpty: Boolean, referers: js.Array[String], options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  
  // Website operations
  /**
    * Set the bucket as a static website.
    */
  def putBucketWebsite(name: String, config: PutBucketWebsiteConfig): js.Promise[NormalSuccessResponse] = js.native
  
  /************************************************ RTMP Operations *************************************************************/
  /**
    * Create a live channel.
    */
  def putChannel(id: String, conf: PutChannelConf): js.Promise[PutChannelResult] = js.native
  def putChannel(id: String, conf: PutChannelConf, options: RequestOptions): js.Promise[PutChannelResult] = js.native
  
  /**
    * Change the live channel status.
    */
  def putChannelStatus(id: String): js.Promise[NormalSuccessResponse] = js.native
  def putChannelStatus(id: String, status: js.UndefOr[scala.Nothing], options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  def putChannelStatus(id: String, status: String): js.Promise[NormalSuccessResponse] = js.native
  def putChannelStatus(id: String, status: String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  
  /**
    * Set an exists object meta.
    */
  def putMeta(name: String, meta: UserMeta, options: RequestOptions): js.Promise[CopyAndPutMetaResult] = js.native
  
  /**
    * Add a stream object to the bucket.
    */
  def putStream(name: String, stream: js.Any): js.Promise[Name] = js.native
  def putStream(name: String, stream: js.Any, options: PutStreamOptions): js.Promise[Name] = js.native
  
  /**
    * Restore Object.
    */
  def restore(name: String): js.Promise[NormalSuccessResponse] = js.native
  def restore(name: String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  
  /**
    * Create a signature url for download or upload object. When you put object with signatureUrl ,you need to pass Content-Type.Please look at the example.
    */
  def signatureUrl(name: String): String = js.native
  def signatureUrl(name: String, options: SignatureUrlOptions): String = js.native
  
  /**
    * After initiating a Multipart Upload event, you can upload data in parts based on the specified object name and Upload ID.
    */
  def uploadPart(name: String, uploadId: String, partNo: Double, file: js.Any, start: Double, end: Double): js.Promise[UploadPartResult] = js.native
  def uploadPart(
    name: String,
    uploadId: String,
    partNo: Double,
    file: js.Any,
    start: Double,
    end: Double,
    options: RequestOptions
  ): js.Promise[UploadPartResult] = js.native
  
  /**
    * Using Upload Part Copy, you can copy data from an existing object and upload a part of the data.
    * When copying a file larger than 1 GB, you must use the Upload Part Copy method. If you want to copy a file smaller than 1 GB, see Copy Object.
    */
  def uploadPartCopy(
    name: String,
    uploadId: String,
    partNo: Double,
    range: String,
    sourceData: SourceBucketName,
    options: Timeout
  ): js.Promise[UploadPartResult] = js.native
  
  /**
    * Use the bucket.
    */
  def useBucket(name: String): Unit = js.native
}
