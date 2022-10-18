package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomLineItemChargeDetails extends StObject {
  
  /**
    *  A CustomLineItemFlatChargeDetails that describes the charge details of a flat custom line item. 
    */
  var Flat: js.UndefOr[CustomLineItemFlatChargeDetails] = js.undefined
  
  /**
    *  A CustomLineItemPercentageChargeDetails that describes the charge details of a percentage custom line item. 
    */
  var Percentage: js.UndefOr[CustomLineItemPercentageChargeDetails] = js.undefined
  
  /**
    *  The type of the custom line item that indicates whether the charge is a fee or credit. 
    */
  var Type: CustomLineItemType
}
object CustomLineItemChargeDetails {
  
  inline def apply(Type: CustomLineItemType): CustomLineItemChargeDetails = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLineItemChargeDetails]
  }
  
  extension [Self <: CustomLineItemChargeDetails](x: Self) {
    
    inline def setFlat(value: CustomLineItemFlatChargeDetails): Self = StObject.set(x, "Flat", value.asInstanceOf[js.Any])
    
    inline def setFlatUndefined: Self = StObject.set(x, "Flat", js.undefined)
    
    inline def setPercentage(value: CustomLineItemPercentageChargeDetails): Self = StObject.set(x, "Percentage", value.asInstanceOf[js.Any])
    
    inline def setPercentageUndefined: Self = StObject.set(x, "Percentage", js.undefined)
    
    inline def setType(value: CustomLineItemType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
