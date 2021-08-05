package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCertificateAuthoritiesResponse extends StObject {
  
  /**
    * Summary information about each certificate authority you have created.
    */
  var CertificateAuthorities: js.UndefOr[typings.awsSdk.acmpcaMod.CertificateAuthorities] = js.undefined
  
  /**
    * When the list is truncated, this value is present and should be used for the NextToken parameter in a subsequent pagination request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.acmpcaMod.NextToken] = js.undefined
}
object ListCertificateAuthoritiesResponse {
  
  inline def apply(): ListCertificateAuthoritiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificateAuthoritiesResponse]
  }
  
  extension [Self <: ListCertificateAuthoritiesResponse](x: Self) {
    
    inline def setCertificateAuthorities(value: CertificateAuthorities): Self = StObject.set(x, "CertificateAuthorities", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthoritiesUndefined: Self = StObject.set(x, "CertificateAuthorities", js.undefined)
    
    inline def setCertificateAuthoritiesVarargs(value: CertificateAuthority*): Self = StObject.set(x, "CertificateAuthorities", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
