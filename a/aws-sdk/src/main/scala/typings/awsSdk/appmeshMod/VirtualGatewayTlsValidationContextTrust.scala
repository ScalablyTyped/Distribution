package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayTlsValidationContextTrust extends StObject {
  
  /**
    * A reference to an object that represents a TLS validation context trust for an AWS Certicate Manager (ACM) certificate.
    */
  var acm: js.UndefOr[VirtualGatewayTlsValidationContextAcmTrust] = js.undefined
  
  /**
    * An object that represents a TLS validation context trust for a local file.
    */
  var file: js.UndefOr[VirtualGatewayTlsValidationContextFileTrust] = js.undefined
}
object VirtualGatewayTlsValidationContextTrust {
  
  inline def apply(): VirtualGatewayTlsValidationContextTrust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewayTlsValidationContextTrust]
  }
  
  extension [Self <: VirtualGatewayTlsValidationContextTrust](x: Self) {
    
    inline def setAcm(value: VirtualGatewayTlsValidationContextAcmTrust): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    inline def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    inline def setFile(value: VirtualGatewayTlsValidationContextFileTrust): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
