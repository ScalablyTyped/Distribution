package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecurringCharge extends js.Object {
  /**
    * The amount of the recurring charge.
    */
  var RecurringChargeAmount: js.UndefOr[Double] = js.undefined
  /**
    * The frequency of the recurring charge.
    */
  var RecurringChargeFrequency: js.UndefOr[String] = js.undefined
}

object RecurringCharge {
  @scala.inline
  def apply(RecurringChargeAmount: js.UndefOr[Double] = js.undefined, RecurringChargeFrequency: String = null): RecurringCharge = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(RecurringChargeAmount)) __obj.updateDynamic("RecurringChargeAmount")(RecurringChargeAmount)
    if (RecurringChargeFrequency != null) __obj.updateDynamic("RecurringChargeFrequency")(RecurringChargeFrequency)
    __obj.asInstanceOf[RecurringCharge]
  }
}

