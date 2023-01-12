package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFirewallPoliciesResponse extends StObject {
  
  /**
    * The metadata for the firewall policies. Depending on your setting for max results and the number of firewall policies that you have, this might not be the full list. 
    */
  var FirewallPolicies: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.FirewallPolicies] = js.undefined
  
  /**
    * When you request a list of objects with a MaxResults setting, if the number of objects that are still available for retrieval exceeds the maximum you requested, Network Firewall returns a NextToken value in the response. To retrieve the next batch of objects, use the token returned from the prior request in your next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListFirewallPoliciesResponse {
  
  inline def apply(): ListFirewallPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFirewallPoliciesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFirewallPoliciesResponse] (val x: Self) extends AnyVal {
    
    inline def setFirewallPolicies(value: FirewallPolicies): Self = StObject.set(x, "FirewallPolicies", value.asInstanceOf[js.Any])
    
    inline def setFirewallPoliciesUndefined: Self = StObject.set(x, "FirewallPolicies", js.undefined)
    
    inline def setFirewallPoliciesVarargs(value: FirewallPolicyMetadata*): Self = StObject.set(x, "FirewallPolicies", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
