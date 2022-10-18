package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntentConfirmationSetting extends StObject {
  
  /**
    * Specifies whether the intent's confirmation is sent to the user. When this field is false, confirmation and declination responses aren't sent. If the active field isn't specified, the default is true.
    */
  var active: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The DialogCodeHookInvocationSetting object associated with intent's confirmation step. The dialog code hook is triggered based on these invocation settings when the confirmation next step or declination next step or failure next step is InvokeDialogCodeHook. 
    */
  var codeHook: js.UndefOr[DialogCodeHookInvocationSetting] = js.undefined
  
  /**
    * A list of conditional branches to evaluate after the intent is closed.
    */
  var confirmationConditional: js.UndefOr[ConditionalSpecification] = js.undefined
  
  /**
    * Specifies the next step that the bot executes when the customer confirms the intent.
    */
  var confirmationNextStep: js.UndefOr[DialogState] = js.undefined
  
  var confirmationResponse: js.UndefOr[ResponseSpecification] = js.undefined
  
  /**
    * A list of conditional branches to evaluate after the intent is declined.
    */
  var declinationConditional: js.UndefOr[ConditionalSpecification] = js.undefined
  
  /**
    * Specifies the next step that the bot executes when the customer declines the intent.
    */
  var declinationNextStep: js.UndefOr[DialogState] = js.undefined
  
  /**
    * When the user answers "no" to the question defined in promptSpecification, Amazon Lex responds with this response to acknowledge that the intent was canceled. 
    */
  var declinationResponse: js.UndefOr[ResponseSpecification] = js.undefined
  
  /**
    * The DialogCodeHookInvocationSetting used when the code hook is invoked during confirmation prompt retries.
    */
  var elicitationCodeHook: js.UndefOr[ElicitationCodeHookInvocationSetting] = js.undefined
  
  var failureConditional: js.UndefOr[ConditionalSpecification] = js.undefined
  
  /**
    * The next step to take in the conversation if the confirmation step fails.
    */
  var failureNextStep: js.UndefOr[DialogState] = js.undefined
  
  var failureResponse: js.UndefOr[ResponseSpecification] = js.undefined
  
  /**
    * Prompts the user to confirm the intent. This question should have a yes or no answer. Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready for fulfillment. For example, with the OrderPizza intent, you might want to confirm that the order is correct before placing it. For other intents, such as intents that simply respond to user questions, you might not need to ask the user for confirmation before providing the information. 
    */
  var promptSpecification: PromptSpecification
}
object IntentConfirmationSetting {
  
  inline def apply(promptSpecification: PromptSpecification): IntentConfirmationSetting = {
    val __obj = js.Dynamic.literal(promptSpecification = promptSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentConfirmationSetting]
  }
  
  extension [Self <: IntentConfirmationSetting](x: Self) {
    
    inline def setActive(value: BoxedBoolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setCodeHook(value: DialogCodeHookInvocationSetting): Self = StObject.set(x, "codeHook", value.asInstanceOf[js.Any])
    
    inline def setCodeHookUndefined: Self = StObject.set(x, "codeHook", js.undefined)
    
    inline def setConfirmationConditional(value: ConditionalSpecification): Self = StObject.set(x, "confirmationConditional", value.asInstanceOf[js.Any])
    
    inline def setConfirmationConditionalUndefined: Self = StObject.set(x, "confirmationConditional", js.undefined)
    
    inline def setConfirmationNextStep(value: DialogState): Self = StObject.set(x, "confirmationNextStep", value.asInstanceOf[js.Any])
    
    inline def setConfirmationNextStepUndefined: Self = StObject.set(x, "confirmationNextStep", js.undefined)
    
    inline def setConfirmationResponse(value: ResponseSpecification): Self = StObject.set(x, "confirmationResponse", value.asInstanceOf[js.Any])
    
    inline def setConfirmationResponseUndefined: Self = StObject.set(x, "confirmationResponse", js.undefined)
    
    inline def setDeclinationConditional(value: ConditionalSpecification): Self = StObject.set(x, "declinationConditional", value.asInstanceOf[js.Any])
    
    inline def setDeclinationConditionalUndefined: Self = StObject.set(x, "declinationConditional", js.undefined)
    
    inline def setDeclinationNextStep(value: DialogState): Self = StObject.set(x, "declinationNextStep", value.asInstanceOf[js.Any])
    
    inline def setDeclinationNextStepUndefined: Self = StObject.set(x, "declinationNextStep", js.undefined)
    
    inline def setDeclinationResponse(value: ResponseSpecification): Self = StObject.set(x, "declinationResponse", value.asInstanceOf[js.Any])
    
    inline def setDeclinationResponseUndefined: Self = StObject.set(x, "declinationResponse", js.undefined)
    
    inline def setElicitationCodeHook(value: ElicitationCodeHookInvocationSetting): Self = StObject.set(x, "elicitationCodeHook", value.asInstanceOf[js.Any])
    
    inline def setElicitationCodeHookUndefined: Self = StObject.set(x, "elicitationCodeHook", js.undefined)
    
    inline def setFailureConditional(value: ConditionalSpecification): Self = StObject.set(x, "failureConditional", value.asInstanceOf[js.Any])
    
    inline def setFailureConditionalUndefined: Self = StObject.set(x, "failureConditional", js.undefined)
    
    inline def setFailureNextStep(value: DialogState): Self = StObject.set(x, "failureNextStep", value.asInstanceOf[js.Any])
    
    inline def setFailureNextStepUndefined: Self = StObject.set(x, "failureNextStep", js.undefined)
    
    inline def setFailureResponse(value: ResponseSpecification): Self = StObject.set(x, "failureResponse", value.asInstanceOf[js.Any])
    
    inline def setFailureResponseUndefined: Self = StObject.set(x, "failureResponse", js.undefined)
    
    inline def setPromptSpecification(value: PromptSpecification): Self = StObject.set(x, "promptSpecification", value.asInstanceOf[js.Any])
  }
}
