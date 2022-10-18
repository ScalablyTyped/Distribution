package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGlobalNetworksResponse extends StObject {
  
  /**
    * Information about the global networks.
    */
  var GlobalNetworks: js.UndefOr[GlobalNetworkList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
}
object DescribeGlobalNetworksResponse {
  
  inline def apply(): DescribeGlobalNetworksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGlobalNetworksResponse]
  }
  
  extension [Self <: DescribeGlobalNetworksResponse](x: Self) {
    
    inline def setGlobalNetworks(value: GlobalNetworkList): Self = StObject.set(x, "GlobalNetworks", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworksUndefined: Self = StObject.set(x, "GlobalNetworks", js.undefined)
    
    inline def setGlobalNetworksVarargs(value: GlobalNetwork*): Self = StObject.set(x, "GlobalNetworks", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
