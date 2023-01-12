package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostDialogCodeHookInvocationSpecification extends StObject {
  
  /**
    * A list of conditional branches to evaluate after the dialog code hook throws an exception or returns with the State field of the Intent object set to Failed.
    */
  var failureConditional: js.UndefOr[ConditionalSpecification] = js.undefined
  
  /**
    * Specifies the next step the bot runs after the dialog code hook throws an exception or returns with the State field of the Intent object set to Failed.
    */
  var failureNextStep: js.UndefOr[DialogState] = js.undefined
  
  var failureResponse: js.UndefOr[ResponseSpecification] = js.undefined
  
  /**
    * A list of conditional branches to evaluate after the dialog code hook finishes successfully.
    */
  var successConditional: js.UndefOr[ConditionalSpecification] = js.undefined
  
  /**
    * Specifics the next step the bot runs after the dialog code hook finishes successfully. 
    */
  var successNextStep: js.UndefOr[DialogState] = js.undefined
  
  var successResponse: js.UndefOr[ResponseSpecification] = js.undefined
  
  /**
    * A list of conditional branches to evaluate if the code hook times out.
    */
  var timeoutConditional: js.UndefOr[ConditionalSpecification] = js.undefined
  
  /**
    * Specifies the next step that the bot runs when the code hook times out.
    */
  var timeoutNextStep: js.UndefOr[DialogState] = js.undefined
  
  var timeoutResponse: js.UndefOr[ResponseSpecification] = js.undefined
}
object PostDialogCodeHookInvocationSpecification {
  
  inline def apply(): PostDialogCodeHookInvocationSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostDialogCodeHookInvocationSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostDialogCodeHookInvocationSpecification] (val x: Self) extends AnyVal {
    
    inline def setFailureConditional(value: ConditionalSpecification): Self = StObject.set(x, "failureConditional", value.asInstanceOf[js.Any])
    
    inline def setFailureConditionalUndefined: Self = StObject.set(x, "failureConditional", js.undefined)
    
    inline def setFailureNextStep(value: DialogState): Self = StObject.set(x, "failureNextStep", value.asInstanceOf[js.Any])
    
    inline def setFailureNextStepUndefined: Self = StObject.set(x, "failureNextStep", js.undefined)
    
    inline def setFailureResponse(value: ResponseSpecification): Self = StObject.set(x, "failureResponse", value.asInstanceOf[js.Any])
    
    inline def setFailureResponseUndefined: Self = StObject.set(x, "failureResponse", js.undefined)
    
    inline def setSuccessConditional(value: ConditionalSpecification): Self = StObject.set(x, "successConditional", value.asInstanceOf[js.Any])
    
    inline def setSuccessConditionalUndefined: Self = StObject.set(x, "successConditional", js.undefined)
    
    inline def setSuccessNextStep(value: DialogState): Self = StObject.set(x, "successNextStep", value.asInstanceOf[js.Any])
    
    inline def setSuccessNextStepUndefined: Self = StObject.set(x, "successNextStep", js.undefined)
    
    inline def setSuccessResponse(value: ResponseSpecification): Self = StObject.set(x, "successResponse", value.asInstanceOf[js.Any])
    
    inline def setSuccessResponseUndefined: Self = StObject.set(x, "successResponse", js.undefined)
    
    inline def setTimeoutConditional(value: ConditionalSpecification): Self = StObject.set(x, "timeoutConditional", value.asInstanceOf[js.Any])
    
    inline def setTimeoutConditionalUndefined: Self = StObject.set(x, "timeoutConditional", js.undefined)
    
    inline def setTimeoutNextStep(value: DialogState): Self = StObject.set(x, "timeoutNextStep", value.asInstanceOf[js.Any])
    
    inline def setTimeoutNextStepUndefined: Self = StObject.set(x, "timeoutNextStep", js.undefined)
    
    inline def setTimeoutResponse(value: ResponseSpecification): Self = StObject.set(x, "timeoutResponse", value.asInstanceOf[js.Any])
    
    inline def setTimeoutResponseUndefined: Self = StObject.set(x, "timeoutResponse", js.undefined)
  }
}
