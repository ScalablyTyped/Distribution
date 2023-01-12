package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSummary extends StObject {
  
  /**
    * The timeline event ID.
    */
  var eventId: UUID
  
  /**
    * A list of references in a TimelineEvent.
    */
  var eventReferences: js.UndefOr[EventReferenceList] = js.undefined
  
  /**
    * The time that the event occurred.
    */
  var eventTime: js.Date
  
  /**
    * The type of event. The timeline event must be Custom Event.
    */
  var eventType: TimelineEventType
  
  /**
    * The time that the timeline event was last updated.
    */
  var eventUpdatedTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the incident that the event happened during.
    */
  var incidentRecordArn: Arn
}
object EventSummary {
  
  inline def apply(
    eventId: UUID,
    eventTime: js.Date,
    eventType: TimelineEventType,
    eventUpdatedTime: js.Date,
    incidentRecordArn: Arn
  ): EventSummary = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], eventUpdatedTime = eventUpdatedTime.asInstanceOf[js.Any], incidentRecordArn = incidentRecordArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventSummary] (val x: Self) extends AnyVal {
    
    inline def setEventId(value: UUID): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventReferences(value: EventReferenceList): Self = StObject.set(x, "eventReferences", value.asInstanceOf[js.Any])
    
    inline def setEventReferencesUndefined: Self = StObject.set(x, "eventReferences", js.undefined)
    
    inline def setEventReferencesVarargs(value: EventReference*): Self = StObject.set(x, "eventReferences", js.Array(value*))
    
    inline def setEventTime(value: js.Date): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventType(value: TimelineEventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventUpdatedTime(value: js.Date): Self = StObject.set(x, "eventUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setIncidentRecordArn(value: Arn): Self = StObject.set(x, "incidentRecordArn", value.asInstanceOf[js.Any])
  }
}
