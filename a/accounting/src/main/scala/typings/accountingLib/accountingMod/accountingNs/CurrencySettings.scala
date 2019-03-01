package typings
package accountingLib.accountingMod.accountingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrencySettings[TFormat] extends js.Object {
      // controls output: %s = symbol, %v = value/number
  var decimal: js.UndefOr[java.lang.String] = js.undefined
       // default currency symbol is '$'
  var format: js.UndefOr[TFormat] = js.undefined
     // thousands separator
  var precision: js.UndefOr[scala.Double] = js.undefined
  var symbol: js.UndefOr[java.lang.String] = js.undefined
      // decimal point separator
  var thousand: js.UndefOr[java.lang.String] = js.undefined
}

object CurrencySettings {
  @scala.inline
  def apply[TFormat](
    decimal: java.lang.String = null,
    format: TFormat = null,
    precision: scala.Int | scala.Double = null,
    symbol: java.lang.String = null,
    thousand: java.lang.String = null
  ): CurrencySettings[TFormat] = {
    val __obj = js.Dynamic.literal()
    if (decimal != null) __obj.updateDynamic("decimal")(decimal)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    if (thousand != null) __obj.updateDynamic("thousand")(thousand)
    __obj.asInstanceOf[CurrencySettings[TFormat]]
  }
}

