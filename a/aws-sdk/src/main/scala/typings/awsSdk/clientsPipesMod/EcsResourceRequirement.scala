package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcsResourceRequirement extends StObject {
  
  /**
    * The type of resource to assign to a container. The supported values are GPU or InferenceAccelerator.
    */
  var `type`: EcsResourceRequirementType
  
  /**
    * The value for the specified resource type. If the GPU type is used, the value is the number of physical GPUs the Amazon ECS container agent reserves for the container. The number of GPUs that's reserved for all containers in a task can't exceed the number of available GPUs on the container instance that the task is launched on. If the InferenceAccelerator type is used, the value matches the deviceName for an InferenceAccelerator specified in a task definition.
    */
  var value: String
}
object EcsResourceRequirement {
  
  inline def apply(`type`: EcsResourceRequirementType, value: String): EcsResourceRequirement = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcsResourceRequirement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EcsResourceRequirement] (val x: Self) extends AnyVal {
    
    inline def setType(value: EcsResourceRequirementType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
