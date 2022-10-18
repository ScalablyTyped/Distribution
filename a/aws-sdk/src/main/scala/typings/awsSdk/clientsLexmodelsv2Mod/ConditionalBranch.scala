package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalBranch extends StObject {
  
  /**
    * Contains the expression to evaluate. If the condition is true, the branch's actions are taken.
    */
  var condition: Condition
  
  /**
    * The name of the branch. 
    */
  var name: Name
  
  /**
    * The next step in the conversation.
    */
  var nextStep: DialogState
  
  var response: js.UndefOr[ResponseSpecification] = js.undefined
}
object ConditionalBranch {
  
  inline def apply(condition: Condition, name: Name, nextStep: DialogState): ConditionalBranch = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextStep = nextStep.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalBranch]
  }
  
  extension [Self <: ConditionalBranch](x: Self) {
    
    inline def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNextStep(value: DialogState): Self = StObject.set(x, "nextStep", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: ResponseSpecification): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
