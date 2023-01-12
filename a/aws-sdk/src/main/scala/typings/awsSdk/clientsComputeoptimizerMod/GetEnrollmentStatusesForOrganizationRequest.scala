package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEnrollmentStatusesForOrganizationRequest extends StObject {
  
  /**
    * An array of objects to specify a filter that returns a more specific list of account enrollment statuses.
    */
  var filters: js.UndefOr[EnrollmentFilters] = js.undefined
  
  /**
    * The maximum number of account enrollment statuses to return with a single request. You can specify up to 100 statuses to return with each request. To retrieve the remaining results, make another request with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token to advance to the next page of account enrollment statuses.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetEnrollmentStatusesForOrganizationRequest {
  
  inline def apply(): GetEnrollmentStatusesForOrganizationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEnrollmentStatusesForOrganizationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEnrollmentStatusesForOrganizationRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: EnrollmentFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: EnrollmentFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
