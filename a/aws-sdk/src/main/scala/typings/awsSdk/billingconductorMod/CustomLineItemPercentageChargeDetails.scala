package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomLineItemPercentageChargeDetails extends StObject {
  
  /**
    *  A list of resource ARNs to associate to the percentage custom line item. 
    */
  var AssociatedValues: js.UndefOr[CustomLineItemAssociationsList] = js.undefined
  
  /**
    *  The custom line item's percentage value. This will be multiplied against the combined value of its associated resources to determine its charge value. 
    */
  var PercentageValue: CustomLineItemPercentageChargeValue
}
object CustomLineItemPercentageChargeDetails {
  
  inline def apply(PercentageValue: CustomLineItemPercentageChargeValue): CustomLineItemPercentageChargeDetails = {
    val __obj = js.Dynamic.literal(PercentageValue = PercentageValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLineItemPercentageChargeDetails]
  }
  
  extension [Self <: CustomLineItemPercentageChargeDetails](x: Self) {
    
    inline def setAssociatedValues(value: CustomLineItemAssociationsList): Self = StObject.set(x, "AssociatedValues", value.asInstanceOf[js.Any])
    
    inline def setAssociatedValuesUndefined: Self = StObject.set(x, "AssociatedValues", js.undefined)
    
    inline def setAssociatedValuesVarargs(value: CustomLineItemAssociationElement*): Self = StObject.set(x, "AssociatedValues", js.Array(value*))
    
    inline def setPercentageValue(value: CustomLineItemPercentageChargeValue): Self = StObject.set(x, "PercentageValue", value.asInstanceOf[js.Any])
  }
}
