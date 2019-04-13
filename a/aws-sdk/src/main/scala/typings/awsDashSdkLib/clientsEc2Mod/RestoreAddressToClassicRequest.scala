package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreAddressToClassicRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The Elastic IP address.
    */
  var PublicIp: String
}

object RestoreAddressToClassicRequest {
  @scala.inline
  def apply(PublicIp: String, DryRun: js.UndefOr[Boolean] = js.undefined): RestoreAddressToClassicRequest = {
    val __obj = js.Dynamic.literal(PublicIp = PublicIp)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[RestoreAddressToClassicRequest]
  }
}

