package typings
package awsDashSdkLib.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateDataKeyWithoutPlaintextResponse extends js.Object {
  /**
    * The encrypted data key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded.
    */
  var CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined
  /**
    * The identifier of the CMK that encrypted the data key.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
}

object GenerateDataKeyWithoutPlaintextResponse {
  @scala.inline
  def apply(CiphertextBlob: CiphertextType = null, KeyId: KeyIdType = null): GenerateDataKeyWithoutPlaintextResponse = {
    val __obj = js.Dynamic.literal()
    if (CiphertextBlob != null) __obj.updateDynamic("CiphertextBlob")(CiphertextBlob.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId)
    __obj.asInstanceOf[GenerateDataKeyWithoutPlaintextResponse]
  }
}

