package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationFormQuestion extends StObject {
  
  /**
    * The instructions of the section.
    */
  var Instructions: js.UndefOr[EvaluationFormQuestionInstructions] = js.undefined
  
  /**
    * The flag to enable not applicable answers to the question.
    */
  var NotApplicableEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of the question.
    */
  var QuestionType: EvaluationFormQuestionType
  
  /**
    * The properties of the type of question. Text questions do not have to define question type properties.
    */
  var QuestionTypeProperties: js.UndefOr[EvaluationFormQuestionTypeProperties] = js.undefined
  
  /**
    * The identifier of the question. An identifier must be unique within the evaluation form.
    */
  var RefId: ReferenceId
  
  /**
    * The title of the question.
    */
  var Title: EvaluationFormQuestionTitle
  
  /**
    * The scoring weight of the section.
    */
  var Weight: js.UndefOr[EvaluationFormItemWeight] = js.undefined
}
object EvaluationFormQuestion {
  
  inline def apply(QuestionType: EvaluationFormQuestionType, RefId: ReferenceId, Title: EvaluationFormQuestionTitle): EvaluationFormQuestion = {
    val __obj = js.Dynamic.literal(QuestionType = QuestionType.asInstanceOf[js.Any], RefId = RefId.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationFormQuestion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationFormQuestion] (val x: Self) extends AnyVal {
    
    inline def setInstructions(value: EvaluationFormQuestionInstructions): Self = StObject.set(x, "Instructions", value.asInstanceOf[js.Any])
    
    inline def setInstructionsUndefined: Self = StObject.set(x, "Instructions", js.undefined)
    
    inline def setNotApplicableEnabled(value: Boolean): Self = StObject.set(x, "NotApplicableEnabled", value.asInstanceOf[js.Any])
    
    inline def setNotApplicableEnabledUndefined: Self = StObject.set(x, "NotApplicableEnabled", js.undefined)
    
    inline def setQuestionType(value: EvaluationFormQuestionType): Self = StObject.set(x, "QuestionType", value.asInstanceOf[js.Any])
    
    inline def setQuestionTypeProperties(value: EvaluationFormQuestionTypeProperties): Self = StObject.set(x, "QuestionTypeProperties", value.asInstanceOf[js.Any])
    
    inline def setQuestionTypePropertiesUndefined: Self = StObject.set(x, "QuestionTypeProperties", js.undefined)
    
    inline def setRefId(value: ReferenceId): Self = StObject.set(x, "RefId", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: EvaluationFormQuestionTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: EvaluationFormItemWeight): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "Weight", js.undefined)
  }
}
