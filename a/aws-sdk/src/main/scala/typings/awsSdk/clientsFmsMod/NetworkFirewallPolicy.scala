package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkFirewallPolicy extends StObject {
  
  /**
    * Defines the deployment model to use for the firewall policy. To use a distributed model, set PolicyOption to NULL.
    */
  var FirewallDeploymentModel: js.UndefOr[typings.awsSdk.clientsFmsMod.FirewallDeploymentModel] = js.undefined
}
object NetworkFirewallPolicy {
  
  inline def apply(): NetworkFirewallPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFirewallPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkFirewallPolicy] (val x: Self) extends AnyVal {
    
    inline def setFirewallDeploymentModel(value: FirewallDeploymentModel): Self = StObject.set(x, "FirewallDeploymentModel", value.asInstanceOf[js.Any])
    
    inline def setFirewallDeploymentModelUndefined: Self = StObject.set(x, "FirewallDeploymentModel", js.undefined)
  }
}
