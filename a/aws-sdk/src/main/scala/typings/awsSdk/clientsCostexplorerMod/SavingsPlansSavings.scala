package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsPlansSavings extends StObject {
  
  /**
    * The savings amount that you're accumulating for the usage that's covered by a Savings Plans, when compared to the On-Demand equivalent of the same usage.
    */
  var NetSavings: js.UndefOr[GenericString] = js.undefined
  
  /**
    * How much the amount that the usage would have cost if it was accrued at the On-Demand rate.
    */
  var OnDemandCostEquivalent: js.UndefOr[GenericString] = js.undefined
}
object SavingsPlansSavings {
  
  inline def apply(): SavingsPlansSavings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansSavings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavingsPlansSavings] (val x: Self) extends AnyVal {
    
    inline def setNetSavings(value: GenericString): Self = StObject.set(x, "NetSavings", value.asInstanceOf[js.Any])
    
    inline def setNetSavingsUndefined: Self = StObject.set(x, "NetSavings", js.undefined)
    
    inline def setOnDemandCostEquivalent(value: GenericString): Self = StObject.set(x, "OnDemandCostEquivalent", value.asInstanceOf[js.Any])
    
    inline def setOnDemandCostEquivalentUndefined: Self = StObject.set(x, "OnDemandCostEquivalent", js.undefined)
  }
}
