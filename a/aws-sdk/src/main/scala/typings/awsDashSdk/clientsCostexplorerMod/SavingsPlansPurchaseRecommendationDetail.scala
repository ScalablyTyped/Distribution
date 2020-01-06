package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansPurchaseRecommendationDetail extends js.Object {
  /**
    * The AccountID the recommendation is generated for.
    */
  var AccountId: js.UndefOr[GenericString] = js.native
  /**
    * The currency code Amazon Web Services used to generate the recommendations and present potential savings.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.native
  /**
    * The average value of hourly On-Demand spend over the lookback period of the applicable usage type.
    */
  var CurrentAverageHourlyOnDemandSpend: js.UndefOr[GenericString] = js.native
  /**
    * The highest value of hourly On-Demand spend over the lookback period of the applicable usage type.
    */
  var CurrentMaximumHourlyOnDemandSpend: js.UndefOr[GenericString] = js.native
  /**
    * The lowest value of hourly On-Demand spend over the lookback period of the applicable usage type.
    */
  var CurrentMinimumHourlyOnDemandSpend: js.UndefOr[GenericString] = js.native
  /**
    * The estimated utilization of the recommended Savings Plans.
    */
  var EstimatedAverageUtilization: js.UndefOr[GenericString] = js.native
  /**
    * The estimated monthly savings amount, based on the recommended Savings Plans.
    */
  var EstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.native
  /**
    * The remaining On-Demand cost estimated to not be covered by the recommended Savings Plans, over the length of the lookback period.
    */
  var EstimatedOnDemandCost: js.UndefOr[GenericString] = js.native
  /**
    *  The estimated On-Demand costs you would expect with no additional commitment, based on your usage of the selected time period and the Savings Plans you own. 
    */
  var EstimatedOnDemandCostWithCurrentCommitment: js.UndefOr[GenericString] = js.native
  /**
    * The estimated return on investment based on the recommended Savings Plans purchased. This is calculated as estimatedSavingsAmount/ estimatedSPCost*100.
    */
  var EstimatedROI: js.UndefOr[GenericString] = js.native
  /**
    * The cost of the recommended Savings Plans over the length of the lookback period.
    */
  var EstimatedSPCost: js.UndefOr[GenericString] = js.native
  /**
    * The estimated savings amount based on the recommended Savings Plans over the length of the lookback period.
    */
  var EstimatedSavingsAmount: js.UndefOr[GenericString] = js.native
  /**
    * The estimated savings percentage relative to the total cost of applicable On-Demand usage over the lookback period.
    */
  var EstimatedSavingsPercentage: js.UndefOr[GenericString] = js.native
  /**
    * The recommended hourly commitment level for the Savings Plans type, and configuration based on the usage during the lookback period.
    */
  var HourlyCommitmentToPurchase: js.UndefOr[GenericString] = js.native
  /**
    * Details for your recommended Savings Plans.
    */
  var SavingsPlansDetails: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.SavingsPlansDetails] = js.native
  /**
    * The upfront cost of the recommended Savings Plans, based on the selected payment option.
    */
  var UpfrontCost: js.UndefOr[GenericString] = js.native
}

object SavingsPlansPurchaseRecommendationDetail {
  @scala.inline
  def apply(
    AccountId: GenericString = null,
    CurrencyCode: GenericString = null,
    CurrentAverageHourlyOnDemandSpend: GenericString = null,
    CurrentMaximumHourlyOnDemandSpend: GenericString = null,
    CurrentMinimumHourlyOnDemandSpend: GenericString = null,
    EstimatedAverageUtilization: GenericString = null,
    EstimatedMonthlySavingsAmount: GenericString = null,
    EstimatedOnDemandCost: GenericString = null,
    EstimatedOnDemandCostWithCurrentCommitment: GenericString = null,
    EstimatedROI: GenericString = null,
    EstimatedSPCost: GenericString = null,
    EstimatedSavingsAmount: GenericString = null,
    EstimatedSavingsPercentage: GenericString = null,
    HourlyCommitmentToPurchase: GenericString = null,
    SavingsPlansDetails: SavingsPlansDetails = null,
    UpfrontCost: GenericString = null
  ): SavingsPlansPurchaseRecommendationDetail = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (CurrentAverageHourlyOnDemandSpend != null) __obj.updateDynamic("CurrentAverageHourlyOnDemandSpend")(CurrentAverageHourlyOnDemandSpend.asInstanceOf[js.Any])
    if (CurrentMaximumHourlyOnDemandSpend != null) __obj.updateDynamic("CurrentMaximumHourlyOnDemandSpend")(CurrentMaximumHourlyOnDemandSpend.asInstanceOf[js.Any])
    if (CurrentMinimumHourlyOnDemandSpend != null) __obj.updateDynamic("CurrentMinimumHourlyOnDemandSpend")(CurrentMinimumHourlyOnDemandSpend.asInstanceOf[js.Any])
    if (EstimatedAverageUtilization != null) __obj.updateDynamic("EstimatedAverageUtilization")(EstimatedAverageUtilization.asInstanceOf[js.Any])
    if (EstimatedMonthlySavingsAmount != null) __obj.updateDynamic("EstimatedMonthlySavingsAmount")(EstimatedMonthlySavingsAmount.asInstanceOf[js.Any])
    if (EstimatedOnDemandCost != null) __obj.updateDynamic("EstimatedOnDemandCost")(EstimatedOnDemandCost.asInstanceOf[js.Any])
    if (EstimatedOnDemandCostWithCurrentCommitment != null) __obj.updateDynamic("EstimatedOnDemandCostWithCurrentCommitment")(EstimatedOnDemandCostWithCurrentCommitment.asInstanceOf[js.Any])
    if (EstimatedROI != null) __obj.updateDynamic("EstimatedROI")(EstimatedROI.asInstanceOf[js.Any])
    if (EstimatedSPCost != null) __obj.updateDynamic("EstimatedSPCost")(EstimatedSPCost.asInstanceOf[js.Any])
    if (EstimatedSavingsAmount != null) __obj.updateDynamic("EstimatedSavingsAmount")(EstimatedSavingsAmount.asInstanceOf[js.Any])
    if (EstimatedSavingsPercentage != null) __obj.updateDynamic("EstimatedSavingsPercentage")(EstimatedSavingsPercentage.asInstanceOf[js.Any])
    if (HourlyCommitmentToPurchase != null) __obj.updateDynamic("HourlyCommitmentToPurchase")(HourlyCommitmentToPurchase.asInstanceOf[js.Any])
    if (SavingsPlansDetails != null) __obj.updateDynamic("SavingsPlansDetails")(SavingsPlansDetails.asInstanceOf[js.Any])
    if (UpfrontCost != null) __obj.updateDynamic("UpfrontCost")(UpfrontCost.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlansPurchaseRecommendationDetail]
  }
}

