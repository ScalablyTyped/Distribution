package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateLinkRequest extends StObject {
  
  /**
    * The ID of the device.
    */
  var DeviceId: typings.awsSdk.clientsNetworkmanagerMod.DeviceId
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId
  
  /**
    * The ID of the link.
    */
  var LinkId: typings.awsSdk.clientsNetworkmanagerMod.LinkId
}
object AssociateLinkRequest {
  
  inline def apply(DeviceId: DeviceId, GlobalNetworkId: GlobalNetworkId, LinkId: LinkId): AssociateLinkRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], LinkId = LinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateLinkRequest]
  }
  
  extension [Self <: AssociateLinkRequest](x: Self) {
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setLinkId(value: LinkId): Self = StObject.set(x, "LinkId", value.asInstanceOf[js.Any])
  }
}
