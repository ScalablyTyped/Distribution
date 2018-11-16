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

