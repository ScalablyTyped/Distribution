package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobsRequest extends StObject {
  
  /**
    * Request to describe Job log filters.
    */
  var filters: js.UndefOr[DescribeJobsRequestFilters] = js.undefined
  
  /**
    * Request to describe job log items by max results.
    */
  var maxResults: js.UndefOr[StrictlyPositiveInteger] = js.undefined
  
  /**
    * Request to describe job log items by next token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeJobsRequest {
  
  inline def apply(): DescribeJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeJobsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: DescribeJobsRequestFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setMaxResults(value: StrictlyPositiveInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
