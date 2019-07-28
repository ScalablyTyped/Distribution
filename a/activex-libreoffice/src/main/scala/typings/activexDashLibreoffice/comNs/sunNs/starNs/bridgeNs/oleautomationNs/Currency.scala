package typings.activexDashLibreoffice.comNs.sunNs.starNs.bridgeNs.oleautomationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the UNO representation of the Automation type `CY` , also know as `CURRENCY` .
  *
  * A `CY` could actually be represented as `hyper` in UNO and therefore a typedef from `hyper` to a currency type would do. But a typedef cannot be
  * expressed in all language bindings. In the case where no typedefs are supported the actual type is used. That is, a typedef'd currency type would be
  * represented as `long` in Java. The information that the `long` is a currency type is lost.
  *
  * When calling Automation objects from UNO the distinction between `hyper` and a currency type is important. Therefore {@link Currency} is declared as
  * struct.
  * @since OOo 1.1.2
  */
trait Currency extends js.Object {
  /** corresponds to the Automation type `CY` . */
  var Value: Double
}

object Currency {
  @scala.inline
  def apply(Value: Double): Currency = {
    val __obj = js.Dynamic.literal(Value = Value)
  
    __obj.asInstanceOf[Currency]
  }
}

