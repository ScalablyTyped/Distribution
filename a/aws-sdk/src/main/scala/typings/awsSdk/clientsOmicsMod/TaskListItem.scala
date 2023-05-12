package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskListItem extends StObject {
  
  /**
    * The task's CPU count.
    */
  var cpus: js.UndefOr[TaskListItemCpusInteger] = js.undefined
  
  /**
    * When the task was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The number of Graphics Processing Units (GPU) specified for the task. 
    */
  var gpus: js.UndefOr[TaskListItemGpusInteger] = js.undefined
  
  /**
    * The task's memory use in gigabyes.
    */
  var memory: js.UndefOr[TaskListItemMemoryInteger] = js.undefined
  
  /**
    * The task's name.
    */
  var name: js.UndefOr[TaskName] = js.undefined
  
  /**
    * When the task started.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The task's status.
    */
  var status: js.UndefOr[TaskStatus] = js.undefined
  
  /**
    * When the task stopped.
    */
  var stopTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The task's ID.
    */
  var taskId: js.UndefOr[TaskId] = js.undefined
}
object TaskListItem {
  
  inline def apply(): TaskListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskListItem] (val x: Self) extends AnyVal {
    
    inline def setCpus(value: TaskListItemCpusInteger): Self = StObject.set(x, "cpus", value.asInstanceOf[js.Any])
    
    inline def setCpusUndefined: Self = StObject.set(x, "cpus", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setGpus(value: TaskListItemGpusInteger): Self = StObject.set(x, "gpus", value.asInstanceOf[js.Any])
    
    inline def setGpusUndefined: Self = StObject.set(x, "gpus", js.undefined)
    
    inline def setMemory(value: TaskListItemMemoryInteger): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    
    inline def setName(value: TaskName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: TaskStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStopTime(value: js.Date): Self = StObject.set(x, "stopTime", value.asInstanceOf[js.Any])
    
    inline def setStopTimeUndefined: Self = StObject.set(x, "stopTime", js.undefined)
    
    inline def setTaskId(value: TaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
  }
}
