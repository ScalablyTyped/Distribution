package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFirewallRuleGroupRequest extends StObject {
  
  /**
    * The unique identifier of the firewall rule group that you want to delete. 
    */
  var FirewallRuleGroupId: ResourceId
}
object DeleteFirewallRuleGroupRequest {
  
  inline def apply(FirewallRuleGroupId: ResourceId): DeleteFirewallRuleGroupRequest = {
    val __obj = js.Dynamic.literal(FirewallRuleGroupId = FirewallRuleGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFirewallRuleGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFirewallRuleGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setFirewallRuleGroupId(value: ResourceId): Self = StObject.set(x, "FirewallRuleGroupId", value.asInstanceOf[js.Any])
  }
}
