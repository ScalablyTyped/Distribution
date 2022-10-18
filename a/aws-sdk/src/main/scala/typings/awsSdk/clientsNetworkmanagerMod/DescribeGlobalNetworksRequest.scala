package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGlobalNetworksRequest extends StObject {
  
  /**
    * The IDs of one or more global networks. The maximum is 10.
    */
  var GlobalNetworkIds: js.UndefOr[GlobalNetworkIdList] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
}
object DescribeGlobalNetworksRequest {
  
  inline def apply(): DescribeGlobalNetworksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGlobalNetworksRequest]
  }
  
  extension [Self <: DescribeGlobalNetworksRequest](x: Self) {
    
    inline def setGlobalNetworkIds(value: GlobalNetworkIdList): Self = StObject.set(x, "GlobalNetworkIds", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkIdsUndefined: Self = StObject.set(x, "GlobalNetworkIds", js.undefined)
    
    inline def setGlobalNetworkIdsVarargs(value: GlobalNetworkId*): Self = StObject.set(x, "GlobalNetworkIds", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
