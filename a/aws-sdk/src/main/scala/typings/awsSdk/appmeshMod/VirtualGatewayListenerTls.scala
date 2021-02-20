package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewayListenerTls extends StObject {
  
  /**
    * An object that represents a Transport Layer Security (TLS) certificate.
    */
  var certificate: VirtualGatewayListenerTlsCertificate = js.native
  
  /**
    * Specify one of the following modes.    STRICT – Listener only accepts connections with TLS enabled.     PERMISSIVE – Listener accepts connections with or without TLS enabled.    DISABLED – Listener only accepts connections without TLS.   
    */
  var mode: VirtualGatewayListenerTlsMode = js.native
}
object VirtualGatewayListenerTls {
  
  @scala.inline
  def apply(certificate: VirtualGatewayListenerTlsCertificate, mode: VirtualGatewayListenerTlsMode): VirtualGatewayListenerTls = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayListenerTls]
  }
  
  @scala.inline
  implicit class VirtualGatewayListenerTlsMutableBuilder[Self <: VirtualGatewayListenerTls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: VirtualGatewayListenerTlsCertificate): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: VirtualGatewayListenerTlsMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
