package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPublicKeyResponse extends js.Object {
  /**
    * The type of the of the public key that was downloaded.
    */
  var CustomerMasterKeySpec: js.UndefOr[typings.awsDashSdk.clientsKmsMod.CustomerMasterKeySpec] = js.native
  /**
    * The encryption algorithms that AWS KMS supports for this key.  This information is critical. If a public key encrypts data outside of AWS KMS by using an unsupported encryption algorithm, the ciphertext cannot be decrypted.  This field appears in the response only when the KeyUsage of the public key is ENCRYPT_DECRYPT.
    */
  var EncryptionAlgorithms: js.UndefOr[EncryptionAlgorithmSpecList] = js.native
  /**
    * The identifier of the asymmetric CMK from which the public key was downloaded.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  /**
    * The permitted use of the public key. Valid values are ENCRYPT_DECRYPT or SIGN_VERIFY.  This information is critical. If a public key with SIGN_VERIFY key usage encrypts data outside of AWS KMS, the ciphertext cannot be decrypted. 
    */
  var KeyUsage: js.UndefOr[KeyUsageType] = js.native
  /**
    * The exported public key.  This value is returned as a binary Distinguished Encoding Rules (DER)-encoded object. To decode it, use an ASN.1 parsing tool, such as OpenSSL asn1parse.
    */
  var PublicKey: js.UndefOr[PublicKeyType] = js.native
  /**
    * The signing algorithms that AWS KMS supports for this key. This field appears in the response only when the KeyUsage of the public key is SIGN_VERIFY.
    */
  var SigningAlgorithms: js.UndefOr[SigningAlgorithmSpecList] = js.native
}

object GetPublicKeyResponse {
  @scala.inline
  def apply(
    CustomerMasterKeySpec: CustomerMasterKeySpec = null,
    EncryptionAlgorithms: EncryptionAlgorithmSpecList = null,
    KeyId: KeyIdType = null,
    KeyUsage: KeyUsageType = null,
    PublicKey: PublicKeyType = null,
    SigningAlgorithms: SigningAlgorithmSpecList = null
  ): GetPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    if (CustomerMasterKeySpec != null) __obj.updateDynamic("CustomerMasterKeySpec")(CustomerMasterKeySpec.asInstanceOf[js.Any])
    if (EncryptionAlgorithms != null) __obj.updateDynamic("EncryptionAlgorithms")(EncryptionAlgorithms.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    if (KeyUsage != null) __obj.updateDynamic("KeyUsage")(KeyUsage.asInstanceOf[js.Any])
    if (PublicKey != null) __obj.updateDynamic("PublicKey")(PublicKey.asInstanceOf[js.Any])
    if (SigningAlgorithms != null) __obj.updateDynamic("SigningAlgorithms")(SigningAlgorithms.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPublicKeyResponse]
  }
}

