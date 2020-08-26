package typings.accounting.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var currency: CurrencySettings[_] = js.native
   // IAccountingCurrencySettings<string> or IAccountingCurrencySettings<IAccountingCurrencyFormat>
  var number: NumberSettings = js.native
}

object Settings {
  @scala.inline
  def apply(currency: CurrencySettings[_], number: NumberSettings): Settings = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
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
    def setCurrency(value: CurrencySettings[_]): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: NumberSettings): Self = this.set("number", value.asInstanceOf[js.Any])
  }
  
}

