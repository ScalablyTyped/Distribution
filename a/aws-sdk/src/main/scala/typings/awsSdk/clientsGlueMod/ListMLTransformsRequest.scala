package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMLTransformsRequest extends StObject {
  
  /**
    * A TransformFilterCriteria used to filter the machine learning transforms.
    */
  var Filter: js.UndefOr[TransformFilterCriteria] = js.undefined
  
  /**
    * The maximum size of a list to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A continuation token, if this is a continuation request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * A TransformSortCriteria used to sort the machine learning transforms.
    */
  var Sort: js.UndefOr[TransformSortCriteria] = js.undefined
  
  /**
    * Specifies to return only these tagged resources.
    */
  var Tags: js.UndefOr[TagsMap] = js.undefined
}
object ListMLTransformsRequest {
  
  inline def apply(): ListMLTransformsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMLTransformsRequest]
  }
  
  extension [Self <: ListMLTransformsRequest](x: Self) {
    
    inline def setFilter(value: TransformFilterCriteria): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSort(value: TransformSortCriteria): Self = StObject.set(x, "Sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "Sort", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
