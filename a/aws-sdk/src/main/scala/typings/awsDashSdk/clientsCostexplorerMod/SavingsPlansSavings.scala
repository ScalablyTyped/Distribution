package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansSavings extends js.Object {
  /**
    * The savings amount that you are accumulating for the usage that is covered by a Savings Plans, when compared to the On-Demand equivalent of the same usage.
    */
  var NetSavings: js.UndefOr[GenericString] = js.native
  /**
    * How much the amount that the usage would have cost if it was accrued at the On-Demand rate.
    */
  var OnDemandCostEquivalent: js.UndefOr[GenericString] = js.native
}

object SavingsPlansSavings {
  @scala.inline
  def apply(NetSavings: GenericString = null, OnDemandCostEquivalent: GenericString = null): SavingsPlansSavings = {
    val __obj = js.Dynamic.literal()
    if (NetSavings != null) __obj.updateDynamic("NetSavings")(NetSavings.asInstanceOf[js.Any])
    if (OnDemandCostEquivalent != null) __obj.updateDynamic("OnDemandCostEquivalent")(OnDemandCostEquivalent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlansSavings]
  }
}

