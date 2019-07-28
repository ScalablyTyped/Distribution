package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetentionPeriod extends js.Object {
  /**
    * The number of days that message data is kept. The "unlimited" parameter must be false.
    */
  var numberOfDays: js.UndefOr[RetentionPeriodInDays] = js.undefined
  /**
    * If true, message data is kept indefinitely.
    */
  var unlimited: js.UndefOr[UnlimitedRetentionPeriod] = js.undefined
}

object RetentionPeriod {
  @scala.inline
  def apply(
    numberOfDays: js.UndefOr[RetentionPeriodInDays] = js.undefined,
    unlimited: js.UndefOr[UnlimitedRetentionPeriod] = js.undefined
  ): RetentionPeriod = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(numberOfDays)) __obj.updateDynamic("numberOfDays")(numberOfDays)
    if (!js.isUndefined(unlimited)) __obj.updateDynamic("unlimited")(unlimited)
    __obj.asInstanceOf[RetentionPeriod]
  }
}

