package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerOverride extends js.Object {
  /**
    * The command to send to the container that overrides the default command from the Docker image or the task definition. You must also specify a container name.
    */
  var command: js.UndefOr[StringList] = js.undefined
  /**
    * The number of cpu units reserved for the container, instead of the default value from the task definition. You must also specify a container name.
    */
  var cpu: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The environment variables to send to the container. You can add new environment variables, which are added to the container at launch, or you can override the existing environment variables from the Docker image or the task definition. You must also specify a container name.
    */
  var environment: js.UndefOr[EnvironmentVariables] = js.undefined
  /**
    * The hard limit (in MiB) of memory to present to the container, instead of the default value from the task definition. If your container attempts to exceed the memory specified here, the container is killed. You must also specify a container name.
    */
  var memory: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The soft limit (in MiB) of memory to reserve for the container, instead of the default value from the task definition. You must also specify a container name.
    */
  var memoryReservation: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The name of the container that receives the override. This parameter is required if any override is specified.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The type and amount of a resource to assign to a container, instead of the default value from the task definition. The only supported resource is a GPU.
    */
  var resourceRequirements: js.UndefOr[ResourceRequirements] = js.undefined
}

object ContainerOverride {
  @scala.inline
  def apply(
    command: StringList = null,
    cpu: js.UndefOr[BoxedInteger] = js.undefined,
    environment: EnvironmentVariables = null,
    memory: js.UndefOr[BoxedInteger] = js.undefined,
    memoryReservation: js.UndefOr[BoxedInteger] = js.undefined,
    name: String = null,
    resourceRequirements: ResourceRequirements = null
  ): ContainerOverride = {
    val __obj = js.Dynamic.literal()
    if (command != null) __obj.updateDynamic("command")(command)
    if (!js.isUndefined(cpu)) __obj.updateDynamic("cpu")(cpu)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (!js.isUndefined(memory)) __obj.updateDynamic("memory")(memory)
    if (!js.isUndefined(memoryReservation)) __obj.updateDynamic("memoryReservation")(memoryReservation)
    if (name != null) __obj.updateDynamic("name")(name)
    if (resourceRequirements != null) __obj.updateDynamic("resourceRequirements")(resourceRequirements)
    __obj.asInstanceOf[ContainerOverride]
  }
}

