package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayTlsValidationContext extends StObject {
  
  /**
    * A reference to an object that represents a TLS validation context trust.
    */
  var trust: VirtualGatewayTlsValidationContextTrust
}
object VirtualGatewayTlsValidationContext {
  
  inline def apply(trust: VirtualGatewayTlsValidationContextTrust): VirtualGatewayTlsValidationContext = {
    val __obj = js.Dynamic.literal(trust = trust.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayTlsValidationContext]
  }
  
  extension [Self <: VirtualGatewayTlsValidationContext](x: Self) {
    
    inline def setTrust(value: VirtualGatewayTlsValidationContextTrust): Self = StObject.set(x, "trust", value.asInstanceOf[js.Any])
  }
}
