package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLicenseUsageResponse extends StObject {
  
  /**
    * License usage details.
    */
  var LicenseUsage: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.LicenseUsage] = js.undefined
}
object GetLicenseUsageResponse {
  
  inline def apply(): GetLicenseUsageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLicenseUsageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLicenseUsageResponse] (val x: Self) extends AnyVal {
    
    inline def setLicenseUsage(value: LicenseUsage): Self = StObject.set(x, "LicenseUsage", value.asInstanceOf[js.Any])
    
    inline def setLicenseUsageUndefined: Self = StObject.set(x, "LicenseUsage", js.undefined)
  }
}
