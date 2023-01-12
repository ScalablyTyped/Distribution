package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthEventType extends StObject {
  
  /**
    * The challenge responses.
    */
  var ChallengeResponses: js.UndefOr[ChallengeResponseListType] = js.undefined
  
  /**
    * The creation date
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The user context data captured at the time of an event request. This value provides additional information about the client from which event the request is received.
    */
  var EventContextData: js.UndefOr[EventContextDataType] = js.undefined
  
  /**
    * A flag specifying the user feedback captured at the time of an event request is good or bad. 
    */
  var EventFeedback: js.UndefOr[EventFeedbackType] = js.undefined
  
  /**
    * The event ID.
    */
  var EventId: js.UndefOr[StringType] = js.undefined
  
  /**
    * The event response.
    */
  var EventResponse: js.UndefOr[EventResponseType] = js.undefined
  
  /**
    * The event risk.
    */
  var EventRisk: js.UndefOr[EventRiskType] = js.undefined
  
  /**
    * The event type.
    */
  var EventType: js.UndefOr[typings.awsSdk.clientsCognitoidentityserviceproviderMod.EventType] = js.undefined
}
object AuthEventType {
  
  inline def apply(): AuthEventType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthEventType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthEventType] (val x: Self) extends AnyVal {
    
    inline def setChallengeResponses(value: ChallengeResponseListType): Self = StObject.set(x, "ChallengeResponses", value.asInstanceOf[js.Any])
    
    inline def setChallengeResponsesUndefined: Self = StObject.set(x, "ChallengeResponses", js.undefined)
    
    inline def setChallengeResponsesVarargs(value: ChallengeResponseType*): Self = StObject.set(x, "ChallengeResponses", js.Array(value*))
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setEventContextData(value: EventContextDataType): Self = StObject.set(x, "EventContextData", value.asInstanceOf[js.Any])
    
    inline def setEventContextDataUndefined: Self = StObject.set(x, "EventContextData", js.undefined)
    
    inline def setEventFeedback(value: EventFeedbackType): Self = StObject.set(x, "EventFeedback", value.asInstanceOf[js.Any])
    
    inline def setEventFeedbackUndefined: Self = StObject.set(x, "EventFeedback", js.undefined)
    
    inline def setEventId(value: StringType): Self = StObject.set(x, "EventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "EventId", js.undefined)
    
    inline def setEventResponse(value: EventResponseType): Self = StObject.set(x, "EventResponse", value.asInstanceOf[js.Any])
    
    inline def setEventResponseUndefined: Self = StObject.set(x, "EventResponse", js.undefined)
    
    inline def setEventRisk(value: EventRiskType): Self = StObject.set(x, "EventRisk", value.asInstanceOf[js.Any])
    
    inline def setEventRiskUndefined: Self = StObject.set(x, "EventRisk", js.undefined)
    
    inline def setEventType(value: EventType): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "EventType", js.undefined)
  }
}
