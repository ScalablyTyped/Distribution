package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultByTime extends js.Object {
  /**
    * Whether the result is estimated.
    */
  var Estimated: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.Estimated] = js.native
  /**
    * The groups that this time period includes.
    */
  var Groups: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.Groups] = js.native
  /**
    * The time period that the result covers.
    */
  var TimePeriod: js.UndefOr[DateInterval] = js.native
  /**
    * The total amount of cost or usage accrued during the time period.
    */
  var Total: js.UndefOr[Metrics] = js.native
}

object ResultByTime {
  @scala.inline
  def apply(
    Estimated: js.UndefOr[Boolean] = js.undefined,
    Groups: Groups = null,
    TimePeriod: DateInterval = null,
    Total: Metrics = null
  ): ResultByTime = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Estimated)) __obj.updateDynamic("Estimated")(Estimated.asInstanceOf[js.Any])
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (TimePeriod != null) __obj.updateDynamic("TimePeriod")(TimePeriod.asInstanceOf[js.Any])
    if (Total != null) __obj.updateDynamic("Total")(Total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultByTime]
  }
}

