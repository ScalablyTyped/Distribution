package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTransitGatewayConnectPeerAssociationsRequest extends StObject {
  
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
  
  /**
    * One or more transit gateway Connect peer Amazon Resource Names (ARNs).
    */
  var TransitGatewayConnectPeerArns: js.UndefOr[TransitGatewayConnectPeerArnList] = js.undefined
}
object GetTransitGatewayConnectPeerAssociationsRequest {
  
  inline def apply(GlobalNetworkId: GlobalNetworkId): GetTransitGatewayConnectPeerAssociationsRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTransitGatewayConnectPeerAssociationsRequest]
  }
  
  extension [Self <: GetTransitGatewayConnectPeerAssociationsRequest](x: Self) {
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTransitGatewayConnectPeerArns(value: TransitGatewayConnectPeerArnList): Self = StObject.set(x, "TransitGatewayConnectPeerArns", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayConnectPeerArnsUndefined: Self = StObject.set(x, "TransitGatewayConnectPeerArns", js.undefined)
    
    inline def setTransitGatewayConnectPeerArnsVarargs(value: TransitGatewayConnectPeerArn*): Self = StObject.set(x, "TransitGatewayConnectPeerArns", js.Array(value*))
  }
}
