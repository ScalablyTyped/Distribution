package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptResponse extends js.Object {
  /**
    * The encrypted plaintext. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded.
    */
  var CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined
  /**
    * The ID of the key used during encryption.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
}

object EncryptResponse {
  @scala.inline
  def apply(CiphertextBlob: CiphertextType = null, KeyId: KeyIdType = null): EncryptResponse = {
    val __obj = js.Dynamic.literal()
    if (CiphertextBlob != null) __obj.updateDynamic("CiphertextBlob")(CiphertextBlob.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId)
    __obj.asInstanceOf[EncryptResponse]
  }
}

