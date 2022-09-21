package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TlsValidationContextTrust extends StObject {
  
  /**
    * A reference to an object that represents a Transport Layer Security (TLS) validation context trust for an Certificate Manager certificate.
    */
  var acm: js.UndefOr[TlsValidationContextAcmTrust] = js.undefined
  
  /**
    * An object that represents a Transport Layer Security (TLS) validation context trust for a local file.
    */
  var file: js.UndefOr[TlsValidationContextFileTrust] = js.undefined
  
  /**
    * A reference to an object that represents a Transport Layer Security (TLS) Secret Discovery Service validation context trust.
    */
  var sds: js.UndefOr[TlsValidationContextSdsTrust] = js.undefined
}
object TlsValidationContextTrust {
  
  inline def apply(): TlsValidationContextTrust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TlsValidationContextTrust]
  }
  
  extension [Self <: TlsValidationContextTrust](x: Self) {
    
    inline def setAcm(value: TlsValidationContextAcmTrust): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    inline def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    inline def setFile(value: TlsValidationContextFileTrust): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setSds(value: TlsValidationContextSdsTrust): Self = StObject.set(x, "sds", value.asInstanceOf[js.Any])
    
    inline def setSdsUndefined: Self = StObject.set(x, "sds", js.undefined)
  }
}
