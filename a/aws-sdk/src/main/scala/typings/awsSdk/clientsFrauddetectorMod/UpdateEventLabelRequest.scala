package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEventLabelRequest extends StObject {
  
  /**
    * The new label to assign to the event.
    */
  var assignedLabel: identifier
  
  /**
    * The ID of the event associated with the label to update.
    */
  var eventId: identifier
  
  /**
    * The event type of the event associated with the label to update.
    */
  var eventTypeName: identifier
  
  /**
    * The timestamp associated with the label. The timestamp must be specified using ISO 8601 standard in UTC. 
    */
  var labelTimestamp: utcTimestampISO8601
}
object UpdateEventLabelRequest {
  
  inline def apply(
    assignedLabel: identifier,
    eventId: identifier,
    eventTypeName: identifier,
    labelTimestamp: utcTimestampISO8601
  ): UpdateEventLabelRequest = {
    val __obj = js.Dynamic.literal(assignedLabel = assignedLabel.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], eventTypeName = eventTypeName.asInstanceOf[js.Any], labelTimestamp = labelTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEventLabelRequest]
  }
  
  extension [Self <: UpdateEventLabelRequest](x: Self) {
    
    inline def setAssignedLabel(value: identifier): Self = StObject.set(x, "assignedLabel", value.asInstanceOf[js.Any])
    
    inline def setEventId(value: identifier): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventTypeName(value: identifier): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
    
    inline def setLabelTimestamp(value: utcTimestampISO8601): Self = StObject.set(x, "labelTimestamp", value.asInstanceOf[js.Any])
  }
}
