package typings.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  /** The unique identifier for the app. */
  var appIdentifier: String
  /** The current app version. */
  var appVersion: String
  /** A string that identifies the device model. */
  var model: String
  /** The version of the product installed on the device. */
  var productType: String
  /** The operating system on the device. */
  var systemVersion: String
  /** The UUID of the device. */
  var vendorIdentifier: String
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
    val __obj = js.Dynamic.literal(appIdentifier = appIdentifier, appVersion = appVersion, model = model, productType = productType, systemVersion = systemVersion, vendorIdentifier = vendorIdentifier)
  
    __obj.asInstanceOf[Device]
  }
}

