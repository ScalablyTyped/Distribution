package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckInLicenseRequest extends StObject {
  
  /**
    * License beneficiary.
    */
  var Beneficiary: js.UndefOr[String] = js.undefined
  
  /**
    * License consumption token.
    */
  var LicenseConsumptionToken: String
}
object CheckInLicenseRequest {
  
  inline def apply(LicenseConsumptionToken: String): CheckInLicenseRequest = {
    val __obj = js.Dynamic.literal(LicenseConsumptionToken = LicenseConsumptionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckInLicenseRequest]
  }
  
  extension [Self <: CheckInLicenseRequest](x: Self) {
    
    inline def setBeneficiary(value: String): Self = StObject.set(x, "Beneficiary", value.asInstanceOf[js.Any])
    
    inline def setBeneficiaryUndefined: Self = StObject.set(x, "Beneficiary", js.undefined)
    
    inline def setLicenseConsumptionToken(value: String): Self = StObject.set(x, "LicenseConsumptionToken", value.asInstanceOf[js.Any])
  }
}
