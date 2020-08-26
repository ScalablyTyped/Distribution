package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualGatewayListenerTls extends js.Object {
  /**
    * An object that represents a Transport Layer Security (TLS) certificate.
    */
  var certificate: VirtualGatewayListenerTlsCertificate = js.native
  /**
    * Specify one of the following modes.
    
    
    
    STRICT – Listener only accepts connections with TLS
    enabled. 
    
    
    
    PERMISSIVE – Listener accepts connections with or
    without TLS enabled.
    
    
    
    DISABLED – Listener only accepts connections without
    TLS. 
    
    
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
  implicit class VirtualGatewayListenerTlsOps[Self <: VirtualGatewayListenerTls] (val x: Self) extends AnyVal {
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
    def setCertificate(value: VirtualGatewayListenerTlsCertificate): Self = this.set("certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: VirtualGatewayListenerTlsMode): Self = this.set("mode", value.asInstanceOf[js.Any])
  }
  
}

