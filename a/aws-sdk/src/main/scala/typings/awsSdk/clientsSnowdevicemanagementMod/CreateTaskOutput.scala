package typings.awsSdk.clientsSnowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTaskOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the task that you created.
    */
  var taskArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the task that you created.
    */
  var taskId: js.UndefOr[String] = js.undefined
}
object CreateTaskOutput {
  
  inline def apply(): CreateTaskOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTaskOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTaskOutput] (val x: Self) extends AnyVal {
    
    inline def setTaskArn(value: String): Self = StObject.set(x, "taskArn", value.asInstanceOf[js.Any])
    
    inline def setTaskArnUndefined: Self = StObject.set(x, "taskArn", js.undefined)
    
    inline def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
  }
}
