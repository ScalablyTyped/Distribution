package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyObjectRequest extends js.Object {
  /**
    * The canned ACL to apply to the object.
    */
  var ACL: js.UndefOr[ObjectCannedACL] = js.native
  /**
    * The name of the destination bucket.
    */
  var Bucket: BucketName = js.native
  /**
    * Specifies caching behavior along the request/reply chain.
    */
  var CacheControl: js.UndefOr[typings.awsDashSdk.clientsS3Mod.CacheControl] = js.native
  /**
    * Specifies presentational information for the object.
    */
  var ContentDisposition: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ContentDisposition] = js.native
  /**
    * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.
    */
  var ContentEncoding: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ContentEncoding] = js.native
  /**
    * The language the content is in.
    */
  var ContentLanguage: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ContentLanguage] = js.native
  /**
    * A standard MIME type describing the format of the object data.
    */
  var ContentType: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ContentType] = js.native
  /**
    * The name of the source bucket and key name of the source object, separated by a slash (/). Must be URL-encoded.
    */
  var CopySource: typings.awsDashSdk.clientsS3Mod.CopySource = js.native
  /**
    * Copies the object if its entity tag (ETag) matches the specified tag.
    */
  var CopySourceIfMatch: js.UndefOr[typings.awsDashSdk.clientsS3Mod.CopySourceIfMatch] = js.native
  /**
    * Copies the object if it has been modified since the specified time.
    */
  var CopySourceIfModifiedSince: js.UndefOr[typings.awsDashSdk.clientsS3Mod.CopySourceIfModifiedSince] = js.native
  /**
    * Copies the object if its entity tag (ETag) is different than the specified ETag.
    */
  var CopySourceIfNoneMatch: js.UndefOr[typings.awsDashSdk.clientsS3Mod.CopySourceIfNoneMatch] = js.native
  /**
    * Copies the object if it hasn't been modified since the specified time.
    */
  var CopySourceIfUnmodifiedSince: js.UndefOr[typings.awsDashSdk.clientsS3Mod.CopySourceIfUnmodifiedSince] = js.native
  /**
    * Specifies the algorithm to use when decrypting the source object (for example, AES256).
    */
  var CopySourceSSECustomerAlgorithm: js.UndefOr[typings.awsDashSdk.clientsS3Mod.CopySourceSSECustomerAlgorithm] = js.native
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use to decrypt the source object. The encryption key provided in this header must be one that was used when the source object was created.
    */
  var CopySourceSSECustomerKey: js.UndefOr[typings.awsDashSdk.clientsS3Mod.CopySourceSSECustomerKey] = js.native
  /**
    * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure that the encryption key was transmitted without error.
    */
  var CopySourceSSECustomerKeyMD5: js.UndefOr[typings.awsDashSdk.clientsS3Mod.CopySourceSSECustomerKeyMD5] = js.native
  /**
    * The date and time at which the object is no longer cacheable.
    */
  var Expires: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Expires] = js.native
  /**
    * Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on the object.
    */
  var GrantFullControl: js.UndefOr[typings.awsDashSdk.clientsS3Mod.GrantFullControl] = js.native
  /**
    * Allows grantee to read the object data and its metadata.
    */
  var GrantRead: js.UndefOr[typings.awsDashSdk.clientsS3Mod.GrantRead] = js.native
  /**
    * Allows grantee to read the object ACL.
    */
  var GrantReadACP: js.UndefOr[typings.awsDashSdk.clientsS3Mod.GrantReadACP] = js.native
  /**
    * Allows grantee to write the ACL for the applicable object.
    */
  var GrantWriteACP: js.UndefOr[typings.awsDashSdk.clientsS3Mod.GrantWriteACP] = js.native
  /**
    * The key of the destination object.
    */
  var Key: ObjectKey = js.native
  /**
    * A map of metadata to store with the object in S3.
    */
  var Metadata: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Metadata] = js.native
  /**
    * Specifies whether the metadata is copied from the source object or replaced with metadata provided in the request.
    */
  var MetadataDirective: js.UndefOr[typings.awsDashSdk.clientsS3Mod.MetadataDirective] = js.native
  /**
    * Specifies whether you want to apply a Legal Hold to the copied object.
    */
  var ObjectLockLegalHoldStatus: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ObjectLockLegalHoldStatus] = js.native
  /**
    * The Object Lock mode that you want to apply to the copied object.
    */
  var ObjectLockMode: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ObjectLockMode] = js.native
  /**
    * The date and time when you want the copied object's Object Lock to expire.
    */
  var ObjectLockRetainUntilDate: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ObjectLockRetainUntilDate] = js.native
  var RequestPayer: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestPayer] = js.native
  /**
    * Specifies the algorithm to use to when encrypting the object (for example, AES256).
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSECustomerAlgorithm] = js.native
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon S3 does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side​-encryption​-customer-algorithm header.
    */
  var SSECustomerKey: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSECustomerKey] = js.native
  /**
    * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure that the encryption key was transmitted without error.
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSECustomerKeyMD5] = js.native
  /**
    * Specifies the AWS KMS Encryption Context to use for object encryption. The value of this header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value pairs.
    */
  var SSEKMSEncryptionContext: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSEKMSEncryptionContext] = js.native
  /**
    * Specifies the AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS KMS will fail if not made via SSL or using SigV4. For information about configuring using any of the officially supported AWS SDKs and AWS CLI, see Specifying the Signature Version in Request Authentication in the Amazon S3 Developer Guide.
    */
  var SSEKMSKeyId: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSEKMSKeyId] = js.native
  /**
    * The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
    */
  var ServerSideEncryption: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ServerSideEncryption] = js.native
  /**
    * The type of storage to use for the object. Defaults to 'STANDARD'.
    */
  var StorageClass: js.UndefOr[typings.awsDashSdk.clientsS3Mod.StorageClass] = js.native
  /**
    * The tag-set for the object destination object this value must be used in conjunction with the TaggingDirective. The tag-set must be encoded as URL Query parameters.
    */
  var Tagging: js.UndefOr[TaggingHeader] = js.native
  /**
    * Specifies whether the object tag-set are copied from the source object or replaced with tag-set provided in the request.
    */
  var TaggingDirective: js.UndefOr[typings.awsDashSdk.clientsS3Mod.TaggingDirective] = js.native
  /**
    * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
    */
  var WebsiteRedirectLocation: js.UndefOr[typings.awsDashSdk.clientsS3Mod.WebsiteRedirectLocation] = js.native
}

object CopyObjectRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    CopySource: CopySource,
    Key: ObjectKey,
    ACL: ObjectCannedACL = null,
    CacheControl: CacheControl = null,
    ContentDisposition: ContentDisposition = null,
    ContentEncoding: ContentEncoding = null,
    ContentLanguage: ContentLanguage = null,
    ContentType: ContentType = null,
    CopySourceIfMatch: CopySourceIfMatch = null,
    CopySourceIfModifiedSince: CopySourceIfModifiedSince = null,
    CopySourceIfNoneMatch: CopySourceIfNoneMatch = null,
    CopySourceIfUnmodifiedSince: CopySourceIfUnmodifiedSince = null,
    CopySourceSSECustomerAlgorithm: CopySourceSSECustomerAlgorithm = null,
    CopySourceSSECustomerKey: CopySourceSSECustomerKey = null,
    CopySourceSSECustomerKeyMD5: CopySourceSSECustomerKeyMD5 = null,
    Expires: Expires = null,
    GrantFullControl: GrantFullControl = null,
    GrantRead: GrantRead = null,
    GrantReadACP: GrantReadACP = null,
    GrantWriteACP: GrantWriteACP = null,
    Metadata: Metadata = null,
    MetadataDirective: MetadataDirective = null,
    ObjectLockLegalHoldStatus: ObjectLockLegalHoldStatus = null,
    ObjectLockMode: ObjectLockMode = null,
    ObjectLockRetainUntilDate: ObjectLockRetainUntilDate = null,
    RequestPayer: RequestPayer = null,
    SSECustomerAlgorithm: SSECustomerAlgorithm = null,
    SSECustomerKey: SSECustomerKey = null,
    SSECustomerKeyMD5: SSECustomerKeyMD5 = null,
    SSEKMSEncryptionContext: SSEKMSEncryptionContext = null,
    SSEKMSKeyId: SSEKMSKeyId = null,
    ServerSideEncryption: ServerSideEncryption = null,
    StorageClass: StorageClass = null,
    Tagging: TaggingHeader = null,
    TaggingDirective: TaggingDirective = null,
    WebsiteRedirectLocation: WebsiteRedirectLocation = null
  ): CopyObjectRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CopySource = CopySource.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    if (ACL != null) __obj.updateDynamic("ACL")(ACL.asInstanceOf[js.Any])
    if (CacheControl != null) __obj.updateDynamic("CacheControl")(CacheControl.asInstanceOf[js.Any])
    if (ContentDisposition != null) __obj.updateDynamic("ContentDisposition")(ContentDisposition.asInstanceOf[js.Any])
    if (ContentEncoding != null) __obj.updateDynamic("ContentEncoding")(ContentEncoding.asInstanceOf[js.Any])
    if (ContentLanguage != null) __obj.updateDynamic("ContentLanguage")(ContentLanguage.asInstanceOf[js.Any])
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType.asInstanceOf[js.Any])
    if (CopySourceIfMatch != null) __obj.updateDynamic("CopySourceIfMatch")(CopySourceIfMatch.asInstanceOf[js.Any])
    if (CopySourceIfModifiedSince != null) __obj.updateDynamic("CopySourceIfModifiedSince")(CopySourceIfModifiedSince.asInstanceOf[js.Any])
    if (CopySourceIfNoneMatch != null) __obj.updateDynamic("CopySourceIfNoneMatch")(CopySourceIfNoneMatch.asInstanceOf[js.Any])
    if (CopySourceIfUnmodifiedSince != null) __obj.updateDynamic("CopySourceIfUnmodifiedSince")(CopySourceIfUnmodifiedSince.asInstanceOf[js.Any])
    if (CopySourceSSECustomerAlgorithm != null) __obj.updateDynamic("CopySourceSSECustomerAlgorithm")(CopySourceSSECustomerAlgorithm.asInstanceOf[js.Any])
    if (CopySourceSSECustomerKey != null) __obj.updateDynamic("CopySourceSSECustomerKey")(CopySourceSSECustomerKey.asInstanceOf[js.Any])
    if (CopySourceSSECustomerKeyMD5 != null) __obj.updateDynamic("CopySourceSSECustomerKeyMD5")(CopySourceSSECustomerKeyMD5.asInstanceOf[js.Any])
    if (Expires != null) __obj.updateDynamic("Expires")(Expires.asInstanceOf[js.Any])
    if (GrantFullControl != null) __obj.updateDynamic("GrantFullControl")(GrantFullControl.asInstanceOf[js.Any])
    if (GrantRead != null) __obj.updateDynamic("GrantRead")(GrantRead.asInstanceOf[js.Any])
    if (GrantReadACP != null) __obj.updateDynamic("GrantReadACP")(GrantReadACP.asInstanceOf[js.Any])
    if (GrantWriteACP != null) __obj.updateDynamic("GrantWriteACP")(GrantWriteACP.asInstanceOf[js.Any])
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata.asInstanceOf[js.Any])
    if (MetadataDirective != null) __obj.updateDynamic("MetadataDirective")(MetadataDirective.asInstanceOf[js.Any])
    if (ObjectLockLegalHoldStatus != null) __obj.updateDynamic("ObjectLockLegalHoldStatus")(ObjectLockLegalHoldStatus.asInstanceOf[js.Any])
    if (ObjectLockMode != null) __obj.updateDynamic("ObjectLockMode")(ObjectLockMode.asInstanceOf[js.Any])
    if (ObjectLockRetainUntilDate != null) __obj.updateDynamic("ObjectLockRetainUntilDate")(ObjectLockRetainUntilDate.asInstanceOf[js.Any])
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    if (SSECustomerAlgorithm != null) __obj.updateDynamic("SSECustomerAlgorithm")(SSECustomerAlgorithm.asInstanceOf[js.Any])
    if (SSECustomerKey != null) __obj.updateDynamic("SSECustomerKey")(SSECustomerKey.asInstanceOf[js.Any])
    if (SSECustomerKeyMD5 != null) __obj.updateDynamic("SSECustomerKeyMD5")(SSECustomerKeyMD5.asInstanceOf[js.Any])
    if (SSEKMSEncryptionContext != null) __obj.updateDynamic("SSEKMSEncryptionContext")(SSEKMSEncryptionContext.asInstanceOf[js.Any])
    if (SSEKMSKeyId != null) __obj.updateDynamic("SSEKMSKeyId")(SSEKMSKeyId.asInstanceOf[js.Any])
    if (ServerSideEncryption != null) __obj.updateDynamic("ServerSideEncryption")(ServerSideEncryption.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (Tagging != null) __obj.updateDynamic("Tagging")(Tagging.asInstanceOf[js.Any])
    if (TaggingDirective != null) __obj.updateDynamic("TaggingDirective")(TaggingDirective.asInstanceOf[js.Any])
    if (WebsiteRedirectLocation != null) __obj.updateDynamic("WebsiteRedirectLocation")(WebsiteRedirectLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyObjectRequest]
  }
}

