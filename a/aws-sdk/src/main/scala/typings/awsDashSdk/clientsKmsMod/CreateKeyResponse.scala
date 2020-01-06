package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateKeyResponse extends js.Object {
  /**
    * Metadata associated with the CMK.
    */
  var KeyMetadata: js.UndefOr[typings.awsDashSdk.clientsKmsMod.KeyMetadata] = js.native
}

object CreateKeyResponse {
  @scala.inline
  def apply(KeyMetadata: KeyMetadata = null): CreateKeyResponse = {
    val __obj = js.Dynamic.literal()
    if (KeyMetadata != null) __obj.updateDynamic("KeyMetadata")(KeyMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeyResponse]
  }
}

