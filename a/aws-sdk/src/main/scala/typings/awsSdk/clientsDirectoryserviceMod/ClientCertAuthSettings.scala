package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientCertAuthSettings extends StObject {
  
  /**
    * Specifies the URL of the default OCSP server used to check for revocation status. A secondary value to any OCSP address found in the AIA extension of the user certificate.
    */
  var OCSPUrl: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.OCSPUrl] = js.undefined
}
object ClientCertAuthSettings {
  
  inline def apply(): ClientCertAuthSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientCertAuthSettings]
  }
  
  extension [Self <: ClientCertAuthSettings](x: Self) {
    
    inline def setOCSPUrl(value: OCSPUrl): Self = StObject.set(x, "OCSPUrl", value.asInstanceOf[js.Any])
    
    inline def setOCSPUrlUndefined: Self = StObject.set(x, "OCSPUrl", js.undefined)
  }
}
