package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservedInstanceLimitPrice extends js.Object {
  /**
    * Used for Reserved Instance Marketplace offerings. Specifies the limit price on the total order (instanceCount * price).
    */
  var Amount: js.UndefOr[Double] = js.undefined
  /**
    * The currency in which the limitPrice amount is specified. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined
}

object ReservedInstanceLimitPrice {
  @scala.inline
  def apply(Amount: Int | scala.Double = null, CurrencyCode: CurrencyCodeValues = null): ReservedInstanceLimitPrice = {
    val __obj = js.Dynamic.literal()
    if (Amount != null) __obj.updateDynamic("Amount")(Amount.asInstanceOf[js.Any])
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservedInstanceLimitPrice]
  }
}

