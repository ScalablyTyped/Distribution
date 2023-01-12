package typings.awsSdk.clientsSnowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelTaskOutput extends StObject {
  
  /**
    * The ID of the task that you are attempting to cancel.
    */
  var taskId: js.UndefOr[String] = js.undefined
}
object CancelTaskOutput {
  
  inline def apply(): CancelTaskOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelTaskOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelTaskOutput] (val x: Self) extends AnyVal {
    
    inline def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
  }
}
