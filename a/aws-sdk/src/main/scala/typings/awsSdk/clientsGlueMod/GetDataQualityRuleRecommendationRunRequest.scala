package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataQualityRuleRecommendationRunRequest extends StObject {
  
  /**
    * The unique run identifier associated with this run.
    */
  var RunId: HashString
}
object GetDataQualityRuleRecommendationRunRequest {
  
  inline def apply(RunId: HashString): GetDataQualityRuleRecommendationRunRequest = {
    val __obj = js.Dynamic.literal(RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataQualityRuleRecommendationRunRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDataQualityRuleRecommendationRunRequest] (val x: Self) extends AnyVal {
    
    inline def setRunId(value: HashString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
  }
}
