package typings.activexLibreoffice.com_.sun.star.bridge.oleautomation

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
@js.native
trait Currency extends js.Object {
  /** corresponds to the Automation type `CY` . */
  var Value: Double = js.native
}

object Currency {
  @scala.inline
  def apply(Value: Double): Currency = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currency]
  }
  @scala.inline
  implicit class CurrencyOps[Self <: Currency] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValue(value: Double): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

