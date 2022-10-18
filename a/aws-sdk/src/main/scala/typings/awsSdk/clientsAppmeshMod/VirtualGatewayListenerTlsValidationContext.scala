package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayListenerTlsValidationContext extends StObject {
  
  /**
    * A reference to an object that represents the SANs for a virtual gateway listener's Transport Layer Security (TLS) validation context.
    */
  var subjectAlternativeNames: js.UndefOr[SubjectAlternativeNames] = js.undefined
  
  /**
    * A reference to where to retrieve the trust chain when validating a peer’s Transport Layer Security (TLS) certificate.
    */
  var trust: VirtualGatewayListenerTlsValidationContextTrust
}
object VirtualGatewayListenerTlsValidationContext {
  
  inline def apply(trust: VirtualGatewayListenerTlsValidationContextTrust): VirtualGatewayListenerTlsValidationContext = {
    val __obj = js.Dynamic.literal(trust = trust.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayListenerTlsValidationContext]
  }
  
  extension [Self <: VirtualGatewayListenerTlsValidationContext](x: Self) {
    
    inline def setSubjectAlternativeNames(value: SubjectAlternativeNames): Self = StObject.set(x, "subjectAlternativeNames", value.asInstanceOf[js.Any])
    
    inline def setSubjectAlternativeNamesUndefined: Self = StObject.set(x, "subjectAlternativeNames", js.undefined)
    
    inline def setTrust(value: VirtualGatewayListenerTlsValidationContextTrust): Self = StObject.set(x, "trust", value.asInstanceOf[js.Any])
  }
}
