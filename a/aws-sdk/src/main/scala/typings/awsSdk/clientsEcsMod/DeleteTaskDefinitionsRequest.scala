package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTaskDefinitionsRequest extends StObject {
  
  /**
    * The family and revision (family:revision) or full Amazon Resource Name (ARN) of the task definition to delete. You must specify a revision. You can specify up to 10 task definitions as a comma separated list.
    */
  var taskDefinitions: StringList
}
object DeleteTaskDefinitionsRequest {
  
  inline def apply(taskDefinitions: StringList): DeleteTaskDefinitionsRequest = {
    val __obj = js.Dynamic.literal(taskDefinitions = taskDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTaskDefinitionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTaskDefinitionsRequest] (val x: Self) extends AnyVal {
    
    inline def setTaskDefinitions(value: StringList): Self = StObject.set(x, "taskDefinitions", value.asInstanceOf[js.Any])
    
    inline def setTaskDefinitionsVarargs(value: String*): Self = StObject.set(x, "taskDefinitions", js.Array(value*))
  }
}
