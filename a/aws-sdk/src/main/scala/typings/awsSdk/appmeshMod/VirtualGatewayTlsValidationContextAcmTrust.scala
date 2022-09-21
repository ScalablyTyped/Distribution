package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayTlsValidationContextAcmTrust extends StObject {
  
  /**
    * One or more ACM Amazon Resource Name (ARN)s.
    */
  var certificateAuthorityArns: VirtualGatewayCertificateAuthorityArns
}
object VirtualGatewayTlsValidationContextAcmTrust {
  
  inline def apply(certificateAuthorityArns: VirtualGatewayCertificateAuthorityArns): VirtualGatewayTlsValidationContextAcmTrust = {
    val __obj = js.Dynamic.literal(certificateAuthorityArns = certificateAuthorityArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayTlsValidationContextAcmTrust]
  }
  
  extension [Self <: VirtualGatewayTlsValidationContextAcmTrust](x: Self) {
    
    inline def setCertificateAuthorityArns(value: VirtualGatewayCertificateAuthorityArns): Self = StObject.set(x, "certificateAuthorityArns", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityArnsVarargs(value: Arn*): Self = StObject.set(x, "certificateAuthorityArns", js.Array(value*))
  }
}
