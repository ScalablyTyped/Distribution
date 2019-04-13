package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonetaryAmount extends js.Object {
  /**
    * The numerical amount of an offering or transaction.
    */
  var amount: js.UndefOr[Double] = js.undefined
  /**
    * The currency code of a monetary amount. For example, USD means "U.S. dollars."
    */
  var currencyCode: js.UndefOr[CurrencyCode] = js.undefined
}

object MonetaryAmount {
  @scala.inline
  def apply(amount: js.UndefOr[Double] = js.undefined, currencyCode: CurrencyCode = null): MonetaryAmount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(amount)) __obj.updateDynamic("amount")(amount)
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonetaryAmount]
  }
}

