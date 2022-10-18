package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservationPurchaseRecommendationDetail extends StObject {
  
  /**
    * The account that this Reserved Instance (RI) recommendation is for.
    */
  var AccountId: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The average number of normalized units that you used in an hour during the historical period. Amazon Web Services uses this to calculate your recommended reservation purchases.
    */
  var AverageNormalizedUnitsUsedPerHour: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The average number of instances that you used in an hour during the historical period. Amazon Web Services uses this to calculate your recommended reservation purchases.
    */
  var AverageNumberOfInstancesUsedPerHour: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The average utilization of your instances. Amazon Web Services uses this to calculate your recommended reservation purchases.
    */
  var AverageUtilization: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The currency code that Amazon Web Services used to calculate the costs for this instance.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.undefined
  
  /**
    * How long Amazon Web Services estimates that it takes for this instance to start saving you money, in months.
    */
  var EstimatedBreakEvenInMonths: js.UndefOr[GenericString] = js.undefined
  
  /**
    * How much Amazon Web Services estimates that you spend on On-Demand Instances in a month.
    */
  var EstimatedMonthlyOnDemandCost: js.UndefOr[GenericString] = js.undefined
  
  /**
    * How much Amazon Web Services estimates that this specific recommendation might save you in a month.
    */
  var EstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.undefined
  
  /**
    * How much Amazon Web Services estimates that this specific recommendation might save you in a month, as a percentage of your overall costs.
    */
  var EstimatedMonthlySavingsPercentage: js.UndefOr[GenericString] = js.undefined
  
  /**
    * How much Amazon Web Services estimates that you might spend for all usage during the specified historical period if you had a reservation.
    */
  var EstimatedReservationCostForLookbackPeriod: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Details about the instances that Amazon Web Services recommends that you purchase.
    */
  var InstanceDetails: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.InstanceDetails] = js.undefined
  
  /**
    * The maximum number of normalized units that you used in an hour during the historical period. Amazon Web Services uses this to calculate your recommended reservation purchases.
    */
  var MaximumNormalizedUnitsUsedPerHour: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The maximum number of instances that you used in an hour during the historical period. Amazon Web Services uses this to calculate your recommended reservation purchases.
    */
  var MaximumNumberOfInstancesUsedPerHour: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The minimum number of normalized units that you used in an hour during the historical period. Amazon Web Services uses this to calculate your recommended reservation purchases.
    */
  var MinimumNormalizedUnitsUsedPerHour: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The minimum number of instances that you used in an hour during the historical period. Amazon Web Services uses this to calculate your recommended reservation purchases.
    */
  var MinimumNumberOfInstancesUsedPerHour: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The number of normalized units that Amazon Web Services recommends that you purchase.
    */
  var RecommendedNormalizedUnitsToPurchase: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The number of instances that Amazon Web Services recommends that you purchase.
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
  
  inline def apply(): ReservationPurchaseRecommendationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationPurchaseRecommendationDetail]
  }
  
  extension [Self <: ReservationPurchaseRecommendationDetail](x: Self) {
    
    inline def setAccountId(value: GenericString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAverageNormalizedUnitsUsedPerHour(value: GenericString): Self = StObject.set(x, "AverageNormalizedUnitsUsedPerHour", value.asInstanceOf[js.Any])
    
    inline def setAverageNormalizedUnitsUsedPerHourUndefined: Self = StObject.set(x, "AverageNormalizedUnitsUsedPerHour", js.undefined)
    
    inline def setAverageNumberOfInstancesUsedPerHour(value: GenericString): Self = StObject.set(x, "AverageNumberOfInstancesUsedPerHour", value.asInstanceOf[js.Any])
    
    inline def setAverageNumberOfInstancesUsedPerHourUndefined: Self = StObject.set(x, "AverageNumberOfInstancesUsedPerHour", js.undefined)
    
    inline def setAverageUtilization(value: GenericString): Self = StObject.set(x, "AverageUtilization", value.asInstanceOf[js.Any])
    
    inline def setAverageUtilizationUndefined: Self = StObject.set(x, "AverageUtilization", js.undefined)
    
    inline def setCurrencyCode(value: GenericString): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    inline def setEstimatedBreakEvenInMonths(value: GenericString): Self = StObject.set(x, "EstimatedBreakEvenInMonths", value.asInstanceOf[js.Any])
    
    inline def setEstimatedBreakEvenInMonthsUndefined: Self = StObject.set(x, "EstimatedBreakEvenInMonths", js.undefined)
    
    inline def setEstimatedMonthlyOnDemandCost(value: GenericString): Self = StObject.set(x, "EstimatedMonthlyOnDemandCost", value.asInstanceOf[js.Any])
    
    inline def setEstimatedMonthlyOnDemandCostUndefined: Self = StObject.set(x, "EstimatedMonthlyOnDemandCost", js.undefined)
    
    inline def setEstimatedMonthlySavingsAmount(value: GenericString): Self = StObject.set(x, "EstimatedMonthlySavingsAmount", value.asInstanceOf[js.Any])
    
    inline def setEstimatedMonthlySavingsAmountUndefined: Self = StObject.set(x, "EstimatedMonthlySavingsAmount", js.undefined)
    
    inline def setEstimatedMonthlySavingsPercentage(value: GenericString): Self = StObject.set(x, "EstimatedMonthlySavingsPercentage", value.asInstanceOf[js.Any])
    
    inline def setEstimatedMonthlySavingsPercentageUndefined: Self = StObject.set(x, "EstimatedMonthlySavingsPercentage", js.undefined)
    
    inline def setEstimatedReservationCostForLookbackPeriod(value: GenericString): Self = StObject.set(x, "EstimatedReservationCostForLookbackPeriod", value.asInstanceOf[js.Any])
    
    inline def setEstimatedReservationCostForLookbackPeriodUndefined: Self = StObject.set(x, "EstimatedReservationCostForLookbackPeriod", js.undefined)
    
    inline def setInstanceDetails(value: InstanceDetails): Self = StObject.set(x, "InstanceDetails", value.asInstanceOf[js.Any])
    
    inline def setInstanceDetailsUndefined: Self = StObject.set(x, "InstanceDetails", js.undefined)
    
    inline def setMaximumNormalizedUnitsUsedPerHour(value: GenericString): Self = StObject.set(x, "MaximumNormalizedUnitsUsedPerHour", value.asInstanceOf[js.Any])
    
    inline def setMaximumNormalizedUnitsUsedPerHourUndefined: Self = StObject.set(x, "MaximumNormalizedUnitsUsedPerHour", js.undefined)
    
    inline def setMaximumNumberOfInstancesUsedPerHour(value: GenericString): Self = StObject.set(x, "MaximumNumberOfInstancesUsedPerHour", value.asInstanceOf[js.Any])
    
    inline def setMaximumNumberOfInstancesUsedPerHourUndefined: Self = StObject.set(x, "MaximumNumberOfInstancesUsedPerHour", js.undefined)
    
    inline def setMinimumNormalizedUnitsUsedPerHour(value: GenericString): Self = StObject.set(x, "MinimumNormalizedUnitsUsedPerHour", value.asInstanceOf[js.Any])
    
    inline def setMinimumNormalizedUnitsUsedPerHourUndefined: Self = StObject.set(x, "MinimumNormalizedUnitsUsedPerHour", js.undefined)
    
    inline def setMinimumNumberOfInstancesUsedPerHour(value: GenericString): Self = StObject.set(x, "MinimumNumberOfInstancesUsedPerHour", value.asInstanceOf[js.Any])
    
    inline def setMinimumNumberOfInstancesUsedPerHourUndefined: Self = StObject.set(x, "MinimumNumberOfInstancesUsedPerHour", js.undefined)
    
    inline def setRecommendedNormalizedUnitsToPurchase(value: GenericString): Self = StObject.set(x, "RecommendedNormalizedUnitsToPurchase", value.asInstanceOf[js.Any])
    
    inline def setRecommendedNormalizedUnitsToPurchaseUndefined: Self = StObject.set(x, "RecommendedNormalizedUnitsToPurchase", js.undefined)
    
    inline def setRecommendedNumberOfInstancesToPurchase(value: GenericString): Self = StObject.set(x, "RecommendedNumberOfInstancesToPurchase", value.asInstanceOf[js.Any])
    
    inline def setRecommendedNumberOfInstancesToPurchaseUndefined: Self = StObject.set(x, "RecommendedNumberOfInstancesToPurchase", js.undefined)
    
    inline def setRecurringStandardMonthlyCost(value: GenericString): Self = StObject.set(x, "RecurringStandardMonthlyCost", value.asInstanceOf[js.Any])
    
    inline def setRecurringStandardMonthlyCostUndefined: Self = StObject.set(x, "RecurringStandardMonthlyCost", js.undefined)
    
    inline def setUpfrontCost(value: GenericString): Self = StObject.set(x, "UpfrontCost", value.asInstanceOf[js.Any])
    
    inline def setUpfrontCostUndefined: Self = StObject.set(x, "UpfrontCost", js.undefined)
  }
}
