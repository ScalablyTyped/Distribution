package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTaskResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the task.
    */
  var TaskArn: js.UndefOr[typings.awsSdk.clientsDatasyncMod.TaskArn] = js.undefined
}
object CreateTaskResponse {
  
  inline def apply(): CreateTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTaskResponse]
  }
  
  extension [Self <: CreateTaskResponse](x: Self) {
    
    inline def setTaskArn(value: TaskArn): Self = StObject.set(x, "TaskArn", value.asInstanceOf[js.Any])
    
    inline def setTaskArnUndefined: Self = StObject.set(x, "TaskArn", js.undefined)
  }
}
