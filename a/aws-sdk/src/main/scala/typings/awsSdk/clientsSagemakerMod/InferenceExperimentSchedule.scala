package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferenceExperimentSchedule extends StObject {
  
  /**
    * The timestamp at which the inference experiment ended or will end.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The timestamp at which the inference experiment started or will start.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object InferenceExperimentSchedule {
  
  inline def apply(): InferenceExperimentSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InferenceExperimentSchedule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InferenceExperimentSchedule] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
