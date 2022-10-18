package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TlsValidationContextSdsTrust extends StObject {
  
  /**
    * A reference to an object that represents the name of the secret for a Transport Layer Security (TLS) Secret Discovery Service validation context trust.
    */
  var secretName: SdsSecretName
}
object TlsValidationContextSdsTrust {
  
  inline def apply(secretName: SdsSecretName): TlsValidationContextSdsTrust = {
    val __obj = js.Dynamic.literal(secretName = secretName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TlsValidationContextSdsTrust]
  }
  
  extension [Self <: TlsValidationContextSdsTrust](x: Self) {
    
    inline def setSecretName(value: SdsSecretName): Self = StObject.set(x, "secretName", value.asInstanceOf[js.Any])
  }
}
