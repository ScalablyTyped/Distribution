package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProjectsRequest extends StObject {
  
  /**
    * Information about filters to apply to narrow the results returned in the list.
    */
  var filters: js.UndefOr[ProjectListFilters] = js.undefined
  
  /**
    * The maximum number of results to show in a single call to this API. If the number of results is larger than the number you specified, the response will include a NextToken element, which you can use to obtain additional results.
    */
  var maxResults: js.UndefOr[ListProjectsRequestMaxResultsInteger] = js.undefined
  
  /**
    * A token returned from a call to this API to indicate the next batch of results to return, if any.
    */
  var nextToken: js.UndefOr[ListProjectsRequestNextTokenString] = js.undefined
  
  /**
    * The name of the space.
    */
  var spaceName: NameString
}
object ListProjectsRequest {
  
  inline def apply(spaceName: NameString): ListProjectsRequest = {
    val __obj = js.Dynamic.literal(spaceName = spaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProjectsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListProjectsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: ProjectListFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: ProjectListFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMaxResults(value: ListProjectsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: ListProjectsRequestNextTokenString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSpaceName(value: NameString): Self = StObject.set(x, "spaceName", value.asInstanceOf[js.Any])
  }
}
