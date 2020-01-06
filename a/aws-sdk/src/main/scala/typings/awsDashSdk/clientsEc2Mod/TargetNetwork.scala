package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetNetwork extends js.Object {
  /**
    * The ID of the association.
    */
  var AssociationId: js.UndefOr[String] = js.native
  /**
    * The ID of the Client VPN endpoint with which the target network is associated.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.native
  /**
    * The IDs of the security groups applied to the target network association.
    */
  var SecurityGroups: js.UndefOr[ValueStringList] = js.native
  /**
    * The current state of the target network association.
    */
  var Status: js.UndefOr[AssociationStatus] = js.native
  /**
    * The ID of the subnet specified as the target network.
    */
  var TargetNetworkId: js.UndefOr[String] = js.native
  /**
    * The ID of the VPC in which the target network (subnet) is located.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object TargetNetwork {
  @scala.inline
  def apply(
    AssociationId: String = null,
    ClientVpnEndpointId: String = null,
    SecurityGroups: ValueStringList = null,
    Status: AssociationStatus = null,
    TargetNetworkId: String = null,
    VpcId: String = null
  ): TargetNetwork = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId.asInstanceOf[js.Any])
    if (ClientVpnEndpointId != null) __obj.updateDynamic("ClientVpnEndpointId")(ClientVpnEndpointId.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TargetNetworkId != null) __obj.updateDynamic("TargetNetworkId")(TargetNetworkId.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetNetwork]
  }
}

