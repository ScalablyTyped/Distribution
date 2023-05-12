package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationFormItem extends StObject {
  
  /**
    * The information of the question.
    */
  var Question: js.UndefOr[EvaluationFormQuestion] = js.undefined
  
  /**
    * The information of the section.
    */
  var Section: js.UndefOr[EvaluationFormSection] = js.undefined
}
object EvaluationFormItem {
  
  inline def apply(): EvaluationFormItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationFormItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationFormItem] (val x: Self) extends AnyVal {
    
    inline def setQuestion(value: EvaluationFormQuestion): Self = StObject.set(x, "Question", value.asInstanceOf[js.Any])
    
    inline def setQuestionUndefined: Self = StObject.set(x, "Question", js.undefined)
    
    inline def setSection(value: EvaluationFormSection): Self = StObject.set(x, "Section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "Section", js.undefined)
  }
}
