package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAggregationAuthorizationsResponse extends StObject {
  
  /**
    * Returns a list of authorizations granted to various aggregator accounts and regions.
    */
  var AggregationAuthorizations: js.UndefOr[AggregationAuthorizationList] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeAggregationAuthorizationsResponse {
  
  inline def apply(): DescribeAggregationAuthorizationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAggregationAuthorizationsResponse]
  }
  
  extension [Self <: DescribeAggregationAuthorizationsResponse](x: Self) {
    
    inline def setAggregationAuthorizations(value: AggregationAuthorizationList): Self = StObject.set(x, "AggregationAuthorizations", value.asInstanceOf[js.Any])
    
    inline def setAggregationAuthorizationsUndefined: Self = StObject.set(x, "AggregationAuthorizations", js.undefined)
    
    inline def setAggregationAuthorizationsVarargs(value: AggregationAuthorization*): Self = StObject.set(x, "AggregationAuthorizations", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
