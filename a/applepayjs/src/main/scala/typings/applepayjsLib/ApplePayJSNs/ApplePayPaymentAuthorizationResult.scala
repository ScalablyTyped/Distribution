package typings
package applepayjsLib.ApplePayJSNs

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
  var status: scala.Double
}

