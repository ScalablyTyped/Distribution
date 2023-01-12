package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportCertificateResponse extends StObject {
  
  /**
    * The certificate to be uploaded.
    */
  var Certificate: js.UndefOr[typings.awsSdk.clientsDmsMod.Certificate] = js.undefined
}
object ImportCertificateResponse {
  
  inline def apply(): ImportCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportCertificateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportCertificateResponse] (val x: Self) extends AnyVal {
    
    inline def setCertificate(value: Certificate): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
  }
}
