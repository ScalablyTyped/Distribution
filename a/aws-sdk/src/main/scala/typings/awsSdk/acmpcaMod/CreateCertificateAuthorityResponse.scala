package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCertificateAuthorityResponse extends StObject {
  
  /**
    * If successful, the Amazon Resource Name (ARN) of the certificate authority (CA). This is of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
    */
  var CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined
}
object CreateCertificateAuthorityResponse {
  
  inline def apply(): CreateCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCertificateAuthorityResponse]
  }
  
  extension [Self <: CreateCertificateAuthorityResponse](x: Self) {
    
    inline def setCertificateAuthorityArn(value: Arn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityArnUndefined: Self = StObject.set(x, "CertificateAuthorityArn", js.undefined)
  }
}
