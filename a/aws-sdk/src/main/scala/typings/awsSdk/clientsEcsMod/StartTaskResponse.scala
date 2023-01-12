package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTaskResponse extends StObject {
  
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.undefined
  
  /**
    * A full description of the tasks that were started. Each task that was successfully placed on your container instances is described.
    */
  var tasks: js.UndefOr[Tasks] = js.undefined
}
object StartTaskResponse {
  
  inline def apply(): StartTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTaskResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartTaskResponse] (val x: Self) extends AnyVal {
    
    inline def setFailures(value: Failures): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    inline def setFailuresVarargs(value: Failure*): Self = StObject.set(x, "failures", js.Array(value*))
    
    inline def setTasks(value: Tasks): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    inline def setTasksVarargs(value: Task*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
