package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReEncryptResponse extends js.Object {
  /**
    * The reencrypted data. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded.
    */
  var CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined
  /**
    * Unique identifier of the CMK used to reencrypt the data.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
  /**
    * Unique identifier of the CMK used to originally encrypt the data.
    */
  var SourceKeyId: js.UndefOr[KeyIdType] = js.undefined
}

object ReEncryptResponse {
  @scala.inline
  def apply(CiphertextBlob: CiphertextType = null, KeyId: KeyIdType = null, SourceKeyId: KeyIdType = null): ReEncryptResponse = {
    val __obj = js.Dynamic.literal()
    if (CiphertextBlob != null) __obj.updateDynamic("CiphertextBlob")(CiphertextBlob.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId)
    if (SourceKeyId != null) __obj.updateDynamic("SourceKeyId")(SourceKeyId)
    __obj.asInstanceOf[ReEncryptResponse]
  }
}

