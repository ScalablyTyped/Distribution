package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDeviceDefinitionRequest extends js.Object {
  /**
    * The ID of the device definition.
    */
  var DeviceDefinitionId: __string
  /**
    * The name of the definition.
    */
  var Name: js.UndefOr[__string] = js.undefined
}

object UpdateDeviceDefinitionRequest {
  @scala.inline
  def apply(DeviceDefinitionId: __string, Name: __string = null): UpdateDeviceDefinitionRequest = {
    val __obj = js.Dynamic.literal(DeviceDefinitionId = DeviceDefinitionId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateDeviceDefinitionRequest]
  }
}

