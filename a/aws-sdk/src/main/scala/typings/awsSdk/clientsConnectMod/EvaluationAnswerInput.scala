package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationAnswerInput extends StObject {
  
  /**
    * The value for an answer in a contact evaluation.
    */
  var Value: js.UndefOr[EvaluationAnswerData] = js.undefined
}
object EvaluationAnswerInput {
  
  inline def apply(): EvaluationAnswerInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationAnswerInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationAnswerInput] (val x: Self) extends AnyVal {
    
    inline def setValue(value: EvaluationAnswerData): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
