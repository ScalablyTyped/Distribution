package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBillingGroupCostReportsFilter extends StObject {
  
  /**
    * The list of Amazon Resource Names (ARNs) used to filter billing groups to retrieve reports. 
    */
  var BillingGroupArns: js.UndefOr[BillingGroupArnList] = js.undefined
}
object ListBillingGroupCostReportsFilter {
  
  inline def apply(): ListBillingGroupCostReportsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBillingGroupCostReportsFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBillingGroupCostReportsFilter] (val x: Self) extends AnyVal {
    
    inline def setBillingGroupArns(value: BillingGroupArnList): Self = StObject.set(x, "BillingGroupArns", value.asInstanceOf[js.Any])
    
    inline def setBillingGroupArnsUndefined: Self = StObject.set(x, "BillingGroupArns", js.undefined)
    
    inline def setBillingGroupArnsVarargs(value: BillingGroupArn*): Self = StObject.set(x, "BillingGroupArns", js.Array(value*))
  }
}
