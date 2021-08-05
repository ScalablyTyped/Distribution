package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerTlsAcmCertificate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the certificate. The certificate must meet specific requirements and you must have proxy authorization enabled. For more information, see Transport Layer Security (TLS).
    */
  var certificateArn: Arn
}
object ListenerTlsAcmCertificate {
  
  inline def apply(certificateArn: Arn): ListenerTlsAcmCertificate = {
    val __obj = js.Dynamic.literal(certificateArn = certificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerTlsAcmCertificate]
  }
  
  extension [Self <: ListenerTlsAcmCertificate](x: Self) {
    
    inline def setCertificateArn(value: Arn): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
  }
}
