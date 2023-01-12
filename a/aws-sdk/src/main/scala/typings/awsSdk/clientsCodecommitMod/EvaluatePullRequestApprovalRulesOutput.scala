package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluatePullRequestApprovalRulesOutput extends StObject {
  
  /**
    * The result of the evaluation, including the names of the rules whose conditions have been met (if any), the names of the rules whose conditions have not been met (if any), whether the pull request is in the approved state, and whether the pull request approval rule has been set aside by an override. 
    */
  var evaluation: Evaluation
}
object EvaluatePullRequestApprovalRulesOutput {
  
  inline def apply(evaluation: Evaluation): EvaluatePullRequestApprovalRulesOutput = {
    val __obj = js.Dynamic.literal(evaluation = evaluation.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluatePullRequestApprovalRulesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluatePullRequestApprovalRulesOutput] (val x: Self) extends AnyVal {
    
    inline def setEvaluation(value: Evaluation): Self = StObject.set(x, "evaluation", value.asInstanceOf[js.Any])
  }
}
