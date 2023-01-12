package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssociationsForLicenseConfigurationResponse extends StObject {
  
  /**
    * Information about the associations for the license configuration.
    */
  var LicenseConfigurationAssociations: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.LicenseConfigurationAssociations] = js.undefined
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListAssociationsForLicenseConfigurationResponse {
  
  inline def apply(): ListAssociationsForLicenseConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssociationsForLicenseConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAssociationsForLicenseConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setLicenseConfigurationAssociations(value: LicenseConfigurationAssociations): Self = StObject.set(x, "LicenseConfigurationAssociations", value.asInstanceOf[js.Any])
    
    inline def setLicenseConfigurationAssociationsUndefined: Self = StObject.set(x, "LicenseConfigurationAssociations", js.undefined)
    
    inline def setLicenseConfigurationAssociationsVarargs(value: LicenseConfigurationAssociation*): Self = StObject.set(x, "LicenseConfigurationAssociations", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
