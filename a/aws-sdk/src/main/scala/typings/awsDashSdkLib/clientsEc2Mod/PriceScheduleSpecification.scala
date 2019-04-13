package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PriceScheduleSpecification extends js.Object {
  /**
    * The currency for transacting the Reserved Instance resale. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined
  /**
    * The fixed price for the term.
    */
  var Price: js.UndefOr[Double] = js.undefined
  /**
    * The number of months remaining in the reservation. For example, 2 is the second to the last month before the capacity reservation expires.
    */
  var Term: js.UndefOr[Long] = js.undefined
}

object PriceScheduleSpecification {
  @scala.inline
  def apply(
    CurrencyCode: CurrencyCodeValues = null,
    Price: js.UndefOr[Double] = js.undefined,
    Term: js.UndefOr[Long] = js.undefined
  ): PriceScheduleSpecification = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (!js.isUndefined(Price)) __obj.updateDynamic("Price")(Price)
    if (!js.isUndefined(Term)) __obj.updateDynamic("Term")(Term)
    __obj.asInstanceOf[PriceScheduleSpecification]
  }
}

