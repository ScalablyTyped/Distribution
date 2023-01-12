package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTransitGatewayConnectPeerResult extends StObject {
  
  /**
    * Information about the deleted Connect peer.
    */
  var TransitGatewayConnectPeer: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayConnectPeer] = js.undefined
}
object DeleteTransitGatewayConnectPeerResult {
  
  inline def apply(): DeleteTransitGatewayConnectPeerResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayConnectPeerResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTransitGatewayConnectPeerResult] (val x: Self) extends AnyVal {
    
    inline def setTransitGatewayConnectPeer(value: TransitGatewayConnectPeer): Self = StObject.set(x, "TransitGatewayConnectPeer", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayConnectPeerUndefined: Self = StObject.set(x, "TransitGatewayConnectPeer", js.undefined)
  }
}
