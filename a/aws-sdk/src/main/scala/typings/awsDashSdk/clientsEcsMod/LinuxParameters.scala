package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinuxParameters extends js.Object {
  /**
    * The Linux capabilities for the container that are added to or dropped from the default configuration provided by Docker.  If you are using tasks that use the Fargate launch type, capabilities is supported but the add parameter is not supported. 
    */
  var capabilities: js.UndefOr[KernelCapabilities] = js.undefined
  /**
    * Any host devices to expose to the container. This parameter maps to Devices in the Create a container section of the Docker Remote API and the --device option to docker run.  If you are using tasks that use the Fargate launch type, the devices parameter is not supported. 
    */
  var devices: js.UndefOr[DevicesList] = js.undefined
  /**
    * Run an init process inside the container that forwards signals and reaps processes. This parameter maps to the --init option to docker run. This parameter requires version 1.25 of the Docker Remote API or greater on your container instance. To check the Docker Remote API version on your container instance, log in to your container instance and run the following command: sudo docker version --format '{{.Server.APIVersion}}' 
    */
  var initProcessEnabled: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * The value for the size (in MiB) of the /dev/shm volume. This parameter maps to the --shm-size option to docker run.  If you are using tasks that use the Fargate launch type, the sharedMemorySize parameter is not supported. 
    */
  var sharedMemorySize: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The container path, mount options, and size (in MiB) of the tmpfs mount. This parameter maps to the --tmpfs option to docker run.  If you are using tasks that use the Fargate launch type, the tmpfs parameter is not supported. 
    */
  var tmpfs: js.UndefOr[TmpfsList] = js.undefined
}

object LinuxParameters {
  @scala.inline
  def apply(
    capabilities: KernelCapabilities = null,
    devices: DevicesList = null,
    initProcessEnabled: js.UndefOr[BoxedBoolean] = js.undefined,
    sharedMemorySize: js.UndefOr[BoxedInteger] = js.undefined,
    tmpfs: TmpfsList = null
  ): LinuxParameters = {
    val __obj = js.Dynamic.literal()
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities)
    if (devices != null) __obj.updateDynamic("devices")(devices)
    if (!js.isUndefined(initProcessEnabled)) __obj.updateDynamic("initProcessEnabled")(initProcessEnabled)
    if (!js.isUndefined(sharedMemorySize)) __obj.updateDynamic("sharedMemorySize")(sharedMemorySize)
    if (tmpfs != null) __obj.updateDynamic("tmpfs")(tmpfs)
    __obj.asInstanceOf[LinuxParameters]
  }
}

