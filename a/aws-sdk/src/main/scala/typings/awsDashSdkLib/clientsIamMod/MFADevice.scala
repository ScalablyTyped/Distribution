package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MFADevice extends js.Object {
  /**
    * The date when the MFA device was enabled for the user.
    */
  var EnableDate: dateType
  /**
    * The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the device ARN.
    */
  var SerialNumber: serialNumberType
  /**
    * The user with whom the MFA device is associated.
    */
  var UserName: userNameType
}

object MFADevice {
  @scala.inline
  def apply(EnableDate: dateType, SerialNumber: serialNumberType, UserName: userNameType): MFADevice = {
    val __obj = js.Dynamic.literal(EnableDate = EnableDate, SerialNumber = SerialNumber, UserName = UserName)
  
    __obj.asInstanceOf[MFADevice]
  }
}

