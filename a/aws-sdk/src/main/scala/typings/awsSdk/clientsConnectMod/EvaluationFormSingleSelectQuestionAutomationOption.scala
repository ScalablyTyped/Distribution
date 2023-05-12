package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationFormSingleSelectQuestionAutomationOption extends StObject {
  
  /**
    * The automation option based on a rule category for the single select question.
    */
  var RuleCategory: js.UndefOr[SingleSelectQuestionRuleCategoryAutomation] = js.undefined
}
object EvaluationFormSingleSelectQuestionAutomationOption {
  
  inline def apply(): EvaluationFormSingleSelectQuestionAutomationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationFormSingleSelectQuestionAutomationOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationFormSingleSelectQuestionAutomationOption] (val x: Self) extends AnyVal {
    
    inline def setRuleCategory(value: SingleSelectQuestionRuleCategoryAutomation): Self = StObject.set(x, "RuleCategory", value.asInstanceOf[js.Any])
    
    inline def setRuleCategoryUndefined: Self = StObject.set(x, "RuleCategory", js.undefined)
  }
}
