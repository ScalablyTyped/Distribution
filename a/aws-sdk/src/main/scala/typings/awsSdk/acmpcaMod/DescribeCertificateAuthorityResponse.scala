package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCertificateAuthorityResponse extends StObject {
  
  /**
    * A CertificateAuthority structure that contains information about your private CA.
    */
  var CertificateAuthority: js.UndefOr[typings.awsSdk.acmpcaMod.CertificateAuthority] = js.native
}
object DescribeCertificateAuthorityResponse {
  
  @scala.inline
  def apply(): DescribeCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCertificateAuthorityResponse]
  }
  
  @scala.inline
  implicit class DescribeCertificateAuthorityResponseMutableBuilder[Self <: DescribeCertificateAuthorityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateAuthority(value: CertificateAuthority): Self = StObject.set(x, "CertificateAuthority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateAuthorityUndefined: Self = StObject.set(x, "CertificateAuthority", js.undefined)
  }
}
