package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFirewallResponse extends StObject {
  
  /**
    * The configuration settings for the firewall. These settings include the firewall policy and the subnets in your VPC to use for the firewall endpoints. 
    */
  var Firewall: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.Firewall] = js.undefined
  
  /**
    * Detailed information about the current status of a Firewall. You can retrieve this for a firewall by calling DescribeFirewall and providing the firewall name and ARN.
    */
  var FirewallStatus: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.FirewallStatus] = js.undefined
  
  /**
    * An optional token that you can use for optimistic locking. Network Firewall returns a token to your requests that access the firewall. The token marks the state of the firewall resource at the time of the request.  To make an unconditional change to the firewall, omit the token in your update request. Without the token, Network Firewall performs your updates regardless of whether the firewall has changed since you last retrieved it. To make a conditional change to the firewall, provide the token in your update request. Network Firewall uses the token to ensure that the firewall hasn't changed since you last retrieved it. If it has changed, the operation fails with an InvalidTokenException. If this happens, retrieve the firewall again to get a current copy of it with a new token. Reapply your changes as needed, then try the operation again using the new token. 
    */
  var UpdateToken: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.UpdateToken] = js.undefined
}
object DescribeFirewallResponse {
  
  inline def apply(): DescribeFirewallResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFirewallResponse]
  }
  
  extension [Self <: DescribeFirewallResponse](x: Self) {
    
    inline def setFirewall(value: Firewall): Self = StObject.set(x, "Firewall", value.asInstanceOf[js.Any])
    
    inline def setFirewallStatus(value: FirewallStatus): Self = StObject.set(x, "FirewallStatus", value.asInstanceOf[js.Any])
    
    inline def setFirewallStatusUndefined: Self = StObject.set(x, "FirewallStatus", js.undefined)
    
    inline def setFirewallUndefined: Self = StObject.set(x, "Firewall", js.undefined)
    
    inline def setUpdateToken(value: UpdateToken): Self = StObject.set(x, "UpdateToken", value.asInstanceOf[js.Any])
    
    inline def setUpdateTokenUndefined: Self = StObject.set(x, "UpdateToken", js.undefined)
  }
}
