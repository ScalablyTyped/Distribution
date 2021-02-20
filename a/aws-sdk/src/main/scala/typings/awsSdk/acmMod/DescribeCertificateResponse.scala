package typings.awsSdk.acmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCertificateResponse extends StObject {
  
  /**
    * Metadata about an ACM certificate.
    */
  var Certificate: js.UndefOr[CertificateDetail] = js.native
}
object DescribeCertificateResponse {
  
  @scala.inline
  def apply(): DescribeCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCertificateResponse]
  }
  
  @scala.inline
  implicit class DescribeCertificateResponseMutableBuilder[Self <: DescribeCertificateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: CertificateDetail): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
  }
}
