package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteNetworkInterfaceRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: String
}

object DeleteNetworkInterfaceRequest {
  @scala.inline
  def apply(NetworkInterfaceId: String, DryRun: js.UndefOr[Boolean] = js.undefined): DeleteNetworkInterfaceRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DeleteNetworkInterfaceRequest]
  }
}

