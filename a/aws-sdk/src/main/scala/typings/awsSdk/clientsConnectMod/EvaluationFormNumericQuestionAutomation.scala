package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationFormNumericQuestionAutomation extends StObject {
  
  /**
    * The property value of the automation.
    */
  var PropertyValue: js.UndefOr[NumericQuestionPropertyValueAutomation] = js.undefined
}
object EvaluationFormNumericQuestionAutomation {
  
  inline def apply(): EvaluationFormNumericQuestionAutomation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationFormNumericQuestionAutomation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationFormNumericQuestionAutomation] (val x: Self) extends AnyVal {
    
    inline def setPropertyValue(value: NumericQuestionPropertyValueAutomation): Self = StObject.set(x, "PropertyValue", value.asInstanceOf[js.Any])
    
    inline def setPropertyValueUndefined: Self = StObject.set(x, "PropertyValue", js.undefined)
  }
}
