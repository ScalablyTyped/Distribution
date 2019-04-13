package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteKeyPairRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the key pair.
    */
  var KeyName: String
}

object DeleteKeyPairRequest {
  @scala.inline
  def apply(KeyName: String, DryRun: js.UndefOr[Boolean] = js.undefined): DeleteKeyPairRequest = {
    val __obj = js.Dynamic.literal(KeyName = KeyName)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DeleteKeyPairRequest]
  }
}

