package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomLineItemChargeDetails extends StObject {
  
  /**
    *  A ListCustomLineItemFlatChargeDetails that describes the charge details of a flat custom line item. 
    */
  var Flat: js.UndefOr[ListCustomLineItemFlatChargeDetails] = js.undefined
  
  /**
    *  A ListCustomLineItemPercentageChargeDetails that describes the charge details of a percentage custom line item. 
    */
  var Percentage: js.UndefOr[ListCustomLineItemPercentageChargeDetails] = js.undefined
  
  /**
    *  The type of the custom line item that indicates whether the charge is a fee or credit. 
    */
  var Type: CustomLineItemType
}
object ListCustomLineItemChargeDetails {
  
  inline def apply(Type: CustomLineItemType): ListCustomLineItemChargeDetails = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCustomLineItemChargeDetails]
  }
  
  extension [Self <: ListCustomLineItemChargeDetails](x: Self) {
    
    inline def setFlat(value: ListCustomLineItemFlatChargeDetails): Self = StObject.set(x, "Flat", value.asInstanceOf[js.Any])
    
    inline def setFlatUndefined: Self = StObject.set(x, "Flat", js.undefined)
    
    inline def setPercentage(value: ListCustomLineItemPercentageChargeDetails): Self = StObject.set(x, "Percentage", value.asInstanceOf[js.Any])
    
    inline def setPercentageUndefined: Self = StObject.set(x, "Percentage", js.undefined)
    
    inline def setType(value: CustomLineItemType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
