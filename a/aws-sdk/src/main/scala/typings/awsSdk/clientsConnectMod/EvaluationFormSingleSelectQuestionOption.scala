package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationFormSingleSelectQuestionOption extends StObject {
  
  /**
    * The flag to mark the option as automatic fail. If an automatic fail answer is provided, the overall evaluation gets a score of 0.
    */
  var AutomaticFail: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The identifier of the answer option. An identifier must be unique within the question.
    */
  var RefId: ReferenceId
  
  /**
    * The score assigned to the answer option.
    */
  var Score: js.UndefOr[EvaluationFormQuestionAnswerScore] = js.undefined
  
  /**
    * The title of the answer option.
    */
  var Text: EvaluationFormSingleSelectQuestionOptionText
}
object EvaluationFormSingleSelectQuestionOption {
  
  inline def apply(RefId: ReferenceId, Text: EvaluationFormSingleSelectQuestionOptionText): EvaluationFormSingleSelectQuestionOption = {
    val __obj = js.Dynamic.literal(RefId = RefId.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationFormSingleSelectQuestionOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationFormSingleSelectQuestionOption] (val x: Self) extends AnyVal {
    
    inline def setAutomaticFail(value: Boolean): Self = StObject.set(x, "AutomaticFail", value.asInstanceOf[js.Any])
    
    inline def setAutomaticFailUndefined: Self = StObject.set(x, "AutomaticFail", js.undefined)
    
    inline def setRefId(value: ReferenceId): Self = StObject.set(x, "RefId", value.asInstanceOf[js.Any])
    
    inline def setScore(value: EvaluationFormQuestionAnswerScore): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
    
    inline def setText(value: EvaluationFormSingleSelectQuestionOptionText): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
