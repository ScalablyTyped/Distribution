package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataQualityRulesetEvaluationRunRequest extends StObject {
  
  /**
    * The unique run identifier associated with this run.
    */
  var RunId: HashString
}
object GetDataQualityRulesetEvaluationRunRequest {
  
  inline def apply(RunId: HashString): GetDataQualityRulesetEvaluationRunRequest = {
    val __obj = js.Dynamic.literal(RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataQualityRulesetEvaluationRunRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDataQualityRulesetEvaluationRunRequest] (val x: Self) extends AnyVal {
    
    inline def setRunId(value: HashString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
  }
}
