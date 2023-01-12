package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCertificateResponse extends StObject {
  
  /**
    * The Secure Sockets Layer (SSL) certificate.
    */
  var Certificate: js.UndefOr[typings.awsSdk.clientsDmsMod.Certificate] = js.undefined
}
object DeleteCertificateResponse {
  
  inline def apply(): DeleteCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCertificateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCertificateResponse] (val x: Self) extends AnyVal {
    
    inline def setCertificate(value: Certificate): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
  }
}
