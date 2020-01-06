package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetKeyRotationStatusResponse extends js.Object {
  /**
    * A Boolean value that specifies whether key rotation is enabled.
    */
  var KeyRotationEnabled: js.UndefOr[BooleanType] = js.native
}

object GetKeyRotationStatusResponse {
  @scala.inline
  def apply(KeyRotationEnabled: js.UndefOr[Boolean] = js.undefined): GetKeyRotationStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(KeyRotationEnabled)) __obj.updateDynamic("KeyRotationEnabled")(KeyRotationEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyRotationStatusResponse]
  }
}

