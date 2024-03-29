package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFirewallResponse extends StObject {
  
  var Firewall: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.Firewall] = js.undefined
  
  var FirewallStatus: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.FirewallStatus] = js.undefined
}
object DeleteFirewallResponse {
  
  inline def apply(): DeleteFirewallResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFirewallResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFirewallResponse] (val x: Self) extends AnyVal {
    
    inline def setFirewall(value: Firewall): Self = StObject.set(x, "Firewall", value.asInstanceOf[js.Any])
    
    inline def setFirewallStatus(value: FirewallStatus): Self = StObject.set(x, "FirewallStatus", value.asInstanceOf[js.Any])
    
    inline def setFirewallStatusUndefined: Self = StObject.set(x, "FirewallStatus", js.undefined)
    
    inline def setFirewallUndefined: Self = StObject.set(x, "Firewall", js.undefined)
  }
}
