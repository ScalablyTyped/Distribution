package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomLineItemsFilter extends StObject {
  
  /**
    *  A list of custom line item ARNs to retrieve information. 
    */
  var Arns: js.UndefOr[CustomLineItemArns] = js.undefined
  
  /**
    *  The billing group Amazon Resource Names (ARNs) to retrieve information. 
    */
  var BillingGroups: js.UndefOr[BillingGroupArnList] = js.undefined
  
  /**
    *  A list of custom line items to retrieve information. 
    */
  var Names: js.UndefOr[CustomLineItemNameList] = js.undefined
}
object ListCustomLineItemsFilter {
  
  inline def apply(): ListCustomLineItemsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomLineItemsFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCustomLineItemsFilter] (val x: Self) extends AnyVal {
    
    inline def setArns(value: CustomLineItemArns): Self = StObject.set(x, "Arns", value.asInstanceOf[js.Any])
    
    inline def setArnsUndefined: Self = StObject.set(x, "Arns", js.undefined)
    
    inline def setArnsVarargs(value: CustomLineItemArn*): Self = StObject.set(x, "Arns", js.Array(value*))
    
    inline def setBillingGroups(value: BillingGroupArnList): Self = StObject.set(x, "BillingGroups", value.asInstanceOf[js.Any])
    
    inline def setBillingGroupsUndefined: Self = StObject.set(x, "BillingGroups", js.undefined)
    
    inline def setBillingGroupsVarargs(value: BillingGroupArn*): Self = StObject.set(x, "BillingGroups", js.Array(value*))
    
    inline def setNames(value: CustomLineItemNameList): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
    
    inline def setNamesVarargs(value: CustomLineItemName*): Self = StObject.set(x, "Names", js.Array(value*))
  }
}
