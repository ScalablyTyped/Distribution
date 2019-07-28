package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutObjectOutput extends js.Object {
  /**
    * Entity tag for the uploaded object.
    */
  var ETag: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ETag] = js.undefined
  /**
    * If the object expiration is configured, this will contain the expiration date (expiry-date) and rule ID (rule-id). The value of rule-id is URL encoded.
    */
  var Expiration: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Expiration] = js.undefined
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
    * Version of the object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}

object PutObjectOutput {
  @scala.inline
  def apply(
    ETag: ETag = null,
    Expiration: Expiration = null,
    RequestCharged: RequestCharged = null,
    SSECustomerAlgorithm: SSECustomerAlgorithm = null,
    SSECustomerKeyMD5: SSECustomerKeyMD5 = null,
    SSEKMSEncryptionContext: SSEKMSEncryptionContext = null,
    SSEKMSKeyId: SSEKMSKeyId = null,
    ServerSideEncryption: ServerSideEncryption = null,
    VersionId: ObjectVersionId = null
  ): PutObjectOutput = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration)
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    if (SSECustomerAlgorithm != null) __obj.updateDynamic("SSECustomerAlgorithm")(SSECustomerAlgorithm)
    if (SSECustomerKeyMD5 != null) __obj.updateDynamic("SSECustomerKeyMD5")(SSECustomerKeyMD5)
    if (SSEKMSEncryptionContext != null) __obj.updateDynamic("SSEKMSEncryptionContext")(SSEKMSEncryptionContext)
    if (SSEKMSKeyId != null) __obj.updateDynamic("SSEKMSKeyId")(SSEKMSKeyId)
    if (ServerSideEncryption != null) __obj.updateDynamic("ServerSideEncryption")(ServerSideEncryption.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[PutObjectOutput]
  }
}

