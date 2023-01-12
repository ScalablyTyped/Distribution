package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReceivedGrantsForOrganizationRequest extends StObject {
  
  /**
    * Filters to scope the results. The following filters are supported:    ParentArn     GranteePrincipalArn   
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the received license.
    */
  var LicenseArn: Arn
  
  /**
    * Maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[MaxSize100] = js.undefined
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListReceivedGrantsForOrganizationRequest {
  
  inline def apply(LicenseArn: Arn): ListReceivedGrantsForOrganizationRequest = {
    val __obj = js.Dynamic.literal(LicenseArn = LicenseArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReceivedGrantsForOrganizationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListReceivedGrantsForOrganizationRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setLicenseArn(value: Arn): Self = StObject.set(x, "LicenseArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxSize100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
