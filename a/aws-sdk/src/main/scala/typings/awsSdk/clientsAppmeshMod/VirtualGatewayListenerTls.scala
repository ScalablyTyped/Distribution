package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayListenerTls extends StObject {
  
  /**
    * An object that represents a Transport Layer Security (TLS) certificate.
    */
  var certificate: VirtualGatewayListenerTlsCertificate
  
  /**
    * Specify one of the following modes.    STRICT – Listener only accepts connections with TLS enabled.     PERMISSIVE – Listener accepts connections with or without TLS enabled.    DISABLED – Listener only accepts connections without TLS.   
    */
  var mode: VirtualGatewayListenerTlsMode
  
  /**
    * A reference to an object that represents a virtual gateway's listener's Transport Layer Security (TLS) validation context.
    */
  var validation: js.UndefOr[VirtualGatewayListenerTlsValidationContext] = js.undefined
}
object VirtualGatewayListenerTls {
  
  inline def apply(certificate: VirtualGatewayListenerTlsCertificate, mode: VirtualGatewayListenerTlsMode): VirtualGatewayListenerTls = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayListenerTls]
  }
  
  extension [Self <: VirtualGatewayListenerTls](x: Self) {
    
    inline def setCertificate(value: VirtualGatewayListenerTlsCertificate): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setMode(value: VirtualGatewayListenerTlsMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setValidation(value: VirtualGatewayListenerTlsValidationContext): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    inline def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
  }
}
