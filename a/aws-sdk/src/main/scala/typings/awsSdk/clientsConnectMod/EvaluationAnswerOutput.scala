package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationAnswerOutput extends StObject {
  
  /**
    * The system suggested value for an answer in a contact evaluation.
    */
  var SystemSuggestedValue: js.UndefOr[EvaluationAnswerData] = js.undefined
  
  /**
    * The value for an answer in a contact evaluation.
    */
  var Value: js.UndefOr[EvaluationAnswerData] = js.undefined
}
object EvaluationAnswerOutput {
  
  inline def apply(): EvaluationAnswerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationAnswerOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationAnswerOutput] (val x: Self) extends AnyVal {
    
    inline def setSystemSuggestedValue(value: EvaluationAnswerData): Self = StObject.set(x, "SystemSuggestedValue", value.asInstanceOf[js.Any])
    
    inline def setSystemSuggestedValueUndefined: Self = StObject.set(x, "SystemSuggestedValue", js.undefined)
    
    inline def setValue(value: EvaluationAnswerData): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
