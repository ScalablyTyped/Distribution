package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceRequirement extends js.Object {
  /**
    * The type of resource to assign to a container. Currently, the only supported resource type is GPU.
    */
  var `type`: ResourceType = js.native
  /**
    * The number of physical GPUs to reserve for the container. The number of GPUs reserved for all containers in a job should not exceed the number of available GPUs on the compute resource that the job is launched on.
    */
  var value: String = js.native
}

object ResourceRequirement {
  @scala.inline
  def apply(`type`: ResourceType, value: String): ResourceRequirement = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRequirement]
  }
  @scala.inline
  implicit class ResourceRequirementOps[Self <: ResourceRequirement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: ResourceType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

