package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualGatewayTlsValidationContext extends js.Object {
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
  implicit class VirtualGatewayTlsValidationContextOps[Self <: VirtualGatewayTlsValidationContext] (val x: Self) extends AnyVal {
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
    def setTrust(value: VirtualGatewayTlsValidationContextTrust): Self = this.set("trust", value.asInstanceOf[js.Any])
  }
  
}

