package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TlsValidationContextTrust extends js.Object {
  
  /**
    * A reference to an object that represents a TLS validation context trust for an AWS Certicate Manager (ACM) certificate.
    */
  var acm: js.UndefOr[TlsValidationContextAcmTrust] = js.native
  
  /**
    * An object that represents a TLS validation context trust for a local file.
    */
  var file: js.UndefOr[TlsValidationContextFileTrust] = js.native
}
object TlsValidationContextTrust {
  
  @scala.inline
  def apply(): TlsValidationContextTrust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TlsValidationContextTrust]
  }
  
  @scala.inline
  implicit class TlsValidationContextTrustOps[Self <: TlsValidationContextTrust] (val x: Self) extends AnyVal {
    
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
    def setAcm(value: TlsValidationContextAcmTrust): Self = this.set("acm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcm: Self = this.set("acm", js.undefined)
    
    @scala.inline
    def setFile(value: TlsValidationContextFileTrust): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
  }
}
