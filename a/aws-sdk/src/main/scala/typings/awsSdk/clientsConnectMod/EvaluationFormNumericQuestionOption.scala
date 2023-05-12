package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationFormNumericQuestionOption extends StObject {
  
  /**
    * The flag to mark the option as automatic fail. If an automatic fail answer is provided, the overall evaluation gets a score of 0.
    */
  var AutomaticFail: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum answer value of the range option.
    */
  var MaxValue: Integer
  
  /**
    * The minimum answer value of the range option.
    */
  var MinValue: Integer
  
  /**
    * The score assigned to answer values within the range option.
    */
  var Score: js.UndefOr[EvaluationFormQuestionAnswerScore] = js.undefined
}
object EvaluationFormNumericQuestionOption {
  
  inline def apply(MaxValue: Integer, MinValue: Integer): EvaluationFormNumericQuestionOption = {
    val __obj = js.Dynamic.literal(MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationFormNumericQuestionOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationFormNumericQuestionOption] (val x: Self) extends AnyVal {
    
    inline def setAutomaticFail(value: Boolean): Self = StObject.set(x, "AutomaticFail", value.asInstanceOf[js.Any])
    
    inline def setAutomaticFailUndefined: Self = StObject.set(x, "AutomaticFail", js.undefined)
    
    inline def setMaxValue(value: Integer): Self = StObject.set(x, "MaxValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Integer): Self = StObject.set(x, "MinValue", value.asInstanceOf[js.Any])
    
    inline def setScore(value: EvaluationFormQuestionAnswerScore): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
  }
}
