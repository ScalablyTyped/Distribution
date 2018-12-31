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

