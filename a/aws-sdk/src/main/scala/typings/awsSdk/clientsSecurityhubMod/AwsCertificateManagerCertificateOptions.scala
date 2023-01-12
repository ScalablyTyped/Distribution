package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCertificateManagerCertificateOptions extends StObject {
  
  /**
    * Whether to add the certificate to a transparency log. Valid values: DISABLED | ENABLED 
    */
  var CertificateTransparencyLoggingPreference: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCertificateManagerCertificateOptions {
  
  inline def apply(): AwsCertificateManagerCertificateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCertificateManagerCertificateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsCertificateManagerCertificateOptions] (val x: Self) extends AnyVal {
    
    inline def setCertificateTransparencyLoggingPreference(value: NonEmptyString): Self = StObject.set(x, "CertificateTransparencyLoggingPreference", value.asInstanceOf[js.Any])
    
    inline def setCertificateTransparencyLoggingPreferenceUndefined: Self = StObject.set(x, "CertificateTransparencyLoggingPreference", js.undefined)
  }
}
