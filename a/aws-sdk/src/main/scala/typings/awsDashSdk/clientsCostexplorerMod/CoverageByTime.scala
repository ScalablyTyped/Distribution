package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverageByTime extends js.Object {
  /**
    * The groups of instances that the reservation covered.
    */
  var Groups: js.UndefOr[ReservationCoverageGroups] = js.native
  /**
    * The period that this coverage was used over.
    */
  var TimePeriod: js.UndefOr[DateInterval] = js.native
  /**
    * The total reservation coverage, in hours.
    */
  var Total: js.UndefOr[Coverage] = js.native
}

object CoverageByTime {
  @scala.inline
  def apply(Groups: ReservationCoverageGroups = null, TimePeriod: DateInterval = null, Total: Coverage = null): CoverageByTime = {
    val __obj = js.Dynamic.literal()
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (TimePeriod != null) __obj.updateDynamic("TimePeriod")(TimePeriod.asInstanceOf[js.Any])
    if (Total != null) __obj.updateDynamic("Total")(Total.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageByTime]
  }
}

