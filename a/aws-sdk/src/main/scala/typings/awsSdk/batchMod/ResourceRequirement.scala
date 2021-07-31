package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceRequirement extends StObject {
  
  /**
    * The type of resource to assign to a container. Currently, the only supported resource type is GPU.
    */
  var `type`: ResourceType
  
  /**
    * The number of physical GPUs to reserve for the container. The number of GPUs reserved for all containers in a job should not exceed the number of available GPUs on the compute resource that the job is launched on.
    */
  var value: String
}
object ResourceRequirement {
  
  @scala.inline
  def apply(`type`: ResourceType, value: String): ResourceRequirement = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRequirement]
  }
  
  @scala.inline
  implicit class ResourceRequirementMutableBuilder[Self <: ResourceRequirement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ResourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
