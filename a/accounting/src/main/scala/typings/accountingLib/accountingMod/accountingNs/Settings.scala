package typings
package accountingLib.accountingMod.accountingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var currency: CurrencySettings[_]
   // IAccountingCurrencySettings<string> or IAccountingCurrencySettings<IAccountingCurrencyFormat>
  var number: NumberSettings
}

object Settings {
  @scala.inline
  def apply(currency: CurrencySettings[_], number: NumberSettings): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currency")(currency)
    __obj.updateDynamic("number")(number)
    __obj.asInstanceOf[Settings]
  }
}

