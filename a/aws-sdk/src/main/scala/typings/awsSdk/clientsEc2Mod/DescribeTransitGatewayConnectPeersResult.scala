package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTransitGatewayConnectPeersResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the Connect peers.
    */
  var TransitGatewayConnectPeers: js.UndefOr[TransitGatewayConnectPeerList] = js.undefined
}
object DescribeTransitGatewayConnectPeersResult {
  
  inline def apply(): DescribeTransitGatewayConnectPeersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransitGatewayConnectPeersResult]
  }
  
  extension [Self <: DescribeTransitGatewayConnectPeersResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTransitGatewayConnectPeers(value: TransitGatewayConnectPeerList): Self = StObject.set(x, "TransitGatewayConnectPeers", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayConnectPeersUndefined: Self = StObject.set(x, "TransitGatewayConnectPeers", js.undefined)
    
    inline def setTransitGatewayConnectPeersVarargs(value: TransitGatewayConnectPeer*): Self = StObject.set(x, "TransitGatewayConnectPeers", js.Array(value*))
  }
}
