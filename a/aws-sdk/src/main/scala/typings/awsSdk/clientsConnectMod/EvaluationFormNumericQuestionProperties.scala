package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationFormNumericQuestionProperties extends StObject {
  
  /**
    * The automation properties of the numeric question.
    */
  var Automation: js.UndefOr[EvaluationFormNumericQuestionAutomation] = js.undefined
  
  /**
    * The maximum answer value.
    */
  var MaxValue: Integer
  
  /**
    * The minimum answer value.
    */
  var MinValue: Integer
  
  /**
    * The scoring options of the numeric question.
    */
  var Options: js.UndefOr[EvaluationFormNumericQuestionOptionList] = js.undefined
}
object EvaluationFormNumericQuestionProperties {
  
  inline def apply(MaxValue: Integer, MinValue: Integer): EvaluationFormNumericQuestionProperties = {
    val __obj = js.Dynamic.literal(MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationFormNumericQuestionProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationFormNumericQuestionProperties] (val x: Self) extends AnyVal {
    
    inline def setAutomation(value: EvaluationFormNumericQuestionAutomation): Self = StObject.set(x, "Automation", value.asInstanceOf[js.Any])
    
    inline def setAutomationUndefined: Self = StObject.set(x, "Automation", js.undefined)
    
    inline def setMaxValue(value: Integer): Self = StObject.set(x, "MaxValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Integer): Self = StObject.set(x, "MinValue", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: EvaluationFormNumericQuestionOptionList): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setOptionsVarargs(value: EvaluationFormNumericQuestionOption*): Self = StObject.set(x, "Options", js.Array(value*))
  }
}
