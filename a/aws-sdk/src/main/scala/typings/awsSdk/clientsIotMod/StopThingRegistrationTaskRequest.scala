package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopThingRegistrationTaskRequest extends StObject {
  
  /**
    * The bulk thing provisioning task ID.
    */
  var taskId: TaskId
}
object StopThingRegistrationTaskRequest {
  
  inline def apply(taskId: TaskId): StopThingRegistrationTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopThingRegistrationTaskRequest]
  }
  
  extension [Self <: StopThingRegistrationTaskRequest](x: Self) {
    
    inline def setTaskId(value: TaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
