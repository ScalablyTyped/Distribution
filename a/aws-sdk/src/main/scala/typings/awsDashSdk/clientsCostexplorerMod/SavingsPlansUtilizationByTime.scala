package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansUtilizationByTime extends js.Object {
  /**
    * The total amortized commitment for a Savings Plans. This includes the sum of the upfront and recurring Savings Plans fees.
    */
  var AmortizedCommitment: js.UndefOr[SavingsPlansAmortizedCommitment] = js.native
  /**
    * The amount saved by using existing Savings Plans. Savings returns both net savings from Savings Plans as well as the onDemandCostEquivalent of the Savings Plans when considering the utilization rate.
    */
  var Savings: js.UndefOr[SavingsPlansSavings] = js.native
  var TimePeriod: DateInterval = js.native
  /**
    * A ratio of your effectiveness of using existing Savings Plans to apply to workloads that are Savings Plans eligible.
    */
  var Utilization: SavingsPlansUtilization = js.native
}

object SavingsPlansUtilizationByTime {
  @scala.inline
  def apply(
    TimePeriod: DateInterval,
    Utilization: SavingsPlansUtilization,
    AmortizedCommitment: SavingsPlansAmortizedCommitment = null,
    Savings: SavingsPlansSavings = null
  ): SavingsPlansUtilizationByTime = {
    val __obj = js.Dynamic.literal(TimePeriod = TimePeriod.asInstanceOf[js.Any], Utilization = Utilization.asInstanceOf[js.Any])
    if (AmortizedCommitment != null) __obj.updateDynamic("AmortizedCommitment")(AmortizedCommitment.asInstanceOf[js.Any])
    if (Savings != null) __obj.updateDynamic("Savings")(Savings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlansUtilizationByTime]
  }
}

