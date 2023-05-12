package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRunTaskRequest extends StObject {
  
  /**
    * The task's ID.
    */
  var id: RunId
  
  /**
    * The task's ID.
    */
  var taskId: TaskId
}
object GetRunTaskRequest {
  
  inline def apply(id: RunId, taskId: TaskId): GetRunTaskRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRunTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRunTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: RunId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTaskId(value: TaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
