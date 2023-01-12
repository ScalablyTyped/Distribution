package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateActionTypeInput extends StObject {
  
  /**
    * The action type definition for the action type to be updated.
    */
  var actionType: ActionTypeDeclaration
}
object UpdateActionTypeInput {
  
  inline def apply(actionType: ActionTypeDeclaration): UpdateActionTypeInput = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateActionTypeInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateActionTypeInput] (val x: Self) extends AnyVal {
    
    inline def setActionType(value: ActionTypeDeclaration): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
  }
}
