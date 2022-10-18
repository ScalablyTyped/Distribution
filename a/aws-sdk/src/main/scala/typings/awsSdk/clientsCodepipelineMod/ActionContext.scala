package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionContext extends StObject {
  
  /**
    * The system-generated unique ID that corresponds to an action's execution.
    */
  var actionExecutionId: js.UndefOr[ActionExecutionId] = js.undefined
  
  /**
    * The name of the action in the context of a job.
    */
  var name: js.UndefOr[ActionName] = js.undefined
}
object ActionContext {
  
  inline def apply(): ActionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionContext]
  }
  
  extension [Self <: ActionContext](x: Self) {
    
    inline def setActionExecutionId(value: ActionExecutionId): Self = StObject.set(x, "actionExecutionId", value.asInstanceOf[js.Any])
    
    inline def setActionExecutionIdUndefined: Self = StObject.set(x, "actionExecutionId", js.undefined)
    
    inline def setName(value: ActionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
