package typings.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  /** The unique identifier for the app. */
  var appIdentifier: String = js.native
  /** The current app version. */
  var appVersion: String = js.native
  /** A string that identifies the device model. */
  var model: String = js.native
  /** The version of the product installed on the device. */
  var productType: String = js.native
  /** The operating system on the device. */
  var systemVersion: String = js.native
  /** The UUID of the device. */
  var vendorIdentifier: String = js.native
}

object Device {
  @scala.inline
  def apply(
    appIdentifier: String,
    appVersion: String,
    model: String,
    productType: String,
    systemVersion: String,
    vendorIdentifier: String
  ): Device = {
    val __obj = js.Dynamic.literal(appIdentifier = appIdentifier.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], productType = productType.asInstanceOf[js.Any], systemVersion = systemVersion.asInstanceOf[js.Any], vendorIdentifier = vendorIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppIdentifier(value: String): Self = this.set("appIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppVersion(value: String): Self = this.set("appVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductType(value: String): Self = this.set("productType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemVersion(value: String): Self = this.set("systemVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setVendorIdentifier(value: String): Self = this.set("vendorIdentifier", value.asInstanceOf[js.Any])
  }
  
}

