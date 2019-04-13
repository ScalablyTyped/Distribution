package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeactivateMFADeviceRequest extends js.Object {
  /**
    * The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the device ARN. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@:/-
    */
  var SerialNumber: serialNumberType
  /**
    * The name of the user whose MFA device you want to deactivate. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: existingUserNameType
}

object DeactivateMFADeviceRequest {
  @scala.inline
  def apply(SerialNumber: serialNumberType, UserName: existingUserNameType): DeactivateMFADeviceRequest = {
    val __obj = js.Dynamic.literal(SerialNumber = SerialNumber, UserName = UserName)
  
    __obj.asInstanceOf[DeactivateMFADeviceRequest]
  }
}

