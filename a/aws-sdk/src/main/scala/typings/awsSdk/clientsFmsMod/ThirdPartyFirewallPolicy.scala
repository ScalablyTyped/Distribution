package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThirdPartyFirewallPolicy extends StObject {
  
  /**
    * Defines the deployment model to use for the third-party firewall policy.
    */
  var FirewallDeploymentModel: js.UndefOr[typings.awsSdk.clientsFmsMod.FirewallDeploymentModel] = js.undefined
}
object ThirdPartyFirewallPolicy {
  
  inline def apply(): ThirdPartyFirewallPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyFirewallPolicy]
  }
  
  extension [Self <: ThirdPartyFirewallPolicy](x: Self) {
    
    inline def setFirewallDeploymentModel(value: FirewallDeploymentModel): Self = StObject.set(x, "FirewallDeploymentModel", value.asInstanceOf[js.Any])
    
    inline def setFirewallDeploymentModelUndefined: Self = StObject.set(x, "FirewallDeploymentModel", js.undefined)
  }
}
