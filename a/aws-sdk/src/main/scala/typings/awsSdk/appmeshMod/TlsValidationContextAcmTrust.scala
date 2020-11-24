package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TlsValidationContextAcmTrust extends js.Object {
  
  /**
    * One or more ACM Amazon Resource Name (ARN)s.
    */
  var certificateAuthorityArns: CertificateAuthorityArns = js.native
}
object TlsValidationContextAcmTrust {
  
  @scala.inline
  def apply(certificateAuthorityArns: CertificateAuthorityArns): TlsValidationContextAcmTrust = {
    val __obj = js.Dynamic.literal(certificateAuthorityArns = certificateAuthorityArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[TlsValidationContextAcmTrust]
  }
  
  @scala.inline
  implicit class TlsValidationContextAcmTrustOps[Self <: TlsValidationContextAcmTrust] (val x: Self) extends AnyVal {
    
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
    def setCertificateAuthorityArnsVarargs(value: Arn*): Self = this.set("certificateAuthorityArns", js.Array(value :_*))
    
    @scala.inline
    def setCertificateAuthorityArns(value: CertificateAuthorityArns): Self = this.set("certificateAuthorityArns", value.asInstanceOf[js.Any])
  }
}
