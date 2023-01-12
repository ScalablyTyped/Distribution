package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCoverageRequest extends StObject {
  
  /**
    * An object that contains details on the filters to apply to the coverage data for your environment.
    */
  var filterCriteria: js.UndefOr[CoverageFilterCriteria] = js.undefined
  
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[ListCoverageMaxResults] = js.undefined
  
  /**
    * A token to use for paginating results that are returned in the response. Set the value of this parameter to null for the first request to a list action. For subsequent calls, use the NextToken value returned from the previous request to continue listing results after the first page.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListCoverageRequest {
  
  inline def apply(): ListCoverageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCoverageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCoverageRequest] (val x: Self) extends AnyVal {
    
    inline def setFilterCriteria(value: CoverageFilterCriteria): Self = StObject.set(x, "filterCriteria", value.asInstanceOf[js.Any])
    
    inline def setFilterCriteriaUndefined: Self = StObject.set(x, "filterCriteria", js.undefined)
    
    inline def setMaxResults(value: ListCoverageMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
