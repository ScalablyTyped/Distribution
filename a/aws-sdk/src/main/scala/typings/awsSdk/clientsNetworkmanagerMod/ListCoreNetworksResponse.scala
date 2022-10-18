package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCoreNetworksResponse extends StObject {
  
  /**
    * Describes the list of core networks.
    */
  var CoreNetworks: js.UndefOr[CoreNetworkSummaryList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
}
object ListCoreNetworksResponse {
  
  inline def apply(): ListCoreNetworksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCoreNetworksResponse]
  }
  
  extension [Self <: ListCoreNetworksResponse](x: Self) {
    
    inline def setCoreNetworks(value: CoreNetworkSummaryList): Self = StObject.set(x, "CoreNetworks", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworksUndefined: Self = StObject.set(x, "CoreNetworks", js.undefined)
    
    inline def setCoreNetworksVarargs(value: CoreNetworkSummary*): Self = StObject.set(x, "CoreNetworks", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
