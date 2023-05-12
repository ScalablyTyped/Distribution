package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationFormSingleSelectQuestionAutomation extends StObject {
  
  /**
    * The identifier of the default answer option, when none of the automation options match the criteria.
    */
  var DefaultOptionRefId: js.UndefOr[ReferenceId] = js.undefined
  
  /**
    * The automation options of the single select question.
    */
  var Options: EvaluationFormSingleSelectQuestionAutomationOptionList
}
object EvaluationFormSingleSelectQuestionAutomation {
  
  inline def apply(Options: EvaluationFormSingleSelectQuestionAutomationOptionList): EvaluationFormSingleSelectQuestionAutomation = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationFormSingleSelectQuestionAutomation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationFormSingleSelectQuestionAutomation] (val x: Self) extends AnyVal {
    
    inline def setDefaultOptionRefId(value: ReferenceId): Self = StObject.set(x, "DefaultOptionRefId", value.asInstanceOf[js.Any])
    
    inline def setDefaultOptionRefIdUndefined: Self = StObject.set(x, "DefaultOptionRefId", js.undefined)
    
    inline def setOptions(value: EvaluationFormSingleSelectQuestionAutomationOptionList): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: EvaluationFormSingleSelectQuestionAutomationOption*): Self = StObject.set(x, "Options", js.Array(value*))
  }
}
