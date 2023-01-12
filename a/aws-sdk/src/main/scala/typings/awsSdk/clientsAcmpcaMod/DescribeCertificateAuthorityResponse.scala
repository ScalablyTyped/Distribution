package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCertificateAuthorityResponse extends StObject {
  
  /**
    * A CertificateAuthority structure that contains information about your private CA.
    */
  var CertificateAuthority: js.UndefOr[typings.awsSdk.clientsAcmpcaMod.CertificateAuthority] = js.undefined
}
object DescribeCertificateAuthorityResponse {
  
  inline def apply(): DescribeCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCertificateAuthorityResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCertificateAuthorityResponse] (val x: Self) extends AnyVal {
    
    inline def setCertificateAuthority(value: CertificateAuthority): Self = StObject.set(x, "CertificateAuthority", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityUndefined: Self = StObject.set(x, "CertificateAuthority", js.undefined)
  }
}
