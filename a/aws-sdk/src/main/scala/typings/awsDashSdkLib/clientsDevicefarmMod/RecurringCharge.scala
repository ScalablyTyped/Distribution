package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecurringCharge extends js.Object {
  /**
    * The cost of the recurring charge.
    */
  var cost: js.UndefOr[MonetaryAmount] = js.undefined
  /**
    * The frequency in which charges will recur.
    */
  var frequency: js.UndefOr[RecurringChargeFrequency] = js.undefined
}

object RecurringCharge {
  @scala.inline
  def apply(cost: MonetaryAmount = null, frequency: RecurringChargeFrequency = null): RecurringCharge = {
    val __obj = js.Dynamic.literal()
    if (cost != null) __obj.updateDynamic("cost")(cost)
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurringCharge]
  }
}

