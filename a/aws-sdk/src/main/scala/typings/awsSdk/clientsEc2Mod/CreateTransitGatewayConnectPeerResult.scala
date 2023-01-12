package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayConnectPeerResult extends StObject {
  
  /**
    * Information about the Connect peer.
    */
  var TransitGatewayConnectPeer: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayConnectPeer] = js.undefined
}
object CreateTransitGatewayConnectPeerResult {
  
  inline def apply(): CreateTransitGatewayConnectPeerResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitGatewayConnectPeerResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTransitGatewayConnectPeerResult] (val x: Self) extends AnyVal {
    
    inline def setTransitGatewayConnectPeer(value: TransitGatewayConnectPeer): Self = StObject.set(x, "TransitGatewayConnectPeer", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayConnectPeerUndefined: Self = StObject.set(x, "TransitGatewayConnectPeer", js.undefined)
  }
}
