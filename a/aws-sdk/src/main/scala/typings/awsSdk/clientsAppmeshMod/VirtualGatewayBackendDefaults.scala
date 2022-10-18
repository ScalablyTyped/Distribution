package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayBackendDefaults extends StObject {
  
  /**
    * A reference to an object that represents a client policy.
    */
  var clientPolicy: js.UndefOr[VirtualGatewayClientPolicy] = js.undefined
}
object VirtualGatewayBackendDefaults {
  
  inline def apply(): VirtualGatewayBackendDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewayBackendDefaults]
  }
  
  extension [Self <: VirtualGatewayBackendDefaults](x: Self) {
    
    inline def setClientPolicy(value: VirtualGatewayClientPolicy): Self = StObject.set(x, "clientPolicy", value.asInstanceOf[js.Any])
    
    inline def setClientPolicyUndefined: Self = StObject.set(x, "clientPolicy", js.undefined)
  }
}
