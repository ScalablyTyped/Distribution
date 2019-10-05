package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateKeyPairRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * A unique name for the key pair. Constraints: Up to 255 ASCII characters
    */
  var KeyName: String
}

object CreateKeyPairRequest {
  @scala.inline
  def apply(KeyName: String, DryRun: js.UndefOr[scala.Boolean] = js.undefined): CreateKeyPairRequest = {
    val __obj = js.Dynamic.literal(KeyName = KeyName)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[CreateKeyPairRequest]
  }
}

