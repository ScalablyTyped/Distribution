package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSpotPriceHistoryResult extends StObject {
  
  /**
    * The token to include in another request to get the next page of items. This value is null when there are no more items to return.
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSpotPriceHistoryResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSpotPriceHistory(value: SpotPriceHistoryList): Self = StObject.set(x, "SpotPriceHistory", value.asInstanceOf[js.Any])
    
    inline def setSpotPriceHistoryUndefined: Self = StObject.set(x, "SpotPriceHistory", js.undefined)
    
    inline def setSpotPriceHistoryVarargs(value: SpotPrice*): Self = StObject.set(x, "SpotPriceHistory", js.Array(value*))
  }
}
