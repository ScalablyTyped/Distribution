package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFirewallRuleGroupPolicyRequest extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) for the rule group.
    */
  var Arn: typings.awsSdk.clientsRoute53resolverMod.Arn
}
object GetFirewallRuleGroupPolicyRequest {
  
  inline def apply(Arn: Arn): GetFirewallRuleGroupPolicyRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFirewallRuleGroupPolicyRequest]
  }
  
  extension [Self <: GetFirewallRuleGroupPolicyRequest](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
