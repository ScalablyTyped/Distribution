package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataViewsRequest extends StObject {
  
  /**
    * The unique identifier of the Dataset for which to retrieve Dataviews.
    */
  var datasetId: DatasetId
  
  /**
    * The maximum number of results per page.
    */
  var maxResults: js.UndefOr[ResultLimit] = js.undefined
  
  /**
    * A token that indicates where a results page should begin.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListDataViewsRequest {
  
  inline def apply(datasetId: DatasetId): ListDataViewsRequest = {
    val __obj = js.Dynamic.literal(datasetId = datasetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataViewsRequest]
  }
  
  extension [Self <: ListDataViewsRequest](x: Self) {
    
    inline def setDatasetId(value: DatasetId): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: ResultLimit): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
