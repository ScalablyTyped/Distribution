package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReceivedGrantsRequest extends StObject {
  
  /**
    * Filters to scope the results. The following filters are supported:    ProductSKU     LicenseIssuerName     LicenseArn     GrantStatus     GranterAccountId   
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * Amazon Resource Names (ARNs) of the grants.
    */
  var GrantArns: js.UndefOr[ArnList] = js.undefined
  
  /**
    * Maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[MaxSize100] = js.undefined
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListReceivedGrantsRequest {
  
  inline def apply(): ListReceivedGrantsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReceivedGrantsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListReceivedGrantsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setGrantArns(value: ArnList): Self = StObject.set(x, "GrantArns", value.asInstanceOf[js.Any])
    
    inline def setGrantArnsUndefined: Self = StObject.set(x, "GrantArns", js.undefined)
    
    inline def setGrantArnsVarargs(value: Arn*): Self = StObject.set(x, "GrantArns", js.Array(value*))
    
    inline def setMaxResults(value: MaxSize100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
