package typings.awsSdk.clientsDatapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskObject extends StObject {
  
  /**
    * The ID of the pipeline task attempt object. AWS Data Pipeline uses this value to track how many times a task is attempted.
    */
  var attemptId: js.UndefOr[id] = js.undefined
  
  /**
    * Connection information for the location where the task runner will publish the output of the task.
    */
  var objects: js.UndefOr[PipelineObjectMap] = js.undefined
  
  /**
    * The ID of the pipeline that provided the task.
    */
  var pipelineId: js.UndefOr[id] = js.undefined
  
  /**
    * An internal identifier for the task. This ID is passed to the SetTaskStatus and ReportTaskProgress actions.
    */
  var taskId: js.UndefOr[typings.awsSdk.clientsDatapipelineMod.taskId] = js.undefined
}
object TaskObject {
  
  inline def apply(): TaskObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskObject] (val x: Self) extends AnyVal {
    
    inline def setAttemptId(value: id): Self = StObject.set(x, "attemptId", value.asInstanceOf[js.Any])
    
    inline def setAttemptIdUndefined: Self = StObject.set(x, "attemptId", js.undefined)
    
    inline def setObjects(value: PipelineObjectMap): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
    
    inline def setPipelineId(value: id): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
    
    inline def setPipelineIdUndefined: Self = StObject.set(x, "pipelineId", js.undefined)
    
    inline def setTaskId(value: taskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
  }
}
