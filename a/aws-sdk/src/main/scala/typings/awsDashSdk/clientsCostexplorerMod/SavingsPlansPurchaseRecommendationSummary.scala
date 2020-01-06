package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansPurchaseRecommendationSummary extends js.Object {
  /**
    * The currency code Amazon Web Services used to generate the recommendations and present potential savings.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.native
  /**
    * The current total on demand spend of the applicable usage types over the lookback period.
    */
  var CurrentOnDemandSpend: js.UndefOr[GenericString] = js.native
  /**
    * The recommended Savings Plans cost on a daily (24 hourly) basis.
    */
  var DailyCommitmentToPurchase: js.UndefOr[GenericString] = js.native
  /**
    * The estimated monthly savings amount, based on the recommended Savings Plans purchase.
    */
  var EstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.native
  /**
    *  The estimated On-Demand costs you would expect with no additional commitment, based on your usage of the selected time period and the Savings Plans you own. 
    */
  var EstimatedOnDemandCostWithCurrentCommitment: js.UndefOr[GenericString] = js.native
  /**
    * The estimated return on investment based on the recommended Savings Plans and estimated savings.
    */
  var EstimatedROI: js.UndefOr[GenericString] = js.native
  /**
    * The estimated total savings over the lookback period, based on the purchase of the recommended Savings Plans.
    */
  var EstimatedSavingsAmount: js.UndefOr[GenericString] = js.native
  /**
    * The estimated savings relative to the total cost of On-Demand usage, over the lookback period. This is calculated as estimatedSavingsAmount/ CurrentOnDemandSpend*100.
    */
  var EstimatedSavingsPercentage: js.UndefOr[GenericString] = js.native
  /**
    * The estimated total cost of the usage after purchasing the recommended Savings Plans. This is a sum of the cost of Savings Plans during this term, and the remaining On-Demand usage.
    */
  var EstimatedTotalCost: js.UndefOr[GenericString] = js.native
  /**
    * The recommended hourly commitment based on the recommendation parameters.
    */
  var HourlyCommitmentToPurchase: js.UndefOr[GenericString] = js.native
  /**
    * The aggregate number of Savings Plans recommendations that exist for your account.
    */
  var TotalRecommendationCount: js.UndefOr[GenericString] = js.native
}

object SavingsPlansPurchaseRecommendationSummary {
  @scala.inline
  def apply(
    CurrencyCode: GenericString = null,
    CurrentOnDemandSpend: GenericString = null,
    DailyCommitmentToPurchase: GenericString = null,
    EstimatedMonthlySavingsAmount: GenericString = null,
    EstimatedOnDemandCostWithCurrentCommitment: GenericString = null,
    EstimatedROI: GenericString = null,
    EstimatedSavingsAmount: GenericString = null,
    EstimatedSavingsPercentage: GenericString = null,
    EstimatedTotalCost: GenericString = null,
    HourlyCommitmentToPurchase: GenericString = null,
    TotalRecommendationCount: GenericString = null
  ): SavingsPlansPurchaseRecommendationSummary = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (CurrentOnDemandSpend != null) __obj.updateDynamic("CurrentOnDemandSpend")(CurrentOnDemandSpend.asInstanceOf[js.Any])
    if (DailyCommitmentToPurchase != null) __obj.updateDynamic("DailyCommitmentToPurchase")(DailyCommitmentToPurchase.asInstanceOf[js.Any])
    if (EstimatedMonthlySavingsAmount != null) __obj.updateDynamic("EstimatedMonthlySavingsAmount")(EstimatedMonthlySavingsAmount.asInstanceOf[js.Any])
    if (EstimatedOnDemandCostWithCurrentCommitment != null) __obj.updateDynamic("EstimatedOnDemandCostWithCurrentCommitment")(EstimatedOnDemandCostWithCurrentCommitment.asInstanceOf[js.Any])
    if (EstimatedROI != null) __obj.updateDynamic("EstimatedROI")(EstimatedROI.asInstanceOf[js.Any])
    if (EstimatedSavingsAmount != null) __obj.updateDynamic("EstimatedSavingsAmount")(EstimatedSavingsAmount.asInstanceOf[js.Any])
    if (EstimatedSavingsPercentage != null) __obj.updateDynamic("EstimatedSavingsPercentage")(EstimatedSavingsPercentage.asInstanceOf[js.Any])
    if (EstimatedTotalCost != null) __obj.updateDynamic("EstimatedTotalCost")(EstimatedTotalCost.asInstanceOf[js.Any])
    if (HourlyCommitmentToPurchase != null) __obj.updateDynamic("HourlyCommitmentToPurchase")(HourlyCommitmentToPurchase.asInstanceOf[js.Any])
    if (TotalRecommendationCount != null) __obj.updateDynamic("TotalRecommendationCount")(TotalRecommendationCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlansPurchaseRecommendationSummary]
  }
}

