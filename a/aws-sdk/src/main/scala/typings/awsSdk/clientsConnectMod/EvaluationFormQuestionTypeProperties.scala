package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationFormQuestionTypeProperties extends StObject {
  
  /**
    * The properties of the numeric question.
    */
  var Numeric: js.UndefOr[EvaluationFormNumericQuestionProperties] = js.undefined
  
  /**
    * The properties of the numeric question.
    */
  var SingleSelect: js.UndefOr[EvaluationFormSingleSelectQuestionProperties] = js.undefined
}
object EvaluationFormQuestionTypeProperties {
  
  inline def apply(): EvaluationFormQuestionTypeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationFormQuestionTypeProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationFormQuestionTypeProperties] (val x: Self) extends AnyVal {
    
    inline def setNumeric(value: EvaluationFormNumericQuestionProperties): Self = StObject.set(x, "Numeric", value.asInstanceOf[js.Any])
    
    inline def setNumericUndefined: Self = StObject.set(x, "Numeric", js.undefined)
    
    inline def setSingleSelect(value: EvaluationFormSingleSelectQuestionProperties): Self = StObject.set(x, "SingleSelect", value.asInstanceOf[js.Any])
    
    inline def setSingleSelectUndefined: Self = StObject.set(x, "SingleSelect", js.undefined)
  }
}
