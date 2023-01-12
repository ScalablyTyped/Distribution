package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFirewallRulesResponse extends StObject {
  
  /**
    * A list of the rules that you have defined.  This might be a partial list of the firewall rules that you've defined. For information, see MaxResults. 
    */
  var FirewallRules: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.FirewallRules] = js.undefined
  
  /**
    * If objects are still available for retrieval, Resolver returns this token in the response. To retrieve the next batch of objects, provide this token in your next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.NextToken] = js.undefined
}
object ListFirewallRulesResponse {
  
  inline def apply(): ListFirewallRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFirewallRulesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFirewallRulesResponse] (val x: Self) extends AnyVal {
    
    inline def setFirewallRules(value: FirewallRules): Self = StObject.set(x, "FirewallRules", value.asInstanceOf[js.Any])
    
    inline def setFirewallRulesUndefined: Self = StObject.set(x, "FirewallRules", js.undefined)
    
    inline def setFirewallRulesVarargs(value: FirewallRule*): Self = StObject.set(x, "FirewallRules", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
