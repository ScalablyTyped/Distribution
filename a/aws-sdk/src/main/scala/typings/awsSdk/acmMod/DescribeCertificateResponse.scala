package typings.awsSdk.acmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCertificateResponse extends StObject {
  
  /**
    * Metadata about an ACM certificate.
    */
  var Certificate: js.UndefOr[CertificateDetail] = js.undefined
}
object DescribeCertificateResponse {
  
  inline def apply(): DescribeCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCertificateResponse]
  }
  
  extension [Self <: DescribeCertificateResponse](x: Self) {
    
    inline def setCertificate(value: CertificateDetail): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
  }
}
