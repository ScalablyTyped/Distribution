package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListThirdPartyFirewallFirewallPoliciesResponse extends StObject {
  
  /**
    * The value that you will use for NextToken in the next ListThirdPartyFirewallFirewallPolicies request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * A list that contains one ThirdPartyFirewallFirewallPolicies element for each third-party firewall policies that the specified third-party firewall vendor is associated with. Each ThirdPartyFirewallFirewallPolicies element contains the firewall policy name and ID.
    */
  var ThirdPartyFirewallFirewallPolicies: js.UndefOr[typings.awsSdk.clientsFmsMod.ThirdPartyFirewallFirewallPolicies] = js.undefined
}
object ListThirdPartyFirewallFirewallPoliciesResponse {
  
  inline def apply(): ListThirdPartyFirewallFirewallPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThirdPartyFirewallFirewallPoliciesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListThirdPartyFirewallFirewallPoliciesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setThirdPartyFirewallFirewallPolicies(value: ThirdPartyFirewallFirewallPolicies): Self = StObject.set(x, "ThirdPartyFirewallFirewallPolicies", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyFirewallFirewallPoliciesUndefined: Self = StObject.set(x, "ThirdPartyFirewallFirewallPolicies", js.undefined)
    
    inline def setThirdPartyFirewallFirewallPoliciesVarargs(value: ThirdPartyFirewallFirewallPolicy*): Self = StObject.set(x, "ThirdPartyFirewallFirewallPolicies", js.Array(value*))
  }
}
