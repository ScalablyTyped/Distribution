package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceRequirement extends js.Object {
  /**
    * The type of resource to assign to a container. The supported values are GPU or InferenceAccelerator.
    */
  var `type`: ResourceType
  /**
    * The value for the specified resource type. If the GPU type is used, the value is the number of physical GPUs the Amazon ECS container agent will reserve for the container. The number of GPUs reserved for all containers in a task should not exceed the number of available GPUs on the container instance the task is launched on. If the InferenceAccelerator type is used, the value should match the deviceName for an InferenceAccelerator specified in a task definition.
    */
  var value: String
}

object ResourceRequirement {
  @scala.inline
  def apply(`type`: ResourceType, value: String): ResourceRequirement = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRequirement]
  }
}

