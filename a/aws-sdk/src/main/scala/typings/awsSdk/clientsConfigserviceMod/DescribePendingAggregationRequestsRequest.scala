package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePendingAggregationRequestsRequest extends StObject {
  
  /**
    * The maximum number of evaluation results returned on each page. The default is maximum. If you specify 0, Config uses the default.
    */
  var Limit: js.UndefOr[DescribePendingAggregationRequestsLimit] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribePendingAggregationRequestsRequest {
  
  inline def apply(): DescribePendingAggregationRequestsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePendingAggregationRequestsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribePendingAggregationRequestsRequest] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: DescribePendingAggregationRequestsLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
