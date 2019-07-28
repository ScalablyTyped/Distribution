package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteVirtualMFADeviceRequest extends js.Object {
  /**
    * The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the same as the ARN. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@:/-
    */
  var SerialNumber: serialNumberType
}

object DeleteVirtualMFADeviceRequest {
  @scala.inline
  def apply(SerialNumber: serialNumberType): DeleteVirtualMFADeviceRequest = {
    val __obj = js.Dynamic.literal(SerialNumber = SerialNumber)
  
    __obj.asInstanceOf[DeleteVirtualMFADeviceRequest]
  }
}

