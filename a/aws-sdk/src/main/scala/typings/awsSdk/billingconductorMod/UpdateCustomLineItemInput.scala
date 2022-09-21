package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCustomLineItemInput extends StObject {
  
  /**
    *  The ARN of the custom line item to be updated. 
    */
  var Arn: CustomLineItemArn
  
  var BillingPeriodRange: js.UndefOr[CustomLineItemBillingPeriodRange] = js.undefined
  
  /**
    *  A ListCustomLineItemChargeDetails containing the new charge details for the custom line item. 
    */
  var ChargeDetails: js.UndefOr[UpdateCustomLineItemChargeDetails] = js.undefined
  
  /**
    *  The new line item description of the custom line item. 
    */
  var Description: js.UndefOr[CustomLineItemDescription] = js.undefined
  
  /**
    *  The new name for the custom line item. 
    */
  var Name: js.UndefOr[BillingGroupName] = js.undefined
}
object UpdateCustomLineItemInput {
  
  inline def apply(Arn: CustomLineItemArn): UpdateCustomLineItemInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCustomLineItemInput]
  }
  
  extension [Self <: UpdateCustomLineItemInput](x: Self) {
    
    inline def setArn(value: CustomLineItemArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodRange(value: CustomLineItemBillingPeriodRange): Self = StObject.set(x, "BillingPeriodRange", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodRangeUndefined: Self = StObject.set(x, "BillingPeriodRange", js.undefined)
    
    inline def setChargeDetails(value: UpdateCustomLineItemChargeDetails): Self = StObject.set(x, "ChargeDetails", value.asInstanceOf[js.Any])
    
    inline def setChargeDetailsUndefined: Self = StObject.set(x, "ChargeDetails", js.undefined)
    
    inline def setDescription(value: CustomLineItemDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: BillingGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
