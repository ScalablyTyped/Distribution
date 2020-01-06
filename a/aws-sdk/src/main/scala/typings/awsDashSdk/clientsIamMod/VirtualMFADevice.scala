package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualMFADevice extends js.Object {
  /**
    *  The base32 seed defined as specified in RFC3548. The Base32StringSeed is base64-encoded. 
    */
  var Base32StringSeed: js.UndefOr[BootstrapDatum] = js.native
  /**
    * The date and time on which the virtual MFA device was enabled.
    */
  var EnableDate: js.UndefOr[dateType] = js.native
  /**
    *  A QR code PNG image that encodes otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String where $virtualMFADeviceName is one of the create call arguments. AccountName is the user name if set (otherwise, the account ID otherwise), and Base32String is the seed in base32 format. The Base32String value is base64-encoded. 
    */
  var QRCodePNG: js.UndefOr[BootstrapDatum] = js.native
  /**
    * The serial number associated with VirtualMFADevice.
    */
  var SerialNumber: serialNumberType = js.native
  /**
    * The IAM user associated with this virtual MFA device.
    */
  var User: js.UndefOr[typings.awsDashSdk.clientsIamMod.User] = js.native
}

object VirtualMFADevice {
  @scala.inline
  def apply(
    SerialNumber: serialNumberType,
    Base32StringSeed: BootstrapDatum = null,
    EnableDate: dateType = null,
    QRCodePNG: BootstrapDatum = null,
    User: User = null
  ): VirtualMFADevice = {
    val __obj = js.Dynamic.literal(SerialNumber = SerialNumber.asInstanceOf[js.Any])
    if (Base32StringSeed != null) __obj.updateDynamic("Base32StringSeed")(Base32StringSeed.asInstanceOf[js.Any])
    if (EnableDate != null) __obj.updateDynamic("EnableDate")(EnableDate.asInstanceOf[js.Any])
    if (QRCodePNG != null) __obj.updateDynamic("QRCodePNG")(QRCodePNG.asInstanceOf[js.Any])
    if (User != null) __obj.updateDynamic("User")(User.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualMFADevice]
  }
}

