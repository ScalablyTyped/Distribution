package typings.actionsDashOnDashGoogle.transactionsMod

import typings.actionsDashOnDashGoogle.Anon_CurrencyCode
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PriceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Price extends js.Object {
  var amount: Anon_CurrencyCode
  /** One of Transaction.PriceType. */
  var `type`: PriceType
}

object Price {
  @scala.inline
  def apply(amount: Anon_CurrencyCode, `type`: PriceType): Price = {
    val __obj = js.Dynamic.literal(amount = amount)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Price]
  }
}

