package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunTaskResponse extends StObject {
  
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.undefined
  
  /**
    * A full description of the tasks that were run. The tasks that were successfully placed on your cluster are described here.
    */
  var tasks: js.UndefOr[Tasks] = js.undefined
}
object RunTaskResponse {
  
  inline def apply(): RunTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunTaskResponse]
  }
  
  extension [Self <: RunTaskResponse](x: Self) {
    
    inline def setFailures(value: Failures): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    inline def setFailuresVarargs(value: Failure*): Self = StObject.set(x, "failures", js.Array(value*))
    
    inline def setTasks(value: Tasks): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    inline def setTasksVarargs(value: Task*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
