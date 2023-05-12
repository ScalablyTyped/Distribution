package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationFormSingleSelectQuestionProperties extends StObject {
  
  /**
    * The display mode of the single select question.
    */
  var Automation: js.UndefOr[EvaluationFormSingleSelectQuestionAutomation] = js.undefined
  
  /**
    * The display mode of the single select question.
    */
  var DisplayAs: js.UndefOr[EvaluationFormSingleSelectQuestionDisplayMode] = js.undefined
  
  /**
    * The answer options of the single select question.
    */
  var Options: EvaluationFormSingleSelectQuestionOptionList
}
object EvaluationFormSingleSelectQuestionProperties {
  
  inline def apply(Options: EvaluationFormSingleSelectQuestionOptionList): EvaluationFormSingleSelectQuestionProperties = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationFormSingleSelectQuestionProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationFormSingleSelectQuestionProperties] (val x: Self) extends AnyVal {
    
    inline def setAutomation(value: EvaluationFormSingleSelectQuestionAutomation): Self = StObject.set(x, "Automation", value.asInstanceOf[js.Any])
    
    inline def setAutomationUndefined: Self = StObject.set(x, "Automation", js.undefined)
    
    inline def setDisplayAs(value: EvaluationFormSingleSelectQuestionDisplayMode): Self = StObject.set(x, "DisplayAs", value.asInstanceOf[js.Any])
    
    inline def setDisplayAsUndefined: Self = StObject.set(x, "DisplayAs", js.undefined)
    
    inline def setOptions(value: EvaluationFormSingleSelectQuestionOptionList): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: EvaluationFormSingleSelectQuestionOption*): Self = StObject.set(x, "Options", js.Array(value*))
  }
}
