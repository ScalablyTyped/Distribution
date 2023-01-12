package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConnectPeersResponse extends StObject {
  
  /**
    * Describes the Connect peers.
    */
  var ConnectPeers: js.UndefOr[ConnectPeerSummaryList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
}
object ListConnectPeersResponse {
  
  inline def apply(): ListConnectPeersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectPeersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListConnectPeersResponse] (val x: Self) extends AnyVal {
    
    inline def setConnectPeers(value: ConnectPeerSummaryList): Self = StObject.set(x, "ConnectPeers", value.asInstanceOf[js.Any])
    
    inline def setConnectPeersUndefined: Self = StObject.set(x, "ConnectPeers", js.undefined)
    
    inline def setConnectPeersVarargs(value: ConnectPeerSummary*): Self = StObject.set(x, "ConnectPeers", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
