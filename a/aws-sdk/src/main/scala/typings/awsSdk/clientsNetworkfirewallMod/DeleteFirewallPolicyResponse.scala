package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFirewallPolicyResponse extends StObject {
  
  /**
    * The object containing the definition of the FirewallPolicyResponse that you asked to delete. 
    */
  var FirewallPolicyResponse: typings.awsSdk.clientsNetworkfirewallMod.FirewallPolicyResponse
}
object DeleteFirewallPolicyResponse {
  
  inline def apply(FirewallPolicyResponse: FirewallPolicyResponse): DeleteFirewallPolicyResponse = {
    val __obj = js.Dynamic.literal(FirewallPolicyResponse = FirewallPolicyResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFirewallPolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFirewallPolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setFirewallPolicyResponse(value: FirewallPolicyResponse): Self = StObject.set(x, "FirewallPolicyResponse", value.asInstanceOf[js.Any])
  }
}
