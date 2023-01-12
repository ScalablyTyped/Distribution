package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationResult extends StObject {
  
  /**
    * The F1 score for the evaluation of all labels. The F1 score metric evaluates the overall precision and recall performance of the model as a single value. A higher value indicates better precision and recall performance. A lower score indicates that precision, recall, or both are performing poorly. 
    */
  var F1Score: js.UndefOr[Float] = js.undefined
  
  /**
    * The S3 bucket that contains the training summary.
    */
  var Summary: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Summary] = js.undefined
}
object EvaluationResult {
  
  inline def apply(): EvaluationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationResult] (val x: Self) extends AnyVal {
    
    inline def setF1Score(value: Float): Self = StObject.set(x, "F1Score", value.asInstanceOf[js.Any])
    
    inline def setF1ScoreUndefined: Self = StObject.set(x, "F1Score", js.undefined)
    
    inline def setSummary(value: Summary): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "Summary", js.undefined)
  }
}
