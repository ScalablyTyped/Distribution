package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccountBalanceResponse extends js.Object {
  var AvailableBalance: js.UndefOr[CurrencyAmount] = js.undefined
  var OnHoldBalance: js.UndefOr[CurrencyAmount] = js.undefined
}

object GetAccountBalanceResponse {
  @scala.inline
  def apply(AvailableBalance: CurrencyAmount = null, OnHoldBalance: CurrencyAmount = null): GetAccountBalanceResponse = {
    val __obj = js.Dynamic.literal()
    if (AvailableBalance != null) __obj.updateDynamic("AvailableBalance")(AvailableBalance)
    if (OnHoldBalance != null) __obj.updateDynamic("OnHoldBalance")(OnHoldBalance)
    __obj.asInstanceOf[GetAccountBalanceResponse]
  }
}

