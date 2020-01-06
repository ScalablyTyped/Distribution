package typings.awsDashSdk.clientsNetworkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkAssociation extends js.Object {
  /**
    * The device ID for the link association.
    */
  var DeviceId: js.UndefOr[String] = js.native
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[String] = js.native
  /**
    * The state of the association.
    */
  var LinkAssociationState: js.UndefOr[typings.awsDashSdk.clientsNetworkmanagerMod.LinkAssociationState] = js.native
  /**
    * The ID of the link.
    */
  var LinkId: js.UndefOr[String] = js.native
}

object LinkAssociation {
  @scala.inline
  def apply(
    DeviceId: String = null,
    GlobalNetworkId: String = null,
    LinkAssociationState: LinkAssociationState = null,
    LinkId: String = null
  ): LinkAssociation = {
    val __obj = js.Dynamic.literal()
    if (DeviceId != null) __obj.updateDynamic("DeviceId")(DeviceId.asInstanceOf[js.Any])
    if (GlobalNetworkId != null) __obj.updateDynamic("GlobalNetworkId")(GlobalNetworkId.asInstanceOf[js.Any])
    if (LinkAssociationState != null) __obj.updateDynamic("LinkAssociationState")(LinkAssociationState.asInstanceOf[js.Any])
    if (LinkId != null) __obj.updateDynamic("LinkId")(LinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkAssociation]
  }
}

