package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerTls extends js.Object {
  /**
    * A reference to an object that represents a listener's TLS certificate.
    */
  var certificate: ListenerTlsCertificate = js.native
  /**
    * Specify one of the following modes.
    
    
    
    STRICT – Listener only accepts connections with TLS
    enabled. 
    
    
    
    PERMISSIVE – Listener accepts connections with or
    without TLS enabled.
    
    
    
    DISABLED – Listener only accepts connections without
    TLS. 
    
    
    */
  var mode: ListenerTlsMode = js.native
}

object ListenerTls {
  @scala.inline
  def apply(certificate: ListenerTlsCertificate, mode: ListenerTlsMode): ListenerTls = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerTls]
  }
}

