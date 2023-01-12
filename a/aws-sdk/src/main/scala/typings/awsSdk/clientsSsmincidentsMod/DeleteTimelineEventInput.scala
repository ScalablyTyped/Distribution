package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTimelineEventInput extends StObject {
  
  /**
    * The ID of the event you are updating. You can find this by using ListTimelineEvents.
    */
  var eventId: UUID
  
  /**
    * The Amazon Resource Name (ARN) of the incident that includes the timeline event.
    */
  var incidentRecordArn: Arn
}
object DeleteTimelineEventInput {
  
  inline def apply(eventId: UUID, incidentRecordArn: Arn): DeleteTimelineEventInput = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], incidentRecordArn = incidentRecordArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTimelineEventInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTimelineEventInput] (val x: Self) extends AnyVal {
    
    inline def setEventId(value: UUID): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setIncidentRecordArn(value: Arn): Self = StObject.set(x, "incidentRecordArn", value.asInstanceOf[js.Any])
  }
}
