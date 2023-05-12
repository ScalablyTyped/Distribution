package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartChatContactResponse extends StObject {
  
  /**
    * The identifier of this contact within the Amazon Connect instance. 
    */
  var ContactId: js.UndefOr[typings.awsSdk.clientsConnectMod.ContactId] = js.undefined
  
  /**
    * The contactId from which a persistent chat session is started. This field is populated only for persistent chats.
    */
  var ContinuedFromContactId: js.UndefOr[ContactId] = js.undefined
  
  /**
    * The identifier for a chat participant. The participantId for a chat participant is the same throughout the chat lifecycle.
    */
  var ParticipantId: js.UndefOr[typings.awsSdk.clientsConnectMod.ParticipantId] = js.undefined
  
  /**
    * The token used by the chat participant to call CreateParticipantConnection. The participant token is valid for the lifetime of a chat participant.
    */
  var ParticipantToken: js.UndefOr[typings.awsSdk.clientsConnectMod.ParticipantToken] = js.undefined
}
object StartChatContactResponse {
  
  inline def apply(): StartChatContactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartChatContactResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartChatContactResponse] (val x: Self) extends AnyVal {
    
    inline def setContactId(value: ContactId): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    inline def setContactIdUndefined: Self = StObject.set(x, "ContactId", js.undefined)
    
    inline def setContinuedFromContactId(value: ContactId): Self = StObject.set(x, "ContinuedFromContactId", value.asInstanceOf[js.Any])
    
    inline def setContinuedFromContactIdUndefined: Self = StObject.set(x, "ContinuedFromContactId", js.undefined)
    
    inline def setParticipantId(value: ParticipantId): Self = StObject.set(x, "ParticipantId", value.asInstanceOf[js.Any])
    
    inline def setParticipantIdUndefined: Self = StObject.set(x, "ParticipantId", js.undefined)
    
    inline def setParticipantToken(value: ParticipantToken): Self = StObject.set(x, "ParticipantToken", value.asInstanceOf[js.Any])
    
    inline def setParticipantTokenUndefined: Self = StObject.set(x, "ParticipantToken", js.undefined)
  }
}
