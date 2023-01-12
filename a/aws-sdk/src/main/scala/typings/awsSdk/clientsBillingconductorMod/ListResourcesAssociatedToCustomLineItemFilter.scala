package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourcesAssociatedToCustomLineItemFilter extends StObject {
  
  /**
    *  The type of relationship between the custom line item and the associated resource. 
    */
  var Relationship: js.UndefOr[CustomLineItemRelationship] = js.undefined
}
object ListResourcesAssociatedToCustomLineItemFilter {
  
  inline def apply(): ListResourcesAssociatedToCustomLineItemFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourcesAssociatedToCustomLineItemFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResourcesAssociatedToCustomLineItemFilter] (val x: Self) extends AnyVal {
    
    inline def setRelationship(value: CustomLineItemRelationship): Self = StObject.set(x, "Relationship", value.asInstanceOf[js.Any])
    
    inline def setRelationshipUndefined: Self = StObject.set(x, "Relationship", js.undefined)
  }
}
