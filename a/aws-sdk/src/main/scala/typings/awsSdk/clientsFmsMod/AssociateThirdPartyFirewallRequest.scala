package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateThirdPartyFirewallRequest extends StObject {
  
  /**
    * The name of the third-party firewall vendor.
    */
  var ThirdPartyFirewall: typings.awsSdk.clientsFmsMod.ThirdPartyFirewall
}
object AssociateThirdPartyFirewallRequest {
  
  inline def apply(ThirdPartyFirewall: ThirdPartyFirewall): AssociateThirdPartyFirewallRequest = {
    val __obj = js.Dynamic.literal(ThirdPartyFirewall = ThirdPartyFirewall.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateThirdPartyFirewallRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateThirdPartyFirewallRequest] (val x: Self) extends AnyVal {
    
    inline def setThirdPartyFirewall(value: ThirdPartyFirewall): Self = StObject.set(x, "ThirdPartyFirewall", value.asInstanceOf[js.Any])
  }
}
