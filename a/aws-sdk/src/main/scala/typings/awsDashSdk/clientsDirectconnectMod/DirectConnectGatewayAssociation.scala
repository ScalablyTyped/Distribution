package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectConnectGatewayAssociation extends js.Object {
  /**
    * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
    */
  var allowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
  /**
    * Information about the associated gateway.
    */
  var associatedGateway: js.UndefOr[AssociatedGateway] = js.native
  /**
    * The ID of the Direct Connect gateway association.
    */
  var associationId: js.UndefOr[DirectConnectGatewayAssociationId] = js.native
  /**
    * The state of the association. The following are the possible values:    associating: The initial state after calling CreateDirectConnectGatewayAssociation.    associated: The Direct Connect gateway and virtual private gateway or transit gateway are successfully associated and ready to pass traffic.    disassociating: The initial state after calling DeleteDirectConnectGatewayAssociation.    disassociated: The virtual private gateway or transit gateway is disassociated from the Direct Connect gateway. Traffic flow between the Direct Connect gateway and virtual private gateway or transit gateway is stopped.  
    */
  var associationState: js.UndefOr[DirectConnectGatewayAssociationState] = js.native
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.native
  /**
    * The ID of the AWS account that owns the associated gateway.
    */
  var directConnectGatewayOwnerAccount: js.UndefOr[OwnerAccount] = js.native
  /**
    * The error message if the state of an object failed to advance.
    */
  var stateChangeError: js.UndefOr[StateChangeError] = js.native
  /**
    * The ID of the virtual private gateway. Applies only to private virtual interfaces.
    */
  var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.native
  /**
    * The ID of the AWS account that owns the virtual private gateway.
    */
  var virtualGatewayOwnerAccount: js.UndefOr[OwnerAccount] = js.native
  /**
    * The AWS Region where the virtual private gateway is located.
    */
  var virtualGatewayRegion: js.UndefOr[VirtualGatewayRegion] = js.native
}

object DirectConnectGatewayAssociation {
  @scala.inline
  def apply(
    allowedPrefixesToDirectConnectGateway: RouteFilterPrefixList = null,
    associatedGateway: AssociatedGateway = null,
    associationId: DirectConnectGatewayAssociationId = null,
    associationState: DirectConnectGatewayAssociationState = null,
    directConnectGatewayId: DirectConnectGatewayId = null,
    directConnectGatewayOwnerAccount: OwnerAccount = null,
    stateChangeError: StateChangeError = null,
    virtualGatewayId: VirtualGatewayId = null,
    virtualGatewayOwnerAccount: OwnerAccount = null,
    virtualGatewayRegion: VirtualGatewayRegion = null
  ): DirectConnectGatewayAssociation = {
    val __obj = js.Dynamic.literal()
    if (allowedPrefixesToDirectConnectGateway != null) __obj.updateDynamic("allowedPrefixesToDirectConnectGateway")(allowedPrefixesToDirectConnectGateway.asInstanceOf[js.Any])
    if (associatedGateway != null) __obj.updateDynamic("associatedGateway")(associatedGateway.asInstanceOf[js.Any])
    if (associationId != null) __obj.updateDynamic("associationId")(associationId.asInstanceOf[js.Any])
    if (associationState != null) __obj.updateDynamic("associationState")(associationState.asInstanceOf[js.Any])
    if (directConnectGatewayId != null) __obj.updateDynamic("directConnectGatewayId")(directConnectGatewayId.asInstanceOf[js.Any])
    if (directConnectGatewayOwnerAccount != null) __obj.updateDynamic("directConnectGatewayOwnerAccount")(directConnectGatewayOwnerAccount.asInstanceOf[js.Any])
    if (stateChangeError != null) __obj.updateDynamic("stateChangeError")(stateChangeError.asInstanceOf[js.Any])
    if (virtualGatewayId != null) __obj.updateDynamic("virtualGatewayId")(virtualGatewayId.asInstanceOf[js.Any])
    if (virtualGatewayOwnerAccount != null) __obj.updateDynamic("virtualGatewayOwnerAccount")(virtualGatewayOwnerAccount.asInstanceOf[js.Any])
    if (virtualGatewayRegion != null) __obj.updateDynamic("virtualGatewayRegion")(virtualGatewayRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectConnectGatewayAssociation]
  }
}

