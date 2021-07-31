package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerTls extends StObject {
  
  /**
    * A reference to an object that represents a listener's TLS certificate.
    */
  var certificate: ListenerTlsCertificate
  
  /**
    * Specify one of the following modes.    STRICT – Listener only accepts connections with TLS enabled.     PERMISSIVE – Listener accepts connections with or without TLS enabled.    DISABLED – Listener only accepts connections without TLS.   
    */
  var mode: ListenerTlsMode
}
object ListenerTls {
  
  @scala.inline
  def apply(certificate: ListenerTlsCertificate, mode: ListenerTlsMode): ListenerTls = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerTls]
  }
  
  @scala.inline
  implicit class ListenerTlsMutableBuilder[Self <: ListenerTls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: ListenerTlsCertificate): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: ListenerTlsMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
