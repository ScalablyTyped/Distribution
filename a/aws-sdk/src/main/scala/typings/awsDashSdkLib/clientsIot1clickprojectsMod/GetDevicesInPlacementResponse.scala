package typings
package awsDashSdkLib.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDevicesInPlacementResponse extends js.Object {
  /**
    * An object containing the devices (zero or more) within the placement.
    */
  var devices: DeviceMap
}

object GetDevicesInPlacementResponse {
  @scala.inline
  def apply(devices: DeviceMap): GetDevicesInPlacementResponse = {
    val __obj = js.Dynamic.literal(devices = devices)
  
    __obj.asInstanceOf[GetDevicesInPlacementResponse]
  }
}

