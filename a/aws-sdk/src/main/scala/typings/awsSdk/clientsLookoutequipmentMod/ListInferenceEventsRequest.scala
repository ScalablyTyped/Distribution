package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInferenceEventsRequest extends StObject {
  
  /**
    * The name of the inference scheduler for the inference events listed. 
    */
  var InferenceSchedulerName: InferenceSchedulerIdentifier
  
  /**
    * Returns all the inference events with an end start time equal to or greater than less than the end time given
    */
  var IntervalEndTime: js.Date
  
  /**
    *  Lookout for Equipment will return all the inference events with an end time equal to or greater than the start time given.
    */
  var IntervalStartTime: js.Date
  
  /**
    * Specifies the maximum number of inference events to list. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.MaxResults] = js.undefined
  
  /**
    * An opaque pagination token indicating where to continue the listing of inference events.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.NextToken] = js.undefined
}
object ListInferenceEventsRequest {
  
  inline def apply(
    InferenceSchedulerName: InferenceSchedulerIdentifier,
    IntervalEndTime: js.Date,
    IntervalStartTime: js.Date
  ): ListInferenceEventsRequest = {
    val __obj = js.Dynamic.literal(InferenceSchedulerName = InferenceSchedulerName.asInstanceOf[js.Any], IntervalEndTime = IntervalEndTime.asInstanceOf[js.Any], IntervalStartTime = IntervalStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInferenceEventsRequest]
  }
  
  extension [Self <: ListInferenceEventsRequest](x: Self) {
    
    inline def setInferenceSchedulerName(value: InferenceSchedulerIdentifier): Self = StObject.set(x, "InferenceSchedulerName", value.asInstanceOf[js.Any])
    
    inline def setIntervalEndTime(value: js.Date): Self = StObject.set(x, "IntervalEndTime", value.asInstanceOf[js.Any])
    
    inline def setIntervalStartTime(value: js.Date): Self = StObject.set(x, "IntervalStartTime", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
