package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendEventRequest extends StObject {
  
  /**
    * The label to associate with the event. Required if specifying labelTimestamp.
    */
  var assignedLabel: js.UndefOr[identifier] = js.undefined
  
  /**
    * An array of entities.
    */
  var entities: listOfEntities
  
  /**
    * The event ID to upload.
    */
  var eventId: identifier
  
  /**
    * The timestamp that defines when the event under evaluation occurred. The timestamp must be specified using ISO 8601 standard in UTC.
    */
  var eventTimestamp: utcTimestampISO8601
  
  /**
    * The event type name of the event.
    */
  var eventTypeName: identifier
  
  /**
    * Names of the event type's variables you defined in Amazon Fraud Detector to represent data elements and their corresponding values for the event you are sending for evaluation.
    */
  var eventVariables: EventVariableMap
  
  /**
    * The timestamp associated with the label. Required if specifying assignedLabel.
    */
  var labelTimestamp: js.UndefOr[utcTimestampISO8601] = js.undefined
}
object SendEventRequest {
  
  inline def apply(
    entities: listOfEntities,
    eventId: identifier,
    eventTimestamp: utcTimestampISO8601,
    eventTypeName: identifier,
    eventVariables: EventVariableMap
  ): SendEventRequest = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], eventTimestamp = eventTimestamp.asInstanceOf[js.Any], eventTypeName = eventTypeName.asInstanceOf[js.Any], eventVariables = eventVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendEventRequest]
  }
  
  extension [Self <: SendEventRequest](x: Self) {
    
    inline def setAssignedLabel(value: identifier): Self = StObject.set(x, "assignedLabel", value.asInstanceOf[js.Any])
    
    inline def setAssignedLabelUndefined: Self = StObject.set(x, "assignedLabel", js.undefined)
    
    inline def setEntities(value: listOfEntities): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setEventId(value: identifier): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventTimestamp(value: utcTimestampISO8601): Self = StObject.set(x, "eventTimestamp", value.asInstanceOf[js.Any])
    
    inline def setEventTypeName(value: identifier): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
    
    inline def setEventVariables(value: EventVariableMap): Self = StObject.set(x, "eventVariables", value.asInstanceOf[js.Any])
    
    inline def setLabelTimestamp(value: utcTimestampISO8601): Self = StObject.set(x, "labelTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLabelTimestampUndefined: Self = StObject.set(x, "labelTimestamp", js.undefined)
  }
}
