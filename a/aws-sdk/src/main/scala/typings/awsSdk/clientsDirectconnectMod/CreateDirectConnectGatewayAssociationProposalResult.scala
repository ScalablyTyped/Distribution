package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDirectConnectGatewayAssociationProposalResult extends StObject {
  
  /**
    * Information about the Direct Connect gateway proposal.
    */
  var directConnectGatewayAssociationProposal: js.UndefOr[DirectConnectGatewayAssociationProposal] = js.undefined
}
object CreateDirectConnectGatewayAssociationProposalResult {
  
  inline def apply(): CreateDirectConnectGatewayAssociationProposalResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDirectConnectGatewayAssociationProposalResult]
  }
  
  extension [Self <: CreateDirectConnectGatewayAssociationProposalResult](x: Self) {
    
    inline def setDirectConnectGatewayAssociationProposal(value: DirectConnectGatewayAssociationProposal): Self = StObject.set(x, "directConnectGatewayAssociationProposal", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectGatewayAssociationProposalUndefined: Self = StObject.set(x, "directConnectGatewayAssociationProposal", js.undefined)
  }
}
