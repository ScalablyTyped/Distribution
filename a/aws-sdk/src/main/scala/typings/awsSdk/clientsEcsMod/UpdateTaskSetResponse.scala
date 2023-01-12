package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTaskSetResponse extends StObject {
  
  /**
    * Details about the task set.
    */
  var taskSet: js.UndefOr[TaskSet] = js.undefined
}
object UpdateTaskSetResponse {
  
  inline def apply(): UpdateTaskSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTaskSetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTaskSetResponse] (val x: Self) extends AnyVal {
    
    inline def setTaskSet(value: TaskSet): Self = StObject.set(x, "taskSet", value.asInstanceOf[js.Any])
    
    inline def setTaskSetUndefined: Self = StObject.set(x, "taskSet", js.undefined)
  }
}
