package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecurringCharge extends js.Object {
  /**
    * The monetary amount of the recurring charge.
    */
  var RecurringChargeAmount: js.UndefOr[Double] = js.undefined
  /**
    * The frequency of the recurring charge.
    */
  var RecurringChargeFrequency: js.UndefOr[String] = js.undefined
}

object RecurringCharge {
  @scala.inline
  def apply(RecurringChargeAmount: Int | scala.Double = null, RecurringChargeFrequency: String = null): RecurringCharge = {
    val __obj = js.Dynamic.literal()
    if (RecurringChargeAmount != null) __obj.updateDynamic("RecurringChargeAmount")(RecurringChargeAmount.asInstanceOf[js.Any])
    if (RecurringChargeFrequency != null) __obj.updateDynamic("RecurringChargeFrequency")(RecurringChargeFrequency)
    __obj.asInstanceOf[RecurringCharge]
  }
}

