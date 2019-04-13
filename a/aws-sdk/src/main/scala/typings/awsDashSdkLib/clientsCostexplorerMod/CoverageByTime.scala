package typings
package awsDashSdkLib.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageByTime extends js.Object {
  /**
    * The groups of instances that the reservation covered.
    */
  var Groups: js.UndefOr[ReservationCoverageGroups] = js.undefined
  /**
    * The period that this coverage was used over.
    */
  var TimePeriod: js.UndefOr[DateInterval] = js.undefined
  /**
    * The total reservation coverage, in hours.
    */
  var Total: js.UndefOr[Coverage] = js.undefined
}

object CoverageByTime {
  @scala.inline
  def apply(Groups: ReservationCoverageGroups = null, TimePeriod: DateInterval = null, Total: Coverage = null): CoverageByTime = {
    val __obj = js.Dynamic.literal()
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (TimePeriod != null) __obj.updateDynamic("TimePeriod")(TimePeriod)
    if (Total != null) __obj.updateDynamic("Total")(Total)
    __obj.asInstanceOf[CoverageByTime]
  }
}

