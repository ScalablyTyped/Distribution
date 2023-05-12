package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRunTaskResponse extends StObject {
  
  /**
    * The task's CPU usage.
    */
  var cpus: js.UndefOr[GetRunTaskResponseCpusInteger] = js.undefined
  
  /**
    * When the task was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The number of Graphics Processing Units (GPU) specified in the task. 
    */
  var gpus: js.UndefOr[GetRunTaskResponseGpusInteger] = js.undefined
  
  /**
    * The task's log stream.
    */
  var logStream: js.UndefOr[TaskLogStream] = js.undefined
  
  /**
    * The task's memory use in gigabytes.
    */
  var memory: js.UndefOr[GetRunTaskResponseMemoryInteger] = js.undefined
  
  /**
    * The task's name.
    */
  var name: js.UndefOr[TaskName] = js.undefined
  
  /**
    * The task's start time.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The task's status.
    */
  var status: js.UndefOr[TaskStatus] = js.undefined
  
  /**
    * The task's status message.
    */
  var statusMessage: js.UndefOr[TaskStatusMessage] = js.undefined
  
  /**
    * The task's stop time.
    */
  var stopTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The task's ID.
    */
  var taskId: js.UndefOr[TaskId] = js.undefined
}
object GetRunTaskResponse {
  
  inline def apply(): GetRunTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRunTaskResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRunTaskResponse] (val x: Self) extends AnyVal {
    
    inline def setCpus(value: GetRunTaskResponseCpusInteger): Self = StObject.set(x, "cpus", value.asInstanceOf[js.Any])
    
    inline def setCpusUndefined: Self = StObject.set(x, "cpus", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setGpus(value: GetRunTaskResponseGpusInteger): Self = StObject.set(x, "gpus", value.asInstanceOf[js.Any])
    
    inline def setGpusUndefined: Self = StObject.set(x, "gpus", js.undefined)
    
    inline def setLogStream(value: TaskLogStream): Self = StObject.set(x, "logStream", value.asInstanceOf[js.Any])
    
    inline def setLogStreamUndefined: Self = StObject.set(x, "logStream", js.undefined)
    
    inline def setMemory(value: GetRunTaskResponseMemoryInteger): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    
    inline def setName(value: TaskName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: TaskStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: TaskStatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStopTime(value: js.Date): Self = StObject.set(x, "stopTime", value.asInstanceOf[js.Any])
    
    inline def setStopTimeUndefined: Self = StObject.set(x, "stopTime", js.undefined)
    
    inline def setTaskId(value: TaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
  }
}
