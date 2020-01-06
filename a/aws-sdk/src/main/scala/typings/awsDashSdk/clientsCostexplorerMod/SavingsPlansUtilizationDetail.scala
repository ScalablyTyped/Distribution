package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansUtilizationDetail extends js.Object {
  /**
    * The total amortized commitment for a Savings Plans. Includes the sum of the upfront and recurring Savings Plans fees.
    */
  var AmortizedCommitment: js.UndefOr[SavingsPlansAmortizedCommitment] = js.native
  /**
    * The attribute that applies to a specific Dimension.
    */
  var Attributes: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.Attributes] = js.native
  /**
    * The amount saved by using existing Savings Plans. Savings returns both net savings from savings plans as well as the onDemandCostEquivalent of the Savings Plans when considering the utilization rate.
    */
  var Savings: js.UndefOr[SavingsPlansSavings] = js.native
  /**
    * The unique Amazon Resource Name (ARN) for a particular Savings Plan.
    */
  var SavingsPlanArn: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.SavingsPlanArn] = js.native
  /**
    * A ratio of your effectiveness of using existing Savings Plans to apply to workloads that are Savings Plans eligible.
    */
  var Utilization: js.UndefOr[SavingsPlansUtilization] = js.native
}

object SavingsPlansUtilizationDetail {
  @scala.inline
  def apply(
    AmortizedCommitment: SavingsPlansAmortizedCommitment = null,
    Attributes: Attributes = null,
    Savings: SavingsPlansSavings = null,
    SavingsPlanArn: SavingsPlanArn = null,
    Utilization: SavingsPlansUtilization = null
  ): SavingsPlansUtilizationDetail = {
    val __obj = js.Dynamic.literal()
    if (AmortizedCommitment != null) __obj.updateDynamic("AmortizedCommitment")(AmortizedCommitment.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (Savings != null) __obj.updateDynamic("Savings")(Savings.asInstanceOf[js.Any])
    if (SavingsPlanArn != null) __obj.updateDynamic("SavingsPlanArn")(SavingsPlanArn.asInstanceOf[js.Any])
    if (Utilization != null) __obj.updateDynamic("Utilization")(Utilization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlansUtilizationDetail]
  }
}

