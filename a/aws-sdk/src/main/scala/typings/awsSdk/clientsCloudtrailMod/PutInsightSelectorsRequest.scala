package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutInsightSelectorsRequest extends StObject {
  
  /**
    * A JSON string that contains the insight types you want to log on a trail. ApiCallRateInsight and ApiErrorRateInsight are valid insight types.
    */
  var InsightSelectors: typings.awsSdk.clientsCloudtrailMod.InsightSelectors
  
  /**
    * The name of the CloudTrail trail for which you want to change or add Insights selectors.
    */
  var TrailName: String
}
object PutInsightSelectorsRequest {
  
  inline def apply(InsightSelectors: InsightSelectors, TrailName: String): PutInsightSelectorsRequest = {
    val __obj = js.Dynamic.literal(InsightSelectors = InsightSelectors.asInstanceOf[js.Any], TrailName = TrailName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutInsightSelectorsRequest]
  }
  
  extension [Self <: PutInsightSelectorsRequest](x: Self) {
    
    inline def setInsightSelectors(value: InsightSelectors): Self = StObject.set(x, "InsightSelectors", value.asInstanceOf[js.Any])
    
    inline def setInsightSelectorsVarargs(value: InsightSelector*): Self = StObject.set(x, "InsightSelectors", js.Array(value*))
    
    inline def setTrailName(value: String): Self = StObject.set(x, "TrailName", value.asInstanceOf[js.Any])
  }
}
