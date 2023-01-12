package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservationAggregates extends StObject {
  
  /**
    * The monthly cost of your reservation. It's amortized over the reservation period.
    */
  var AmortizedRecurringFee: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.AmortizedRecurringFee] = js.undefined
  
  /**
    * The upfront cost of your reservation. It's amortized over the reservation period.
    */
  var AmortizedUpfrontFee: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.AmortizedUpfrontFee] = js.undefined
  
  /**
    * How much you saved due to purchasing and utilizing reservation. Amazon Web Services calculates this by subtracting TotalAmortizedFee from OnDemandCostOfRIHoursUsed.
    */
  var NetRISavings: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.NetRISavings] = js.undefined
  
  /**
    * How much your reservation costs if charged On-Demand rates.
    */
  var OnDemandCostOfRIHoursUsed: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.OnDemandCostOfRIHoursUsed] = js.undefined
  
  /**
    * How many reservation hours that you purchased.
    */
  var PurchasedHours: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.PurchasedHours] = js.undefined
  
  /**
    * The number of Amazon EC2 reservation hours that you purchased. It's converted to normalized units. Normalized units are available only for Amazon EC2 usage after November 11, 2017.
    */
  var PurchasedUnits: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.PurchasedUnits] = js.undefined
  
  /**
    * The cost of unused hours for your reservation.
    */
  var RICostForUnusedHours: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.RICostForUnusedHours] = js.undefined
  
  /**
    * The realized savings because of purchasing and using a reservation.
    */
  var RealizedSavings: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.RealizedSavings] = js.undefined
  
  /**
    * The total number of reservation hours that you used.
    */
  var TotalActualHours: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.TotalActualHours] = js.undefined
  
  /**
    * The total number of Amazon EC2 reservation hours that you used. It's converted to normalized units. Normalized units are available only for Amazon EC2 usage after November 11, 2017.
    */
  var TotalActualUnits: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.TotalActualUnits] = js.undefined
  
  /**
    * The total cost of your reservation. It's amortized over the reservation period.
    */
  var TotalAmortizedFee: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.TotalAmortizedFee] = js.undefined
  
  /**
    * How much you might save if you use your entire reservation.
    */
  var TotalPotentialRISavings: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.TotalPotentialRISavings] = js.undefined
  
  /**
    * The unrealized savings because of purchasing and using a reservation.
    */
  var UnrealizedSavings: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.UnrealizedSavings] = js.undefined
  
  /**
    * The number of reservation hours that you didn't use.
    */
  var UnusedHours: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.UnusedHours] = js.undefined
  
  /**
    * The number of Amazon EC2 reservation hours that you didn't use. It's converted to normalized units. Normalized units are available only for Amazon EC2 usage after November 11, 2017.
    */
  var UnusedUnits: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.UnusedUnits] = js.undefined
  
  /**
    * The percentage of reservation time that you used.
    */
  var UtilizationPercentage: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.UtilizationPercentage] = js.undefined
  
  /**
    * The percentage of Amazon EC2 reservation time that you used. It's converted to normalized units. Normalized units are available only for Amazon EC2 usage after November 11, 2017.
    */
  var UtilizationPercentageInUnits: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.UtilizationPercentageInUnits] = js.undefined
}
object ReservationAggregates {
  
  inline def apply(): ReservationAggregates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationAggregates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReservationAggregates] (val x: Self) extends AnyVal {
    
    inline def setAmortizedRecurringFee(value: AmortizedRecurringFee): Self = StObject.set(x, "AmortizedRecurringFee", value.asInstanceOf[js.Any])
    
    inline def setAmortizedRecurringFeeUndefined: Self = StObject.set(x, "AmortizedRecurringFee", js.undefined)
    
    inline def setAmortizedUpfrontFee(value: AmortizedUpfrontFee): Self = StObject.set(x, "AmortizedUpfrontFee", value.asInstanceOf[js.Any])
    
    inline def setAmortizedUpfrontFeeUndefined: Self = StObject.set(x, "AmortizedUpfrontFee", js.undefined)
    
    inline def setNetRISavings(value: NetRISavings): Self = StObject.set(x, "NetRISavings", value.asInstanceOf[js.Any])
    
    inline def setNetRISavingsUndefined: Self = StObject.set(x, "NetRISavings", js.undefined)
    
    inline def setOnDemandCostOfRIHoursUsed(value: OnDemandCostOfRIHoursUsed): Self = StObject.set(x, "OnDemandCostOfRIHoursUsed", value.asInstanceOf[js.Any])
    
    inline def setOnDemandCostOfRIHoursUsedUndefined: Self = StObject.set(x, "OnDemandCostOfRIHoursUsed", js.undefined)
    
    inline def setPurchasedHours(value: PurchasedHours): Self = StObject.set(x, "PurchasedHours", value.asInstanceOf[js.Any])
    
    inline def setPurchasedHoursUndefined: Self = StObject.set(x, "PurchasedHours", js.undefined)
    
    inline def setPurchasedUnits(value: PurchasedUnits): Self = StObject.set(x, "PurchasedUnits", value.asInstanceOf[js.Any])
    
    inline def setPurchasedUnitsUndefined: Self = StObject.set(x, "PurchasedUnits", js.undefined)
    
    inline def setRICostForUnusedHours(value: RICostForUnusedHours): Self = StObject.set(x, "RICostForUnusedHours", value.asInstanceOf[js.Any])
    
    inline def setRICostForUnusedHoursUndefined: Self = StObject.set(x, "RICostForUnusedHours", js.undefined)
    
    inline def setRealizedSavings(value: RealizedSavings): Self = StObject.set(x, "RealizedSavings", value.asInstanceOf[js.Any])
    
    inline def setRealizedSavingsUndefined: Self = StObject.set(x, "RealizedSavings", js.undefined)
    
    inline def setTotalActualHours(value: TotalActualHours): Self = StObject.set(x, "TotalActualHours", value.asInstanceOf[js.Any])
    
    inline def setTotalActualHoursUndefined: Self = StObject.set(x, "TotalActualHours", js.undefined)
    
    inline def setTotalActualUnits(value: TotalActualUnits): Self = StObject.set(x, "TotalActualUnits", value.asInstanceOf[js.Any])
    
    inline def setTotalActualUnitsUndefined: Self = StObject.set(x, "TotalActualUnits", js.undefined)
    
    inline def setTotalAmortizedFee(value: TotalAmortizedFee): Self = StObject.set(x, "TotalAmortizedFee", value.asInstanceOf[js.Any])
    
    inline def setTotalAmortizedFeeUndefined: Self = StObject.set(x, "TotalAmortizedFee", js.undefined)
    
    inline def setTotalPotentialRISavings(value: TotalPotentialRISavings): Self = StObject.set(x, "TotalPotentialRISavings", value.asInstanceOf[js.Any])
    
    inline def setTotalPotentialRISavingsUndefined: Self = StObject.set(x, "TotalPotentialRISavings", js.undefined)
    
    inline def setUnrealizedSavings(value: UnrealizedSavings): Self = StObject.set(x, "UnrealizedSavings", value.asInstanceOf[js.Any])
    
    inline def setUnrealizedSavingsUndefined: Self = StObject.set(x, "UnrealizedSavings", js.undefined)
    
    inline def setUnusedHours(value: UnusedHours): Self = StObject.set(x, "UnusedHours", value.asInstanceOf[js.Any])
    
    inline def setUnusedHoursUndefined: Self = StObject.set(x, "UnusedHours", js.undefined)
    
    inline def setUnusedUnits(value: UnusedUnits): Self = StObject.set(x, "UnusedUnits", value.asInstanceOf[js.Any])
    
    inline def setUnusedUnitsUndefined: Self = StObject.set(x, "UnusedUnits", js.undefined)
    
    inline def setUtilizationPercentage(value: UtilizationPercentage): Self = StObject.set(x, "UtilizationPercentage", value.asInstanceOf[js.Any])
    
    inline def setUtilizationPercentageInUnits(value: UtilizationPercentageInUnits): Self = StObject.set(x, "UtilizationPercentageInUnits", value.asInstanceOf[js.Any])
    
    inline def setUtilizationPercentageInUnitsUndefined: Self = StObject.set(x, "UtilizationPercentageInUnits", js.undefined)
    
    inline def setUtilizationPercentageUndefined: Self = StObject.set(x, "UtilizationPercentage", js.undefined)
  }
}
