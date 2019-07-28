package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminGetDeviceResponse extends js.Object {
  /**
    * The device.
    */
  var Device: DeviceType
}

object AdminGetDeviceResponse {
  @scala.inline
  def apply(Device: DeviceType): AdminGetDeviceResponse = {
    val __obj = js.Dynamic.literal(Device = Device)
  
    __obj.asInstanceOf[AdminGetDeviceResponse]
  }
}

