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

