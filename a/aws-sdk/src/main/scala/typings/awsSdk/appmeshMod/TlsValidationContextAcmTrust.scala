package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TlsValidationContextAcmTrust extends StObject {
  
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
  implicit class TlsValidationContextAcmTrustMutableBuilder[Self <: TlsValidationContextAcmTrust] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateAuthorityArns(value: CertificateAuthorityArns): Self = StObject.set(x, "certificateAuthorityArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateAuthorityArnsVarargs(value: Arn*): Self = StObject.set(x, "certificateAuthorityArns", js.Array(value :_*))
  }
}
