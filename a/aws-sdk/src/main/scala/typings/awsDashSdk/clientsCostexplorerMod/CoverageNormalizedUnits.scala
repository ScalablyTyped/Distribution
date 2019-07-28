package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageNormalizedUnits extends js.Object {
  /**
    * The percentage of your used instance normalized units that a reservation covers.
    */
  var CoverageNormalizedUnitsPercentage: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.CoverageNormalizedUnitsPercentage] = js.undefined
  /**
    * The number of normalized units that are covered by On-Demand Instances instead of a reservation.
    */
  var OnDemandNormalizedUnits: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.OnDemandNormalizedUnits] = js.undefined
  /**
    * The number of normalized units that a reservation covers.
    */
  var ReservedNormalizedUnits: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.ReservedNormalizedUnits] = js.undefined
  /**
    * The total number of normalized units that you used.
    */
  var TotalRunningNormalizedUnits: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.TotalRunningNormalizedUnits] = js.undefined
}

object CoverageNormalizedUnits {
  @scala.inline
  def apply(
    CoverageNormalizedUnitsPercentage: CoverageNormalizedUnitsPercentage = null,
    OnDemandNormalizedUnits: OnDemandNormalizedUnits = null,
    ReservedNormalizedUnits: ReservedNormalizedUnits = null,
    TotalRunningNormalizedUnits: TotalRunningNormalizedUnits = null
  ): CoverageNormalizedUnits = {
    val __obj = js.Dynamic.literal()
    if (CoverageNormalizedUnitsPercentage != null) __obj.updateDynamic("CoverageNormalizedUnitsPercentage")(CoverageNormalizedUnitsPercentage)
    if (OnDemandNormalizedUnits != null) __obj.updateDynamic("OnDemandNormalizedUnits")(OnDemandNormalizedUnits)
    if (ReservedNormalizedUnits != null) __obj.updateDynamic("ReservedNormalizedUnits")(ReservedNormalizedUnits)
    if (TotalRunningNormalizedUnits != null) __obj.updateDynamic("TotalRunningNormalizedUnits")(TotalRunningNormalizedUnits)
    __obj.asInstanceOf[CoverageNormalizedUnits]
  }
}

