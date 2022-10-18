package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskExecutionListEntry extends StObject {
  
  /**
    * The status of a task execution.
    */
  var Status: js.UndefOr[TaskExecutionStatus] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the task that was executed.
    */
  var TaskExecutionArn: js.UndefOr[typings.awsSdk.clientsDatasyncMod.TaskExecutionArn] = js.undefined
}
object TaskExecutionListEntry {
  
  inline def apply(): TaskExecutionListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskExecutionListEntry]
  }
  
  extension [Self <: TaskExecutionListEntry](x: Self) {
    
    inline def setStatus(value: TaskExecutionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTaskExecutionArn(value: TaskExecutionArn): Self = StObject.set(x, "TaskExecutionArn", value.asInstanceOf[js.Any])
    
    inline def setTaskExecutionArnUndefined: Self = StObject.set(x, "TaskExecutionArn", js.undefined)
  }
}
