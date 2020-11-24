package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCertificateAuthoritiesResponse extends js.Object {
  
  /**
    * Summary information about each certificate authority you have created.
    */
  var CertificateAuthorities: js.UndefOr[typings.awsSdk.acmpcaMod.CertificateAuthorities] = js.native
  
  /**
    * When the list is truncated, this value is present and should be used for the NextToken parameter in a subsequent pagination request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.acmpcaMod.NextToken] = js.native
}
object ListCertificateAuthoritiesResponse {
  
  @scala.inline
  def apply(): ListCertificateAuthoritiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificateAuthoritiesResponse]
  }
  
  @scala.inline
  implicit class ListCertificateAuthoritiesResponseOps[Self <: ListCertificateAuthoritiesResponse] (val x: Self) extends AnyVal {
    
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
    def setCertificateAuthoritiesVarargs(value: CertificateAuthority*): Self = this.set("CertificateAuthorities", js.Array(value :_*))
    
    @scala.inline
    def setCertificateAuthorities(value: CertificateAuthorities): Self = this.set("CertificateAuthorities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateAuthorities: Self = this.set("CertificateAuthorities", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
