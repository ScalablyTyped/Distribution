package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclineHandshakeRequest extends StObject {
  
  /**
    * The unique identifier (ID) of the handshake that you want to decline. You can get the ID from the ListHandshakesForAccount operation. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lowercase letters or digits.
    */
  var HandshakeId: typings.awsSdk.clientsOrganizationsMod.HandshakeId
}
object DeclineHandshakeRequest {
  
  inline def apply(HandshakeId: HandshakeId): DeclineHandshakeRequest = {
    val __obj = js.Dynamic.literal(HandshakeId = HandshakeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclineHandshakeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeclineHandshakeRequest] (val x: Self) extends AnyVal {
    
    inline def setHandshakeId(value: HandshakeId): Self = StObject.set(x, "HandshakeId", value.asInstanceOf[js.Any])
  }
}
