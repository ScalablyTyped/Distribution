package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updated transaction details resulting from a change in shipping contact, including any errors.
  */
trait ApplePayShippingContactUpdate extends js.Object {
  /**
    * List of custom errors to display on the payment sheet.
    */
  var errors: js.UndefOr[js.Array[ApplePayError]] = js.undefined
  /**
    * An optional list of updated line items.
    */
  var newLineItems: js.UndefOr[js.Array[ApplePayLineItem]] = js.undefined
  /**
    * A list of shipping methods that are available to the updated shipping contact.
    */
  var newShippingMethods: js.UndefOr[js.Array[ApplePayShippingMethod]] = js.undefined
  /**
    * The new total resulting from a change in the shipping contact.
    */
  var newTotal: ApplePayLineItem
}

object ApplePayShippingContactUpdate {
  @scala.inline
  def apply(
    newTotal: ApplePayLineItem,
    errors: js.Array[ApplePayError] = null,
    newLineItems: js.Array[ApplePayLineItem] = null,
    newShippingMethods: js.Array[ApplePayShippingMethod] = null
  ): ApplePayShippingContactUpdate = {
    val __obj = js.Dynamic.literal(newTotal = newTotal.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (newLineItems != null) __obj.updateDynamic("newLineItems")(newLineItems.asInstanceOf[js.Any])
    if (newShippingMethods != null) __obj.updateDynamic("newShippingMethods")(newShippingMethods.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayShippingContactUpdate]
  }
}

