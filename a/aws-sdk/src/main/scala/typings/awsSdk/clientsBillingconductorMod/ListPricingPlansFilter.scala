package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPricingPlansFilter extends StObject {
  
  /**
    * A list of pricing plan Amazon Resource Names (ARNs) to retrieve information. 
    */
  var Arns: js.UndefOr[PricingPlanArns] = js.undefined
}
object ListPricingPlansFilter {
  
  inline def apply(): ListPricingPlansFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPricingPlansFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPricingPlansFilter] (val x: Self) extends AnyVal {
    
    inline def setArns(value: PricingPlanArns): Self = StObject.set(x, "Arns", value.asInstanceOf[js.Any])
    
    inline def setArnsUndefined: Self = StObject.set(x, "Arns", js.undefined)
    
    inline def setArnsVarargs(value: PricingPlanArn*): Self = StObject.set(x, "Arns", js.Array(value*))
  }
}
