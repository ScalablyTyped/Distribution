package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBillingGroupsFilter extends StObject {
  
  /**
    * The list of billing group Amazon Resource Names (ARNs) to retrieve information. 
    */
  var Arns: js.UndefOr[BillingGroupArnList] = js.undefined
  
  /**
    * The pricing plan Amazon Resource Names (ARNs) to retrieve information. 
    */
  var PricingPlan: js.UndefOr[PricingPlanFullArn] = js.undefined
  
  /**
    *  A list of billing groups to retrieve their current status for a specific time range 
    */
  var Statuses: js.UndefOr[BillingGroupStatusList] = js.undefined
}
object ListBillingGroupsFilter {
  
  inline def apply(): ListBillingGroupsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBillingGroupsFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBillingGroupsFilter] (val x: Self) extends AnyVal {
    
    inline def setArns(value: BillingGroupArnList): Self = StObject.set(x, "Arns", value.asInstanceOf[js.Any])
    
    inline def setArnsUndefined: Self = StObject.set(x, "Arns", js.undefined)
    
    inline def setArnsVarargs(value: BillingGroupArn*): Self = StObject.set(x, "Arns", js.Array(value*))
    
    inline def setPricingPlan(value: PricingPlanFullArn): Self = StObject.set(x, "PricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanUndefined: Self = StObject.set(x, "PricingPlan", js.undefined)
    
    inline def setStatuses(value: BillingGroupStatusList): Self = StObject.set(x, "Statuses", value.asInstanceOf[js.Any])
    
    inline def setStatusesUndefined: Self = StObject.set(x, "Statuses", js.undefined)
    
    inline def setStatusesVarargs(value: BillingGroupStatus*): Self = StObject.set(x, "Statuses", js.Array(value*))
  }
}
