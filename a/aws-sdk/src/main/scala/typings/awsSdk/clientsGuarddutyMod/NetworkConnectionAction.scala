package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkConnectionAction extends StObject {
  
  /**
    * Indicates whether EC2 blocked the network connection to your instance.
    */
  var Blocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The network connection direction.
    */
  var ConnectionDirection: js.UndefOr[String] = js.undefined
  
  /**
    * The local IP information of the connection.
    */
  var LocalIpDetails: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.LocalIpDetails] = js.undefined
  
  /**
    * The local port information of the connection.
    */
  var LocalPortDetails: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.LocalPortDetails] = js.undefined
  
  /**
    * The network connection protocol.
    */
  var Protocol: js.UndefOr[String] = js.undefined
  
  /**
    * The remote IP information of the connection.
    */
  var RemoteIpDetails: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.RemoteIpDetails] = js.undefined
  
  /**
    * The remote port information of the connection.
    */
  var RemotePortDetails: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.RemotePortDetails] = js.undefined
}
object NetworkConnectionAction {
  
  inline def apply(): NetworkConnectionAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConnectionAction]
  }
  
  extension [Self <: NetworkConnectionAction](x: Self) {
    
    inline def setBlocked(value: Boolean): Self = StObject.set(x, "Blocked", value.asInstanceOf[js.Any])
    
    inline def setBlockedUndefined: Self = StObject.set(x, "Blocked", js.undefined)
    
    inline def setConnectionDirection(value: String): Self = StObject.set(x, "ConnectionDirection", value.asInstanceOf[js.Any])
    
    inline def setConnectionDirectionUndefined: Self = StObject.set(x, "ConnectionDirection", js.undefined)
    
    inline def setLocalIpDetails(value: LocalIpDetails): Self = StObject.set(x, "LocalIpDetails", value.asInstanceOf[js.Any])
    
    inline def setLocalIpDetailsUndefined: Self = StObject.set(x, "LocalIpDetails", js.undefined)
    
    inline def setLocalPortDetails(value: LocalPortDetails): Self = StObject.set(x, "LocalPortDetails", value.asInstanceOf[js.Any])
    
    inline def setLocalPortDetailsUndefined: Self = StObject.set(x, "LocalPortDetails", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setRemoteIpDetails(value: RemoteIpDetails): Self = StObject.set(x, "RemoteIpDetails", value.asInstanceOf[js.Any])
    
    inline def setRemoteIpDetailsUndefined: Self = StObject.set(x, "RemoteIpDetails", js.undefined)
    
    inline def setRemotePortDetails(value: RemotePortDetails): Self = StObject.set(x, "RemotePortDetails", value.asInstanceOf[js.Any])
    
    inline def setRemotePortDetailsUndefined: Self = StObject.set(x, "RemotePortDetails", js.undefined)
  }
}
