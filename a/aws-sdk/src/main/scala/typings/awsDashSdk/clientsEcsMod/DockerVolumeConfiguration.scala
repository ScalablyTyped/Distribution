package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DockerVolumeConfiguration extends js.Object {
  /**
    * If this value is true, the Docker volume is created if it does not already exist.  This field is only used if the scope is shared. 
    */
  var autoprovision: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * The Docker volume driver to use. The driver value must match the driver name provided by Docker because it is used for task placement. If the driver was installed using the Docker plugin CLI, use docker plugin ls to retrieve the driver name from your container instance. If the driver was installed using another method, use Docker plugin discovery to retrieve the driver name. For more information, see Docker plugin discovery. This parameter maps to Driver in the Create a volume section of the Docker Remote API and the xxdriver option to docker volume create.
    */
  var driver: js.UndefOr[String] = js.undefined
  /**
    * A map of Docker driver-specific options passed through. This parameter maps to DriverOpts in the Create a volume section of the Docker Remote API and the xxopt option to docker volume create.
    */
  var driverOpts: js.UndefOr[StringMap] = js.undefined
  /**
    * Custom metadata to add to your Docker volume. This parameter maps to Labels in the Create a volume section of the Docker Remote API and the xxlabel option to docker volume create.
    */
  var labels: js.UndefOr[StringMap] = js.undefined
  /**
    * The scope for the Docker volume that determines its lifecycle. Docker volumes that are scoped to a task are automatically provisioned when the task starts and destroyed when the task stops. Docker volumes that are scoped as shared persist after the task stops.
    */
  var scope: js.UndefOr[Scope] = js.undefined
}

object DockerVolumeConfiguration {
  @scala.inline
  def apply(
    autoprovision: js.UndefOr[BoxedBoolean] = js.undefined,
    driver: String = null,
    driverOpts: StringMap = null,
    labels: StringMap = null,
    scope: Scope = null
  ): DockerVolumeConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoprovision)) __obj.updateDynamic("autoprovision")(autoprovision)
    if (driver != null) __obj.updateDynamic("driver")(driver)
    if (driverOpts != null) __obj.updateDynamic("driverOpts")(driverOpts)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerVolumeConfiguration]
  }
}

