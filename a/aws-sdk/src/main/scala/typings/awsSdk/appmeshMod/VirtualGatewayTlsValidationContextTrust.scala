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
  
  @scala.inline
  def apply(): VirtualGatewayTlsValidationContextTrust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewayTlsValidationContextTrust]
  }
  
  @scala.inline
  implicit class VirtualGatewayTlsValidationContextTrustMutableBuilder[Self <: VirtualGatewayTlsValidationContextTrust] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcm(value: VirtualGatewayTlsValidationContextAcmTrust): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    @scala.inline
    def setFile(value: VirtualGatewayTlsValidationContextFileTrust): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
