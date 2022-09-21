package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomLineItemListElement extends StObject {
  
  /**
    *  The Amazon Resource Names (ARNs) for custom line items. 
    */
  var Arn: js.UndefOr[CustomLineItemArn] = js.undefined
  
  /**
    *  The number of resources that are associated to the custom line item. 
    */
  var AssociationSize: js.UndefOr[NumberOfAssociations] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) that references the billing group where the custom line item applies to. 
    */
  var BillingGroupArn: js.UndefOr[typings.awsSdk.billingconductorMod.BillingGroupArn] = js.undefined
  
  /**
    *  A ListCustomLineItemChargeDetails that describes the charge details of a custom line item. 
    */
  var ChargeDetails: js.UndefOr[ListCustomLineItemChargeDetails] = js.undefined
  
  /**
    *  The time created. 
    */
  var CreationTime: js.UndefOr[Instant] = js.undefined
  
  /**
    *  The custom line item's charge value currency. Only one of the valid values can be used. 
    */
  var CurrencyCode: js.UndefOr[typings.awsSdk.billingconductorMod.CurrencyCode] = js.undefined
  
  /**
    *  The custom line item's description. This is shown on the Bills page in association with the charge value. 
    */
  var Description: js.UndefOr[CustomLineItemDescription] = js.undefined
  
  /**
    *  The most recent time the custom line item was modified. 
    */
  var LastModifiedTime: js.UndefOr[Instant] = js.undefined
  
  /**
    *  The custom line item's name. 
    */
  var Name: js.UndefOr[CustomLineItemName] = js.undefined
  
  /**
    *  The product code associated with the custom line item. 
    */
  var ProductCode: js.UndefOr[CustomLineItemProductCode] = js.undefined
}
object CustomLineItemListElement {
  
  inline def apply(): CustomLineItemListElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomLineItemListElement]
  }
  
  extension [Self <: CustomLineItemListElement](x: Self) {
    
    inline def setArn(value: CustomLineItemArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAssociationSize(value: NumberOfAssociations): Self = StObject.set(x, "AssociationSize", value.asInstanceOf[js.Any])
    
    inline def setAssociationSizeUndefined: Self = StObject.set(x, "AssociationSize", js.undefined)
    
    inline def setBillingGroupArn(value: BillingGroupArn): Self = StObject.set(x, "BillingGroupArn", value.asInstanceOf[js.Any])
    
    inline def setBillingGroupArnUndefined: Self = StObject.set(x, "BillingGroupArn", js.undefined)
    
    inline def setChargeDetails(value: ListCustomLineItemChargeDetails): Self = StObject.set(x, "ChargeDetails", value.asInstanceOf[js.Any])
    
    inline def setChargeDetailsUndefined: Self = StObject.set(x, "ChargeDetails", js.undefined)
    
    inline def setCreationTime(value: Instant): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setCurrencyCode(value: CurrencyCode): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    inline def setDescription(value: CustomLineItemDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastModifiedTime(value: Instant): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setName(value: CustomLineItemName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setProductCode(value: CustomLineItemProductCode): Self = StObject.set(x, "ProductCode", value.asInstanceOf[js.Any])
    
    inline def setProductCodeUndefined: Self = StObject.set(x, "ProductCode", js.undefined)
  }
}
