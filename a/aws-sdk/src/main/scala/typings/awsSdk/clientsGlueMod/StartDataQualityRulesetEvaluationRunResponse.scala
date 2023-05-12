package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDataQualityRulesetEvaluationRunResponse extends StObject {
  
  /**
    * The unique run identifier associated with this run.
    */
  var RunId: js.UndefOr[HashString] = js.undefined
}
object StartDataQualityRulesetEvaluationRunResponse {
  
  inline def apply(): StartDataQualityRulesetEvaluationRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDataQualityRulesetEvaluationRunResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartDataQualityRulesetEvaluationRunResponse] (val x: Self) extends AnyVal {
    
    inline def setRunId(value: HashString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
    
    inline def setRunIdUndefined: Self = StObject.set(x, "RunId", js.undefined)
  }
}
