package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansCoverageData extends js.Object {
  /**
    * The percentage of your existing Savings Planscovered usage, divided by all of your eligible Savings Plans usage in an account(or set of accounts).
    */
  var CoveragePercentage: js.UndefOr[GenericString] = js.native
  /**
    * The cost of your Amazon Web Services usage at the public On-Demand rate.
    */
  var OnDemandCost: js.UndefOr[GenericString] = js.native
  /**
    * The amount of your Amazon Web Services usage that is covered by a Savings Plans.
    */
  var SpendCoveredBySavingsPlans: js.UndefOr[GenericString] = js.native
  /**
    * The total cost of your Amazon Web Services usage, regardless of your purchase option.
    */
  var TotalCost: js.UndefOr[GenericString] = js.native
}

object SavingsPlansCoverageData {
  @scala.inline
  def apply(
    CoveragePercentage: GenericString = null,
    OnDemandCost: GenericString = null,
    SpendCoveredBySavingsPlans: GenericString = null,
    TotalCost: GenericString = null
  ): SavingsPlansCoverageData = {
    val __obj = js.Dynamic.literal()
    if (CoveragePercentage != null) __obj.updateDynamic("CoveragePercentage")(CoveragePercentage.asInstanceOf[js.Any])
    if (OnDemandCost != null) __obj.updateDynamic("OnDemandCost")(OnDemandCost.asInstanceOf[js.Any])
    if (SpendCoveredBySavingsPlans != null) __obj.updateDynamic("SpendCoveredBySavingsPlans")(SpendCoveredBySavingsPlans.asInstanceOf[js.Any])
    if (TotalCost != null) __obj.updateDynamic("TotalCost")(TotalCost.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlansCoverageData]
  }
}

