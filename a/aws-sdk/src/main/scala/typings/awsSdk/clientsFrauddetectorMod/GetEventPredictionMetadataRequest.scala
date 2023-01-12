package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEventPredictionMetadataRequest extends StObject {
  
  /**
    *  The detector ID. 
    */
  var detectorId: identifier
  
  /**
    *  The detector version ID. 
    */
  var detectorVersionId: wholeNumberVersionString
  
  /**
    *  The event ID. 
    */
  var eventId: identifier
  
  /**
    *  The event type associated with the detector specified for the prediction. 
    */
  var eventTypeName: identifier
  
  /**
    *  The timestamp that defines when the prediction was generated. The timestamp must be specified using ISO 8601 standard in UTC. We recommend calling ListEventPredictions first, and using the predictionTimestamp value in the response to provide an accurate prediction timestamp value.
    */
  var predictionTimestamp: time
}
object GetEventPredictionMetadataRequest {
  
  inline def apply(
    detectorId: identifier,
    detectorVersionId: wholeNumberVersionString,
    eventId: identifier,
    eventTypeName: identifier,
    predictionTimestamp: time
  ): GetEventPredictionMetadataRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], detectorVersionId = detectorVersionId.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], eventTypeName = eventTypeName.asInstanceOf[js.Any], predictionTimestamp = predictionTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventPredictionMetadataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEventPredictionMetadataRequest] (val x: Self) extends AnyVal {
    
    inline def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    inline def setDetectorVersionId(value: wholeNumberVersionString): Self = StObject.set(x, "detectorVersionId", value.asInstanceOf[js.Any])
    
    inline def setEventId(value: identifier): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventTypeName(value: identifier): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
    
    inline def setPredictionTimestamp(value: time): Self = StObject.set(x, "predictionTimestamp", value.asInstanceOf[js.Any])
  }
}
