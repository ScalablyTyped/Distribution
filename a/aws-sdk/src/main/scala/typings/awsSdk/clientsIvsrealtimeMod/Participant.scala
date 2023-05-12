package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Participant extends StObject {
  
  /**
    * Application-provided attributes to encode into the token and attach to a stage. Map keys and values can contain UTF-8 encoded text. The maximum length of this field is 1 KB total. This field is exposed to all stage participants and should not be used for personally identifying, confidential, or sensitive information.
    */
  var attributes: js.UndefOr[ParticipantAttributes] = js.undefined
  
  /**
    * ISO 8601 timestamp (returned as a string) when the participant first joined the stage session.
    */
  var firstJoinTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Unique identifier for this participant, assigned by IVS.
    */
  var participantId: js.UndefOr[ParticipantId] = js.undefined
  
  /**
    * Whether the participant ever published to the stage session.
    */
  var published: js.UndefOr[Published] = js.undefined
  
  /**
    * Whether the participant is connected to or disconnected from the stage.
    */
  var state: js.UndefOr[ParticipantState] = js.undefined
  
  /**
    * Customer-assigned name to help identify the token; this can be used to link a participant to a user in the customer’s own systems. This can be any UTF-8 encoded text. This field is exposed to all stage participants and should not be used for personally identifying, confidential, or sensitive information.
    */
  var userId: js.UndefOr[UserId] = js.undefined
}
object Participant {
  
  inline def apply(): Participant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Participant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Participant] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: ParticipantAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setFirstJoinTime(value: js.Date): Self = StObject.set(x, "firstJoinTime", value.asInstanceOf[js.Any])
    
    inline def setFirstJoinTimeUndefined: Self = StObject.set(x, "firstJoinTime", js.undefined)
    
    inline def setParticipantId(value: ParticipantId): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    inline def setParticipantIdUndefined: Self = StObject.set(x, "participantId", js.undefined)
    
    inline def setPublished(value: Published): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    inline def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    inline def setState(value: ParticipantState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
