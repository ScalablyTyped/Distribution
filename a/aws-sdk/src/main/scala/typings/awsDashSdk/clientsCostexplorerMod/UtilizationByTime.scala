package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UtilizationByTime extends js.Object {
  /**
    * The groups that this utilization result uses.
    */
  var Groups: js.UndefOr[ReservationUtilizationGroups] = js.native
  /**
    * The period of time that this utilization was used for.
    */
  var TimePeriod: js.UndefOr[DateInterval] = js.native
  /**
    * The total number of reservation hours that were used.
    */
  var Total: js.UndefOr[ReservationAggregates] = js.native
}

object UtilizationByTime {
  @scala.inline
  def apply(
    Groups: ReservationUtilizationGroups = null,
    TimePeriod: DateInterval = null,
    Total: ReservationAggregates = null
  ): UtilizationByTime = {
    val __obj = js.Dynamic.literal()
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (TimePeriod != null) __obj.updateDynamic("TimePeriod")(TimePeriod.asInstanceOf[js.Any])
    if (Total != null) __obj.updateDynamic("Total")(Total.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtilizationByTime]
  }
}

