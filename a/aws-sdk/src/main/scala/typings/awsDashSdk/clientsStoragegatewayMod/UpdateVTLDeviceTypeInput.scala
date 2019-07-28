package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateVTLDeviceTypeInput extends js.Object {
  /**
    * The type of medium changer you want to select.  Valid Values: "STK-L700", "AWS-Gateway-VTL"
    */
  var DeviceType: typings.awsDashSdk.clientsStoragegatewayMod.DeviceType
  /**
    * The Amazon Resource Name (ARN) of the medium changer you want to select.
    */
  var VTLDeviceARN: typings.awsDashSdk.clientsStoragegatewayMod.VTLDeviceARN
}

object UpdateVTLDeviceTypeInput {
  @scala.inline
  def apply(DeviceType: DeviceType, VTLDeviceARN: VTLDeviceARN): UpdateVTLDeviceTypeInput = {
    val __obj = js.Dynamic.literal(DeviceType = DeviceType, VTLDeviceARN = VTLDeviceARN)
  
    __obj.asInstanceOf[UpdateVTLDeviceTypeInput]
  }
}

