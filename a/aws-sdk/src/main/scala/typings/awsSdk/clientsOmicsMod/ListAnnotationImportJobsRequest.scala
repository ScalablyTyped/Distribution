package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAnnotationImportJobsRequest extends StObject {
  
  /**
    * A filter to apply to the list.
    */
  var filter: js.UndefOr[ListAnnotationImportJobsFilter] = js.undefined
  
  /**
    * IDs of annotation import jobs to retrieve.
    */
  var ids: js.UndefOr[ListAnnotationImportJobsRequestIdsList] = js.undefined
  
  /**
    * The maximum number of jobs to return in one page of results.
    */
  var maxResults: js.UndefOr[ListAnnotationImportJobsRequestMaxResultsInteger] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var nextToken: js.UndefOr[ListAnnotationImportJobsRequestNextTokenString] = js.undefined
}
object ListAnnotationImportJobsRequest {
  
  inline def apply(): ListAnnotationImportJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAnnotationImportJobsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAnnotationImportJobsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: ListAnnotationImportJobsFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setIds(value: ListAnnotationImportJobsRequestIdsList): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: ResourceIdentifier*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setMaxResults(value: ListAnnotationImportJobsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: ListAnnotationImportJobsRequestNextTokenString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
