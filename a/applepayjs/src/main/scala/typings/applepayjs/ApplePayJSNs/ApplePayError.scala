package typings.applepayjs.ApplePayJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A customizable error type that you create to indicate problems with the address or contact information on an Apple Pay sheet.
  */
trait ApplePayError extends js.Object {
  /**
    * The error code for this instance.
    */
  var code: ApplePayErrorCode
  /**
    * The name of the field that contains the error.
    */
  var contactField: js.UndefOr[ApplePayErrorContactField] = js.undefined
  /**
    * A localized, user-facing string that describes the error.
    */
  var message: String
}

object ApplePayError {
  @scala.inline
  def apply(code: ApplePayErrorCode, message: String, contactField: ApplePayErrorContactField = null): ApplePayError = {
    val __obj = js.Dynamic.literal(code = code, message = message)
    if (contactField != null) __obj.updateDynamic("contactField")(contactField)
    __obj.asInstanceOf[ApplePayError]
  }
}

