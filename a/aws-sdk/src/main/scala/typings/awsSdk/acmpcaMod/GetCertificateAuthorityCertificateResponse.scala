package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCertificateAuthorityCertificateResponse extends js.Object {
  
  /**
    * Base64-encoded certificate authority (CA) certificate.
    */
  var Certificate: js.UndefOr[CertificateBody] = js.native
  
  /**
    * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. If this is a root CA, the value will be null.
    */
  var CertificateChain: js.UndefOr[typings.awsSdk.acmpcaMod.CertificateChain] = js.native
}
object GetCertificateAuthorityCertificateResponse {
  
  @scala.inline
  def apply(): GetCertificateAuthorityCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCertificateAuthorityCertificateResponse]
  }
  
  @scala.inline
  implicit class GetCertificateAuthorityCertificateResponseOps[Self <: GetCertificateAuthorityCertificateResponse] (val x: Self) extends AnyVal {
    
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
  }
}
