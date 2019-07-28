package typings.applepayjs.ApplePayJSNs

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
  var amount: String
  /**
    * A further description of the shipping method.
    */
  var detail: js.UndefOr[String] = js.undefined
  /**
    * A client-defined identifier.
    */
  var identifier: js.UndefOr[String] = js.undefined
  /**
    * A short description of the shipping method.
    */
  var label: String
}

object ApplePayShippingMethod {
  @scala.inline
  def apply(amount: String, label: String, detail: String = null, identifier: String = null): ApplePayShippingMethod = {
    val __obj = js.Dynamic.literal(amount = amount, label = label)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    __obj.asInstanceOf[ApplePayShippingMethod]
  }
}

