package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLicenseConversionTasksRequest extends StObject {
  
  /**
    *  Filters to scope the results. Valid filters are ResourceArns and Status. 
    */
  var Filters: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.Filters] = js.undefined
  
  /**
    * Maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[BoxInteger] = js.undefined
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListLicenseConversionTasksRequest {
  
  inline def apply(): ListLicenseConversionTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLicenseConversionTasksRequest]
  }
  
  extension [Self <: ListLicenseConversionTasksRequest](x: Self) {
    
    inline def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: BoxInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
