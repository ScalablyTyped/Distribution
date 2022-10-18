package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTransitGatewayConnectPeerAssociationsResponse extends StObject {
  
  /**
    * The token to use for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
  
  /**
    * Information about the transit gateway Connect peer associations.
    */
  var TransitGatewayConnectPeerAssociations: js.UndefOr[TransitGatewayConnectPeerAssociationList] = js.undefined
}
object GetTransitGatewayConnectPeerAssociationsResponse {
  
  inline def apply(): GetTransitGatewayConnectPeerAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTransitGatewayConnectPeerAssociationsResponse]
  }
  
  extension [Self <: GetTransitGatewayConnectPeerAssociationsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTransitGatewayConnectPeerAssociations(value: TransitGatewayConnectPeerAssociationList): Self = StObject.set(x, "TransitGatewayConnectPeerAssociations", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayConnectPeerAssociationsUndefined: Self = StObject.set(x, "TransitGatewayConnectPeerAssociations", js.undefined)
    
    inline def setTransitGatewayConnectPeerAssociationsVarargs(value: TransitGatewayConnectPeerAssociation*): Self = StObject.set(x, "TransitGatewayConnectPeerAssociations", js.Array(value*))
  }
}
