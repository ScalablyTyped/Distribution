package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInsightSelectorsResponse extends StObject {
  
  /**
    * A JSON string that contains the insight types you want to log on a trail. In this release, ApiErrorRateInsight and ApiCallRateInsight are supported as insight types.
    */
  var InsightSelectors: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.InsightSelectors] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a trail for which you want to get Insights selectors.
    */
  var TrailARN: js.UndefOr[String] = js.undefined
}
object GetInsightSelectorsResponse {
  
  inline def apply(): GetInsightSelectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInsightSelectorsResponse]
  }
  
  extension [Self <: GetInsightSelectorsResponse](x: Self) {
    
    inline def setInsightSelectors(value: InsightSelectors): Self = StObject.set(x, "InsightSelectors", value.asInstanceOf[js.Any])
    
    inline def setInsightSelectorsUndefined: Self = StObject.set(x, "InsightSelectors", js.undefined)
    
    inline def setInsightSelectorsVarargs(value: InsightSelector*): Self = StObject.set(x, "InsightSelectors", js.Array(value*))
    
    inline def setTrailARN(value: String): Self = StObject.set(x, "TrailARN", value.asInstanceOf[js.Any])
    
    inline def setTrailARNUndefined: Self = StObject.set(x, "TrailARN", js.undefined)
  }
}
