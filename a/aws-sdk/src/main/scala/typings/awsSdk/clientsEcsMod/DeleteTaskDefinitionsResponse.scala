package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTaskDefinitionsResponse extends StObject {
  
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.undefined
  
  /**
    * The list of deleted task definitions.
    */
  var taskDefinitions: js.UndefOr[TaskDefinitionList] = js.undefined
}
object DeleteTaskDefinitionsResponse {
  
  inline def apply(): DeleteTaskDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTaskDefinitionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTaskDefinitionsResponse] (val x: Self) extends AnyVal {
    
    inline def setFailures(value: Failures): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    inline def setFailuresVarargs(value: Failure*): Self = StObject.set(x, "failures", js.Array(value*))
    
    inline def setTaskDefinitions(value: TaskDefinitionList): Self = StObject.set(x, "taskDefinitions", value.asInstanceOf[js.Any])
    
    inline def setTaskDefinitionsUndefined: Self = StObject.set(x, "taskDefinitions", js.undefined)
    
    inline def setTaskDefinitionsVarargs(value: TaskDefinition*): Self = StObject.set(x, "taskDefinitions", js.Array(value*))
  }
}
