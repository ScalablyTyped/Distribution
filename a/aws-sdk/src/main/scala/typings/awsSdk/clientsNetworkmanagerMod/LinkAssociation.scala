package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkAssociation extends StObject {
  
  /**
    * The device ID for the link association.
    */
  var DeviceId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.DeviceId] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId] = js.undefined
  
  /**
    * The state of the association.
    */
  var LinkAssociationState: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.LinkAssociationState] = js.undefined
  
  /**
    * The ID of the link.
    */
  var LinkId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.LinkId] = js.undefined
}
object LinkAssociation {
  
  inline def apply(): LinkAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkAssociation]
  }
  
  extension [Self <: LinkAssociation](x: Self) {
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkIdUndefined: Self = StObject.set(x, "GlobalNetworkId", js.undefined)
    
    inline def setLinkAssociationState(value: LinkAssociationState): Self = StObject.set(x, "LinkAssociationState", value.asInstanceOf[js.Any])
    
    inline def setLinkAssociationStateUndefined: Self = StObject.set(x, "LinkAssociationState", js.undefined)
    
    inline def setLinkId(value: LinkId): Self = StObject.set(x, "LinkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "LinkId", js.undefined)
  }
}
