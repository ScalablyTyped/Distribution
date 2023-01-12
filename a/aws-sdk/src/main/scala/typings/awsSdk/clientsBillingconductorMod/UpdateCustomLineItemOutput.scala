package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCustomLineItemOutput extends StObject {
  
  /**
    *  The ARN of the successfully updated custom line item. 
    */
  var Arn: js.UndefOr[CustomLineItemArn] = js.undefined
  
  /**
    *  The number of resources that are associated to the custom line item. 
    */
  var AssociationSize: js.UndefOr[NumberOfAssociations] = js.undefined
  
  /**
    *  The ARN of the billing group that the custom line item is applied to. 
    */
  var BillingGroupArn: js.UndefOr[BillingGroupFullArn] = js.undefined
  
  /**
    *  A ListCustomLineItemChargeDetails containing the charge details of the successfully updated custom line item. 
    */
  var ChargeDetails: js.UndefOr[ListCustomLineItemChargeDetails] = js.undefined
  
  /**
    *  The description of the successfully updated custom line item. 
    */
  var Description: js.UndefOr[CustomLineItemDescription] = js.undefined
  
  /**
    *  The most recent time when the custom line item was modified. 
    */
  var LastModifiedTime: js.UndefOr[Instant] = js.undefined
  
  /**
    *  The name of the successfully updated custom line item. 
    */
  var Name: js.UndefOr[CustomLineItemName] = js.undefined
}
object UpdateCustomLineItemOutput {
  
  inline def apply(): UpdateCustomLineItemOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCustomLineItemOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCustomLineItemOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: CustomLineItemArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAssociationSize(value: NumberOfAssociations): Self = StObject.set(x, "AssociationSize", value.asInstanceOf[js.Any])
    
    inline def setAssociationSizeUndefined: Self = StObject.set(x, "AssociationSize", js.undefined)
    
    inline def setBillingGroupArn(value: BillingGroupFullArn): Self = StObject.set(x, "BillingGroupArn", value.asInstanceOf[js.Any])
    
    inline def setBillingGroupArnUndefined: Self = StObject.set(x, "BillingGroupArn", js.undefined)
    
    inline def setChargeDetails(value: ListCustomLineItemChargeDetails): Self = StObject.set(x, "ChargeDetails", value.asInstanceOf[js.Any])
    
    inline def setChargeDetailsUndefined: Self = StObject.set(x, "ChargeDetails", js.undefined)
    
    inline def setDescription(value: CustomLineItemDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastModifiedTime(value: Instant): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setName(value: CustomLineItemName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
