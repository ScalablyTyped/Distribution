package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntentClosingSetting extends StObject {
  
  /**
    * Specifies whether an intent's closing response is used. When this field is false, the closing response isn't sent to the user. If the active field isn't specified, the default is true.
    */
  var active: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The response that Amazon Lex sends to the user when the intent is complete.
    */
  var closingResponse: js.UndefOr[ResponseSpecification] = js.undefined
  
  /**
    * A list of conditional branches associated with the intent's closing response. These branches are executed when the nextStep attribute is set to EvalutateConditional.
    */
  var conditional: js.UndefOr[ConditionalSpecification] = js.undefined
  
  /**
    * Specifies the next step that the bot executes after playing the intent's closing response.
    */
  var nextStep: js.UndefOr[DialogState] = js.undefined
}
object IntentClosingSetting {
  
  inline def apply(): IntentClosingSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntentClosingSetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntentClosingSetting] (val x: Self) extends AnyVal {
    
    inline def setActive(value: BoxedBoolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setClosingResponse(value: ResponseSpecification): Self = StObject.set(x, "closingResponse", value.asInstanceOf[js.Any])
    
    inline def setClosingResponseUndefined: Self = StObject.set(x, "closingResponse", js.undefined)
    
    inline def setConditional(value: ConditionalSpecification): Self = StObject.set(x, "conditional", value.asInstanceOf[js.Any])
    
    inline def setConditionalUndefined: Self = StObject.set(x, "conditional", js.undefined)
    
    inline def setNextStep(value: DialogState): Self = StObject.set(x, "nextStep", value.asInstanceOf[js.Any])
    
    inline def setNextStepUndefined: Self = StObject.set(x, "nextStep", js.undefined)
  }
}
