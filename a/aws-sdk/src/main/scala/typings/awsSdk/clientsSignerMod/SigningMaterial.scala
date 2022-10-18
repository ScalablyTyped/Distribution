package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SigningMaterial extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the certificates that is used to sign your code.
    */
  var certificateArn: CertificateArn
}
object SigningMaterial {
  
  inline def apply(certificateArn: CertificateArn): SigningMaterial = {
    val __obj = js.Dynamic.literal(certificateArn = certificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningMaterial]
  }
  
  extension [Self <: SigningMaterial](x: Self) {
    
    inline def setCertificateArn(value: CertificateArn): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
  }
}
