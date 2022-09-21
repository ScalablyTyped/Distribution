package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayListenerTlsValidationContextTrust extends StObject {
  
  /**
    * An object that represents a Transport Layer Security (TLS) validation context trust for a local file.
    */
  var file: js.UndefOr[VirtualGatewayTlsValidationContextFileTrust] = js.undefined
  
  /**
    * A reference to an object that represents a virtual gateway's listener's Transport Layer Security (TLS) Secret Discovery Service validation context trust.
    */
  var sds: js.UndefOr[VirtualGatewayTlsValidationContextSdsTrust] = js.undefined
}
object VirtualGatewayListenerTlsValidationContextTrust {
  
  inline def apply(): VirtualGatewayListenerTlsValidationContextTrust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewayListenerTlsValidationContextTrust]
  }
  
  extension [Self <: VirtualGatewayListenerTlsValidationContextTrust](x: Self) {
    
    inline def setFile(value: VirtualGatewayTlsValidationContextFileTrust): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setSds(value: VirtualGatewayTlsValidationContextSdsTrust): Self = StObject.set(x, "sds", value.asInstanceOf[js.Any])
    
    inline def setSdsUndefined: Self = StObject.set(x, "sds", js.undefined)
  }
}
