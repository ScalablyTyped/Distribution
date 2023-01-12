package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFirewallRuleGroupAssociationResponse extends StObject {
  
  /**
    * The association that you just updated. 
    */
  var FirewallRuleGroupAssociation: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.FirewallRuleGroupAssociation] = js.undefined
}
object UpdateFirewallRuleGroupAssociationResponse {
  
  inline def apply(): UpdateFirewallRuleGroupAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFirewallRuleGroupAssociationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFirewallRuleGroupAssociationResponse] (val x: Self) extends AnyVal {
    
    inline def setFirewallRuleGroupAssociation(value: FirewallRuleGroupAssociation): Self = StObject.set(x, "FirewallRuleGroupAssociation", value.asInstanceOf[js.Any])
    
    inline def setFirewallRuleGroupAssociationUndefined: Self = StObject.set(x, "FirewallRuleGroupAssociation", js.undefined)
  }
}
