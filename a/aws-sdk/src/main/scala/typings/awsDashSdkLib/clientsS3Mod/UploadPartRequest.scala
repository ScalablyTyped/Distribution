package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadPartRequest extends js.Object {
  /**
    * Object data.
    */
  var Body: js.UndefOr[Body] = js.undefined
  /**
    * Name of the bucket to which the multipart upload was initiated.
    */
  var Bucket: BucketName
  /**
    * Size of the body in bytes. This parameter is useful when the size of the body cannot be determined automatically.
    */
  var ContentLength: js.UndefOr[ContentLength] = js.undefined
  /**
    * The base64-encoded 128-bit MD5 digest of the part data.
    */
  var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
  /**
    * Object key for which the multipart upload was initiated.
    */
  var Key: ObjectKey
  /**
    * Part number of part being uploaded. This is a positive integer between 1 and 10,000.
    */
  var PartNumber: awsDashSdkLib.clientsS3Mod.PartNumber
  var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
  /**
    * Specifies the algorithm to use to when encrypting the object (e.g., AES256).
    */
  var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side​-encryption​-customer-algorithm header. This must be the same encryption key specified in the initiate multipart upload request.
    */
  var SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined
  /**
    * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure the encryption key was transmitted without error.
    */
  var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined
  /**
    * Upload ID identifying the multipart upload whose part is being uploaded.
    */
  var UploadId: MultipartUploadId
}

object UploadPartRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Key: ObjectKey,
    PartNumber: PartNumber,
    UploadId: MultipartUploadId,
    Body: Body = null,
    ContentLength: js.UndefOr[ContentLength] = js.undefined,
    ContentMD5: ContentMD5 = null,
    RequestPayer: RequestPayer = null,
    SSECustomerAlgorithm: SSECustomerAlgorithm = null,
    SSECustomerKey: SSECustomerKey = null,
    SSECustomerKeyMD5: SSECustomerKeyMD5 = null
  ): UploadPartRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Key = Key, PartNumber = PartNumber, UploadId = UploadId)
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (!js.isUndefined(ContentLength)) __obj.updateDynamic("ContentLength")(ContentLength)
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5)
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    if (SSECustomerAlgorithm != null) __obj.updateDynamic("SSECustomerAlgorithm")(SSECustomerAlgorithm)
    if (SSECustomerKey != null) __obj.updateDynamic("SSECustomerKey")(SSECustomerKey.asInstanceOf[js.Any])
    if (SSECustomerKeyMD5 != null) __obj.updateDynamic("SSECustomerKeyMD5")(SSECustomerKeyMD5)
    __obj.asInstanceOf[UploadPartRequest]
  }
}

