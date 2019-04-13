package typings
package awsDashSdkLib.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservationPurchaseRecommendationDetail extends js.Object {
  /**
    * The account that this RI recommendation is for.
    */
  var AccountId: js.UndefOr[GenericString] = js.undefined
  /**
    * The average number of normalized units that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
    */
  var AverageNormalizedUnitsUsedPerHour: js.UndefOr[GenericString] = js.undefined
  /**
    * The average number of instances that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
    */
  var AverageNumberOfInstancesUsedPerHour: js.UndefOr[GenericString] = js.undefined
  /**
    * The average utilization of your instances. AWS uses this to calculate your recommended reservation purchases.
    */
  var AverageUtilization: js.UndefOr[GenericString] = js.undefined
  /**
    * The currency code that AWS used to calculate the costs for this instance.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.undefined
  /**
    * How long AWS estimates that it takes for this instance to start saving you money, in months.
    */
  var EstimatedBreakEvenInMonths: js.UndefOr[GenericString] = js.undefined
  /**
    * How much AWS estimates that you spend on On-Demand Instances in a month.
    */
  var EstimatedMonthlyOnDemandCost: js.UndefOr[GenericString] = js.undefined
  /**
    * How much AWS estimates that this specific recommendation could save you in a month.
    */
  var EstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.undefined
  /**
    * How much AWS estimates that this specific recommendation could save you in a month, as a percentage of your overall costs.
    */
  var EstimatedMonthlySavingsPercentage: js.UndefOr[GenericString] = js.undefined
  /**
    * How much AWS estimates that you would have spent for all usage during the specified historical period if you had had a reservation.
    */
  var EstimatedReservationCostForLookbackPeriod: js.UndefOr[GenericString] = js.undefined
  /**
    * Details about the instances that AWS recommends that you purchase.
    */
  var InstanceDetails: js.UndefOr[InstanceDetails] = js.undefined
  /**
    * The maximum number of normalized units that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
    */
  var MaximumNormalizedUnitsUsedPerHour: js.UndefOr[GenericString] = js.undefined
  /**
    * The maximum number of instances that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
    */
  var MaximumNumberOfInstancesUsedPerHour: js.UndefOr[GenericString] = js.undefined
  /**
    * The minimum number of normalized units that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
    */
  var MinimumNormalizedUnitsUsedPerHour: js.UndefOr[GenericString] = js.undefined
  /**
    * The minimum number of instances that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
    */
  var MinimumNumberOfInstancesUsedPerHour: js.UndefOr[GenericString] = js.undefined
  /**
    * The number of normalized units that AWS recommends that you purchase.
    */
  var RecommendedNormalizedUnitsToPurchase: js.UndefOr[GenericString] = js.undefined
  /**
    * The number of instances that AWS recommends that you purchase.
    */
  var RecommendedNumberOfInstancesToPurchase: js.UndefOr[GenericString] = js.undefined
  /**
    * How much purchasing this instance costs you on a monthly basis.
    */
  var RecurringStandardMonthlyCost: js.UndefOr[GenericString] = js.undefined
  /**
    * How much purchasing this instance costs you upfront.
    */
  var UpfrontCost: js.UndefOr[GenericString] = js.undefined
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
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId)
    if (AverageNormalizedUnitsUsedPerHour != null) __obj.updateDynamic("AverageNormalizedUnitsUsedPerHour")(AverageNormalizedUnitsUsedPerHour)
    if (AverageNumberOfInstancesUsedPerHour != null) __obj.updateDynamic("AverageNumberOfInstancesUsedPerHour")(AverageNumberOfInstancesUsedPerHour)
    if (AverageUtilization != null) __obj.updateDynamic("AverageUtilization")(AverageUtilization)
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode)
    if (EstimatedBreakEvenInMonths != null) __obj.updateDynamic("EstimatedBreakEvenInMonths")(EstimatedBreakEvenInMonths)
    if (EstimatedMonthlyOnDemandCost != null) __obj.updateDynamic("EstimatedMonthlyOnDemandCost")(EstimatedMonthlyOnDemandCost)
    if (EstimatedMonthlySavingsAmount != null) __obj.updateDynamic("EstimatedMonthlySavingsAmount")(EstimatedMonthlySavingsAmount)
    if (EstimatedMonthlySavingsPercentage != null) __obj.updateDynamic("EstimatedMonthlySavingsPercentage")(EstimatedMonthlySavingsPercentage)
    if (EstimatedReservationCostForLookbackPeriod != null) __obj.updateDynamic("EstimatedReservationCostForLookbackPeriod")(EstimatedReservationCostForLookbackPeriod)
    if (InstanceDetails != null) __obj.updateDynamic("InstanceDetails")(InstanceDetails)
    if (MaximumNormalizedUnitsUsedPerHour != null) __obj.updateDynamic("MaximumNormalizedUnitsUsedPerHour")(MaximumNormalizedUnitsUsedPerHour)
    if (MaximumNumberOfInstancesUsedPerHour != null) __obj.updateDynamic("MaximumNumberOfInstancesUsedPerHour")(MaximumNumberOfInstancesUsedPerHour)
    if (MinimumNormalizedUnitsUsedPerHour != null) __obj.updateDynamic("MinimumNormalizedUnitsUsedPerHour")(MinimumNormalizedUnitsUsedPerHour)
    if (MinimumNumberOfInstancesUsedPerHour != null) __obj.updateDynamic("MinimumNumberOfInstancesUsedPerHour")(MinimumNumberOfInstancesUsedPerHour)
    if (RecommendedNormalizedUnitsToPurchase != null) __obj.updateDynamic("RecommendedNormalizedUnitsToPurchase")(RecommendedNormalizedUnitsToPurchase)
    if (RecommendedNumberOfInstancesToPurchase != null) __obj.updateDynamic("RecommendedNumberOfInstancesToPurchase")(RecommendedNumberOfInstancesToPurchase)
    if (RecurringStandardMonthlyCost != null) __obj.updateDynamic("RecurringStandardMonthlyCost")(RecurringStandardMonthlyCost)
    if (UpfrontCost != null) __obj.updateDynamic("UpfrontCost")(UpfrontCost)
    __obj.asInstanceOf[ReservationPurchaseRecommendationDetail]
  }
}

