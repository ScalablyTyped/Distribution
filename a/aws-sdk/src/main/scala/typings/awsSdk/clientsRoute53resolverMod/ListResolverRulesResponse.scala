package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResolverRulesResponse extends StObject {
  
  /**
    * The value that you specified for MaxResults in the request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.MaxResults] = js.undefined
  
  /**
    * If more than MaxResults Resolver rules match the specified criteria, you can submit another ListResolverRules request to get the next group of results. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.NextToken] = js.undefined
  
  /**
    * The Resolver rules that were created using the current Amazon Web Services account and that match the specified filters, if any.
    */
  var ResolverRules: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.ResolverRules] = js.undefined
}
object ListResolverRulesResponse {
  
  inline def apply(): ListResolverRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolverRulesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResolverRulesResponse] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResolverRules(value: ResolverRules): Self = StObject.set(x, "ResolverRules", value.asInstanceOf[js.Any])
    
    inline def setResolverRulesUndefined: Self = StObject.set(x, "ResolverRules", js.undefined)
    
    inline def setResolverRulesVarargs(value: ResolverRule*): Self = StObject.set(x, "ResolverRules", js.Array(value*))
  }
}
