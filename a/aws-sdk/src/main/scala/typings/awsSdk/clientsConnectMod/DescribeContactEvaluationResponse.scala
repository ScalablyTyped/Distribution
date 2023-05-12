package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeContactEvaluationResponse extends StObject {
  
  /**
    * Information about the evaluation form completed for a specific contact.
    */
  var Evaluation: typings.awsSdk.clientsConnectMod.Evaluation
  
  /**
    * Information about the evaluation form.
    */
  var EvaluationForm: EvaluationFormContent
}
object DescribeContactEvaluationResponse {
  
  inline def apply(Evaluation: Evaluation, EvaluationForm: EvaluationFormContent): DescribeContactEvaluationResponse = {
    val __obj = js.Dynamic.literal(Evaluation = Evaluation.asInstanceOf[js.Any], EvaluationForm = EvaluationForm.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeContactEvaluationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeContactEvaluationResponse] (val x: Self) extends AnyVal {
    
    inline def setEvaluation(value: Evaluation): Self = StObject.set(x, "Evaluation", value.asInstanceOf[js.Any])
    
    inline def setEvaluationForm(value: EvaluationFormContent): Self = StObject.set(x, "EvaluationForm", value.asInstanceOf[js.Any])
  }
}
