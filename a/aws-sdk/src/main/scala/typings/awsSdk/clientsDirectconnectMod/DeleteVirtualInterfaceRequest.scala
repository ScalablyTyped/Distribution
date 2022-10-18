package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVirtualInterfaceRequest extends StObject {
  
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: VirtualInterfaceId
}
object DeleteVirtualInterfaceRequest {
  
  inline def apply(virtualInterfaceId: VirtualInterfaceId): DeleteVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVirtualInterfaceRequest]
  }
  
  extension [Self <: DeleteVirtualInterfaceRequest](x: Self) {
    
    inline def setVirtualInterfaceId(value: VirtualInterfaceId): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
  }
}
