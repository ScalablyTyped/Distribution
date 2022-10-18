package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFirewallDomainsResponse extends StObject {
  
  /**
    * A list of the domains in the firewall domain list.  This might be a partial list of the domains that you've defined in the domain list. For information, see MaxResults. 
    */
  var Domains: js.UndefOr[FirewallDomains] = js.undefined
  
  /**
    * If objects are still available for retrieval, Resolver returns this token in the response. To retrieve the next batch of objects, provide this token in your next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.NextToken] = js.undefined
}
object ListFirewallDomainsResponse {
  
  inline def apply(): ListFirewallDomainsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFirewallDomainsResponse]
  }
  
  extension [Self <: ListFirewallDomainsResponse](x: Self) {
    
    inline def setDomains(value: FirewallDomains): Self = StObject.set(x, "Domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsUndefined: Self = StObject.set(x, "Domains", js.undefined)
    
    inline def setDomainsVarargs(value: FirewallDomainName*): Self = StObject.set(x, "Domains", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
