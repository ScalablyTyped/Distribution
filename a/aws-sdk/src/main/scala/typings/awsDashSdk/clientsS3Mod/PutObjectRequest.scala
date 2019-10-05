package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutObjectRequest extends js.Object {
  /**
    * The canned ACL to apply to the object.
    */
  var ACL: js.UndefOr[ObjectCannedACL] = js.undefined
  /**
    * Object data.
    */
  var Body: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Body] = js.undefined
  /**
    * Name of the bucket to which the PUT operation was initiated.
    */
  var Bucket: BucketName
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
    * Size of the body in bytes. This parameter is useful when the size of the body cannot be determined automatically.
    */
  var ContentLength: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ContentLength] = js.undefined
  /**
    * The base64-encoded 128-bit MD5 digest of the part data. This parameter is auto-populated when using the command from the CLI. This parameted is required if object lock parameters are specified.
    */
  var ContentMD5: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ContentMD5] = js.undefined
  /**
    * A standard MIME type describing the format of the object data.
    */
  var ContentType: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ContentType] = js.undefined
  /**
    * The date and time at which the object is no longer cacheable.
    */
  var Expires: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Expires] = js.undefined
  /**
    * Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on the object.
    */
  var GrantFullControl: js.UndefOr[typings.awsDashSdk.clientsS3Mod.GrantFullControl] = js.undefined
  /**
    * Allows grantee to read the object data and its metadata.
    */
  var GrantRead: js.UndefOr[typings.awsDashSdk.clientsS3Mod.GrantRead] = js.undefined
  /**
    * Allows grantee to read the object ACL.
    */
  var GrantReadACP: js.UndefOr[typings.awsDashSdk.clientsS3Mod.GrantReadACP] = js.undefined
  /**
    * Allows grantee to write the ACL for the applicable object.
    */
  var GrantWriteACP: js.UndefOr[typings.awsDashSdk.clientsS3Mod.GrantWriteACP] = js.undefined
  /**
    * Object key for which the PUT operation was initiated.
    */
  var Key: ObjectKey
  /**
    * A map of metadata to store with the object in S3.
    */
  var Metadata: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Metadata] = js.undefined
  /**
    * The Legal Hold status that you want to apply to the specified object.
    */
  var ObjectLockLegalHoldStatus: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ObjectLockLegalHoldStatus] = js.undefined
  /**
    * The object lock mode that you want to apply to this object.
    */
  var ObjectLockMode: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ObjectLockMode] = js.undefined
  /**
    * The date and time when you want this object's object lock to expire.
    */
  var ObjectLockRetainUntilDate: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ObjectLockRetainUntilDate] = js.undefined
  var RequestPayer: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestPayer] = js.undefined
  /**
    * Specifies the algorithm to use to when encrypting the object (e.g., AES256).
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSECustomerAlgorithm] = js.undefined
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side​-encryption​-customer-algorithm header.
    */
  var SSECustomerKey: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSECustomerKey] = js.undefined
  /**
    * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure the encryption key was transmitted without error.
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSECustomerKeyMD5] = js.undefined
  /**
    * Specifies the AWS KMS Encryption Context to use for object encryption. The value of this header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value pairs.
    */
  var SSEKMSEncryptionContext: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSEKMSEncryptionContext] = js.undefined
  /**
    * Specifies the AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS KMS will fail if not made via SSL or using SigV4. Documentation on configuring any of the officially supported AWS SDKs and CLI can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version
    */
  var SSEKMSKeyId: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSEKMSKeyId] = js.undefined
  /**
    * The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).
    */
  var ServerSideEncryption: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ServerSideEncryption] = js.undefined
  /**
    * The type of storage to use for the object. Defaults to 'STANDARD'.
    */
  var StorageClass: js.UndefOr[typings.awsDashSdk.clientsS3Mod.StorageClass] = js.undefined
  /**
    * The tag-set for the object. The tag-set must be encoded as URL Query parameters. (For example, "Key1=Value1")
    */
  var Tagging: js.UndefOr[TaggingHeader] = js.undefined
  /**
    * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
    */
  var WebsiteRedirectLocation: js.UndefOr[typings.awsDashSdk.clientsS3Mod.WebsiteRedirectLocation] = js.undefined
}

object PutObjectRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Key: ObjectKey,
    ACL: ObjectCannedACL = null,
    Body: Body = null,
    CacheControl: CacheControl = null,
    ContentDisposition: ContentDisposition = null,
    ContentEncoding: ContentEncoding = null,
    ContentLanguage: ContentLanguage = null,
    ContentLength: Int | Double = null,
    ContentMD5: ContentMD5 = null,
    ContentType: ContentType = null,
    Expires: Expires = null,
    GrantFullControl: GrantFullControl = null,
    GrantRead: GrantRead = null,
    GrantReadACP: GrantReadACP = null,
    GrantWriteACP: GrantWriteACP = null,
    Metadata: Metadata = null,
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
    WebsiteRedirectLocation: WebsiteRedirectLocation = null
  ): PutObjectRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Key = Key)
    if (ACL != null) __obj.updateDynamic("ACL")(ACL.asInstanceOf[js.Any])
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (CacheControl != null) __obj.updateDynamic("CacheControl")(CacheControl)
    if (ContentDisposition != null) __obj.updateDynamic("ContentDisposition")(ContentDisposition)
    if (ContentEncoding != null) __obj.updateDynamic("ContentEncoding")(ContentEncoding)
    if (ContentLanguage != null) __obj.updateDynamic("ContentLanguage")(ContentLanguage)
    if (ContentLength != null) __obj.updateDynamic("ContentLength")(ContentLength.asInstanceOf[js.Any])
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5)
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType)
    if (Expires != null) __obj.updateDynamic("Expires")(Expires)
    if (GrantFullControl != null) __obj.updateDynamic("GrantFullControl")(GrantFullControl)
    if (GrantRead != null) __obj.updateDynamic("GrantRead")(GrantRead)
    if (GrantReadACP != null) __obj.updateDynamic("GrantReadACP")(GrantReadACP)
    if (GrantWriteACP != null) __obj.updateDynamic("GrantWriteACP")(GrantWriteACP)
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata)
    if (ObjectLockLegalHoldStatus != null) __obj.updateDynamic("ObjectLockLegalHoldStatus")(ObjectLockLegalHoldStatus.asInstanceOf[js.Any])
    if (ObjectLockMode != null) __obj.updateDynamic("ObjectLockMode")(ObjectLockMode.asInstanceOf[js.Any])
    if (ObjectLockRetainUntilDate != null) __obj.updateDynamic("ObjectLockRetainUntilDate")(ObjectLockRetainUntilDate)
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    if (SSECustomerAlgorithm != null) __obj.updateDynamic("SSECustomerAlgorithm")(SSECustomerAlgorithm)
    if (SSECustomerKey != null) __obj.updateDynamic("SSECustomerKey")(SSECustomerKey.asInstanceOf[js.Any])
    if (SSECustomerKeyMD5 != null) __obj.updateDynamic("SSECustomerKeyMD5")(SSECustomerKeyMD5)
    if (SSEKMSEncryptionContext != null) __obj.updateDynamic("SSEKMSEncryptionContext")(SSEKMSEncryptionContext)
    if (SSEKMSKeyId != null) __obj.updateDynamic("SSEKMSKeyId")(SSEKMSKeyId)
    if (ServerSideEncryption != null) __obj.updateDynamic("ServerSideEncryption")(ServerSideEncryption.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (Tagging != null) __obj.updateDynamic("Tagging")(Tagging)
    if (WebsiteRedirectLocation != null) __obj.updateDynamic("WebsiteRedirectLocation")(WebsiteRedirectLocation)
    __obj.asInstanceOf[PutObjectRequest]
  }
}

