package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetNetworkInterfaceAttributeRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: String
  /**
    * The source/destination checking attribute. Resets the value to true.
    */
  var SourceDestCheck: js.UndefOr[String] = js.undefined
}

object ResetNetworkInterfaceAttributeRequest {
  @scala.inline
  def apply(
    NetworkInterfaceId: String,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    SourceDestCheck: String = null
  ): ResetNetworkInterfaceAttributeRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (SourceDestCheck != null) __obj.updateDynamic("SourceDestCheck")(SourceDestCheck)
    __obj.asInstanceOf[ResetNetworkInterfaceAttributeRequest]
  }
}

