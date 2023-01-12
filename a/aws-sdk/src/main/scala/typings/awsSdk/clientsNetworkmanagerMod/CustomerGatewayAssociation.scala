package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerGatewayAssociation extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the customer gateway.
    */
  var CustomerGatewayArn: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.CustomerGatewayArn] = js.undefined
  
  /**
    * The ID of the device.
    */
  var DeviceId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.DeviceId] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId] = js.undefined
  
  /**
    * The ID of the link.
    */
  var LinkId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.LinkId] = js.undefined
  
  /**
    * The association state.
    */
  var State: js.UndefOr[CustomerGatewayAssociationState] = js.undefined
}
object CustomerGatewayAssociation {
  
  inline def apply(): CustomerGatewayAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerGatewayAssociation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomerGatewayAssociation] (val x: Self) extends AnyVal {
    
    inline def setCustomerGatewayArn(value: CustomerGatewayArn): Self = StObject.set(x, "CustomerGatewayArn", value.asInstanceOf[js.Any])
    
    inline def setCustomerGatewayArnUndefined: Self = StObject.set(x, "CustomerGatewayArn", js.undefined)
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkIdUndefined: Self = StObject.set(x, "GlobalNetworkId", js.undefined)
    
    inline def setLinkId(value: LinkId): Self = StObject.set(x, "LinkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "LinkId", js.undefined)
    
    inline def setState(value: CustomerGatewayAssociationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
