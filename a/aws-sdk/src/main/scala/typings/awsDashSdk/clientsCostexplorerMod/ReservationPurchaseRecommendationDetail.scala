package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservationPurchaseRecommendationDetail extends js.Object {
  /**
    * The account that this RI recommendation is for.
    */
  var AccountId: js.UndefOr[GenericString] = js.native
  /**
    * The average number of normalized units that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
    */
  var AverageNormalizedUnitsUsedPerHour: js.UndefOr[GenericString] = js.native
  /**
    * The average number of instances that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
    */
  var AverageNumberOfInstancesUsedPerHour: js.UndefOr[GenericString] = js.native
  /**
    * The average utilization of your instances. AWS uses this to calculate your recommended reservation purchases.
    */
  var AverageUtilization: js.UndefOr[GenericString] = js.native
  /**
    * The currency code that AWS used to calculate the costs for this instance.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.native
  /**
    * How long AWS estimates that it takes for this instance to start saving you money, in months.
    */
  var EstimatedBreakEvenInMonths: js.UndefOr[GenericString] = js.native
  /**
    * How much AWS estimates that you spend on On-Demand Instances in a month.
    */
  var EstimatedMonthlyOnDemandCost: js.UndefOr[GenericString] = js.native
  /**
    * How much AWS estimates that this specific recommendation could save you in a month.
    */
  var EstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.native
  /**
    * How much AWS estimates that this specific recommendation could save you in a month, as a percentage of your overall costs.
    */
  var EstimatedMonthlySavingsPercentage: js.UndefOr[GenericString] = js.native
  /**
    * How much AWS estimates that you would have spent for all usage during the specified historical period if you had a reservation.
    */
  var EstimatedReservationCostForLookbackPeriod: js.UndefOr[GenericString] = js.native
  /**
    * Details about the instances that AWS recommends that you purchase.
    */
  var InstanceDetails: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.InstanceDetails] = js.native
  /**
    * The maximum number of normalized units that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
    */
  var MaximumNormalizedUnitsUsedPerHour: js.UndefOr[GenericString] = js.native
  /**
    * The maximum number of instances that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
    */
  var MaximumNumberOfInstancesUsedPerHour: js.UndefOr[GenericString] = js.native
  /**
    * The minimum number of normalized units that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
    */
  var MinimumNormalizedUnitsUsedPerHour: js.UndefOr[GenericString] = js.native
  /**
    * The minimum number of instances that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
    */
  var MinimumNumberOfInstancesUsedPerHour: js.UndefOr[GenericString] = js.native
  /**
    * The number of normalized units that AWS recommends that you purchase.
    */
  var RecommendedNormalizedUnitsToPurchase: js.UndefOr[GenericString] = js.native
  /**
    * The number of instances that AWS recommends that you purchase.
    */
  var RecommendedNumberOfInstancesToPurchase: js.UndefOr[GenericString] = js.native
  /**
    * How much purchasing this instance costs you on a monthly basis.
    */
  var RecurringStandardMonthlyCost: js.UndefOr[GenericString] = js.native
  /**
    * How much purchasing this instance costs you upfront.
    */
  var UpfrontCost: js.UndefOr[GenericString] = js.native
}

object ReservationPurchaseRecommendationDetail {
  @scala.inline
  def apply(
    AccountId: GenericString = null,
    AverageNormalizedUnitsUsedPerHour: GenericString = null,
    AverageNumberOfInstancesUsedPerHour: GenericString = null,
    AverageUtilization: GenericString = null,
    CurrencyCode: GenericString = null,
    EstimatedBreakEvenInMonths: GenericString = null,
    EstimatedMonthlyOnDemandCost: GenericString = null,
    EstimatedMonthlySavingsAmount: GenericString = null,
    EstimatedMonthlySavingsPercentage: GenericString = null,
    EstimatedReservationCostForLookbackPeriod: GenericString = null,
    InstanceDetails: InstanceDetails = null,
    MaximumNormalizedUnitsUsedPerHour: GenericString = null,
    MaximumNumberOfInstancesUsedPerHour: GenericString = null,
    MinimumNormalizedUnitsUsedPerHour: GenericString = null,
    MinimumNumberOfInstancesUsedPerHour: GenericString = null,
    RecommendedNormalizedUnitsToPurchase: GenericString = null,
    RecommendedNumberOfInstancesToPurchase: GenericString = null,
    RecurringStandardMonthlyCost: GenericString = null,
    UpfrontCost: GenericString = null
  ): ReservationPurchaseRecommendationDetail = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (AverageNormalizedUnitsUsedPerHour != null) __obj.updateDynamic("AverageNormalizedUnitsUsedPerHour")(AverageNormalizedUnitsUsedPerHour.asInstanceOf[js.Any])
    if (AverageNumberOfInstancesUsedPerHour != null) __obj.updateDynamic("AverageNumberOfInstancesUsedPerHour")(AverageNumberOfInstancesUsedPerHour.asInstanceOf[js.Any])
    if (AverageUtilization != null) __obj.updateDynamic("AverageUtilization")(AverageUtilization.asInstanceOf[js.Any])
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (EstimatedBreakEvenInMonths != null) __obj.updateDynamic("EstimatedBreakEvenInMonths")(EstimatedBreakEvenInMonths.asInstanceOf[js.Any])
    if (EstimatedMonthlyOnDemandCost != null) __obj.updateDynamic("EstimatedMonthlyOnDemandCost")(EstimatedMonthlyOnDemandCost.asInstanceOf[js.Any])
    if (EstimatedMonthlySavingsAmount != null) __obj.updateDynamic("EstimatedMonthlySavingsAmount")(EstimatedMonthlySavingsAmount.asInstanceOf[js.Any])
    if (EstimatedMonthlySavingsPercentage != null) __obj.updateDynamic("EstimatedMonthlySavingsPercentage")(EstimatedMonthlySavingsPercentage.asInstanceOf[js.Any])
    if (EstimatedReservationCostForLookbackPeriod != null) __obj.updateDynamic("EstimatedReservationCostForLookbackPeriod")(EstimatedReservationCostForLookbackPeriod.asInstanceOf[js.Any])
    if (InstanceDetails != null) __obj.updateDynamic("InstanceDetails")(InstanceDetails.asInstanceOf[js.Any])
    if (MaximumNormalizedUnitsUsedPerHour != null) __obj.updateDynamic("MaximumNormalizedUnitsUsedPerHour")(MaximumNormalizedUnitsUsedPerHour.asInstanceOf[js.Any])
    if (MaximumNumberOfInstancesUsedPerHour != null) __obj.updateDynamic("MaximumNumberOfInstancesUsedPerHour")(MaximumNumberOfInstancesUsedPerHour.asInstanceOf[js.Any])
    if (MinimumNormalizedUnitsUsedPerHour != null) __obj.updateDynamic("MinimumNormalizedUnitsUsedPerHour")(MinimumNormalizedUnitsUsedPerHour.asInstanceOf[js.Any])
    if (MinimumNumberOfInstancesUsedPerHour != null) __obj.updateDynamic("MinimumNumberOfInstancesUsedPerHour")(MinimumNumberOfInstancesUsedPerHour.asInstanceOf[js.Any])
    if (RecommendedNormalizedUnitsToPurchase != null) __obj.updateDynamic("RecommendedNormalizedUnitsToPurchase")(RecommendedNormalizedUnitsToPurchase.asInstanceOf[js.Any])
    if (RecommendedNumberOfInstancesToPurchase != null) __obj.updateDynamic("RecommendedNumberOfInstancesToPurchase")(RecommendedNumberOfInstancesToPurchase.asInstanceOf[js.Any])
    if (RecurringStandardMonthlyCost != null) __obj.updateDynamic("RecurringStandardMonthlyCost")(RecurringStandardMonthlyCost.asInstanceOf[js.Any])
    if (UpfrontCost != null) __obj.updateDynamic("UpfrontCost")(UpfrontCost.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservationPurchaseRecommendationDetail]
  }
}

