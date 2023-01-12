package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomLineItemVersionListElement extends StObject {
  
  /**
    * The number of resources that are associated with the custom line item.
    */
  var AssociationSize: js.UndefOr[NumberOfAssociations] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the billing group that the custom line item applies to.
    */
  var BillingGroupArn: js.UndefOr[typings.awsSdk.clientsBillingconductorMod.BillingGroupArn] = js.undefined
  
  var ChargeDetails: js.UndefOr[ListCustomLineItemChargeDetails] = js.undefined
  
  /**
    * The time when the custom line item version was created.
    */
  var CreationTime: js.UndefOr[Instant] = js.undefined
  
  /**
    * The charge value currency of the custom line item.
    */
  var CurrencyCode: js.UndefOr[typings.awsSdk.clientsBillingconductorMod.CurrencyCode] = js.undefined
  
  /**
    * The description of the custom line item.
    */
  var Description: js.UndefOr[CustomLineItemDescription] = js.undefined
  
  /**
    * The end billing period of the custom line item version.
    */
  var EndBillingPeriod: js.UndefOr[BillingPeriod] = js.undefined
  
  /**
    * The most recent time that the custom line item version was modified.
    */
  var LastModifiedTime: js.UndefOr[Instant] = js.undefined
  
  /**
    * The name of the custom line item.
    */
  var Name: js.UndefOr[CustomLineItemName] = js.undefined
  
  /**
    * The product code that’s associated with the custom line item.
    */
  var ProductCode: js.UndefOr[CustomLineItemProductCode] = js.undefined
  
  /**
    * The start billing period of the custom line item version.
    */
  var StartBillingPeriod: js.UndefOr[BillingPeriod] = js.undefined
}
object CustomLineItemVersionListElement {
  
  inline def apply(): CustomLineItemVersionListElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomLineItemVersionListElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomLineItemVersionListElement] (val x: Self) extends AnyVal {
    
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
    
    inline def setEndBillingPeriod(value: BillingPeriod): Self = StObject.set(x, "EndBillingPeriod", value.asInstanceOf[js.Any])
    
    inline def setEndBillingPeriodUndefined: Self = StObject.set(x, "EndBillingPeriod", js.undefined)
    
    inline def setLastModifiedTime(value: Instant): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setName(value: CustomLineItemName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setProductCode(value: CustomLineItemProductCode): Self = StObject.set(x, "ProductCode", value.asInstanceOf[js.Any])
    
    inline def setProductCodeUndefined: Self = StObject.set(x, "ProductCode", js.undefined)
    
    inline def setStartBillingPeriod(value: BillingPeriod): Self = StObject.set(x, "StartBillingPeriod", value.asInstanceOf[js.Any])
    
    inline def setStartBillingPeriodUndefined: Self = StObject.set(x, "StartBillingPeriod", js.undefined)
  }
}
