package typings
package appletvjsLib.AppleTVJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  /** The unique identifier for the app. */
  var appIdentifier: java.lang.String
  /** The current app version. */
  var appVersion: java.lang.String
  /** A string that identifies the device model. */
  var model: java.lang.String
  /** The version of the product installed on the device. */
  var productType: java.lang.String
  /** The operating system on the device. */
  var systemVersion: java.lang.String
  /** The UUID of the device. */
  var vendorIdentifier: java.lang.String
}

object Device {
  @scala.inline
  def apply(
    appIdentifier: java.lang.String,
    appVersion: java.lang.String,
    model: java.lang.String,
    productType: java.lang.String,
    systemVersion: java.lang.String,
    vendorIdentifier: java.lang.String
  ): Device = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appIdentifier")(appIdentifier)
    __obj.updateDynamic("appVersion")(appVersion)
    __obj.updateDynamic("model")(model)
    __obj.updateDynamic("productType")(productType)
    __obj.updateDynamic("systemVersion")(systemVersion)
    __obj.updateDynamic("vendorIdentifier")(vendorIdentifier)
    __obj.asInstanceOf[Device]
  }
}

