package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTaskExecutionRequest extends StObject {
  
  var Options: typings.awsSdk.clientsDatasyncMod.Options
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the task execution that you're updating.
    */
  var TaskExecutionArn: typings.awsSdk.clientsDatasyncMod.TaskExecutionArn
}
object UpdateTaskExecutionRequest {
  
  inline def apply(Options: Options, TaskExecutionArn: TaskExecutionArn): UpdateTaskExecutionRequest = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], TaskExecutionArn = TaskExecutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTaskExecutionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTaskExecutionRequest] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: Options): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setTaskExecutionArn(value: TaskExecutionArn): Self = StObject.set(x, "TaskExecutionArn", value.asInstanceOf[js.Any])
  }
}
