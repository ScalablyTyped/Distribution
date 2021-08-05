package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayListenerTlsCertificate extends StObject {
  
  /**
    * A reference to an object that represents an AWS Certicate Manager (ACM) certificate.
    */
  var acm: js.UndefOr[VirtualGatewayListenerTlsAcmCertificate] = js.undefined
  
  /**
    * A reference to an object that represents a local file certificate.
    */
  var file: js.UndefOr[VirtualGatewayListenerTlsFileCertificate] = js.undefined
}
object VirtualGatewayListenerTlsCertificate {
  
  inline def apply(): VirtualGatewayListenerTlsCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewayListenerTlsCertificate]
  }
  
  extension [Self <: VirtualGatewayListenerTlsCertificate](x: Self) {
    
    inline def setAcm(value: VirtualGatewayListenerTlsAcmCertificate): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    inline def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    inline def setFile(value: VirtualGatewayListenerTlsFileCertificate): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
