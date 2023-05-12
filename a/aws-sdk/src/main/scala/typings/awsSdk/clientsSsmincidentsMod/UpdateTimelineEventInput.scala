package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTimelineEventInput extends StObject {
  
  /**
    * A token that ensures that a client calls the operation only once with the specified details.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * A short description of the event.
    */
  var eventData: js.UndefOr[EventData] = js.undefined
  
  /**
    * The ID of the event to update. You can use ListTimelineEvents to find an event's ID.
    */
  var eventId: UUID
  
  /**
    * Updates all existing references in a TimelineEvent. A reference is an Amazon Web Services resource involved or associated with the incident. To specify a reference, enter its Amazon Resource Name (ARN). You can also specify a related item associated with that resource. For example, to specify an Amazon DynamoDB (DynamoDB) table as a resource, use its ARN. You can also specify an Amazon CloudWatch metric associated with the DynamoDB table as a related item.  This update action overrides all existing references. If you want to keep existing references, you must specify them in the call. If you don't, this action removes any existing references and enters only new references. 
    */
  var eventReferences: js.UndefOr[EventReferenceList] = js.undefined
  
  /**
    * The time that the event occurred.
    */
  var eventTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The type of event. You can update events of type Custom Event.
    */
  var eventType: js.UndefOr[TimelineEventType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the incident that includes the timeline event.
    */
  var incidentRecordArn: Arn
}
object UpdateTimelineEventInput {
  
  inline def apply(eventId: UUID, incidentRecordArn: Arn): UpdateTimelineEventInput = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], incidentRecordArn = incidentRecordArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTimelineEventInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTimelineEventInput] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setEventData(value: EventData): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
    
    inline def setEventDataUndefined: Self = StObject.set(x, "eventData", js.undefined)
    
    inline def setEventId(value: UUID): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventReferences(value: EventReferenceList): Self = StObject.set(x, "eventReferences", value.asInstanceOf[js.Any])
    
    inline def setEventReferencesUndefined: Self = StObject.set(x, "eventReferences", js.undefined)
    
    inline def setEventReferencesVarargs(value: EventReference*): Self = StObject.set(x, "eventReferences", js.Array(value*))
    
    inline def setEventTime(value: js.Date): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    inline def setEventType(value: TimelineEventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    inline def setIncidentRecordArn(value: Arn): Self = StObject.set(x, "incidentRecordArn", value.asInstanceOf[js.Any])
  }
}
