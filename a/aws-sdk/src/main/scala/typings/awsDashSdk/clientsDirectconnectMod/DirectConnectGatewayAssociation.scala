package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectConnectGatewayAssociation extends js.Object {
  /**
    * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
    */
  var allowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined
  /**
    * Information about the associated gateway.
    */
  var associatedGateway: js.UndefOr[AssociatedGateway] = js.undefined
  /**
    * The ID of the Direct Connect gateway association.
    */
  var associationId: js.UndefOr[DirectConnectGatewayAssociationId] = js.undefined
  /**
    * The state of the association. The following are the possible values:    associating: The initial state after calling CreateDirectConnectGatewayAssociation.    associated: The Direct Connect gateway and virtual private gateway or transit gateway are successfully associated and ready to pass traffic.    disassociating: The initial state after calling DeleteDirectConnectGatewayAssociation.    disassociated: The virtual private gateway or transit gateway is disassociated from the Direct Connect gateway. Traffic flow between the Direct Connect gateway and virtual private gateway or transit gateway is stopped.  
    */
  var associationState: js.UndefOr[DirectConnectGatewayAssociationState] = js.undefined
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined
  /**
    * The ID of the AWS account that owns the associated gateway.
    */
  var directConnectGatewayOwnerAccount: js.UndefOr[OwnerAccount] = js.undefined
  /**
    * The error message if the state of an object failed to advance.
    */
  var stateChangeError: js.UndefOr[StateChangeError] = js.undefined
  /**
    * The ID of the virtual private gateway. Applies only to private virtual interfaces.
    */
  var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined
  /**
    * The ID of the AWS account that owns the virtual private gateway.
    */
  var virtualGatewayOwnerAccount: js.UndefOr[OwnerAccount] = js.undefined
  /**
    * The AWS Region where the virtual private gateway is located.
    */
  var virtualGatewayRegion: js.UndefOr[VirtualGatewayRegion] = js.undefined
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
    if (allowedPrefixesToDirectConnectGateway != null) __obj.updateDynamic("allowedPrefixesToDirectConnectGateway")(allowedPrefixesToDirectConnectGateway)
    if (associatedGateway != null) __obj.updateDynamic("associatedGateway")(associatedGateway)
    if (associationId != null) __obj.updateDynamic("associationId")(associationId)
    if (associationState != null) __obj.updateDynamic("associationState")(associationState.asInstanceOf[js.Any])
    if (directConnectGatewayId != null) __obj.updateDynamic("directConnectGatewayId")(directConnectGatewayId)
    if (directConnectGatewayOwnerAccount != null) __obj.updateDynamic("directConnectGatewayOwnerAccount")(directConnectGatewayOwnerAccount)
    if (stateChangeError != null) __obj.updateDynamic("stateChangeError")(stateChangeError)
    if (virtualGatewayId != null) __obj.updateDynamic("virtualGatewayId")(virtualGatewayId)
    if (virtualGatewayOwnerAccount != null) __obj.updateDynamic("virtualGatewayOwnerAccount")(virtualGatewayOwnerAccount)
    if (virtualGatewayRegion != null) __obj.updateDynamic("virtualGatewayRegion")(virtualGatewayRegion)
    __obj.asInstanceOf[DirectConnectGatewayAssociation]
  }
}

