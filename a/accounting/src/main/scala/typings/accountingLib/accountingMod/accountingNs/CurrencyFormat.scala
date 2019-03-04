package typings
package accountingLib.accountingMod.accountingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrencyFormat extends js.Object {
           // for positive values, eg. "$ 1.00"
  var neg: js.UndefOr[java.lang.String] = js.undefined
  var pos: java.lang.String
          // for negative values, eg. "$ (1.00)"
  var zero: js.UndefOr[java.lang.String] = js.undefined
}

object CurrencyFormat {
  @scala.inline
  def apply(pos: java.lang.String, neg: java.lang.String = null, zero: java.lang.String = null): CurrencyFormat = {
    val __obj = js.Dynamic.literal(pos = pos)
    if (neg != null) __obj.updateDynamic("neg")(neg)
    if (zero != null) __obj.updateDynamic("zero")(zero)
    __obj.asInstanceOf[CurrencyFormat]
  }
}

