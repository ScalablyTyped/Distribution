package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMultipartUploadOutput extends js.Object {
  /**
    * Date when multipart upload will become eligible for abort operation by lifecycle.
    */
  var AbortDate: js.UndefOr[typings.awsDashSdk.clientsS3Mod.AbortDate] = js.undefined
  /**
    * Id of the lifecycle rule that makes a multipart upload eligible for abort operation.
    */
  var AbortRuleId: js.UndefOr[typings.awsDashSdk.clientsS3Mod.AbortRuleId] = js.undefined
  /**
    * Name of the bucket to which the multipart upload was initiated.
    */
  var Bucket: js.UndefOr[BucketName] = js.undefined
  /**
    * Object key for which the multipart upload was initiated.
    */
  var Key: js.UndefOr[ObjectKey] = js.undefined
  var RequestCharged: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestCharged] = js.undefined
  /**
    * If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSECustomerAlgorithm] = js.undefined
  /**
    * If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round trip message integrity verification of the customer-provided encryption key.
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSECustomerKeyMD5] = js.undefined
  /**
    * If present, specifies the AWS KMS Encryption Context to use for object encryption. The value of this header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value pairs.
    */
  var SSEKMSEncryptionContext: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSEKMSEncryptionContext] = js.undefined
  /**
    * If present, specifies the ID of the AWS Key Management Service (KMS) master encryption key that was used for the object.
    */
  var SSEKMSKeyId: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSEKMSKeyId] = js.undefined
  /**
    * The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).
    */
  var ServerSideEncryption: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ServerSideEncryption] = js.undefined
  /**
    * ID for the initiated multipart upload.
    */
  var UploadId: js.UndefOr[MultipartUploadId] = js.undefined
}

object CreateMultipartUploadOutput {
  @scala.inline
  def apply(
    AbortDate: AbortDate = null,
    AbortRuleId: AbortRuleId = null,
    Bucket: BucketName = null,
    Key: ObjectKey = null,
    RequestCharged: RequestCharged = null,
    SSECustomerAlgorithm: SSECustomerAlgorithm = null,
    SSECustomerKeyMD5: SSECustomerKeyMD5 = null,
    SSEKMSEncryptionContext: SSEKMSEncryptionContext = null,
    SSEKMSKeyId: SSEKMSKeyId = null,
    ServerSideEncryption: ServerSideEncryption = null,
    UploadId: MultipartUploadId = null
  ): CreateMultipartUploadOutput = {
    val __obj = js.Dynamic.literal()
    if (AbortDate != null) __obj.updateDynamic("AbortDate")(AbortDate)
    if (AbortRuleId != null) __obj.updateDynamic("AbortRuleId")(AbortRuleId)
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    if (SSECustomerAlgorithm != null) __obj.updateDynamic("SSECustomerAlgorithm")(SSECustomerAlgorithm)
    if (SSECustomerKeyMD5 != null) __obj.updateDynamic("SSECustomerKeyMD5")(SSECustomerKeyMD5)
    if (SSEKMSEncryptionContext != null) __obj.updateDynamic("SSEKMSEncryptionContext")(SSEKMSEncryptionContext)
    if (SSEKMSKeyId != null) __obj.updateDynamic("SSEKMSKeyId")(SSEKMSKeyId)
    if (ServerSideEncryption != null) __obj.updateDynamic("ServerSideEncryption")(ServerSideEncryption.asInstanceOf[js.Any])
    if (UploadId != null) __obj.updateDynamic("UploadId")(UploadId)
    __obj.asInstanceOf[CreateMultipartUploadOutput]
  }
}

