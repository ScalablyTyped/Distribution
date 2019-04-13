package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachNetworkInterfaceRequest extends js.Object {
  /**
    * The index of the device for the network interface attachment.
    */
  var DeviceIndex: Integer
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: String
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: String
}

object AttachNetworkInterfaceRequest {
  @scala.inline
  def apply(
    DeviceIndex: Integer,
    InstanceId: String,
    NetworkInterfaceId: String,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): AttachNetworkInterfaceRequest = {
    val __obj = js.Dynamic.literal(DeviceIndex = DeviceIndex, InstanceId = InstanceId, NetworkInterfaceId = NetworkInterfaceId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[AttachNetworkInterfaceRequest]
  }
}

