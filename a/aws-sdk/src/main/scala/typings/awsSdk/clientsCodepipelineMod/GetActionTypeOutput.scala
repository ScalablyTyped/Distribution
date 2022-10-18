package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetActionTypeOutput extends StObject {
  
  /**
    * The action type information for the requested action type, such as the action type ID.
    */
  var actionType: js.UndefOr[ActionTypeDeclaration] = js.undefined
}
object GetActionTypeOutput {
  
  inline def apply(): GetActionTypeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetActionTypeOutput]
  }
  
  extension [Self <: GetActionTypeOutput](x: Self) {
    
    inline def setActionType(value: ActionTypeDeclaration): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
  }
}
