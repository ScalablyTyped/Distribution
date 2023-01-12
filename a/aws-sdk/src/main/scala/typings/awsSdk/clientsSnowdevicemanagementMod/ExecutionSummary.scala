package typings.awsSdk.clientsSnowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionSummary extends StObject {
  
  /**
    * The ID of the execution.
    */
  var executionId: js.UndefOr[ExecutionId] = js.undefined
  
  /**
    * The ID of the managed device that the task is being executed on.
    */
  var managedDeviceId: js.UndefOr[ManagedDeviceId] = js.undefined
  
  /**
    * The state of the execution.
    */
  var state: js.UndefOr[ExecutionState] = js.undefined
  
  /**
    * The ID of the task.
    */
  var taskId: js.UndefOr[TaskId] = js.undefined
}
object ExecutionSummary {
  
  inline def apply(): ExecutionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecutionSummary] (val x: Self) extends AnyVal {
    
    inline def setExecutionId(value: ExecutionId): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    inline def setManagedDeviceId(value: ManagedDeviceId): Self = StObject.set(x, "managedDeviceId", value.asInstanceOf[js.Any])
    
    inline def setManagedDeviceIdUndefined: Self = StObject.set(x, "managedDeviceId", js.undefined)
    
    inline def setState(value: ExecutionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTaskId(value: TaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
  }
}
