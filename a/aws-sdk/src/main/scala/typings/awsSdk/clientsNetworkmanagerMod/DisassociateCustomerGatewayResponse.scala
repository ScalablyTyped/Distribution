package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateCustomerGatewayResponse extends StObject {
  
  /**
    * Information about the customer gateway association.
    */
  var CustomerGatewayAssociation: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.CustomerGatewayAssociation] = js.undefined
}
object DisassociateCustomerGatewayResponse {
  
  inline def apply(): DisassociateCustomerGatewayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateCustomerGatewayResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateCustomerGatewayResponse] (val x: Self) extends AnyVal {
    
    inline def setCustomerGatewayAssociation(value: CustomerGatewayAssociation): Self = StObject.set(x, "CustomerGatewayAssociation", value.asInstanceOf[js.Any])
    
    inline def setCustomerGatewayAssociationUndefined: Self = StObject.set(x, "CustomerGatewayAssociation", js.undefined)
  }
}
