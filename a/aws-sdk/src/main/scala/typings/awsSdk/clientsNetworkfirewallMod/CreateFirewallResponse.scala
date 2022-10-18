package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFirewallResponse extends StObject {
  
  /**
    * The configuration settings for the firewall. These settings include the firewall policy and the subnets in your VPC to use for the firewall endpoints. 
    */
  var Firewall: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.Firewall] = js.undefined
  
  /**
    * Detailed information about the current status of a Firewall. You can retrieve this for a firewall by calling DescribeFirewall and providing the firewall name and ARN.
    */
  var FirewallStatus: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.FirewallStatus] = js.undefined
}
object CreateFirewallResponse {
  
  inline def apply(): CreateFirewallResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFirewallResponse]
  }
  
  extension [Self <: CreateFirewallResponse](x: Self) {
    
    inline def setFirewall(value: Firewall): Self = StObject.set(x, "Firewall", value.asInstanceOf[js.Any])
    
    inline def setFirewallStatus(value: FirewallStatus): Self = StObject.set(x, "FirewallStatus", value.asInstanceOf[js.Any])
    
    inline def setFirewallStatusUndefined: Self = StObject.set(x, "FirewallStatus", js.undefined)
    
    inline def setFirewallUndefined: Self = StObject.set(x, "Firewall", js.undefined)
  }
}
