package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterJobDefinitionRequest extends StObject {
  
  /**
    * The name and revision (name:revision) or full Amazon Resource Name (ARN) of the job definition to deregister.
    */
  var jobDefinition: String
}
object DeregisterJobDefinitionRequest {
  
  inline def apply(jobDefinition: String): DeregisterJobDefinitionRequest = {
    val __obj = js.Dynamic.literal(jobDefinition = jobDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterJobDefinitionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeregisterJobDefinitionRequest] (val x: Self) extends AnyVal {
    
    inline def setJobDefinition(value: String): Self = StObject.set(x, "jobDefinition", value.asInstanceOf[js.Any])
  }
}
