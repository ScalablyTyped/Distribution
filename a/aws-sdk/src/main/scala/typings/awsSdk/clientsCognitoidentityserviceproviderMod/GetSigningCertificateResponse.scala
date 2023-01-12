package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSigningCertificateResponse extends StObject {
  
  /**
    * The signing certificate.
    */
  var Certificate: js.UndefOr[StringType] = js.undefined
}
object GetSigningCertificateResponse {
  
  inline def apply(): GetSigningCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSigningCertificateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSigningCertificateResponse] (val x: Self) extends AnyVal {
    
    inline def setCertificate(value: StringType): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
  }
}
