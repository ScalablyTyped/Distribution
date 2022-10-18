package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsPlansCoverageData extends StObject {
  
  /**
    * The percentage of your existing Savings Plans covered usage, divided by all of your eligible Savings Plans usage in an account (or set of accounts).
    */
  var CoveragePercentage: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The cost of your Amazon Web Services usage at the public On-Demand rate.
    */
  var OnDemandCost: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The amount of your Amazon Web Services usage that's covered by a Savings Plans.
    */
  var SpendCoveredBySavingsPlans: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The total cost of your Amazon Web Services usage, regardless of your purchase option.
    */
  var TotalCost: js.UndefOr[GenericString] = js.undefined
}
object SavingsPlansCoverageData {
  
  inline def apply(): SavingsPlansCoverageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansCoverageData]
  }
  
  extension [Self <: SavingsPlansCoverageData](x: Self) {
    
    inline def setCoveragePercentage(value: GenericString): Self = StObject.set(x, "CoveragePercentage", value.asInstanceOf[js.Any])
    
    inline def setCoveragePercentageUndefined: Self = StObject.set(x, "CoveragePercentage", js.undefined)
    
    inline def setOnDemandCost(value: GenericString): Self = StObject.set(x, "OnDemandCost", value.asInstanceOf[js.Any])
    
    inline def setOnDemandCostUndefined: Self = StObject.set(x, "OnDemandCost", js.undefined)
    
    inline def setSpendCoveredBySavingsPlans(value: GenericString): Self = StObject.set(x, "SpendCoveredBySavingsPlans", value.asInstanceOf[js.Any])
    
    inline def setSpendCoveredBySavingsPlansUndefined: Self = StObject.set(x, "SpendCoveredBySavingsPlans", js.undefined)
    
    inline def setTotalCost(value: GenericString): Self = StObject.set(x, "TotalCost", value.asInstanceOf[js.Any])
    
    inline def setTotalCostUndefined: Self = StObject.set(x, "TotalCost", js.undefined)
  }
}
