package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCertificateRequest extends StObject {
  
  /**
    * The name of the certificate to delete. Use the GetCertificates action to get a list of certificate names that you can specify.
    */
  var certificateName: CertificateName
}
object DeleteCertificateRequest {
  
  inline def apply(certificateName: CertificateName): DeleteCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateName = certificateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCertificateRequest]
  }
  
  extension [Self <: DeleteCertificateRequest](x: Self) {
    
    inline def setCertificateName(value: CertificateName): Self = StObject.set(x, "certificateName", value.asInstanceOf[js.Any])
  }
}
