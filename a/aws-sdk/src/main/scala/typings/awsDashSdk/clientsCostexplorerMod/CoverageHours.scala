package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverageHours extends js.Object {
  /**
    * The percentage of instance hours that a reservation covered.
    */
  var CoverageHoursPercentage: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.CoverageHoursPercentage] = js.native
  /**
    * The number of instance running hours that On-Demand Instances covered.
    */
  var OnDemandHours: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.OnDemandHours] = js.native
  /**
    * The number of instance running hours that reservations covered.
    */
  var ReservedHours: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.ReservedHours] = js.native
  /**
    * The total instance usage, in hours.
    */
  var TotalRunningHours: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.TotalRunningHours] = js.native
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
    if (CoverageHoursPercentage != null) __obj.updateDynamic("CoverageHoursPercentage")(CoverageHoursPercentage.asInstanceOf[js.Any])
    if (OnDemandHours != null) __obj.updateDynamic("OnDemandHours")(OnDemandHours.asInstanceOf[js.Any])
    if (ReservedHours != null) __obj.updateDynamic("ReservedHours")(ReservedHours.asInstanceOf[js.Any])
    if (TotalRunningHours != null) __obj.updateDynamic("TotalRunningHours")(TotalRunningHours.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageHours]
  }
}

