package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCertificateAuthorityCsrResponse extends js.Object {
  
  /**
    * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
    */
  var Csr: js.UndefOr[CsrBody] = js.native
}
object GetCertificateAuthorityCsrResponse {
  
  @scala.inline
  def apply(): GetCertificateAuthorityCsrResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCertificateAuthorityCsrResponse]
  }
  
  @scala.inline
  implicit class GetCertificateAuthorityCsrResponseOps[Self <: GetCertificateAuthorityCsrResponse] (val x: Self) extends AnyVal {
    
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
    def setCsr(value: CsrBody): Self = this.set("Csr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsr: Self = this.set("Csr", js.undefined)
  }
}
