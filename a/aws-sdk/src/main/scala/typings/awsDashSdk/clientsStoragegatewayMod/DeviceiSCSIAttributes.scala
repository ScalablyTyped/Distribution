package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceiSCSIAttributes extends js.Object {
  /**
    * Indicates whether mutual CHAP is enabled for the iSCSI target.
    */
  var ChapEnabled: js.UndefOr[scala.Boolean] = js.native
  /**
    * The network interface identifier of the VTL device.
    */
  var NetworkInterfaceId: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.NetworkInterfaceId] = js.native
  /**
    * The port used to communicate with iSCSI VTL device targets.
    */
  var NetworkInterfacePort: js.UndefOr[integer] = js.native
  /**
    * Specifies the unique Amazon Resource Name (ARN) that encodes the iSCSI qualified name(iqn) of a tape drive or media changer target.
    */
  var TargetARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.TargetARN] = js.native
}

object DeviceiSCSIAttributes {
  @scala.inline
  def apply(
    ChapEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    NetworkInterfaceId: NetworkInterfaceId = null,
    NetworkInterfacePort: Int | Double = null,
    TargetARN: TargetARN = null
  ): DeviceiSCSIAttributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ChapEnabled)) __obj.updateDynamic("ChapEnabled")(ChapEnabled.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    if (NetworkInterfacePort != null) __obj.updateDynamic("NetworkInterfacePort")(NetworkInterfacePort.asInstanceOf[js.Any])
    if (TargetARN != null) __obj.updateDynamic("TargetARN")(TargetARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceiSCSIAttributes]
  }
}

