package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateTransitGatewayConnectPeerResponse extends StObject {
  
  /**
    * The transit gateway Connect peer association.
    */
  var TransitGatewayConnectPeerAssociation: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.TransitGatewayConnectPeerAssociation] = js.undefined
}
object DisassociateTransitGatewayConnectPeerResponse {
  
  inline def apply(): DisassociateTransitGatewayConnectPeerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateTransitGatewayConnectPeerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateTransitGatewayConnectPeerResponse] (val x: Self) extends AnyVal {
    
    inline def setTransitGatewayConnectPeerAssociation(value: TransitGatewayConnectPeerAssociation): Self = StObject.set(x, "TransitGatewayConnectPeerAssociation", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayConnectPeerAssociationUndefined: Self = StObject.set(x, "TransitGatewayConnectPeerAssociation", js.undefined)
  }
}
