package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResolverEndpointsResponse extends StObject {
  
  /**
    * The value that you specified for MaxResults in the request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.MaxResults] = js.undefined
  
  /**
    * If more than MaxResults IP addresses match the specified criteria, you can submit another ListResolverEndpoint request to get the next group of results. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.NextToken] = js.undefined
  
  /**
    * The Resolver endpoints that were created by using the current Amazon Web Services account, and that match the specified filters, if any.
    */
  var ResolverEndpoints: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.ResolverEndpoints] = js.undefined
}
object ListResolverEndpointsResponse {
  
  inline def apply(): ListResolverEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolverEndpointsResponse]
  }
  
  extension [Self <: ListResolverEndpointsResponse](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResolverEndpoints(value: ResolverEndpoints): Self = StObject.set(x, "ResolverEndpoints", value.asInstanceOf[js.Any])
    
    inline def setResolverEndpointsUndefined: Self = StObject.set(x, "ResolverEndpoints", js.undefined)
    
    inline def setResolverEndpointsVarargs(value: ResolverEndpoint*): Self = StObject.set(x, "ResolverEndpoints", js.Array(value*))
  }
}
