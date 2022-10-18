package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterTaskDefinitionRequest extends StObject {
  
  /**
    * The family and revision (family:revision) or full Amazon Resource Name (ARN) of the task definition to deregister. You must specify a revision.
    */
  var taskDefinition: String
}
object DeregisterTaskDefinitionRequest {
  
  inline def apply(taskDefinition: String): DeregisterTaskDefinitionRequest = {
    val __obj = js.Dynamic.literal(taskDefinition = taskDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterTaskDefinitionRequest]
  }
  
  extension [Self <: DeregisterTaskDefinitionRequest](x: Self) {
    
    inline def setTaskDefinition(value: String): Self = StObject.set(x, "taskDefinition", value.asInstanceOf[js.Any])
  }
}
