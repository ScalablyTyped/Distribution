package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateMappingTemplateResponse extends StObject {
  
  /**
    * The ErrorDetail object.
    */
  var error: js.UndefOr[ErrorDetail] = js.undefined
  
  /**
    * The mapping template; this can be a request or response template.
    */
  var evaluationResult: js.UndefOr[EvaluationResult] = js.undefined
}
object EvaluateMappingTemplateResponse {
  
  inline def apply(): EvaluateMappingTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluateMappingTemplateResponse]
  }
  
  extension [Self <: EvaluateMappingTemplateResponse](x: Self) {
    
    inline def setError(value: ErrorDetail): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setEvaluationResult(value: EvaluationResult): Self = StObject.set(x, "evaluationResult", value.asInstanceOf[js.Any])
    
    inline def setEvaluationResultUndefined: Self = StObject.set(x, "evaluationResult", js.undefined)
  }
}
