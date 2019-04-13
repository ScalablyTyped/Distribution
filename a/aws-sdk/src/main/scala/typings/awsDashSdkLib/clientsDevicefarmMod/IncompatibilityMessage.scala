package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncompatibilityMessage extends js.Object {
  /**
    * A message about the incompatibility.
    */
  var message: js.UndefOr[Message] = js.undefined
  /**
    * The type of incompatibility. Allowed values include:   ARN: The ARN.   FORM_FACTOR: The form factor (for example, phone or tablet).   MANUFACTURER: The manufacturer.   PLATFORM: The platform (for example, Android or iOS).   REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access.   APPIUM_VERSION: The Appium version for the test.  
    */
  var `type`: js.UndefOr[DeviceAttribute] = js.undefined
}

object IncompatibilityMessage {
  @scala.inline
  def apply(message: Message = null, `type`: DeviceAttribute = null): IncompatibilityMessage = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncompatibilityMessage]
  }
}

