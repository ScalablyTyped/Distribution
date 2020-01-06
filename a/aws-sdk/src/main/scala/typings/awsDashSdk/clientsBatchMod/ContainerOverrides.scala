package typings.awsDashSdk.clientsBatchMod

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
  def apply(
    command: StringList = null,
    environment: EnvironmentVariables = null,
    instanceType: String = null,
    memory: Int | Double = null,
    resourceRequirements: ResourceRequirements = null,
    vcpus: Int | Double = null
  ): ContainerOverrides = {
    val __obj = js.Dynamic.literal()
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (memory != null) __obj.updateDynamic("memory")(memory.asInstanceOf[js.Any])
    if (resourceRequirements != null) __obj.updateDynamic("resourceRequirements")(resourceRequirements.asInstanceOf[js.Any])
    if (vcpus != null) __obj.updateDynamic("vcpus")(vcpus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerOverrides]
  }
}

