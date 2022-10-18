package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkResourceCountsRequest extends StObject {
  
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
    * The resource type. The following are the supported resource types for Direct Connect:    dxcon     dx-gateway     dx-vif    The following are the supported resource types for Network Manager:    connection     device     link     site    The following are the supported resource types for Amazon VPC:    customer-gateway     transit-gateway     transit-gateway-attachment     transit-gateway-connect-peer     transit-gateway-route-table     vpn-connection   
    */
  var ResourceType: js.UndefOr[ConstrainedString] = js.undefined
}
object GetNetworkResourceCountsRequest {
  
  inline def apply(GlobalNetworkId: GlobalNetworkId): GetNetworkResourceCountsRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkResourceCountsRequest]
  }
  
  extension [Self <: GetNetworkResourceCountsRequest](x: Self) {
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceType(value: ConstrainedString): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
