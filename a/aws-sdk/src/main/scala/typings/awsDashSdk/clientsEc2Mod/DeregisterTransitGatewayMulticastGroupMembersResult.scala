package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterTransitGatewayMulticastGroupMembersResult extends js.Object {
  /**
    * Information about the deregistered members.
    */
  var DeregisteredMulticastGroupMembers: js.UndefOr[TransitGatewayMulticastDeregisteredGroupMembers] = js.native
}

object DeregisterTransitGatewayMulticastGroupMembersResult {
  @scala.inline
  def apply(DeregisteredMulticastGroupMembers: TransitGatewayMulticastDeregisteredGroupMembers = null): DeregisterTransitGatewayMulticastGroupMembersResult = {
    val __obj = js.Dynamic.literal()
    if (DeregisteredMulticastGroupMembers != null) __obj.updateDynamic("DeregisteredMulticastGroupMembers")(DeregisteredMulticastGroupMembers.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterTransitGatewayMulticastGroupMembersResult]
  }
}

