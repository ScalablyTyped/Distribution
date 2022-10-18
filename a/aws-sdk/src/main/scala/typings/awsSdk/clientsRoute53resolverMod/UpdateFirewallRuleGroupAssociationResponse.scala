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
  
  extension [Self <: UpdateFirewallRuleGroupAssociationResponse](x: Self) {
    
    inline def setFirewallRuleGroupAssociation(value: FirewallRuleGroupAssociation): Self = StObject.set(x, "FirewallRuleGroupAssociation", value.asInstanceOf[js.Any])
    
    inline def setFirewallRuleGroupAssociationUndefined: Self = StObject.set(x, "FirewallRuleGroupAssociation", js.undefined)
  }
}
