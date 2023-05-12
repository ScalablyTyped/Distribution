package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTaskProtectionResponse extends StObject {
  
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.undefined
  
  /**
    * A list of tasks with the following information.    taskArn: The task ARN.    protectionEnabled: The protection status of the task. If scale-in protection is turned on for a task, the value is true. Otherwise, it is false.    expirationDate: The epoch time when protection for the task will expire.  
    */
  var protectedTasks: js.UndefOr[ProtectedTasks] = js.undefined
}
object UpdateTaskProtectionResponse {
  
  inline def apply(): UpdateTaskProtectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTaskProtectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTaskProtectionResponse] (val x: Self) extends AnyVal {
    
    inline def setFailures(value: Failures): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    inline def setFailuresVarargs(value: Failure*): Self = StObject.set(x, "failures", js.Array(value*))
    
    inline def setProtectedTasks(value: ProtectedTasks): Self = StObject.set(x, "protectedTasks", value.asInstanceOf[js.Any])
    
    inline def setProtectedTasksUndefined: Self = StObject.set(x, "protectedTasks", js.undefined)
    
    inline def setProtectedTasksVarargs(value: ProtectedTask*): Self = StObject.set(x, "protectedTasks", js.Array(value*))
  }
}
