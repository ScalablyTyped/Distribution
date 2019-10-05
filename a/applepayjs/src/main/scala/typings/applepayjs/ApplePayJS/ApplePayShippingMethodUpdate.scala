package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updated transaction details resulting from a change in shipping method.
  */
trait ApplePayShippingMethodUpdate extends js.Object {
  /**
    * An optional list of updated line items.
    */
  var newLineItems: js.UndefOr[js.Array[ApplePayLineItem]] = js.undefined
  /**
    * The new total resulting from a change in the shipping method.
    */
  var newTotal: ApplePayLineItem
}

object ApplePayShippingMethodUpdate {
  @scala.inline
  def apply(newTotal: ApplePayLineItem, newLineItems: js.Array[ApplePayLineItem] = null): ApplePayShippingMethodUpdate = {
    val __obj = js.Dynamic.literal(newTotal = newTotal)
    if (newLineItems != null) __obj.updateDynamic("newLineItems")(newLineItems)
    __obj.asInstanceOf[ApplePayShippingMethodUpdate]
  }
}

