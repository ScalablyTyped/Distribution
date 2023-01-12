package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerTlsValidationContextTrust extends StObject {
  
  /**
    * An object that represents a Transport Layer Security (TLS) validation context trust for a local file.
    */
  var file: js.UndefOr[TlsValidationContextFileTrust] = js.undefined
  
  /**
    * A reference to an object that represents a listener's Transport Layer Security (TLS) Secret Discovery Service validation context trust.
    */
  var sds: js.UndefOr[TlsValidationContextSdsTrust] = js.undefined
}
object ListenerTlsValidationContextTrust {
  
  inline def apply(): ListenerTlsValidationContextTrust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerTlsValidationContextTrust]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListenerTlsValidationContextTrust] (val x: Self) extends AnyVal {
    
    inline def setFile(value: TlsValidationContextFileTrust): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setSds(value: TlsValidationContextSdsTrust): Self = StObject.set(x, "sds", value.asInstanceOf[js.Any])
    
    inline def setSdsUndefined: Self = StObject.set(x, "sds", js.undefined)
  }
}
