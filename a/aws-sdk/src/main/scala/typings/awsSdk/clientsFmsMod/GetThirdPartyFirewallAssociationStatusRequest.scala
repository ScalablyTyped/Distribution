package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetThirdPartyFirewallAssociationStatusRequest extends StObject {
  
  /**
    * The name of the third-party firewall vendor.
    */
  var ThirdPartyFirewall: typings.awsSdk.clientsFmsMod.ThirdPartyFirewall
}
object GetThirdPartyFirewallAssociationStatusRequest {
  
  inline def apply(ThirdPartyFirewall: ThirdPartyFirewall): GetThirdPartyFirewallAssociationStatusRequest = {
    val __obj = js.Dynamic.literal(ThirdPartyFirewall = ThirdPartyFirewall.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetThirdPartyFirewallAssociationStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetThirdPartyFirewallAssociationStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setThirdPartyFirewall(value: ThirdPartyFirewall): Self = StObject.set(x, "ThirdPartyFirewall", value.asInstanceOf[js.Any])
  }
}
