package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalGatewayVirtualInterfaceGroup extends js.Object {
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[String] = js.native
  /**
    * The ID of the virtual interface group.
    */
  var LocalGatewayVirtualInterfaceGroupId: js.UndefOr[String] = js.native
  /**
    * The IDs of the virtual interfaces.
    */
  var LocalGatewayVirtualInterfaceIds: js.UndefOr[LocalGatewayVirtualInterfaceIdSet] = js.native
}

object LocalGatewayVirtualInterfaceGroup {
  @scala.inline
  def apply(
    LocalGatewayId: String = null,
    LocalGatewayVirtualInterfaceGroupId: String = null,
    LocalGatewayVirtualInterfaceIds: LocalGatewayVirtualInterfaceIdSet = null
  ): LocalGatewayVirtualInterfaceGroup = {
    val __obj = js.Dynamic.literal()
    if (LocalGatewayId != null) __obj.updateDynamic("LocalGatewayId")(LocalGatewayId.asInstanceOf[js.Any])
    if (LocalGatewayVirtualInterfaceGroupId != null) __obj.updateDynamic("LocalGatewayVirtualInterfaceGroupId")(LocalGatewayVirtualInterfaceGroupId.asInstanceOf[js.Any])
    if (LocalGatewayVirtualInterfaceIds != null) __obj.updateDynamic("LocalGatewayVirtualInterfaceIds")(LocalGatewayVirtualInterfaceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalGatewayVirtualInterfaceGroup]
  }
}

