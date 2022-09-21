package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerTls extends StObject {
  
  /**
    * A reference to an object that represents a listener's Transport Layer Security (TLS) certificate.
    */
  var certificate: ListenerTlsCertificate
  
  /**
    * Specify one of the following modes.    STRICT – Listener only accepts connections with TLS enabled.     PERMISSIVE – Listener accepts connections with or without TLS enabled.    DISABLED – Listener only accepts connections without TLS.   
    */
  var mode: ListenerTlsMode
  
  /**
    * A reference to an object that represents a listener's Transport Layer Security (TLS) validation context.
    */
  var validation: js.UndefOr[ListenerTlsValidationContext] = js.undefined
}
object ListenerTls {
  
  inline def apply(certificate: ListenerTlsCertificate, mode: ListenerTlsMode): ListenerTls = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerTls]
  }
  
  extension [Self <: ListenerTls](x: Self) {
    
    inline def setCertificate(value: ListenerTlsCertificate): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setMode(value: ListenerTlsMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setValidation(value: ListenerTlsValidationContext): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    inline def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
  }
}
