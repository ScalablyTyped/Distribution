package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomLineItemInput extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) that references the billing group where the custom line item applies to. 
    */
  var BillingGroupArn: typings.awsSdk.billingconductorMod.BillingGroupArn
  
  /**
    *  A time range for which the custom line item is effective. 
    */
  var BillingPeriodRange: js.UndefOr[CustomLineItemBillingPeriodRange] = js.undefined
  
  /**
    *  A CustomLineItemChargeDetails that describes the charge details for a custom line item. 
    */
  var ChargeDetails: CustomLineItemChargeDetails
  
  /**
    *  The token that is needed to support idempotency. Idempotency isn't currently supported, but will be implemented in a future update. 
    */
  var ClientToken: js.UndefOr[typings.awsSdk.billingconductorMod.ClientToken] = js.undefined
  
  /**
    *  The description of the custom line item. This is shown on the Bills page in association with the charge value. 
    */
  var Description: CustomLineItemDescription
  
  /**
    *  The name of the custom line item. 
    */
  var Name: CustomLineItemName
  
  /**
    *  A map that contains tag keys and tag values that are attached to a custom line item. 
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateCustomLineItemInput {
  
  inline def apply(
    BillingGroupArn: BillingGroupArn,
    ChargeDetails: CustomLineItemChargeDetails,
    Description: CustomLineItemDescription,
    Name: CustomLineItemName
  ): CreateCustomLineItemInput = {
    val __obj = js.Dynamic.literal(BillingGroupArn = BillingGroupArn.asInstanceOf[js.Any], ChargeDetails = ChargeDetails.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomLineItemInput]
  }
  
  extension [Self <: CreateCustomLineItemInput](x: Self) {
    
    inline def setBillingGroupArn(value: BillingGroupArn): Self = StObject.set(x, "BillingGroupArn", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodRange(value: CustomLineItemBillingPeriodRange): Self = StObject.set(x, "BillingPeriodRange", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodRangeUndefined: Self = StObject.set(x, "BillingPeriodRange", js.undefined)
    
    inline def setChargeDetails(value: CustomLineItemChargeDetails): Self = StObject.set(x, "ChargeDetails", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: CustomLineItemDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setName(value: CustomLineItemName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
