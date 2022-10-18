package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectPeerResponse extends StObject {
  
  /**
    * The response to the request.
    */
  var ConnectPeer: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.ConnectPeer] = js.undefined
}
object CreateConnectPeerResponse {
  
  inline def apply(): CreateConnectPeerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConnectPeerResponse]
  }
  
  extension [Self <: CreateConnectPeerResponse](x: Self) {
    
    inline def setConnectPeer(value: ConnectPeer): Self = StObject.set(x, "ConnectPeer", value.asInstanceOf[js.Any])
    
    inline def setConnectPeerUndefined: Self = StObject.set(x, "ConnectPeer", js.undefined)
  }
}
