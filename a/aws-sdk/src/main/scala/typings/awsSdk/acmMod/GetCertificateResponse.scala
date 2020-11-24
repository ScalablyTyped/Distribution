package typings.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCertificateResponse extends js.Object {
  
  /**
    * The ACM-issued certificate corresponding to the ARN specified as input.
    */
  var Certificate: js.UndefOr[CertificateBody] = js.native
  
  /**
    * Certificates forming the requested certificate's chain of trust. The chain consists of the certificate of the issuing CA and the intermediate certificates of any other subordinate CAs. 
    */
  var CertificateChain: js.UndefOr[typings.awsSdk.acmMod.CertificateChain] = js.native
}
object GetCertificateResponse {
  
  @scala.inline
  def apply(): GetCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCertificateResponse]
  }
  
  @scala.inline
  implicit class GetCertificateResponseOps[Self <: GetCertificateResponse] (val x: Self) extends AnyVal {
    
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
