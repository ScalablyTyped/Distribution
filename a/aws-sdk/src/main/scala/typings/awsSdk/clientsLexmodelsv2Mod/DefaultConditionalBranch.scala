package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultConditionalBranch extends StObject {
  
  /**
    * The next step in the conversation.
    */
  var nextStep: js.UndefOr[DialogState] = js.undefined
  
  var response: js.UndefOr[ResponseSpecification] = js.undefined
}
object DefaultConditionalBranch {
  
  inline def apply(): DefaultConditionalBranch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultConditionalBranch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultConditionalBranch] (val x: Self) extends AnyVal {
    
    inline def setNextStep(value: DialogState): Self = StObject.set(x, "nextStep", value.asInstanceOf[js.Any])
    
    inline def setNextStepUndefined: Self = StObject.set(x, "nextStep", js.undefined)
    
    inline def setResponse(value: ResponseSpecification): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
