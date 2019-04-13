package typings
package awsDashSdkLib.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecryptResponse extends js.Object {
  /**
    * ARN of the key used to perform the decryption. This value is returned if no errors are encountered during the operation.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
  /**
    * Decrypted plaintext data. When you use the HTTP API or the AWS CLI, the value is Base64-encdoded. Otherwise, it is not encoded.
    */
  var Plaintext: js.UndefOr[PlaintextType] = js.undefined
}

object DecryptResponse {
  @scala.inline
  def apply(KeyId: KeyIdType = null, Plaintext: PlaintextType = null): DecryptResponse = {
    val __obj = js.Dynamic.literal()
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId)
    if (Plaintext != null) __obj.updateDynamic("Plaintext")(Plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptResponse]
  }
}

