package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateFirewallRuleGroupResponse extends StObject {
  
  /**
    * The firewall rule group association that you just removed. 
    */
  var FirewallRuleGroupAssociation: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.FirewallRuleGroupAssociation] = js.undefined
}
object DisassociateFirewallRuleGroupResponse {
  
  inline def apply(): DisassociateFirewallRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateFirewallRuleGroupResponse]
  }
  
  extension [Self <: DisassociateFirewallRuleGroupResponse](x: Self) {
    
    inline def setFirewallRuleGroupAssociation(value: FirewallRuleGroupAssociation): Self = StObject.set(x, "FirewallRuleGroupAssociation", value.asInstanceOf[js.Any])
    
    inline def setFirewallRuleGroupAssociationUndefined: Self = StObject.set(x, "FirewallRuleGroupAssociation", js.undefined)
  }
}
