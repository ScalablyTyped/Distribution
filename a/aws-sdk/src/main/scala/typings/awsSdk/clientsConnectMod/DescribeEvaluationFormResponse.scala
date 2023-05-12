package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEvaluationFormResponse extends StObject {
  
  /**
    * Information about the evaluation form.
    */
  var EvaluationForm: typings.awsSdk.clientsConnectMod.EvaluationForm
}
object DescribeEvaluationFormResponse {
  
  inline def apply(EvaluationForm: EvaluationForm): DescribeEvaluationFormResponse = {
    val __obj = js.Dynamic.literal(EvaluationForm = EvaluationForm.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEvaluationFormResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEvaluationFormResponse] (val x: Self) extends AnyVal {
    
    inline def setEvaluationForm(value: EvaluationForm): Self = StObject.set(x, "EvaluationForm", value.asInstanceOf[js.Any])
  }
}
