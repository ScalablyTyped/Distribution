package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateFirewallRuleGroupRequest extends StObject {
  
  /**
    * The identifier of the FirewallRuleGroupAssociation. 
    */
  var FirewallRuleGroupAssociationId: ResourceId
}
object DisassociateFirewallRuleGroupRequest {
  
  inline def apply(FirewallRuleGroupAssociationId: ResourceId): DisassociateFirewallRuleGroupRequest = {
    val __obj = js.Dynamic.literal(FirewallRuleGroupAssociationId = FirewallRuleGroupAssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateFirewallRuleGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateFirewallRuleGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setFirewallRuleGroupAssociationId(value: ResourceId): Self = StObject.set(x, "FirewallRuleGroupAssociationId", value.asInstanceOf[js.Any])
  }
}
