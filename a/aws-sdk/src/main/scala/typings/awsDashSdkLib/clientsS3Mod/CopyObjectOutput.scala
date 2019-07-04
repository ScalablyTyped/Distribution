package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyObjectOutput extends js.Object {
  /**
    * 
    */
  var CopyObjectResult: js.UndefOr[CopyObjectResult] = js.undefined
  /**
    * 
    */
  var CopySourceVersionId: js.UndefOr[CopySourceVersionId] = js.undefined
  /**
    * If the object expiration is configured, the response includes this header.
    */
  var Expiration: js.UndefOr[Expiration] = js.undefined
  var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
  /**
    * If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.
    */
  var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined
  /**
    * If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round trip message integrity verification of the customer-provided encryption key.
    */
  var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined
  /**
    * If present, specifies the AWS KMS Encryption Context to use for object encryption. The value of this header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value pairs.
    */
  var SSEKMSEncryptionContext: js.UndefOr[SSEKMSEncryptionContext] = js.undefined
  /**
    * If present, specifies the ID of the AWS Key Management Service (KMS) master encryption key that was used for the object.
    */
  var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined
  /**
    * The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).
    */
  var ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined
  /**
    * Version ID of the newly created copy.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}

object CopyObjectOutput {
  @scala.inline
  def apply(
    CopyObjectResult: CopyObjectResult = null,
    CopySourceVersionId: CopySourceVersionId = null,
    Expiration: Expiration = null,
    RequestCharged: RequestCharged = null,
    SSECustomerAlgorithm: SSECustomerAlgorithm = null,
    SSECustomerKeyMD5: SSECustomerKeyMD5 = null,
    SSEKMSEncryptionContext: SSEKMSEncryptionContext = null,
    SSEKMSKeyId: SSEKMSKeyId = null,
    ServerSideEncryption: ServerSideEncryption = null,
    VersionId: ObjectVersionId = null
  ): CopyObjectOutput = {
    val __obj = js.Dynamic.literal()
    if (CopyObjectResult != null) __obj.updateDynamic("CopyObjectResult")(CopyObjectResult)
    if (CopySourceVersionId != null) __obj.updateDynamic("CopySourceVersionId")(CopySourceVersionId)
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration)
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    if (SSECustomerAlgorithm != null) __obj.updateDynamic("SSECustomerAlgorithm")(SSECustomerAlgorithm)
    if (SSECustomerKeyMD5 != null) __obj.updateDynamic("SSECustomerKeyMD5")(SSECustomerKeyMD5)
    if (SSEKMSEncryptionContext != null) __obj.updateDynamic("SSEKMSEncryptionContext")(SSEKMSEncryptionContext)
    if (SSEKMSKeyId != null) __obj.updateDynamic("SSEKMSKeyId")(SSEKMSKeyId)
    if (ServerSideEncryption != null) __obj.updateDynamic("ServerSideEncryption")(ServerSideEncryption.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[CopyObjectOutput]
  }
}

