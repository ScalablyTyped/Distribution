package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectOutput extends js.Object {
  /**
    * 
    */
  var AcceptRanges: js.UndefOr[AcceptRanges] = js.undefined
  /**
    * Object data.
    */
  var Body: js.UndefOr[Body] = js.undefined
  /**
    * Specifies caching behavior along the request/reply chain.
    */
  var CacheControl: js.UndefOr[CacheControl] = js.undefined
  /**
    * Specifies presentational information for the object.
    */
  var ContentDisposition: js.UndefOr[ContentDisposition] = js.undefined
  /**
    * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.
    */
  var ContentEncoding: js.UndefOr[ContentEncoding] = js.undefined
  /**
    * The language the content is in.
    */
  var ContentLanguage: js.UndefOr[ContentLanguage] = js.undefined
  /**
    * Size of the body in bytes.
    */
  var ContentLength: js.UndefOr[ContentLength] = js.undefined
  /**
    * The portion of the object returned in the response.
    */
  var ContentRange: js.UndefOr[ContentRange] = js.undefined
  /**
    * A standard MIME type describing the format of the object data.
    */
  var ContentType: js.UndefOr[ContentType] = js.undefined
  /**
    * Specifies whether the object retrieved was (true) or was not (false) a Delete Marker. If false, this response header does not appear in the response.
    */
  var DeleteMarker: js.UndefOr[DeleteMarker] = js.undefined
  /**
    * An ETag is an opaque identifier assigned by a web server to a specific version of a resource found at a URL
    */
  var ETag: js.UndefOr[ETag] = js.undefined
  /**
    * If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header. It includes the expiry-date and rule-id key value pairs providing object expiration information. The value of the rule-id is URL encoded.
    */
  var Expiration: js.UndefOr[Expiration] = js.undefined
  /**
    * The date and time at which the object is no longer cacheable.
    */
  var Expires: js.UndefOr[Expires] = js.undefined
  /**
    * Last modified date of the object
    */
  var LastModified: js.UndefOr[LastModified] = js.undefined
  /**
    * A map of metadata to store with the object in S3.
    */
  var Metadata: js.UndefOr[Metadata] = js.undefined
  /**
    * This is set to the number of metadata entries not returned in x-amz-meta headers. This can happen if you create metadata using an API like SOAP that supports more flexible metadata than the REST API. For example, using SOAP, you can create metadata whose values are not legal HTTP headers.
    */
  var MissingMeta: js.UndefOr[MissingMeta] = js.undefined
  /**
    * Indicates whether this object has an active legal hold. This field is only returned if you have permission to view an object's legal hold status.
    */
  var ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus] = js.undefined
  /**
    * The object lock mode currently in place for this object.
    */
  var ObjectLockMode: js.UndefOr[ObjectLockMode] = js.undefined
  /**
    * The date and time when this object's object lock will expire.
    */
  var ObjectLockRetainUntilDate: js.UndefOr[ObjectLockRetainUntilDate] = js.undefined
  /**
    * The count of parts this object has.
    */
  var PartsCount: js.UndefOr[PartsCount] = js.undefined
  /**
    * 
    */
  var ReplicationStatus: js.UndefOr[ReplicationStatus] = js.undefined
  var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
  /**
    * Provides information about object restoration operation and expiration time of the restored object copy.
    */
  var Restore: js.UndefOr[Restore] = js.undefined
  /**
    * If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.
    */
  var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined
  /**
    * If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round trip message integrity verification of the customer-provided encryption key.
    */
  var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined
  /**
    * If present, specifies the ID of the AWS Key Management Service (KMS) master encryption key that was used for the object.
    */
  var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined
  /**
    * The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).
    */
  var ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined
  /**
    * 
    */
  var StorageClass: js.UndefOr[StorageClass] = js.undefined
  /**
    * The number of tags, if any, on the object.
    */
  var TagCount: js.UndefOr[TagCount] = js.undefined
  /**
    * Version of the object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  /**
    * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
    */
  var WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation] = js.undefined
}

object GetObjectOutput {
  @scala.inline
  def apply(
    AcceptRanges: AcceptRanges = null,
    Body: Body = null,
    CacheControl: CacheControl = null,
    ContentDisposition: ContentDisposition = null,
    ContentEncoding: ContentEncoding = null,
    ContentLanguage: ContentLanguage = null,
    ContentLength: js.UndefOr[ContentLength] = js.undefined,
    ContentRange: ContentRange = null,
    ContentType: ContentType = null,
    DeleteMarker: js.UndefOr[DeleteMarker] = js.undefined,
    ETag: ETag = null,
    Expiration: Expiration = null,
    Expires: Expires = null,
    LastModified: LastModified = null,
    Metadata: Metadata = null,
    MissingMeta: js.UndefOr[MissingMeta] = js.undefined,
    ObjectLockLegalHoldStatus: ObjectLockLegalHoldStatus = null,
    ObjectLockMode: ObjectLockMode = null,
    ObjectLockRetainUntilDate: ObjectLockRetainUntilDate = null,
    PartsCount: js.UndefOr[PartsCount] = js.undefined,
    ReplicationStatus: ReplicationStatus = null,
    RequestCharged: RequestCharged = null,
    Restore: Restore = null,
    SSECustomerAlgorithm: SSECustomerAlgorithm = null,
    SSECustomerKeyMD5: SSECustomerKeyMD5 = null,
    SSEKMSKeyId: SSEKMSKeyId = null,
    ServerSideEncryption: ServerSideEncryption = null,
    StorageClass: StorageClass = null,
    TagCount: js.UndefOr[TagCount] = js.undefined,
    VersionId: ObjectVersionId = null,
    WebsiteRedirectLocation: WebsiteRedirectLocation = null
  ): GetObjectOutput = {
    val __obj = js.Dynamic.literal()
    if (AcceptRanges != null) __obj.updateDynamic("AcceptRanges")(AcceptRanges)
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (CacheControl != null) __obj.updateDynamic("CacheControl")(CacheControl)
    if (ContentDisposition != null) __obj.updateDynamic("ContentDisposition")(ContentDisposition)
    if (ContentEncoding != null) __obj.updateDynamic("ContentEncoding")(ContentEncoding)
    if (ContentLanguage != null) __obj.updateDynamic("ContentLanguage")(ContentLanguage)
    if (!js.isUndefined(ContentLength)) __obj.updateDynamic("ContentLength")(ContentLength)
    if (ContentRange != null) __obj.updateDynamic("ContentRange")(ContentRange)
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType)
    if (!js.isUndefined(DeleteMarker)) __obj.updateDynamic("DeleteMarker")(DeleteMarker)
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration)
    if (Expires != null) __obj.updateDynamic("Expires")(Expires)
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified)
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata)
    if (!js.isUndefined(MissingMeta)) __obj.updateDynamic("MissingMeta")(MissingMeta)
    if (ObjectLockLegalHoldStatus != null) __obj.updateDynamic("ObjectLockLegalHoldStatus")(ObjectLockLegalHoldStatus.asInstanceOf[js.Any])
    if (ObjectLockMode != null) __obj.updateDynamic("ObjectLockMode")(ObjectLockMode.asInstanceOf[js.Any])
    if (ObjectLockRetainUntilDate != null) __obj.updateDynamic("ObjectLockRetainUntilDate")(ObjectLockRetainUntilDate)
    if (!js.isUndefined(PartsCount)) __obj.updateDynamic("PartsCount")(PartsCount)
    if (ReplicationStatus != null) __obj.updateDynamic("ReplicationStatus")(ReplicationStatus.asInstanceOf[js.Any])
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    if (Restore != null) __obj.updateDynamic("Restore")(Restore)
    if (SSECustomerAlgorithm != null) __obj.updateDynamic("SSECustomerAlgorithm")(SSECustomerAlgorithm)
    if (SSECustomerKeyMD5 != null) __obj.updateDynamic("SSECustomerKeyMD5")(SSECustomerKeyMD5)
    if (SSEKMSKeyId != null) __obj.updateDynamic("SSEKMSKeyId")(SSEKMSKeyId)
    if (ServerSideEncryption != null) __obj.updateDynamic("ServerSideEncryption")(ServerSideEncryption.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (!js.isUndefined(TagCount)) __obj.updateDynamic("TagCount")(TagCount)
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    if (WebsiteRedirectLocation != null) __obj.updateDynamic("WebsiteRedirectLocation")(WebsiteRedirectLocation)
    __obj.asInstanceOf[GetObjectOutput]
  }
}

