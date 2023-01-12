package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeThingRegistrationTaskRequest extends StObject {
  
  /**
    * The task ID.
    */
  var taskId: TaskId
}
object DescribeThingRegistrationTaskRequest {
  
  inline def apply(taskId: TaskId): DescribeThingRegistrationTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeThingRegistrationTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeThingRegistrationTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setTaskId(value: TaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
