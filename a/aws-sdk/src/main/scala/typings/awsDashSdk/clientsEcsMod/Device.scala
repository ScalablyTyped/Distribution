package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  /**
    * The path inside the container at which to expose the host device.
    */
  var containerPath: js.UndefOr[String] = js.undefined
  /**
    * The path for the device on the host container instance.
    */
  var hostPath: String
  /**
    * The explicit permissions to provide to the container for the device. By default, the container has permissions for read, write, and mknod for the device.
    */
  var permissions: js.UndefOr[DeviceCgroupPermissions] = js.undefined
}

object Device {
  @scala.inline
  def apply(hostPath: String, containerPath: String = null, permissions: DeviceCgroupPermissions = null): Device = {
    val __obj = js.Dynamic.literal(hostPath = hostPath)
    if (containerPath != null) __obj.updateDynamic("containerPath")(containerPath)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[Device]
  }
}

