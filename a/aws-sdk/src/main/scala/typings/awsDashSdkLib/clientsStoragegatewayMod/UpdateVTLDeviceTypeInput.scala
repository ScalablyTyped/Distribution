package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateVTLDeviceTypeInput extends js.Object {
  /**
    * The type of medium changer you want to select.  Valid Values: "STK-L700", "AWS-Gateway-VTL"
    */
  var DeviceType: awsDashSdkLib.clientsStoragegatewayMod.DeviceType
  /**
    * The Amazon Resource Name (ARN) of the medium changer you want to select.
    */
  var VTLDeviceARN: awsDashSdkLib.clientsStoragegatewayMod.VTLDeviceARN
}

object UpdateVTLDeviceTypeInput {
  @scala.inline
  def apply(DeviceType: DeviceType, VTLDeviceARN: VTLDeviceARN): UpdateVTLDeviceTypeInput = {
    val __obj = js.Dynamic.literal(DeviceType = DeviceType, VTLDeviceARN = VTLDeviceARN)
  
    __obj.asInstanceOf[UpdateVTLDeviceTypeInput]
  }
}

