package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchEvaluateFeatureResponse extends StObject {
  
  /**
    * An array of structures, where each structure displays the results of one feature evaluation assignment to one user session.
    */
  var results: js.UndefOr[EvaluationResultsList] = js.undefined
}
object BatchEvaluateFeatureResponse {
  
  inline def apply(): BatchEvaluateFeatureResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchEvaluateFeatureResponse]
  }
  
  extension [Self <: BatchEvaluateFeatureResponse](x: Self) {
    
    inline def setResults(value: EvaluationResultsList): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: EvaluationResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
