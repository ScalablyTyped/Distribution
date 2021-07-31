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
  
  @scala.inline
  def apply(): ListCertificateAuthoritiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificateAuthoritiesResponse]
  }
  
  @scala.inline
  implicit class ListCertificateAuthoritiesResponseMutableBuilder[Self <: ListCertificateAuthoritiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateAuthorities(value: CertificateAuthorities): Self = StObject.set(x, "CertificateAuthorities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateAuthoritiesUndefined: Self = StObject.set(x, "CertificateAuthorities", js.undefined)
    
    @scala.inline
    def setCertificateAuthoritiesVarargs(value: CertificateAuthority*): Self = StObject.set(x, "CertificateAuthorities", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
