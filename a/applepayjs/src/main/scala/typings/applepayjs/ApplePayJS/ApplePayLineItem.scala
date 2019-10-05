package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a line item in a payment request - for example, total, tax, discount, or grand total.
  */
trait ApplePayLineItem extends js.Object {
  /**
    * The line item's amount.
    */
  var amount: String
  /**
    * A short, localized description of the line item.
    */
  var label: String
  /**
    * A value that indicates if the line item is final or pending.
    */
  var `type`: js.UndefOr[ApplePayLineItemType] = js.undefined
}

object ApplePayLineItem {
  @scala.inline
  def apply(amount: String, label: String, `type`: ApplePayLineItemType = null): ApplePayLineItem = {
    val __obj = js.Dynamic.literal(amount = amount, label = label)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ApplePayLineItem]
  }
}

