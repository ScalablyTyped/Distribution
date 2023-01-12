package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTimelineEventOutput extends StObject {
  
  /**
    * The ID of the event for easy reference later. 
    */
  var eventId: UUID
  
  /**
    * The ARN of the incident record that you added the event to.
    */
  var incidentRecordArn: Arn
}
object CreateTimelineEventOutput {
  
  inline def apply(eventId: UUID, incidentRecordArn: Arn): CreateTimelineEventOutput = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], incidentRecordArn = incidentRecordArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTimelineEventOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTimelineEventOutput] (val x: Self) extends AnyVal {
    
    inline def setEventId(value: UUID): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setIncidentRecordArn(value: Arn): Self = StObject.set(x, "incidentRecordArn", value.asInstanceOf[js.Any])
  }
}
