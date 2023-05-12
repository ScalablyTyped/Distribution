package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateParticipantResponse extends StObject {
  
  /**
    * The token used by the chat participant to call CreateParticipantConnection. The participant token is valid for the lifetime of a chat participant.
    */
  var ParticipantCredentials: js.UndefOr[ParticipantTokenCredentials] = js.undefined
  
  /**
    * The identifier for a chat participant. The participantId for a chat participant is the same throughout the chat lifecycle.
    */
  var ParticipantId: js.UndefOr[typings.awsSdk.clientsConnectMod.ParticipantId] = js.undefined
}
object CreateParticipantResponse {
  
  inline def apply(): CreateParticipantResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateParticipantResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateParticipantResponse] (val x: Self) extends AnyVal {
    
    inline def setParticipantCredentials(value: ParticipantTokenCredentials): Self = StObject.set(x, "ParticipantCredentials", value.asInstanceOf[js.Any])
    
    inline def setParticipantCredentialsUndefined: Self = StObject.set(x, "ParticipantCredentials", js.undefined)
    
    inline def setParticipantId(value: ParticipantId): Self = StObject.set(x, "ParticipantId", value.asInstanceOf[js.Any])
    
    inline def setParticipantIdUndefined: Self = StObject.set(x, "ParticipantId", js.undefined)
  }
}
