package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeviceDefinitionRequest extends js.Object {
  /**
    * The ID of the device definition.
    */
  var DeviceDefinitionId: __string
}

object GetDeviceDefinitionRequest {
  @scala.inline
  def apply(DeviceDefinitionId: __string): GetDeviceDefinitionRequest = {
    val __obj = js.Dynamic.literal(DeviceDefinitionId = DeviceDefinitionId)
  
    __obj.asInstanceOf[GetDeviceDefinitionRequest]
  }
}

