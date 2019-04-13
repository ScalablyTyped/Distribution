package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeviceResponse extends js.Object {
  /**
    * The device.
    */
  var Device: DeviceType
}

object GetDeviceResponse {
  @scala.inline
  def apply(Device: DeviceType): GetDeviceResponse = {
    val __obj = js.Dynamic.literal(Device = Device)
  
    __obj.asInstanceOf[GetDeviceResponse]
  }
}

