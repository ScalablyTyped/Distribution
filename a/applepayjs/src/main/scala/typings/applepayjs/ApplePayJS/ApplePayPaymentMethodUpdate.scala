package typings.applepayjs.ApplePayJS

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
    val __obj = js.Dynamic.literal(newTotal = newTotal.asInstanceOf[js.Any])
    if (newLineItems != null) __obj.updateDynamic("newLineItems")(newLineItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentMethodUpdate]
  }
}

