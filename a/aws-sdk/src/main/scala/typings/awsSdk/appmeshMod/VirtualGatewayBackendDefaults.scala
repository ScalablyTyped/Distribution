package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewayBackendDefaults extends StObject {
  
  /**
    * A reference to an object that represents a client policy.
    */
  var clientPolicy: js.UndefOr[VirtualGatewayClientPolicy] = js.native
}
object VirtualGatewayBackendDefaults {
  
  @scala.inline
  def apply(): VirtualGatewayBackendDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewayBackendDefaults]
  }
  
  @scala.inline
  implicit class VirtualGatewayBackendDefaultsMutableBuilder[Self <: VirtualGatewayBackendDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientPolicy(value: VirtualGatewayClientPolicy): Self = StObject.set(x, "clientPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientPolicyUndefined: Self = StObject.set(x, "clientPolicy", js.undefined)
  }
}
