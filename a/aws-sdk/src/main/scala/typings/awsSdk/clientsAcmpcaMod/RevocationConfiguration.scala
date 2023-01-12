package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevocationConfiguration extends StObject {
  
  /**
    * Configuration of the certificate revocation list (CRL), if any, maintained by your private CA. A CRL is typically updated approximately 30 minutes after a certificate is revoked. If for any reason a CRL update fails, ACM Private CA makes further attempts every 15 minutes.
    */
  var CrlConfiguration: js.UndefOr[typings.awsSdk.clientsAcmpcaMod.CrlConfiguration] = js.undefined
  
  /**
    * Configuration of Online Certificate Status Protocol (OCSP) support, if any, maintained by your private CA. When you revoke a certificate, OCSP responses may take up to 60 minutes to reflect the new status.
    */
  var OcspConfiguration: js.UndefOr[typings.awsSdk.clientsAcmpcaMod.OcspConfiguration] = js.undefined
}
object RevocationConfiguration {
  
  inline def apply(): RevocationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevocationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RevocationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCrlConfiguration(value: CrlConfiguration): Self = StObject.set(x, "CrlConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCrlConfigurationUndefined: Self = StObject.set(x, "CrlConfiguration", js.undefined)
    
    inline def setOcspConfiguration(value: OcspConfiguration): Self = StObject.set(x, "OcspConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOcspConfigurationUndefined: Self = StObject.set(x, "OcspConfiguration", js.undefined)
  }
}
