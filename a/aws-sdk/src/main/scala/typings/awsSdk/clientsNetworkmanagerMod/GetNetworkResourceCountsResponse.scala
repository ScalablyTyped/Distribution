package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkResourceCountsResponse extends StObject {
  
  /**
    * The count of resources.
    */
  var NetworkResourceCounts: js.UndefOr[NetworkResourceCountList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
}
object GetNetworkResourceCountsResponse {
  
  inline def apply(): GetNetworkResourceCountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkResourceCountsResponse]
  }
  
  extension [Self <: GetNetworkResourceCountsResponse](x: Self) {
    
    inline def setNetworkResourceCounts(value: NetworkResourceCountList): Self = StObject.set(x, "NetworkResourceCounts", value.asInstanceOf[js.Any])
    
    inline def setNetworkResourceCountsUndefined: Self = StObject.set(x, "NetworkResourceCounts", js.undefined)
    
    inline def setNetworkResourceCountsVarargs(value: NetworkResourceCount*): Self = StObject.set(x, "NetworkResourceCounts", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
