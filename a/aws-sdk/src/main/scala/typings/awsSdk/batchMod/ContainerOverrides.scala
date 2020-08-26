package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerOverrides extends js.Object {
  /**
    * The command to send to the container that overrides the default command from the Docker image or the job definition.
    */
  var command: js.UndefOr[StringList] = js.native
  /**
    * The environment variables to send to the container. You can add new environment variables, which are added to the container at launch, or you can override the existing environment variables from the Docker image or the job definition.  Environment variables must not start with AWS_BATCH; this naming convention is reserved for variables that are set by the AWS Batch service. 
    */
  var environment: js.UndefOr[EnvironmentVariables] = js.native
  /**
    * The instance type to use for a multi-node parallel job. This parameter is not valid for single-node container jobs.
    */
  var instanceType: js.UndefOr[String] = js.native
  /**
    * The number of MiB of memory reserved for the job. This value overrides the value set in the job definition.
    */
  var memory: js.UndefOr[Integer] = js.native
  /**
    * The type and amount of a resource to assign to a container. This value overrides the value set in the job definition. Currently, the only supported resource is GPU.
    */
  var resourceRequirements: js.UndefOr[ResourceRequirements] = js.native
  /**
    * The number of vCPUs to reserve for the container. This value overrides the value set in the job definition.
    */
  var vcpus: js.UndefOr[Integer] = js.native
}

object ContainerOverrides {
  @scala.inline
  def apply(): ContainerOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerOverrides]
  }
  @scala.inline
  implicit class ContainerOverridesOps[Self <: ContainerOverrides] (val x: Self) extends AnyVal {
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
    def setCommandVarargs(value: String*): Self = this.set("command", js.Array(value :_*))
    @scala.inline
    def setCommand(value: StringList): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    @scala.inline
    def setEnvironmentVarargs(value: KeyValuePair*): Self = this.set("environment", js.Array(value :_*))
    @scala.inline
    def setEnvironment(value: EnvironmentVariables): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    @scala.inline
    def setInstanceType(value: String): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("instanceType", js.undefined)
    @scala.inline
    def setMemory(value: Integer): Self = this.set("memory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemory: Self = this.set("memory", js.undefined)
    @scala.inline
    def setResourceRequirementsVarargs(value: ResourceRequirement*): Self = this.set("resourceRequirements", js.Array(value :_*))
    @scala.inline
    def setResourceRequirements(value: ResourceRequirements): Self = this.set("resourceRequirements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceRequirements: Self = this.set("resourceRequirements", js.undefined)
    @scala.inline
    def setVcpus(value: Integer): Self = this.set("vcpus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVcpus: Self = this.set("vcpus", js.undefined)
  }
  
}

