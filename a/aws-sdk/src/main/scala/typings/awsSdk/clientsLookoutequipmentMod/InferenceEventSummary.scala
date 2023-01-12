package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferenceEventSummary extends StObject {
  
  /**
    *  An array which specifies the names and values of all sensors contributing to an inference event.
    */
  var Diagnostics: js.UndefOr[ModelMetrics] = js.undefined
  
  /**
    *  Indicates the size of an inference event in seconds. 
    */
  var EventDurationInSeconds: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.EventDurationInSeconds] = js.undefined
  
  /**
    * Indicates the ending time of an inference event. 
    */
  var EventEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates the starting time of an inference event. 
    */
  var EventStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the inference scheduler being used for the inference event. 
    */
  var InferenceSchedulerArn: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.InferenceSchedulerArn] = js.undefined
  
  /**
    * The name of the inference scheduler being used for the inference events. 
    */
  var InferenceSchedulerName: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.InferenceSchedulerName] = js.undefined
}
object InferenceEventSummary {
  
  inline def apply(): InferenceEventSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InferenceEventSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InferenceEventSummary] (val x: Self) extends AnyVal {
    
    inline def setDiagnostics(value: ModelMetrics): Self = StObject.set(x, "Diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsUndefined: Self = StObject.set(x, "Diagnostics", js.undefined)
    
    inline def setEventDurationInSeconds(value: EventDurationInSeconds): Self = StObject.set(x, "EventDurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setEventDurationInSecondsUndefined: Self = StObject.set(x, "EventDurationInSeconds", js.undefined)
    
    inline def setEventEndTime(value: js.Date): Self = StObject.set(x, "EventEndTime", value.asInstanceOf[js.Any])
    
    inline def setEventEndTimeUndefined: Self = StObject.set(x, "EventEndTime", js.undefined)
    
    inline def setEventStartTime(value: js.Date): Self = StObject.set(x, "EventStartTime", value.asInstanceOf[js.Any])
    
    inline def setEventStartTimeUndefined: Self = StObject.set(x, "EventStartTime", js.undefined)
    
    inline def setInferenceSchedulerArn(value: InferenceSchedulerArn): Self = StObject.set(x, "InferenceSchedulerArn", value.asInstanceOf[js.Any])
    
    inline def setInferenceSchedulerArnUndefined: Self = StObject.set(x, "InferenceSchedulerArn", js.undefined)
    
    inline def setInferenceSchedulerName(value: InferenceSchedulerName): Self = StObject.set(x, "InferenceSchedulerName", value.asInstanceOf[js.Any])
    
    inline def setInferenceSchedulerNameUndefined: Self = StObject.set(x, "InferenceSchedulerName", js.undefined)
  }
}
