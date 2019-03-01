package typings
package actionsDashOnDashGoogleLib.transactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Price extends js.Object {
  var amount: actionsDashOnDashGoogleLib.Anon_CurrencyCode
  /** One of Transaction.PriceType. */
  var `type`: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PriceType
}

object Price {
  @scala.inline
  def apply(
    amount: actionsDashOnDashGoogleLib.Anon_CurrencyCode,
    `type`: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PriceType
  ): Price = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("amount")(amount)
    __obj.asInstanceOf[Price]
  }
}

