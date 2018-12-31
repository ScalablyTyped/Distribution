package typings
package applepayjsLib.ApplePayJSNs

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
  var message: java.lang.String
}

