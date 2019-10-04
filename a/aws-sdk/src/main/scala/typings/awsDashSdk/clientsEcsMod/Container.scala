package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the container.
    */
  var containerArn: js.UndefOr[String] = js.undefined
  /**
    * The number of CPU units set for the container. The value will be 0 if no value was specified in the container definition when the task definition was registered.
    */
  var cpu: js.UndefOr[String] = js.undefined
  /**
    * The exit code returned from the container.
    */
  var exitCode: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The IDs of each GPU assigned to the container.
    */
  var gpuIds: js.UndefOr[GpuIds] = js.undefined
  /**
    * The health status of the container. If health checks are not configured for this container in its task definition, then it reports the health status as UNKNOWN.
    */
  var healthStatus: js.UndefOr[HealthStatus] = js.undefined
  /**
    * The image used for the container.
    */
  var image: js.UndefOr[String] = js.undefined
  /**
    * The container image manifest digest.  The imageDigest is only returned if the container is using an image hosted in Amazon ECR, otherwise it is omitted. 
    */
  var imageDigest: js.UndefOr[String] = js.undefined
  /**
    * The last known status of the container.
    */
  var lastStatus: js.UndefOr[String] = js.undefined
  /**
    * The hard limit (in MiB) of memory set for the container.
    */
  var memory: js.UndefOr[String] = js.undefined
  /**
    * The soft limit (in MiB) of memory set for the container.
    */
  var memoryReservation: js.UndefOr[String] = js.undefined
  /**
    * The name of the container.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The network bindings associated with the container.
    */
  var networkBindings: js.UndefOr[NetworkBindings] = js.undefined
  /**
    * The network interfaces associated with the container.
    */
  var networkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined
  /**
    * A short (255 max characters) human-readable string to provide additional details about a running or stopped container.
    */
  var reason: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Docker container.
    */
  var runtimeId: js.UndefOr[String] = js.undefined
  /**
    * The ARN of the task.
    */
  var taskArn: js.UndefOr[String] = js.undefined
}

object Container {
  @scala.inline
  def apply(
    containerArn: String = null,
    cpu: String = null,
    exitCode: js.UndefOr[BoxedInteger] = js.undefined,
    gpuIds: GpuIds = null,
    healthStatus: HealthStatus = null,
    image: String = null,
    imageDigest: String = null,
    lastStatus: String = null,
    memory: String = null,
    memoryReservation: String = null,
    name: String = null,
    networkBindings: NetworkBindings = null,
    networkInterfaces: NetworkInterfaces = null,
    reason: String = null,
    runtimeId: String = null,
    taskArn: String = null
  ): Container = {
    val __obj = js.Dynamic.literal()
    if (containerArn != null) __obj.updateDynamic("containerArn")(containerArn)
    if (cpu != null) __obj.updateDynamic("cpu")(cpu)
    if (!js.isUndefined(exitCode)) __obj.updateDynamic("exitCode")(exitCode)
    if (gpuIds != null) __obj.updateDynamic("gpuIds")(gpuIds)
    if (healthStatus != null) __obj.updateDynamic("healthStatus")(healthStatus.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image)
    if (imageDigest != null) __obj.updateDynamic("imageDigest")(imageDigest)
    if (lastStatus != null) __obj.updateDynamic("lastStatus")(lastStatus)
    if (memory != null) __obj.updateDynamic("memory")(memory)
    if (memoryReservation != null) __obj.updateDynamic("memoryReservation")(memoryReservation)
    if (name != null) __obj.updateDynamic("name")(name)
    if (networkBindings != null) __obj.updateDynamic("networkBindings")(networkBindings)
    if (networkInterfaces != null) __obj.updateDynamic("networkInterfaces")(networkInterfaces)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (runtimeId != null) __obj.updateDynamic("runtimeId")(runtimeId)
    if (taskArn != null) __obj.updateDynamic("taskArn")(taskArn)
    __obj.asInstanceOf[Container]
  }
}

