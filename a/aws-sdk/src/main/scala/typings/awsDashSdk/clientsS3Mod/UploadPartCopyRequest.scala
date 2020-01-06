package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadPartCopyRequest extends js.Object {
  /**
    * The bucket name.
    */
  var Bucket: BucketName = js.native
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
    * The range of bytes to copy from the source object. The range value must use the form bytes=first-last, where the first and last are the zero-based byte offsets to copy. For example, bytes=0-9 indicates that you want to copy the first 10 bytes of the source. You can copy a range only if the source object is greater than 5 MB.
    */
  var CopySourceRange: js.UndefOr[typings.awsDashSdk.clientsS3Mod.CopySourceRange] = js.native
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
    * Object key for which the multipart upload was initiated.
    */
  var Key: ObjectKey = js.native
  /**
    * Part number of part being copied. This is a positive integer between 1 and 10,000.
    */
  var PartNumber: typings.awsDashSdk.clientsS3Mod.PartNumber = js.native
  var RequestPayer: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestPayer] = js.native
  /**
    * Specifies the algorithm to use to when encrypting the object (for example, AES256).
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSECustomerAlgorithm] = js.native
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon S3 does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side​-encryption​-customer-algorithm header. This must be the same encryption key specified in the initiate multipart upload request.
    */
  var SSECustomerKey: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSECustomerKey] = js.native
  /**
    * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure that the encryption key was transmitted without error.
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSECustomerKeyMD5] = js.native
  /**
    * Upload ID identifying the multipart upload whose part is being copied.
    */
  var UploadId: MultipartUploadId = js.native
}

object UploadPartCopyRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    CopySource: CopySource,
    Key: ObjectKey,
    PartNumber: PartNumber,
    UploadId: MultipartUploadId,
    CopySourceIfMatch: CopySourceIfMatch = null,
    CopySourceIfModifiedSince: CopySourceIfModifiedSince = null,
    CopySourceIfNoneMatch: CopySourceIfNoneMatch = null,
    CopySourceIfUnmodifiedSince: CopySourceIfUnmodifiedSince = null,
    CopySourceRange: CopySourceRange = null,
    CopySourceSSECustomerAlgorithm: CopySourceSSECustomerAlgorithm = null,
    CopySourceSSECustomerKey: CopySourceSSECustomerKey = null,
    CopySourceSSECustomerKeyMD5: CopySourceSSECustomerKeyMD5 = null,
    RequestPayer: RequestPayer = null,
    SSECustomerAlgorithm: SSECustomerAlgorithm = null,
    SSECustomerKey: SSECustomerKey = null,
    SSECustomerKeyMD5: SSECustomerKeyMD5 = null
  ): UploadPartCopyRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CopySource = CopySource.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], PartNumber = PartNumber.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
    if (CopySourceIfMatch != null) __obj.updateDynamic("CopySourceIfMatch")(CopySourceIfMatch.asInstanceOf[js.Any])
    if (CopySourceIfModifiedSince != null) __obj.updateDynamic("CopySourceIfModifiedSince")(CopySourceIfModifiedSince.asInstanceOf[js.Any])
    if (CopySourceIfNoneMatch != null) __obj.updateDynamic("CopySourceIfNoneMatch")(CopySourceIfNoneMatch.asInstanceOf[js.Any])
    if (CopySourceIfUnmodifiedSince != null) __obj.updateDynamic("CopySourceIfUnmodifiedSince")(CopySourceIfUnmodifiedSince.asInstanceOf[js.Any])
    if (CopySourceRange != null) __obj.updateDynamic("CopySourceRange")(CopySourceRange.asInstanceOf[js.Any])
    if (CopySourceSSECustomerAlgorithm != null) __obj.updateDynamic("CopySourceSSECustomerAlgorithm")(CopySourceSSECustomerAlgorithm.asInstanceOf[js.Any])
    if (CopySourceSSECustomerKey != null) __obj.updateDynamic("CopySourceSSECustomerKey")(CopySourceSSECustomerKey.asInstanceOf[js.Any])
    if (CopySourceSSECustomerKeyMD5 != null) __obj.updateDynamic("CopySourceSSECustomerKeyMD5")(CopySourceSSECustomerKeyMD5.asInstanceOf[js.Any])
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    if (SSECustomerAlgorithm != null) __obj.updateDynamic("SSECustomerAlgorithm")(SSECustomerAlgorithm.asInstanceOf[js.Any])
    if (SSECustomerKey != null) __obj.updateDynamic("SSECustomerKey")(SSECustomerKey.asInstanceOf[js.Any])
    if (SSECustomerKeyMD5 != null) __obj.updateDynamic("SSECustomerKeyMD5")(SSECustomerKeyMD5.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadPartCopyRequest]
  }
}

