package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDataQualityRuleRecommendationRunResponse extends StObject {
  
  /**
    * The unique run identifier associated with this run.
    */
  var RunId: js.UndefOr[HashString] = js.undefined
}
object StartDataQualityRuleRecommendationRunResponse {
  
  inline def apply(): StartDataQualityRuleRecommendationRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDataQualityRuleRecommendationRunResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartDataQualityRuleRecommendationRunResponse] (val x: Self) extends AnyVal {
    
    inline def setRunId(value: HashString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
    
    inline def setRunIdUndefined: Self = StObject.set(x, "RunId", js.undefined)
  }
}
