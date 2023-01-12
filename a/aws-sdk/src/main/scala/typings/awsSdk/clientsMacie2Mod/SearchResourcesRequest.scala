package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResourcesRequest extends StObject {
  
  /**
    * The filter conditions that determine which S3 buckets to include or exclude from the query results.
    */
  var bucketCriteria: js.UndefOr[SearchResourcesBucketCriteria] = js.undefined
  
  /**
    * The maximum number of items to include in each page of the response. The default value is 50.
    */
  var maxResults: js.UndefOr[integer] = js.undefined
  
  /**
    * The nextToken string that specifies which page of results to return in a paginated response.
    */
  var nextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The criteria to use to sort the results.
    */
  var sortCriteria: js.UndefOr[SearchResourcesSortCriteria] = js.undefined
}
object SearchResourcesRequest {
  
  inline def apply(): SearchResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResourcesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchResourcesRequest] (val x: Self) extends AnyVal {
    
    inline def setBucketCriteria(value: SearchResourcesBucketCriteria): Self = StObject.set(x, "bucketCriteria", value.asInstanceOf[js.Any])
    
    inline def setBucketCriteriaUndefined: Self = StObject.set(x, "bucketCriteria", js.undefined)
    
    inline def setMaxResults(value: integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSortCriteria(value: SearchResourcesSortCriteria): Self = StObject.set(x, "sortCriteria", value.asInstanceOf[js.Any])
    
    inline def setSortCriteriaUndefined: Self = StObject.set(x, "sortCriteria", js.undefined)
  }
}
