package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReferenceImportJobsRequest extends StObject {
  
  /**
    * A filter to apply to the list.
    */
  var filter: js.UndefOr[ImportReferenceFilter] = js.undefined
  
  /**
    * The maximum number of jobs to return in one page of results.
    */
  var maxResults: js.UndefOr[ListReferenceImportJobsRequestMaxResultsInteger] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The job's reference store ID.
    */
  var referenceStoreId: ReferenceStoreId
}
object ListReferenceImportJobsRequest {
  
  inline def apply(referenceStoreId: ReferenceStoreId): ListReferenceImportJobsRequest = {
    val __obj = js.Dynamic.literal(referenceStoreId = referenceStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReferenceImportJobsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListReferenceImportJobsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: ImportReferenceFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMaxResults(value: ListReferenceImportJobsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setReferenceStoreId(value: ReferenceStoreId): Self = StObject.set(x, "referenceStoreId", value.asInstanceOf[js.Any])
  }
}
