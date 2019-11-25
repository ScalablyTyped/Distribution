package typings.accounting.accountingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrencySettings[TFormat] extends js.Object {
      // controls output: %s = symbol, %v = value/number
  var decimal: js.UndefOr[String] = js.undefined
       // default currency symbol is '$'
  var format: js.UndefOr[TFormat] = js.undefined
     // thousands separator
  var precision: js.UndefOr[Double] = js.undefined
  var symbol: js.UndefOr[String] = js.undefined
      // decimal point separator
  var thousand: js.UndefOr[String] = js.undefined
}

object CurrencySettings {
  @scala.inline
  def apply[TFormat](
    decimal: String = null,
    format: TFormat = null,
    precision: Int | Double = null,
    symbol: String = null,
    thousand: String = null
  ): CurrencySettings[TFormat] = {
    val __obj = js.Dynamic.literal()
    if (decimal != null) __obj.updateDynamic("decimal")(decimal.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (thousand != null) __obj.updateDynamic("thousand")(thousand.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencySettings[TFormat]]
  }
}

