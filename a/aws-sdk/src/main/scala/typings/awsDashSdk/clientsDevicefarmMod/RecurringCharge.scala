package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecurringCharge extends js.Object {
  /**
    * The cost of the recurring charge.
    */
  var cost: js.UndefOr[MonetaryAmount] = js.native
  /**
    * The frequency in which charges recur.
    */
  var frequency: js.UndefOr[RecurringChargeFrequency] = js.native
}

object RecurringCharge {
  @scala.inline
  def apply(cost: MonetaryAmount = null, frequency: RecurringChargeFrequency = null): RecurringCharge = {
    val __obj = js.Dynamic.literal()
    if (cost != null) __obj.updateDynamic("cost")(cost.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurringCharge]
  }
}

