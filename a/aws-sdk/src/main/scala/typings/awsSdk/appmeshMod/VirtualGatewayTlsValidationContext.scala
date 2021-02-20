package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewayTlsValidationContext extends StObject {
  
  /**
    * A reference to an object that represents a TLS validation context trust.
    */
  var trust: VirtualGatewayTlsValidationContextTrust = js.native
}
object VirtualGatewayTlsValidationContext {
  
  @scala.inline
  def apply(trust: VirtualGatewayTlsValidationContextTrust): VirtualGatewayTlsValidationContext = {
    val __obj = js.Dynamic.literal(trust = trust.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayTlsValidationContext]
  }
  
  @scala.inline
  implicit class VirtualGatewayTlsValidationContextMutableBuilder[Self <: VirtualGatewayTlsValidationContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrust(value: VirtualGatewayTlsValidationContextTrust): Self = StObject.set(x, "trust", value.asInstanceOf[js.Any])
  }
}
