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
  @scala.inline
  implicit class ListenerTlsOps[Self <: ListenerTls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCertificate(value: ListenerTlsCertificate): Self = this.set("certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: ListenerTlsMode): Self = this.set("mode", value.asInstanceOf[js.Any])
  }
  
}

