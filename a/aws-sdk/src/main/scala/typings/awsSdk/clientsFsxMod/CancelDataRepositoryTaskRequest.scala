package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelDataRepositoryTaskRequest extends StObject {
  
  /**
    * Specifies the data repository task to cancel.
    */
  var TaskId: typings.awsSdk.clientsFsxMod.TaskId
}
object CancelDataRepositoryTaskRequest {
  
  inline def apply(TaskId: TaskId): CancelDataRepositoryTaskRequest = {
    val __obj = js.Dynamic.literal(TaskId = TaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelDataRepositoryTaskRequest]
  }
  
  extension [Self <: CancelDataRepositoryTaskRequest](x: Self) {
    
    inline def setTaskId(value: TaskId): Self = StObject.set(x, "TaskId", value.asInstanceOf[js.Any])
  }
}
