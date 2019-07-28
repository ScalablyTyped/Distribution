package typings.accounting.accountingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrencyFormat extends js.Object {
           // for positive values, eg. "$ 1.00"
  var neg: js.UndefOr[String] = js.undefined
  var pos: String
          // for negative values, eg. "$ (1.00)"
  var zero: js.UndefOr[String] = js.undefined
}

object CurrencyFormat {
  @scala.inline
  def apply(pos: String, neg: String = null, zero: String = null): CurrencyFormat = {
    val __obj = js.Dynamic.literal(pos = pos)
    if (neg != null) __obj.updateDynamic("neg")(neg)
    if (zero != null) __obj.updateDynamic("zero")(zero)
    __obj.asInstanceOf[CurrencyFormat]
  }
}

