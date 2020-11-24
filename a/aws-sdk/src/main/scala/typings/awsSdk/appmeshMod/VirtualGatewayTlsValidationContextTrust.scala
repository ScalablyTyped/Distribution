package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewayTlsValidationContextTrust extends js.Object {
  
  /**
    * A reference to an object that represents a TLS validation context trust for an AWS Certicate Manager (ACM) certificate.
    */
  var acm: js.UndefOr[VirtualGatewayTlsValidationContextAcmTrust] = js.native
  
  /**
    * An object that represents a TLS validation context trust for a local file.
    */
  var file: js.UndefOr[VirtualGatewayTlsValidationContextFileTrust] = js.native
}
object VirtualGatewayTlsValidationContextTrust {
  
  @scala.inline
  def apply(): VirtualGatewayTlsValidationContextTrust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewayTlsValidationContextTrust]
  }
  
  @scala.inline
  implicit class VirtualGatewayTlsValidationContextTrustOps[Self <: VirtualGatewayTlsValidationContextTrust] (val x: Self) extends AnyVal {
    
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
    def setAcm(value: VirtualGatewayTlsValidationContextAcmTrust): Self = this.set("acm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcm: Self = this.set("acm", js.undefined)
    
    @scala.inline
    def setFile(value: VirtualGatewayTlsValidationContextFileTrust): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
  }
}
