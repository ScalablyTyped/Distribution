package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyRequest extends StObject {
  
  /**
    * The IAM policy statement that lists the accounts that you want to share your rule group or firewall policy with and the operations that you want the accounts to be able to perform.  For a rule group resource, you can specify the following operations in the Actions section of the statement:   network-firewall:CreateFirewallPolicy   network-firewall:UpdateFirewallPolicy   network-firewall:ListRuleGroups   For a firewall policy resource, you can specify the following operations in the Actions section of the statement:   network-firewall:CreateFirewall   network-firewall:UpdateFirewall   network-firewall:AssociateFirewallPolicy   network-firewall:ListFirewallPolicies   In the Resource section of the statement, you specify the ARNs for the rule groups and firewall policies that you want to share with the account that you specified in Arn.
    */
  var Policy: PolicyString
  
  /**
    * The Amazon Resource Name (ARN) of the account that you want to share rule groups and firewall policies with.
    */
  var ResourceArn: typings.awsSdk.clientsNetworkfirewallMod.ResourceArn
}
object PutResourcePolicyRequest {
  
  inline def apply(Policy: PolicyString, ResourceArn: ResourceArn): PutResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyRequest]
  }
  
  extension [Self <: PutResourcePolicyRequest](x: Self) {
    
    inline def setPolicy(value: PolicyString): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
