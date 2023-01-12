package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFirewallRuleGroupAssociationResponse extends StObject {
  
  /**
    * The association that you requested. 
    */
  var FirewallRuleGroupAssociation: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.FirewallRuleGroupAssociation] = js.undefined
}
object GetFirewallRuleGroupAssociationResponse {
  
  inline def apply(): GetFirewallRuleGroupAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFirewallRuleGroupAssociationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFirewallRuleGroupAssociationResponse] (val x: Self) extends AnyVal {
    
    inline def setFirewallRuleGroupAssociation(value: FirewallRuleGroupAssociation): Self = StObject.set(x, "FirewallRuleGroupAssociation", value.asInstanceOf[js.Any])
    
    inline def setFirewallRuleGroupAssociationUndefined: Self = StObject.set(x, "FirewallRuleGroupAssociation", js.undefined)
  }
}
