package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultByTime extends js.Object {
  /**
    * Whether the result is estimated.
    */
  var Estimated: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.Estimated] = js.undefined
  /**
    * The groups that this time period includes.
    */
  var Groups: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.Groups] = js.undefined
  /**
    * The time period that the result covers.
    */
  var TimePeriod: js.UndefOr[DateInterval] = js.undefined
  /**
    * The total amount of cost or usage accrued during the time period.
    */
  var Total: js.UndefOr[Metrics] = js.undefined
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
    if (!js.isUndefined(Estimated)) __obj.updateDynamic("Estimated")(Estimated)
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (TimePeriod != null) __obj.updateDynamic("TimePeriod")(TimePeriod)
    if (Total != null) __obj.updateDynamic("Total")(Total)
    __obj.asInstanceOf[ResultByTime]
  }
}

