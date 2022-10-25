package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelTaskExecutionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the task execution to stop.
    */
  var TaskExecutionArn: typings.awsSdk.clientsDatasyncMod.TaskExecutionArn
}
object CancelTaskExecutionRequest {
  
  inline def apply(TaskExecutionArn: TaskExecutionArn): CancelTaskExecutionRequest = {
    val __obj = js.Dynamic.literal(TaskExecutionArn = TaskExecutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelTaskExecutionRequest]
  }
  
  extension [Self <: CancelTaskExecutionRequest](x: Self) {
    
    inline def setTaskExecutionArn(value: TaskExecutionArn): Self = StObject.set(x, "TaskExecutionArn", value.asInstanceOf[js.Any])
  }
}
