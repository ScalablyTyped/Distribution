package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelKeyDeletionResponse extends js.Object {
  /**
    * The unique identifier of the master key for which deletion is canceled.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
}

object CancelKeyDeletionResponse {
  @scala.inline
  def apply(KeyId: KeyIdType = null): CancelKeyDeletionResponse = {
    val __obj = js.Dynamic.literal()
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId)
    __obj.asInstanceOf[CancelKeyDeletionResponse]
  }
}

