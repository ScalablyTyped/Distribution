package typings
package applepayjsLib.ApplePayJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a shipping method for delivering physical goods.
  */
trait ApplePayShippingMethod extends js.Object {
  /**
    * The amount associated with this shipping method.
    */
  var amount: java.lang.String
  /**
    * A further description of the shipping method.
    */
  var detail: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A client-defined identifier.
    */
  var identifier: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A short description of the shipping method.
    */
  var label: java.lang.String
}

object ApplePayShippingMethod {
  @scala.inline
  def apply(
    amount: java.lang.String,
    label: java.lang.String,
    detail: java.lang.String = null,
    identifier: java.lang.String = null
  ): ApplePayShippingMethod = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("label")(label)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    __obj.asInstanceOf[ApplePayShippingMethod]
  }
}

