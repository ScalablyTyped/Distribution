package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetentionPeriod extends js.Object {
  /**
    * The number of days that message data is kept. The "unlimited" parameter must be false.
    */
  var numberOfDays: js.UndefOr[RetentionPeriodInDays] = js.native
  /**
    * If true, message data is kept indefinitely.
    */
  var unlimited: js.UndefOr[UnlimitedRetentionPeriod] = js.native
}

object RetentionPeriod {
  @scala.inline
  def apply(numberOfDays: Int | Double = null, unlimited: js.UndefOr[Boolean] = js.undefined): RetentionPeriod = {
    val __obj = js.Dynamic.literal()
    if (numberOfDays != null) __obj.updateDynamic("numberOfDays")(numberOfDays.asInstanceOf[js.Any])
    if (!js.isUndefined(unlimited)) __obj.updateDynamic("unlimited")(unlimited.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetentionPeriod]
  }
}

