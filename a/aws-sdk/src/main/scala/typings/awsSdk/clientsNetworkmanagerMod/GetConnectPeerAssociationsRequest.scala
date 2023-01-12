package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectPeerAssociationsRequest extends StObject {
  
  /**
    * The IDs of the Connect peers.
    */
  var ConnectPeerIds: js.UndefOr[ConnectPeerIdList] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
}
object GetConnectPeerAssociationsRequest {
  
  inline def apply(GlobalNetworkId: GlobalNetworkId): GetConnectPeerAssociationsRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectPeerAssociationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetConnectPeerAssociationsRequest] (val x: Self) extends AnyVal {
    
    inline def setConnectPeerIds(value: ConnectPeerIdList): Self = StObject.set(x, "ConnectPeerIds", value.asInstanceOf[js.Any])
    
    inline def setConnectPeerIdsUndefined: Self = StObject.set(x, "ConnectPeerIds", js.undefined)
    
    inline def setConnectPeerIdsVarargs(value: ConnectPeerId*): Self = StObject.set(x, "ConnectPeerIds", js.Array(value*))
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
