package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  /**
    * If the event is an error event, the error code is provided to give insight into the specific error that occurred. If the event is not an error event, this field is null. INSUFFICIENT_CAPABILITIES indicates that the participant tried to take an action that the participant’s token is not allowed to do. For more information about participant capabilities, see the capabilities field in CreateParticipantToken.
    */
  var errorCode: js.UndefOr[EventErrorCode] = js.undefined
  
  /**
    * ISO 8601 timestamp (returned as a string) for when the event occurred.
    */
  var eventTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the event.
    */
  var name: js.UndefOr[EventName] = js.undefined
  
  /**
    * Unique identifier for the participant who triggered the event. This is assigned by IVS.
    */
  var participantId: js.UndefOr[ParticipantId] = js.undefined
  
  /**
    * Unique identifier for the remote participant. For a subscribe event, this is the publisher. For a publish or join event, this is null. This is assigned by IVS.
    */
  var remoteParticipantId: js.UndefOr[ParticipantId] = js.undefined
}
object Event {
  
  inline def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: EventErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setEventTime(value: js.Date): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    inline def setName(value: EventName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParticipantId(value: ParticipantId): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    inline def setParticipantIdUndefined: Self = StObject.set(x, "participantId", js.undefined)
    
    inline def setRemoteParticipantId(value: ParticipantId): Self = StObject.set(x, "remoteParticipantId", value.asInstanceOf[js.Any])
    
    inline def setRemoteParticipantIdUndefined: Self = StObject.set(x, "remoteParticipantId", js.undefined)
  }
}
