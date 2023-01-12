package typings.awsSdk.clientsSnowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExecutionOutput extends StObject {
  
  /**
    * The ID of the execution.
    */
  var executionId: js.UndefOr[ExecutionId] = js.undefined
  
  /**
    * When the status of the execution was last updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the managed device that the task is being executed on.
    */
  var managedDeviceId: js.UndefOr[ManagedDeviceId] = js.undefined
  
  /**
    * When the execution began.
    */
  var startedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current state of the execution.
    */
  var state: js.UndefOr[ExecutionState] = js.undefined
  
  /**
    * The ID of the task being executed on the device.
    */
  var taskId: js.UndefOr[TaskId] = js.undefined
}
object DescribeExecutionOutput {
  
  inline def apply(): DescribeExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExecutionOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeExecutionOutput] (val x: Self) extends AnyVal {
    
    inline def setExecutionId(value: ExecutionId): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setManagedDeviceId(value: ManagedDeviceId): Self = StObject.set(x, "managedDeviceId", value.asInstanceOf[js.Any])
    
    inline def setManagedDeviceIdUndefined: Self = StObject.set(x, "managedDeviceId", js.undefined)
    
    inline def setStartedAt(value: js.Date): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    inline def setStartedAtUndefined: Self = StObject.set(x, "startedAt", js.undefined)
    
    inline def setState(value: ExecutionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTaskId(value: TaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
  }
}
