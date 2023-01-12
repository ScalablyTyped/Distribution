package typings.awsSdk.clientsSnowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelTaskInput extends StObject {
  
  /**
    * The ID of the task that you are attempting to cancel. You can retrieve a task ID by using the ListTasks operation.
    */
  var taskId: TaskId
}
object CancelTaskInput {
  
  inline def apply(taskId: TaskId): CancelTaskInput = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelTaskInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelTaskInput] (val x: Self) extends AnyVal {
    
    inline def setTaskId(value: TaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
