package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFirewallDomainListsResponse extends StObject {
  
  /**
    * A list of the domain lists that you have defined.  This might be a partial list of the domain lists that you've defined. For information, see MaxResults. 
    */
  var FirewallDomainLists: js.UndefOr[FirewallDomainListMetadataList] = js.undefined
  
  /**
    * If objects are still available for retrieval, Resolver returns this token in the response. To retrieve the next batch of objects, provide this token in your next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.NextToken] = js.undefined
}
object ListFirewallDomainListsResponse {
  
  inline def apply(): ListFirewallDomainListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFirewallDomainListsResponse]
  }
  
  extension [Self <: ListFirewallDomainListsResponse](x: Self) {
    
    inline def setFirewallDomainLists(value: FirewallDomainListMetadataList): Self = StObject.set(x, "FirewallDomainLists", value.asInstanceOf[js.Any])
    
    inline def setFirewallDomainListsUndefined: Self = StObject.set(x, "FirewallDomainLists", js.undefined)
    
    inline def setFirewallDomainListsVarargs(value: FirewallDomainListMetadata*): Self = StObject.set(x, "FirewallDomainLists", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
