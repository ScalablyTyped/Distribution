package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFirewallDomainListsRequest extends StObject {
  
  /**
    * The maximum number of objects that you want Resolver to return for this request. If more objects are available, in the response, Resolver provides a NextToken value that you can use in a subsequent call to get the next batch of objects. If you don't specify a value for MaxResults, Resolver returns up to 100 objects. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.MaxResults] = js.undefined
  
  /**
    * For the first call to this list request, omit this value. When you request a list of objects, Resolver returns at most the number of objects specified in MaxResults. If more objects are available for retrieval, Resolver returns a NextToken value in the response. To retrieve the next batch of objects, use the token that was returned for the prior request in your next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.NextToken] = js.undefined
}
object ListFirewallDomainListsRequest {
  
  inline def apply(): ListFirewallDomainListsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFirewallDomainListsRequest]
  }
  
  extension [Self <: ListFirewallDomainListsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
