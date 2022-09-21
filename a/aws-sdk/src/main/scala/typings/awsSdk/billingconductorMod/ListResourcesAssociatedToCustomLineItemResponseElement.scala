package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourcesAssociatedToCustomLineItemResponseElement extends StObject {
  
  /**
    *  The ARN of the associated resource. 
    */
  var Arn: js.UndefOr[CustomLineItemAssociationElement] = js.undefined
  
  /**
    *  The type of relationship between the custom line item and the associated resource. 
    */
  var Relationship: js.UndefOr[CustomLineItemRelationship] = js.undefined
}
object ListResourcesAssociatedToCustomLineItemResponseElement {
  
  inline def apply(): ListResourcesAssociatedToCustomLineItemResponseElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourcesAssociatedToCustomLineItemResponseElement]
  }
  
  extension [Self <: ListResourcesAssociatedToCustomLineItemResponseElement](x: Self) {
    
    inline def setArn(value: CustomLineItemAssociationElement): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setRelationship(value: CustomLineItemRelationship): Self = StObject.set(x, "Relationship", value.asInstanceOf[js.Any])
    
    inline def setRelationshipUndefined: Self = StObject.set(x, "Relationship", js.undefined)
  }
}
