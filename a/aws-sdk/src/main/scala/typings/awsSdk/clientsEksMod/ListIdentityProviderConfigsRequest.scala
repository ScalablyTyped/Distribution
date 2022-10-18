package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIdentityProviderConfigsRequest extends StObject {
  
  /**
    * The cluster name that you want to list identity provider configurations for.
    */
  var clusterName: String
  
  /**
    * The maximum number of identity provider configurations returned by ListIdentityProviderConfigs in paginated output. When you use this parameter, ListIdentityProviderConfigs returns only maxResults results in a single page along with a nextToken response element. You can see the remaining results of the initial request by sending another ListIdentityProviderConfigs request with the returned nextToken value. This value can be between 1 and 100. If you don't use this parameter, ListIdentityProviderConfigs returns up to 100 results and a nextToken value, if applicable.
    */
  var maxResults: js.UndefOr[ListIdentityProviderConfigsRequestMaxResults] = js.undefined
  
  /**
    * The nextToken value returned from a previous paginated IdentityProviderConfigsRequest where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListIdentityProviderConfigsRequest {
  
  inline def apply(clusterName: String): ListIdentityProviderConfigsRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentityProviderConfigsRequest]
  }
  
  extension [Self <: ListIdentityProviderConfigsRequest](x: Self) {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: ListIdentityProviderConfigsRequestMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
