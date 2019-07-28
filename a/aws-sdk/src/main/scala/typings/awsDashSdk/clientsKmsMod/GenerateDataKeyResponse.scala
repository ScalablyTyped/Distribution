package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateDataKeyResponse extends js.Object {
  /**
    * The encrypted copy of the data key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded.
    */
  var CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined
  /**
    * The identifier of the CMK that encrypted the data key.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
  /**
    * The plaintext data key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded. Use this data key to encrypt your data outside of KMS. Then, remove it from memory as soon as possible.
    */
  var Plaintext: js.UndefOr[PlaintextType] = js.undefined
}

object GenerateDataKeyResponse {
  @scala.inline
  def apply(CiphertextBlob: CiphertextType = null, KeyId: KeyIdType = null, Plaintext: PlaintextType = null): GenerateDataKeyResponse = {
    val __obj = js.Dynamic.literal()
    if (CiphertextBlob != null) __obj.updateDynamic("CiphertextBlob")(CiphertextBlob.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId)
    if (Plaintext != null) __obj.updateDynamic("Plaintext")(Plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateDataKeyResponse]
  }
}

