package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinuxParameters extends js.Object {
  /**
    * Any host devices to expose to the container. This parameter maps to Devices in the Create a container section of the Docker Remote API and the --device option to docker run.
    */
  var devices: js.UndefOr[DevicesList] = js.native
}

object LinuxParameters {
  @scala.inline
  def apply(devices: DevicesList = null): LinuxParameters = {
    val __obj = js.Dynamic.literal()
    if (devices != null) __obj.updateDynamic("devices")(devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinuxParameters]
  }
}

