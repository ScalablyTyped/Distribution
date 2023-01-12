package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDirectConnectGatewayAssociationRequest extends StObject {
  
  /**
    * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
    */
  var addAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined
  
  /**
    * The ID of the Direct Connect gateway association.
    */
  var associationId: js.UndefOr[DirectConnectGatewayAssociationId] = js.undefined
  
  /**
    * The Amazon VPC prefixes to no longer advertise to the Direct Connect gateway.
    */
  var removeAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined
}
object UpdateDirectConnectGatewayAssociationRequest {
  
  inline def apply(): UpdateDirectConnectGatewayAssociationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDirectConnectGatewayAssociationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDirectConnectGatewayAssociationRequest] (val x: Self) extends AnyVal {
    
    inline def setAddAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = StObject.set(x, "addAllowedPrefixesToDirectConnectGateway", value.asInstanceOf[js.Any])
    
    inline def setAddAllowedPrefixesToDirectConnectGatewayUndefined: Self = StObject.set(x, "addAllowedPrefixesToDirectConnectGateway", js.undefined)
    
    inline def setAddAllowedPrefixesToDirectConnectGatewayVarargs(value: RouteFilterPrefix*): Self = StObject.set(x, "addAllowedPrefixesToDirectConnectGateway", js.Array(value*))
    
    inline def setAssociationId(value: DirectConnectGatewayAssociationId): Self = StObject.set(x, "associationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "associationId", js.undefined)
    
    inline def setRemoveAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = StObject.set(x, "removeAllowedPrefixesToDirectConnectGateway", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllowedPrefixesToDirectConnectGatewayUndefined: Self = StObject.set(x, "removeAllowedPrefixesToDirectConnectGateway", js.undefined)
    
    inline def setRemoveAllowedPrefixesToDirectConnectGatewayVarargs(value: RouteFilterPrefix*): Self = StObject.set(x, "removeAllowedPrefixesToDirectConnectGateway", js.Array(value*))
  }
}
