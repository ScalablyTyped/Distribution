package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTaskExecutionResponse extends StObject {
  
  /**
    * The ARN of the running task execution.
    */
  var TaskExecutionArn: js.UndefOr[typings.awsSdk.clientsDatasyncMod.TaskExecutionArn] = js.undefined
}
object StartTaskExecutionResponse {
  
  inline def apply(): StartTaskExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTaskExecutionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartTaskExecutionResponse] (val x: Self) extends AnyVal {
    
    inline def setTaskExecutionArn(value: TaskExecutionArn): Self = StObject.set(x, "TaskExecutionArn", value.asInstanceOf[js.Any])
    
    inline def setTaskExecutionArnUndefined: Self = StObject.set(x, "TaskExecutionArn", js.undefined)
  }
}
