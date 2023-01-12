package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventPredictionsRequest extends StObject {
  
  /**
    *  The detector ID. 
    */
  var detectorId: js.UndefOr[FilterCondition] = js.undefined
  
  /**
    *  The detector version ID. 
    */
  var detectorVersionId: js.UndefOr[FilterCondition] = js.undefined
  
  /**
    *  The event ID. 
    */
  var eventId: js.UndefOr[FilterCondition] = js.undefined
  
  /**
    *  The event type associated with the detector. 
    */
  var eventType: js.UndefOr[FilterCondition] = js.undefined
  
  /**
    *  The maximum number of predictions to return for the request. 
    */
  var maxResults: js.UndefOr[EventPredictionsMaxResults] = js.undefined
  
  /**
    *  Identifies the next page of results to return. Use the token to make the call again to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    *  The time period for when the predictions were generated. 
    */
  var predictionTimeRange: js.UndefOr[PredictionTimeRange] = js.undefined
}
object ListEventPredictionsRequest {
  
  inline def apply(): ListEventPredictionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventPredictionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEventPredictionsRequest] (val x: Self) extends AnyVal {
    
    inline def setDetectorId(value: FilterCondition): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    inline def setDetectorIdUndefined: Self = StObject.set(x, "detectorId", js.undefined)
    
    inline def setDetectorVersionId(value: FilterCondition): Self = StObject.set(x, "detectorVersionId", value.asInstanceOf[js.Any])
    
    inline def setDetectorVersionIdUndefined: Self = StObject.set(x, "detectorVersionId", js.undefined)
    
    inline def setEventId(value: FilterCondition): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    inline def setEventType(value: FilterCondition): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    inline def setMaxResults(value: EventPredictionsMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPredictionTimeRange(value: PredictionTimeRange): Self = StObject.set(x, "predictionTimeRange", value.asInstanceOf[js.Any])
    
    inline def setPredictionTimeRangeUndefined: Self = StObject.set(x, "predictionTimeRange", js.undefined)
  }
}
