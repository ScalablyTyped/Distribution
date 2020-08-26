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
  def apply(): LinuxParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinuxParameters]
  }
  @scala.inline
  implicit class LinuxParametersOps[Self <: LinuxParameters] (val x: Self) extends AnyVal {
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
    def setDevicesVarargs(value: Device*): Self = this.set("devices", js.Array(value :_*))
    @scala.inline
    def setDevices(value: DevicesList): Self = this.set("devices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevices: Self = this.set("devices", js.undefined)
  }
  
}

