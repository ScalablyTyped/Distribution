package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayClientPolicy extends StObject {
  
  /**
    * A reference to an object that represents a Transport Layer Security (TLS) client policy.
    */
  var tls: js.UndefOr[VirtualGatewayClientPolicyTls] = js.undefined
}
object VirtualGatewayClientPolicy {
  
  inline def apply(): VirtualGatewayClientPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewayClientPolicy]
  }
  
  extension [Self <: VirtualGatewayClientPolicy](x: Self) {
    
    inline def setTls(value: VirtualGatewayClientPolicyTls): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}
