package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansAmortizedCommitment extends js.Object {
  /**
    * The amortized amount of your Savings Plans commitment that was purchased with either a Partial or a NoUpfront.
    */
  var AmortizedRecurringCommitment: js.UndefOr[GenericString] = js.native
  /**
    * The amortized amount of your Savings Plans commitment that was purchased with an Upfront or PartialUpfront Savings Plans.
    */
  var AmortizedUpfrontCommitment: js.UndefOr[GenericString] = js.native
  /**
    * The total amortized amount of your Savings Plans commitment, regardless of your Savings Plans purchase method. 
    */
  var TotalAmortizedCommitment: js.UndefOr[GenericString] = js.native
}

object SavingsPlansAmortizedCommitment {
  @scala.inline
  def apply(
    AmortizedRecurringCommitment: GenericString = null,
    AmortizedUpfrontCommitment: GenericString = null,
    TotalAmortizedCommitment: GenericString = null
  ): SavingsPlansAmortizedCommitment = {
    val __obj = js.Dynamic.literal()
    if (AmortizedRecurringCommitment != null) __obj.updateDynamic("AmortizedRecurringCommitment")(AmortizedRecurringCommitment.asInstanceOf[js.Any])
    if (AmortizedUpfrontCommitment != null) __obj.updateDynamic("AmortizedUpfrontCommitment")(AmortizedUpfrontCommitment.asInstanceOf[js.Any])
    if (TotalAmortizedCommitment != null) __obj.updateDynamic("TotalAmortizedCommitment")(TotalAmortizedCommitment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlansAmortizedCommitment]
  }
}

