package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNetworksResponse extends StObject {
  
  /**
    * The networks.
    */
  var networks: js.UndefOr[NetworkList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListNetworksResponse {
  
  inline def apply(): ListNetworksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNetworksResponse]
  }
  
  extension [Self <: ListNetworksResponse](x: Self) {
    
    inline def setNetworks(value: NetworkList): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
    
    inline def setNetworksUndefined: Self = StObject.set(x, "networks", js.undefined)
    
    inline def setNetworksVarargs(value: Network*): Self = StObject.set(x, "networks", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
