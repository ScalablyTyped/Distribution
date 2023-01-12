package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyOption extends StObject {
  
  /**
    * Defines the deployment model to use for the firewall policy.
    */
  var NetworkFirewallPolicy: js.UndefOr[typings.awsSdk.clientsFmsMod.NetworkFirewallPolicy] = js.undefined
  
  /**
    * Defines the policy options for a third-party firewall policy.
    */
  var ThirdPartyFirewallPolicy: js.UndefOr[typings.awsSdk.clientsFmsMod.ThirdPartyFirewallPolicy] = js.undefined
}
object PolicyOption {
  
  inline def apply(): PolicyOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyOption] (val x: Self) extends AnyVal {
    
    inline def setNetworkFirewallPolicy(value: NetworkFirewallPolicy): Self = StObject.set(x, "NetworkFirewallPolicy", value.asInstanceOf[js.Any])
    
    inline def setNetworkFirewallPolicyUndefined: Self = StObject.set(x, "NetworkFirewallPolicy", js.undefined)
    
    inline def setThirdPartyFirewallPolicy(value: ThirdPartyFirewallPolicy): Self = StObject.set(x, "ThirdPartyFirewallPolicy", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyFirewallPolicyUndefined: Self = StObject.set(x, "ThirdPartyFirewallPolicy", js.undefined)
  }
}
