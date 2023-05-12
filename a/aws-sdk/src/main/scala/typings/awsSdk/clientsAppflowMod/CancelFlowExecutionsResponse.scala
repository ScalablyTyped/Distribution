package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelFlowExecutionsResponse extends StObject {
  
  /**
    * The IDs of runs that Amazon AppFlow couldn't cancel. These runs might be ineligible for canceling because they haven't started yet or have already completed.
    */
  var invalidExecutions: js.UndefOr[ExecutionIds] = js.undefined
}
object CancelFlowExecutionsResponse {
  
  inline def apply(): CancelFlowExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelFlowExecutionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelFlowExecutionsResponse] (val x: Self) extends AnyVal {
    
    inline def setInvalidExecutions(value: ExecutionIds): Self = StObject.set(x, "invalidExecutions", value.asInstanceOf[js.Any])
    
    inline def setInvalidExecutionsUndefined: Self = StObject.set(x, "invalidExecutions", js.undefined)
    
    inline def setInvalidExecutionsVarargs(value: ExecutionId*): Self = StObject.set(x, "invalidExecutions", js.Array(value*))
  }
}
