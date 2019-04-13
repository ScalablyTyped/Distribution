package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDeviceDefinitionVersionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the device definition.
    */
  var DeviceDefinitionId: __string
  /**
    * A list of devices in the definition version.
    */
  var Devices: js.UndefOr[__listOfDevice] = js.undefined
}

object CreateDeviceDefinitionVersionRequest {
  @scala.inline
  def apply(DeviceDefinitionId: __string, AmznClientToken: __string = null, Devices: __listOfDevice = null): CreateDeviceDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(DeviceDefinitionId = DeviceDefinitionId)
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken)
    if (Devices != null) __obj.updateDynamic("Devices")(Devices)
    __obj.asInstanceOf[CreateDeviceDefinitionVersionRequest]
  }
}

