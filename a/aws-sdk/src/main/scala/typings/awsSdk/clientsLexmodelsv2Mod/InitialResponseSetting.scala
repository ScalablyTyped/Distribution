package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialResponseSetting extends StObject {
  
  var codeHook: js.UndefOr[DialogCodeHookInvocationSetting] = js.undefined
  
  var conditional: js.UndefOr[ConditionalSpecification] = js.undefined
  
  var initialResponse: js.UndefOr[ResponseSpecification] = js.undefined
  
  /**
    * The next step in the conversation.
    */
  var nextStep: js.UndefOr[DialogState] = js.undefined
}
object InitialResponseSetting {
  
  inline def apply(): InitialResponseSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialResponseSetting]
  }
  
  extension [Self <: InitialResponseSetting](x: Self) {
    
    inline def setCodeHook(value: DialogCodeHookInvocationSetting): Self = StObject.set(x, "codeHook", value.asInstanceOf[js.Any])
    
    inline def setCodeHookUndefined: Self = StObject.set(x, "codeHook", js.undefined)
    
    inline def setConditional(value: ConditionalSpecification): Self = StObject.set(x, "conditional", value.asInstanceOf[js.Any])
    
    inline def setConditionalUndefined: Self = StObject.set(x, "conditional", js.undefined)
    
    inline def setInitialResponse(value: ResponseSpecification): Self = StObject.set(x, "initialResponse", value.asInstanceOf[js.Any])
    
    inline def setInitialResponseUndefined: Self = StObject.set(x, "initialResponse", js.undefined)
    
    inline def setNextStep(value: DialogState): Self = StObject.set(x, "nextStep", value.asInstanceOf[js.Any])
    
    inline def setNextStepUndefined: Self = StObject.set(x, "nextStep", js.undefined)
  }
}
