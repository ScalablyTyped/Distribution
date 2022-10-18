package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLicenseConfigurationsRequest extends StObject {
  
  /**
    * Filters to scope the results. The following filters and logical operators are supported:    licenseCountingType - The dimension for which licenses are counted. Possible values are vCPU | Instance | Core | Socket. Logical operators are EQUALS | NOT_EQUALS.    enforceLicenseCount - A Boolean value that indicates whether hard license enforcement is used. Logical operators are EQUALS | NOT_EQUALS.    usagelimitExceeded - A Boolean value that indicates whether the available licenses have been exceeded. Logical operators are EQUALS | NOT_EQUALS.  
    */
  var Filters: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.Filters] = js.undefined
  
  /**
    * Amazon Resource Names (ARN) of the license configurations.
    */
  var LicenseConfigurationArns: js.UndefOr[StringList] = js.undefined
  
  /**
    * Maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[BoxInteger] = js.undefined
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListLicenseConfigurationsRequest {
  
  inline def apply(): ListLicenseConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLicenseConfigurationsRequest]
  }
  
  extension [Self <: ListLicenseConfigurationsRequest](x: Self) {
    
    inline def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setLicenseConfigurationArns(value: StringList): Self = StObject.set(x, "LicenseConfigurationArns", value.asInstanceOf[js.Any])
    
    inline def setLicenseConfigurationArnsUndefined: Self = StObject.set(x, "LicenseConfigurationArns", js.undefined)
    
    inline def setLicenseConfigurationArnsVarargs(value: String*): Self = StObject.set(x, "LicenseConfigurationArns", js.Array(value*))
    
    inline def setMaxResults(value: BoxInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
