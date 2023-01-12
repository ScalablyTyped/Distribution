package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecommendationsRequest extends StObject {
  
  /**
    * Filters applied when retrieving recommendations. Can eiter be an individual filter, or combinations of STATUS and IMPACT or STATUS and TYPE 
    */
  var Filter: js.UndefOr[ListRecommendationsFilter] = js.undefined
  
  /**
    * A token returned from a previous call to ListRecommendations to indicate the position in the list of recommendations.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSesv2Mod.NextToken] = js.undefined
  
  /**
    * The number of results to show in a single call to ListRecommendations. If the number of results is larger than the number you specified in this parameter, then the response includes a NextToken element, which you can use to obtain additional results. The value you specify has to be at least 1, and can be no more than 100.
    */
  var PageSize: js.UndefOr[MaxItems] = js.undefined
}
object ListRecommendationsRequest {
  
  inline def apply(): ListRecommendationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecommendationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRecommendationsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: ListRecommendationsFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPageSize(value: MaxItems): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
  }
}
