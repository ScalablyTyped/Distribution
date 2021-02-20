package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerTlsAcmCertificate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the certificate. The certificate must meet specific requirements and you must have proxy authorization enabled. For more information, see Transport Layer Security (TLS).
    */
  var certificateArn: Arn = js.native
}
object ListenerTlsAcmCertificate {
  
  @scala.inline
  def apply(certificateArn: Arn): ListenerTlsAcmCertificate = {
    val __obj = js.Dynamic.literal(certificateArn = certificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerTlsAcmCertificate]
  }
  
  @scala.inline
  implicit class ListenerTlsAcmCertificateMutableBuilder[Self <: ListenerTlsAcmCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: Arn): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
  }
}
