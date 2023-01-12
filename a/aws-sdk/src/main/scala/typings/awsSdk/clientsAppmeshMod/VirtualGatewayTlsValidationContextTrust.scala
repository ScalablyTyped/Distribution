package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayTlsValidationContextTrust extends StObject {
  
  /**
    * A reference to an object that represents a Transport Layer Security (TLS) validation context trust for an Certificate Manager certificate.
    */
  var acm: js.UndefOr[VirtualGatewayTlsValidationContextAcmTrust] = js.undefined
  
  /**
    * An object that represents a Transport Layer Security (TLS) validation context trust for a local file.
    */
  var file: js.UndefOr[VirtualGatewayTlsValidationContextFileTrust] = js.undefined
  
  /**
    * A reference to an object that represents a virtual gateway's Transport Layer Security (TLS) Secret Discovery Service validation context trust.
    */
  var sds: js.UndefOr[VirtualGatewayTlsValidationContextSdsTrust] = js.undefined
}
object VirtualGatewayTlsValidationContextTrust {
  
  inline def apply(): VirtualGatewayTlsValidationContextTrust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewayTlsValidationContextTrust]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualGatewayTlsValidationContextTrust] (val x: Self) extends AnyVal {
    
    inline def setAcm(value: VirtualGatewayTlsValidationContextAcmTrust): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    inline def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    inline def setFile(value: VirtualGatewayTlsValidationContextFileTrust): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setSds(value: VirtualGatewayTlsValidationContextSdsTrust): Self = StObject.set(x, "sds", value.asInstanceOf[js.Any])
    
    inline def setSdsUndefined: Self = StObject.set(x, "sds", js.undefined)
  }
}
