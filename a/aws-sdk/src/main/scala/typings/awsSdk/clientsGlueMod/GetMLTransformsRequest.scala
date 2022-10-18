package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMLTransformsRequest extends StObject {
  
  /**
    * The filter transformation criteria.
    */
  var Filter: js.UndefOr[TransformFilterCriteria] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A paginated token to offset the results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The sorting criteria.
    */
  var Sort: js.UndefOr[TransformSortCriteria] = js.undefined
}
object GetMLTransformsRequest {
  
  inline def apply(): GetMLTransformsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMLTransformsRequest]
  }
  
  extension [Self <: GetMLTransformsRequest](x: Self) {
    
    inline def setFilter(value: TransformFilterCriteria): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSort(value: TransformSortCriteria): Self = StObject.set(x, "Sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "Sort", js.undefined)
  }
}
