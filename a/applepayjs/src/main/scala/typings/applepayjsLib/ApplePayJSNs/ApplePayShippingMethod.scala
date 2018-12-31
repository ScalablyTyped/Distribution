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

