package typings.awsSdk.clientsIvschatMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRoomRequest extends StObject {
  
  /**
    * Identifier of the room for which the configuration is to be retrieved. Currently this must be an ARN.
    */
  var identifier: RoomIdentifier
}
object GetRoomRequest {
  
  inline def apply(identifier: RoomIdentifier): GetRoomRequest = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRoomRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRoomRequest] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: RoomIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
  }
}
