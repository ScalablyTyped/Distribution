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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateConnectPeerResponse] (val x: Self) extends AnyVal {
    
    inline def setConnectPeer(value: ConnectPeer): Self = StObject.set(x, "ConnectPeer", value.asInstanceOf[js.Any])
    
    inline def setConnectPeerUndefined: Self = StObject.set(x, "ConnectPeer", js.undefined)
  }
}
