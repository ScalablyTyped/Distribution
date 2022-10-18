package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResolverConfigsRequest extends StObject {
  
  /**
    * The maximum number of Resolver configurations that you want to return in the response to a ListResolverConfigs request. If you don't specify a value for MaxResults, up to 100 Resolver configurations are returned.
    */
  var MaxResults: js.UndefOr[ListResolverConfigsMaxResult] = js.undefined
  
  /**
    * (Optional) If the current Amazon Web Services account has more than MaxResults Resolver configurations, use NextToken to get the second and subsequent pages of results. For the first ListResolverConfigs request, omit this value. For the second and subsequent requests, get the value of NextToken from the previous response and specify that value for NextToken in the request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.NextToken] = js.undefined
}
object ListResolverConfigsRequest {
  
  inline def apply(): ListResolverConfigsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolverConfigsRequest]
  }
  
  extension [Self <: ListResolverConfigsRequest](x: Self) {
    
    inline def setMaxResults(value: ListResolverConfigsMaxResult): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
