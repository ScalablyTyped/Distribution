package typings
package applepayjsLib.ApplePayJSNs

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
  var amount: java.lang.String
  /**
    * A short, localized description of the line item.
    */
  var label: java.lang.String
  /**
    * A value that indicates if the line item is final or pending.
    */
  var `type`: js.UndefOr[ApplePayLineItemType] = js.undefined
}

object ApplePayLineItem {
  @scala.inline
  def apply(amount: java.lang.String, label: java.lang.String, `type`: ApplePayLineItemType = null): ApplePayLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("label")(label)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ApplePayLineItem]
  }
}

