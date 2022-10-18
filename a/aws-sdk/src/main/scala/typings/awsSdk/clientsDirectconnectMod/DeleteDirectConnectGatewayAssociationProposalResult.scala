package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDirectConnectGatewayAssociationProposalResult extends StObject {
  
  /**
    * The ID of the associated gateway.
    */
  var directConnectGatewayAssociationProposal: js.UndefOr[DirectConnectGatewayAssociationProposal] = js.undefined
}
object DeleteDirectConnectGatewayAssociationProposalResult {
  
  inline def apply(): DeleteDirectConnectGatewayAssociationProposalResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDirectConnectGatewayAssociationProposalResult]
  }
  
  extension [Self <: DeleteDirectConnectGatewayAssociationProposalResult](x: Self) {
    
    inline def setDirectConnectGatewayAssociationProposal(value: DirectConnectGatewayAssociationProposal): Self = StObject.set(x, "directConnectGatewayAssociationProposal", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectGatewayAssociationProposalUndefined: Self = StObject.set(x, "directConnectGatewayAssociationProposal", js.undefined)
  }
}
