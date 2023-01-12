package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEvaluationsRequest extends StObject {
  
  /**
    * The assessments that the Lambda function performs. Each evaluation identifies an Amazon Web Services resource and indicates whether it complies with the Config rule that invokes the Lambda function.
    */
  var Evaluations: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.Evaluations] = js.undefined
  
  /**
    * An encrypted token that associates an evaluation with an Config rule. Identifies the rule and the event that triggered the evaluation.
    */
  var ResultToken: String
  
  /**
    * Use this parameter to specify a test run for PutEvaluations. You can verify whether your Lambda function will deliver evaluation results to Config. No updates occur to your existing evaluations, and evaluation results are not sent to Config.  When TestMode is true, PutEvaluations doesn't require a valid value for the ResultToken parameter, but the value cannot be null. 
    */
  var TestMode: js.UndefOr[Boolean] = js.undefined
}
object PutEvaluationsRequest {
  
  inline def apply(ResultToken: String): PutEvaluationsRequest = {
    val __obj = js.Dynamic.literal(ResultToken = ResultToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEvaluationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutEvaluationsRequest] (val x: Self) extends AnyVal {
    
    inline def setEvaluations(value: Evaluations): Self = StObject.set(x, "Evaluations", value.asInstanceOf[js.Any])
    
    inline def setEvaluationsUndefined: Self = StObject.set(x, "Evaluations", js.undefined)
    
    inline def setEvaluationsVarargs(value: Evaluation*): Self = StObject.set(x, "Evaluations", js.Array(value*))
    
    inline def setResultToken(value: String): Self = StObject.set(x, "ResultToken", value.asInstanceOf[js.Any])
    
    inline def setTestMode(value: Boolean): Self = StObject.set(x, "TestMode", value.asInstanceOf[js.Any])
    
    inline def setTestModeUndefined: Self = StObject.set(x, "TestMode", js.undefined)
  }
}
