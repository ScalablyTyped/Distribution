package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EC2ReplaceRouteTableAssociationAction extends StObject {
  
  /**
    * Information about the association ID.
    */
  var AssociationId: ActionTarget
  
  /**
    * A description of the ReplaceRouteTableAssociation action in Amazon EC2.
    */
  var Description: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * Information about the ID of the new route table to associate with the subnet.
    */
  var RouteTableId: ActionTarget
}
object EC2ReplaceRouteTableAssociationAction {
  
  inline def apply(AssociationId: ActionTarget, RouteTableId: ActionTarget): EC2ReplaceRouteTableAssociationAction = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any], RouteTableId = RouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2ReplaceRouteTableAssociationAction]
  }
  
  extension [Self <: EC2ReplaceRouteTableAssociationAction](x: Self) {
    
    inline def setAssociationId(value: ActionTarget): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: LengthBoundedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setRouteTableId(value: ActionTarget): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
  }
}
