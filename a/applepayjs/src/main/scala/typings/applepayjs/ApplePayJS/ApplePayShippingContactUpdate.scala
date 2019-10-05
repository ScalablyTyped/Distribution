package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updated transaction details resulting from a change in shipping contact, including any errors.
  */
@JSGlobal("ApplePayJS.ApplePayShippingContactUpdate")
@js.native
class ApplePayShippingContactUpdate () extends js.Object {
  /**
    * List of custom errors to display on the payment sheet.
    */
  var errors: js.UndefOr[js.Array[ApplePayError]] = js.native
  /**
    * An optional list of updated line items.
    */
  var newLineItems: js.UndefOr[js.Array[ApplePayLineItem]] = js.native
  /**
    * A list of shipping methods that are available to the updated shipping contact.
    */
  var newShippingMethods: js.UndefOr[js.Array[ApplePayShippingMethod]] = js.native
  /**
    * The new total resulting from a change in the shipping contact.
    */
  var newTotal: ApplePayLineItem = js.native
}

