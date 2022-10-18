package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFirewallConfigResponse extends StObject {
  
  /**
    * Configuration of the firewall behavior provided by DNS Firewall for a single VPC from AmazonVPC. 
    */
  var FirewallConfig: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.FirewallConfig] = js.undefined
}
object GetFirewallConfigResponse {
  
  inline def apply(): GetFirewallConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFirewallConfigResponse]
  }
  
  extension [Self <: GetFirewallConfigResponse](x: Self) {
    
    inline def setFirewallConfig(value: FirewallConfig): Self = StObject.set(x, "FirewallConfig", value.asInstanceOf[js.Any])
    
    inline def setFirewallConfigUndefined: Self = StObject.set(x, "FirewallConfig", js.undefined)
  }
}
