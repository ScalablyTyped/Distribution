package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTimelineEventInput extends StObject {
  
  /**
    * A token ensuring that the action is called only once with the specified details.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * A short description of the event.
    */
  var eventData: EventData
  
  /**
    * Adds one or more references to the TimelineEvent. A reference can be an Amazon Web Services resource involved in the incident or in some way associated with it. When you specify a reference, you enter the Amazon Resource Name (ARN) of the resource. You can also specify a related item. As an example, you could specify the ARN of an Amazon DynamoDB (DynamoDB) table. The table for this example is the resource. You could also specify a Amazon CloudWatch metric for that table. The metric is the related item.
    */
  var eventReferences: js.UndefOr[EventReferenceList] = js.undefined
  
  /**
    * The time that the event occurred.
    */
  var eventTime: js.Date
  
  /**
    * The type of the event. You can create timeline events of type Custom Event.
    */
  var eventType: TimelineEventType
  
  /**
    * The Amazon Resource Name (ARN) of the incident record to which the event will be added.
    */
  var incidentRecordArn: Arn
}
object CreateTimelineEventInput {
  
  inline def apply(eventData: EventData, eventTime: js.Date, eventType: TimelineEventType, incidentRecordArn: Arn): CreateTimelineEventInput = {
    val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], incidentRecordArn = incidentRecordArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTimelineEventInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTimelineEventInput] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setEventData(value: EventData): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
    
    inline def setEventReferences(value: EventReferenceList): Self = StObject.set(x, "eventReferences", value.asInstanceOf[js.Any])
    
    inline def setEventReferencesUndefined: Self = StObject.set(x, "eventReferences", js.undefined)
    
    inline def setEventReferencesVarargs(value: EventReference*): Self = StObject.set(x, "eventReferences", js.Array(value*))
    
    inline def setEventTime(value: js.Date): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventType(value: TimelineEventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setIncidentRecordArn(value: Arn): Self = StObject.set(x, "incidentRecordArn", value.asInstanceOf[js.Any])
  }
}
