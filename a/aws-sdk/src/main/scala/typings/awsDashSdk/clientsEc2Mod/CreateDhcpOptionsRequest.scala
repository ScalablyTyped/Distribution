package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDhcpOptionsRequest extends js.Object {
  /**
    * A DHCP configuration option.
    */
  var DhcpConfigurations: NewDhcpConfigurationList
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}

object CreateDhcpOptionsRequest {
  @scala.inline
  def apply(DhcpConfigurations: NewDhcpConfigurationList, DryRun: js.UndefOr[Boolean] = js.undefined): CreateDhcpOptionsRequest = {
    val __obj = js.Dynamic.literal(DhcpConfigurations = DhcpConfigurations)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[CreateDhcpOptionsRequest]
  }
}

