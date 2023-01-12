package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLicenseSpecificationsForResourceResponse extends StObject {
  
  /**
    * License configurations associated with a resource.
    */
  var LicenseSpecifications: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.LicenseSpecifications] = js.undefined
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListLicenseSpecificationsForResourceResponse {
  
  inline def apply(): ListLicenseSpecificationsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLicenseSpecificationsForResourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLicenseSpecificationsForResourceResponse] (val x: Self) extends AnyVal {
    
    inline def setLicenseSpecifications(value: LicenseSpecifications): Self = StObject.set(x, "LicenseSpecifications", value.asInstanceOf[js.Any])
    
    inline def setLicenseSpecificationsUndefined: Self = StObject.set(x, "LicenseSpecifications", js.undefined)
    
    inline def setLicenseSpecificationsVarargs(value: LicenseSpecification*): Self = StObject.set(x, "LicenseSpecifications", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
