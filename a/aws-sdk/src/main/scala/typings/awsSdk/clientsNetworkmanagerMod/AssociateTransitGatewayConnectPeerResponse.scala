package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateTransitGatewayConnectPeerResponse extends StObject {
  
  /**
    * The transit gateway Connect peer association.
    */
  var TransitGatewayConnectPeerAssociation: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.TransitGatewayConnectPeerAssociation] = js.undefined
}
object AssociateTransitGatewayConnectPeerResponse {
  
  inline def apply(): AssociateTransitGatewayConnectPeerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateTransitGatewayConnectPeerResponse]
  }
  
  extension [Self <: AssociateTransitGatewayConnectPeerResponse](x: Self) {
    
    inline def setTransitGatewayConnectPeerAssociation(value: TransitGatewayConnectPeerAssociation): Self = StObject.set(x, "TransitGatewayConnectPeerAssociation", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayConnectPeerAssociationUndefined: Self = StObject.set(x, "TransitGatewayConnectPeerAssociation", js.undefined)
  }
}
