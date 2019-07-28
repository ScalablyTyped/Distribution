package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDeviceDefinitionRequest extends js.Object {
  /**
    * The ID of the device definition.
    */
  var DeviceDefinitionId: __string
}

object DeleteDeviceDefinitionRequest {
  @scala.inline
  def apply(DeviceDefinitionId: __string): DeleteDeviceDefinitionRequest = {
    val __obj = js.Dynamic.literal(DeviceDefinitionId = DeviceDefinitionId)
  
    __obj.asInstanceOf[DeleteDeviceDefinitionRequest]
  }
}

