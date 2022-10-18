package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSpotPriceHistoryResult extends StObject {
  
  /**
    * The token required to retrieve the next set of results. This value is null or an empty string when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The historical Spot prices.
    */
  var SpotPriceHistory: js.UndefOr[SpotPriceHistoryList] = js.undefined
}
object DescribeSpotPriceHistoryResult {
  
  inline def apply(): DescribeSpotPriceHistoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSpotPriceHistoryResult]
  }
  
  extension [Self <: DescribeSpotPriceHistoryResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSpotPriceHistory(value: SpotPriceHistoryList): Self = StObject.set(x, "SpotPriceHistory", value.asInstanceOf[js.Any])
    
    inline def setSpotPriceHistoryUndefined: Self = StObject.set(x, "SpotPriceHistory", js.undefined)
    
    inline def setSpotPriceHistoryVarargs(value: SpotPrice*): Self = StObject.set(x, "SpotPriceHistory", js.Array(value*))
  }
}
