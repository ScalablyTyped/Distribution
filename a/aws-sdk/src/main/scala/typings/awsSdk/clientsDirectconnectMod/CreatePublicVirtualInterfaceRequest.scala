package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePublicVirtualInterfaceRequest extends StObject {
  
  /**
    * The ID of the connection.
    */
  var connectionId: ConnectionId
  
  /**
    * Information about the public virtual interface.
    */
  var newPublicVirtualInterface: NewPublicVirtualInterface
}
object CreatePublicVirtualInterfaceRequest {
  
  inline def apply(connectionId: ConnectionId, newPublicVirtualInterface: NewPublicVirtualInterface): CreatePublicVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], newPublicVirtualInterface = newPublicVirtualInterface.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePublicVirtualInterfaceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePublicVirtualInterfaceRequest] (val x: Self) extends AnyVal {
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    inline def setNewPublicVirtualInterface(value: NewPublicVirtualInterface): Self = StObject.set(x, "newPublicVirtualInterface", value.asInstanceOf[js.Any])
  }
}
