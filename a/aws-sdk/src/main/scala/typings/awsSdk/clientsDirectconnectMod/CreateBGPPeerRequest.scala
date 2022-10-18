package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBGPPeerRequest extends StObject {
  
  /**
    * Information about the BGP peer.
    */
  var newBGPPeer: js.UndefOr[NewBGPPeer] = js.undefined
  
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
}
object CreateBGPPeerRequest {
  
  inline def apply(): CreateBGPPeerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBGPPeerRequest]
  }
  
  extension [Self <: CreateBGPPeerRequest](x: Self) {
    
    inline def setNewBGPPeer(value: NewBGPPeer): Self = StObject.set(x, "newBGPPeer", value.asInstanceOf[js.Any])
    
    inline def setNewBGPPeerUndefined: Self = StObject.set(x, "newBGPPeer", js.undefined)
    
    inline def setVirtualInterfaceId(value: VirtualInterfaceId): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setVirtualInterfaceIdUndefined: Self = StObject.set(x, "virtualInterfaceId", js.undefined)
  }
}
