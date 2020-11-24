package typings.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportCertificateResponse extends js.Object {
  
  /**
    * The base64 PEM-encoded certificate.
    */
  var Certificate: js.UndefOr[CertificateBody] = js.native
  
  /**
    * The base64 PEM-encoded certificate chain. This does not include the certificate that you are exporting.
    */
  var CertificateChain: js.UndefOr[typings.awsSdk.acmMod.CertificateChain] = js.native
  
  /**
    * The encrypted private key associated with the public key in the certificate. The key is output in PKCS #8 format and is base64 PEM-encoded. 
    */
  var PrivateKey: js.UndefOr[typings.awsSdk.acmMod.PrivateKey] = js.native
}
object ExportCertificateResponse {
  
  @scala.inline
  def apply(): ExportCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportCertificateResponse]
  }
  
  @scala.inline
  implicit class ExportCertificateResponseOps[Self <: ExportCertificateResponse] (val x: Self) extends AnyVal {
    
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
    def setCertificate(value: CertificateBody): Self = this.set("Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificate: Self = this.set("Certificate", js.undefined)
    
    @scala.inline
    def setCertificateChain(value: CertificateChain): Self = this.set("CertificateChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateChain: Self = this.set("CertificateChain", js.undefined)
    
    @scala.inline
    def setPrivateKey(value: PrivateKey): Self = this.set("PrivateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKey: Self = this.set("PrivateKey", js.undefined)
  }
}
