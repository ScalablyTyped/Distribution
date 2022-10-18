package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEventPredictionRequest extends StObject {
  
  /**
    * The detector ID.
    */
  var detectorId: String
  
  /**
    * The detector version ID.
    */
  var detectorVersionId: js.UndefOr[wholeNumberVersionString] = js.undefined
  
  /**
    * The entity type (associated with the detector's event type) and specific entity ID representing who performed the event. If an entity id is not available, use "UNKNOWN."
    */
  var entities: listOfEntities
  
  /**
    * The unique ID used to identify the event.
    */
  var eventId: String
  
  /**
    * Timestamp that defines when the event under evaluation occurred. The timestamp must be specified using ISO 8601 standard in UTC.
    */
  var eventTimestamp: utcTimestampISO8601
  
  /**
    * The event type associated with the detector specified for the prediction.
    */
  var eventTypeName: String
  
  /**
    * Names of the event type's variables you defined in Amazon Fraud Detector to represent data elements and their corresponding values for the event you are sending for evaluation.  You must provide at least one eventVariable  To ensure most accurate fraud prediction and to simplify your data preparation, Amazon Fraud Detector will replace all missing variables or values as follows:  For Amazon Fraud Detector trained models:  If a null value is provided explicitly for a variable or if a variable is missing, model will replace the null value or the missing variable (no variable name in the eventVariables map) with calculated default mean/medians for numeric variables and with special values for categorical variables.  For imported SageMaker models:  If a null value is provided explicitly for a variable, the model and rules will use “null” as the value. If a variable is not provided (no variable name in the eventVariables map), model and rules will use the default value that is provided for the variable. 
    */
  var eventVariables: EventVariableMap
  
  /**
    * The Amazon SageMaker model endpoint input data blobs.
    */
  var externalModelEndpointDataBlobs: js.UndefOr[ExternalModelEndpointDataBlobMap] = js.undefined
}
object GetEventPredictionRequest {
  
  inline def apply(
    detectorId: String,
    entities: listOfEntities,
    eventId: String,
    eventTimestamp: utcTimestampISO8601,
    eventTypeName: String,
    eventVariables: EventVariableMap
  ): GetEventPredictionRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], eventTimestamp = eventTimestamp.asInstanceOf[js.Any], eventTypeName = eventTypeName.asInstanceOf[js.Any], eventVariables = eventVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventPredictionRequest]
  }
  
  extension [Self <: GetEventPredictionRequest](x: Self) {
    
    inline def setDetectorId(value: String): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    inline def setDetectorVersionId(value: wholeNumberVersionString): Self = StObject.set(x, "detectorVersionId", value.asInstanceOf[js.Any])
    
    inline def setDetectorVersionIdUndefined: Self = StObject.set(x, "detectorVersionId", js.undefined)
    
    inline def setEntities(value: listOfEntities): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventTimestamp(value: utcTimestampISO8601): Self = StObject.set(x, "eventTimestamp", value.asInstanceOf[js.Any])
    
    inline def setEventTypeName(value: String): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
    
    inline def setEventVariables(value: EventVariableMap): Self = StObject.set(x, "eventVariables", value.asInstanceOf[js.Any])
    
    inline def setExternalModelEndpointDataBlobs(value: ExternalModelEndpointDataBlobMap): Self = StObject.set(x, "externalModelEndpointDataBlobs", value.asInstanceOf[js.Any])
    
    inline def setExternalModelEndpointDataBlobsUndefined: Self = StObject.set(x, "externalModelEndpointDataBlobs", js.undefined)
  }
}
