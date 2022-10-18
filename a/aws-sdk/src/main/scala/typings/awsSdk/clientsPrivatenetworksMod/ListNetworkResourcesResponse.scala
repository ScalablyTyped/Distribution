package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNetworkResourcesResponse extends StObject {
  
  /**
    * Information about network resources.
    */
  var networkResources: js.UndefOr[NetworkResourceList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListNetworkResourcesResponse {
  
  inline def apply(): ListNetworkResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNetworkResourcesResponse]
  }
  
  extension [Self <: ListNetworkResourcesResponse](x: Self) {
    
    inline def setNetworkResources(value: NetworkResourceList): Self = StObject.set(x, "networkResources", value.asInstanceOf[js.Any])
    
    inline def setNetworkResourcesUndefined: Self = StObject.set(x, "networkResources", js.undefined)
    
    inline def setNetworkResourcesVarargs(value: NetworkResource*): Self = StObject.set(x, "networkResources", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
