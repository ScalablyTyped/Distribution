package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateKeyResponse extends js.Object {
  /**
    * Metadata associated with the CMK.
    */
  var KeyMetadata: js.UndefOr[typings.awsDashSdk.clientsKmsMod.KeyMetadata] = js.undefined
}

object CreateKeyResponse {
  @scala.inline
  def apply(KeyMetadata: KeyMetadata = null): CreateKeyResponse = {
    val __obj = js.Dynamic.literal()
    if (KeyMetadata != null) __obj.updateDynamic("KeyMetadata")(KeyMetadata)
    __obj.asInstanceOf[CreateKeyResponse]
  }
}

