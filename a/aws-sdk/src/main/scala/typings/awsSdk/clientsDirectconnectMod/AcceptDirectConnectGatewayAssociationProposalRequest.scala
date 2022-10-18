package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptDirectConnectGatewayAssociationProposalRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account that owns the virtual private gateway or transit gateway.
    */
  var associatedGatewayOwnerAccount: OwnerAccount
  
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: DirectConnectGatewayId
  
  /**
    * Overrides the Amazon VPC prefixes advertised to the Direct Connect gateway. For information about how to set the prefixes, see Allowed Prefixes in the Direct Connect User Guide.
    */
  var overrideAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined
  
  /**
    * The ID of the request proposal.
    */
  var proposalId: DirectConnectGatewayAssociationProposalId
}
object AcceptDirectConnectGatewayAssociationProposalRequest {
  
  inline def apply(
    associatedGatewayOwnerAccount: OwnerAccount,
    directConnectGatewayId: DirectConnectGatewayId,
    proposalId: DirectConnectGatewayAssociationProposalId
  ): AcceptDirectConnectGatewayAssociationProposalRequest = {
    val __obj = js.Dynamic.literal(associatedGatewayOwnerAccount = associatedGatewayOwnerAccount.asInstanceOf[js.Any], directConnectGatewayId = directConnectGatewayId.asInstanceOf[js.Any], proposalId = proposalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptDirectConnectGatewayAssociationProposalRequest]
  }
  
  extension [Self <: AcceptDirectConnectGatewayAssociationProposalRequest](x: Self) {
    
    inline def setAssociatedGatewayOwnerAccount(value: OwnerAccount): Self = StObject.set(x, "associatedGatewayOwnerAccount", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = StObject.set(x, "directConnectGatewayId", value.asInstanceOf[js.Any])
    
    inline def setOverrideAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = StObject.set(x, "overrideAllowedPrefixesToDirectConnectGateway", value.asInstanceOf[js.Any])
    
    inline def setOverrideAllowedPrefixesToDirectConnectGatewayUndefined: Self = StObject.set(x, "overrideAllowedPrefixesToDirectConnectGateway", js.undefined)
    
    inline def setOverrideAllowedPrefixesToDirectConnectGatewayVarargs(value: RouteFilterPrefix*): Self = StObject.set(x, "overrideAllowedPrefixesToDirectConnectGateway", js.Array(value*))
    
    inline def setProposalId(value: DirectConnectGatewayAssociationProposalId): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
  }
}
