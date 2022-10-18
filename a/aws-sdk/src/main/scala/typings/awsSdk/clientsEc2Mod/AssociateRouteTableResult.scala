package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateRouteTableResult extends StObject {
  
  /**
    * The route table association ID. This ID is required for disassociating the route table.
    */
  var AssociationId: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the association.
    */
  var AssociationState: js.UndefOr[RouteTableAssociationState] = js.undefined
}
object AssociateRouteTableResult {
  
  inline def apply(): AssociateRouteTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateRouteTableResult]
  }
  
  extension [Self <: AssociateRouteTableResult](x: Self) {
    
    inline def setAssociationId(value: String): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setAssociationState(value: RouteTableAssociationState): Self = StObject.set(x, "AssociationState", value.asInstanceOf[js.Any])
    
    inline def setAssociationStateUndefined: Self = StObject.set(x, "AssociationState", js.undefined)
  }
}
