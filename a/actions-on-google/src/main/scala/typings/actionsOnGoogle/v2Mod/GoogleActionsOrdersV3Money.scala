package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3Money extends js.Object {
  /**
    * Amount in micros.
    * For example, this field should be set as 1990000 for $1.99.
    */
  var amountInMicros: js.UndefOr[String] = js.native
  /**
    * The 3-letter currency code defined in ISO 4217.
    */
  var currencyCode: js.UndefOr[String] = js.native
}

object GoogleActionsOrdersV3Money {
  @scala.inline
  def apply(): GoogleActionsOrdersV3Money = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3Money]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3MoneyOps[Self <: GoogleActionsOrdersV3Money] (val x: Self) extends AnyVal {
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
    def setAmountInMicros(value: String): Self = this.set("amountInMicros", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmountInMicros: Self = this.set("amountInMicros", js.undefined)
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
  }
  
}

