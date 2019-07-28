package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadObjectOutput extends js.Object {
  /**
    * 
    */
  var AcceptRanges: js.UndefOr[typings.awsDashSdk.clientsS3Mod.AcceptRanges] = js.undefined
  /**
    * Specifies caching behavior along the request/reply chain.
    */
  var CacheControl: js.UndefOr[typings.awsDashSdk.clientsS3Mod.CacheControl] = js.undefined
  /**
    * Specifies presentational information for the object.
    */
  var ContentDisposition: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ContentDisposition] = js.undefined
  /**
    * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.
    */
  var ContentEncoding: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ContentEncoding] = js.undefined
  /**
    * The language the content is in.
    */
  var ContentLanguage: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ContentLanguage] = js.undefined
  /**
    * Size of the body in bytes.
    */
  var ContentLength: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ContentLength] = js.undefined
  /**
    * A standard MIME type describing the format of the object data.
    */
  var ContentType: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ContentType] = js.undefined
  /**
    * Specifies whether the object retrieved was (true) or was not (false) a Delete Marker. If false, this response header does not appear in the response.
    */
  var DeleteMarker: js.UndefOr[typings.awsDashSdk.clientsS3Mod.DeleteMarker] = js.undefined
  /**
    * An ETag is an opaque identifier assigned by a web server to a specific version of a resource found at a URL
    */
  var ETag: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ETag] = js.undefined
  /**
    * If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header. It includes the expiry-date and rule-id key value pairs providing object expiration information. The value of the rule-id is URL encoded.
    */
  var Expiration: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Expiration] = js.undefined
  /**
    * The date and time at which the object is no longer cacheable.
    */
  var Expires: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Expires] = js.undefined
  /**
    * Last modified date of the object
    */
  var LastModified: js.UndefOr[typings.awsDashSdk.clientsS3Mod.LastModified] = js.undefined
  /**
    * A map of metadata to store with the object in S3.
    */
  var Metadata: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Metadata] = js.undefined
  /**
    * This is set to the number of metadata entries not returned in x-amz-meta headers. This can happen if you create metadata using an API like SOAP that supports more flexible metadata than the REST API. For example, using SOAP, you can create metadata whose values are not legal HTTP headers.
    */
  var MissingMeta: js.UndefOr[typings.awsDashSdk.clientsS3Mod.MissingMeta] = js.undefined
  /**
    * The Legal Hold status for the specified object.
    */
  var ObjectLockLegalHoldStatus: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ObjectLockLegalHoldStatus] = js.undefined
  /**
    * The object lock mode currently in place for this object.
    */
  var ObjectLockMode: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ObjectLockMode] = js.undefined
  /**
    * The date and time when this object's object lock expires.
    */
  var ObjectLockRetainUntilDate: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ObjectLockRetainUntilDate] = js.undefined
  /**
    * The count of parts this object has.
    */
  var PartsCount: js.UndefOr[typings.awsDashSdk.clientsS3Mod.PartsCount] = js.undefined
  /**
    * 
    */
  var ReplicationStatus: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ReplicationStatus] = js.undefined
  var RequestCharged: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestCharged] = js.undefined
  /**
    * Provides information about object restoration operation and expiration time of the restored object copy.
    */
  var Restore: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Restore] = js.undefined
  /**
    * If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSECustomerAlgorithm] = js.undefined
  /**
    * If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round trip message integrity verification of the customer-provided encryption key.
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSECustomerKeyMD5] = js.undefined
  /**
    * If present, specifies the ID of the AWS Key Management Service (KMS) master encryption key that was used for the object.
    */
  var SSEKMSKeyId: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSEKMSKeyId] = js.undefined
  /**
    * The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).
    */
  var ServerSideEncryption: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ServerSideEncryption] = js.undefined
  /**
    * 
    */
  var StorageClass: js.UndefOr[typings.awsDashSdk.clientsS3Mod.StorageClass] = js.undefined
  /**
    * Version of the object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  /**
    * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
    */
  var WebsiteRedirectLocation: js.UndefOr[typings.awsDashSdk.clientsS3Mod.WebsiteRedirectLocation] = js.undefined
}

object HeadObjectOutput {
  @scala.inline
  def apply(
    AcceptRanges: AcceptRanges = null,
    CacheControl: CacheControl = null,
    ContentDisposition: ContentDisposition = null,
    ContentEncoding: ContentEncoding = null,
    ContentLanguage: ContentLanguage = null,
    ContentLength: js.UndefOr[ContentLength] = js.undefined,
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
    VersionId: ObjectVersionId = null,
    WebsiteRedirectLocation: WebsiteRedirectLocation = null
  ): HeadObjectOutput = {
    val __obj = js.Dynamic.literal()
    if (AcceptRanges != null) __obj.updateDynamic("AcceptRanges")(AcceptRanges)
    if (CacheControl != null) __obj.updateDynamic("CacheControl")(CacheControl)
    if (ContentDisposition != null) __obj.updateDynamic("ContentDisposition")(ContentDisposition)
    if (ContentEncoding != null) __obj.updateDynamic("ContentEncoding")(ContentEncoding)
    if (ContentLanguage != null) __obj.updateDynamic("ContentLanguage")(ContentLanguage)
    if (!js.isUndefined(ContentLength)) __obj.updateDynamic("ContentLength")(ContentLength)
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
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    if (WebsiteRedirectLocation != null) __obj.updateDynamic("WebsiteRedirectLocation")(WebsiteRedirectLocation)
    __obj.asInstanceOf[HeadObjectOutput]
  }
}

