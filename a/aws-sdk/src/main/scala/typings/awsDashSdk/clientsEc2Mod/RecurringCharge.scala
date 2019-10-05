package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecurringCharge extends js.Object {
  /**
    * The amount of the recurring charge.
    */
  var Amount: js.UndefOr[Double] = js.undefined
  /**
    * The frequency of the recurring charge.
    */
  var Frequency: js.UndefOr[RecurringChargeFrequency] = js.undefined
}

object RecurringCharge {
  @scala.inline
  def apply(Amount: Int | scala.Double = null, Frequency: RecurringChargeFrequency = null): RecurringCharge = {
    val __obj = js.Dynamic.literal()
    if (Amount != null) __obj.updateDynamic("Amount")(Amount.asInstanceOf[js.Any])
    if (Frequency != null) __obj.updateDynamic("Frequency")(Frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurringCharge]
  }
}

