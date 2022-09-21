package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TlsValidationContext extends StObject {
  
  /**
    * A reference to an object that represents the SANs for a Transport Layer Security (TLS) validation context. If you don't specify SANs on the terminating mesh endpoint, the Envoy proxy for that node doesn't verify the SAN on a peer client certificate. If you don't specify SANs on the originating mesh endpoint, the SAN on the certificate provided by the terminating endpoint must match the mesh endpoint service discovery configuration. Since SPIRE vended certificates have a SPIFFE ID as a name, you must set the SAN since the name doesn't match the service discovery name.
    */
  var subjectAlternativeNames: js.UndefOr[SubjectAlternativeNames] = js.undefined
  
  /**
    * A reference to where to retrieve the trust chain when validating a peer’s Transport Layer Security (TLS) certificate.
    */
  var trust: TlsValidationContextTrust
}
object TlsValidationContext {
  
  inline def apply(trust: TlsValidationContextTrust): TlsValidationContext = {
    val __obj = js.Dynamic.literal(trust = trust.asInstanceOf[js.Any])
    __obj.asInstanceOf[TlsValidationContext]
  }
  
  extension [Self <: TlsValidationContext](x: Self) {
    
    inline def setSubjectAlternativeNames(value: SubjectAlternativeNames): Self = StObject.set(x, "subjectAlternativeNames", value.asInstanceOf[js.Any])
    
    inline def setSubjectAlternativeNamesUndefined: Self = StObject.set(x, "subjectAlternativeNames", js.undefined)
    
    inline def setTrust(value: TlsValidationContextTrust): Self = StObject.set(x, "trust", value.asInstanceOf[js.Any])
  }
}
