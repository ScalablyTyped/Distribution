package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDeviceDefinitionRequest extends js.Object {
  /**
    * The ID of the device definition.
    */
  var DeviceDefinitionId: __string = js.native
}

object DeleteDeviceDefinitionRequest {
  @scala.inline
  def apply(DeviceDefinitionId: __string): DeleteDeviceDefinitionRequest = {
    val __obj = js.Dynamic.literal(DeviceDefinitionId = DeviceDefinitionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDeviceDefinitionRequest]
  }
}

