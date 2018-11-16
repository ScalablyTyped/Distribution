package typings
package applepayjsLib.ApplePayJSNs

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

