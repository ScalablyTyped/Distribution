package typings.awsSdk.clientsConnectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateParticipantConnectionRequest extends StObject {
  
  /**
    * Amazon Connect Participant is used to mark the participant as connected for customer participant in message streaming, as well as for agent or manager participant in non-streaming chats.
    */
  var ConnectParticipant: js.UndefOr[Bool] = js.undefined
  
  /**
    * This is a header parameter. The ParticipantToken as obtained from StartChatContact API response.
    */
  var ParticipantToken: typings.awsSdk.clientsConnectparticipantMod.ParticipantToken
  
  /**
    * Type of connection information required. This can be omitted if ConnectParticipant is true.
    */
  var Type: js.UndefOr[ConnectionTypeList] = js.undefined
}
object CreateParticipantConnectionRequest {
  
  inline def apply(ParticipantToken: ParticipantToken): CreateParticipantConnectionRequest = {
    val __obj = js.Dynamic.literal(ParticipantToken = ParticipantToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateParticipantConnectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateParticipantConnectionRequest] (val x: Self) extends AnyVal {
    
    inline def setConnectParticipant(value: Bool): Self = StObject.set(x, "ConnectParticipant", value.asInstanceOf[js.Any])
    
    inline def setConnectParticipantUndefined: Self = StObject.set(x, "ConnectParticipant", js.undefined)
    
    inline def setParticipantToken(value: ParticipantToken): Self = StObject.set(x, "ParticipantToken", value.asInstanceOf[js.Any])
    
    inline def setType(value: ConnectionTypeList): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setTypeVarargs(value: ConnectionType*): Self = StObject.set(x, "Type", js.Array(value*))
  }
}
