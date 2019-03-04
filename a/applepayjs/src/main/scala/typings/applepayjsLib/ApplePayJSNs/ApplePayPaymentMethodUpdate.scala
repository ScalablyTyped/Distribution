package typings
package applepayjsLib.ApplePayJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updated transaction details resulting from a change in payment method.
  */
trait ApplePayPaymentMethodUpdate extends js.Object {
  /**
    * An optional list of line items.
    */
  var newLineItems: js.UndefOr[js.Array[ApplePayLineItem]] = js.undefined
  /**
    * The new total resulting from a change in the payment method.
    */
  var newTotal: ApplePayLineItem
}

object ApplePayPaymentMethodUpdate {
  @scala.inline
  def apply(newTotal: ApplePayLineItem, newLineItems: js.Array[ApplePayLineItem] = null): ApplePayPaymentMethodUpdate = {
    val __obj = js.Dynamic.literal(newTotal = newTotal)
    if (newLineItems != null) __obj.updateDynamic("newLineItems")(newLineItems)
    __obj.asInstanceOf[ApplePayPaymentMethodUpdate]
  }
}

