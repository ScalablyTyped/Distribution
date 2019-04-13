package typings
package awsDashSdkLib.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coverage extends js.Object {
  /**
    * The amount of cost that the reservation covered.
    */
  var CoverageCost: js.UndefOr[CoverageCost] = js.undefined
  /**
    * The amount of instance usage that the reservation covered, in hours.
    */
  var CoverageHours: js.UndefOr[CoverageHours] = js.undefined
  /**
    * The amount of instance usage that the reservation covered, in normalized units.
    */
  var CoverageNormalizedUnits: js.UndefOr[CoverageNormalizedUnits] = js.undefined
}

object Coverage {
  @scala.inline
  def apply(
    CoverageCost: CoverageCost = null,
    CoverageHours: CoverageHours = null,
    CoverageNormalizedUnits: CoverageNormalizedUnits = null
  ): Coverage = {
    val __obj = js.Dynamic.literal()
    if (CoverageCost != null) __obj.updateDynamic("CoverageCost")(CoverageCost)
    if (CoverageHours != null) __obj.updateDynamic("CoverageHours")(CoverageHours)
    if (CoverageNormalizedUnits != null) __obj.updateDynamic("CoverageNormalizedUnits")(CoverageNormalizedUnits)
    __obj.asInstanceOf[Coverage]
  }
}

