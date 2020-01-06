package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptResponse extends js.Object {
  /**
    * The encrypted plaintext. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var CiphertextBlob: js.UndefOr[CiphertextType] = js.native
  /**
    * The encryption algorithm that was used to encrypt the plaintext.
    */
  var EncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec] = js.native
  /**
    * The ID of the key used during encryption.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
}

object EncryptResponse {
  @scala.inline
  def apply(
    CiphertextBlob: CiphertextType = null,
    EncryptionAlgorithm: EncryptionAlgorithmSpec = null,
    KeyId: KeyIdType = null
  ): EncryptResponse = {
    val __obj = js.Dynamic.literal()
    if (CiphertextBlob != null) __obj.updateDynamic("CiphertextBlob")(CiphertextBlob.asInstanceOf[js.Any])
    if (EncryptionAlgorithm != null) __obj.updateDynamic("EncryptionAlgorithm")(EncryptionAlgorithm.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptResponse]
  }
}

