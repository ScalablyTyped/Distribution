package typings.awsSdk.clientsSnowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExecutionInput extends StObject {
  
  /**
    * The ID of the managed device.
    */
  var managedDeviceId: ManagedDeviceId
  
  /**
    * The ID of the task that the action is describing.
    */
  var taskId: TaskId
}
object DescribeExecutionInput {
  
  inline def apply(managedDeviceId: ManagedDeviceId, taskId: TaskId): DescribeExecutionInput = {
    val __obj = js.Dynamic.literal(managedDeviceId = managedDeviceId.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExecutionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeExecutionInput] (val x: Self) extends AnyVal {
    
    inline def setManagedDeviceId(value: ManagedDeviceId): Self = StObject.set(x, "managedDeviceId", value.asInstanceOf[js.Any])
    
    inline def setTaskId(value: TaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
