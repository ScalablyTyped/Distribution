package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineEvent extends StObject {
  
  /**
    * A short description of the event.
    */
  var eventData: EventData
  
  /**
    * The ID of the timeline event.
    */
  var eventId: UUID
  
  /**
    * The time that the event occurred.
    */
  var eventTime: js.Date
  
  /**
    * The type of event that occurred. Currently Incident Manager supports only the Custom Event type.
    */
  var eventType: TimelineEventType
  
  /**
    * The time that the timeline event was last updated.
    */
  var eventUpdatedTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the incident that the event occurred during.
    */
  var incidentRecordArn: Arn
}
object TimelineEvent {
  
  inline def apply(
    eventData: EventData,
    eventId: UUID,
    eventTime: js.Date,
    eventType: TimelineEventType,
    eventUpdatedTime: js.Date,
    incidentRecordArn: Arn
  ): TimelineEvent = {
    val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], eventUpdatedTime = eventUpdatedTime.asInstanceOf[js.Any], incidentRecordArn = incidentRecordArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineEvent]
  }
  
  extension [Self <: TimelineEvent](x: Self) {
    
    inline def setEventData(value: EventData): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
    
    inline def setEventId(value: UUID): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventTime(value: js.Date): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventType(value: TimelineEventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventUpdatedTime(value: js.Date): Self = StObject.set(x, "eventUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setIncidentRecordArn(value: Arn): Self = StObject.set(x, "incidentRecordArn", value.asInstanceOf[js.Any])
  }
}
