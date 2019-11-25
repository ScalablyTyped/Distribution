package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of payment authorization, including status and errors.
  */
trait ApplePayPaymentAuthorizationResult extends js.Object {
  /**
    * A list of custom errors to display on the payment sheet.
    */
  var errors: js.UndefOr[js.Array[ApplePayError]] = js.undefined
  /**
    * The status code for the authorization result.
    */
  var status: Double
}

object ApplePayPaymentAuthorizationResult {
  @scala.inline
  def apply(status: Double, errors: js.Array[ApplePayError] = null): ApplePayPaymentAuthorizationResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentAuthorizationResult]
  }
}

