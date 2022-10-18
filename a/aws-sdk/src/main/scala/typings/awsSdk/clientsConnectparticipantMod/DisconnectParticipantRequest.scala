package typings.awsSdk.clientsConnectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisconnectParticipantRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsConnectparticipantMod.ClientToken] = js.undefined
  
  /**
    * The authentication token associated with the participant's connection.
    */
  var ConnectionToken: ParticipantToken
}
object DisconnectParticipantRequest {
  
  inline def apply(ConnectionToken: ParticipantToken): DisconnectParticipantRequest = {
    val __obj = js.Dynamic.literal(ConnectionToken = ConnectionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisconnectParticipantRequest]
  }
  
  extension [Self <: DisconnectParticipantRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setConnectionToken(value: ParticipantToken): Self = StObject.set(x, "ConnectionToken", value.asInstanceOf[js.Any])
  }
}
