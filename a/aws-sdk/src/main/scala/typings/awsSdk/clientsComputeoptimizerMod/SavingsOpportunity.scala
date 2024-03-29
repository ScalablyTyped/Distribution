package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsOpportunity extends StObject {
  
  /**
    * An object that describes the estimated monthly savings amount possible by adopting Compute Optimizer recommendations for a given resource. This is based on the On-Demand instance pricing..
    */
  var estimatedMonthlySavings: js.UndefOr[EstimatedMonthlySavings] = js.undefined
  
  /**
    * The estimated monthly savings possible as a percentage of monthly cost by adopting Compute Optimizer recommendations for a given resource.
    */
  var savingsOpportunityPercentage: js.UndefOr[SavingsOpportunityPercentage] = js.undefined
}
object SavingsOpportunity {
  
  inline def apply(): SavingsOpportunity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsOpportunity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavingsOpportunity] (val x: Self) extends AnyVal {
    
    inline def setEstimatedMonthlySavings(value: EstimatedMonthlySavings): Self = StObject.set(x, "estimatedMonthlySavings", value.asInstanceOf[js.Any])
    
    inline def setEstimatedMonthlySavingsUndefined: Self = StObject.set(x, "estimatedMonthlySavings", js.undefined)
    
    inline def setSavingsOpportunityPercentage(value: SavingsOpportunityPercentage): Self = StObject.set(x, "savingsOpportunityPercentage", value.asInstanceOf[js.Any])
    
    inline def setSavingsOpportunityPercentageUndefined: Self = StObject.set(x, "savingsOpportunityPercentage", js.undefined)
  }
}
