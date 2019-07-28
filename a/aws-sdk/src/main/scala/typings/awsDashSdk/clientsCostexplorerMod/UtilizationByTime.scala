package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UtilizationByTime extends js.Object {
  /**
    * The groups that this utilization result uses.
    */
  var Groups: js.UndefOr[ReservationUtilizationGroups] = js.undefined
  /**
    * The period of time that this utilization was used for.
    */
  var TimePeriod: js.UndefOr[DateInterval] = js.undefined
  /**
    * The total number of reservation hours that were used.
    */
  var Total: js.UndefOr[ReservationAggregates] = js.undefined
}

object UtilizationByTime {
  @scala.inline
  def apply(
    Groups: ReservationUtilizationGroups = null,
    TimePeriod: DateInterval = null,
    Total: ReservationAggregates = null
  ): UtilizationByTime = {
    val __obj = js.Dynamic.literal()
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (TimePeriod != null) __obj.updateDynamic("TimePeriod")(TimePeriod)
    if (Total != null) __obj.updateDynamic("Total")(Total)
    __obj.asInstanceOf[UtilizationByTime]
  }
}

