package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVirtualMFADeviceResponse extends js.Object {
  /**
    * A structure containing details about the new virtual MFA device.
    */
  var VirtualMFADevice: awsDashSdkLib.clientsIamMod.VirtualMFADevice
}

object CreateVirtualMFADeviceResponse {
  @scala.inline
  def apply(VirtualMFADevice: VirtualMFADevice): CreateVirtualMFADeviceResponse = {
    val __obj = js.Dynamic.literal(VirtualMFADevice = VirtualMFADevice)
  
    __obj.asInstanceOf[CreateVirtualMFADeviceResponse]
  }
}

