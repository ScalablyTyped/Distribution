package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImageScanFindingAggregationsRequest extends StObject {
  
  var filter: js.UndefOr[Filter] = js.undefined
  
  /**
    * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListImageScanFindingAggregationsRequest {
  
  inline def apply(): ListImageScanFindingAggregationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImageScanFindingAggregationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListImageScanFindingAggregationsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
