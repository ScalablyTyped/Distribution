package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourceEvaluationsRequest extends StObject {
  
  /**
    * Returns a ResourceEvaluationFilters object.
    */
  var Filters: js.UndefOr[ResourceEvaluationFilters] = js.undefined
  
  /**
    * The maximum number of evaluations returned on each page. The default is 10. You cannot specify a number greater than 100. If you specify 0, Config uses the default.
    */
  var Limit: js.UndefOr[ListResourceEvaluationsPageItemLimit] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListResourceEvaluationsRequest {
  
  inline def apply(): ListResourceEvaluationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceEvaluationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResourceEvaluationsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: ResourceEvaluationFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setLimit(value: ListResourceEvaluationsPageItemLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
