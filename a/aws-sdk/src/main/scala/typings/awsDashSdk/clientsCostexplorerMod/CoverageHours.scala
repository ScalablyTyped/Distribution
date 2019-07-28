package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageHours extends js.Object {
  /**
    * The percentage of instance hours that a reservation covered.
    */
  var CoverageHoursPercentage: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.CoverageHoursPercentage] = js.undefined
  /**
    * The number of instance running hours that On-Demand Instances covered.
    */
  var OnDemandHours: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.OnDemandHours] = js.undefined
  /**
    * The number of instance running hours that reservations covered.
    */
  var ReservedHours: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.ReservedHours] = js.undefined
  /**
    * The total instance usage, in hours.
    */
  var TotalRunningHours: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.TotalRunningHours] = js.undefined
}

object CoverageHours {
  @scala.inline
  def apply(
    CoverageHoursPercentage: CoverageHoursPercentage = null,
    OnDemandHours: OnDemandHours = null,
    ReservedHours: ReservedHours = null,
    TotalRunningHours: TotalRunningHours = null
  ): CoverageHours = {
    val __obj = js.Dynamic.literal()
    if (CoverageHoursPercentage != null) __obj.updateDynamic("CoverageHoursPercentage")(CoverageHoursPercentage)
    if (OnDemandHours != null) __obj.updateDynamic("OnDemandHours")(OnDemandHours)
    if (ReservedHours != null) __obj.updateDynamic("ReservedHours")(ReservedHours)
    if (TotalRunningHours != null) __obj.updateDynamic("TotalRunningHours")(TotalRunningHours)
    __obj.asInstanceOf[CoverageHours]
  }
}

