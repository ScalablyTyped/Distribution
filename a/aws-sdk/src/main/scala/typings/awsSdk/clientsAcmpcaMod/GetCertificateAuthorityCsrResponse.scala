package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCertificateAuthorityCsrResponse extends StObject {
  
  /**
    * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
    */
  var Csr: js.UndefOr[CsrBody] = js.undefined
}
object GetCertificateAuthorityCsrResponse {
  
  inline def apply(): GetCertificateAuthorityCsrResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCertificateAuthorityCsrResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCertificateAuthorityCsrResponse] (val x: Self) extends AnyVal {
    
    inline def setCsr(value: CsrBody): Self = StObject.set(x, "Csr", value.asInstanceOf[js.Any])
    
    inline def setCsrUndefined: Self = StObject.set(x, "Csr", js.undefined)
  }
}
