package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLicenseConfigurationsResponse extends StObject {
  
  /**
    * Information about the license configurations.
    */
  var LicenseConfigurations: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.LicenseConfigurations] = js.undefined
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListLicenseConfigurationsResponse {
  
  inline def apply(): ListLicenseConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLicenseConfigurationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLicenseConfigurationsResponse] (val x: Self) extends AnyVal {
    
    inline def setLicenseConfigurations(value: LicenseConfigurations): Self = StObject.set(x, "LicenseConfigurations", value.asInstanceOf[js.Any])
    
    inline def setLicenseConfigurationsUndefined: Self = StObject.set(x, "LicenseConfigurations", js.undefined)
    
    inline def setLicenseConfigurationsVarargs(value: LicenseConfiguration*): Self = StObject.set(x, "LicenseConfigurations", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
