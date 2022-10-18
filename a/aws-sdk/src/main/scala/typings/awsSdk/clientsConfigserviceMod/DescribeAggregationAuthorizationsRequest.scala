package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAggregationAuthorizationsRequest extends StObject {
  
  /**
    * The maximum number of AggregationAuthorizations returned on each page. The default is maximum. If you specify 0, Config uses the default.
    */
  var Limit: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.Limit] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeAggregationAuthorizationsRequest {
  
  inline def apply(): DescribeAggregationAuthorizationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAggregationAuthorizationsRequest]
  }
  
  extension [Self <: DescribeAggregationAuthorizationsRequest](x: Self) {
    
    inline def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
