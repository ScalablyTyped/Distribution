package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceDefinitionVersion extends js.Object {
  /**
    * A list of devices in the definition version.
    */
  var Devices: js.UndefOr[__listOfDevice] = js.undefined
}

object DeviceDefinitionVersion {
  @scala.inline
  def apply(Devices: __listOfDevice = null): DeviceDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    if (Devices != null) __obj.updateDynamic("Devices")(Devices)
    __obj.asInstanceOf[DeviceDefinitionVersion]
  }
}

