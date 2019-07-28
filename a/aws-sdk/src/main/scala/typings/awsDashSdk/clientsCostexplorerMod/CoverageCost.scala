package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageCost extends js.Object {
  /**
    * How much an On-Demand instance cost.
    */
  var OnDemandCost: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.OnDemandCost] = js.undefined
}

object CoverageCost {
  @scala.inline
  def apply(OnDemandCost: OnDemandCost = null): CoverageCost = {
    val __obj = js.Dynamic.literal()
    if (OnDemandCost != null) __obj.updateDynamic("OnDemandCost")(OnDemandCost)
    __obj.asInstanceOf[CoverageCost]
  }
}

