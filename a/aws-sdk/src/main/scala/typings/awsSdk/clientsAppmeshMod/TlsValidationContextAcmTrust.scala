package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TlsValidationContextAcmTrust extends StObject {
  
  /**
    * One or more ACM Amazon Resource Name (ARN)s.
    */
  var certificateAuthorityArns: CertificateAuthorityArns
}
object TlsValidationContextAcmTrust {
  
  inline def apply(certificateAuthorityArns: CertificateAuthorityArns): TlsValidationContextAcmTrust = {
    val __obj = js.Dynamic.literal(certificateAuthorityArns = certificateAuthorityArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[TlsValidationContextAcmTrust]
  }
  
  extension [Self <: TlsValidationContextAcmTrust](x: Self) {
    
    inline def setCertificateAuthorityArns(value: CertificateAuthorityArns): Self = StObject.set(x, "certificateAuthorityArns", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityArnsVarargs(value: Arn*): Self = StObject.set(x, "certificateAuthorityArns", js.Array(value*))
  }
}
