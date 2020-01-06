package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachNetworkInterfaceRequest extends js.Object {
  /**
    * The index of the device for the network interface attachment.
    */
  var DeviceIndex: Integer = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: typings.awsDashSdk.clientsEc2Mod.InstanceId = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typings.awsDashSdk.clientsEc2Mod.NetworkInterfaceId = js.native
}

object AttachNetworkInterfaceRequest {
  @scala.inline
  def apply(
    DeviceIndex: Integer,
    InstanceId: InstanceId,
    NetworkInterfaceId: NetworkInterfaceId,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): AttachNetworkInterfaceRequest = {
    val __obj = js.Dynamic.literal(DeviceIndex = DeviceIndex.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachNetworkInterfaceRequest]
  }
}

