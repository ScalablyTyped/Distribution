package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewayListenerTlsAcmCertificate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the certificate. The certificate must meet specific requirements and you must have proxy authorization enabled. For more information, see Transport Layer Security (TLS).
    */
  var certificateArn: Arn = js.native
}
object VirtualGatewayListenerTlsAcmCertificate {
  
  @scala.inline
  def apply(certificateArn: Arn): VirtualGatewayListenerTlsAcmCertificate = {
    val __obj = js.Dynamic.literal(certificateArn = certificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayListenerTlsAcmCertificate]
  }
  
  @scala.inline
  implicit class VirtualGatewayListenerTlsAcmCertificateMutableBuilder[Self <: VirtualGatewayListenerTlsAcmCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: Arn): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
  }
}
